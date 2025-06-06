/*
 * Michelin North America Order-to-Cash APIs
 * These APIs will help you to do business transactions with Michelin.  <br><br><b>Authentication details:</b><br> <br><u>Option A:</u> OAuth2 Client Credentials (recommended) <br><u>Option B:</u> API Key + Basic Authentication (not recommended) <br><br>To request your access, please contact your representative. <br><br>Our services are based on the EDIWHEEL standards. <br>You can find more information on the <a href=\"https://www.ediwheel.com/\" target=\"_blank\">EDIWHEEL website</a>. 
 *
 * The version of the OpenAPI document: 1.0.1
 * 
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
 * EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification {
  public static final String SERIALIZED_NAME_BUYERS_ARTICLE_ID = "buyersArticleId";
  @SerializedName(SERIALIZED_NAME_BUYERS_ARTICLE_ID)
  @javax.annotation.Nullable
  private String buyersArticleId;

  public static final String SERIALIZED_NAME_MANUFACTURERS_ARTICLE_ID = "manufacturersArticleId";
  @SerializedName(SERIALIZED_NAME_MANUFACTURERS_ARTICLE_ID)
  @javax.annotation.Nullable
  private String manufacturersArticleId;

  public EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification() {
  }

  public EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification buyersArticleId(@javax.annotation.Nullable String buyersArticleId) {
    this.buyersArticleId = buyersArticleId;
    return this;
  }

  /**
   * Customer part number (CPN). &lt;br&gt; IF CPN is to be used, a cross reference must exist within the Michelin system between the Michelin part number and the customer part number. &lt;br&gt; If manufacturersArticleId is being used, this value is not required. &lt;br&gt; Max characters allowed &#x3D; 17.
   * @return buyersArticleId
   */
  @javax.annotation.Nullable
  public String getBuyersArticleId() {
    return buyersArticleId;
  }

  public void setBuyersArticleId(@javax.annotation.Nullable String buyersArticleId) {
    this.buyersArticleId = buyersArticleId;
  }


  public EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification manufacturersArticleId(@javax.annotation.Nullable String manufacturersArticleId) {
    this.manufacturersArticleId = manufacturersArticleId;
    return this;
  }

  /**
   * Part number (Michelin 5 digit MSPN).&lt;br&gt; If buyersArticleId is being used, this value is not required.
   * @return manufacturersArticleId
   */
  @javax.annotation.Nullable
  public String getManufacturersArticleId() {
    return manufacturersArticleId;
  }

  public void setManufacturersArticleId(@javax.annotation.Nullable String manufacturersArticleId) {
    this.manufacturersArticleId = manufacturersArticleId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification edIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification = (EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification) o;
    return Objects.equals(this.buyersArticleId, edIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification.buyersArticleId) &&
        Objects.equals(this.manufacturersArticleId, edIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification.manufacturersArticleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyersArticleId, manufacturersArticleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification {\n");
    sb.append("    buyersArticleId: ").append(toIndentedString(buyersArticleId)).append("\n");
    sb.append("    manufacturersArticleId: ").append(toIndentedString(manufacturersArticleId)).append("\n");
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
    openapiFields.add("buyersArticleId");
    openapiFields.add("manufacturersArticleId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification is not found in the empty JSON string", EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("buyersArticleId") != null && !jsonObj.get("buyersArticleId").isJsonNull()) && !jsonObj.get("buyersArticleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyersArticleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyersArticleId").toString()));
      }
      if ((jsonObj.get("manufacturersArticleId") != null && !jsonObj.get("manufacturersArticleId").isJsonNull()) && !jsonObj.get("manufacturersArticleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `manufacturersArticleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("manufacturersArticleId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification>() {
           @Override
           public void write(JsonWriter out, EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification
   */
  public static EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification.class);
  }

  /**
   * Convert an instance of EDIWheelC11OrderCreationRequestAllOfOrderedArticleArticleIdentification to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

