/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.microsoft.thrifty.test.gen;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.EncodingUtils;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import javax.annotation.Generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-01-04")
public class VersioningTestV1 implements org.apache.thrift.TBase<VersioningTestV1, VersioningTestV1._Fields>, java.io.Serializable, Cloneable, Comparable<VersioningTestV1> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("VersioningTestV1");

  private static final org.apache.thrift.protocol.TField BEGIN_IN_BOTH_FIELD_DESC = new org.apache.thrift.protocol.TField("begin_in_both", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField OLD_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("old_string", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField END_IN_BOTH_FIELD_DESC = new org.apache.thrift.protocol.TField("end_in_both", org.apache.thrift.protocol.TType.I32, (short)12);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new VersioningTestV1StandardSchemeFactory());
    schemes.put(TupleScheme.class, new VersioningTestV1TupleSchemeFactory());
  }

  public int begin_in_both; // required
  public String old_string; // required
  public int end_in_both; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BEGIN_IN_BOTH((short)1, "begin_in_both"),
    OLD_STRING((short)3, "old_string"),
    END_IN_BOTH((short)12, "end_in_both");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // BEGIN_IN_BOTH
          return BEGIN_IN_BOTH;
        case 3: // OLD_STRING
          return OLD_STRING;
        case 12: // END_IN_BOTH
          return END_IN_BOTH;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __BEGIN_IN_BOTH_ISSET_ID = 0;
  private static final int __END_IN_BOTH_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BEGIN_IN_BOTH, new org.apache.thrift.meta_data.FieldMetaData("begin_in_both", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.OLD_STRING, new org.apache.thrift.meta_data.FieldMetaData("old_string", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.END_IN_BOTH, new org.apache.thrift.meta_data.FieldMetaData("end_in_both", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(VersioningTestV1.class, metaDataMap);
  }

  public VersioningTestV1() {
  }

  public VersioningTestV1(
    int begin_in_both,
    String old_string,
    int end_in_both)
  {
    this();
    this.begin_in_both = begin_in_both;
    setBegin_in_bothIsSet(true);
    this.old_string = old_string;
    this.end_in_both = end_in_both;
    setEnd_in_bothIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public VersioningTestV1(VersioningTestV1 other) {
    __isset_bitfield = other.__isset_bitfield;
    this.begin_in_both = other.begin_in_both;
    if (other.isSetOld_string()) {
      this.old_string = other.old_string;
    }
    this.end_in_both = other.end_in_both;
  }

  public VersioningTestV1 deepCopy() {
    return new VersioningTestV1(this);
  }

  @Override
  public void clear() {
    setBegin_in_bothIsSet(false);
    this.begin_in_both = 0;
    this.old_string = null;
    setEnd_in_bothIsSet(false);
    this.end_in_both = 0;
  }

  public int getBegin_in_both() {
    return this.begin_in_both;
  }

  public VersioningTestV1 setBegin_in_both(int begin_in_both) {
    this.begin_in_both = begin_in_both;
    setBegin_in_bothIsSet(true);
    return this;
  }

  public void unsetBegin_in_both() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BEGIN_IN_BOTH_ISSET_ID);
  }

  /** Returns true if field begin_in_both is set (has been assigned a value) and false otherwise */
  public boolean isSetBegin_in_both() {
    return EncodingUtils.testBit(__isset_bitfield, __BEGIN_IN_BOTH_ISSET_ID);
  }

  public void setBegin_in_bothIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BEGIN_IN_BOTH_ISSET_ID, value);
  }

  public String getOld_string() {
    return this.old_string;
  }

  public VersioningTestV1 setOld_string(String old_string) {
    this.old_string = old_string;
    return this;
  }

  public void unsetOld_string() {
    this.old_string = null;
  }

  /** Returns true if field old_string is set (has been assigned a value) and false otherwise */
  public boolean isSetOld_string() {
    return this.old_string != null;
  }

  public void setOld_stringIsSet(boolean value) {
    if (!value) {
      this.old_string = null;
    }
  }

  public int getEnd_in_both() {
    return this.end_in_both;
  }

  public VersioningTestV1 setEnd_in_both(int end_in_both) {
    this.end_in_both = end_in_both;
    setEnd_in_bothIsSet(true);
    return this;
  }

  public void unsetEnd_in_both() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __END_IN_BOTH_ISSET_ID);
  }

  /** Returns true if field end_in_both is set (has been assigned a value) and false otherwise */
  public boolean isSetEnd_in_both() {
    return EncodingUtils.testBit(__isset_bitfield, __END_IN_BOTH_ISSET_ID);
  }

  public void setEnd_in_bothIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __END_IN_BOTH_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BEGIN_IN_BOTH:
      if (value == null) {
        unsetBegin_in_both();
      } else {
        setBegin_in_both((Integer)value);
      }
      break;

    case OLD_STRING:
      if (value == null) {
        unsetOld_string();
      } else {
        setOld_string((String)value);
      }
      break;

    case END_IN_BOTH:
      if (value == null) {
        unsetEnd_in_both();
      } else {
        setEnd_in_both((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BEGIN_IN_BOTH:
      return getBegin_in_both();

    case OLD_STRING:
      return getOld_string();

    case END_IN_BOTH:
      return getEnd_in_both();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BEGIN_IN_BOTH:
      return isSetBegin_in_both();
    case OLD_STRING:
      return isSetOld_string();
    case END_IN_BOTH:
      return isSetEnd_in_both();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof VersioningTestV1)
      return this.equals((VersioningTestV1)that);
    return false;
  }

  public boolean equals(VersioningTestV1 that) {
    if (that == null)
      return false;

    boolean this_present_begin_in_both = true;
    boolean that_present_begin_in_both = true;
    if (this_present_begin_in_both || that_present_begin_in_both) {
      if (!(this_present_begin_in_both && that_present_begin_in_both))
        return false;
      if (this.begin_in_both != that.begin_in_both)
        return false;
    }

    boolean this_present_old_string = true && this.isSetOld_string();
    boolean that_present_old_string = true && that.isSetOld_string();
    if (this_present_old_string || that_present_old_string) {
      if (!(this_present_old_string && that_present_old_string))
        return false;
      if (!this.old_string.equals(that.old_string))
        return false;
    }

    boolean this_present_end_in_both = true;
    boolean that_present_end_in_both = true;
    if (this_present_end_in_both || that_present_end_in_both) {
      if (!(this_present_end_in_both && that_present_end_in_both))
        return false;
      if (this.end_in_both != that.end_in_both)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_begin_in_both = true;
    list.add(present_begin_in_both);
    if (present_begin_in_both)
      list.add(begin_in_both);

    boolean present_old_string = true && (isSetOld_string());
    list.add(present_old_string);
    if (present_old_string)
      list.add(old_string);

    boolean present_end_in_both = true;
    list.add(present_end_in_both);
    if (present_end_in_both)
      list.add(end_in_both);

    return list.hashCode();
  }

  @Override
  public int compareTo(VersioningTestV1 other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBegin_in_both()).compareTo(other.isSetBegin_in_both());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBegin_in_both()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.begin_in_both, other.begin_in_both);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOld_string()).compareTo(other.isSetOld_string());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOld_string()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.old_string, other.old_string);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEnd_in_both()).compareTo(other.isSetEnd_in_both());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEnd_in_both()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.end_in_both, other.end_in_both);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("VersioningTestV1(");
    boolean first = true;

    sb.append("begin_in_both:");
    sb.append(this.begin_in_both);
    first = false;
    if (!first) sb.append(", ");
    sb.append("old_string:");
    if (this.old_string == null) {
      sb.append("null");
    } else {
      sb.append(this.old_string);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("end_in_both:");
    sb.append(this.end_in_both);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class VersioningTestV1StandardSchemeFactory implements SchemeFactory {
    public VersioningTestV1StandardScheme getScheme() {
      return new VersioningTestV1StandardScheme();
    }
  }

  private static class VersioningTestV1StandardScheme extends StandardScheme<VersioningTestV1> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, VersioningTestV1 struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BEGIN_IN_BOTH
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.begin_in_both = iprot.readI32();
              struct.setBegin_in_bothIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OLD_STRING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.old_string = iprot.readString();
              struct.setOld_stringIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 12: // END_IN_BOTH
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.end_in_both = iprot.readI32();
              struct.setEnd_in_bothIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, VersioningTestV1 struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(BEGIN_IN_BOTH_FIELD_DESC);
      oprot.writeI32(struct.begin_in_both);
      oprot.writeFieldEnd();
      if (struct.old_string != null) {
        oprot.writeFieldBegin(OLD_STRING_FIELD_DESC);
        oprot.writeString(struct.old_string);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(END_IN_BOTH_FIELD_DESC);
      oprot.writeI32(struct.end_in_both);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class VersioningTestV1TupleSchemeFactory implements SchemeFactory {
    public VersioningTestV1TupleScheme getScheme() {
      return new VersioningTestV1TupleScheme();
    }
  }

  private static class VersioningTestV1TupleScheme extends TupleScheme<VersioningTestV1> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, VersioningTestV1 struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBegin_in_both()) {
        optionals.set(0);
      }
      if (struct.isSetOld_string()) {
        optionals.set(1);
      }
      if (struct.isSetEnd_in_both()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetBegin_in_both()) {
        oprot.writeI32(struct.begin_in_both);
      }
      if (struct.isSetOld_string()) {
        oprot.writeString(struct.old_string);
      }
      if (struct.isSetEnd_in_both()) {
        oprot.writeI32(struct.end_in_both);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, VersioningTestV1 struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.begin_in_both = iprot.readI32();
        struct.setBegin_in_bothIsSet(true);
      }
      if (incoming.get(1)) {
        struct.old_string = iprot.readString();
        struct.setOld_stringIsSet(true);
      }
      if (incoming.get(2)) {
        struct.end_in_both = iprot.readI32();
        struct.setEnd_in_bothIsSet(true);
      }
    }
  }

}
