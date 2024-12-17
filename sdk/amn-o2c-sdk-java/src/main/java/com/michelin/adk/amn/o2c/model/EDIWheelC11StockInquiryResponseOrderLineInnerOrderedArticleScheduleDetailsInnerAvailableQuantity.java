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
 * EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-17T19:36:32.994638751Z[GMT]", comments = "Generator version: 7.10.0")
public class EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity {
  public static final String SERIALIZED_NAME_QUANTITY_VALUE = "quantityValue";
  @SerializedName(SERIALIZED_NAME_QUANTITY_VALUE)
  @javax.annotation.Nullable
  private Integer quantityValue;

  public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity() {
  }

  public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity quantityValue(@javax.annotation.Nullable Integer quantityValue) {
    this.quantityValue = quantityValue;
    return this;
  }

  /**
   * Get quantityValue
   * @return quantityValue
   */
  @javax.annotation.Nullable
  public Integer getQuantityValue() {
    return quantityValue;
  }

  public void setQuantityValue(@javax.annotation.Nullable Integer quantityValue) {
    this.quantityValue = quantityValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity edIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity = (EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity) o;
    return Objects.equals(this.quantityValue, edIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity.quantityValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantityValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity {\n");
    sb.append("    quantityValue: ").append(toIndentedString(quantityValue)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity is not found in the empty JSON string", EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity>() {
           @Override
           public void write(JsonWriter out, EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity
   */
  public static EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity.class);
  }

  /**
   * Convert an instance of EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerAvailableQuantity to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

