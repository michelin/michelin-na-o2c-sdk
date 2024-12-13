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
import com.michelin.adk.amn.o2c.model.EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleDescription;
import com.michelin.adk.amn.o2c.model.EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification;
import com.michelin.adk.amn.o2c.model.EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleError;
import com.michelin.adk.amn.o2c.model.EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleRequestedQuantity;
import com.michelin.adk.amn.o2c.model.EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInner;
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
 * EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T06:44:55.014855667Z[GMT]", comments = "Generator version: 7.9.0")
public class EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle {
  public static final String SERIALIZED_NAME_ARTICLE_IDENTIFICATION = "articleIdentification";
  @SerializedName(SERIALIZED_NAME_ARTICLE_IDENTIFICATION)
  private EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification articleIdentification;

  public static final String SERIALIZED_NAME_ARTICLE_DESCRIPTION = "articleDescription";
  @SerializedName(SERIALIZED_NAME_ARTICLE_DESCRIPTION)
  private EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleDescription articleDescription;

  public static final String SERIALIZED_NAME_AVAILABILITY = "availability";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY)
  private String availability;

  public static final String SERIALIZED_NAME_REQUESTED_QUANTITY = "requestedQuantity";
  @SerializedName(SERIALIZED_NAME_REQUESTED_QUANTITY)
  private EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleRequestedQuantity requestedQuantity;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleError error;

  public static final String SERIALIZED_NAME_REQUESTED_DELIVERY_TIME = "requestedDeliveryTime";
  @SerializedName(SERIALIZED_NAME_REQUESTED_DELIVERY_TIME)
  private String requestedDeliveryTime;

  public static final String SERIALIZED_NAME_REQUESTED_DELIVERY_DATE = "requestedDeliveryDate";
  @SerializedName(SERIALIZED_NAME_REQUESTED_DELIVERY_DATE)
  private String requestedDeliveryDate;

  public static final String SERIALIZED_NAME_SCHEDULE_DETAILS = "scheduleDetails";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_DETAILS)
  private List<EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInner> scheduleDetails = new ArrayList<>();

  public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle() {
  }

  public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle articleIdentification(EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification articleIdentification) {
    this.articleIdentification = articleIdentification;
    return this;
  }

  /**
   * Get articleIdentification
   * @return articleIdentification
   */
  @javax.annotation.Nullable
  public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification getArticleIdentification() {
    return articleIdentification;
  }

  public void setArticleIdentification(EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification articleIdentification) {
    this.articleIdentification = articleIdentification;
  }


  public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle articleDescription(EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleDescription articleDescription) {
    this.articleDescription = articleDescription;
    return this;
  }

  /**
   * Get articleDescription
   * @return articleDescription
   */
  @javax.annotation.Nullable
  public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleDescription getArticleDescription() {
    return articleDescription;
  }

  public void setArticleDescription(EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleDescription articleDescription) {
    this.articleDescription = articleDescription;
  }


  public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle availability(String availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Get availability
   * @return availability
   */
  @javax.annotation.Nullable
  public String getAvailability() {
    return availability;
  }

  public void setAvailability(String availability) {
    this.availability = availability;
  }


  public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle requestedQuantity(EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleRequestedQuantity requestedQuantity) {
    this.requestedQuantity = requestedQuantity;
    return this;
  }

  /**
   * Get requestedQuantity
   * @return requestedQuantity
   */
  @javax.annotation.Nullable
  public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleRequestedQuantity getRequestedQuantity() {
    return requestedQuantity;
  }

  public void setRequestedQuantity(EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleRequestedQuantity requestedQuantity) {
    this.requestedQuantity = requestedQuantity;
  }


  public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle error(EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleError error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @javax.annotation.Nullable
  public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleError getError() {
    return error;
  }

  public void setError(EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleError error) {
    this.error = error;
  }


  public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle requestedDeliveryTime(String requestedDeliveryTime) {
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


  public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle requestedDeliveryDate(String requestedDeliveryDate) {
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


  public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle scheduleDetails(List<EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInner> scheduleDetails) {
    this.scheduleDetails = scheduleDetails;
    return this;
  }

  public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle addScheduleDetailsItem(EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInner scheduleDetailsItem) {
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
  public List<EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInner> getScheduleDetails() {
    return scheduleDetails;
  }

  public void setScheduleDetails(List<EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInner> scheduleDetails) {
    this.scheduleDetails = scheduleDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle edIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle = (EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle) o;
    return Objects.equals(this.articleIdentification, edIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle.articleIdentification) &&
        Objects.equals(this.articleDescription, edIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle.articleDescription) &&
        Objects.equals(this.availability, edIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle.availability) &&
        Objects.equals(this.requestedQuantity, edIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle.requestedQuantity) &&
        Objects.equals(this.error, edIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle.error) &&
        Objects.equals(this.requestedDeliveryTime, edIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle.requestedDeliveryTime) &&
        Objects.equals(this.requestedDeliveryDate, edIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle.requestedDeliveryDate) &&
        Objects.equals(this.scheduleDetails, edIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle.scheduleDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articleIdentification, articleDescription, availability, requestedQuantity, error, requestedDeliveryTime, requestedDeliveryDate, scheduleDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle {\n");
    sb.append("    articleIdentification: ").append(toIndentedString(articleIdentification)).append("\n");
    sb.append("    articleDescription: ").append(toIndentedString(articleDescription)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    requestedQuantity: ").append(toIndentedString(requestedQuantity)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    requestedDeliveryTime: ").append(toIndentedString(requestedDeliveryTime)).append("\n");
    sb.append("    requestedDeliveryDate: ").append(toIndentedString(requestedDeliveryDate)).append("\n");
    sb.append("    scheduleDetails: ").append(toIndentedString(scheduleDetails)).append("\n");
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
    openapiFields.add("articleIdentification");
    openapiFields.add("articleDescription");
    openapiFields.add("availability");
    openapiFields.add("requestedQuantity");
    openapiFields.add("error");
    openapiFields.add("requestedDeliveryTime");
    openapiFields.add("requestedDeliveryDate");
    openapiFields.add("scheduleDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle is not found in the empty JSON string", EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `articleIdentification`
      if (jsonObj.get("articleIdentification") != null && !jsonObj.get("articleIdentification").isJsonNull()) {
        EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleIdentification.validateJsonElement(jsonObj.get("articleIdentification"));
      }
      // validate the optional field `articleDescription`
      if (jsonObj.get("articleDescription") != null && !jsonObj.get("articleDescription").isJsonNull()) {
        EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleArticleDescription.validateJsonElement(jsonObj.get("articleDescription"));
      }
      if ((jsonObj.get("availability") != null && !jsonObj.get("availability").isJsonNull()) && !jsonObj.get("availability").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `availability` to be a primitive type in the JSON string but got `%s`", jsonObj.get("availability").toString()));
      }
      // validate the optional field `requestedQuantity`
      if (jsonObj.get("requestedQuantity") != null && !jsonObj.get("requestedQuantity").isJsonNull()) {
        EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleRequestedQuantity.validateJsonElement(jsonObj.get("requestedQuantity"));
      }
      // validate the optional field `error`
      if (jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) {
        EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleError.validateJsonElement(jsonObj.get("error"));
      }
      if ((jsonObj.get("requestedDeliveryTime") != null && !jsonObj.get("requestedDeliveryTime").isJsonNull()) && !jsonObj.get("requestedDeliveryTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestedDeliveryTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestedDeliveryTime").toString()));
      }
      if ((jsonObj.get("requestedDeliveryDate") != null && !jsonObj.get("requestedDeliveryDate").isJsonNull()) && !jsonObj.get("requestedDeliveryDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestedDeliveryDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestedDeliveryDate").toString()));
      }
      if (jsonObj.get("scheduleDetails") != null && !jsonObj.get("scheduleDetails").isJsonNull()) {
        JsonArray jsonArrayscheduleDetails = jsonObj.getAsJsonArray("scheduleDetails");
        if (jsonArrayscheduleDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("scheduleDetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `scheduleDetails` to be an array in the JSON string but got `%s`", jsonObj.get("scheduleDetails").toString()));
          }

          // validate the optional field `scheduleDetails` (array)
          for (int i = 0; i < jsonArrayscheduleDetails.size(); i++) {
            EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticleScheduleDetailsInner.validateJsonElement(jsonArrayscheduleDetails.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle>() {
           @Override
           public void write(JsonWriter out, EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle
   */
  public static EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle.class);
  }

  /**
   * Convert an instance of EDIWheelC11StockInquiryResponseOrderLineInnerOrderedArticle to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
