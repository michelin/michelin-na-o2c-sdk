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
 * EDIWheelC11OrderCreationRequestSellerPartyAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class EDIWheelC11OrderCreationRequestSellerPartyAddress {
  public static final String SERIALIZED_NAME_STREET = "Street";
  @SerializedName(SERIALIZED_NAME_STREET)
  @javax.annotation.Nullable
  private List<String> street = new ArrayList<>();

  public static final String SERIALIZED_NAME_CITY = "City";
  @SerializedName(SERIALIZED_NAME_CITY)
  @javax.annotation.Nullable
  private String city;

  public static final String SERIALIZED_NAME_DISTRICT = "District";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  @javax.annotation.Nullable
  private String district;

  public static final String SERIALIZED_NAME_POST_CODE = "PostCode";
  @SerializedName(SERIALIZED_NAME_POST_CODE)
  @javax.annotation.Nullable
  private String postCode;

  public static final String SERIALIZED_NAME_POST_BOX_CODE = "PostBoxCode";
  @SerializedName(SERIALIZED_NAME_POST_BOX_CODE)
  @javax.annotation.Nullable
  private String postBoxCode;

  public static final String SERIALIZED_NAME_SUB_COUNTRY = "SubCountry";
  @SerializedName(SERIALIZED_NAME_SUB_COUNTRY)
  @javax.annotation.Nullable
  private String subCountry;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "CountryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  @javax.annotation.Nonnull
  private String countryCode;

  public EDIWheelC11OrderCreationRequestSellerPartyAddress() {
  }

  public EDIWheelC11OrderCreationRequestSellerPartyAddress street(@javax.annotation.Nullable List<String> street) {
    this.street = street;
    return this;
  }

  public EDIWheelC11OrderCreationRequestSellerPartyAddress addStreetItem(String streetItem) {
    if (this.street == null) {
      this.street = new ArrayList<>();
    }
    this.street.add(streetItem);
    return this;
  }

  /**
   * Get street
   * @return street
   */
  @javax.annotation.Nullable
  public List<String> getStreet() {
    return street;
  }

  public void setStreet(@javax.annotation.Nullable List<String> street) {
    this.street = street;
  }


  public EDIWheelC11OrderCreationRequestSellerPartyAddress city(@javax.annotation.Nullable String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   */
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(@javax.annotation.Nullable String city) {
    this.city = city;
  }


  public EDIWheelC11OrderCreationRequestSellerPartyAddress district(@javax.annotation.Nullable String district) {
    this.district = district;
    return this;
  }

  /**
   * Get district
   * @return district
   */
  @javax.annotation.Nullable
  public String getDistrict() {
    return district;
  }

  public void setDistrict(@javax.annotation.Nullable String district) {
    this.district = district;
  }


  public EDIWheelC11OrderCreationRequestSellerPartyAddress postCode(@javax.annotation.Nullable String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Get postCode
   * @return postCode
   */
  @javax.annotation.Nullable
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(@javax.annotation.Nullable String postCode) {
    this.postCode = postCode;
  }


  public EDIWheelC11OrderCreationRequestSellerPartyAddress postBoxCode(@javax.annotation.Nullable String postBoxCode) {
    this.postBoxCode = postBoxCode;
    return this;
  }

  /**
   * Get postBoxCode
   * @return postBoxCode
   */
  @javax.annotation.Nullable
  public String getPostBoxCode() {
    return postBoxCode;
  }

  public void setPostBoxCode(@javax.annotation.Nullable String postBoxCode) {
    this.postBoxCode = postBoxCode;
  }


  public EDIWheelC11OrderCreationRequestSellerPartyAddress subCountry(@javax.annotation.Nullable String subCountry) {
    this.subCountry = subCountry;
    return this;
  }

  /**
   * Get subCountry
   * @return subCountry
   */
  @javax.annotation.Nullable
  public String getSubCountry() {
    return subCountry;
  }

  public void setSubCountry(@javax.annotation.Nullable String subCountry) {
    this.subCountry = subCountry;
  }


  public EDIWheelC11OrderCreationRequestSellerPartyAddress countryCode(@javax.annotation.Nonnull String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Get countryCode
   * @return countryCode
   */
  @javax.annotation.Nonnull
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(@javax.annotation.Nonnull String countryCode) {
    this.countryCode = countryCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC11OrderCreationRequestSellerPartyAddress edIWheelC11OrderCreationRequestSellerPartyAddress = (EDIWheelC11OrderCreationRequestSellerPartyAddress) o;
    return Objects.equals(this.street, edIWheelC11OrderCreationRequestSellerPartyAddress.street) &&
        Objects.equals(this.city, edIWheelC11OrderCreationRequestSellerPartyAddress.city) &&
        Objects.equals(this.district, edIWheelC11OrderCreationRequestSellerPartyAddress.district) &&
        Objects.equals(this.postCode, edIWheelC11OrderCreationRequestSellerPartyAddress.postCode) &&
        Objects.equals(this.postBoxCode, edIWheelC11OrderCreationRequestSellerPartyAddress.postBoxCode) &&
        Objects.equals(this.subCountry, edIWheelC11OrderCreationRequestSellerPartyAddress.subCountry) &&
        Objects.equals(this.countryCode, edIWheelC11OrderCreationRequestSellerPartyAddress.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, city, district, postCode, postBoxCode, subCountry, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC11OrderCreationRequestSellerPartyAddress {\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    postBoxCode: ").append(toIndentedString(postBoxCode)).append("\n");
    sb.append("    subCountry: ").append(toIndentedString(subCountry)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
    openapiFields.add("Street");
    openapiFields.add("City");
    openapiFields.add("District");
    openapiFields.add("PostCode");
    openapiFields.add("PostBoxCode");
    openapiFields.add("SubCountry");
    openapiFields.add("CountryCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("CountryCode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC11OrderCreationRequestSellerPartyAddress
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC11OrderCreationRequestSellerPartyAddress.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC11OrderCreationRequestSellerPartyAddress is not found in the empty JSON string", EDIWheelC11OrderCreationRequestSellerPartyAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC11OrderCreationRequestSellerPartyAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC11OrderCreationRequestSellerPartyAddress` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelC11OrderCreationRequestSellerPartyAddress.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("Street") != null && !jsonObj.get("Street").isJsonNull() && !jsonObj.get("Street").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Street` to be an array in the JSON string but got `%s`", jsonObj.get("Street").toString()));
      }
      if ((jsonObj.get("City") != null && !jsonObj.get("City").isJsonNull()) && !jsonObj.get("City").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `City` to be a primitive type in the JSON string but got `%s`", jsonObj.get("City").toString()));
      }
      if ((jsonObj.get("District") != null && !jsonObj.get("District").isJsonNull()) && !jsonObj.get("District").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `District` to be a primitive type in the JSON string but got `%s`", jsonObj.get("District").toString()));
      }
      if ((jsonObj.get("PostCode") != null && !jsonObj.get("PostCode").isJsonNull()) && !jsonObj.get("PostCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PostCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PostCode").toString()));
      }
      if ((jsonObj.get("PostBoxCode") != null && !jsonObj.get("PostBoxCode").isJsonNull()) && !jsonObj.get("PostBoxCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PostBoxCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PostBoxCode").toString()));
      }
      if ((jsonObj.get("SubCountry") != null && !jsonObj.get("SubCountry").isJsonNull()) && !jsonObj.get("SubCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SubCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SubCountry").toString()));
      }
      if (!jsonObj.get("CountryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CountryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CountryCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC11OrderCreationRequestSellerPartyAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC11OrderCreationRequestSellerPartyAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC11OrderCreationRequestSellerPartyAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC11OrderCreationRequestSellerPartyAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC11OrderCreationRequestSellerPartyAddress>() {
           @Override
           public void write(JsonWriter out, EDIWheelC11OrderCreationRequestSellerPartyAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC11OrderCreationRequestSellerPartyAddress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC11OrderCreationRequestSellerPartyAddress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC11OrderCreationRequestSellerPartyAddress
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC11OrderCreationRequestSellerPartyAddress
   */
  public static EDIWheelC11OrderCreationRequestSellerPartyAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC11OrderCreationRequestSellerPartyAddress.class);
  }

  /**
   * Convert an instance of EDIWheelC11OrderCreationRequestSellerPartyAddress to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

