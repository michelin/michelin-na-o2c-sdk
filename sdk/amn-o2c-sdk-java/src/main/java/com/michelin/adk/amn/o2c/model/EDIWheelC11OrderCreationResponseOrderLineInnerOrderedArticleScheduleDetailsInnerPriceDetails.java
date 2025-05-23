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
import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetailsNetUnitPrice;
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
 * EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails {
  public static final String SERIALIZED_NAME_NET_UNIT_PRICE = "netUnitPrice";
  @SerializedName(SERIALIZED_NAME_NET_UNIT_PRICE)
  @javax.annotation.Nullable
  private EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetailsNetUnitPrice netUnitPrice;

  public EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails() {
  }

  public EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails netUnitPrice(@javax.annotation.Nullable EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetailsNetUnitPrice netUnitPrice) {
    this.netUnitPrice = netUnitPrice;
    return this;
  }

  /**
   * Get netUnitPrice
   * @return netUnitPrice
   */
  @javax.annotation.Nullable
  public EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetailsNetUnitPrice getNetUnitPrice() {
    return netUnitPrice;
  }

  public void setNetUnitPrice(@javax.annotation.Nullable EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetailsNetUnitPrice netUnitPrice) {
    this.netUnitPrice = netUnitPrice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails edIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails = (EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails) o;
    return Objects.equals(this.netUnitPrice, edIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails.netUnitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netUnitPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails {\n");
    sb.append("    netUnitPrice: ").append(toIndentedString(netUnitPrice)).append("\n");
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
    openapiFields.add("netUnitPrice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails is not found in the empty JSON string", EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `netUnitPrice`
      if (jsonObj.get("netUnitPrice") != null && !jsonObj.get("netUnitPrice").isJsonNull()) {
        EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetailsNetUnitPrice.validateJsonElement(jsonObj.get("netUnitPrice"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails>() {
           @Override
           public void write(JsonWriter out, EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails
   */
  public static EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails.class);
  }

  /**
   * Convert an instance of EDIWheelC11OrderCreationResponseOrderLineInnerOrderedArticleScheduleDetailsInnerPriceDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

