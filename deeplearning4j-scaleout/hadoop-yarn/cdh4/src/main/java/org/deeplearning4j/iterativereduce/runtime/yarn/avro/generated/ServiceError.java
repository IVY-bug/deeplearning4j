/*
 * Copyright 2015 Skymind,Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.deeplearning4j.iterativereduce.runtime.yarn.avro.generated;
@SuppressWarnings("all")
public class ServiceError extends org.apache.avro.specific.SpecificExceptionBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"error\",\"name\":\"ServiceError\",\"namespace\":\"com.cloudera.org.deeplearning4j.iterativereduce.runtime.yarn.avro.generated\",\"fields\":[{\"name\":\"description\",\"type\":[\"null\",\"string\"]}]}");
  @Deprecated public CharSequence description;

  public ServiceError() {
    super();
  }

  public ServiceError(Object value) {
    super(value);
  }

  public ServiceError(Throwable cause) {
    super(cause);
  }

  public ServiceError(Object value, Throwable cause) {
    super(value, cause);
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return description;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: description = (CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'description' field.
   */
  public CharSequence getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(CharSequence value) {
    this.description = value;
  }

  /** Creates a new ServiceError RecordBuilder */
  public static ServiceError.Builder newBuilder() {
    return new ServiceError.Builder();
  }

  /** Creates a new ServiceError RecordBuilder by copying an existing Builder */
  public static ServiceError.Builder newBuilder(ServiceError.Builder other) {
    return new ServiceError.Builder(other);
  }

  /** Creates a new ServiceError RecordBuilder by copying an existing ServiceError instance */
  public static ServiceError.Builder newBuilder(ServiceError other) {
    return new ServiceError.Builder(other);
  }

  /**
   * RecordBuilder for ServiceError instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificErrorBuilderBase<ServiceError>
    implements org.apache.avro.data.ErrorBuilder<ServiceError> {

    private CharSequence description;

    /** Creates a new Builder */
    private Builder() {
      super(ServiceError.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(ServiceError.Builder other) {
      super(other);
    }

    /** Creates a Builder by copying an existing ServiceError instance */
    private Builder(ServiceError other) {
      super(other);
      if (isValidValue(fields()[0], other.description)) {
        this.description = (CharSequence) data().deepCopy(fields()[0].schema(), other.description);
        fieldSetFlags()[0] = true;
      }
    }

    @Override
    public ServiceError.Builder setValue(Object value) {
      super.setValue(value);
      return this;
    }

    @Override
    public ServiceError.Builder clearValue() {
      super.clearValue();
      return this;
    }

    @Override
    public ServiceError.Builder setCause(Throwable cause) {
      super.setCause(cause);
      return this;
    }

    @Override
    public ServiceError.Builder clearCause() {
      super.clearCause();
      return this;
    }

    /** Gets the value of the 'description' field */
    public CharSequence getDescription() {
      return description;
    }

    /** Sets the value of the 'description' field */
    public ServiceError.Builder setDescription(CharSequence value) {
      validate(fields()[0], value);
      this.description = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'description' field has been set */
    public boolean hasDescription() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'description' field */
    public ServiceError.Builder clearDescription() {
      description = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public ServiceError build() {
      try {
        ServiceError record = new ServiceError(getValue(), getCause());
        record.description = fieldSetFlags()[0] ? this.description : (CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
