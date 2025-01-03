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
 * EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount {
  public static final String SERIALIZED_NAME_AMOUNT_VALUE = "AmountValue";
  @SerializedName(SERIALIZED_NAME_AMOUNT_VALUE)
  @javax.annotation.Nonnull
  private String amountValue;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "CurrencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  @javax.annotation.Nullable
  private String currencyCode;

  public EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount() {
  }

  public EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount amountValue(@javax.annotation.Nonnull String amountValue) {
    this.amountValue = amountValue;
    return this;
  }

  /**
   * Get amountValue
   * @return amountValue
   */
  @javax.annotation.Nonnull
  public String getAmountValue() {
    return amountValue;
  }

  public void setAmountValue(@javax.annotation.Nonnull String amountValue) {
    this.amountValue = amountValue;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount currencyCode(@javax.annotation.Nullable String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   * @return currencyCode
   */
  @javax.annotation.Nullable
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(@javax.annotation.Nullable String currencyCode) {
    this.currencyCode = currencyCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount edIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount = (EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount) o;
    return Objects.equals(this.amountValue, edIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount.amountValue) &&
        Objects.equals(this.currencyCode, edIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountValue, currencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount {\n");
    sb.append("    amountValue: ").append(toIndentedString(amountValue)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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
    openapiFields.add("AmountValue");
    openapiFields.add("CurrencyCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("AmountValue");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount is not found in the empty JSON string", EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("AmountValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AmountValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AmountValue").toString()));
      }
      if ((jsonObj.get("CurrencyCode") != null && !jsonObj.get("CurrencyCode").isJsonNull()) && !jsonObj.get("CurrencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CurrencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CurrencyCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount>() {
           @Override
           public void write(JsonWriter out, EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount
   * @throws IOException if the JSON string is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount
   */
  public static EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount.class);
  }

  /**
   * Convert an instance of EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInnerInstalmentAmount to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

