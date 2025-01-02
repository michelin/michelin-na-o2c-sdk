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
import com.michelin.adk.amn.o2c.model.EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentDiscountInner;
import com.michelin.adk.amn.o2c.model.EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInner;
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
 * EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner {
  public static final String SERIALIZED_NAME_PAYMENT_NET = "PaymentNet";
  @SerializedName(SERIALIZED_NAME_PAYMENT_NET)
  @javax.annotation.Nonnull
  private List<EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInner> paymentNet = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAYMENT_DISCOUNT = "PaymentDiscount";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DISCOUNT)
  @javax.annotation.Nullable
  private List<EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentDiscountInner> paymentDiscount = new ArrayList<>();

  public EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner() {
  }

  public EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner paymentNet(@javax.annotation.Nonnull List<EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInner> paymentNet) {
    this.paymentNet = paymentNet;
    return this;
  }

  public EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner addPaymentNetItem(EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInner paymentNetItem) {
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
  public List<EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInner> getPaymentNet() {
    return paymentNet;
  }

  public void setPaymentNet(@javax.annotation.Nonnull List<EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInner> paymentNet) {
    this.paymentNet = paymentNet;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner paymentDiscount(@javax.annotation.Nullable List<EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentDiscountInner> paymentDiscount) {
    this.paymentDiscount = paymentDiscount;
    return this;
  }

  public EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner addPaymentDiscountItem(EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentDiscountInner paymentDiscountItem) {
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
  public List<EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentDiscountInner> getPaymentDiscount() {
    return paymentDiscount;
  }

  public void setPaymentDiscount(@javax.annotation.Nullable List<EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentDiscountInner> paymentDiscount) {
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
    EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner edIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner = (EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner) o;
    return Objects.equals(this.paymentNet, edIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner.paymentNet) &&
        Objects.equals(this.paymentDiscount, edIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner.paymentDiscount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentNet, paymentDiscount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner {\n");
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
    openapiFields.add("PaymentNet");
    openapiFields.add("PaymentDiscount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("PaymentNet");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner is not found in the empty JSON string", EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("PaymentNet").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `PaymentNet` to be an array in the JSON string but got `%s`", jsonObj.get("PaymentNet").toString()));
      }

      JsonArray jsonArraypaymentNet = jsonObj.getAsJsonArray("PaymentNet");
      // validate the required field `PaymentNet` (array)
      for (int i = 0; i < jsonArraypaymentNet.size(); i++) {
        EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentNetInner.validateJsonElement(jsonArraypaymentNet.get(i));
      };
      if (jsonObj.get("PaymentDiscount") != null && !jsonObj.get("PaymentDiscount").isJsonNull()) {
        JsonArray jsonArraypaymentDiscount = jsonObj.getAsJsonArray("PaymentDiscount");
        if (jsonArraypaymentDiscount != null) {
          // ensure the json data is an array
          if (!jsonObj.get("PaymentDiscount").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `PaymentDiscount` to be an array in the JSON string but got `%s`", jsonObj.get("PaymentDiscount").toString()));
          }

          // validate the optional field `PaymentDiscount` (array)
          for (int i = 0; i < jsonArraypaymentDiscount.size(); i++) {
            EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInnerPaymentDiscountInner.validateJsonElement(jsonArraypaymentDiscount.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner>() {
           @Override
           public void write(JsonWriter out, EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner
   * @throws IOException if the JSON string is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner
   */
  public static EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner.class);
  }

  /**
   * Convert an instance of EDIWheelB44InvoiceListResponseInvoiceInnerPaymentTermsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

