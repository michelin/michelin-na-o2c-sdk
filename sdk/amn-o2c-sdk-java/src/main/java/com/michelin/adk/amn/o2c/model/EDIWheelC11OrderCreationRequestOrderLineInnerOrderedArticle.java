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
import com.michelin.adk.amn.o2c.model.EDIWheelC10DesadvRequestOrderedArticleArticleIdentification;
import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity;
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
 * EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T06:44:55.014855667Z[GMT]", comments = "Generator version: 7.9.0")
public class EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle {
  public static final String SERIALIZED_NAME_ARTICLE_IDENTIFICATION = "ArticleIdentification";
  @SerializedName(SERIALIZED_NAME_ARTICLE_IDENTIFICATION)
  private EDIWheelC10DesadvRequestOrderedArticleArticleIdentification articleIdentification;

  public static final String SERIALIZED_NAME_REQUESTED_DELIVERY_DATE = "RequestedDeliveryDate";
  @SerializedName(SERIALIZED_NAME_REQUESTED_DELIVERY_DATE)
  private String requestedDeliveryDate;

  public static final String SERIALIZED_NAME_REQUESTED_DELIVERY_TIME = "RequestedDeliveryTime";
  @SerializedName(SERIALIZED_NAME_REQUESTED_DELIVERY_TIME)
  private String requestedDeliveryTime;

  public static final String SERIALIZED_NAME_REQUESTED_QUANTITY = "RequestedQuantity";
  @SerializedName(SERIALIZED_NAME_REQUESTED_QUANTITY)
  private EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity requestedQuantity;

  public EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle() {
  }

  public EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle articleIdentification(EDIWheelC10DesadvRequestOrderedArticleArticleIdentification articleIdentification) {
    this.articleIdentification = articleIdentification;
    return this;
  }

  /**
   * Get articleIdentification
   * @return articleIdentification
   */
  @javax.annotation.Nonnull
  public EDIWheelC10DesadvRequestOrderedArticleArticleIdentification getArticleIdentification() {
    return articleIdentification;
  }

  public void setArticleIdentification(EDIWheelC10DesadvRequestOrderedArticleArticleIdentification articleIdentification) {
    this.articleIdentification = articleIdentification;
  }


  public EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle requestedDeliveryDate(String requestedDeliveryDate) {
    this.requestedDeliveryDate = requestedDeliveryDate;
    return this;
  }

  /**
   * Get requestedDeliveryDate
   * @return requestedDeliveryDate
   */
  @javax.annotation.Nullable
  public String getRequestedDeliveryDate() {
    return requestedDeliveryDate;
  }

  public void setRequestedDeliveryDate(String requestedDeliveryDate) {
    this.requestedDeliveryDate = requestedDeliveryDate;
  }


  public EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle requestedDeliveryTime(String requestedDeliveryTime) {
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

  public void setRequestedDeliveryTime(String requestedDeliveryTime) {
    this.requestedDeliveryTime = requestedDeliveryTime;
  }


  public EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle requestedQuantity(EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity requestedQuantity) {
    this.requestedQuantity = requestedQuantity;
    return this;
  }

  /**
   * Get requestedQuantity
   * @return requestedQuantity
   */
  @javax.annotation.Nonnull
  public EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity getRequestedQuantity() {
    return requestedQuantity;
  }

  public void setRequestedQuantity(EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity requestedQuantity) {
    this.requestedQuantity = requestedQuantity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle edIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle = (EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle) o;
    return Objects.equals(this.articleIdentification, edIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle.articleIdentification) &&
        Objects.equals(this.requestedDeliveryDate, edIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle.requestedDeliveryDate) &&
        Objects.equals(this.requestedDeliveryTime, edIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle.requestedDeliveryTime) &&
        Objects.equals(this.requestedQuantity, edIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle.requestedQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articleIdentification, requestedDeliveryDate, requestedDeliveryTime, requestedQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle {\n");
    sb.append("    articleIdentification: ").append(toIndentedString(articleIdentification)).append("\n");
    sb.append("    requestedDeliveryDate: ").append(toIndentedString(requestedDeliveryDate)).append("\n");
    sb.append("    requestedDeliveryTime: ").append(toIndentedString(requestedDeliveryTime)).append("\n");
    sb.append("    requestedQuantity: ").append(toIndentedString(requestedQuantity)).append("\n");
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
    openapiFields.add("ArticleIdentification");
    openapiFields.add("RequestedDeliveryDate");
    openapiFields.add("RequestedDeliveryTime");
    openapiFields.add("RequestedQuantity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ArticleIdentification");
    openapiRequiredFields.add("RequestedQuantity");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle is not found in the empty JSON string", EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `ArticleIdentification`
      EDIWheelC10DesadvRequestOrderedArticleArticleIdentification.validateJsonElement(jsonObj.get("ArticleIdentification"));
      if ((jsonObj.get("RequestedDeliveryDate") != null && !jsonObj.get("RequestedDeliveryDate").isJsonNull()) && !jsonObj.get("RequestedDeliveryDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RequestedDeliveryDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RequestedDeliveryDate").toString()));
      }
      if ((jsonObj.get("RequestedDeliveryTime") != null && !jsonObj.get("RequestedDeliveryTime").isJsonNull()) && !jsonObj.get("RequestedDeliveryTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RequestedDeliveryTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RequestedDeliveryTime").toString()));
      }
      // validate the required field `RequestedQuantity`
      EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity.validateJsonElement(jsonObj.get("RequestedQuantity"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle>() {
           @Override
           public void write(JsonWriter out, EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle
   */
  public static EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle.class);
  }

  /**
   * Convert an instance of EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticle to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
