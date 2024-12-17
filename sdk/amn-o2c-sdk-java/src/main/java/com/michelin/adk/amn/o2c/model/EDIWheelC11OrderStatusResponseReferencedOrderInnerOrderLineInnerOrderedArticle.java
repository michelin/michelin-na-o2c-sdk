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
import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleArticleDescription;
import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner;
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
 * EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-17T01:25:07.723106500-05:00[America/Toronto]", comments = "Generator version: 7.10.0")
public class EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle {
  public static final String SERIALIZED_NAME_ARTICLE_IDENTIFICATION = "ArticleIdentification";
  @SerializedName(SERIALIZED_NAME_ARTICLE_IDENTIFICATION)
  @javax.annotation.Nonnull
  private EDIWheelC10DesadvRequestOrderedArticleArticleIdentification articleIdentification;

  public static final String SERIALIZED_NAME_ARTICLE_DESCRIPTION = "ArticleDescription";
  @SerializedName(SERIALIZED_NAME_ARTICLE_DESCRIPTION)
  @javax.annotation.Nullable
  private EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleArticleDescription articleDescription;

  public static final String SERIALIZED_NAME_REQUESTED_DELIVERY_DATE = "RequestedDeliveryDate";
  @SerializedName(SERIALIZED_NAME_REQUESTED_DELIVERY_DATE)
  @javax.annotation.Nullable
  private String requestedDeliveryDate;

  public static final String SERIALIZED_NAME_REQUESTED_DELIVERY_TIME = "RequestedDeliveryTime";
  @SerializedName(SERIALIZED_NAME_REQUESTED_DELIVERY_TIME)
  @javax.annotation.Nullable
  private String requestedDeliveryTime;

  public static final String SERIALIZED_NAME_ARTICLE_COMMENT = "ArticleComment";
  @SerializedName(SERIALIZED_NAME_ARTICLE_COMMENT)
  @javax.annotation.Nullable
  private String articleComment;

  public static final String SERIALIZED_NAME_SCHEDULE_DETAILS = "ScheduleDetails";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_DETAILS)
  @javax.annotation.Nullable
  private List<EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner> scheduleDetails = new ArrayList<>();

  public static final String SERIALIZED_NAME_ORDERED_QUANTITY = "OrderedQuantity";
  @SerializedName(SERIALIZED_NAME_ORDERED_QUANTITY)
  @javax.annotation.Nullable
  private EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity orderedQuantity;

  public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle() {
  }

  public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle articleIdentification(@javax.annotation.Nonnull EDIWheelC10DesadvRequestOrderedArticleArticleIdentification articleIdentification) {
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

  public void setArticleIdentification(@javax.annotation.Nonnull EDIWheelC10DesadvRequestOrderedArticleArticleIdentification articleIdentification) {
    this.articleIdentification = articleIdentification;
  }


  public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle articleDescription(@javax.annotation.Nullable EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleArticleDescription articleDescription) {
    this.articleDescription = articleDescription;
    return this;
  }

  /**
   * Get articleDescription
   * @return articleDescription
   */
  @javax.annotation.Nullable
  public EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleArticleDescription getArticleDescription() {
    return articleDescription;
  }

  public void setArticleDescription(@javax.annotation.Nullable EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleArticleDescription articleDescription) {
    this.articleDescription = articleDescription;
  }


  public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle requestedDeliveryDate(@javax.annotation.Nullable String requestedDeliveryDate) {
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

  public void setRequestedDeliveryDate(@javax.annotation.Nullable String requestedDeliveryDate) {
    this.requestedDeliveryDate = requestedDeliveryDate;
  }


  public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle requestedDeliveryTime(@javax.annotation.Nullable String requestedDeliveryTime) {
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


  public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle articleComment(@javax.annotation.Nullable String articleComment) {
    this.articleComment = articleComment;
    return this;
  }

  /**
   * Get articleComment
   * @return articleComment
   */
  @javax.annotation.Nullable
  public String getArticleComment() {
    return articleComment;
  }

  public void setArticleComment(@javax.annotation.Nullable String articleComment) {
    this.articleComment = articleComment;
  }


  public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle scheduleDetails(@javax.annotation.Nullable List<EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner> scheduleDetails) {
    this.scheduleDetails = scheduleDetails;
    return this;
  }

  public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle addScheduleDetailsItem(EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner scheduleDetailsItem) {
    if (this.scheduleDetails == null) {
      this.scheduleDetails = new ArrayList<>();
    }
    this.scheduleDetails.add(scheduleDetailsItem);
    return this;
  }

  /**
   * Get scheduleDetails
   * @return scheduleDetails
   */
  @javax.annotation.Nullable
  public List<EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner> getScheduleDetails() {
    return scheduleDetails;
  }

  public void setScheduleDetails(@javax.annotation.Nullable List<EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner> scheduleDetails) {
    this.scheduleDetails = scheduleDetails;
  }


  public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle orderedQuantity(@javax.annotation.Nullable EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity orderedQuantity) {
    this.orderedQuantity = orderedQuantity;
    return this;
  }

  /**
   * Get orderedQuantity
   * @return orderedQuantity
   */
  @javax.annotation.Nullable
  public EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity getOrderedQuantity() {
    return orderedQuantity;
  }

  public void setOrderedQuantity(@javax.annotation.Nullable EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity orderedQuantity) {
    this.orderedQuantity = orderedQuantity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle edIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle = (EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle) o;
    return Objects.equals(this.articleIdentification, edIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle.articleIdentification) &&
        Objects.equals(this.articleDescription, edIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle.articleDescription) &&
        Objects.equals(this.requestedDeliveryDate, edIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle.requestedDeliveryDate) &&
        Objects.equals(this.requestedDeliveryTime, edIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle.requestedDeliveryTime) &&
        Objects.equals(this.articleComment, edIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle.articleComment) &&
        Objects.equals(this.scheduleDetails, edIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle.scheduleDetails) &&
        Objects.equals(this.orderedQuantity, edIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle.orderedQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articleIdentification, articleDescription, requestedDeliveryDate, requestedDeliveryTime, articleComment, scheduleDetails, orderedQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle {\n");
    sb.append("    articleIdentification: ").append(toIndentedString(articleIdentification)).append("\n");
    sb.append("    articleDescription: ").append(toIndentedString(articleDescription)).append("\n");
    sb.append("    requestedDeliveryDate: ").append(toIndentedString(requestedDeliveryDate)).append("\n");
    sb.append("    requestedDeliveryTime: ").append(toIndentedString(requestedDeliveryTime)).append("\n");
    sb.append("    articleComment: ").append(toIndentedString(articleComment)).append("\n");
    sb.append("    scheduleDetails: ").append(toIndentedString(scheduleDetails)).append("\n");
    sb.append("    orderedQuantity: ").append(toIndentedString(orderedQuantity)).append("\n");
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
    openapiFields.add("ArticleDescription");
    openapiFields.add("RequestedDeliveryDate");
    openapiFields.add("RequestedDeliveryTime");
    openapiFields.add("ArticleComment");
    openapiFields.add("ScheduleDetails");
    openapiFields.add("OrderedQuantity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ArticleIdentification");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle is not found in the empty JSON string", EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `ArticleIdentification`
      EDIWheelC10DesadvRequestOrderedArticleArticleIdentification.validateJsonElement(jsonObj.get("ArticleIdentification"));
      // validate the optional field `ArticleDescription`
      if (jsonObj.get("ArticleDescription") != null && !jsonObj.get("ArticleDescription").isJsonNull()) {
        EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleArticleDescription.validateJsonElement(jsonObj.get("ArticleDescription"));
      }
      if ((jsonObj.get("RequestedDeliveryDate") != null && !jsonObj.get("RequestedDeliveryDate").isJsonNull()) && !jsonObj.get("RequestedDeliveryDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RequestedDeliveryDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RequestedDeliveryDate").toString()));
      }
      if ((jsonObj.get("RequestedDeliveryTime") != null && !jsonObj.get("RequestedDeliveryTime").isJsonNull()) && !jsonObj.get("RequestedDeliveryTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RequestedDeliveryTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RequestedDeliveryTime").toString()));
      }
      if ((jsonObj.get("ArticleComment") != null && !jsonObj.get("ArticleComment").isJsonNull()) && !jsonObj.get("ArticleComment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ArticleComment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ArticleComment").toString()));
      }
      if (jsonObj.get("ScheduleDetails") != null && !jsonObj.get("ScheduleDetails").isJsonNull()) {
        JsonArray jsonArrayscheduleDetails = jsonObj.getAsJsonArray("ScheduleDetails");
        if (jsonArrayscheduleDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ScheduleDetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ScheduleDetails` to be an array in the JSON string but got `%s`", jsonObj.get("ScheduleDetails").toString()));
          }

          // validate the optional field `ScheduleDetails` (array)
          for (int i = 0; i < jsonArrayscheduleDetails.size(); i++) {
            EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner.validateJsonElement(jsonArrayscheduleDetails.get(i));
          };
        }
      }
      // validate the optional field `OrderedQuantity`
      if (jsonObj.get("OrderedQuantity") != null && !jsonObj.get("OrderedQuantity").isJsonNull()) {
        EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity.validateJsonElement(jsonObj.get("OrderedQuantity"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle>() {
           @Override
           public void write(JsonWriter out, EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle
   */
  public static EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle.class);
  }

  /**
   * Convert an instance of EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticle to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

