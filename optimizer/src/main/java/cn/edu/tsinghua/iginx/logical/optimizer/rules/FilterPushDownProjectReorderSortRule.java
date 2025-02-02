/*
 * IGinX - the polystore system with high performance
 * Copyright (C) Tsinghua University
 * TSIGinX@gmail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package cn.edu.tsinghua.iginx.logical.optimizer.rules;

import cn.edu.tsinghua.iginx.engine.shared.operator.*;
import cn.edu.tsinghua.iginx.engine.shared.source.OperatorSource;
import cn.edu.tsinghua.iginx.engine.shared.source.SourceType;
import cn.edu.tsinghua.iginx.logical.optimizer.core.RuleCall;
import com.google.auto.service.AutoService;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@AutoService(Rule.class)
public class FilterPushDownProjectReorderSortRule extends Rule {

  private static final Set<Class> validOps =
      new HashSet<>(Arrays.asList(Project.class, Reorder.class, Sort.class));

  public FilterPushDownProjectReorderSortRule() {
    /*
     * we want to match the topology like:
     *         Select
     *           |
     *    Project/Reorder/Sort
     */
    super(
        "FilterPushDownProjectReorderSortRule",
        "FilterPushDownRule",
        operand(Select.class, operand(AbstractUnaryOperator.class, any())));
  }

  @Override
  public boolean matches(RuleCall call) {
    Select select = (Select) call.getMatchedRoot();
    AbstractUnaryOperator operator =
        (AbstractUnaryOperator) ((OperatorSource) select.getSource()).getOperator();

    return validOps.contains(operator.getClass())
        && operator.getSource().getType() != SourceType.Fragment;
  }

  @Override
  public void onMatch(RuleCall call) {
    // 应该没什么要注意的，单纯交换位置即可
    Select select = (Select) call.getMatchedRoot();
    AbstractUnaryOperator operator =
        (AbstractUnaryOperator) ((OperatorSource) select.getSource()).getOperator();

    select.setSource(operator.getSource());
    operator.setSource(new OperatorSource(select));

    call.transformTo(operator);
  }
}
