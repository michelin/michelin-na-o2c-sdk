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
 * AuthenticationTokenResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-17T19:36:32.994638751Z[GMT]", comments = "Generator version: 7.10.0")
public class AuthenticationTokenResponse {
  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  @javax.annotation.Nullable
  private String accessToken;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  @javax.annotation.Nullable
  private String signature;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  @javax.annotation.Nullable
  private String scope;

  public static final String SERIALIZED_NAME_INSTANCE_URL = "instance_url";
  @SerializedName(SERIALIZED_NAME_INSTANCE_URL)
  @javax.annotation.Nullable
  private String instanceUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_TOKEN_TYPE = "token_type";
  @SerializedName(SERIALIZED_NAME_TOKEN_TYPE)
  @javax.annotation.Nullable
  private String tokenType;

  public static final String SERIALIZED_NAME_ISSUED_AT = "issued_at";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT)
  @javax.annotation.Nullable
  private String issuedAt;

  public AuthenticationTokenResponse() {
  }

  public AuthenticationTokenResponse accessToken(@javax.annotation.Nullable String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Get accessToken
   * @return accessToken
   */
  @javax.annotation.Nullable
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(@javax.annotation.Nullable String accessToken) {
    this.accessToken = accessToken;
  }


  public AuthenticationTokenResponse signature(@javax.annotation.Nullable String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Get signature
   * @return signature
   */
  @javax.annotation.Nullable
  public String getSignature() {
    return signature;
  }

  public void setSignature(@javax.annotation.Nullable String signature) {
    this.signature = signature;
  }


  public AuthenticationTokenResponse scope(@javax.annotation.Nullable String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
   */
  @javax.annotation.Nullable
  public String getScope() {
    return scope;
  }

  public void setScope(@javax.annotation.Nullable String scope) {
    this.scope = scope;
  }


  public AuthenticationTokenResponse instanceUrl(@javax.annotation.Nullable String instanceUrl) {
    this.instanceUrl = instanceUrl;
    return this;
  }

  /**
   * Get instanceUrl
   * @return instanceUrl
   */
  @javax.annotation.Nullable
  public String getInstanceUrl() {
    return instanceUrl;
  }

  public void setInstanceUrl(@javax.annotation.Nullable String instanceUrl) {
    this.instanceUrl = instanceUrl;
  }


  public AuthenticationTokenResponse id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public AuthenticationTokenResponse tokenType(@javax.annotation.Nullable String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  /**
   * Get tokenType
   * @return tokenType
   */
  @javax.annotation.Nullable
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(@javax.annotation.Nullable String tokenType) {
    this.tokenType = tokenType;
  }


  public AuthenticationTokenResponse issuedAt(@javax.annotation.Nullable String issuedAt) {
    this.issuedAt = issuedAt;
    return this;
  }

  /**
   * Get issuedAt
   * @return issuedAt
   */
  @javax.annotation.Nullable
  public String getIssuedAt() {
    return issuedAt;
  }

  public void setIssuedAt(@javax.annotation.Nullable String issuedAt) {
    this.issuedAt = issuedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationTokenResponse authenticationTokenResponse = (AuthenticationTokenResponse) o;
    return Objects.equals(this.accessToken, authenticationTokenResponse.accessToken) &&
        Objects.equals(this.signature, authenticationTokenResponse.signature) &&
        Objects.equals(this.scope, authenticationTokenResponse.scope) &&
        Objects.equals(this.instanceUrl, authenticationTokenResponse.instanceUrl) &&
        Objects.equals(this.id, authenticationTokenResponse.id) &&
        Objects.equals(this.tokenType, authenticationTokenResponse.tokenType) &&
        Objects.equals(this.issuedAt, authenticationTokenResponse.issuedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, signature, scope, instanceUrl, id, tokenType, issuedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationTokenResponse {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    instanceUrl: ").append(toIndentedString(instanceUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
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
    openapiFields.add("access_token");
    openapiFields.add("signature");
    openapiFields.add("scope");
    openapiFields.add("instance_url");
    openapiFields.add("id");
    openapiFields.add("token_type");
    openapiFields.add("issued_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AuthenticationTokenResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuthenticationTokenResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthenticationTokenResponse is not found in the empty JSON string", AuthenticationTokenResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuthenticationTokenResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthenticationTokenResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("access_token") != null && !jsonObj.get("access_token").isJsonNull()) && !jsonObj.get("access_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_token").toString()));
      }
      if ((jsonObj.get("signature") != null && !jsonObj.get("signature").isJsonNull()) && !jsonObj.get("signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature").toString()));
      }
      if ((jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) && !jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      if ((jsonObj.get("instance_url") != null && !jsonObj.get("instance_url").isJsonNull()) && !jsonObj.get("instance_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instance_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instance_url").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("token_type") != null && !jsonObj.get("token_type").isJsonNull()) && !jsonObj.get("token_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_type").toString()));
      }
      if ((jsonObj.get("issued_at") != null && !jsonObj.get("issued_at").isJsonNull()) && !jsonObj.get("issued_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issued_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issued_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthenticationTokenResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthenticationTokenResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthenticationTokenResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthenticationTokenResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthenticationTokenResponse>() {
           @Override
           public void write(JsonWriter out, AuthenticationTokenResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthenticationTokenResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AuthenticationTokenResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuthenticationTokenResponse
   * @throws IOException if the JSON string is invalid with respect to AuthenticationTokenResponse
   */
  public static AuthenticationTokenResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthenticationTokenResponse.class);
  }

  /**
   * Convert an instance of AuthenticationTokenResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

