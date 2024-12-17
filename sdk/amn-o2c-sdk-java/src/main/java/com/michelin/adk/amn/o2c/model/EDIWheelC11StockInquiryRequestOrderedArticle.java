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
import com.michelin.adk.amn.o2c.model.EDIWheelC11StockInquiryRequestArticleIdentification;
import com.michelin.adk.amn.o2c.model.EDIWheelC11StockInquiryRequestRequestedQuantity;
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
 * EDIWheelC11StockInquiryRequestOrderedArticle
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-17T19:36:32.994638751Z[GMT]", comments = "Generator version: 7.10.0")
public class EDIWheelC11StockInquiryRequestOrderedArticle {
  public static final String SERIALIZED_NAME_REQUESTED_QUANTITY = "requestedQuantity";
  @SerializedName(SERIALIZED_NAME_REQUESTED_QUANTITY)
  @javax.annotation.Nonnull
  private EDIWheelC11StockInquiryRequestRequestedQuantity requestedQuantity;

  public static final String SERIALIZED_NAME_REQUESTED_DELIVERY_TIME = "requestedDeliveryTime";
  @SerializedName(SERIALIZED_NAME_REQUESTED_DELIVERY_TIME)
  @javax.annotation.Nullable
  private String requestedDeliveryTime;

  public static final String SERIALIZED_NAME_REQUESTED_DELIVERY_DATE = "requestedDeliveryDate";
  @SerializedName(SERIALIZED_NAME_REQUESTED_DELIVERY_DATE)
  @javax.annotation.Nonnull
  private String requestedDeliveryDate;

  public static final String SERIALIZED_NAME_ARTICLE_IDENTIFICATION = "articleIdentification";
  @SerializedName(SERIALIZED_NAME_ARTICLE_IDENTIFICATION)
  @javax.annotation.Nullable
  private EDIWheelC11StockInquiryRequestArticleIdentification articleIdentification;

  public EDIWheelC11StockInquiryRequestOrderedArticle() {
  }

  public EDIWheelC11StockInquiryRequestOrderedArticle requestedQuantity(@javax.annotation.Nonnull EDIWheelC11StockInquiryRequestRequestedQuantity requestedQuantity) {
    this.requestedQuantity = requestedQuantity;
    return this;
  }

  /**
   * Get requestedQuantity
   * @return requestedQuantity
   */
  @javax.annotation.Nonnull
  public EDIWheelC11StockInquiryRequestRequestedQuantity getRequestedQuantity() {
    return requestedQuantity;
  }

  public void setRequestedQuantity(@javax.annotation.Nonnull EDIWheelC11StockInquiryRequestRequestedQuantity requestedQuantity) {
    this.requestedQuantity = requestedQuantity;
  }


  public EDIWheelC11StockInquiryRequestOrderedArticle requestedDeliveryTime(@javax.annotation.Nullable String requestedDeliveryTime) {
    this.requestedDeliveryTime = requestedDeliveryTime;
    return this;
  }

  /**
   * Get requestedDeliveryTime
   * @return requestedDeliveryTime
   */
  @javax.annotation.Nullable
  public String getRequestedDeliveryTime() {
    return requestedDeliveryTime;
  }

  public void setRequestedDeliveryTime(@javax.annotation.Nullable String requestedDeliveryTime) {
    this.requestedDeliveryTime = requestedDeliveryTime;
  }


  public EDIWheelC11StockInquiryRequestOrderedArticle requestedDeliveryDate(@javax.annotation.Nonnull String requestedDeliveryDate) {
    this.requestedDeliveryDate = requestedDeliveryDate;
    return this;
  }

  /**
   * Get requestedDeliveryDate
   * @return requestedDeliveryDate
   */
  @javax.annotation.Nonnull
  public String getRequestedDeliveryDate() {
    return requestedDeliveryDate;
  }

  public void setRequestedDeliveryDate(@javax.annotation.Nonnull String requestedDeliveryDate) {
    this.requestedDeliveryDate = requestedDeliveryDate;
  }


  public EDIWheelC11StockInquiryRequestOrderedArticle articleIdentification(@javax.annotation.Nullable EDIWheelC11StockInquiryRequestArticleIdentification articleIdentification) {
    this.articleIdentification = articleIdentification;
    return this;
  }

  /**
   * Get articleIdentification
   * @return articleIdentification
   */
  @javax.annotation.Nullable
  public EDIWheelC11StockInquiryRequestArticleIdentification getArticleIdentification() {
    return articleIdentification;
  }

  public void setArticleIdentification(@javax.annotation.Nullable EDIWheelC11StockInquiryRequestArticleIdentification articleIdentification) {
    this.articleIdentification = articleIdentification;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC11StockInquiryRequestOrderedArticle edIWheelC11StockInquiryRequestOrderedArticle = (EDIWheelC11StockInquiryRequestOrderedArticle) o;
    return Objects.equals(this.requestedQuantity, edIWheelC11StockInquiryRequestOrderedArticle.requestedQuantity) &&
        Objects.equals(this.requestedDeliveryTime, edIWheelC11StockInquiryRequestOrderedArticle.requestedDeliveryTime) &&
        Objects.equals(this.requestedDeliveryDate, edIWheelC11StockInquiryRequestOrderedArticle.requestedDeliveryDate) &&
        Objects.equals(this.articleIdentification, edIWheelC11StockInquiryRequestOrderedArticle.articleIdentification);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestedQuantity, requestedDeliveryTime, requestedDeliveryDate, articleIdentification);
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
    sb.append("class EDIWheelC11StockInquiryRequestOrderedArticle {\n");
    sb.append("    requestedQuantity: ").append(toIndentedString(requestedQuantity)).append("\n");
    sb.append("    requestedDeliveryTime: ").append(toIndentedString(requestedDeliveryTime)).append("\n");
    sb.append("    requestedDeliveryDate: ").append(toIndentedString(requestedDeliveryDate)).append("\n");
    sb.append("    articleIdentification: ").append(toIndentedString(articleIdentification)).append("\n");
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
    openapiFields.add("requestedQuantity");
    openapiFields.add("requestedDeliveryTime");
    openapiFields.add("requestedDeliveryDate");
    openapiFields.add("articleIdentification");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("requestedQuantity");
    openapiRequiredFields.add("requestedDeliveryDate");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC11StockInquiryRequestOrderedArticle
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC11StockInquiryRequestOrderedArticle.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC11StockInquiryRequestOrderedArticle is not found in the empty JSON string", EDIWheelC11StockInquiryRequestOrderedArticle.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC11StockInquiryRequestOrderedArticle.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC11StockInquiryRequestOrderedArticle` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelC11StockInquiryRequestOrderedArticle.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `requestedQuantity`
      EDIWheelC11StockInquiryRequestRequestedQuantity.validateJsonElement(jsonObj.get("requestedQuantity"));
      if ((jsonObj.get("requestedDeliveryTime") != null && !jsonObj.get("requestedDeliveryTime").isJsonNull()) && !jsonObj.get("requestedDeliveryTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestedDeliveryTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestedDeliveryTime").toString()));
      }
      if (!jsonObj.get("requestedDeliveryDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestedDeliveryDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestedDeliveryDate").toString()));
      }
      // validate the optional field `articleIdentification`
      if (jsonObj.get("articleIdentification") != null && !jsonObj.get("articleIdentification").isJsonNull()) {
        EDIWheelC11StockInquiryRequestArticleIdentification.validateJsonElement(jsonObj.get("articleIdentification"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC11StockInquiryRequestOrderedArticle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC11StockInquiryRequestOrderedArticle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC11StockInquiryRequestOrderedArticle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC11StockInquiryRequestOrderedArticle.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC11StockInquiryRequestOrderedArticle>() {
           @Override
           public void write(JsonWriter out, EDIWheelC11StockInquiryRequestOrderedArticle value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC11StockInquiryRequestOrderedArticle read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC11StockInquiryRequestOrderedArticle given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC11StockInquiryRequestOrderedArticle
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC11StockInquiryRequestOrderedArticle
   */
  public static EDIWheelC11StockInquiryRequestOrderedArticle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC11StockInquiryRequestOrderedArticle.class);
  }

  /**
   * Convert an instance of EDIWheelC11StockInquiryRequestOrderedArticle to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

