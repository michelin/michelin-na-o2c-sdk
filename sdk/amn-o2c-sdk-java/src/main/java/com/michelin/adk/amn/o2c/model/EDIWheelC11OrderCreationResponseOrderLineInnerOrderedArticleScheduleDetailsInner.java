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
import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInner;
import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerConfirmedQuantity;
import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails;
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
 * EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner {
  public static final String SERIALIZED_NAME_DELIVERY_DATE = "deliveryDate";
  @SerializedName(SERIALIZED_NAME_DELIVERY_DATE)
  @javax.annotation.Nullable
  private String deliveryDate;

  public static final String SERIALIZED_NAME_CONFIRMED_QUANTITY = "confirmedQuantity";
  @SerializedName(SERIALIZED_NAME_CONFIRMED_QUANTITY)
  @javax.annotation.Nullable
  private EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerConfirmedQuantity confirmedQuantity;

  public static final String SERIALIZED_NAME_PRICE_DETAILS = "priceDetails";
  @SerializedName(SERIALIZED_NAME_PRICE_DETAILS)
  @javax.annotation.Nullable
  private EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails priceDetails;

  public static final String SERIALIZED_NAME_CHARGE = "charge";
  @SerializedName(SERIALIZED_NAME_CHARGE)
  @javax.annotation.Nullable
  private List<EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInner> charge = new ArrayList<>();

  public EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner() {
  }

  public EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner deliveryDate(@javax.annotation.Nullable String deliveryDate) {
    this.deliveryDate = deliveryDate;
    return this;
  }

  /**
   * Expected delivery date.
   * @return deliveryDate
   */
  @javax.annotation.Nullable
  public String getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(@javax.annotation.Nullable String deliveryDate) {
    this.deliveryDate = deliveryDate;
  }


  public EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner confirmedQuantity(@javax.annotation.Nullable EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerConfirmedQuantity confirmedQuantity) {
    this.confirmedQuantity = confirmedQuantity;
    return this;
  }

  /**
   * Get confirmedQuantity
   * @return confirmedQuantity
   */
  @javax.annotation.Nullable
  public EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerConfirmedQuantity getConfirmedQuantity() {
    return confirmedQuantity;
  }

  public void setConfirmedQuantity(@javax.annotation.Nullable EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerConfirmedQuantity confirmedQuantity) {
    this.confirmedQuantity = confirmedQuantity;
  }


  public EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner priceDetails(@javax.annotation.Nullable EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails priceDetails) {
    this.priceDetails = priceDetails;
    return this;
  }

  /**
   * Get priceDetails
   * @return priceDetails
   */
  @javax.annotation.Nullable
  public EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails getPriceDetails() {
    return priceDetails;
  }

  public void setPriceDetails(@javax.annotation.Nullable EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails priceDetails) {
    this.priceDetails = priceDetails;
  }


  public EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner charge(@javax.annotation.Nullable List<EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInner> charge) {
    this.charge = charge;
    return this;
  }

  public EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner addChargeItem(EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInner chargeItem) {
    if (this.charge == null) {
      this.charge = new ArrayList<>();
    }
    this.charge.add(chargeItem);
    return this;
  }

  /**
   * Get charge
   * @return charge
   */
  @javax.annotation.Nullable
  public List<EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInner> getCharge() {
    return charge;
  }

  public void setCharge(@javax.annotation.Nullable List<EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInner> charge) {
    this.charge = charge;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner edIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner = (EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner) o;
    return Objects.equals(this.deliveryDate, edIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner.deliveryDate) &&
        Objects.equals(this.confirmedQuantity, edIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner.confirmedQuantity) &&
        Objects.equals(this.priceDetails, edIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner.priceDetails) &&
        Objects.equals(this.charge, edIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner.charge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryDate, confirmedQuantity, priceDetails, charge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner {\n");
    sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
    sb.append("    confirmedQuantity: ").append(toIndentedString(confirmedQuantity)).append("\n");
    sb.append("    priceDetails: ").append(toIndentedString(priceDetails)).append("\n");
    sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
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
    openapiFields.add("deliveryDate");
    openapiFields.add("confirmedQuantity");
    openapiFields.add("priceDetails");
    openapiFields.add("charge");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner is not found in the empty JSON string", EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("deliveryDate") != null && !jsonObj.get("deliveryDate").isJsonNull()) && !jsonObj.get("deliveryDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliveryDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveryDate").toString()));
      }
      // validate the optional field `confirmedQuantity`
      if (jsonObj.get("confirmedQuantity") != null && !jsonObj.get("confirmedQuantity").isJsonNull()) {
        EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerConfirmedQuantity.validateJsonElement(jsonObj.get("confirmedQuantity"));
      }
      // validate the optional field `priceDetails`
      if (jsonObj.get("priceDetails") != null && !jsonObj.get("priceDetails").isJsonNull()) {
        EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails.validateJsonElement(jsonObj.get("priceDetails"));
      }
      if (jsonObj.get("charge") != null && !jsonObj.get("charge").isJsonNull()) {
        JsonArray jsonArraycharge = jsonObj.getAsJsonArray("charge");
        if (jsonArraycharge != null) {
          // ensure the json data is an array
          if (!jsonObj.get("charge").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `charge` to be an array in the JSON string but got `%s`", jsonObj.get("charge").toString()));
          }

          // validate the optional field `charge` (array)
          for (int i = 0; i < jsonArraycharge.size(); i++) {
            EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerChargeInner.validateJsonElement(jsonArraycharge.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner>() {
           @Override
           public void write(JsonWriter out, EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner
   */
  public static EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner.class);
  }

  /**
   * Convert an instance of EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

