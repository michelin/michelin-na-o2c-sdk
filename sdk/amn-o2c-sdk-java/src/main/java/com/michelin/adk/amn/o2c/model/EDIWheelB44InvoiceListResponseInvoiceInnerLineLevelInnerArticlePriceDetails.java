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
import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetailsNetUnitPrice;
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
 * EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T06:44:55.014855667Z[GMT]", comments = "Generator version: 7.9.0")
public class EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails {
  public static final String SERIALIZED_NAME_GROSS_UNIT_PRICE = "GrossUnitPrice";
  @SerializedName(SERIALIZED_NAME_GROSS_UNIT_PRICE)
  private EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetailsNetUnitPrice grossUnitPrice;

  public static final String SERIALIZED_NAME_NET_UNIT_PRICE = "NetUnitPrice";
  @SerializedName(SERIALIZED_NAME_NET_UNIT_PRICE)
  private EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetailsNetUnitPrice netUnitPrice;

  public static final String SERIALIZED_NAME_FIXED_PRICE = "FixedPrice";
  @SerializedName(SERIALIZED_NAME_FIXED_PRICE)
  private EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetailsNetUnitPrice fixedPrice;

  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails() {
  }

  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails grossUnitPrice(EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetailsNetUnitPrice grossUnitPrice) {
    this.grossUnitPrice = grossUnitPrice;
    return this;
  }

  /**
   * Get grossUnitPrice
   * @return grossUnitPrice
   */
  @javax.annotation.Nullable
  public EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetailsNetUnitPrice getGrossUnitPrice() {
    return grossUnitPrice;
  }

  public void setGrossUnitPrice(EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetailsNetUnitPrice grossUnitPrice) {
    this.grossUnitPrice = grossUnitPrice;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails netUnitPrice(EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetailsNetUnitPrice netUnitPrice) {
    this.netUnitPrice = netUnitPrice;
    return this;
  }

  /**
   * Get netUnitPrice
   * @return netUnitPrice
   */
  @javax.annotation.Nullable
  public EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetailsNetUnitPrice getNetUnitPrice() {
    return netUnitPrice;
  }

  public void setNetUnitPrice(EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetailsNetUnitPrice netUnitPrice) {
    this.netUnitPrice = netUnitPrice;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails fixedPrice(EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetailsNetUnitPrice fixedPrice) {
    this.fixedPrice = fixedPrice;
    return this;
  }

  /**
   * Get fixedPrice
   * @return fixedPrice
   */
  @javax.annotation.Nullable
  public EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetailsNetUnitPrice getFixedPrice() {
    return fixedPrice;
  }

  public void setFixedPrice(EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetailsNetUnitPrice fixedPrice) {
    this.fixedPrice = fixedPrice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails = (EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails) o;
    return Objects.equals(this.grossUnitPrice, edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails.grossUnitPrice) &&
        Objects.equals(this.netUnitPrice, edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails.netUnitPrice) &&
        Objects.equals(this.fixedPrice, edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails.fixedPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grossUnitPrice, netUnitPrice, fixedPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails {\n");
    sb.append("    grossUnitPrice: ").append(toIndentedString(grossUnitPrice)).append("\n");
    sb.append("    netUnitPrice: ").append(toIndentedString(netUnitPrice)).append("\n");
    sb.append("    fixedPrice: ").append(toIndentedString(fixedPrice)).append("\n");
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
    openapiFields.add("GrossUnitPrice");
    openapiFields.add("NetUnitPrice");
    openapiFields.add("FixedPrice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails is not found in the empty JSON string", EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `GrossUnitPrice`
      if (jsonObj.get("GrossUnitPrice") != null && !jsonObj.get("GrossUnitPrice").isJsonNull()) {
        EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetailsNetUnitPrice.validateJsonElement(jsonObj.get("GrossUnitPrice"));
      }
      // validate the optional field `NetUnitPrice`
      if (jsonObj.get("NetUnitPrice") != null && !jsonObj.get("NetUnitPrice").isJsonNull()) {
        EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetailsNetUnitPrice.validateJsonElement(jsonObj.get("NetUnitPrice"));
      }
      // validate the optional field `FixedPrice`
      if (jsonObj.get("FixedPrice") != null && !jsonObj.get("FixedPrice").isJsonNull()) {
        EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetailsNetUnitPrice.validateJsonElement(jsonObj.get("FixedPrice"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails>() {
           @Override
           public void write(JsonWriter out, EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails
   * @throws IOException if the JSON string is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails
   */
  public static EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails.class);
  }

  /**
   * Convert an instance of EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticlePriceDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
