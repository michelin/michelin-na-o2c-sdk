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
 * EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner {
  public static final String SERIALIZED_NAME_REFERENCE_TYPE_CODE = "ReferenceTypeCode";
  @SerializedName(SERIALIZED_NAME_REFERENCE_TYPE_CODE)
  @javax.annotation.Nonnull
  private String referenceTypeCode;

  public static final String SERIALIZED_NAME_DOCUMENT_I_D = "DocumentID";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_I_D)
  @javax.annotation.Nonnull
  private String documentID;

  public static final String SERIALIZED_NAME_LINE_I_D = "LineID";
  @SerializedName(SERIALIZED_NAME_LINE_I_D)
  @javax.annotation.Nonnull
  private String lineID;

  public static final String SERIALIZED_NAME_ISSUE_DATE = "IssueDate";
  @SerializedName(SERIALIZED_NAME_ISSUE_DATE)
  @javax.annotation.Nullable
  private String issueDate;

  public EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner() {
  }

  public EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner referenceTypeCode(@javax.annotation.Nonnull String referenceTypeCode) {
    this.referenceTypeCode = referenceTypeCode;
    return this;
  }

  /**
   * Get referenceTypeCode
   * @return referenceTypeCode
   */
  @javax.annotation.Nonnull
  public String getReferenceTypeCode() {
    return referenceTypeCode;
  }

  public void setReferenceTypeCode(@javax.annotation.Nonnull String referenceTypeCode) {
    this.referenceTypeCode = referenceTypeCode;
  }


  public EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner documentID(@javax.annotation.Nonnull String documentID) {
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


  public EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner lineID(@javax.annotation.Nonnull String lineID) {
    this.lineID = lineID;
    return this;
  }

  /**
   * Get lineID
   * @return lineID
   */
  @javax.annotation.Nonnull
  public String getLineID() {
    return lineID;
  }

  public void setLineID(@javax.annotation.Nonnull String lineID) {
    this.lineID = lineID;
  }


  public EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner issueDate(@javax.annotation.Nullable String issueDate) {
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

  public void setIssueDate(@javax.annotation.Nullable String issueDate) {
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
    EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner edIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner = (EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner) o;
    return Objects.equals(this.referenceTypeCode, edIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner.referenceTypeCode) &&
        Objects.equals(this.documentID, edIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner.documentID) &&
        Objects.equals(this.lineID, edIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner.lineID) &&
        Objects.equals(this.issueDate, edIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner.issueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceTypeCode, documentID, lineID, issueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner {\n");
    sb.append("    referenceTypeCode: ").append(toIndentedString(referenceTypeCode)).append("\n");
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
    openapiFields.add("ReferenceTypeCode");
    openapiFields.add("DocumentID");
    openapiFields.add("LineID");
    openapiFields.add("IssueDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ReferenceTypeCode");
    openapiRequiredFields.add("DocumentID");
    openapiRequiredFields.add("LineID");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner is not found in the empty JSON string", EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("ReferenceTypeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ReferenceTypeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ReferenceTypeCode").toString()));
      }
      if (!jsonObj.get("DocumentID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DocumentID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DocumentID").toString()));
      }
      if (!jsonObj.get("LineID").isJsonPrimitive()) {
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
       if (!EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner>() {
           @Override
           public void write(JsonWriter out, EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner
   */
  public static EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner.class);
  }

  /**
   * Convert an instance of EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerReferencesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

