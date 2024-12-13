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
import com.michelin.adk.amn.o2c.model.EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact;
import com.michelin.adk.amn.o2c.model.EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty;
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
 * EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T06:44:55.014855667Z[GMT]", comments = "Generator version: 7.9.0")
public class EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty {
  public static final String SERIALIZED_NAME_PARTY_I_D = "PartyID";
  @SerializedName(SERIALIZED_NAME_PARTY_I_D)
  private String partyID;

  public static final String SERIALIZED_NAME_AGENCY_CODE = "AgencyCode";
  @SerializedName(SERIALIZED_NAME_AGENCY_CODE)
  private String agencyCode;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private List<String> name = new ArrayList<>();

  public static final String SERIALIZED_NAME_LEGAL_NAME = "LegalName";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  public static final String SERIALIZED_NAME_ADDRESS = "Address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private EDIWheelC11OrderCreationRequestSellerPartyAddress address;

  public static final String SERIALIZED_NAME_INFORMATION_CONTACT = "InformationContact";
  @SerializedName(SERIALIZED_NAME_INFORMATION_CONTACT)
  private EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact informationContact;

  public static final String SERIALIZED_NAME_SUPPLIER_PARTY = "SupplierParty";
  @SerializedName(SERIALIZED_NAME_SUPPLIER_PARTY)
  private EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty supplierParty;

  public static final String SERIALIZED_NAME_TAX_REGISTRATION_I_D = "TaxRegistrationID";
  @SerializedName(SERIALIZED_NAME_TAX_REGISTRATION_I_D)
  private String taxRegistrationID;

  public static final String SERIALIZED_NAME_VA_T_REGISTRATION_I_D = "VATRegistrationID";
  @SerializedName(SERIALIZED_NAME_VA_T_REGISTRATION_I_D)
  private String vaTRegistrationID;

  public static final String SERIALIZED_NAME_SI_R_E_N_NUMBER = "SIRENNumber";
  @SerializedName(SERIALIZED_NAME_SI_R_E_N_NUMBER)
  private String siRENNumber;

  public static final String SERIALIZED_NAME_TRIBUNAL_REGISTRATION_NUMBER = "TribunalRegistrationNumber";
  @SerializedName(SERIALIZED_NAME_TRIBUNAL_REGISTRATION_NUMBER)
  private String tribunalRegistrationNumber;

  public static final String SERIALIZED_NAME_COMPANY_LEGAL_FORM = "CompanyLegalForm";
  @SerializedName(SERIALIZED_NAME_COMPANY_LEGAL_FORM)
  private String companyLegalForm;

  public static final String SERIALIZED_NAME_COMPANY_REGISTERED_CAPITAL = "CompanyRegisteredCapital";
  @SerializedName(SERIALIZED_NAME_COMPANY_REGISTERED_CAPITAL)
  private String companyRegisteredCapital;

  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty() {
  }

  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty partyID(String partyID) {
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

  public void setPartyID(String partyID) {
    this.partyID = partyID;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty agencyCode(String agencyCode) {
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

  public void setAgencyCode(String agencyCode) {
    this.agencyCode = agencyCode;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty name(List<String> name) {
    this.name = name;
    return this;
  }

  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty addNameItem(String nameItem) {
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

  public void setName(List<String> name) {
    this.name = name;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty legalName(String legalName) {
    this.legalName = legalName;
    return this;
  }

  /**
   * Get legalName
   * @return legalName
   */
  @javax.annotation.Nullable
  public String getLegalName() {
    return legalName;
  }

  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty address(EDIWheelC11OrderCreationRequestSellerPartyAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nullable
  public EDIWheelC11OrderCreationRequestSellerPartyAddress getAddress() {
    return address;
  }

  public void setAddress(EDIWheelC11OrderCreationRequestSellerPartyAddress address) {
    this.address = address;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty informationContact(EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact informationContact) {
    this.informationContact = informationContact;
    return this;
  }

  /**
   * Get informationContact
   * @return informationContact
   */
  @javax.annotation.Nullable
  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact getInformationContact() {
    return informationContact;
  }

  public void setInformationContact(EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact informationContact) {
    this.informationContact = informationContact;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty supplierParty(EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty supplierParty) {
    this.supplierParty = supplierParty;
    return this;
  }

  /**
   * Get supplierParty
   * @return supplierParty
   */
  @javax.annotation.Nullable
  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty getSupplierParty() {
    return supplierParty;
  }

  public void setSupplierParty(EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty supplierParty) {
    this.supplierParty = supplierParty;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty taxRegistrationID(String taxRegistrationID) {
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

  public void setTaxRegistrationID(String taxRegistrationID) {
    this.taxRegistrationID = taxRegistrationID;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty vaTRegistrationID(String vaTRegistrationID) {
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

  public void setVaTRegistrationID(String vaTRegistrationID) {
    this.vaTRegistrationID = vaTRegistrationID;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty siRENNumber(String siRENNumber) {
    this.siRENNumber = siRENNumber;
    return this;
  }

  /**
   * Get siRENNumber
   * @return siRENNumber
   */
  @javax.annotation.Nullable
  public String getSiRENNumber() {
    return siRENNumber;
  }

  public void setSiRENNumber(String siRENNumber) {
    this.siRENNumber = siRENNumber;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty tribunalRegistrationNumber(String tribunalRegistrationNumber) {
    this.tribunalRegistrationNumber = tribunalRegistrationNumber;
    return this;
  }

  /**
   * Get tribunalRegistrationNumber
   * @return tribunalRegistrationNumber
   */
  @javax.annotation.Nullable
  public String getTribunalRegistrationNumber() {
    return tribunalRegistrationNumber;
  }

  public void setTribunalRegistrationNumber(String tribunalRegistrationNumber) {
    this.tribunalRegistrationNumber = tribunalRegistrationNumber;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty companyLegalForm(String companyLegalForm) {
    this.companyLegalForm = companyLegalForm;
    return this;
  }

  /**
   * Get companyLegalForm
   * @return companyLegalForm
   */
  @javax.annotation.Nullable
  public String getCompanyLegalForm() {
    return companyLegalForm;
  }

  public void setCompanyLegalForm(String companyLegalForm) {
    this.companyLegalForm = companyLegalForm;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty companyRegisteredCapital(String companyRegisteredCapital) {
    this.companyRegisteredCapital = companyRegisteredCapital;
    return this;
  }

  /**
   * Get companyRegisteredCapital
   * @return companyRegisteredCapital
   */
  @javax.annotation.Nullable
  public String getCompanyRegisteredCapital() {
    return companyRegisteredCapital;
  }

  public void setCompanyRegisteredCapital(String companyRegisteredCapital) {
    this.companyRegisteredCapital = companyRegisteredCapital;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty edIWheelB44InvoiceListResponseInvoiceInnerSellerParty = (EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty) o;
    return Objects.equals(this.partyID, edIWheelB44InvoiceListResponseInvoiceInnerSellerParty.partyID) &&
        Objects.equals(this.agencyCode, edIWheelB44InvoiceListResponseInvoiceInnerSellerParty.agencyCode) &&
        Objects.equals(this.name, edIWheelB44InvoiceListResponseInvoiceInnerSellerParty.name) &&
        Objects.equals(this.legalName, edIWheelB44InvoiceListResponseInvoiceInnerSellerParty.legalName) &&
        Objects.equals(this.address, edIWheelB44InvoiceListResponseInvoiceInnerSellerParty.address) &&
        Objects.equals(this.informationContact, edIWheelB44InvoiceListResponseInvoiceInnerSellerParty.informationContact) &&
        Objects.equals(this.supplierParty, edIWheelB44InvoiceListResponseInvoiceInnerSellerParty.supplierParty) &&
        Objects.equals(this.taxRegistrationID, edIWheelB44InvoiceListResponseInvoiceInnerSellerParty.taxRegistrationID) &&
        Objects.equals(this.vaTRegistrationID, edIWheelB44InvoiceListResponseInvoiceInnerSellerParty.vaTRegistrationID) &&
        Objects.equals(this.siRENNumber, edIWheelB44InvoiceListResponseInvoiceInnerSellerParty.siRENNumber) &&
        Objects.equals(this.tribunalRegistrationNumber, edIWheelB44InvoiceListResponseInvoiceInnerSellerParty.tribunalRegistrationNumber) &&
        Objects.equals(this.companyLegalForm, edIWheelB44InvoiceListResponseInvoiceInnerSellerParty.companyLegalForm) &&
        Objects.equals(this.companyRegisteredCapital, edIWheelB44InvoiceListResponseInvoiceInnerSellerParty.companyRegisteredCapital);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyID, agencyCode, name, legalName, address, informationContact, supplierParty, taxRegistrationID, vaTRegistrationID, siRENNumber, tribunalRegistrationNumber, companyLegalForm, companyRegisteredCapital);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty {\n");
    sb.append("    partyID: ").append(toIndentedString(partyID)).append("\n");
    sb.append("    agencyCode: ").append(toIndentedString(agencyCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    informationContact: ").append(toIndentedString(informationContact)).append("\n");
    sb.append("    supplierParty: ").append(toIndentedString(supplierParty)).append("\n");
    sb.append("    taxRegistrationID: ").append(toIndentedString(taxRegistrationID)).append("\n");
    sb.append("    vaTRegistrationID: ").append(toIndentedString(vaTRegistrationID)).append("\n");
    sb.append("    siRENNumber: ").append(toIndentedString(siRENNumber)).append("\n");
    sb.append("    tribunalRegistrationNumber: ").append(toIndentedString(tribunalRegistrationNumber)).append("\n");
    sb.append("    companyLegalForm: ").append(toIndentedString(companyLegalForm)).append("\n");
    sb.append("    companyRegisteredCapital: ").append(toIndentedString(companyRegisteredCapital)).append("\n");
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
    openapiFields.add("LegalName");
    openapiFields.add("Address");
    openapiFields.add("InformationContact");
    openapiFields.add("SupplierParty");
    openapiFields.add("TaxRegistrationID");
    openapiFields.add("VATRegistrationID");
    openapiFields.add("SIRENNumber");
    openapiFields.add("TribunalRegistrationNumber");
    openapiFields.add("CompanyLegalForm");
    openapiFields.add("CompanyRegisteredCapital");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("PartyID");
    openapiRequiredFields.add("AgencyCode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty is not found in the empty JSON string", EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty.openapiRequiredFields) {
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
      if ((jsonObj.get("LegalName") != null && !jsonObj.get("LegalName").isJsonNull()) && !jsonObj.get("LegalName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LegalName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LegalName").toString()));
      }
      // validate the optional field `Address`
      if (jsonObj.get("Address") != null && !jsonObj.get("Address").isJsonNull()) {
        EDIWheelC11OrderCreationRequestSellerPartyAddress.validateJsonElement(jsonObj.get("Address"));
      }
      // validate the optional field `InformationContact`
      if (jsonObj.get("InformationContact") != null && !jsonObj.get("InformationContact").isJsonNull()) {
        EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact.validateJsonElement(jsonObj.get("InformationContact"));
      }
      // validate the optional field `SupplierParty`
      if (jsonObj.get("SupplierParty") != null && !jsonObj.get("SupplierParty").isJsonNull()) {
        EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartySupplierParty.validateJsonElement(jsonObj.get("SupplierParty"));
      }
      if ((jsonObj.get("TaxRegistrationID") != null && !jsonObj.get("TaxRegistrationID").isJsonNull()) && !jsonObj.get("TaxRegistrationID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TaxRegistrationID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TaxRegistrationID").toString()));
      }
      if ((jsonObj.get("VATRegistrationID") != null && !jsonObj.get("VATRegistrationID").isJsonNull()) && !jsonObj.get("VATRegistrationID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VATRegistrationID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VATRegistrationID").toString()));
      }
      if ((jsonObj.get("SIRENNumber") != null && !jsonObj.get("SIRENNumber").isJsonNull()) && !jsonObj.get("SIRENNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SIRENNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SIRENNumber").toString()));
      }
      if ((jsonObj.get("TribunalRegistrationNumber") != null && !jsonObj.get("TribunalRegistrationNumber").isJsonNull()) && !jsonObj.get("TribunalRegistrationNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TribunalRegistrationNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TribunalRegistrationNumber").toString()));
      }
      if ((jsonObj.get("CompanyLegalForm") != null && !jsonObj.get("CompanyLegalForm").isJsonNull()) && !jsonObj.get("CompanyLegalForm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CompanyLegalForm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CompanyLegalForm").toString()));
      }
      if ((jsonObj.get("CompanyRegisteredCapital") != null && !jsonObj.get("CompanyRegisteredCapital").isJsonNull()) && !jsonObj.get("CompanyRegisteredCapital").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CompanyRegisteredCapital` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CompanyRegisteredCapital").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty>() {
           @Override
           public void write(JsonWriter out, EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty
   * @throws IOException if the JSON string is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty
   */
  public static EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty.class);
  }

  /**
   * Convert an instance of EDIWheelB44InvoiceListResponseInvoiceInnerSellerParty to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

