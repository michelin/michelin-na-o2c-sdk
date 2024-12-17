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
 * EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-17T01:25:07.723106500-05:00[America/Toronto]", comments = "Generator version: 7.10.0")
public class EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference {
  public static final String SERIALIZED_NAME_DOCUMENT_I_D = "DocumentID";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_I_D)
  @javax.annotation.Nonnull
  private String documentID;

  public static final String SERIALIZED_NAME_ISSUE_DATE = "IssueDate";
  @SerializedName(SERIALIZED_NAME_ISSUE_DATE)
  @javax.annotation.Nonnull
  private String issueDate;

  public static final String SERIALIZED_NAME_COMPLETION_DATE = "CompletionDate";
  @SerializedName(SERIALIZED_NAME_COMPLETION_DATE)
  @javax.annotation.Nullable
  private String completionDate;

  public EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference() {
  }

  public EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference documentID(@javax.annotation.Nonnull String documentID) {
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


  public EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference issueDate(@javax.annotation.Nonnull String issueDate) {
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


  public EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference completionDate(@javax.annotation.Nullable String completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  /**
   * Get completionDate
   * @return completionDate
   */
  @javax.annotation.Nullable
  public String getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(@javax.annotation.Nullable String completionDate) {
    this.completionDate = completionDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference edIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference = (EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference) o;
    return Objects.equals(this.documentID, edIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference.documentID) &&
        Objects.equals(this.issueDate, edIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference.issueDate) &&
        Objects.equals(this.completionDate, edIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference.completionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentID, issueDate, completionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference {\n");
    sb.append("    documentID: ").append(toIndentedString(documentID)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
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
    openapiFields.add("IssueDate");
    openapiFields.add("CompletionDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("DocumentID");
    openapiRequiredFields.add("IssueDate");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference is not found in the empty JSON string", EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("DocumentID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DocumentID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DocumentID").toString()));
      }
      if (!jsonObj.get("IssueDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IssueDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IssueDate").toString()));
      }
      if ((jsonObj.get("CompletionDate") != null && !jsonObj.get("CompletionDate").isJsonNull()) && !jsonObj.get("CompletionDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CompletionDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CompletionDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference>() {
           @Override
           public void write(JsonWriter out, EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference
   * @throws IOException if the JSON string is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference
   */
  public static EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference.class);
  }

  /**
   * Convert an instance of EDIWheelB44InvoiceListResponseInvoiceInnerReferencesDeliveryNoteReference to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

