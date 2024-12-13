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
 * EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T06:44:55.014855667Z[GMT]", comments = "Generator version: 7.9.0")
public class EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification {
  public static final String SERIALIZED_NAME_BUYERS_ARTICLE_I_D = "BuyersArticleID";
  @SerializedName(SERIALIZED_NAME_BUYERS_ARTICLE_I_D)
  private String buyersArticleID;

  public static final String SERIALIZED_NAME_SUPPLIERS_ARTICLE_I_D = "SuppliersArticleID";
  @SerializedName(SERIALIZED_NAME_SUPPLIERS_ARTICLE_I_D)
  private String suppliersArticleID;

  public static final String SERIALIZED_NAME_EA_N_U_C_C_ARTICLE_I_D = "EANUCCArticleID";
  @SerializedName(SERIALIZED_NAME_EA_N_U_C_C_ARTICLE_I_D)
  private String eaNUCCArticleID;

  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification() {
  }

  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification buyersArticleID(String buyersArticleID) {
    this.buyersArticleID = buyersArticleID;
    return this;
  }

  /**
   * Get buyersArticleID
   * @return buyersArticleID
   */
  @javax.annotation.Nullable
  public String getBuyersArticleID() {
    return buyersArticleID;
  }

  public void setBuyersArticleID(String buyersArticleID) {
    this.buyersArticleID = buyersArticleID;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification suppliersArticleID(String suppliersArticleID) {
    this.suppliersArticleID = suppliersArticleID;
    return this;
  }

  /**
   * Get suppliersArticleID
   * @return suppliersArticleID
   */
  @javax.annotation.Nullable
  public String getSuppliersArticleID() {
    return suppliersArticleID;
  }

  public void setSuppliersArticleID(String suppliersArticleID) {
    this.suppliersArticleID = suppliersArticleID;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification eaNUCCArticleID(String eaNUCCArticleID) {
    this.eaNUCCArticleID = eaNUCCArticleID;
    return this;
  }

  /**
   * Get eaNUCCArticleID
   * @return eaNUCCArticleID
   */
  @javax.annotation.Nullable
  public String getEaNUCCArticleID() {
    return eaNUCCArticleID;
  }

  public void setEaNUCCArticleID(String eaNUCCArticleID) {
    this.eaNUCCArticleID = eaNUCCArticleID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification = (EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification) o;
    return Objects.equals(this.buyersArticleID, edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification.buyersArticleID) &&
        Objects.equals(this.suppliersArticleID, edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification.suppliersArticleID) &&
        Objects.equals(this.eaNUCCArticleID, edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification.eaNUCCArticleID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyersArticleID, suppliersArticleID, eaNUCCArticleID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification {\n");
    sb.append("    buyersArticleID: ").append(toIndentedString(buyersArticleID)).append("\n");
    sb.append("    suppliersArticleID: ").append(toIndentedString(suppliersArticleID)).append("\n");
    sb.append("    eaNUCCArticleID: ").append(toIndentedString(eaNUCCArticleID)).append("\n");
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
    openapiFields.add("BuyersArticleID");
    openapiFields.add("SuppliersArticleID");
    openapiFields.add("EANUCCArticleID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification is not found in the empty JSON string", EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("BuyersArticleID") != null && !jsonObj.get("BuyersArticleID").isJsonNull()) && !jsonObj.get("BuyersArticleID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BuyersArticleID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BuyersArticleID").toString()));
      }
      if ((jsonObj.get("SuppliersArticleID") != null && !jsonObj.get("SuppliersArticleID").isJsonNull()) && !jsonObj.get("SuppliersArticleID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SuppliersArticleID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SuppliersArticleID").toString()));
      }
      if ((jsonObj.get("EANUCCArticleID") != null && !jsonObj.get("EANUCCArticleID").isJsonNull()) && !jsonObj.get("EANUCCArticleID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EANUCCArticleID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EANUCCArticleID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification>() {
           @Override
           public void write(JsonWriter out, EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification
   * @throws IOException if the JSON string is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification
   */
  public static EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification.class);
  }

  /**
   * Convert an instance of EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleArticleIdentification to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

