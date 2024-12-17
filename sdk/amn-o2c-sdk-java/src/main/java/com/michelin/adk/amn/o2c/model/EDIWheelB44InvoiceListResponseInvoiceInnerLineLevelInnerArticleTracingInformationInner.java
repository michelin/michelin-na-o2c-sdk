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
 * EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-17T19:36:32.994638751Z[GMT]", comments = "Generator version: 7.10.0")
public class EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner {
  public static final String SERIALIZED_NAME_TRACING_I_D = "TracingID";
  @SerializedName(SERIALIZED_NAME_TRACING_I_D)
  @javax.annotation.Nullable
  private String tracingID;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "SerialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  @javax.annotation.Nullable
  private String serialNumber;

  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner() {
  }

  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner tracingID(@javax.annotation.Nullable String tracingID) {
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

  public void setTracingID(@javax.annotation.Nullable String tracingID) {
    this.tracingID = tracingID;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner serialNumber(@javax.annotation.Nullable String serialNumber) {
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

  public void setSerialNumber(@javax.annotation.Nullable String serialNumber) {
    this.serialNumber = serialNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner = (EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner) o;
    return Objects.equals(this.tracingID, edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner.tracingID) &&
        Objects.equals(this.serialNumber, edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner.serialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tracingID, serialNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner {\n");
    sb.append("    tracingID: ").append(toIndentedString(tracingID)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner is not found in the empty JSON string", EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("TracingID") != null && !jsonObj.get("TracingID").isJsonNull()) && !jsonObj.get("TracingID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TracingID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TracingID").toString()));
      }
      if ((jsonObj.get("SerialNumber") != null && !jsonObj.get("SerialNumber").isJsonNull()) && !jsonObj.get("SerialNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SerialNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SerialNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner>() {
           @Override
           public void write(JsonWriter out, EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner
   * @throws IOException if the JSON string is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner
   */
  public static EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner.class);
  }

  /**
   * Convert an instance of EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleTracingInformationInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

