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
 * EDIWheelC11StockInquiryResponseConsignee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-17T01:25:07.723106500-05:00[America/Toronto]", comments = "Generator version: 7.10.0")
public class EDIWheelC11StockInquiryResponseConsignee {
  public static final String SERIALIZED_NAME_PARTY_I_D = "partyID";
  @SerializedName(SERIALIZED_NAME_PARTY_I_D)
  @javax.annotation.Nullable
  private String partyID;

  public static final String SERIALIZED_NAME_AGENCY_CODE = "agencyCode";
  @SerializedName(SERIALIZED_NAME_AGENCY_CODE)
  @javax.annotation.Nullable
  private String agencyCode;

  public EDIWheelC11StockInquiryResponseConsignee() {
  }

  public EDIWheelC11StockInquiryResponseConsignee partyID(@javax.annotation.Nullable String partyID) {
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


  public EDIWheelC11StockInquiryResponseConsignee agencyCode(@javax.annotation.Nullable String agencyCode) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC11StockInquiryResponseConsignee edIWheelC11StockInquiryResponseConsignee = (EDIWheelC11StockInquiryResponseConsignee) o;
    return Objects.equals(this.partyID, edIWheelC11StockInquiryResponseConsignee.partyID) &&
        Objects.equals(this.agencyCode, edIWheelC11StockInquiryResponseConsignee.agencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyID, agencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC11StockInquiryResponseConsignee {\n");
    sb.append("    partyID: ").append(toIndentedString(partyID)).append("\n");
    sb.append("    agencyCode: ").append(toIndentedString(agencyCode)).append("\n");
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
    openapiFields.add("partyID");
    openapiFields.add("agencyCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC11StockInquiryResponseConsignee
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC11StockInquiryResponseConsignee.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC11StockInquiryResponseConsignee is not found in the empty JSON string", EDIWheelC11StockInquiryResponseConsignee.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC11StockInquiryResponseConsignee.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC11StockInquiryResponseConsignee` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("partyID") != null && !jsonObj.get("partyID").isJsonNull()) && !jsonObj.get("partyID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partyID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partyID").toString()));
      }
      if ((jsonObj.get("agencyCode") != null && !jsonObj.get("agencyCode").isJsonNull()) && !jsonObj.get("agencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agencyCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC11StockInquiryResponseConsignee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC11StockInquiryResponseConsignee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC11StockInquiryResponseConsignee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC11StockInquiryResponseConsignee.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC11StockInquiryResponseConsignee>() {
           @Override
           public void write(JsonWriter out, EDIWheelC11StockInquiryResponseConsignee value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC11StockInquiryResponseConsignee read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC11StockInquiryResponseConsignee given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC11StockInquiryResponseConsignee
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC11StockInquiryResponseConsignee
   */
  public static EDIWheelC11StockInquiryResponseConsignee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC11StockInquiryResponseConsignee.class);
  }

  /**
   * Convert an instance of EDIWheelC11StockInquiryResponseConsignee to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

