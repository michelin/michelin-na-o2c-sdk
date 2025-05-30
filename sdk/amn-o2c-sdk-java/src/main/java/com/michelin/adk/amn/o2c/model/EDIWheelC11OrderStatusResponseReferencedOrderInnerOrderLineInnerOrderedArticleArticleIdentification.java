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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification {
  public static final String SERIALIZED_NAME_BUYERS_ARTICLE_ID = "buyersArticleId";
  @SerializedName(SERIALIZED_NAME_BUYERS_ARTICLE_ID)
  @javax.annotation.Nullable
  private String buyersArticleId;

  public static final String SERIALIZED_NAME_MANUFACTURERS_ARTICLE_ID = "manufacturersArticleId";
  @SerializedName(SERIALIZED_NAME_MANUFACTURERS_ARTICLE_ID)
  @javax.annotation.Nullable
  private String manufacturersArticleId;

  public static final String SERIALIZED_NAME_EANUCCARTICLE_I_D = "eanuccarticleID";
  @SerializedName(SERIALIZED_NAME_EANUCCARTICLE_I_D)
  @javax.annotation.Nullable
  private String eanuccarticleID;

  public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification() {
  }

  public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification buyersArticleId(@javax.annotation.Nullable String buyersArticleId) {
    this.buyersArticleId = buyersArticleId;
    return this;
  }

  /**
   * Customer part number of product (where applicable)
   * @return buyersArticleId
   */
  @javax.annotation.Nullable
  public String getBuyersArticleId() {
    return buyersArticleId;
  }

  public void setBuyersArticleId(@javax.annotation.Nullable String buyersArticleId) {
    this.buyersArticleId = buyersArticleId;
  }


  public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification manufacturersArticleId(@javax.annotation.Nullable String manufacturersArticleId) {
    this.manufacturersArticleId = manufacturersArticleId;
    return this;
  }

  /**
   * Michelin part number of product (5 digit value)
   * @return manufacturersArticleId
   */
  @javax.annotation.Nullable
  public String getManufacturersArticleId() {
    return manufacturersArticleId;
  }

  public void setManufacturersArticleId(@javax.annotation.Nullable String manufacturersArticleId) {
    this.manufacturersArticleId = manufacturersArticleId;
  }


  public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification eanuccarticleID(@javax.annotation.Nullable String eanuccarticleID) {
    this.eanuccarticleID = eanuccarticleID;
    return this;
  }

  /**
   * Get eanuccarticleID
   * @return eanuccarticleID
   */
  @javax.annotation.Nullable
  public String getEanuccarticleID() {
    return eanuccarticleID;
  }

  public void setEanuccarticleID(@javax.annotation.Nullable String eanuccarticleID) {
    this.eanuccarticleID = eanuccarticleID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification edIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification = (EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification) o;
    return Objects.equals(this.buyersArticleId, edIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification.buyersArticleId) &&
        Objects.equals(this.manufacturersArticleId, edIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification.manufacturersArticleId) &&
        Objects.equals(this.eanuccarticleID, edIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification.eanuccarticleID);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyersArticleId, manufacturersArticleId, eanuccarticleID);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification {\n");
    sb.append("    buyersArticleId: ").append(toIndentedString(buyersArticleId)).append("\n");
    sb.append("    manufacturersArticleId: ").append(toIndentedString(manufacturersArticleId)).append("\n");
    sb.append("    eanuccarticleID: ").append(toIndentedString(eanuccarticleID)).append("\n");
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
    openapiFields.add("eanuccarticleID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification is not found in the empty JSON string", EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("buyersArticleId") != null && !jsonObj.get("buyersArticleId").isJsonNull()) && !jsonObj.get("buyersArticleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyersArticleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyersArticleId").toString()));
      }
      if ((jsonObj.get("manufacturersArticleId") != null && !jsonObj.get("manufacturersArticleId").isJsonNull()) && !jsonObj.get("manufacturersArticleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `manufacturersArticleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("manufacturersArticleId").toString()));
      }
      if ((jsonObj.get("eanuccarticleID") != null && !jsonObj.get("eanuccarticleID").isJsonNull()) && !jsonObj.get("eanuccarticleID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eanuccarticleID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eanuccarticleID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification>() {
           @Override
           public void write(JsonWriter out, EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification
   */
  public static EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification.class);
  }

  /**
   * Convert an instance of EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleArticleIdentification to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

