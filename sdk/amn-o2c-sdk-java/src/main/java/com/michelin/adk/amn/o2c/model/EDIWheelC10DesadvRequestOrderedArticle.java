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
import com.michelin.adk.amn.o2c.model.EDIWheelC10DesadvRequestOrderedArticleArticleIdentification;
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
 * EDIWheelC10DesadvRequestOrderedArticle
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-17T19:36:32.994638751Z[GMT]", comments = "Generator version: 7.10.0")
public class EDIWheelC10DesadvRequestOrderedArticle {
  public static final String SERIALIZED_NAME_ARTICLE_IDENTIFICATION = "ArticleIdentification";
  @SerializedName(SERIALIZED_NAME_ARTICLE_IDENTIFICATION)
  @javax.annotation.Nonnull
  private EDIWheelC10DesadvRequestOrderedArticleArticleIdentification articleIdentification;

  public EDIWheelC10DesadvRequestOrderedArticle() {
  }

  public EDIWheelC10DesadvRequestOrderedArticle articleIdentification(@javax.annotation.Nonnull EDIWheelC10DesadvRequestOrderedArticleArticleIdentification articleIdentification) {
    this.articleIdentification = articleIdentification;
    return this;
  }

  /**
   * Get articleIdentification
   * @return articleIdentification
   */
  @javax.annotation.Nonnull
  public EDIWheelC10DesadvRequestOrderedArticleArticleIdentification getArticleIdentification() {
    return articleIdentification;
  }

  public void setArticleIdentification(@javax.annotation.Nonnull EDIWheelC10DesadvRequestOrderedArticleArticleIdentification articleIdentification) {
    this.articleIdentification = articleIdentification;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC10DesadvRequestOrderedArticle edIWheelC10DesadvRequestOrderedArticle = (EDIWheelC10DesadvRequestOrderedArticle) o;
    return Objects.equals(this.articleIdentification, edIWheelC10DesadvRequestOrderedArticle.articleIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articleIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC10DesadvRequestOrderedArticle {\n");
    sb.append("    articleIdentification: ").append(toIndentedString(articleIdentification)).append("\n");
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
    openapiFields.add("ArticleIdentification");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ArticleIdentification");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC10DesadvRequestOrderedArticle
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC10DesadvRequestOrderedArticle.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC10DesadvRequestOrderedArticle is not found in the empty JSON string", EDIWheelC10DesadvRequestOrderedArticle.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC10DesadvRequestOrderedArticle.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC10DesadvRequestOrderedArticle` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelC10DesadvRequestOrderedArticle.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `ArticleIdentification`
      EDIWheelC10DesadvRequestOrderedArticleArticleIdentification.validateJsonElement(jsonObj.get("ArticleIdentification"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC10DesadvRequestOrderedArticle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC10DesadvRequestOrderedArticle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC10DesadvRequestOrderedArticle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC10DesadvRequestOrderedArticle.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC10DesadvRequestOrderedArticle>() {
           @Override
           public void write(JsonWriter out, EDIWheelC10DesadvRequestOrderedArticle value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC10DesadvRequestOrderedArticle read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC10DesadvRequestOrderedArticle given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC10DesadvRequestOrderedArticle
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC10DesadvRequestOrderedArticle
   */
  public static EDIWheelC10DesadvRequestOrderedArticle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC10DesadvRequestOrderedArticle.class);
  }

  /**
   * Convert an instance of EDIWheelC10DesadvRequestOrderedArticle to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

