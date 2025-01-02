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
 * EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner {
  public static final String SERIALIZED_NAME_TAX_CATEGORY_CODE = "TaxCategoryCode";
  @SerializedName(SERIALIZED_NAME_TAX_CATEGORY_CODE)
  @javax.annotation.Nullable
  private String taxCategoryCode;

  public static final String SERIALIZED_NAME_TAX_TYPE_CODE = "TaxTypeCode";
  @SerializedName(SERIALIZED_NAME_TAX_TYPE_CODE)
  @javax.annotation.Nonnull
  private String taxTypeCode;

  public static final String SERIALIZED_NAME_TAX_RATE = "TaxRate";
  @SerializedName(SERIALIZED_NAME_TAX_RATE)
  @javax.annotation.Nonnull
  private String taxRate;

  public static final String SERIALIZED_NAME_VA_T_EXEMPTION_CLAUSE = "VATExemptionClause";
  @SerializedName(SERIALIZED_NAME_VA_T_EXEMPTION_CLAUSE)
  @javax.annotation.Nullable
  private String vaTExemptionClause;

  public static final String SERIALIZED_NAME_GENERAL_DISCOUNT_CLAUSE = "GeneralDiscountClause";
  @SerializedName(SERIALIZED_NAME_GENERAL_DISCOUNT_CLAUSE)
  @javax.annotation.Nullable
  private String generalDiscountClause;

  public static final String SERIALIZED_NAME_TAX_AMOUNT = "TaxAmount";
  @SerializedName(SERIALIZED_NAME_TAX_AMOUNT)
  @javax.annotation.Nullable
  private EDIWheelC11OrderCreationResponseChargeChargeAmount taxAmount;

  public static final String SERIALIZED_NAME_TAXABLE_AMOUNT = "TaxableAmount";
  @SerializedName(SERIALIZED_NAME_TAXABLE_AMOUNT)
  @javax.annotation.Nullable
  private EDIWheelC11OrderCreationResponseChargeChargeAmount taxableAmount;

  public EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner() {
  }

  public EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner taxCategoryCode(@javax.annotation.Nullable String taxCategoryCode) {
    this.taxCategoryCode = taxCategoryCode;
    return this;
  }

  /**
   * Get taxCategoryCode
   * @return taxCategoryCode
   */
  @javax.annotation.Nullable
  public String getTaxCategoryCode() {
    return taxCategoryCode;
  }

  public void setTaxCategoryCode(@javax.annotation.Nullable String taxCategoryCode) {
    this.taxCategoryCode = taxCategoryCode;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner taxTypeCode(@javax.annotation.Nonnull String taxTypeCode) {
    this.taxTypeCode = taxTypeCode;
    return this;
  }

  /**
   * Get taxTypeCode
   * @return taxTypeCode
   */
  @javax.annotation.Nonnull
  public String getTaxTypeCode() {
    return taxTypeCode;
  }

  public void setTaxTypeCode(@javax.annotation.Nonnull String taxTypeCode) {
    this.taxTypeCode = taxTypeCode;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner taxRate(@javax.annotation.Nonnull String taxRate) {
    this.taxRate = taxRate;
    return this;
  }

  /**
   * Get taxRate
   * @return taxRate
   */
  @javax.annotation.Nonnull
  public String getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(@javax.annotation.Nonnull String taxRate) {
    this.taxRate = taxRate;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner vaTExemptionClause(@javax.annotation.Nullable String vaTExemptionClause) {
    this.vaTExemptionClause = vaTExemptionClause;
    return this;
  }

  /**
   * Get vaTExemptionClause
   * @return vaTExemptionClause
   */
  @javax.annotation.Nullable
  public String getVaTExemptionClause() {
    return vaTExemptionClause;
  }

  public void setVaTExemptionClause(@javax.annotation.Nullable String vaTExemptionClause) {
    this.vaTExemptionClause = vaTExemptionClause;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner generalDiscountClause(@javax.annotation.Nullable String generalDiscountClause) {
    this.generalDiscountClause = generalDiscountClause;
    return this;
  }

  /**
   * Get generalDiscountClause
   * @return generalDiscountClause
   */
  @javax.annotation.Nullable
  public String getGeneralDiscountClause() {
    return generalDiscountClause;
  }

  public void setGeneralDiscountClause(@javax.annotation.Nullable String generalDiscountClause) {
    this.generalDiscountClause = generalDiscountClause;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner taxAmount(@javax.annotation.Nullable EDIWheelC11OrderCreationResponseChargeChargeAmount taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  /**
   * Get taxAmount
   * @return taxAmount
   */
  @javax.annotation.Nullable
  public EDIWheelC11OrderCreationResponseChargeChargeAmount getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(@javax.annotation.Nullable EDIWheelC11OrderCreationResponseChargeChargeAmount taxAmount) {
    this.taxAmount = taxAmount;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner taxableAmount(@javax.annotation.Nullable EDIWheelC11OrderCreationResponseChargeChargeAmount taxableAmount) {
    this.taxableAmount = taxableAmount;
    return this;
  }

  /**
   * Get taxableAmount
   * @return taxableAmount
   */
  @javax.annotation.Nullable
  public EDIWheelC11OrderCreationResponseChargeChargeAmount getTaxableAmount() {
    return taxableAmount;
  }

  public void setTaxableAmount(@javax.annotation.Nullable EDIWheelC11OrderCreationResponseChargeChargeAmount taxableAmount) {
    this.taxableAmount = taxableAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner edIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner = (EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner) o;
    return Objects.equals(this.taxCategoryCode, edIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner.taxCategoryCode) &&
        Objects.equals(this.taxTypeCode, edIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner.taxTypeCode) &&
        Objects.equals(this.taxRate, edIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner.taxRate) &&
        Objects.equals(this.vaTExemptionClause, edIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner.vaTExemptionClause) &&
        Objects.equals(this.generalDiscountClause, edIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner.generalDiscountClause) &&
        Objects.equals(this.taxAmount, edIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner.taxAmount) &&
        Objects.equals(this.taxableAmount, edIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner.taxableAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxCategoryCode, taxTypeCode, taxRate, vaTExemptionClause, generalDiscountClause, taxAmount, taxableAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner {\n");
    sb.append("    taxCategoryCode: ").append(toIndentedString(taxCategoryCode)).append("\n");
    sb.append("    taxTypeCode: ").append(toIndentedString(taxTypeCode)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    vaTExemptionClause: ").append(toIndentedString(vaTExemptionClause)).append("\n");
    sb.append("    generalDiscountClause: ").append(toIndentedString(generalDiscountClause)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxableAmount: ").append(toIndentedString(taxableAmount)).append("\n");
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
    openapiFields.add("TaxCategoryCode");
    openapiFields.add("TaxTypeCode");
    openapiFields.add("TaxRate");
    openapiFields.add("VATExemptionClause");
    openapiFields.add("GeneralDiscountClause");
    openapiFields.add("TaxAmount");
    openapiFields.add("TaxableAmount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("TaxTypeCode");
    openapiRequiredFields.add("TaxRate");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner is not found in the empty JSON string", EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("TaxCategoryCode") != null && !jsonObj.get("TaxCategoryCode").isJsonNull()) && !jsonObj.get("TaxCategoryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TaxCategoryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TaxCategoryCode").toString()));
      }
      if (!jsonObj.get("TaxTypeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TaxTypeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TaxTypeCode").toString()));
      }
      if (!jsonObj.get("TaxRate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TaxRate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TaxRate").toString()));
      }
      if ((jsonObj.get("VATExemptionClause") != null && !jsonObj.get("VATExemptionClause").isJsonNull()) && !jsonObj.get("VATExemptionClause").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VATExemptionClause` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VATExemptionClause").toString()));
      }
      if ((jsonObj.get("GeneralDiscountClause") != null && !jsonObj.get("GeneralDiscountClause").isJsonNull()) && !jsonObj.get("GeneralDiscountClause").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GeneralDiscountClause` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GeneralDiscountClause").toString()));
      }
      // validate the optional field `TaxAmount`
      if (jsonObj.get("TaxAmount") != null && !jsonObj.get("TaxAmount").isJsonNull()) {
        EDIWheelC11OrderCreationResponseChargeChargeAmount.validateJsonElement(jsonObj.get("TaxAmount"));
      }
      // validate the optional field `TaxableAmount`
      if (jsonObj.get("TaxableAmount") != null && !jsonObj.get("TaxableAmount").isJsonNull()) {
        EDIWheelC11OrderCreationResponseChargeChargeAmount.validateJsonElement(jsonObj.get("TaxableAmount"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner>() {
           @Override
           public void write(JsonWriter out, EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner
   * @throws IOException if the JSON string is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner
   */
  public static EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner.class);
  }

  /**
   * Convert an instance of EDIWheelB44InvoiceListResponseInvoiceInnerSummaryTaxDetailsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

