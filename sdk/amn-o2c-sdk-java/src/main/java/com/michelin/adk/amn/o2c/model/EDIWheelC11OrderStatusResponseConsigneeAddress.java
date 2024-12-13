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
import com.michelin.adk.amn.o2c.model.EDIWheelC10DesadvResponseDesadvInnerConsigneeAddressGeolocation;
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
 * EDIWheelC11OrderStatusResponseConsigneeAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T06:44:55.014855667Z[GMT]", comments = "Generator version: 7.9.0")
public class EDIWheelC11OrderStatusResponseConsigneeAddress {
  public static final String SERIALIZED_NAME_STREET = "Street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private List<String> street = new ArrayList<>();

  public static final String SERIALIZED_NAME_CITY = "City";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_DISTRICT = "District";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private String district;

  public static final String SERIALIZED_NAME_POST_CODE = "PostCode";
  @SerializedName(SERIALIZED_NAME_POST_CODE)
  private String postCode;

  public static final String SERIALIZED_NAME_POST_BOX_CODE = "PostBoxCode";
  @SerializedName(SERIALIZED_NAME_POST_BOX_CODE)
  private String postBoxCode;

  public static final String SERIALIZED_NAME_SUB_COUNTRY = "SubCountry";
  @SerializedName(SERIALIZED_NAME_SUB_COUNTRY)
  private String subCountry;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "CountryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_GEOLOCATION = "Geolocation";
  @SerializedName(SERIALIZED_NAME_GEOLOCATION)
  private EDIWheelC10DesadvResponseDesadvInnerConsigneeAddressGeolocation geolocation;

  public EDIWheelC11OrderStatusResponseConsigneeAddress() {
  }

  public EDIWheelC11OrderStatusResponseConsigneeAddress street(List<String> street) {
    this.street = street;
    return this;
  }

  public EDIWheelC11OrderStatusResponseConsigneeAddress addStreetItem(String streetItem) {
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
  @javax.annotation.Nonnull
  public List<String> getStreet() {
    return street;
  }

  public void setStreet(List<String> street) {
    this.street = street;
  }


  public EDIWheelC11OrderStatusResponseConsigneeAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   */
  @javax.annotation.Nonnull
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public EDIWheelC11OrderStatusResponseConsigneeAddress district(String district) {
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

  public void setDistrict(String district) {
    this.district = district;
  }


  public EDIWheelC11OrderStatusResponseConsigneeAddress postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Get postCode
   * @return postCode
   */
  @javax.annotation.Nonnull
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }


  public EDIWheelC11OrderStatusResponseConsigneeAddress postBoxCode(String postBoxCode) {
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

  public void setPostBoxCode(String postBoxCode) {
    this.postBoxCode = postBoxCode;
  }


  public EDIWheelC11OrderStatusResponseConsigneeAddress subCountry(String subCountry) {
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

  public void setSubCountry(String subCountry) {
    this.subCountry = subCountry;
  }


  public EDIWheelC11OrderStatusResponseConsigneeAddress countryCode(String countryCode) {
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

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public EDIWheelC11OrderStatusResponseConsigneeAddress geolocation(EDIWheelC10DesadvResponseDesadvInnerConsigneeAddressGeolocation geolocation) {
    this.geolocation = geolocation;
    return this;
  }

  /**
   * Get geolocation
   * @return geolocation
   */
  @javax.annotation.Nullable
  public EDIWheelC10DesadvResponseDesadvInnerConsigneeAddressGeolocation getGeolocation() {
    return geolocation;
  }

  public void setGeolocation(EDIWheelC10DesadvResponseDesadvInnerConsigneeAddressGeolocation geolocation) {
    this.geolocation = geolocation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC11OrderStatusResponseConsigneeAddress edIWheelC11OrderStatusResponseConsigneeAddress = (EDIWheelC11OrderStatusResponseConsigneeAddress) o;
    return Objects.equals(this.street, edIWheelC11OrderStatusResponseConsigneeAddress.street) &&
        Objects.equals(this.city, edIWheelC11OrderStatusResponseConsigneeAddress.city) &&
        Objects.equals(this.district, edIWheelC11OrderStatusResponseConsigneeAddress.district) &&
        Objects.equals(this.postCode, edIWheelC11OrderStatusResponseConsigneeAddress.postCode) &&
        Objects.equals(this.postBoxCode, edIWheelC11OrderStatusResponseConsigneeAddress.postBoxCode) &&
        Objects.equals(this.subCountry, edIWheelC11OrderStatusResponseConsigneeAddress.subCountry) &&
        Objects.equals(this.countryCode, edIWheelC11OrderStatusResponseConsigneeAddress.countryCode) &&
        Objects.equals(this.geolocation, edIWheelC11OrderStatusResponseConsigneeAddress.geolocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, city, district, postCode, postBoxCode, subCountry, countryCode, geolocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC11OrderStatusResponseConsigneeAddress {\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    postBoxCode: ").append(toIndentedString(postBoxCode)).append("\n");
    sb.append("    subCountry: ").append(toIndentedString(subCountry)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
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
    openapiFields.add("Geolocation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Street");
    openapiRequiredFields.add("City");
    openapiRequiredFields.add("PostCode");
    openapiRequiredFields.add("CountryCode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC11OrderStatusResponseConsigneeAddress
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC11OrderStatusResponseConsigneeAddress.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC11OrderStatusResponseConsigneeAddress is not found in the empty JSON string", EDIWheelC11OrderStatusResponseConsigneeAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC11OrderStatusResponseConsigneeAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC11OrderStatusResponseConsigneeAddress` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelC11OrderStatusResponseConsigneeAddress.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("Street") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("Street").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Street` to be an array in the JSON string but got `%s`", jsonObj.get("Street").toString()));
      }
      if (!jsonObj.get("City").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `City` to be a primitive type in the JSON string but got `%s`", jsonObj.get("City").toString()));
      }
      if ((jsonObj.get("District") != null && !jsonObj.get("District").isJsonNull()) && !jsonObj.get("District").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `District` to be a primitive type in the JSON string but got `%s`", jsonObj.get("District").toString()));
      }
      if (!jsonObj.get("PostCode").isJsonPrimitive()) {
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
      // validate the optional field `Geolocation`
      if (jsonObj.get("Geolocation") != null && !jsonObj.get("Geolocation").isJsonNull()) {
        EDIWheelC10DesadvResponseDesadvInnerConsigneeAddressGeolocation.validateJsonElement(jsonObj.get("Geolocation"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC11OrderStatusResponseConsigneeAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC11OrderStatusResponseConsigneeAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC11OrderStatusResponseConsigneeAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC11OrderStatusResponseConsigneeAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC11OrderStatusResponseConsigneeAddress>() {
           @Override
           public void write(JsonWriter out, EDIWheelC11OrderStatusResponseConsigneeAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC11OrderStatusResponseConsigneeAddress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC11OrderStatusResponseConsigneeAddress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC11OrderStatusResponseConsigneeAddress
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC11OrderStatusResponseConsigneeAddress
   */
  public static EDIWheelC11OrderStatusResponseConsigneeAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC11OrderStatusResponseConsigneeAddress.class);
  }

  /**
   * Convert an instance of EDIWheelC11OrderStatusResponseConsigneeAddress to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

