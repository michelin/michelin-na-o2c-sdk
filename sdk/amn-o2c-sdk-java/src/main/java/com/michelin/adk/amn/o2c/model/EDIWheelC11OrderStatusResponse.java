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
import com.michelin.adk.amn.o2c.model.EDIWheelC10DesadvRequestSellerParty;
import com.michelin.adk.amn.o2c.model.EDIWheelC10DesadvResponseErrorHead;
import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderCreationRequestSellerParty;
import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderStatusResponseConsignee;
import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderStatusResponseReferencedOrderInner;
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
 * EDIWheelC11OrderStatusResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-17T01:25:07.723106500-05:00[America/Toronto]", comments = "Generator version: 7.10.0")
public class EDIWheelC11OrderStatusResponse {
  public static final String SERIALIZED_NAME_DOCUMENT_I_D = "DocumentID";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_I_D)
  @javax.annotation.Nonnull
  private String documentID;

  public static final String SERIALIZED_NAME_VARIANT = "Variant";
  @SerializedName(SERIALIZED_NAME_VARIANT)
  @javax.annotation.Nullable
  private String variant;

  public static final String SERIALIZED_NAME_ORDER_DATE_FROM = "OrderDateFrom";
  @SerializedName(SERIALIZED_NAME_ORDER_DATE_FROM)
  @javax.annotation.Nullable
  private String orderDateFrom;

  public static final String SERIALIZED_NAME_ORDER_DATE_TO = "OrderDateTo";
  @SerializedName(SERIALIZED_NAME_ORDER_DATE_TO)
  @javax.annotation.Nullable
  private String orderDateTo;

  public static final String SERIALIZED_NAME_ORDER_STATUS_INDICATOR = "OrderStatusIndicator";
  @SerializedName(SERIALIZED_NAME_ORDER_STATUS_INDICATOR)
  @javax.annotation.Nullable
  private String orderStatusIndicator;

  public static final String SERIALIZED_NAME_ERROR_HEAD = "ErrorHead";
  @SerializedName(SERIALIZED_NAME_ERROR_HEAD)
  @javax.annotation.Nonnull
  private EDIWheelC10DesadvResponseErrorHead errorHead;

  public static final String SERIALIZED_NAME_BUYER_PARTY = "BuyerParty";
  @SerializedName(SERIALIZED_NAME_BUYER_PARTY)
  @javax.annotation.Nonnull
  private EDIWheelC11OrderCreationRequestSellerParty buyerParty;

  public static final String SERIALIZED_NAME_ORDERING_PARTY = "OrderingParty";
  @SerializedName(SERIALIZED_NAME_ORDERING_PARTY)
  @javax.annotation.Nullable
  private EDIWheelC10DesadvRequestSellerParty orderingParty;

  public static final String SERIALIZED_NAME_CONSIGNEE = "Consignee";
  @SerializedName(SERIALIZED_NAME_CONSIGNEE)
  @javax.annotation.Nullable
  private EDIWheelC11OrderStatusResponseConsignee consignee;

  public static final String SERIALIZED_NAME_REFERENCED_ORDER = "ReferencedOrder";
  @SerializedName(SERIALIZED_NAME_REFERENCED_ORDER)
  @javax.annotation.Nullable
  private List<EDIWheelC11OrderStatusResponseReferencedOrderInner> referencedOrder = new ArrayList<>();

  public EDIWheelC11OrderStatusResponse() {
  }

  public EDIWheelC11OrderStatusResponse documentID(@javax.annotation.Nonnull String documentID) {
    this.documentID = documentID;
    return this;
  }

  /**
   * Get documentID
   * @return documentID
   */
  @javax.annotation.Nonnull
  public String getDocumentID() {
    return documentID;
  }

  public void setDocumentID(@javax.annotation.Nonnull String documentID) {
    this.documentID = documentID;
  }


  public EDIWheelC11OrderStatusResponse variant(@javax.annotation.Nullable String variant) {
    this.variant = variant;
    return this;
  }

  /**
   * Get variant
   * @return variant
   */
  @javax.annotation.Nullable
  public String getVariant() {
    return variant;
  }

  public void setVariant(@javax.annotation.Nullable String variant) {
    this.variant = variant;
  }


  public EDIWheelC11OrderStatusResponse orderDateFrom(@javax.annotation.Nullable String orderDateFrom) {
    this.orderDateFrom = orderDateFrom;
    return this;
  }

  /**
   * Get orderDateFrom
   * @return orderDateFrom
   */
  @javax.annotation.Nullable
  public String getOrderDateFrom() {
    return orderDateFrom;
  }

  public void setOrderDateFrom(@javax.annotation.Nullable String orderDateFrom) {
    this.orderDateFrom = orderDateFrom;
  }


  public EDIWheelC11OrderStatusResponse orderDateTo(@javax.annotation.Nullable String orderDateTo) {
    this.orderDateTo = orderDateTo;
    return this;
  }

  /**
   * Get orderDateTo
   * @return orderDateTo
   */
  @javax.annotation.Nullable
  public String getOrderDateTo() {
    return orderDateTo;
  }

  public void setOrderDateTo(@javax.annotation.Nullable String orderDateTo) {
    this.orderDateTo = orderDateTo;
  }


  public EDIWheelC11OrderStatusResponse orderStatusIndicator(@javax.annotation.Nullable String orderStatusIndicator) {
    this.orderStatusIndicator = orderStatusIndicator;
    return this;
  }

  /**
   * Get orderStatusIndicator
   * @return orderStatusIndicator
   */
  @javax.annotation.Nullable
  public String getOrderStatusIndicator() {
    return orderStatusIndicator;
  }

  public void setOrderStatusIndicator(@javax.annotation.Nullable String orderStatusIndicator) {
    this.orderStatusIndicator = orderStatusIndicator;
  }


  public EDIWheelC11OrderStatusResponse errorHead(@javax.annotation.Nonnull EDIWheelC10DesadvResponseErrorHead errorHead) {
    this.errorHead = errorHead;
    return this;
  }

  /**
   * Get errorHead
   * @return errorHead
   */
  @javax.annotation.Nonnull
  public EDIWheelC10DesadvResponseErrorHead getErrorHead() {
    return errorHead;
  }

  public void setErrorHead(@javax.annotation.Nonnull EDIWheelC10DesadvResponseErrorHead errorHead) {
    this.errorHead = errorHead;
  }


  public EDIWheelC11OrderStatusResponse buyerParty(@javax.annotation.Nonnull EDIWheelC11OrderCreationRequestSellerParty buyerParty) {
    this.buyerParty = buyerParty;
    return this;
  }

  /**
   * Get buyerParty
   * @return buyerParty
   */
  @javax.annotation.Nonnull
  public EDIWheelC11OrderCreationRequestSellerParty getBuyerParty() {
    return buyerParty;
  }

  public void setBuyerParty(@javax.annotation.Nonnull EDIWheelC11OrderCreationRequestSellerParty buyerParty) {
    this.buyerParty = buyerParty;
  }


  public EDIWheelC11OrderStatusResponse orderingParty(@javax.annotation.Nullable EDIWheelC10DesadvRequestSellerParty orderingParty) {
    this.orderingParty = orderingParty;
    return this;
  }

  /**
   * Get orderingParty
   * @return orderingParty
   */
  @javax.annotation.Nullable
  public EDIWheelC10DesadvRequestSellerParty getOrderingParty() {
    return orderingParty;
  }

  public void setOrderingParty(@javax.annotation.Nullable EDIWheelC10DesadvRequestSellerParty orderingParty) {
    this.orderingParty = orderingParty;
  }


  public EDIWheelC11OrderStatusResponse consignee(@javax.annotation.Nullable EDIWheelC11OrderStatusResponseConsignee consignee) {
    this.consignee = consignee;
    return this;
  }

  /**
   * Get consignee
   * @return consignee
   */
  @javax.annotation.Nullable
  public EDIWheelC11OrderStatusResponseConsignee getConsignee() {
    return consignee;
  }

  public void setConsignee(@javax.annotation.Nullable EDIWheelC11OrderStatusResponseConsignee consignee) {
    this.consignee = consignee;
  }


  public EDIWheelC11OrderStatusResponse referencedOrder(@javax.annotation.Nullable List<EDIWheelC11OrderStatusResponseReferencedOrderInner> referencedOrder) {
    this.referencedOrder = referencedOrder;
    return this;
  }

  public EDIWheelC11OrderStatusResponse addReferencedOrderItem(EDIWheelC11OrderStatusResponseReferencedOrderInner referencedOrderItem) {
    if (this.referencedOrder == null) {
      this.referencedOrder = new ArrayList<>();
    }
    this.referencedOrder.add(referencedOrderItem);
    return this;
  }

  /**
   * Get referencedOrder
   * @return referencedOrder
   */
  @javax.annotation.Nullable
  public List<EDIWheelC11OrderStatusResponseReferencedOrderInner> getReferencedOrder() {
    return referencedOrder;
  }

  public void setReferencedOrder(@javax.annotation.Nullable List<EDIWheelC11OrderStatusResponseReferencedOrderInner> referencedOrder) {
    this.referencedOrder = referencedOrder;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC11OrderStatusResponse edIWheelC11OrderStatusResponse = (EDIWheelC11OrderStatusResponse) o;
    return Objects.equals(this.documentID, edIWheelC11OrderStatusResponse.documentID) &&
        Objects.equals(this.variant, edIWheelC11OrderStatusResponse.variant) &&
        Objects.equals(this.orderDateFrom, edIWheelC11OrderStatusResponse.orderDateFrom) &&
        Objects.equals(this.orderDateTo, edIWheelC11OrderStatusResponse.orderDateTo) &&
        Objects.equals(this.orderStatusIndicator, edIWheelC11OrderStatusResponse.orderStatusIndicator) &&
        Objects.equals(this.errorHead, edIWheelC11OrderStatusResponse.errorHead) &&
        Objects.equals(this.buyerParty, edIWheelC11OrderStatusResponse.buyerParty) &&
        Objects.equals(this.orderingParty, edIWheelC11OrderStatusResponse.orderingParty) &&
        Objects.equals(this.consignee, edIWheelC11OrderStatusResponse.consignee) &&
        Objects.equals(this.referencedOrder, edIWheelC11OrderStatusResponse.referencedOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentID, variant, orderDateFrom, orderDateTo, orderStatusIndicator, errorHead, buyerParty, orderingParty, consignee, referencedOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC11OrderStatusResponse {\n");
    sb.append("    documentID: ").append(toIndentedString(documentID)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    orderDateFrom: ").append(toIndentedString(orderDateFrom)).append("\n");
    sb.append("    orderDateTo: ").append(toIndentedString(orderDateTo)).append("\n");
    sb.append("    orderStatusIndicator: ").append(toIndentedString(orderStatusIndicator)).append("\n");
    sb.append("    errorHead: ").append(toIndentedString(errorHead)).append("\n");
    sb.append("    buyerParty: ").append(toIndentedString(buyerParty)).append("\n");
    sb.append("    orderingParty: ").append(toIndentedString(orderingParty)).append("\n");
    sb.append("    consignee: ").append(toIndentedString(consignee)).append("\n");
    sb.append("    referencedOrder: ").append(toIndentedString(referencedOrder)).append("\n");
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
    openapiFields.add("DocumentID");
    openapiFields.add("Variant");
    openapiFields.add("OrderDateFrom");
    openapiFields.add("OrderDateTo");
    openapiFields.add("OrderStatusIndicator");
    openapiFields.add("ErrorHead");
    openapiFields.add("BuyerParty");
    openapiFields.add("OrderingParty");
    openapiFields.add("Consignee");
    openapiFields.add("ReferencedOrder");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("DocumentID");
    openapiRequiredFields.add("ErrorHead");
    openapiRequiredFields.add("BuyerParty");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC11OrderStatusResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC11OrderStatusResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC11OrderStatusResponse is not found in the empty JSON string", EDIWheelC11OrderStatusResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC11OrderStatusResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC11OrderStatusResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelC11OrderStatusResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("DocumentID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DocumentID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DocumentID").toString()));
      }
      if ((jsonObj.get("Variant") != null && !jsonObj.get("Variant").isJsonNull()) && !jsonObj.get("Variant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Variant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Variant").toString()));
      }
      if ((jsonObj.get("OrderDateFrom") != null && !jsonObj.get("OrderDateFrom").isJsonNull()) && !jsonObj.get("OrderDateFrom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OrderDateFrom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OrderDateFrom").toString()));
      }
      if ((jsonObj.get("OrderDateTo") != null && !jsonObj.get("OrderDateTo").isJsonNull()) && !jsonObj.get("OrderDateTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OrderDateTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OrderDateTo").toString()));
      }
      if ((jsonObj.get("OrderStatusIndicator") != null && !jsonObj.get("OrderStatusIndicator").isJsonNull()) && !jsonObj.get("OrderStatusIndicator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OrderStatusIndicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OrderStatusIndicator").toString()));
      }
      // validate the required field `ErrorHead`
      EDIWheelC10DesadvResponseErrorHead.validateJsonElement(jsonObj.get("ErrorHead"));
      // validate the required field `BuyerParty`
      EDIWheelC11OrderCreationRequestSellerParty.validateJsonElement(jsonObj.get("BuyerParty"));
      // validate the optional field `OrderingParty`
      if (jsonObj.get("OrderingParty") != null && !jsonObj.get("OrderingParty").isJsonNull()) {
        EDIWheelC10DesadvRequestSellerParty.validateJsonElement(jsonObj.get("OrderingParty"));
      }
      // validate the optional field `Consignee`
      if (jsonObj.get("Consignee") != null && !jsonObj.get("Consignee").isJsonNull()) {
        EDIWheelC11OrderStatusResponseConsignee.validateJsonElement(jsonObj.get("Consignee"));
      }
      if (jsonObj.get("ReferencedOrder") != null && !jsonObj.get("ReferencedOrder").isJsonNull()) {
        JsonArray jsonArrayreferencedOrder = jsonObj.getAsJsonArray("ReferencedOrder");
        if (jsonArrayreferencedOrder != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ReferencedOrder").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ReferencedOrder` to be an array in the JSON string but got `%s`", jsonObj.get("ReferencedOrder").toString()));
          }

          // validate the optional field `ReferencedOrder` (array)
          for (int i = 0; i < jsonArrayreferencedOrder.size(); i++) {
            EDIWheelC11OrderStatusResponseReferencedOrderInner.validateJsonElement(jsonArrayreferencedOrder.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC11OrderStatusResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC11OrderStatusResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC11OrderStatusResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC11OrderStatusResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC11OrderStatusResponse>() {
           @Override
           public void write(JsonWriter out, EDIWheelC11OrderStatusResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC11OrderStatusResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC11OrderStatusResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC11OrderStatusResponse
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC11OrderStatusResponse
   */
  public static EDIWheelC11OrderStatusResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC11OrderStatusResponse.class);
  }

  /**
   * Convert an instance of EDIWheelC11OrderStatusResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

