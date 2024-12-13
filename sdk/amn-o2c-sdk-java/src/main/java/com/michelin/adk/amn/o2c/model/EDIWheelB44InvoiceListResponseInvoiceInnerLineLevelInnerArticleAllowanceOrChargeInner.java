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
import com.michelin.adk.amn.o2c.model.EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInnerTaxDetailsInner;
import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderCreationResponseChargeChargeAmount;
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
 * EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T06:44:55.014855667Z[GMT]", comments = "Generator version: 7.9.0")
public class EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner {
  public static final String SERIALIZED_NAME_ALLOWANCE_OR_CHARGE_TYPE_CODE = "AllowanceOrChargeTypeCode";
  @SerializedName(SERIALIZED_NAME_ALLOWANCE_OR_CHARGE_TYPE_CODE)
  private String allowanceOrChargeTypeCode;

  public static final String SERIALIZED_NAME_OTHER_CHARGE_TYPE_CODE = "OtherChargeTypeCode";
  @SerializedName(SERIALIZED_NAME_OTHER_CHARGE_TYPE_CODE)
  private String otherChargeTypeCode;

  public static final String SERIALIZED_NAME_AGENCY_CODE = "AgencyCode";
  @SerializedName(SERIALIZED_NAME_AGENCY_CODE)
  private String agencyCode;

  public static final String SERIALIZED_NAME_ALLOWANCE_OR_CHARGE_NUMBER = "AllowanceOrChargeNumber";
  @SerializedName(SERIALIZED_NAME_ALLOWANCE_OR_CHARGE_NUMBER)
  private String allowanceOrChargeNumber;

  public static final String SERIALIZED_NAME_ALLOWANCE_OR_CHARGE_NAME = "AllowanceOrChargeName";
  @SerializedName(SERIALIZED_NAME_ALLOWANCE_OR_CHARGE_NAME)
  private String allowanceOrChargeName;

  public static final String SERIALIZED_NAME_ALLOWANCE_OR_CHARGE_PERCENT = "AllowanceOrChargePercent";
  @SerializedName(SERIALIZED_NAME_ALLOWANCE_OR_CHARGE_PERCENT)
  private String allowanceOrChargePercent;

  public static final String SERIALIZED_NAME_ALLOWANCE_OR_CHARGE_AMOUNT = "AllowanceOrChargeAmount";
  @SerializedName(SERIALIZED_NAME_ALLOWANCE_OR_CHARGE_AMOUNT)
  private EDIWheelC11OrderCreationResponseChargeChargeAmount allowanceOrChargeAmount;

  public static final String SERIALIZED_NAME_TAX_DETAILS = "TaxDetails";
  @SerializedName(SERIALIZED_NAME_TAX_DETAILS)
  private List<EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInnerTaxDetailsInner> taxDetails = new ArrayList<>();

  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner() {
  }

  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner allowanceOrChargeTypeCode(String allowanceOrChargeTypeCode) {
    this.allowanceOrChargeTypeCode = allowanceOrChargeTypeCode;
    return this;
  }

  /**
   * Get allowanceOrChargeTypeCode
   * @return allowanceOrChargeTypeCode
   */
  @javax.annotation.Nullable
  public String getAllowanceOrChargeTypeCode() {
    return allowanceOrChargeTypeCode;
  }

  public void setAllowanceOrChargeTypeCode(String allowanceOrChargeTypeCode) {
    this.allowanceOrChargeTypeCode = allowanceOrChargeTypeCode;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner otherChargeTypeCode(String otherChargeTypeCode) {
    this.otherChargeTypeCode = otherChargeTypeCode;
    return this;
  }

  /**
   * Get otherChargeTypeCode
   * @return otherChargeTypeCode
   */
  @javax.annotation.Nullable
  public String getOtherChargeTypeCode() {
    return otherChargeTypeCode;
  }

  public void setOtherChargeTypeCode(String otherChargeTypeCode) {
    this.otherChargeTypeCode = otherChargeTypeCode;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner agencyCode(String agencyCode) {
    this.agencyCode = agencyCode;
    return this;
  }

  /**
   * Get agencyCode
   * @return agencyCode
   */
  @javax.annotation.Nullable
  public String getAgencyCode() {
    return agencyCode;
  }

  public void setAgencyCode(String agencyCode) {
    this.agencyCode = agencyCode;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner allowanceOrChargeNumber(String allowanceOrChargeNumber) {
    this.allowanceOrChargeNumber = allowanceOrChargeNumber;
    return this;
  }

  /**
   * Get allowanceOrChargeNumber
   * @return allowanceOrChargeNumber
   */
  @javax.annotation.Nullable
  public String getAllowanceOrChargeNumber() {
    return allowanceOrChargeNumber;
  }

  public void setAllowanceOrChargeNumber(String allowanceOrChargeNumber) {
    this.allowanceOrChargeNumber = allowanceOrChargeNumber;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner allowanceOrChargeName(String allowanceOrChargeName) {
    this.allowanceOrChargeName = allowanceOrChargeName;
    return this;
  }

  /**
   * Get allowanceOrChargeName
   * @return allowanceOrChargeName
   */
  @javax.annotation.Nullable
  public String getAllowanceOrChargeName() {
    return allowanceOrChargeName;
  }

  public void setAllowanceOrChargeName(String allowanceOrChargeName) {
    this.allowanceOrChargeName = allowanceOrChargeName;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner allowanceOrChargePercent(String allowanceOrChargePercent) {
    this.allowanceOrChargePercent = allowanceOrChargePercent;
    return this;
  }

  /**
   * Get allowanceOrChargePercent
   * @return allowanceOrChargePercent
   */
  @javax.annotation.Nullable
  public String getAllowanceOrChargePercent() {
    return allowanceOrChargePercent;
  }

  public void setAllowanceOrChargePercent(String allowanceOrChargePercent) {
    this.allowanceOrChargePercent = allowanceOrChargePercent;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner allowanceOrChargeAmount(EDIWheelC11OrderCreationResponseChargeChargeAmount allowanceOrChargeAmount) {
    this.allowanceOrChargeAmount = allowanceOrChargeAmount;
    return this;
  }

  /**
   * Get allowanceOrChargeAmount
   * @return allowanceOrChargeAmount
   */
  @javax.annotation.Nonnull
  public EDIWheelC11OrderCreationResponseChargeChargeAmount getAllowanceOrChargeAmount() {
    return allowanceOrChargeAmount;
  }

  public void setAllowanceOrChargeAmount(EDIWheelC11OrderCreationResponseChargeChargeAmount allowanceOrChargeAmount) {
    this.allowanceOrChargeAmount = allowanceOrChargeAmount;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner taxDetails(List<EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInnerTaxDetailsInner> taxDetails) {
    this.taxDetails = taxDetails;
    return this;
  }

  public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner addTaxDetailsItem(EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInnerTaxDetailsInner taxDetailsItem) {
    if (this.taxDetails == null) {
      this.taxDetails = new ArrayList<>();
    }
    this.taxDetails.add(taxDetailsItem);
    return this;
  }

  /**
   * Get taxDetails
   * @return taxDetails
   */
  @javax.annotation.Nullable
  public List<EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInnerTaxDetailsInner> getTaxDetails() {
    return taxDetails;
  }

  public void setTaxDetails(List<EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInnerTaxDetailsInner> taxDetails) {
    this.taxDetails = taxDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner = (EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner) o;
    return Objects.equals(this.allowanceOrChargeTypeCode, edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner.allowanceOrChargeTypeCode) &&
        Objects.equals(this.otherChargeTypeCode, edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner.otherChargeTypeCode) &&
        Objects.equals(this.agencyCode, edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner.agencyCode) &&
        Objects.equals(this.allowanceOrChargeNumber, edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner.allowanceOrChargeNumber) &&
        Objects.equals(this.allowanceOrChargeName, edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner.allowanceOrChargeName) &&
        Objects.equals(this.allowanceOrChargePercent, edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner.allowanceOrChargePercent) &&
        Objects.equals(this.allowanceOrChargeAmount, edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner.allowanceOrChargeAmount) &&
        Objects.equals(this.taxDetails, edIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner.taxDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowanceOrChargeTypeCode, otherChargeTypeCode, agencyCode, allowanceOrChargeNumber, allowanceOrChargeName, allowanceOrChargePercent, allowanceOrChargeAmount, taxDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner {\n");
    sb.append("    allowanceOrChargeTypeCode: ").append(toIndentedString(allowanceOrChargeTypeCode)).append("\n");
    sb.append("    otherChargeTypeCode: ").append(toIndentedString(otherChargeTypeCode)).append("\n");
    sb.append("    agencyCode: ").append(toIndentedString(agencyCode)).append("\n");
    sb.append("    allowanceOrChargeNumber: ").append(toIndentedString(allowanceOrChargeNumber)).append("\n");
    sb.append("    allowanceOrChargeName: ").append(toIndentedString(allowanceOrChargeName)).append("\n");
    sb.append("    allowanceOrChargePercent: ").append(toIndentedString(allowanceOrChargePercent)).append("\n");
    sb.append("    allowanceOrChargeAmount: ").append(toIndentedString(allowanceOrChargeAmount)).append("\n");
    sb.append("    taxDetails: ").append(toIndentedString(taxDetails)).append("\n");
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
    openapiFields.add("AllowanceOrChargeTypeCode");
    openapiFields.add("OtherChargeTypeCode");
    openapiFields.add("AgencyCode");
    openapiFields.add("AllowanceOrChargeNumber");
    openapiFields.add("AllowanceOrChargeName");
    openapiFields.add("AllowanceOrChargePercent");
    openapiFields.add("AllowanceOrChargeAmount");
    openapiFields.add("TaxDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("AllowanceOrChargeAmount");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner is not found in the empty JSON string", EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("AllowanceOrChargeTypeCode") != null && !jsonObj.get("AllowanceOrChargeTypeCode").isJsonNull()) && !jsonObj.get("AllowanceOrChargeTypeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AllowanceOrChargeTypeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AllowanceOrChargeTypeCode").toString()));
      }
      if ((jsonObj.get("OtherChargeTypeCode") != null && !jsonObj.get("OtherChargeTypeCode").isJsonNull()) && !jsonObj.get("OtherChargeTypeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OtherChargeTypeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OtherChargeTypeCode").toString()));
      }
      if ((jsonObj.get("AgencyCode") != null && !jsonObj.get("AgencyCode").isJsonNull()) && !jsonObj.get("AgencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AgencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AgencyCode").toString()));
      }
      if ((jsonObj.get("AllowanceOrChargeNumber") != null && !jsonObj.get("AllowanceOrChargeNumber").isJsonNull()) && !jsonObj.get("AllowanceOrChargeNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AllowanceOrChargeNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AllowanceOrChargeNumber").toString()));
      }
      if ((jsonObj.get("AllowanceOrChargeName") != null && !jsonObj.get("AllowanceOrChargeName").isJsonNull()) && !jsonObj.get("AllowanceOrChargeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AllowanceOrChargeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AllowanceOrChargeName").toString()));
      }
      if ((jsonObj.get("AllowanceOrChargePercent") != null && !jsonObj.get("AllowanceOrChargePercent").isJsonNull()) && !jsonObj.get("AllowanceOrChargePercent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AllowanceOrChargePercent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AllowanceOrChargePercent").toString()));
      }
      // validate the required field `AllowanceOrChargeAmount`
      EDIWheelC11OrderCreationResponseChargeChargeAmount.validateJsonElement(jsonObj.get("AllowanceOrChargeAmount"));
      if (jsonObj.get("TaxDetails") != null && !jsonObj.get("TaxDetails").isJsonNull()) {
        JsonArray jsonArraytaxDetails = jsonObj.getAsJsonArray("TaxDetails");
        if (jsonArraytaxDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("TaxDetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `TaxDetails` to be an array in the JSON string but got `%s`", jsonObj.get("TaxDetails").toString()));
          }

          // validate the optional field `TaxDetails` (array)
          for (int i = 0; i < jsonArraytaxDetails.size(); i++) {
            EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInnerTaxDetailsInner.validateJsonElement(jsonArraytaxDetails.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner>() {
           @Override
           public void write(JsonWriter out, EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner
   * @throws IOException if the JSON string is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner
   */
  public static EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner.class);
  }

  /**
   * Convert an instance of EDIWheelB44InvoiceListResponseInvoiceInnerLineLevelInnerArticleAllowanceOrChargeInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

