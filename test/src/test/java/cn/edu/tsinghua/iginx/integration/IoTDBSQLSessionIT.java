package cn.edu.tsinghua.iginx.integration;

public class IoTDBSQLSessionIT extends SQLSessionIT {
    public IoTDBSQLSessionIT() {
        super();
        this.isAbleToDelete = true;
        this.isSupportSpecialPath = true;
        this.isAbleToShowTimeSeries = true;
    }
}
