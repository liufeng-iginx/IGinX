/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.edu.tsinghua.iginx.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2021-03-02")
public class OpenSessionResp implements org.apache.thrift.TBase<OpenSessionResp, OpenSessionResp._Fields>, java.io.Serializable, Cloneable, Comparable<OpenSessionResp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("OpenSessionResp");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SESSION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField CONFIGURATION_FIELD_DESC = new org.apache.thrift.protocol.TField("configuration", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new OpenSessionRespStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new OpenSessionRespTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable Status status; // required
  public long sessionId; // optional
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> configuration; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    SESSION_ID((short)2, "sessionId"),
    CONFIGURATION((short)3, "configuration");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STATUS
          return STATUS;
        case 2: // SESSION_ID
          return SESSION_ID;
        case 3: // CONFIGURATION
          return CONFIGURATION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SESSIONID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.SESSION_ID,_Fields.CONFIGURATION};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Status.class)));
    tmpMap.put(_Fields.SESSION_ID, new org.apache.thrift.meta_data.FieldMetaData("sessionId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CONFIGURATION, new org.apache.thrift.meta_data.FieldMetaData("configuration", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(OpenSessionResp.class, metaDataMap);
  }

  public OpenSessionResp() {
  }

  public OpenSessionResp(
    Status status)
  {
    this();
    this.status = status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public OpenSessionResp(OpenSessionResp other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatus()) {
      this.status = new Status(other.status);
    }
    this.sessionId = other.sessionId;
    if (other.isSetConfiguration()) {
      java.util.Map<java.lang.String,java.lang.String> __this__configuration = new java.util.HashMap<java.lang.String,java.lang.String>(other.configuration);
      this.configuration = __this__configuration;
    }
  }

  public OpenSessionResp deepCopy() {
    return new OpenSessionResp(this);
  }

  @Override
  public void clear() {
    this.status = null;
    setSessionIdIsSet(false);
    this.sessionId = 0;
    this.configuration = null;
  }

  @org.apache.thrift.annotation.Nullable
  public Status getStatus() {
    return this.status;
  }

  public OpenSessionResp setStatus(@org.apache.thrift.annotation.Nullable Status status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public long getSessionId() {
    return this.sessionId;
  }

  public OpenSessionResp setSessionId(long sessionId) {
    this.sessionId = sessionId;
    setSessionIdIsSet(true);
    return this;
  }

  public void unsetSessionId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SESSIONID_ISSET_ID);
  }

  /** Returns true if field sessionId is set (has been assigned a value) and false otherwise */
  public boolean isSetSessionId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SESSIONID_ISSET_ID);
  }

  public void setSessionIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SESSIONID_ISSET_ID, value);
  }

  public int getConfigurationSize() {
    return (this.configuration == null) ? 0 : this.configuration.size();
  }

  public void putToConfiguration(java.lang.String key, java.lang.String val) {
    if (this.configuration == null) {
      this.configuration = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.configuration.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,java.lang.String> getConfiguration() {
    return this.configuration;
  }

  public OpenSessionResp setConfiguration(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> configuration) {
    this.configuration = configuration;
    return this;
  }

  public void unsetConfiguration() {
    this.configuration = null;
  }

  /** Returns true if field configuration is set (has been assigned a value) and false otherwise */
  public boolean isSetConfiguration() {
    return this.configuration != null;
  }

  public void setConfigurationIsSet(boolean value) {
    if (!value) {
      this.configuration = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((Status)value);
      }
      break;

    case SESSION_ID:
      if (value == null) {
        unsetSessionId();
      } else {
        setSessionId((java.lang.Long)value);
      }
      break;

    case CONFIGURATION:
      if (value == null) {
        unsetConfiguration();
      } else {
        setConfiguration((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case SESSION_ID:
      return getSessionId();

    case CONFIGURATION:
      return getConfiguration();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case SESSION_ID:
      return isSetSessionId();
    case CONFIGURATION:
      return isSetConfiguration();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof OpenSessionResp)
      return this.equals((OpenSessionResp)that);
    return false;
  }

  public boolean equals(OpenSessionResp that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_sessionId = true && this.isSetSessionId();
    boolean that_present_sessionId = true && that.isSetSessionId();
    if (this_present_sessionId || that_present_sessionId) {
      if (!(this_present_sessionId && that_present_sessionId))
        return false;
      if (this.sessionId != that.sessionId)
        return false;
    }

    boolean this_present_configuration = true && this.isSetConfiguration();
    boolean that_present_configuration = true && that.isSetConfiguration();
    if (this_present_configuration || that_present_configuration) {
      if (!(this_present_configuration && that_present_configuration))
        return false;
      if (!this.configuration.equals(that.configuration))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.hashCode();

    hashCode = hashCode * 8191 + ((isSetSessionId()) ? 131071 : 524287);
    if (isSetSessionId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(sessionId);

    hashCode = hashCode * 8191 + ((isSetConfiguration()) ? 131071 : 524287);
    if (isSetConfiguration())
      hashCode = hashCode * 8191 + configuration.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(OpenSessionResp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSessionId()).compareTo(other.isSetSessionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSessionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sessionId, other.sessionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetConfiguration()).compareTo(other.isSetConfiguration());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConfiguration()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.configuration, other.configuration);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenSessionResp(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (isSetSessionId()) {
      if (!first) sb.append(", ");
      sb.append("sessionId:");
      sb.append(this.sessionId);
      first = false;
    }
    if (isSetConfiguration()) {
      if (!first) sb.append(", ");
      sb.append("configuration:");
      if (this.configuration == null) {
        sb.append("null");
      } else {
        sb.append(this.configuration);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (status == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (status != null) {
      status.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class OpenSessionRespStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public OpenSessionRespStandardScheme getScheme() {
      return new OpenSessionRespStandardScheme();
    }
  }

  private static class OpenSessionRespStandardScheme extends org.apache.thrift.scheme.StandardScheme<OpenSessionResp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, OpenSessionResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new Status();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SESSION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.sessionId = iprot.readI64();
              struct.setSessionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONFIGURATION
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map34 = iprot.readMapBegin();
                struct.configuration = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map34.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key35;
                @org.apache.thrift.annotation.Nullable java.lang.String _val36;
                for (int _i37 = 0; _i37 < _map34.size; ++_i37)
                {
                  _key35 = iprot.readString();
                  _val36 = iprot.readString();
                  struct.configuration.put(_key35, _val36);
                }
                iprot.readMapEnd();
              }
              struct.setConfigurationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, OpenSessionResp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetSessionId()) {
        oprot.writeFieldBegin(SESSION_ID_FIELD_DESC);
        oprot.writeI64(struct.sessionId);
        oprot.writeFieldEnd();
      }
      if (struct.configuration != null) {
        if (struct.isSetConfiguration()) {
          oprot.writeFieldBegin(CONFIGURATION_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.configuration.size()));
            for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter38 : struct.configuration.entrySet())
            {
              oprot.writeString(_iter38.getKey());
              oprot.writeString(_iter38.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class OpenSessionRespTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public OpenSessionRespTupleScheme getScheme() {
      return new OpenSessionRespTupleScheme();
    }
  }

  private static class OpenSessionRespTupleScheme extends org.apache.thrift.scheme.TupleScheme<OpenSessionResp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, OpenSessionResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.status.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSessionId()) {
        optionals.set(0);
      }
      if (struct.isSetConfiguration()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSessionId()) {
        oprot.writeI64(struct.sessionId);
      }
      if (struct.isSetConfiguration()) {
        {
          oprot.writeI32(struct.configuration.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter39 : struct.configuration.entrySet())
          {
            oprot.writeString(_iter39.getKey());
            oprot.writeString(_iter39.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, OpenSessionResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.status = new Status();
      struct.status.read(iprot);
      struct.setStatusIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.sessionId = iprot.readI64();
        struct.setSessionIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map40 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.configuration = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map40.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _key41;
          @org.apache.thrift.annotation.Nullable java.lang.String _val42;
          for (int _i43 = 0; _i43 < _map40.size; ++_i43)
          {
            _key41 = iprot.readString();
            _val42 = iprot.readString();
            struct.configuration.put(_key41, _val42);
          }
        }
        struct.setConfigurationIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

