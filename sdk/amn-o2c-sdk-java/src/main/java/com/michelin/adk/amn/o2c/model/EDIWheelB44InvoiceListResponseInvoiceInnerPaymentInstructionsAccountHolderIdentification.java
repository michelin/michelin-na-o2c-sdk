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
 * EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T06:44:55.014855667Z[GMT]", comments = "Generator version: 7.9.0")
public class EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification {
  public static final String SERIALIZED_NAME_ACCOUNT_HOLDER_IDENTIFIER = "AccountHolderIdentifier";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_HOLDER_IDENTIFIER)
  private String accountHolderIdentifier;

  public static final String SERIALIZED_NAME_ACCOUNT_HOLDER_NAME = "AccountHolderName";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_HOLDER_NAME)
  private String accountHolderName;

  public static final String SERIALIZED_NAME_CURRENT_IDENTIFICATION_CODE = "CurrentIdentificationCode";
  @SerializedName(SERIALIZED_NAME_CURRENT_IDENTIFICATION_CODE)
  private String currentIdentificationCode;

  public EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification() {
  }

  public EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification accountHolderIdentifier(String accountHolderIdentifier) {
    this.accountHolderIdentifier = accountHolderIdentifier;
    return this;
  }

  /**
   * Get accountHolderIdentifier
   * @return accountHolderIdentifier
   */
  @javax.annotation.Nullable
  public String getAccountHolderIdentifier() {
    return accountHolderIdentifier;
  }

  public void setAccountHolderIdentifier(String accountHolderIdentifier) {
    this.accountHolderIdentifier = accountHolderIdentifier;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification accountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
    return this;
  }

  /**
   * Get accountHolderName
   * @return accountHolderName
   */
  @javax.annotation.Nullable
  public String getAccountHolderName() {
    return accountHolderName;
  }

  public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification currentIdentificationCode(String currentIdentificationCode) {
    this.currentIdentificationCode = currentIdentificationCode;
    return this;
  }

  /**
   * Get currentIdentificationCode
   * @return currentIdentificationCode
   */
  @javax.annotation.Nullable
  public String getCurrentIdentificationCode() {
    return currentIdentificationCode;
  }

  public void setCurrentIdentificationCode(String currentIdentificationCode) {
    this.currentIdentificationCode = currentIdentificationCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification edIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification = (EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification) o;
    return Objects.equals(this.accountHolderIdentifier, edIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification.accountHolderIdentifier) &&
        Objects.equals(this.accountHolderName, edIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification.accountHolderName) &&
        Objects.equals(this.currentIdentificationCode, edIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification.currentIdentificationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolderIdentifier, accountHolderName, currentIdentificationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification {\n");
    sb.append("    accountHolderIdentifier: ").append(toIndentedString(accountHolderIdentifier)).append("\n");
    sb.append("    accountHolderName: ").append(toIndentedString(accountHolderName)).append("\n");
    sb.append("    currentIdentificationCode: ").append(toIndentedString(currentIdentificationCode)).append("\n");
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
    openapiFields.add("AccountHolderIdentifier");
    openapiFields.add("AccountHolderName");
    openapiFields.add("CurrentIdentificationCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification is not found in the empty JSON string", EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("AccountHolderIdentifier") != null && !jsonObj.get("AccountHolderIdentifier").isJsonNull()) && !jsonObj.get("AccountHolderIdentifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AccountHolderIdentifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AccountHolderIdentifier").toString()));
      }
      if ((jsonObj.get("AccountHolderName") != null && !jsonObj.get("AccountHolderName").isJsonNull()) && !jsonObj.get("AccountHolderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AccountHolderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AccountHolderName").toString()));
      }
      if ((jsonObj.get("CurrentIdentificationCode") != null && !jsonObj.get("CurrentIdentificationCode").isJsonNull()) && !jsonObj.get("CurrentIdentificationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CurrentIdentificationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CurrentIdentificationCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification>() {
           @Override
           public void write(JsonWriter out, EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification
   * @throws IOException if the JSON string is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification
   */
  public static EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification.class);
  }

  /**
   * Convert an instance of EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

