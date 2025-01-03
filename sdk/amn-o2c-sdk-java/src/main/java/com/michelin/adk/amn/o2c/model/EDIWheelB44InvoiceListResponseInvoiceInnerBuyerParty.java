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
import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderCreationRequestSellerPartyAddress;
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
 * EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty {
  public static final String SERIALIZED_NAME_PARTY_I_D = "PartyID";
  @SerializedName(SERIALIZED_NAME_PARTY_I_D)
  @javax.annotation.Nonnull
  private String partyID;

  public static final String SERIALIZED_NAME_AGENCY_CODE = "AgencyCode";
  @SerializedName(SERIALIZED_NAME_AGENCY_CODE)
  @javax.annotation.Nonnull
  private String agencyCode;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private List<String> name = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADDRESS = "Address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  @javax.annotation.Nonnull
  private EDIWheelC11OrderCreationRequestSellerPartyAddress address;

  public static final String SERIALIZED_NAME_TAX_REGISTRATION_I_D = "TaxRegistrationID";
  @SerializedName(SERIALIZED_NAME_TAX_REGISTRATION_I_D)
  @javax.annotation.Nullable
  private String taxRegistrationID;

  public static final String SERIALIZED_NAME_VA_T_REGISTRATION_I_D = "VATRegistrationID";
  @SerializedName(SERIALIZED_NAME_VA_T_REGISTRATION_I_D)
  @javax.annotation.Nullable
  private String vaTRegistrationID;

  public EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty() {
  }

  public EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty partyID(@javax.annotation.Nonnull String partyID) {
    this.partyID = partyID;
    return this;
  }

  /**
   * Get partyID
   * @return partyID
   */
  @javax.annotation.Nonnull
  public String getPartyID() {
    return partyID;
  }

  public void setPartyID(@javax.annotation.Nonnull String partyID) {
    this.partyID = partyID;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty agencyCode(@javax.annotation.Nonnull String agencyCode) {
    this.agencyCode = agencyCode;
    return this;
  }

  /**
   * Get agencyCode
   * @return agencyCode
   */
  @javax.annotation.Nonnull
  public String getAgencyCode() {
    return agencyCode;
  }

  public void setAgencyCode(@javax.annotation.Nonnull String agencyCode) {
    this.agencyCode = agencyCode;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty name(@javax.annotation.Nullable List<String> name) {
    this.name = name;
    return this;
  }

  public EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty addNameItem(String nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public List<String> getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable List<String> name) {
    this.name = name;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty address(@javax.annotation.Nonnull EDIWheelC11OrderCreationRequestSellerPartyAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nonnull
  public EDIWheelC11OrderCreationRequestSellerPartyAddress getAddress() {
    return address;
  }

  public void setAddress(@javax.annotation.Nonnull EDIWheelC11OrderCreationRequestSellerPartyAddress address) {
    this.address = address;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty taxRegistrationID(@javax.annotation.Nullable String taxRegistrationID) {
    this.taxRegistrationID = taxRegistrationID;
    return this;
  }

  /**
   * Get taxRegistrationID
   * @return taxRegistrationID
   */
  @javax.annotation.Nullable
  public String getTaxRegistrationID() {
    return taxRegistrationID;
  }

  public void setTaxRegistrationID(@javax.annotation.Nullable String taxRegistrationID) {
    this.taxRegistrationID = taxRegistrationID;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty vaTRegistrationID(@javax.annotation.Nullable String vaTRegistrationID) {
    this.vaTRegistrationID = vaTRegistrationID;
    return this;
  }

  /**
   * Get vaTRegistrationID
   * @return vaTRegistrationID
   */
  @javax.annotation.Nullable
  public String getVaTRegistrationID() {
    return vaTRegistrationID;
  }

  public void setVaTRegistrationID(@javax.annotation.Nullable String vaTRegistrationID) {
    this.vaTRegistrationID = vaTRegistrationID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty edIWheelB44InvoiceListResponseInvoiceInnerBuyerParty = (EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty) o;
    return Objects.equals(this.partyID, edIWheelB44InvoiceListResponseInvoiceInnerBuyerParty.partyID) &&
        Objects.equals(this.agencyCode, edIWheelB44InvoiceListResponseInvoiceInnerBuyerParty.agencyCode) &&
        Objects.equals(this.name, edIWheelB44InvoiceListResponseInvoiceInnerBuyerParty.name) &&
        Objects.equals(this.address, edIWheelB44InvoiceListResponseInvoiceInnerBuyerParty.address) &&
        Objects.equals(this.taxRegistrationID, edIWheelB44InvoiceListResponseInvoiceInnerBuyerParty.taxRegistrationID) &&
        Objects.equals(this.vaTRegistrationID, edIWheelB44InvoiceListResponseInvoiceInnerBuyerParty.vaTRegistrationID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyID, agencyCode, name, address, taxRegistrationID, vaTRegistrationID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty {\n");
    sb.append("    partyID: ").append(toIndentedString(partyID)).append("\n");
    sb.append("    agencyCode: ").append(toIndentedString(agencyCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    taxRegistrationID: ").append(toIndentedString(taxRegistrationID)).append("\n");
    sb.append("    vaTRegistrationID: ").append(toIndentedString(vaTRegistrationID)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("Address");
    openapiFields.add("TaxRegistrationID");
    openapiFields.add("VATRegistrationID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("PartyID");
    openapiRequiredFields.add("AgencyCode");
    openapiRequiredFields.add("Address");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty is not found in the empty JSON string", EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("PartyID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PartyID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PartyID").toString()));
      }
      if (!jsonObj.get("AgencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AgencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AgencyCode").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull() && !jsonObj.get("Name").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be an array in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      // validate the required field `Address`
      EDIWheelC11OrderCreationRequestSellerPartyAddress.validateJsonElement(jsonObj.get("Address"));
      if ((jsonObj.get("TaxRegistrationID") != null && !jsonObj.get("TaxRegistrationID").isJsonNull()) && !jsonObj.get("TaxRegistrationID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TaxRegistrationID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TaxRegistrationID").toString()));
      }
      if ((jsonObj.get("VATRegistrationID") != null && !jsonObj.get("VATRegistrationID").isJsonNull()) && !jsonObj.get("VATRegistrationID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VATRegistrationID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VATRegistrationID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty>() {
           @Override
           public void write(JsonWriter out, EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty
   * @throws IOException if the JSON string is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty
   */
  public static EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty.class);
  }

  /**
   * Convert an instance of EDIWheelB44InvoiceListResponseInvoiceInnerBuyerParty to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

