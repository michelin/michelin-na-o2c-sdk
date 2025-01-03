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
import com.michelin.adk.amn.o2c.model.EDIWheelC10DesadvResponseDesadvInnerConsignee;
import com.michelin.adk.amn.o2c.model.EDIWheelC10DesadvResponseDesadvInnerLineLevelInner;
import com.michelin.adk.amn.o2c.model.EDIWheelC10DesadvResponseDesadvInnerMeasures;
import com.michelin.adk.amn.o2c.model.EDIWheelC10DesadvResponseDesadvInnerReferencesInner;
import com.michelin.adk.amn.o2c.model.EDIWheelC10DesadvResponseDesadvInnerSupplierParty;
import com.michelin.adk.amn.o2c.model.EDIWheelC10DesadvResponseDesadvInnerTotalQuantity;
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
 * EDIWheelC10DesadvResponseDesadvInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class EDIWheelC10DesadvResponseDesadvInner {
  public static final String SERIALIZED_NAME_ISSUE_DATE = "IssueDate";
  @SerializedName(SERIALIZED_NAME_ISSUE_DATE)
  @javax.annotation.Nonnull
  private String issueDate;

  public static final String SERIALIZED_NAME_DOCUMENT_NUMBER = "DocumentNumber";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_NUMBER)
  @javax.annotation.Nonnull
  private String documentNumber;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE_CODE = "DocumentTypeCode";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE_CODE)
  @javax.annotation.Nonnull
  private String documentTypeCode;

  public static final String SERIALIZED_NAME_MEASURES = "Measures";
  @SerializedName(SERIALIZED_NAME_MEASURES)
  @javax.annotation.Nullable
  private EDIWheelC10DesadvResponseDesadvInnerMeasures measures;

  public static final String SERIALIZED_NAME_DESPATCH_DATE = "DespatchDate";
  @SerializedName(SERIALIZED_NAME_DESPATCH_DATE)
  @javax.annotation.Nonnull
  private String despatchDate;

  public static final String SERIALIZED_NAME_ARRIVAL_DATE = "ArrivalDate";
  @SerializedName(SERIALIZED_NAME_ARRIVAL_DATE)
  @javax.annotation.Nonnull
  private String arrivalDate;

  public static final String SERIALIZED_NAME_ARRIVAL_TIME = "ArrivalTime";
  @SerializedName(SERIALIZED_NAME_ARRIVAL_TIME)
  @javax.annotation.Nullable
  private String arrivalTime;

  public static final String SERIALIZED_NAME_DELIVERY_OPTION = "DeliveryOption";
  @SerializedName(SERIALIZED_NAME_DELIVERY_OPTION)
  @javax.annotation.Nullable
  private List<String> deliveryOption = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_QUANTITY = "TotalQuantity";
  @SerializedName(SERIALIZED_NAME_TOTAL_QUANTITY)
  @javax.annotation.Nullable
  private EDIWheelC10DesadvResponseDesadvInnerTotalQuantity totalQuantity;

  public static final String SERIALIZED_NAME_REFERENCES = "References";
  @SerializedName(SERIALIZED_NAME_REFERENCES)
  @javax.annotation.Nonnull
  private List<EDIWheelC10DesadvResponseDesadvInnerReferencesInner> references = new ArrayList<>();

  public static final String SERIALIZED_NAME_BUYER_PARTY = "BuyerParty";
  @SerializedName(SERIALIZED_NAME_BUYER_PARTY)
  @javax.annotation.Nonnull
  private EDIWheelC10DesadvRequestSellerParty buyerParty;

  public static final String SERIALIZED_NAME_SUPPLIER_PARTY = "SupplierParty";
  @SerializedName(SERIALIZED_NAME_SUPPLIER_PARTY)
  @javax.annotation.Nullable
  private EDIWheelC10DesadvResponseDesadvInnerSupplierParty supplierParty;

  public static final String SERIALIZED_NAME_ORDERING_PARTY = "OrderingParty";
  @SerializedName(SERIALIZED_NAME_ORDERING_PARTY)
  @javax.annotation.Nullable
  private EDIWheelC10DesadvRequestSellerParty orderingParty;

  public static final String SERIALIZED_NAME_CONSIGNEE = "Consignee";
  @SerializedName(SERIALIZED_NAME_CONSIGNEE)
  @javax.annotation.Nonnull
  private EDIWheelC10DesadvResponseDesadvInnerConsignee consignee;

  public static final String SERIALIZED_NAME_SELLER_PARTY = "SellerParty";
  @SerializedName(SERIALIZED_NAME_SELLER_PARTY)
  @javax.annotation.Nullable
  private EDIWheelC10DesadvRequestSellerParty sellerParty;

  public static final String SERIALIZED_NAME_CARRIER_PARTY = "CarrierParty";
  @SerializedName(SERIALIZED_NAME_CARRIER_PARTY)
  @javax.annotation.Nullable
  private EDIWheelC10DesadvRequestSellerParty carrierParty;

  public static final String SERIALIZED_NAME_LINE_LEVEL = "LineLevel";
  @SerializedName(SERIALIZED_NAME_LINE_LEVEL)
  @javax.annotation.Nullable
  private List<EDIWheelC10DesadvResponseDesadvInnerLineLevelInner> lineLevel = new ArrayList<>();

  public EDIWheelC10DesadvResponseDesadvInner() {
  }

  public EDIWheelC10DesadvResponseDesadvInner issueDate(@javax.annotation.Nonnull String issueDate) {
    this.issueDate = issueDate;
    return this;
  }

  /**
   * Get issueDate
   * @return issueDate
   */
  @javax.annotation.Nonnull
  public String getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(@javax.annotation.Nonnull String issueDate) {
    this.issueDate = issueDate;
  }


  public EDIWheelC10DesadvResponseDesadvInner documentNumber(@javax.annotation.Nonnull String documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

  /**
   * Get documentNumber
   * @return documentNumber
   */
  @javax.annotation.Nonnull
  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(@javax.annotation.Nonnull String documentNumber) {
    this.documentNumber = documentNumber;
  }


  public EDIWheelC10DesadvResponseDesadvInner documentTypeCode(@javax.annotation.Nonnull String documentTypeCode) {
    this.documentTypeCode = documentTypeCode;
    return this;
  }

  /**
   * Get documentTypeCode
   * @return documentTypeCode
   */
  @javax.annotation.Nonnull
  public String getDocumentTypeCode() {
    return documentTypeCode;
  }

  public void setDocumentTypeCode(@javax.annotation.Nonnull String documentTypeCode) {
    this.documentTypeCode = documentTypeCode;
  }


  public EDIWheelC10DesadvResponseDesadvInner measures(@javax.annotation.Nullable EDIWheelC10DesadvResponseDesadvInnerMeasures measures) {
    this.measures = measures;
    return this;
  }

  /**
   * Get measures
   * @return measures
   */
  @javax.annotation.Nullable
  public EDIWheelC10DesadvResponseDesadvInnerMeasures getMeasures() {
    return measures;
  }

  public void setMeasures(@javax.annotation.Nullable EDIWheelC10DesadvResponseDesadvInnerMeasures measures) {
    this.measures = measures;
  }


  public EDIWheelC10DesadvResponseDesadvInner despatchDate(@javax.annotation.Nonnull String despatchDate) {
    this.despatchDate = despatchDate;
    return this;
  }

  /**
   * Get despatchDate
   * @return despatchDate
   */
  @javax.annotation.Nonnull
  public String getDespatchDate() {
    return despatchDate;
  }

  public void setDespatchDate(@javax.annotation.Nonnull String despatchDate) {
    this.despatchDate = despatchDate;
  }


  public EDIWheelC10DesadvResponseDesadvInner arrivalDate(@javax.annotation.Nonnull String arrivalDate) {
    this.arrivalDate = arrivalDate;
    return this;
  }

  /**
   * Get arrivalDate
   * @return arrivalDate
   */
  @javax.annotation.Nonnull
  public String getArrivalDate() {
    return arrivalDate;
  }

  public void setArrivalDate(@javax.annotation.Nonnull String arrivalDate) {
    this.arrivalDate = arrivalDate;
  }


  public EDIWheelC10DesadvResponseDesadvInner arrivalTime(@javax.annotation.Nullable String arrivalTime) {
    this.arrivalTime = arrivalTime;
    return this;
  }

  /**
   * Get arrivalTime
   * @return arrivalTime
   */
  @javax.annotation.Nullable
  public String getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(@javax.annotation.Nullable String arrivalTime) {
    this.arrivalTime = arrivalTime;
  }


  public EDIWheelC10DesadvResponseDesadvInner deliveryOption(@javax.annotation.Nullable List<String> deliveryOption) {
    this.deliveryOption = deliveryOption;
    return this;
  }

  public EDIWheelC10DesadvResponseDesadvInner addDeliveryOptionItem(String deliveryOptionItem) {
    if (this.deliveryOption == null) {
      this.deliveryOption = new ArrayList<>();
    }
    this.deliveryOption.add(deliveryOptionItem);
    return this;
  }

  /**
   * Get deliveryOption
   * @return deliveryOption
   */
  @javax.annotation.Nullable
  public List<String> getDeliveryOption() {
    return deliveryOption;
  }

  public void setDeliveryOption(@javax.annotation.Nullable List<String> deliveryOption) {
    this.deliveryOption = deliveryOption;
  }


  public EDIWheelC10DesadvResponseDesadvInner totalQuantity(@javax.annotation.Nullable EDIWheelC10DesadvResponseDesadvInnerTotalQuantity totalQuantity) {
    this.totalQuantity = totalQuantity;
    return this;
  }

  /**
   * Get totalQuantity
   * @return totalQuantity
   */
  @javax.annotation.Nullable
  public EDIWheelC10DesadvResponseDesadvInnerTotalQuantity getTotalQuantity() {
    return totalQuantity;
  }

  public void setTotalQuantity(@javax.annotation.Nullable EDIWheelC10DesadvResponseDesadvInnerTotalQuantity totalQuantity) {
    this.totalQuantity = totalQuantity;
  }


  public EDIWheelC10DesadvResponseDesadvInner references(@javax.annotation.Nonnull List<EDIWheelC10DesadvResponseDesadvInnerReferencesInner> references) {
    this.references = references;
    return this;
  }

  public EDIWheelC10DesadvResponseDesadvInner addReferencesItem(EDIWheelC10DesadvResponseDesadvInnerReferencesInner referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<>();
    }
    this.references.add(referencesItem);
    return this;
  }

  /**
   * Get references
   * @return references
   */
  @javax.annotation.Nonnull
  public List<EDIWheelC10DesadvResponseDesadvInnerReferencesInner> getReferences() {
    return references;
  }

  public void setReferences(@javax.annotation.Nonnull List<EDIWheelC10DesadvResponseDesadvInnerReferencesInner> references) {
    this.references = references;
  }


  public EDIWheelC10DesadvResponseDesadvInner buyerParty(@javax.annotation.Nonnull EDIWheelC10DesadvRequestSellerParty buyerParty) {
    this.buyerParty = buyerParty;
    return this;
  }

  /**
   * Get buyerParty
   * @return buyerParty
   */
  @javax.annotation.Nonnull
  public EDIWheelC10DesadvRequestSellerParty getBuyerParty() {
    return buyerParty;
  }

  public void setBuyerParty(@javax.annotation.Nonnull EDIWheelC10DesadvRequestSellerParty buyerParty) {
    this.buyerParty = buyerParty;
  }


  public EDIWheelC10DesadvResponseDesadvInner supplierParty(@javax.annotation.Nullable EDIWheelC10DesadvResponseDesadvInnerSupplierParty supplierParty) {
    this.supplierParty = supplierParty;
    return this;
  }

  /**
   * Get supplierParty
   * @return supplierParty
   */
  @javax.annotation.Nullable
  public EDIWheelC10DesadvResponseDesadvInnerSupplierParty getSupplierParty() {
    return supplierParty;
  }

  public void setSupplierParty(@javax.annotation.Nullable EDIWheelC10DesadvResponseDesadvInnerSupplierParty supplierParty) {
    this.supplierParty = supplierParty;
  }


  public EDIWheelC10DesadvResponseDesadvInner orderingParty(@javax.annotation.Nullable EDIWheelC10DesadvRequestSellerParty orderingParty) {
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


  public EDIWheelC10DesadvResponseDesadvInner consignee(@javax.annotation.Nonnull EDIWheelC10DesadvResponseDesadvInnerConsignee consignee) {
    this.consignee = consignee;
    return this;
  }

  /**
   * Get consignee
   * @return consignee
   */
  @javax.annotation.Nonnull
  public EDIWheelC10DesadvResponseDesadvInnerConsignee getConsignee() {
    return consignee;
  }

  public void setConsignee(@javax.annotation.Nonnull EDIWheelC10DesadvResponseDesadvInnerConsignee consignee) {
    this.consignee = consignee;
  }


  public EDIWheelC10DesadvResponseDesadvInner sellerParty(@javax.annotation.Nullable EDIWheelC10DesadvRequestSellerParty sellerParty) {
    this.sellerParty = sellerParty;
    return this;
  }

  /**
   * Get sellerParty
   * @return sellerParty
   */
  @javax.annotation.Nullable
  public EDIWheelC10DesadvRequestSellerParty getSellerParty() {
    return sellerParty;
  }

  public void setSellerParty(@javax.annotation.Nullable EDIWheelC10DesadvRequestSellerParty sellerParty) {
    this.sellerParty = sellerParty;
  }


  public EDIWheelC10DesadvResponseDesadvInner carrierParty(@javax.annotation.Nullable EDIWheelC10DesadvRequestSellerParty carrierParty) {
    this.carrierParty = carrierParty;
    return this;
  }

  /**
   * Get carrierParty
   * @return carrierParty
   */
  @javax.annotation.Nullable
  public EDIWheelC10DesadvRequestSellerParty getCarrierParty() {
    return carrierParty;
  }

  public void setCarrierParty(@javax.annotation.Nullable EDIWheelC10DesadvRequestSellerParty carrierParty) {
    this.carrierParty = carrierParty;
  }


  public EDIWheelC10DesadvResponseDesadvInner lineLevel(@javax.annotation.Nullable List<EDIWheelC10DesadvResponseDesadvInnerLineLevelInner> lineLevel) {
    this.lineLevel = lineLevel;
    return this;
  }

  public EDIWheelC10DesadvResponseDesadvInner addLineLevelItem(EDIWheelC10DesadvResponseDesadvInnerLineLevelInner lineLevelItem) {
    if (this.lineLevel == null) {
      this.lineLevel = new ArrayList<>();
    }
    this.lineLevel.add(lineLevelItem);
    return this;
  }

  /**
   * Get lineLevel
   * @return lineLevel
   */
  @javax.annotation.Nullable
  public List<EDIWheelC10DesadvResponseDesadvInnerLineLevelInner> getLineLevel() {
    return lineLevel;
  }

  public void setLineLevel(@javax.annotation.Nullable List<EDIWheelC10DesadvResponseDesadvInnerLineLevelInner> lineLevel) {
    this.lineLevel = lineLevel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC10DesadvResponseDesadvInner edIWheelC10DesadvResponseDesadvInner = (EDIWheelC10DesadvResponseDesadvInner) o;
    return Objects.equals(this.issueDate, edIWheelC10DesadvResponseDesadvInner.issueDate) &&
        Objects.equals(this.documentNumber, edIWheelC10DesadvResponseDesadvInner.documentNumber) &&
        Objects.equals(this.documentTypeCode, edIWheelC10DesadvResponseDesadvInner.documentTypeCode) &&
        Objects.equals(this.measures, edIWheelC10DesadvResponseDesadvInner.measures) &&
        Objects.equals(this.despatchDate, edIWheelC10DesadvResponseDesadvInner.despatchDate) &&
        Objects.equals(this.arrivalDate, edIWheelC10DesadvResponseDesadvInner.arrivalDate) &&
        Objects.equals(this.arrivalTime, edIWheelC10DesadvResponseDesadvInner.arrivalTime) &&
        Objects.equals(this.deliveryOption, edIWheelC10DesadvResponseDesadvInner.deliveryOption) &&
        Objects.equals(this.totalQuantity, edIWheelC10DesadvResponseDesadvInner.totalQuantity) &&
        Objects.equals(this.references, edIWheelC10DesadvResponseDesadvInner.references) &&
        Objects.equals(this.buyerParty, edIWheelC10DesadvResponseDesadvInner.buyerParty) &&
        Objects.equals(this.supplierParty, edIWheelC10DesadvResponseDesadvInner.supplierParty) &&
        Objects.equals(this.orderingParty, edIWheelC10DesadvResponseDesadvInner.orderingParty) &&
        Objects.equals(this.consignee, edIWheelC10DesadvResponseDesadvInner.consignee) &&
        Objects.equals(this.sellerParty, edIWheelC10DesadvResponseDesadvInner.sellerParty) &&
        Objects.equals(this.carrierParty, edIWheelC10DesadvResponseDesadvInner.carrierParty) &&
        Objects.equals(this.lineLevel, edIWheelC10DesadvResponseDesadvInner.lineLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueDate, documentNumber, documentTypeCode, measures, despatchDate, arrivalDate, arrivalTime, deliveryOption, totalQuantity, references, buyerParty, supplierParty, orderingParty, consignee, sellerParty, carrierParty, lineLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC10DesadvResponseDesadvInner {\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    documentTypeCode: ").append(toIndentedString(documentTypeCode)).append("\n");
    sb.append("    measures: ").append(toIndentedString(measures)).append("\n");
    sb.append("    despatchDate: ").append(toIndentedString(despatchDate)).append("\n");
    sb.append("    arrivalDate: ").append(toIndentedString(arrivalDate)).append("\n");
    sb.append("    arrivalTime: ").append(toIndentedString(arrivalTime)).append("\n");
    sb.append("    deliveryOption: ").append(toIndentedString(deliveryOption)).append("\n");
    sb.append("    totalQuantity: ").append(toIndentedString(totalQuantity)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    buyerParty: ").append(toIndentedString(buyerParty)).append("\n");
    sb.append("    supplierParty: ").append(toIndentedString(supplierParty)).append("\n");
    sb.append("    orderingParty: ").append(toIndentedString(orderingParty)).append("\n");
    sb.append("    consignee: ").append(toIndentedString(consignee)).append("\n");
    sb.append("    sellerParty: ").append(toIndentedString(sellerParty)).append("\n");
    sb.append("    carrierParty: ").append(toIndentedString(carrierParty)).append("\n");
    sb.append("    lineLevel: ").append(toIndentedString(lineLevel)).append("\n");
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
    openapiFields.add("IssueDate");
    openapiFields.add("DocumentNumber");
    openapiFields.add("DocumentTypeCode");
    openapiFields.add("Measures");
    openapiFields.add("DespatchDate");
    openapiFields.add("ArrivalDate");
    openapiFields.add("ArrivalTime");
    openapiFields.add("DeliveryOption");
    openapiFields.add("TotalQuantity");
    openapiFields.add("References");
    openapiFields.add("BuyerParty");
    openapiFields.add("SupplierParty");
    openapiFields.add("OrderingParty");
    openapiFields.add("Consignee");
    openapiFields.add("SellerParty");
    openapiFields.add("CarrierParty");
    openapiFields.add("LineLevel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("IssueDate");
    openapiRequiredFields.add("DocumentNumber");
    openapiRequiredFields.add("DocumentTypeCode");
    openapiRequiredFields.add("DespatchDate");
    openapiRequiredFields.add("ArrivalDate");
    openapiRequiredFields.add("References");
    openapiRequiredFields.add("BuyerParty");
    openapiRequiredFields.add("Consignee");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC10DesadvResponseDesadvInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC10DesadvResponseDesadvInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC10DesadvResponseDesadvInner is not found in the empty JSON string", EDIWheelC10DesadvResponseDesadvInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC10DesadvResponseDesadvInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC10DesadvResponseDesadvInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelC10DesadvResponseDesadvInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("IssueDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IssueDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IssueDate").toString()));
      }
      if (!jsonObj.get("DocumentNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DocumentNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DocumentNumber").toString()));
      }
      if (!jsonObj.get("DocumentTypeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DocumentTypeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DocumentTypeCode").toString()));
      }
      // validate the optional field `Measures`
      if (jsonObj.get("Measures") != null && !jsonObj.get("Measures").isJsonNull()) {
        EDIWheelC10DesadvResponseDesadvInnerMeasures.validateJsonElement(jsonObj.get("Measures"));
      }
      if (!jsonObj.get("DespatchDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DespatchDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DespatchDate").toString()));
      }
      if (!jsonObj.get("ArrivalDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ArrivalDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ArrivalDate").toString()));
      }
      if ((jsonObj.get("ArrivalTime") != null && !jsonObj.get("ArrivalTime").isJsonNull()) && !jsonObj.get("ArrivalTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ArrivalTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ArrivalTime").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("DeliveryOption") != null && !jsonObj.get("DeliveryOption").isJsonNull() && !jsonObj.get("DeliveryOption").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `DeliveryOption` to be an array in the JSON string but got `%s`", jsonObj.get("DeliveryOption").toString()));
      }
      // validate the optional field `TotalQuantity`
      if (jsonObj.get("TotalQuantity") != null && !jsonObj.get("TotalQuantity").isJsonNull()) {
        EDIWheelC10DesadvResponseDesadvInnerTotalQuantity.validateJsonElement(jsonObj.get("TotalQuantity"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("References").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `References` to be an array in the JSON string but got `%s`", jsonObj.get("References").toString()));
      }

      JsonArray jsonArrayreferences = jsonObj.getAsJsonArray("References");
      // validate the required field `References` (array)
      for (int i = 0; i < jsonArrayreferences.size(); i++) {
        EDIWheelC10DesadvResponseDesadvInnerReferencesInner.validateJsonElement(jsonArrayreferences.get(i));
      };
      // validate the required field `BuyerParty`
      EDIWheelC10DesadvRequestSellerParty.validateJsonElement(jsonObj.get("BuyerParty"));
      // validate the optional field `SupplierParty`
      if (jsonObj.get("SupplierParty") != null && !jsonObj.get("SupplierParty").isJsonNull()) {
        EDIWheelC10DesadvResponseDesadvInnerSupplierParty.validateJsonElement(jsonObj.get("SupplierParty"));
      }
      // validate the optional field `OrderingParty`
      if (jsonObj.get("OrderingParty") != null && !jsonObj.get("OrderingParty").isJsonNull()) {
        EDIWheelC10DesadvRequestSellerParty.validateJsonElement(jsonObj.get("OrderingParty"));
      }
      // validate the required field `Consignee`
      EDIWheelC10DesadvResponseDesadvInnerConsignee.validateJsonElement(jsonObj.get("Consignee"));
      // validate the optional field `SellerParty`
      if (jsonObj.get("SellerParty") != null && !jsonObj.get("SellerParty").isJsonNull()) {
        EDIWheelC10DesadvRequestSellerParty.validateJsonElement(jsonObj.get("SellerParty"));
      }
      // validate the optional field `CarrierParty`
      if (jsonObj.get("CarrierParty") != null && !jsonObj.get("CarrierParty").isJsonNull()) {
        EDIWheelC10DesadvRequestSellerParty.validateJsonElement(jsonObj.get("CarrierParty"));
      }
      if (jsonObj.get("LineLevel") != null && !jsonObj.get("LineLevel").isJsonNull()) {
        JsonArray jsonArraylineLevel = jsonObj.getAsJsonArray("LineLevel");
        if (jsonArraylineLevel != null) {
          // ensure the json data is an array
          if (!jsonObj.get("LineLevel").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `LineLevel` to be an array in the JSON string but got `%s`", jsonObj.get("LineLevel").toString()));
          }

          // validate the optional field `LineLevel` (array)
          for (int i = 0; i < jsonArraylineLevel.size(); i++) {
            EDIWheelC10DesadvResponseDesadvInnerLineLevelInner.validateJsonElement(jsonArraylineLevel.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC10DesadvResponseDesadvInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC10DesadvResponseDesadvInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC10DesadvResponseDesadvInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC10DesadvResponseDesadvInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC10DesadvResponseDesadvInner>() {
           @Override
           public void write(JsonWriter out, EDIWheelC10DesadvResponseDesadvInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC10DesadvResponseDesadvInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC10DesadvResponseDesadvInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC10DesadvResponseDesadvInner
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC10DesadvResponseDesadvInner
   */
  public static EDIWheelC10DesadvResponseDesadvInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC10DesadvResponseDesadvInner.class);
  }

  /**
   * Convert an instance of EDIWheelC10DesadvResponseDesadvInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

