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
import com.michelin.adk.amn.o2c.model.EDIWheelC10DesadvRequestOrderedArticle;
import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderStatusRequestReferencedOrderInnerSupplierOrderNumber;
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
 * EDIWheelC11OrderStatusRequestReferencedOrderInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class EDIWheelC11OrderStatusRequestReferencedOrderInner {
  public static final String SERIALIZED_NAME_SUPPLIER_ORDER_NUMBER = "SupplierOrderNumber";
  @SerializedName(SERIALIZED_NAME_SUPPLIER_ORDER_NUMBER)
  @javax.annotation.Nullable
  private EDIWheelC11OrderStatusRequestReferencedOrderInnerSupplierOrderNumber supplierOrderNumber;

  public static final String SERIALIZED_NAME_ORDER_REFERENCE = "OrderReference";
  @SerializedName(SERIALIZED_NAME_ORDER_REFERENCE)
  @javax.annotation.Nullable
  private EDIWheelC11OrderStatusRequestReferencedOrderInnerSupplierOrderNumber orderReference;

  public static final String SERIALIZED_NAME_CONTRACT = "Contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  @javax.annotation.Nullable
  private EDIWheelC11OrderStatusRequestReferencedOrderInnerSupplierOrderNumber contract;

  public static final String SERIALIZED_NAME_ORDERED_ARTICLE = "OrderedArticle";
  @SerializedName(SERIALIZED_NAME_ORDERED_ARTICLE)
  @javax.annotation.Nullable
  private EDIWheelC10DesadvRequestOrderedArticle orderedArticle;

  public EDIWheelC11OrderStatusRequestReferencedOrderInner() {
  }

  public EDIWheelC11OrderStatusRequestReferencedOrderInner supplierOrderNumber(@javax.annotation.Nullable EDIWheelC11OrderStatusRequestReferencedOrderInnerSupplierOrderNumber supplierOrderNumber) {
    this.supplierOrderNumber = supplierOrderNumber;
    return this;
  }

  /**
   * Get supplierOrderNumber
   * @return supplierOrderNumber
   */
  @javax.annotation.Nullable
  public EDIWheelC11OrderStatusRequestReferencedOrderInnerSupplierOrderNumber getSupplierOrderNumber() {
    return supplierOrderNumber;
  }

  public void setSupplierOrderNumber(@javax.annotation.Nullable EDIWheelC11OrderStatusRequestReferencedOrderInnerSupplierOrderNumber supplierOrderNumber) {
    this.supplierOrderNumber = supplierOrderNumber;
  }


  public EDIWheelC11OrderStatusRequestReferencedOrderInner orderReference(@javax.annotation.Nullable EDIWheelC11OrderStatusRequestReferencedOrderInnerSupplierOrderNumber orderReference) {
    this.orderReference = orderReference;
    return this;
  }

  /**
   * Get orderReference
   * @return orderReference
   */
  @javax.annotation.Nullable
  public EDIWheelC11OrderStatusRequestReferencedOrderInnerSupplierOrderNumber getOrderReference() {
    return orderReference;
  }

  public void setOrderReference(@javax.annotation.Nullable EDIWheelC11OrderStatusRequestReferencedOrderInnerSupplierOrderNumber orderReference) {
    this.orderReference = orderReference;
  }


  public EDIWheelC11OrderStatusRequestReferencedOrderInner contract(@javax.annotation.Nullable EDIWheelC11OrderStatusRequestReferencedOrderInnerSupplierOrderNumber contract) {
    this.contract = contract;
    return this;
  }

  /**
   * Get contract
   * @return contract
   */
  @javax.annotation.Nullable
  public EDIWheelC11OrderStatusRequestReferencedOrderInnerSupplierOrderNumber getContract() {
    return contract;
  }

  public void setContract(@javax.annotation.Nullable EDIWheelC11OrderStatusRequestReferencedOrderInnerSupplierOrderNumber contract) {
    this.contract = contract;
  }


  public EDIWheelC11OrderStatusRequestReferencedOrderInner orderedArticle(@javax.annotation.Nullable EDIWheelC10DesadvRequestOrderedArticle orderedArticle) {
    this.orderedArticle = orderedArticle;
    return this;
  }

  /**
   * Get orderedArticle
   * @return orderedArticle
   */
  @javax.annotation.Nullable
  public EDIWheelC10DesadvRequestOrderedArticle getOrderedArticle() {
    return orderedArticle;
  }

  public void setOrderedArticle(@javax.annotation.Nullable EDIWheelC10DesadvRequestOrderedArticle orderedArticle) {
    this.orderedArticle = orderedArticle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC11OrderStatusRequestReferencedOrderInner edIWheelC11OrderStatusRequestReferencedOrderInner = (EDIWheelC11OrderStatusRequestReferencedOrderInner) o;
    return Objects.equals(this.supplierOrderNumber, edIWheelC11OrderStatusRequestReferencedOrderInner.supplierOrderNumber) &&
        Objects.equals(this.orderReference, edIWheelC11OrderStatusRequestReferencedOrderInner.orderReference) &&
        Objects.equals(this.contract, edIWheelC11OrderStatusRequestReferencedOrderInner.contract) &&
        Objects.equals(this.orderedArticle, edIWheelC11OrderStatusRequestReferencedOrderInner.orderedArticle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplierOrderNumber, orderReference, contract, orderedArticle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC11OrderStatusRequestReferencedOrderInner {\n");
    sb.append("    supplierOrderNumber: ").append(toIndentedString(supplierOrderNumber)).append("\n");
    sb.append("    orderReference: ").append(toIndentedString(orderReference)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    orderedArticle: ").append(toIndentedString(orderedArticle)).append("\n");
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
    openapiFields.add("SupplierOrderNumber");
    openapiFields.add("OrderReference");
    openapiFields.add("Contract");
    openapiFields.add("OrderedArticle");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC11OrderStatusRequestReferencedOrderInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC11OrderStatusRequestReferencedOrderInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC11OrderStatusRequestReferencedOrderInner is not found in the empty JSON string", EDIWheelC11OrderStatusRequestReferencedOrderInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC11OrderStatusRequestReferencedOrderInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC11OrderStatusRequestReferencedOrderInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `SupplierOrderNumber`
      if (jsonObj.get("SupplierOrderNumber") != null && !jsonObj.get("SupplierOrderNumber").isJsonNull()) {
        EDIWheelC11OrderStatusRequestReferencedOrderInnerSupplierOrderNumber.validateJsonElement(jsonObj.get("SupplierOrderNumber"));
      }
      // validate the optional field `OrderReference`
      if (jsonObj.get("OrderReference") != null && !jsonObj.get("OrderReference").isJsonNull()) {
        EDIWheelC11OrderStatusRequestReferencedOrderInnerSupplierOrderNumber.validateJsonElement(jsonObj.get("OrderReference"));
      }
      // validate the optional field `Contract`
      if (jsonObj.get("Contract") != null && !jsonObj.get("Contract").isJsonNull()) {
        EDIWheelC11OrderStatusRequestReferencedOrderInnerSupplierOrderNumber.validateJsonElement(jsonObj.get("Contract"));
      }
      // validate the optional field `OrderedArticle`
      if (jsonObj.get("OrderedArticle") != null && !jsonObj.get("OrderedArticle").isJsonNull()) {
        EDIWheelC10DesadvRequestOrderedArticle.validateJsonElement(jsonObj.get("OrderedArticle"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC11OrderStatusRequestReferencedOrderInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC11OrderStatusRequestReferencedOrderInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC11OrderStatusRequestReferencedOrderInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC11OrderStatusRequestReferencedOrderInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC11OrderStatusRequestReferencedOrderInner>() {
           @Override
           public void write(JsonWriter out, EDIWheelC11OrderStatusRequestReferencedOrderInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC11OrderStatusRequestReferencedOrderInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC11OrderStatusRequestReferencedOrderInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC11OrderStatusRequestReferencedOrderInner
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC11OrderStatusRequestReferencedOrderInner
   */
  public static EDIWheelC11OrderStatusRequestReferencedOrderInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC11OrderStatusRequestReferencedOrderInner.class);
  }

  /**
   * Convert an instance of EDIWheelC11OrderStatusRequestReferencedOrderInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

