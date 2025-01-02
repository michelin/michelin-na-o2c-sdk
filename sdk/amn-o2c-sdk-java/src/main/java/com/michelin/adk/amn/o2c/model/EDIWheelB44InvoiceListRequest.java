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
import com.michelin.adk.amn.o2c.model.EDIWheelB44InvoiceListRequestInvoiceInner;
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
 * EDIWheelB44InvoiceListRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class EDIWheelB44InvoiceListRequest {
  public static final String SERIALIZED_NAME_DOCUMENT_I_D = "DocumentID";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_I_D)
  @javax.annotation.Nonnull
  private String documentID;

  public static final String SERIALIZED_NAME_VARIANT = "Variant";
  @SerializedName(SERIALIZED_NAME_VARIANT)
  @javax.annotation.Nullable
  private String variant;

  public static final String SERIALIZED_NAME_INVOICE = "invoice";
  @SerializedName(SERIALIZED_NAME_INVOICE)
  @javax.annotation.Nonnull
  private List<EDIWheelB44InvoiceListRequestInvoiceInner> invoice = new ArrayList<>();

  public EDIWheelB44InvoiceListRequest() {
  }

  public EDIWheelB44InvoiceListRequest documentID(@javax.annotation.Nonnull String documentID) {
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


  public EDIWheelB44InvoiceListRequest variant(@javax.annotation.Nullable String variant) {
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


  public EDIWheelB44InvoiceListRequest invoice(@javax.annotation.Nonnull List<EDIWheelB44InvoiceListRequestInvoiceInner> invoice) {
    this.invoice = invoice;
    return this;
  }

  public EDIWheelB44InvoiceListRequest addInvoiceItem(EDIWheelB44InvoiceListRequestInvoiceInner invoiceItem) {
    if (this.invoice == null) {
      this.invoice = new ArrayList<>();
    }
    this.invoice.add(invoiceItem);
    return this;
  }

  /**
   * Get invoice
   * @return invoice
   */
  @javax.annotation.Nonnull
  public List<EDIWheelB44InvoiceListRequestInvoiceInner> getInvoice() {
    return invoice;
  }

  public void setInvoice(@javax.annotation.Nonnull List<EDIWheelB44InvoiceListRequestInvoiceInner> invoice) {
    this.invoice = invoice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelB44InvoiceListRequest edIWheelB44InvoiceListRequest = (EDIWheelB44InvoiceListRequest) o;
    return Objects.equals(this.documentID, edIWheelB44InvoiceListRequest.documentID) &&
        Objects.equals(this.variant, edIWheelB44InvoiceListRequest.variant) &&
        Objects.equals(this.invoice, edIWheelB44InvoiceListRequest.invoice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentID, variant, invoice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelB44InvoiceListRequest {\n");
    sb.append("    documentID: ").append(toIndentedString(documentID)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
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
    openapiFields.add("invoice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("DocumentID");
    openapiRequiredFields.add("invoice");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelB44InvoiceListRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelB44InvoiceListRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelB44InvoiceListRequest is not found in the empty JSON string", EDIWheelB44InvoiceListRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelB44InvoiceListRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelB44InvoiceListRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelB44InvoiceListRequest.openapiRequiredFields) {
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
      // ensure the json data is an array
      if (!jsonObj.get("invoice").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice` to be an array in the JSON string but got `%s`", jsonObj.get("invoice").toString()));
      }

      JsonArray jsonArrayinvoice = jsonObj.getAsJsonArray("invoice");
      // validate the required field `invoice` (array)
      for (int i = 0; i < jsonArrayinvoice.size(); i++) {
        EDIWheelB44InvoiceListRequestInvoiceInner.validateJsonElement(jsonArrayinvoice.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelB44InvoiceListRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelB44InvoiceListRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelB44InvoiceListRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelB44InvoiceListRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelB44InvoiceListRequest>() {
           @Override
           public void write(JsonWriter out, EDIWheelB44InvoiceListRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelB44InvoiceListRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelB44InvoiceListRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelB44InvoiceListRequest
   * @throws IOException if the JSON string is invalid with respect to EDIWheelB44InvoiceListRequest
   */
  public static EDIWheelB44InvoiceListRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelB44InvoiceListRequest.class);
  }

  /**
   * Convert an instance of EDIWheelB44InvoiceListRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

