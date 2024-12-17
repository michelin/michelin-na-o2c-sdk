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
import com.michelin.adk.amn.o2c.model.EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification;
import com.michelin.adk.amn.o2c.model.EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsInstitutionIdentification;
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
 * EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-17T19:36:32.994638751Z[GMT]", comments = "Generator version: 7.10.0")
public class EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions {
  public static final String SERIALIZED_NAME_PARTY_FUNCTION_CODE_QUALIFIER = "PartyFunctionCodeQualifier";
  @SerializedName(SERIALIZED_NAME_PARTY_FUNCTION_CODE_QUALIFIER)
  @javax.annotation.Nullable
  private String partyFunctionCodeQualifier;

  public static final String SERIALIZED_NAME_ACCOUNT_HOLDER_IDENTIFICATION = "AccountHolderIdentification";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_HOLDER_IDENTIFICATION)
  @javax.annotation.Nullable
  private EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification accountHolderIdentification;

  public static final String SERIALIZED_NAME_INSTITUTION_IDENTIFICATION = "InstitutionIdentification";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_IDENTIFICATION)
  @javax.annotation.Nullable
  private EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsInstitutionIdentification institutionIdentification;

  public EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions() {
  }

  public EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions partyFunctionCodeQualifier(@javax.annotation.Nullable String partyFunctionCodeQualifier) {
    this.partyFunctionCodeQualifier = partyFunctionCodeQualifier;
    return this;
  }

  /**
   * Get partyFunctionCodeQualifier
   * @return partyFunctionCodeQualifier
   */
  @javax.annotation.Nullable
  public String getPartyFunctionCodeQualifier() {
    return partyFunctionCodeQualifier;
  }

  public void setPartyFunctionCodeQualifier(@javax.annotation.Nullable String partyFunctionCodeQualifier) {
    this.partyFunctionCodeQualifier = partyFunctionCodeQualifier;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions accountHolderIdentification(@javax.annotation.Nullable EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification accountHolderIdentification) {
    this.accountHolderIdentification = accountHolderIdentification;
    return this;
  }

  /**
   * Get accountHolderIdentification
   * @return accountHolderIdentification
   */
  @javax.annotation.Nullable
  public EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification getAccountHolderIdentification() {
    return accountHolderIdentification;
  }

  public void setAccountHolderIdentification(@javax.annotation.Nullable EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification accountHolderIdentification) {
    this.accountHolderIdentification = accountHolderIdentification;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions institutionIdentification(@javax.annotation.Nullable EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsInstitutionIdentification institutionIdentification) {
    this.institutionIdentification = institutionIdentification;
    return this;
  }

  /**
   * Get institutionIdentification
   * @return institutionIdentification
   */
  @javax.annotation.Nullable
  public EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsInstitutionIdentification getInstitutionIdentification() {
    return institutionIdentification;
  }

  public void setInstitutionIdentification(@javax.annotation.Nullable EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsInstitutionIdentification institutionIdentification) {
    this.institutionIdentification = institutionIdentification;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions edIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions = (EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions) o;
    return Objects.equals(this.partyFunctionCodeQualifier, edIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions.partyFunctionCodeQualifier) &&
        Objects.equals(this.accountHolderIdentification, edIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions.accountHolderIdentification) &&
        Objects.equals(this.institutionIdentification, edIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions.institutionIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyFunctionCodeQualifier, accountHolderIdentification, institutionIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions {\n");
    sb.append("    partyFunctionCodeQualifier: ").append(toIndentedString(partyFunctionCodeQualifier)).append("\n");
    sb.append("    accountHolderIdentification: ").append(toIndentedString(accountHolderIdentification)).append("\n");
    sb.append("    institutionIdentification: ").append(toIndentedString(institutionIdentification)).append("\n");
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
    openapiFields.add("PartyFunctionCodeQualifier");
    openapiFields.add("AccountHolderIdentification");
    openapiFields.add("InstitutionIdentification");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions is not found in the empty JSON string", EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("PartyFunctionCodeQualifier") != null && !jsonObj.get("PartyFunctionCodeQualifier").isJsonNull()) && !jsonObj.get("PartyFunctionCodeQualifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PartyFunctionCodeQualifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PartyFunctionCodeQualifier").toString()));
      }
      // validate the optional field `AccountHolderIdentification`
      if (jsonObj.get("AccountHolderIdentification") != null && !jsonObj.get("AccountHolderIdentification").isJsonNull()) {
        EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsAccountHolderIdentification.validateJsonElement(jsonObj.get("AccountHolderIdentification"));
      }
      // validate the optional field `InstitutionIdentification`
      if (jsonObj.get("InstitutionIdentification") != null && !jsonObj.get("InstitutionIdentification").isJsonNull()) {
        EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructionsInstitutionIdentification.validateJsonElement(jsonObj.get("InstitutionIdentification"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions>() {
           @Override
           public void write(JsonWriter out, EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions
   * @throws IOException if the JSON string is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions
   */
  public static EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions.class);
  }

  /**
   * Convert an instance of EDIWheelB44InvoiceListResponseInvoiceInnerPaymentInstructions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

