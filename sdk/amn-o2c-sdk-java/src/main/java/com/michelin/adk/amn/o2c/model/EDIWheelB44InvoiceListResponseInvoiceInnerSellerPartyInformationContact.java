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
 * EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact {
  public static final String SERIALIZED_NAME_CONTACT_I_D = "ContactID";
  @SerializedName(SERIALIZED_NAME_CONTACT_I_D)
  @javax.annotation.Nullable
  private String contactID;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_TELEPHONE_NUMBER = "TelephoneNumber";
  @SerializedName(SERIALIZED_NAME_TELEPHONE_NUMBER)
  @javax.annotation.Nullable
  private String telephoneNumber;

  public static final String SERIALIZED_NAME_TELEPHONE_EXTENSION = "TelephoneExtension";
  @SerializedName(SERIALIZED_NAME_TELEPHONE_EXTENSION)
  @javax.annotation.Nullable
  private String telephoneExtension;

  public static final String SERIALIZED_NAME_FAX_NUMBER = "FaxNumber";
  @SerializedName(SERIALIZED_NAME_FAX_NUMBER)
  @javax.annotation.Nullable
  private String faxNumber;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "EmailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  @javax.annotation.Nullable
  private String emailAddress;

  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact() {
  }

  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact contactID(@javax.annotation.Nullable String contactID) {
    this.contactID = contactID;
    return this;
  }

  /**
   * Get contactID
   * @return contactID
   */
  @javax.annotation.Nullable
  public String getContactID() {
    return contactID;
  }

  public void setContactID(@javax.annotation.Nullable String contactID) {
    this.contactID = contactID;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact telephoneNumber(@javax.annotation.Nullable String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
    return this;
  }

  /**
   * Get telephoneNumber
   * @return telephoneNumber
   */
  @javax.annotation.Nullable
  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  public void setTelephoneNumber(@javax.annotation.Nullable String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact telephoneExtension(@javax.annotation.Nullable String telephoneExtension) {
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


  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact faxNumber(@javax.annotation.Nullable String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

  /**
   * Get faxNumber
   * @return faxNumber
   */
  @javax.annotation.Nullable
  public String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(@javax.annotation.Nullable String faxNumber) {
    this.faxNumber = faxNumber;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact emailAddress(@javax.annotation.Nullable String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Get emailAddress
   * @return emailAddress
   */
  @javax.annotation.Nullable
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(@javax.annotation.Nullable String emailAddress) {
    this.emailAddress = emailAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact edIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact = (EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact) o;
    return Objects.equals(this.contactID, edIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact.contactID) &&
        Objects.equals(this.name, edIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact.name) &&
        Objects.equals(this.telephoneNumber, edIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact.telephoneNumber) &&
        Objects.equals(this.telephoneExtension, edIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact.telephoneExtension) &&
        Objects.equals(this.faxNumber, edIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact.faxNumber) &&
        Objects.equals(this.emailAddress, edIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact.emailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactID, name, telephoneNumber, telephoneExtension, faxNumber, emailAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact {\n");
    sb.append("    contactID: ").append(toIndentedString(contactID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
    sb.append("    telephoneExtension: ").append(toIndentedString(telephoneExtension)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
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
    openapiFields.add("ContactID");
    openapiFields.add("Name");
    openapiFields.add("TelephoneNumber");
    openapiFields.add("TelephoneExtension");
    openapiFields.add("FaxNumber");
    openapiFields.add("EmailAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact is not found in the empty JSON string", EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ContactID") != null && !jsonObj.get("ContactID").isJsonNull()) && !jsonObj.get("ContactID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ContactID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ContactID").toString()));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("TelephoneNumber") != null && !jsonObj.get("TelephoneNumber").isJsonNull()) && !jsonObj.get("TelephoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TelephoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TelephoneNumber").toString()));
      }
      if ((jsonObj.get("TelephoneExtension") != null && !jsonObj.get("TelephoneExtension").isJsonNull()) && !jsonObj.get("TelephoneExtension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TelephoneExtension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TelephoneExtension").toString()));
      }
      if ((jsonObj.get("FaxNumber") != null && !jsonObj.get("FaxNumber").isJsonNull()) && !jsonObj.get("FaxNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FaxNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FaxNumber").toString()));
      }
      if ((jsonObj.get("EmailAddress") != null && !jsonObj.get("EmailAddress").isJsonNull()) && !jsonObj.get("EmailAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EmailAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EmailAddress").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact>() {
           @Override
           public void write(JsonWriter out, EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact
   * @throws IOException if the JSON string is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact
   */
  public static EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact.class);
  }

  /**
   * Convert an instance of EDIWheelB44InvoiceListResponseInvoiceInnerSellerPartyInformationContact to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

