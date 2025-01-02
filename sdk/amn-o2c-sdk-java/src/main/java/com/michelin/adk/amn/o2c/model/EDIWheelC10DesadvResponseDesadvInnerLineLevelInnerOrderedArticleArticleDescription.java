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
 * EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription {
  public static final String SERIALIZED_NAME_ARTICLE_DESCRIPTION_TEXT = "ArticleDescriptionText";
  @SerializedName(SERIALIZED_NAME_ARTICLE_DESCRIPTION_TEXT)
  @javax.annotation.Nonnull
  private List<String> articleDescriptionText = new ArrayList<>();

  public EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription() {
  }

  public EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription articleDescriptionText(@javax.annotation.Nonnull List<String> articleDescriptionText) {
    this.articleDescriptionText = articleDescriptionText;
    return this;
  }

  public EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription addArticleDescriptionTextItem(String articleDescriptionTextItem) {
    if (this.articleDescriptionText == null) {
      this.articleDescriptionText = new ArrayList<>();
    }
    this.articleDescriptionText.add(articleDescriptionTextItem);
    return this;
  }

  /**
   * Get articleDescriptionText
   * @return articleDescriptionText
   */
  @javax.annotation.Nonnull
  public List<String> getArticleDescriptionText() {
    return articleDescriptionText;
  }

  public void setArticleDescriptionText(@javax.annotation.Nonnull List<String> articleDescriptionText) {
    this.articleDescriptionText = articleDescriptionText;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription edIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription = (EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription) o;
    return Objects.equals(this.articleDescriptionText, edIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription.articleDescriptionText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articleDescriptionText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription {\n");
    sb.append("    articleDescriptionText: ").append(toIndentedString(articleDescriptionText)).append("\n");
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
    openapiFields.add("ArticleDescriptionText");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ArticleDescriptionText");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription is not found in the empty JSON string", EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("ArticleDescriptionText") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("ArticleDescriptionText").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ArticleDescriptionText` to be an array in the JSON string but got `%s`", jsonObj.get("ArticleDescriptionText").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription>() {
           @Override
           public void write(JsonWriter out, EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription
   */
  public static EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription.class);
  }

  /**
   * Convert an instance of EDIWheelC10DesadvResponseDesadvInnerLineLevelInnerOrderedArticleArticleDescription to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

