/*
 * Michelin North America Order-to-Cash APIs for dealers
 * These APIs will help you to do business transactions with Michelin.  <br><br><b>Authentication details:</b><br> <br><u>Option A:</u> OAuth2 Client Credentials (recommended) <br><u>Option B:</u> API Key + Basic Authentication (not recommended) <br><br>To request your access, please contact your representative. <br><br>Our services are based on the EDIWHEEL standards. <br>You can find more information on the <a href=\"https://www.ediwheel.com/\" target=\"_blank\">EDIWHEEL website</a>. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: dcti-bs-ec-cit-support@michelin.com
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
 * EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T06:44:55.014855667Z[GMT]", comments = "Generator version: 7.9.0")
public class EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight {
  public static final String SERIALIZED_NAME_MEASURE = "Measure";
  @SerializedName(SERIALIZED_NAME_MEASURE)
  private String measure;

  public static final String SERIALIZED_NAME_MEASURE_UNIT_CODE = "MeasureUnitCode";
  @SerializedName(SERIALIZED_NAME_MEASURE_UNIT_CODE)
  private String measureUnitCode;

  public EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight() {
  }

  public EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight measure(String measure) {
    this.measure = measure;
    return this;
  }

  /**
   * Get measure
   * @return measure
   */
  @javax.annotation.Nonnull
  public String getMeasure() {
    return measure;
  }

  public void setMeasure(String measure) {
    this.measure = measure;
  }


  public EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight measureUnitCode(String measureUnitCode) {
    this.measureUnitCode = measureUnitCode;
    return this;
  }

  /**
   * Get measureUnitCode
   * @return measureUnitCode
   */
  @javax.annotation.Nonnull
  public String getMeasureUnitCode() {
    return measureUnitCode;
  }

  public void setMeasureUnitCode(String measureUnitCode) {
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
    EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight edIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight = (EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight) o;
    return Objects.equals(this.measure, edIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight.measure) &&
        Objects.equals(this.measureUnitCode, edIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight.measureUnitCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measure, measureUnitCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight {\n");
    sb.append("    measure: ").append(toIndentedString(measure)).append("\n");
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
    openapiFields.add("Measure");
    openapiFields.add("MeasureUnitCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Measure");
    openapiRequiredFields.add("MeasureUnitCode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight is not found in the empty JSON string", EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("Measure").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Measure` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Measure").toString()));
      }
      if (!jsonObj.get("MeasureUnitCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MeasureUnitCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MeasureUnitCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight>() {
           @Override
           public void write(JsonWriter out, EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight
   */
  public static EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight.class);
  }

  /**
   * Convert an instance of EDIWheelC10DesadvResponseDesadvInnerMeasuresGrossWeight to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
