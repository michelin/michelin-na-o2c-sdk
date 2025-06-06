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
import java.math.BigDecimal;
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
 * EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount {
  public static final String SERIALIZED_NAME_AMOUNT_VALUE = "amountValue";
  @SerializedName(SERIALIZED_NAME_AMOUNT_VALUE)
  @javax.annotation.Nonnull
  private BigDecimal amountValue;

  public EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount() {
  }

  public EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount amountValue(@javax.annotation.Nonnull BigDecimal amountValue) {
    this.amountValue = amountValue;
    return this;
  }

  /**
   * Taxable amount, where applicable.
   * @return amountValue
   */
  @javax.annotation.Nonnull
  public BigDecimal getAmountValue() {
    return amountValue;
  }

  public void setAmountValue(@javax.annotation.Nonnull BigDecimal amountValue) {
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
    EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount edIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount = (EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount) o;
    return Objects.equals(this.amountValue, edIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount.amountValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount {\n");
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
    openapiRequiredFields.add("amountValue");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount is not found in the empty JSON string", EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount>() {
           @Override
           public void write(JsonWriter out, EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount
   * @throws IOException if the JSON string is invalid with respect to EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount
   */
  public static EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount.class);
  }

  /**
   * Convert an instance of EDIWheelB34InvoiceListResponseInvoiceInnerSummaryTaxDetailsInnerTaxableAmount to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

