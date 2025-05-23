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
 * EDIWheelC11StockInquiryResponseErrorHead
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class EDIWheelC11StockInquiryResponseErrorHead {
  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  @javax.annotation.Nullable
  private String errorCode;

  public EDIWheelC11StockInquiryResponseErrorHead() {
  }

  public EDIWheelC11StockInquiryResponseErrorHead errorCode(@javax.annotation.Nullable String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Error code if applicable. Error code &#x3D; 0 indicates no error.  Possible header error codes: - 0: No errors occurred. No action required. - 1: At least one item is incorrect. Details are distinctive in the error field on item level. - 303: No connection to ERP system. System is unavailable. - 405: Timeout during processing in ERP system. System has not responded within the expected time parameter. - 907: Invalid consignee(ship-to) party ID number. Consignee PartyID is missing from requests, or invalid, or is not setup or active within supplier system(s). - 915: Buyer (sold-to) party id number invalid. Buyer PartyID is missing or invalid from requests, OR is not setup or active within supplier system(s). - 920: Account not activated for this buyer (sold to) party ID number. Account is not in active status for order placement. - 999: Miscellaneous header error. 
   * @return errorCode
   */
  @javax.annotation.Nullable
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(@javax.annotation.Nullable String errorCode) {
    this.errorCode = errorCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC11StockInquiryResponseErrorHead edIWheelC11StockInquiryResponseErrorHead = (EDIWheelC11StockInquiryResponseErrorHead) o;
    return Objects.equals(this.errorCode, edIWheelC11StockInquiryResponseErrorHead.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC11StockInquiryResponseErrorHead {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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
    openapiFields.add("errorCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC11StockInquiryResponseErrorHead
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC11StockInquiryResponseErrorHead.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC11StockInquiryResponseErrorHead is not found in the empty JSON string", EDIWheelC11StockInquiryResponseErrorHead.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC11StockInquiryResponseErrorHead.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC11StockInquiryResponseErrorHead` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("errorCode") != null && !jsonObj.get("errorCode").isJsonNull()) && !jsonObj.get("errorCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC11StockInquiryResponseErrorHead.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC11StockInquiryResponseErrorHead' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC11StockInquiryResponseErrorHead> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC11StockInquiryResponseErrorHead.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC11StockInquiryResponseErrorHead>() {
           @Override
           public void write(JsonWriter out, EDIWheelC11StockInquiryResponseErrorHead value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC11StockInquiryResponseErrorHead read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC11StockInquiryResponseErrorHead given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC11StockInquiryResponseErrorHead
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC11StockInquiryResponseErrorHead
   */
  public static EDIWheelC11StockInquiryResponseErrorHead fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC11StockInquiryResponseErrorHead.class);
  }

  /**
   * Convert an instance of EDIWheelC11StockInquiryResponseErrorHead to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

