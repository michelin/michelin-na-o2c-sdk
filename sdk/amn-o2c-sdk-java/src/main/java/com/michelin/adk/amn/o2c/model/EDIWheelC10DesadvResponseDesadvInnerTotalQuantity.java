/*
 * Michelin North America Order-to-Cash APIs
 * These APIs will help you to do business transactions with Michelin.  <br><br><b>Authentication details:</b><br> <br><u>Option A:</u> OAuth2 Client Credentials (recommended) <br><u>Option B:</u> API Key + Basic Authentication (not recommended) <br><br>To request your access, please contact your representative. <br><br>Our services are based on the EDIWHEEL standards. <br>You can find more information on the <a href=\"https://www.ediwheel.com/\" target=\"_blank\">EDIWHEEL website</a>. 
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.michelin.adk.amn.o2c.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.michelin.adk.amn.JSON;

/**
 * EDIWheelC10DesadvResponseDesadvInnerTotalQuantity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class EDIWheelC10DesadvResponseDesadvInnerTotalQuantity {
  public static final String SERIALIZED_NAME_QUANTITY_VALUE = "quantityValue";
  @SerializedName(SERIALIZED_NAME_QUANTITY_VALUE)
  @javax.annotation.Nonnull
  private Integer quantityValue;

  public static final String SERIALIZED_NAME_MEASURE_UNIT_CODE = "measureUnitCode";
  @SerializedName(SERIALIZED_NAME_MEASURE_UNIT_CODE)
  @javax.annotation.Nonnull
  private String measureUnitCode;

  public EDIWheelC10DesadvResponseDesadvInnerTotalQuantity() {
  }

  public EDIWheelC10DesadvResponseDesadvInnerTotalQuantity quantityValue(@javax.annotation.Nonnull Integer quantityValue) {
    this.quantityValue = quantityValue;
    return this;
  }

  /**
   * Total quantity of items included in shipment
   * @return quantityValue
   */
  @javax.annotation.Nonnull
  public Integer getQuantityValue() {
    return quantityValue;
  }

  public void setQuantityValue(@javax.annotation.Nonnull Integer quantityValue) {
    this.quantityValue = quantityValue;
  }


  public EDIWheelC10DesadvResponseDesadvInnerTotalQuantity measureUnitCode(@javax.annotation.Nonnull String measureUnitCode) {
    this.measureUnitCode = measureUnitCode;
    return this;
  }

  /**
   * Fixed measurement unit PCE &#x3D; pieces
   * @return measureUnitCode
   */
  @javax.annotation.Nonnull
  public String getMeasureUnitCode() {
    return measureUnitCode;
  }

  public void setMeasureUnitCode(@javax.annotation.Nonnull String measureUnitCode) {
    this.measureUnitCode = measureUnitCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC10DesadvResponseDesadvInnerTotalQuantity edIWheelC10DesadvResponseDesadvInnerTotalQuantity = (EDIWheelC10DesadvResponseDesadvInnerTotalQuantity) o;
    return Objects.equals(this.quantityValue, edIWheelC10DesadvResponseDesadvInnerTotalQuantity.quantityValue) &&
        Objects.equals(this.measureUnitCode, edIWheelC10DesadvResponseDesadvInnerTotalQuantity.measureUnitCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantityValue, measureUnitCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC10DesadvResponseDesadvInnerTotalQuantity {\n");
    sb.append("    quantityValue: ").append(toIndentedString(quantityValue)).append("\n");
    sb.append("    measureUnitCode: ").append(toIndentedString(measureUnitCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("quantityValue");
    openapiFields.add("measureUnitCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("quantityValue");
    openapiRequiredFields.add("measureUnitCode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC10DesadvResponseDesadvInnerTotalQuantity
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC10DesadvResponseDesadvInnerTotalQuantity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC10DesadvResponseDesadvInnerTotalQuantity is not found in the empty JSON string", EDIWheelC10DesadvResponseDesadvInnerTotalQuantity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC10DesadvResponseDesadvInnerTotalQuantity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC10DesadvResponseDesadvInnerTotalQuantity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelC10DesadvResponseDesadvInnerTotalQuantity.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("measureUnitCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `measureUnitCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("measureUnitCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC10DesadvResponseDesadvInnerTotalQuantity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC10DesadvResponseDesadvInnerTotalQuantity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC10DesadvResponseDesadvInnerTotalQuantity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC10DesadvResponseDesadvInnerTotalQuantity.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC10DesadvResponseDesadvInnerTotalQuantity>() {
           @Override
           public void write(JsonWriter out, EDIWheelC10DesadvResponseDesadvInnerTotalQuantity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC10DesadvResponseDesadvInnerTotalQuantity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC10DesadvResponseDesadvInnerTotalQuantity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC10DesadvResponseDesadvInnerTotalQuantity
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC10DesadvResponseDesadvInnerTotalQuantity
   */
  public static EDIWheelC10DesadvResponseDesadvInnerTotalQuantity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC10DesadvResponseDesadvInnerTotalQuantity.class);
  }

  /**
   * Convert an instance of EDIWheelC10DesadvResponseDesadvInnerTotalQuantity to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

