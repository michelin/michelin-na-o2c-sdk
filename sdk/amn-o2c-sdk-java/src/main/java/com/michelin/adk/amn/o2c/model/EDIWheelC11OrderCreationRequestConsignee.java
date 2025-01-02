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
import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderCreationRequestConsigneeAddress;
import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderCreationRequestSellerPartyInformationContact;
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
 * EDIWheelC11OrderCreationRequestConsignee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class EDIWheelC11OrderCreationRequestConsignee {
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
  @javax.annotation.Nullable
  private EDIWheelC11OrderCreationRequestConsigneeAddress address;

  public static final String SERIALIZED_NAME_INFORMATION_CONTACT = "InformationContact";
  @SerializedName(SERIALIZED_NAME_INFORMATION_CONTACT)
  @javax.annotation.Nullable
  private EDIWheelC11OrderCreationRequestSellerPartyInformationContact informationContact;

  public EDIWheelC11OrderCreationRequestConsignee() {
  }

  public EDIWheelC11OrderCreationRequestConsignee partyID(@javax.annotation.Nonnull String partyID) {
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


  public EDIWheelC11OrderCreationRequestConsignee agencyCode(@javax.annotation.Nonnull String agencyCode) {
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


  public EDIWheelC11OrderCreationRequestConsignee name(@javax.annotation.Nullable List<String> name) {
    this.name = name;
    return this;
  }

  public EDIWheelC11OrderCreationRequestConsignee addNameItem(String nameItem) {
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


  public EDIWheelC11OrderCreationRequestConsignee address(@javax.annotation.Nullable EDIWheelC11OrderCreationRequestConsigneeAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nullable
  public EDIWheelC11OrderCreationRequestConsigneeAddress getAddress() {
    return address;
  }

  public void setAddress(@javax.annotation.Nullable EDIWheelC11OrderCreationRequestConsigneeAddress address) {
    this.address = address;
  }


  public EDIWheelC11OrderCreationRequestConsignee informationContact(@javax.annotation.Nullable EDIWheelC11OrderCreationRequestSellerPartyInformationContact informationContact) {
    this.informationContact = informationContact;
    return this;
  }

  /**
   * Get informationContact
   * @return informationContact
   */
  @javax.annotation.Nullable
  public EDIWheelC11OrderCreationRequestSellerPartyInformationContact getInformationContact() {
    return informationContact;
  }

  public void setInformationContact(@javax.annotation.Nullable EDIWheelC11OrderCreationRequestSellerPartyInformationContact informationContact) {
    this.informationContact = informationContact;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC11OrderCreationRequestConsignee edIWheelC11OrderCreationRequestConsignee = (EDIWheelC11OrderCreationRequestConsignee) o;
    return Objects.equals(this.partyID, edIWheelC11OrderCreationRequestConsignee.partyID) &&
        Objects.equals(this.agencyCode, edIWheelC11OrderCreationRequestConsignee.agencyCode) &&
        Objects.equals(this.name, edIWheelC11OrderCreationRequestConsignee.name) &&
        Objects.equals(this.address, edIWheelC11OrderCreationRequestConsignee.address) &&
        Objects.equals(this.informationContact, edIWheelC11OrderCreationRequestConsignee.informationContact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyID, agencyCode, name, address, informationContact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC11OrderCreationRequestConsignee {\n");
    sb.append("    partyID: ").append(toIndentedString(partyID)).append("\n");
    sb.append("    agencyCode: ").append(toIndentedString(agencyCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    informationContact: ").append(toIndentedString(informationContact)).append("\n");
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
    openapiFields.add("InformationContact");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("PartyID");
    openapiRequiredFields.add("AgencyCode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC11OrderCreationRequestConsignee
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC11OrderCreationRequestConsignee.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC11OrderCreationRequestConsignee is not found in the empty JSON string", EDIWheelC11OrderCreationRequestConsignee.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC11OrderCreationRequestConsignee.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC11OrderCreationRequestConsignee` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelC11OrderCreationRequestConsignee.openapiRequiredFields) {
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
      // validate the optional field `Address`
      if (jsonObj.get("Address") != null && !jsonObj.get("Address").isJsonNull()) {
        EDIWheelC11OrderCreationRequestConsigneeAddress.validateJsonElement(jsonObj.get("Address"));
      }
      // validate the optional field `InformationContact`
      if (jsonObj.get("InformationContact") != null && !jsonObj.get("InformationContact").isJsonNull()) {
        EDIWheelC11OrderCreationRequestSellerPartyInformationContact.validateJsonElement(jsonObj.get("InformationContact"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC11OrderCreationRequestConsignee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC11OrderCreationRequestConsignee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC11OrderCreationRequestConsignee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC11OrderCreationRequestConsignee.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC11OrderCreationRequestConsignee>() {
           @Override
           public void write(JsonWriter out, EDIWheelC11OrderCreationRequestConsignee value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC11OrderCreationRequestConsignee read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC11OrderCreationRequestConsignee given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC11OrderCreationRequestConsignee
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC11OrderCreationRequestConsignee
   */
  public static EDIWheelC11OrderCreationRequestConsignee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC11OrderCreationRequestConsignee.class);
  }

  /**
   * Convert an instance of EDIWheelC11OrderCreationRequestConsignee to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

