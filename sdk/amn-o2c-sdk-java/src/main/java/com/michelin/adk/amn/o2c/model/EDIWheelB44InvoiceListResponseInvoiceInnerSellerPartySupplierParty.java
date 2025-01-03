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
import com.michelin.adk.amn.o2c.model.EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierPartyShippingLocation;
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
 * EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty {
  public static final String SERIALIZED_NAME_PARTY_I_D = "PartyID";
  @SerializedName(SERIALIZED_NAME_PARTY_I_D)
  @javax.annotation.Nullable
  private String partyID;

  public static final String SERIALIZED_NAME_AGENCY_CODE = "AgencyCode";
  @SerializedName(SERIALIZED_NAME_AGENCY_CODE)
  @javax.annotation.Nullable
  private String agencyCode;

  public static final String SERIALIZED_NAME_SHIPPING_LOCATION = "ShippingLocation";
  @SerializedName(SERIALIZED_NAME_SHIPPING_LOCATION)
  @javax.annotation.Nullable
  private EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierPartyShippingLocation shippingLocation;

  public static final String SERIALIZED_NAME_TELEPHONE_EXTENSION = "TelephoneExtension";
  @SerializedName(SERIALIZED_NAME_TELEPHONE_EXTENSION)
  @javax.annotation.Nullable
  private String telephoneExtension;

  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty() {
  }

  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty partyID(@javax.annotation.Nullable String partyID) {
    this.partyID = partyID;
    return this;
  }

  /**
   * Get partyID
   * @return partyID
   */
  @javax.annotation.Nullable
  public String getPartyID() {
    return partyID;
  }

  public void setPartyID(@javax.annotation.Nullable String partyID) {
    this.partyID = partyID;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty agencyCode(@javax.annotation.Nullable String agencyCode) {
    this.agencyCode = agencyCode;
    return this;
  }

  /**
   * Get agencyCode
   * @return agencyCode
   */
  @javax.annotation.Nullable
  public String getAgencyCode() {
    return agencyCode;
  }

  public void setAgencyCode(@javax.annotation.Nullable String agencyCode) {
    this.agencyCode = agencyCode;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty shippingLocation(@javax.annotation.Nullable EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierPartyShippingLocation shippingLocation) {
    this.shippingLocation = shippingLocation;
    return this;
  }

  /**
   * Get shippingLocation
   * @return shippingLocation
   */
  @javax.annotation.Nullable
  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierPartyShippingLocation getShippingLocation() {
    return shippingLocation;
  }

  public void setShippingLocation(@javax.annotation.Nullable EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierPartyShippingLocation shippingLocation) {
    this.shippingLocation = shippingLocation;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty telephoneExtension(@javax.annotation.Nullable String telephoneExtension) {
    this.telephoneExtension = telephoneExtension;
    return this;
  }

  /**
   * Get telephoneExtension
   * @return telephoneExtension
   */
  @javax.annotation.Nullable
  public String getTelephoneExtension() {
    return telephoneExtension;
  }

  public void setTelephoneExtension(@javax.annotation.Nullable String telephoneExtension) {
    this.telephoneExtension = telephoneExtension;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty edIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty = (EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty) o;
    return Objects.equals(this.partyID, edIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty.partyID) &&
        Objects.equals(this.agencyCode, edIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty.agencyCode) &&
        Objects.equals(this.shippingLocation, edIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty.shippingLocation) &&
        Objects.equals(this.telephoneExtension, edIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty.telephoneExtension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyID, agencyCode, shippingLocation, telephoneExtension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty {\n");
    sb.append("    partyID: ").append(toIndentedString(partyID)).append("\n");
    sb.append("    agencyCode: ").append(toIndentedString(agencyCode)).append("\n");
    sb.append("    shippingLocation: ").append(toIndentedString(shippingLocation)).append("\n");
    sb.append("    telephoneExtension: ").append(toIndentedString(telephoneExtension)).append("\n");
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
    openapiFields.add("PartyID");
    openapiFields.add("AgencyCode");
    openapiFields.add("ShippingLocation");
    openapiFields.add("TelephoneExtension");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty is not found in the empty JSON string", EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("PartyID") != null && !jsonObj.get("PartyID").isJsonNull()) && !jsonObj.get("PartyID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PartyID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PartyID").toString()));
      }
      if ((jsonObj.get("AgencyCode") != null && !jsonObj.get("AgencyCode").isJsonNull()) && !jsonObj.get("AgencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AgencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AgencyCode").toString()));
      }
      // validate the optional field `ShippingLocation`
      if (jsonObj.get("ShippingLocation") != null && !jsonObj.get("ShippingLocation").isJsonNull()) {
        EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierPartyShippingLocation.validateJsonElement(jsonObj.get("ShippingLocation"));
      }
      if ((jsonObj.get("TelephoneExtension") != null && !jsonObj.get("TelephoneExtension").isJsonNull()) && !jsonObj.get("TelephoneExtension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TelephoneExtension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TelephoneExtension").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty>() {
           @Override
           public void write(JsonWriter out, EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty
   * @throws IOException if the JSON string is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty
   */
  public static EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty.class);
  }

  /**
   * Convert an instance of EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

