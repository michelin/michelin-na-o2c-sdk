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
import com.michelin.adk.amn.o2c.model.EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticle;
import com.michelin.adk.amn.o2c.model.EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerReferences;
import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderCreationResponseChargeChargeAmount;
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
 * EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T06:44:55.014855667Z[GMT]", comments = "Generator version: 7.9.0")
public class EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner {
  public static final String SERIALIZED_NAME_LINE_I_D = "LineID";
  @SerializedName(SERIALIZED_NAME_LINE_I_D)
  private String lineID;

  public static final String SERIALIZED_NAME_ORDERING_METHOD = "OrderingMethod";
  @SerializedName(SERIALIZED_NAME_ORDERING_METHOD)
  private String orderingMethod;

  public static final String SERIALIZED_NAME_REFERENCES = "References";
  @SerializedName(SERIALIZED_NAME_REFERENCES)
  private EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerReferences references;

  public static final String SERIALIZED_NAME_LINE_ITEM_NET_AMOUNT = "LineItemNetAmount";
  @SerializedName(SERIALIZED_NAME_LINE_ITEM_NET_AMOUNT)
  private EDIWheelC11OrderCreationResponseChargeChargeAmount lineItemNetAmount;

  public static final String SERIALIZED_NAME_ARTICLE = "Article";
  @SerializedName(SERIALIZED_NAME_ARTICLE)
  private EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticle article;

  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner() {
  }

  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner lineID(String lineID) {
    this.lineID = lineID;
    return this;
  }

  /**
   * Get lineID
   * @return lineID
   */
  @javax.annotation.Nonnull
  public String getLineID() {
    return lineID;
  }

  public void setLineID(String lineID) {
    this.lineID = lineID;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner orderingMethod(String orderingMethod) {
    this.orderingMethod = orderingMethod;
    return this;
  }

  /**
   * Get orderingMethod
   * @return orderingMethod
   */
  @javax.annotation.Nullable
  public String getOrderingMethod() {
    return orderingMethod;
  }

  public void setOrderingMethod(String orderingMethod) {
    this.orderingMethod = orderingMethod;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner references(EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerReferences references) {
    this.references = references;
    return this;
  }

  /**
   * Get references
   * @return references
   */
  @javax.annotation.Nullable
  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerReferences getReferences() {
    return references;
  }

  public void setReferences(EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerReferences references) {
    this.references = references;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner lineItemNetAmount(EDIWheelC11OrderCreationResponseChargeChargeAmount lineItemNetAmount) {
    this.lineItemNetAmount = lineItemNetAmount;
    return this;
  }

  /**
   * Get lineItemNetAmount
   * @return lineItemNetAmount
   */
  @javax.annotation.Nonnull
  public EDIWheelC11OrderCreationResponseChargeChargeAmount getLineItemNetAmount() {
    return lineItemNetAmount;
  }

  public void setLineItemNetAmount(EDIWheelC11OrderCreationResponseChargeChargeAmount lineItemNetAmount) {
    this.lineItemNetAmount = lineItemNetAmount;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner article(EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticle article) {
    this.article = article;
    return this;
  }

  /**
   * Get article
   * @return article
   */
  @javax.annotation.Nonnull
  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticle getArticle() {
    return article;
  }

  public void setArticle(EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticle article) {
    this.article = article;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner = (EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner) o;
    return Objects.equals(this.lineID, edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner.lineID) &&
        Objects.equals(this.orderingMethod, edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner.orderingMethod) &&
        Objects.equals(this.references, edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner.references) &&
        Objects.equals(this.lineItemNetAmount, edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner.lineItemNetAmount) &&
        Objects.equals(this.article, edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner.article);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineID, orderingMethod, references, lineItemNetAmount, article);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner {\n");
    sb.append("    lineID: ").append(toIndentedString(lineID)).append("\n");
    sb.append("    orderingMethod: ").append(toIndentedString(orderingMethod)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    lineItemNetAmount: ").append(toIndentedString(lineItemNetAmount)).append("\n");
    sb.append("    article: ").append(toIndentedString(article)).append("\n");
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
    openapiFields.add("LineID");
    openapiFields.add("OrderingMethod");
    openapiFields.add("References");
    openapiFields.add("LineItemNetAmount");
    openapiFields.add("Article");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("LineID");
    openapiRequiredFields.add("LineItemNetAmount");
    openapiRequiredFields.add("Article");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner is not found in the empty JSON string", EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("LineID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LineID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LineID").toString()));
      }
      if ((jsonObj.get("OrderingMethod") != null && !jsonObj.get("OrderingMethod").isJsonNull()) && !jsonObj.get("OrderingMethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OrderingMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OrderingMethod").toString()));
      }
      // validate the optional field `References`
      if (jsonObj.get("References") != null && !jsonObj.get("References").isJsonNull()) {
        EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerReferences.validateJsonElement(jsonObj.get("References"));
      }
      // validate the required field `LineItemNetAmount`
      EDIWheelC11OrderCreationResponseChargeChargeAmount.validateJsonElement(jsonObj.get("LineItemNetAmount"));
      // validate the required field `Article`
      EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticle.validateJsonElement(jsonObj.get("Article"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner>() {
           @Override
           public void write(JsonWriter out, EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner
   * @throws IOException if the JSON string is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner
   */
  public static EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner.class);
  }

  /**
   * Convert an instance of EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
