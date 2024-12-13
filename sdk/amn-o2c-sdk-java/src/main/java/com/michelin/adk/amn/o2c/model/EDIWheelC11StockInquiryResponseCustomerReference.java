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
 * EDIWheelC11StockInquiryResponseCustomerReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T06:44:55.014855667Z[GMT]", comments = "Generator version: 7.9.0")
public class EDIWheelC11StockInquiryResponseCustomerReference {
  public static final String SERIALIZED_NAME_DOCUMENT_I_D = "documentID";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_I_D)
  private String documentID;

  public EDIWheelC11StockInquiryResponseCustomerReference() {
  }

  public EDIWheelC11StockInquiryResponseCustomerReference documentID(String documentID) {
    this.documentID = documentID;
    return this;
  }

  /**
   * Get documentID
   * @return documentID
   */
  @javax.annotation.Nullable
  public String getDocumentID() {
    return documentID;
  }

  public void setDocumentID(String documentID) {
    this.documentID = documentID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC11StockInquiryResponseCustomerReference edIWheelC11StockInquiryResponseCustomerReference = (EDIWheelC11StockInquiryResponseCustomerReference) o;
    return Objects.equals(this.documentID, edIWheelC11StockInquiryResponseCustomerReference.documentID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC11StockInquiryResponseCustomerReference {\n");
    sb.append("    documentID: ").append(toIndentedString(documentID)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC11StockInquiryResponseCustomerReference
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC11StockInquiryResponseCustomerReference.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC11StockInquiryResponseCustomerReference is not found in the empty JSON string", EDIWheelC11StockInquiryResponseCustomerReference.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC11StockInquiryResponseCustomerReference.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC11StockInquiryResponseCustomerReference` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("documentID") != null && !jsonObj.get("documentID").isJsonNull()) && !jsonObj.get("documentID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC11StockInquiryResponseCustomerReference.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC11StockInquiryResponseCustomerReference' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC11StockInquiryResponseCustomerReference> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC11StockInquiryResponseCustomerReference.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC11StockInquiryResponseCustomerReference>() {
           @Override
           public void write(JsonWriter out, EDIWheelC11StockInquiryResponseCustomerReference value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC11StockInquiryResponseCustomerReference read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC11StockInquiryResponseCustomerReference given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC11StockInquiryResponseCustomerReference
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC11StockInquiryResponseCustomerReference
   */
  public static EDIWheelC11StockInquiryResponseCustomerReference fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC11StockInquiryResponseCustomerReference.class);
  }

  /**
   * Convert an instance of EDIWheelC11StockInquiryResponseCustomerReference to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

