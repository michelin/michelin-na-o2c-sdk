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
 * EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T06:44:55.014855667Z[GMT]", comments = "Generator version: 7.9.0")
public class EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount {
  public static final String SERIALIZED_NAME_AMOUNT_VALUE = "amountValue";
  @SerializedName(SERIALIZED_NAME_AMOUNT_VALUE)
  private String amountValue;

  public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount() {
  }

  public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount amountValue(String amountValue) {
    this.amountValue = amountValue;
    return this;
  }

  /**
   * Get amountValue
   * @return amountValue
   */
  @javax.annotation.Nullable
  public String getAmountValue() {
    return amountValue;
  }

  public void setAmountValue(String amountValue) {
    this.amountValue = amountValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount edIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount = (EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount) o;
    return Objects.equals(this.amountValue, edIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount.amountValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount {\n");
    sb.append("    amountValue: ").append(toIndentedString(amountValue)).append("\n");
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
    openapiFields.add("amountValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount is not found in the empty JSON string", EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("amountValue") != null && !jsonObj.get("amountValue").isJsonNull()) && !jsonObj.get("amountValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amountValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amountValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount>() {
           @Override
           public void write(JsonWriter out, EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount
   */
  public static EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount.class);
  }

  /**
   * Convert an instance of EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInnerChargeAmount to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

