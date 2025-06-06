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
import com.michelin.adk.amn.o2c.model.EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner {
  public static final String SERIALIZED_NAME_PAYMENT_NET = "paymentNet";
  @SerializedName(SERIALIZED_NAME_PAYMENT_NET)
  @javax.annotation.Nonnull
  private List<EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInner> paymentNet = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAYMENT_DISCOUNT = "paymentDiscount";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DISCOUNT)
  @javax.annotation.Nullable
  private List<Object> paymentDiscount = new ArrayList<>();

  public EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner() {
  }

  public EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner paymentNet(@javax.annotation.Nonnull List<EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInner> paymentNet) {
    this.paymentNet = paymentNet;
    return this;
  }

  public EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner addPaymentNetItem(EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInner paymentNetItem) {
    if (this.paymentNet == null) {
      this.paymentNet = new ArrayList<>();
    }
    this.paymentNet.add(paymentNetItem);
    return this;
  }

  /**
   * Get paymentNet
   * @return paymentNet
   */
  @javax.annotation.Nonnull
  public List<EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInner> getPaymentNet() {
    return paymentNet;
  }

  public void setPaymentNet(@javax.annotation.Nonnull List<EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInner> paymentNet) {
    this.paymentNet = paymentNet;
  }


  public EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner paymentDiscount(@javax.annotation.Nullable List<Object> paymentDiscount) {
    this.paymentDiscount = paymentDiscount;
    return this;
  }

  public EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner addPaymentDiscountItem(Object paymentDiscountItem) {
    if (this.paymentDiscount == null) {
      this.paymentDiscount = new ArrayList<>();
    }
    this.paymentDiscount.add(paymentDiscountItem);
    return this;
  }

  /**
   * Get paymentDiscount
   * @return paymentDiscount
   */
  @javax.annotation.Nullable
  public List<Object> getPaymentDiscount() {
    return paymentDiscount;
  }

  public void setPaymentDiscount(@javax.annotation.Nullable List<Object> paymentDiscount) {
    this.paymentDiscount = paymentDiscount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner edIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner = (EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner) o;
    return Objects.equals(this.paymentNet, edIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner.paymentNet) &&
        Objects.equals(this.paymentDiscount, edIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner.paymentDiscount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentNet, paymentDiscount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner {\n");
    sb.append("    paymentNet: ").append(toIndentedString(paymentNet)).append("\n");
    sb.append("    paymentDiscount: ").append(toIndentedString(paymentDiscount)).append("\n");
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
    openapiFields.add("paymentNet");
    openapiFields.add("paymentDiscount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("paymentNet");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner is not found in the empty JSON string", EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("paymentNet").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentNet` to be an array in the JSON string but got `%s`", jsonObj.get("paymentNet").toString()));
      }

      JsonArray jsonArraypaymentNet = jsonObj.getAsJsonArray("paymentNet");
      // validate the required field `paymentNet` (array)
      for (int i = 0; i < jsonArraypaymentNet.size(); i++) {
        EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInner.validateJsonElement(jsonArraypaymentNet.get(i));
      };
      // ensure the optional json data is an array if present
      if (jsonObj.get("paymentDiscount") != null && !jsonObj.get("paymentDiscount").isJsonNull() && !jsonObj.get("paymentDiscount").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentDiscount` to be an array in the JSON string but got `%s`", jsonObj.get("paymentDiscount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner>() {
           @Override
           public void write(JsonWriter out, EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner
   * @throws IOException if the JSON string is invalid with respect to EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner
   */
  public static EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner.class);
  }

  /**
   * Convert an instance of EDIWheelB34InvoiceListResponseInvoiceInnerPaymentTermsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

