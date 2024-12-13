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
 * EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T06:44:55.014855667Z[GMT]", comments = "Generator version: 7.9.0")
public class EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner {
  public static final String SERIALIZED_NAME_TRACING_I_D = "TracingID";
  @SerializedName(SERIALIZED_NAME_TRACING_I_D)
  private String tracingID;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "SerialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  public static final String SERIALIZED_NAME_TRACING_U_R_I = "TracingURI";
  @SerializedName(SERIALIZED_NAME_TRACING_U_R_I)
  private String tracingURI;

  public EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner() {
  }

  public EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner tracingID(String tracingID) {
    this.tracingID = tracingID;
    return this;
  }

  /**
   * Get tracingID
   * @return tracingID
   */
  @javax.annotation.Nullable
  public String getTracingID() {
    return tracingID;
  }

  public void setTracingID(String tracingID) {
    this.tracingID = tracingID;
  }


  public EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Get serialNumber
   * @return serialNumber
   */
  @javax.annotation.Nullable
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner tracingURI(String tracingURI) {
    this.tracingURI = tracingURI;
    return this;
  }

  /**
   * Get tracingURI
   * @return tracingURI
   */
  @javax.annotation.Nullable
  public String getTracingURI() {
    return tracingURI;
  }

  public void setTracingURI(String tracingURI) {
    this.tracingURI = tracingURI;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner edIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner = (EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner) o;
    return Objects.equals(this.tracingID, edIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner.tracingID) &&
        Objects.equals(this.serialNumber, edIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner.serialNumber) &&
        Objects.equals(this.tracingURI, edIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner.tracingURI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tracingID, serialNumber, tracingURI);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner {\n");
    sb.append("    tracingID: ").append(toIndentedString(tracingID)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    tracingURI: ").append(toIndentedString(tracingURI)).append("\n");
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
    openapiFields.add("TracingID");
    openapiFields.add("SerialNumber");
    openapiFields.add("TracingURI");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner is not found in the empty JSON string", EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("TracingID") != null && !jsonObj.get("TracingID").isJsonNull()) && !jsonObj.get("TracingID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TracingID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TracingID").toString()));
      }
      if ((jsonObj.get("SerialNumber") != null && !jsonObj.get("SerialNumber").isJsonNull()) && !jsonObj.get("SerialNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SerialNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SerialNumber").toString()));
      }
      if ((jsonObj.get("TracingURI") != null && !jsonObj.get("TracingURI").isJsonNull()) && !jsonObj.get("TracingURI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TracingURI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TracingURI").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner>() {
           @Override
           public void write(JsonWriter out, EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner
   */
  public static EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner.class);
  }

  /**
   * Convert an instance of EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleTracingInformationInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
