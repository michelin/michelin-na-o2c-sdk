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
 * EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification {
  public static final String SERIALIZED_NAME_MANUFACTURERS_ARTICLE_I_D = "manufacturersArticleID";
  @SerializedName(SERIALIZED_NAME_MANUFACTURERS_ARTICLE_I_D)
  @javax.annotation.Nullable
  private String manufacturersArticleID;

  public static final String SERIALIZED_NAME_EANUCC_ARTICLE_I_D = "eanuccArticleID";
  @SerializedName(SERIALIZED_NAME_EANUCC_ARTICLE_I_D)
  @javax.annotation.Nullable
  private String eanuccArticleID;

  public static final String SERIALIZED_NAME_BUYERS_ARTICLE_I_D = "buyersArticleID";
  @SerializedName(SERIALIZED_NAME_BUYERS_ARTICLE_I_D)
  @javax.annotation.Nullable
  private String buyersArticleID;

  public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification() {
  }

  public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification manufacturersArticleID(@javax.annotation.Nullable String manufacturersArticleID) {
    this.manufacturersArticleID = manufacturersArticleID;
    return this;
  }

  /**
   * Get manufacturersArticleID
   * @return manufacturersArticleID
   */
  @javax.annotation.Nullable
  public String getManufacturersArticleID() {
    return manufacturersArticleID;
  }

  public void setManufacturersArticleID(@javax.annotation.Nullable String manufacturersArticleID) {
    this.manufacturersArticleID = manufacturersArticleID;
  }


  public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification eanuccArticleID(@javax.annotation.Nullable String eanuccArticleID) {
    this.eanuccArticleID = eanuccArticleID;
    return this;
  }

  /**
   * Get eanuccArticleID
   * @return eanuccArticleID
   */
  @javax.annotation.Nullable
  public String getEanuccArticleID() {
    return eanuccArticleID;
  }

  public void setEanuccArticleID(@javax.annotation.Nullable String eanuccArticleID) {
    this.eanuccArticleID = eanuccArticleID;
  }


  public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification buyersArticleID(@javax.annotation.Nullable String buyersArticleID) {
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

  public void setBuyersArticleID(@javax.annotation.Nullable String buyersArticleID) {
    this.buyersArticleID = buyersArticleID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification edIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification = (EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification) o;
    return Objects.equals(this.manufacturersArticleID, edIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification.manufacturersArticleID) &&
        Objects.equals(this.eanuccArticleID, edIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification.eanuccArticleID) &&
        Objects.equals(this.buyersArticleID, edIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification.buyersArticleID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manufacturersArticleID, eanuccArticleID, buyersArticleID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification {\n");
    sb.append("    manufacturersArticleID: ").append(toIndentedString(manufacturersArticleID)).append("\n");
    sb.append("    eanuccArticleID: ").append(toIndentedString(eanuccArticleID)).append("\n");
    sb.append("    buyersArticleID: ").append(toIndentedString(buyersArticleID)).append("\n");
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
    openapiFields.add("manufacturersArticleID");
    openapiFields.add("eanuccArticleID");
    openapiFields.add("buyersArticleID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification is not found in the empty JSON string", EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("manufacturersArticleID") != null && !jsonObj.get("manufacturersArticleID").isJsonNull()) && !jsonObj.get("manufacturersArticleID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `manufacturersArticleID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("manufacturersArticleID").toString()));
      }
      if ((jsonObj.get("eanuccArticleID") != null && !jsonObj.get("eanuccArticleID").isJsonNull()) && !jsonObj.get("eanuccArticleID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eanuccArticleID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eanuccArticleID").toString()));
      }
      if ((jsonObj.get("buyersArticleID") != null && !jsonObj.get("buyersArticleID").isJsonNull()) && !jsonObj.get("buyersArticleID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyersArticleID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyersArticleID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification>() {
           @Override
           public void write(JsonWriter out, EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification
   */
  public static EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification.class);
  }

  /**
   * Convert an instance of EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

