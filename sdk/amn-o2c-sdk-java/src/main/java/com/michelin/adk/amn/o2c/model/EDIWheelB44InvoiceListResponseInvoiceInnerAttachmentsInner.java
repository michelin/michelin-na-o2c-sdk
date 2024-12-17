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
 * EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-17T01:25:07.723106500-05:00[America/Toronto]", comments = "Generator version: 7.10.0")
public class EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner {
  public static final String SERIALIZED_NAME_DOCUMENT_NUMBER = "DocumentNumber";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_NUMBER)
  @javax.annotation.Nonnull
  private String documentNumber;

  public static final String SERIALIZED_NAME_ENCODING_SCHEME = "EncodingScheme";
  @SerializedName(SERIALIZED_NAME_ENCODING_SCHEME)
  @javax.annotation.Nonnull
  private String encodingScheme;

  public static final String SERIALIZED_NAME_MIME_TYPE = "MimeType";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  @javax.annotation.Nonnull
  private String mimeType;

  public static final String SERIALIZED_NAME_DATA = "Data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nonnull
  private String data;

  public EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner() {
  }

  public EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner documentNumber(@javax.annotation.Nonnull String documentNumber) {
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


  public EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner encodingScheme(@javax.annotation.Nonnull String encodingScheme) {
    this.encodingScheme = encodingScheme;
    return this;
  }

  /**
   * Get encodingScheme
   * @return encodingScheme
   */
  @javax.annotation.Nonnull
  public String getEncodingScheme() {
    return encodingScheme;
  }

  public void setEncodingScheme(@javax.annotation.Nonnull String encodingScheme) {
    this.encodingScheme = encodingScheme;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner mimeType(@javax.annotation.Nonnull String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * Get mimeType
   * @return mimeType
   */
  @javax.annotation.Nonnull
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(@javax.annotation.Nonnull String mimeType) {
    this.mimeType = mimeType;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner data(@javax.annotation.Nonnull String data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nonnull
  public String getData() {
    return data;
  }

  public void setData(@javax.annotation.Nonnull String data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner edIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner = (EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner) o;
    return Objects.equals(this.documentNumber, edIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner.documentNumber) &&
        Objects.equals(this.encodingScheme, edIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner.encodingScheme) &&
        Objects.equals(this.mimeType, edIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner.mimeType) &&
        Objects.equals(this.data, edIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentNumber, encodingScheme, mimeType, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner {\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    encodingScheme: ").append(toIndentedString(encodingScheme)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("DocumentNumber");
    openapiFields.add("EncodingScheme");
    openapiFields.add("MimeType");
    openapiFields.add("Data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("DocumentNumber");
    openapiRequiredFields.add("EncodingScheme");
    openapiRequiredFields.add("MimeType");
    openapiRequiredFields.add("Data");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner is not found in the empty JSON string", EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("DocumentNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DocumentNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DocumentNumber").toString()));
      }
      if (!jsonObj.get("EncodingScheme").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EncodingScheme` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EncodingScheme").toString()));
      }
      if (!jsonObj.get("MimeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MimeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MimeType").toString()));
      }
      if (!jsonObj.get("Data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Data").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner>() {
           @Override
           public void write(JsonWriter out, EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner
   * @throws IOException if the JSON string is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner
   */
  public static EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner.class);
  }

  /**
   * Convert an instance of EDIWheelB44InvoiceListResponseInvoiceInnerAttachmentsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

