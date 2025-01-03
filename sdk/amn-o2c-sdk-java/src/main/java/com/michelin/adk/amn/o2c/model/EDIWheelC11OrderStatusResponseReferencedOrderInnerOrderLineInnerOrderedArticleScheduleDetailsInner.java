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
import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity;
import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInnerScheduledArticleDespatchDetails;
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
 * EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner {
  public static final String SERIALIZED_NAME_DELIVERY_DATE = "DeliveryDate";
  @SerializedName(SERIALIZED_NAME_DELIVERY_DATE)
  @javax.annotation.Nullable
  private String deliveryDate;

  public static final String SERIALIZED_NAME_DELIVERY_TIME = "DeliveryTime";
  @SerializedName(SERIALIZED_NAME_DELIVERY_TIME)
  @javax.annotation.Nullable
  private String deliveryTime;

  public static final String SERIALIZED_NAME_CONFIRMED_QUANTITY = "ConfirmedQuantity";
  @SerializedName(SERIALIZED_NAME_CONFIRMED_QUANTITY)
  @javax.annotation.Nullable
  private EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity confirmedQuantity;

  public static final String SERIALIZED_NAME_CANCELLED_QUANTITY = "CancelledQuantity";
  @SerializedName(SERIALIZED_NAME_CANCELLED_QUANTITY)
  @javax.annotation.Nullable
  private EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity cancelledQuantity;

  public static final String SERIALIZED_NAME_OPEN_QUANTITY = "OpenQuantity";
  @SerializedName(SERIALIZED_NAME_OPEN_QUANTITY)
  @javax.annotation.Nullable
  private EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity openQuantity;

  public static final String SERIALIZED_NAME_SCHEDULED_ARTICLE_DESPATCH_DETAILS = "ScheduledArticleDespatchDetails";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_ARTICLE_DESPATCH_DETAILS)
  @javax.annotation.Nullable
  private EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInnerScheduledArticleDespatchDetails scheduledArticleDespatchDetails;

  public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner() {
  }

  public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner deliveryDate(@javax.annotation.Nullable String deliveryDate) {
    this.deliveryDate = deliveryDate;
    return this;
  }

  /**
   * Get deliveryDate
   * @return deliveryDate
   */
  @javax.annotation.Nullable
  public String getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(@javax.annotation.Nullable String deliveryDate) {
    this.deliveryDate = deliveryDate;
  }


  public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner deliveryTime(@javax.annotation.Nullable String deliveryTime) {
    this.deliveryTime = deliveryTime;
    return this;
  }

  /**
   * Get deliveryTime
   * @return deliveryTime
   */
  @javax.annotation.Nullable
  public String getDeliveryTime() {
    return deliveryTime;
  }

  public void setDeliveryTime(@javax.annotation.Nullable String deliveryTime) {
    this.deliveryTime = deliveryTime;
  }


  public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner confirmedQuantity(@javax.annotation.Nullable EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity confirmedQuantity) {
    this.confirmedQuantity = confirmedQuantity;
    return this;
  }

  /**
   * Get confirmedQuantity
   * @return confirmedQuantity
   */
  @javax.annotation.Nullable
  public EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity getConfirmedQuantity() {
    return confirmedQuantity;
  }

  public void setConfirmedQuantity(@javax.annotation.Nullable EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity confirmedQuantity) {
    this.confirmedQuantity = confirmedQuantity;
  }


  public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner cancelledQuantity(@javax.annotation.Nullable EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity cancelledQuantity) {
    this.cancelledQuantity = cancelledQuantity;
    return this;
  }

  /**
   * Get cancelledQuantity
   * @return cancelledQuantity
   */
  @javax.annotation.Nullable
  public EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity getCancelledQuantity() {
    return cancelledQuantity;
  }

  public void setCancelledQuantity(@javax.annotation.Nullable EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity cancelledQuantity) {
    this.cancelledQuantity = cancelledQuantity;
  }


  public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner openQuantity(@javax.annotation.Nullable EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity openQuantity) {
    this.openQuantity = openQuantity;
    return this;
  }

  /**
   * Get openQuantity
   * @return openQuantity
   */
  @javax.annotation.Nullable
  public EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity getOpenQuantity() {
    return openQuantity;
  }

  public void setOpenQuantity(@javax.annotation.Nullable EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity openQuantity) {
    this.openQuantity = openQuantity;
  }


  public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner scheduledArticleDespatchDetails(@javax.annotation.Nullable EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInnerScheduledArticleDespatchDetails scheduledArticleDespatchDetails) {
    this.scheduledArticleDespatchDetails = scheduledArticleDespatchDetails;
    return this;
  }

  /**
   * Get scheduledArticleDespatchDetails
   * @return scheduledArticleDespatchDetails
   */
  @javax.annotation.Nullable
  public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInnerScheduledArticleDespatchDetails getScheduledArticleDespatchDetails() {
    return scheduledArticleDespatchDetails;
  }

  public void setScheduledArticleDespatchDetails(@javax.annotation.Nullable EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInnerScheduledArticleDespatchDetails scheduledArticleDespatchDetails) {
    this.scheduledArticleDespatchDetails = scheduledArticleDespatchDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner edIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner = (EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner) o;
    return Objects.equals(this.deliveryDate, edIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner.deliveryDate) &&
        Objects.equals(this.deliveryTime, edIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner.deliveryTime) &&
        Objects.equals(this.confirmedQuantity, edIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner.confirmedQuantity) &&
        Objects.equals(this.cancelledQuantity, edIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner.cancelledQuantity) &&
        Objects.equals(this.openQuantity, edIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner.openQuantity) &&
        Objects.equals(this.scheduledArticleDespatchDetails, edIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner.scheduledArticleDespatchDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryDate, deliveryTime, confirmedQuantity, cancelledQuantity, openQuantity, scheduledArticleDespatchDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner {\n");
    sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
    sb.append("    deliveryTime: ").append(toIndentedString(deliveryTime)).append("\n");
    sb.append("    confirmedQuantity: ").append(toIndentedString(confirmedQuantity)).append("\n");
    sb.append("    cancelledQuantity: ").append(toIndentedString(cancelledQuantity)).append("\n");
    sb.append("    openQuantity: ").append(toIndentedString(openQuantity)).append("\n");
    sb.append("    scheduledArticleDespatchDetails: ").append(toIndentedString(scheduledArticleDespatchDetails)).append("\n");
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
    openapiFields.add("DeliveryDate");
    openapiFields.add("DeliveryTime");
    openapiFields.add("ConfirmedQuantity");
    openapiFields.add("CancelledQuantity");
    openapiFields.add("OpenQuantity");
    openapiFields.add("ScheduledArticleDespatchDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner is not found in the empty JSON string", EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("DeliveryDate") != null && !jsonObj.get("DeliveryDate").isJsonNull()) && !jsonObj.get("DeliveryDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DeliveryDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DeliveryDate").toString()));
      }
      if ((jsonObj.get("DeliveryTime") != null && !jsonObj.get("DeliveryTime").isJsonNull()) && !jsonObj.get("DeliveryTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DeliveryTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DeliveryTime").toString()));
      }
      // validate the optional field `ConfirmedQuantity`
      if (jsonObj.get("ConfirmedQuantity") != null && !jsonObj.get("ConfirmedQuantity").isJsonNull()) {
        EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity.validateJsonElement(jsonObj.get("ConfirmedQuantity"));
      }
      // validate the optional field `CancelledQuantity`
      if (jsonObj.get("CancelledQuantity") != null && !jsonObj.get("CancelledQuantity").isJsonNull()) {
        EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity.validateJsonElement(jsonObj.get("CancelledQuantity"));
      }
      // validate the optional field `OpenQuantity`
      if (jsonObj.get("OpenQuantity") != null && !jsonObj.get("OpenQuantity").isJsonNull()) {
        EDIWheelC11OrderCreationRequestOrderLineInnerOrderedArticleRequestedQuantity.validateJsonElement(jsonObj.get("OpenQuantity"));
      }
      // validate the optional field `ScheduledArticleDespatchDetails`
      if (jsonObj.get("ScheduledArticleDespatchDetails") != null && !jsonObj.get("ScheduledArticleDespatchDetails").isJsonNull()) {
        EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInnerScheduledArticleDespatchDetails.validateJsonElement(jsonObj.get("ScheduledArticleDespatchDetails"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner>() {
           @Override
           public void write(JsonWriter out, EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner
   */
  public static EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner.class);
  }

  /**
   * Convert an instance of EDIWheelC11OrderStatusResponseReferencedOrderInnerOrderLineInnerOrderedArticleScheduleDetailsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

