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
import com.michelin.adk.amn.o2c.model.EDIWheelC11OrderCreationResponseChargeChargeAmount;
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
 * EDIWheelC11OrderCreationResponseCharge
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-17T01:25:07.723106500-05:00[America/Toronto]", comments = "Generator version: 7.10.0")
public class EDIWheelC11OrderCreationResponseCharge {
  public static final String SERIALIZED_NAME_CHARGE_CATEGORY = "ChargeCategory";
  @SerializedName(SERIALIZED_NAME_CHARGE_CATEGORY)
  @javax.annotation.Nonnull
  private String chargeCategory;

  public static final String SERIALIZED_NAME_CHARGE_AMOUNT = "ChargeAmount";
  @SerializedName(SERIALIZED_NAME_CHARGE_AMOUNT)
  @javax.annotation.Nullable
  private EDIWheelC11OrderCreationResponseChargeChargeAmount chargeAmount;

  public static final String SERIALIZED_NAME_CHARGE_PERCENT = "ChargePercent";
  @SerializedName(SERIALIZED_NAME_CHARGE_PERCENT)
  @javax.annotation.Nullable
  private String chargePercent;

  public EDIWheelC11OrderCreationResponseCharge() {
  }

  public EDIWheelC11OrderCreationResponseCharge chargeCategory(@javax.annotation.Nonnull String chargeCategory) {
    this.chargeCategory = chargeCategory;
    return this;
  }

  /**
   * Get chargeCategory
   * @return chargeCategory
   */
  @javax.annotation.Nonnull
  public String getChargeCategory() {
    return chargeCategory;
  }

  public void setChargeCategory(@javax.annotation.Nonnull String chargeCategory) {
    this.chargeCategory = chargeCategory;
  }


  public EDIWheelC11OrderCreationResponseCharge chargeAmount(@javax.annotation.Nullable EDIWheelC11OrderCreationResponseChargeChargeAmount chargeAmount) {
    this.chargeAmount = chargeAmount;
    return this;
  }

  /**
   * Get chargeAmount
   * @return chargeAmount
   */
  @javax.annotation.Nullable
  public EDIWheelC11OrderCreationResponseChargeChargeAmount getChargeAmount() {
    return chargeAmount;
  }

  public void setChargeAmount(@javax.annotation.Nullable EDIWheelC11OrderCreationResponseChargeChargeAmount chargeAmount) {
    this.chargeAmount = chargeAmount;
  }


  public EDIWheelC11OrderCreationResponseCharge chargePercent(@javax.annotation.Nullable String chargePercent) {
    this.chargePercent = chargePercent;
    return this;
  }

  /**
   * Get chargePercent
   * @return chargePercent
   */
  @javax.annotation.Nullable
  public String getChargePercent() {
    return chargePercent;
  }

  public void setChargePercent(@javax.annotation.Nullable String chargePercent) {
    this.chargePercent = chargePercent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDIWheelC11OrderCreationResponseCharge edIWheelC11OrderCreationResponseCharge = (EDIWheelC11OrderCreationResponseCharge) o;
    return Objects.equals(this.chargeCategory, edIWheelC11OrderCreationResponseCharge.chargeCategory) &&
        Objects.equals(this.chargeAmount, edIWheelC11OrderCreationResponseCharge.chargeAmount) &&
        Objects.equals(this.chargePercent, edIWheelC11OrderCreationResponseCharge.chargePercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeCategory, chargeAmount, chargePercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDIWheelC11OrderCreationResponseCharge {\n");
    sb.append("    chargeCategory: ").append(toIndentedString(chargeCategory)).append("\n");
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
    sb.append("    chargePercent: ").append(toIndentedString(chargePercent)).append("\n");
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
    openapiFields.add("ChargeCategory");
    openapiFields.add("ChargeAmount");
    openapiFields.add("ChargePercent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ChargeCategory");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EDIWheelC11OrderCreationResponseCharge
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EDIWheelC11OrderCreationResponseCharge.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EDIWheelC11OrderCreationResponseCharge is not found in the empty JSON string", EDIWheelC11OrderCreationResponseCharge.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EDIWheelC11OrderCreationResponseCharge.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EDIWheelC11OrderCreationResponseCharge` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EDIWheelC11OrderCreationResponseCharge.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("ChargeCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ChargeCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ChargeCategory").toString()));
      }
      // validate the optional field `ChargeAmount`
      if (jsonObj.get("ChargeAmount") != null && !jsonObj.get("ChargeAmount").isJsonNull()) {
        EDIWheelC11OrderCreationResponseChargeChargeAmount.validateJsonElement(jsonObj.get("ChargeAmount"));
      }
      if ((jsonObj.get("ChargePercent") != null && !jsonObj.get("ChargePercent").isJsonNull()) && !jsonObj.get("ChargePercent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ChargePercent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ChargePercent").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EDIWheelC11OrderCreationResponseCharge.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EDIWheelC11OrderCreationResponseCharge' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EDIWheelC11OrderCreationResponseCharge> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EDIWheelC11OrderCreationResponseCharge.class));

       return (TypeAdapter<T>) new TypeAdapter<EDIWheelC11OrderCreationResponseCharge>() {
           @Override
           public void write(JsonWriter out, EDIWheelC11OrderCreationResponseCharge value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EDIWheelC11OrderCreationResponseCharge read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EDIWheelC11OrderCreationResponseCharge given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EDIWheelC11OrderCreationResponseCharge
   * @throws IOException if the JSON string is invalid with respect to EDIWheelC11OrderCreationResponseCharge
   */
  public static EDIWheelC11OrderCreationResponseCharge fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EDIWheelC11OrderCreationResponseCharge.class);
  }

  /**
   * Convert an instance of EDIWheelC11OrderCreationResponseCharge to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

