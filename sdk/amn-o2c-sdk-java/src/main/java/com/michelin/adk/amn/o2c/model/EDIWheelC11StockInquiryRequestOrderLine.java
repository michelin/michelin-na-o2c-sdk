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
import com.michelin.adk.amn.o2c.model.EDIWheelC11StockInquiryRequestOrderedArticle;
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
 * EDIWheelC11StockInquiryRequestOrderLine
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-17T01:25:07.723106500-05:00[America/Toronto]", comments = "Generator version: 7.10.0")
public class EDIWheelC11StockInquiryRequestOrderLine {
  public static final String SERIALIZED_NAME_LINE_I_D = "lineID";
  @SerializedName(SERIALIZED_NAME_LINE_I_D)
  @javax.annotation.Nonnull
  private String lineID;

  public static final String SERIALIZED_NAME_ORDERED_ARTICLE = "orderedArticle";
  @SerializedName(SERIALIZED_NAME_ORDERED_ARTICLE)
  @javax.annotation.Nonnull
  private EDIWheelC11StockInquiryRequestOrderedArticle orderedArticle;

  public EDIWheelC11StockInquiryRequestOrderLine() {
  }

  public EDIWheelC11StockInquiryRequestOrderLine lineID(@javax.annotation.Nonnull String lineID) {
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


  public EDIWheelC11StockInquiryRequestOrderLine orderedArticle(@javax.annotation.Nonnull EDIWheelC11StockInquiryRequestOrderedArticle orderedArticle) {
    this.orderedArticle = orderedArticle;
    return this;
  }

  /**
   * Get orderedArticle
   * @return orderedArticle
   */
  @javax.annotation.Nonnull
  public EDIWheelC11StockInquiryRequestOrderedArticle getOrderedArticle() {
    return orderedArticle;
  }

  public void setOrderedArticle(@javax.annotation.Nonnull EDIWheelC11StockInquiryRequestOrderedArticle orderedArticle) {
    this.orderedArticle = orderedArticle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC11StockInquiryRequestOrderLine edIWheelC11StockInquiryRequestOrderLine = (EDIWheelC11StockInquiryRequestOrderLine) o;
    return Objects.equals(this.lineID, edIWheelC11StockInquiryRequestOrderLine.lineID) &&
        Objects.equals(this.orderedArticle, edIWheelC11StockInquiryRequestOrderLine.orderedArticle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineID, orderedArticle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC11StockInquiryRequestOrderLine {\n");
    sb.append("    lineID: ").append(toIndentedString(lineID)).append("\n");
    sb.append("    orderedArticle: ").append(toIndentedString(orderedArticle)).append("\n");
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
    openapiFields.add("lineID");
    openapiFields.add("orderedArticle");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("lineID");
    openapiRequiredFields.add("orderedArticle");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC11StockInquiryRequestOrderLine
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC11StockInquiryRequestOrderLine.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC11StockInquiryRequestOrderLine is not found in the empty JSON string", EDIWheelC11StockInquiryRequestOrderLine.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC11StockInquiryRequestOrderLine.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC11StockInquiryRequestOrderLine` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelC11StockInquiryRequestOrderLine.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("lineID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lineID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lineID").toString()));
      }
      // validate the required field `orderedArticle`
      EDIWheelC11StockInquiryRequestOrderedArticle.validateJsonElement(jsonObj.get("orderedArticle"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC11StockInquiryRequestOrderLine.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC11StockInquiryRequestOrderLine' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC11StockInquiryRequestOrderLine> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC11StockInquiryRequestOrderLine.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC11StockInquiryRequestOrderLine>() {
           @Override
           public void write(JsonWriter out, EDIWheelC11StockInquiryRequestOrderLine value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC11StockInquiryRequestOrderLine read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC11StockInquiryRequestOrderLine given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC11StockInquiryRequestOrderLine
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC11StockInquiryRequestOrderLine
   */
  public static EDIWheelC11StockInquiryRequestOrderLine fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC11StockInquiryRequestOrderLine.class);
  }

  /**
   * Convert an instance of EDIWheelC11StockInquiryRequestOrderLine to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

