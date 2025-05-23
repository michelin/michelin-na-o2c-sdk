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
import com.michelin.adk.amn.o2c.model.EDIWheelB34InvoiceListResponseErrorHead;
import com.michelin.adk.amn.o2c.model.EDIWheelB34InvoiceListResponseInvoiceInner;
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
 * EDIWheelB34InvoiceListResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class EDIWheelB34InvoiceListResponse {
  public static final String SERIALIZED_NAME_DOCUMENT_I_D = "documentID";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_I_D)
  @javax.annotation.Nonnull
  private String documentID;

  public static final String SERIALIZED_NAME_VARIANT = "variant";
  @SerializedName(SERIALIZED_NAME_VARIANT)
  @javax.annotation.Nonnull
  private String variant;

  public static final String SERIALIZED_NAME_NUMBER_OF_MESSAGES = "numberOfMessages";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_MESSAGES)
  @javax.annotation.Nonnull
  private Integer numberOfMessages;

  public static final String SERIALIZED_NAME_ERROR_HEAD = "errorHead";
  @SerializedName(SERIALIZED_NAME_ERROR_HEAD)
  @javax.annotation.Nullable
  private EDIWheelB34InvoiceListResponseErrorHead errorHead;

  public static final String SERIALIZED_NAME_INVOICE = "invoice";
  @SerializedName(SERIALIZED_NAME_INVOICE)
  @javax.annotation.Nonnull
  private List<EDIWheelB34InvoiceListResponseInvoiceInner> invoice = new ArrayList<>();

  public EDIWheelB34InvoiceListResponse() {
  }

  public EDIWheelB34InvoiceListResponse documentID(@javax.annotation.Nonnull String documentID) {
    this.documentID = documentID;
    return this;
  }

  /**
   * Fixed documentID &#x3D; B3
   * @return documentID
   */
  @javax.annotation.Nonnull
  public String getDocumentID() {
    return documentID;
  }

  public void setDocumentID(@javax.annotation.Nonnull String documentID) {
    this.documentID = documentID;
  }


  public EDIWheelB34InvoiceListResponse variant(@javax.annotation.Nonnull String variant) {
    this.variant = variant;
    return this;
  }

  /**
   * Fixed variant &#x3D; 4
   * @return variant
   */
  @javax.annotation.Nonnull
  public String getVariant() {
    return variant;
  }

  public void setVariant(@javax.annotation.Nonnull String variant) {
    this.variant = variant;
  }


  public EDIWheelB34InvoiceListResponse numberOfMessages(@javax.annotation.Nonnull Integer numberOfMessages) {
    this.numberOfMessages = numberOfMessages;
    return this;
  }

  /**
   * Number of messages returned based on request search criteria. Max response &#x3D; 100 messages. This may include a pagination feature in the future to be able to include more messages.
   * @return numberOfMessages
   */
  @javax.annotation.Nonnull
  public Integer getNumberOfMessages() {
    return numberOfMessages;
  }

  public void setNumberOfMessages(@javax.annotation.Nonnull Integer numberOfMessages) {
    this.numberOfMessages = numberOfMessages;
  }


  public EDIWheelB34InvoiceListResponse errorHead(@javax.annotation.Nullable EDIWheelB34InvoiceListResponseErrorHead errorHead) {
    this.errorHead = errorHead;
    return this;
  }

  /**
   * Get errorHead
   * @return errorHead
   */
  @javax.annotation.Nullable
  public EDIWheelB34InvoiceListResponseErrorHead getErrorHead() {
    return errorHead;
  }

  public void setErrorHead(@javax.annotation.Nullable EDIWheelB34InvoiceListResponseErrorHead errorHead) {
    this.errorHead = errorHead;
  }


  public EDIWheelB34InvoiceListResponse invoice(@javax.annotation.Nonnull List<EDIWheelB34InvoiceListResponseInvoiceInner> invoice) {
    this.invoice = invoice;
    return this;
  }

  public EDIWheelB34InvoiceListResponse addInvoiceItem(EDIWheelB34InvoiceListResponseInvoiceInner invoiceItem) {
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
  public List<EDIWheelB34InvoiceListResponseInvoiceInner> getInvoice() {
    return invoice;
  }

  public void setInvoice(@javax.annotation.Nonnull List<EDIWheelB34InvoiceListResponseInvoiceInner> invoice) {
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
    EDIWheelB34InvoiceListResponse edIWheelB34InvoiceListResponse = (EDIWheelB34InvoiceListResponse) o;
    return Objects.equals(this.documentID, edIWheelB34InvoiceListResponse.documentID) &&
        Objects.equals(this.variant, edIWheelB34InvoiceListResponse.variant) &&
        Objects.equals(this.numberOfMessages, edIWheelB34InvoiceListResponse.numberOfMessages) &&
        Objects.equals(this.errorHead, edIWheelB34InvoiceListResponse.errorHead) &&
        Objects.equals(this.invoice, edIWheelB34InvoiceListResponse.invoice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentID, variant, numberOfMessages, errorHead, invoice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelB34InvoiceListResponse {\n");
    sb.append("    documentID: ").append(toIndentedString(documentID)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    numberOfMessages: ").append(toIndentedString(numberOfMessages)).append("\n");
    sb.append("    errorHead: ").append(toIndentedString(errorHead)).append("\n");
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
    openapiFields.add("documentID");
    openapiFields.add("variant");
    openapiFields.add("numberOfMessages");
    openapiFields.add("errorHead");
    openapiFields.add("invoice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("documentID");
    openapiRequiredFields.add("variant");
    openapiRequiredFields.add("numberOfMessages");
    openapiRequiredFields.add("invoice");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelB34InvoiceListResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelB34InvoiceListResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelB34InvoiceListResponse is not found in the empty JSON string", EDIWheelB34InvoiceListResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelB34InvoiceListResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelB34InvoiceListResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelB34InvoiceListResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("documentID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentID").toString()));
      }
      if (!jsonObj.get("variant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variant").toString()));
      }
      // validate the optional field `errorHead`
      if (jsonObj.get("errorHead") != null && !jsonObj.get("errorHead").isJsonNull()) {
        EDIWheelB34InvoiceListResponseErrorHead.validateJsonElement(jsonObj.get("errorHead"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("invoice").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice` to be an array in the JSON string but got `%s`", jsonObj.get("invoice").toString()));
      }

      JsonArray jsonArrayinvoice = jsonObj.getAsJsonArray("invoice");
      // validate the required field `invoice` (array)
      for (int i = 0; i < jsonArrayinvoice.size(); i++) {
        EDIWheelB34InvoiceListResponseInvoiceInner.validateJsonElement(jsonArrayinvoice.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelB34InvoiceListResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelB34InvoiceListResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelB34InvoiceListResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelB34InvoiceListResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelB34InvoiceListResponse>() {
           @Override
           public void write(JsonWriter out, EDIWheelB34InvoiceListResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelB34InvoiceListResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelB34InvoiceListResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelB34InvoiceListResponse
   * @throws IOException if the JSON string is invalid with respect to EDIWheelB34InvoiceListResponse
   */
  public static EDIWheelB34InvoiceListResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelB34InvoiceListResponse.class);
  }

  /**
   * Convert an instance of EDIWheelB34InvoiceListResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

