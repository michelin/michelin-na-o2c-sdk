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
 * EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T06:44:55.014855667Z[GMT]", comments = "Generator version: 7.9.0")
public class EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber {
  public static final String SERIALIZED_NAME_DOCUMENT_I_D = "DocumentID";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_I_D)
  private String documentID;

  public static final String SERIALIZED_NAME_LINE_I_D = "LineID";
  @SerializedName(SERIALIZED_NAME_LINE_I_D)
  private String lineID;

  public static final String SERIALIZED_NAME_ISSUE_DATE = "IssueDate";
  @SerializedName(SERIALIZED_NAME_ISSUE_DATE)
  private String issueDate;

  public EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber() {
  }

  public EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber documentID(String documentID) {
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

  public void setDocumentID(String documentID) {
    this.documentID = documentID;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber lineID(String lineID) {
    this.lineID = lineID;
    return this;
  }

  /**
   * Get lineID
   * @return lineID
   */
  @javax.annotation.Nullable
  public String getLineID() {
    return lineID;
  }

  public void setLineID(String lineID) {
    this.lineID = lineID;
  }


  public EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber issueDate(String issueDate) {
    this.issueDate = issueDate;
    return this;
  }

  /**
   * Get issueDate
   * @return issueDate
   */
  @javax.annotation.Nullable
  public String getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber edIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber = (EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber) o;
    return Objects.equals(this.documentID, edIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber.documentID) &&
        Objects.equals(this.lineID, edIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber.lineID) &&
        Objects.equals(this.issueDate, edIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber.issueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentID, lineID, issueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber {\n");
    sb.append("    documentID: ").append(toIndentedString(documentID)).append("\n");
    sb.append("    lineID: ").append(toIndentedString(lineID)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
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
    openapiFields.add("LineID");
    openapiFields.add("IssueDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("DocumentID");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber is not found in the empty JSON string", EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("DocumentID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DocumentID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DocumentID").toString()));
      }
      if ((jsonObj.get("LineID") != null && !jsonObj.get("LineID").isJsonNull()) && !jsonObj.get("LineID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LineID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LineID").toString()));
      }
      if ((jsonObj.get("IssueDate") != null && !jsonObj.get("IssueDate").isJsonNull()) && !jsonObj.get("IssueDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IssueDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IssueDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber>() {
           @Override
           public void write(JsonWriter out, EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber
   * @throws IOException if the JSON string is invalid with respect to EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber
   */
  public static EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber.class);
  }

  /**
   * Convert an instance of EDIWheelB44InvoiceListResponseInvoiceInnerReferencesSupplierClaimNumber to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
