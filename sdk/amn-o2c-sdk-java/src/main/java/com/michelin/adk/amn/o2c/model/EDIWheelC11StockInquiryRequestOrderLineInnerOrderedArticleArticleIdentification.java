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
import com.michelin.adk.amn.o2c.model.BuyersArticleIDIsUsed;
import com.michelin.adk.amn.o2c.model.ManufacturersArticleIDIsUsed;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.michelin.adk.amn.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class EDIWheelC11StockInquiryRequestOrderLineInnerOrderedArticleArticleIdentification extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(EDIWheelC11StockInquiryRequestOrderLineInnerOrderedArticleArticleIdentification.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!EDIWheelC11StockInquiryRequestOrderLineInnerOrderedArticleArticleIdentification.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'EDIWheelC11StockInquiryRequestOrderLineInnerOrderedArticleArticleIdentification' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ManufacturersArticleIDIsUsed> adapterManufacturersArticleIDIsUsed = gson.getDelegateAdapter(this, TypeToken.get(ManufacturersArticleIDIsUsed.class));
            final TypeAdapter<BuyersArticleIDIsUsed> adapterBuyersArticleIDIsUsed = gson.getDelegateAdapter(this, TypeToken.get(BuyersArticleIDIsUsed.class));

            return (TypeAdapter<T>) new TypeAdapter<EDIWheelC11StockInquiryRequestOrderLineInnerOrderedArticleArticleIdentification>() {
                @Override
                public void write(JsonWriter out, EDIWheelC11StockInquiryRequestOrderLineInnerOrderedArticleArticleIdentification value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ManufacturersArticleIDIsUsed`
                    if (value.getActualInstance() instanceof ManufacturersArticleIDIsUsed) {
                        JsonElement element = adapterManufacturersArticleIDIsUsed.toJsonTree((ManufacturersArticleIDIsUsed)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `BuyersArticleIDIsUsed`
                    if (value.getActualInstance() instanceof BuyersArticleIDIsUsed) {
                        JsonElement element = adapterBuyersArticleIDIsUsed.toJsonTree((BuyersArticleIDIsUsed)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: BuyersArticleIDIsUsed, ManufacturersArticleIDIsUsed");
                }

                @Override
                public EDIWheelC11StockInquiryRequestOrderLineInnerOrderedArticleArticleIdentification read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ManufacturersArticleIDIsUsed
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ManufacturersArticleIDIsUsed.validateJsonElement(jsonElement);
                        actualAdapter = adapterManufacturersArticleIDIsUsed;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ManufacturersArticleIDIsUsed'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ManufacturersArticleIDIsUsed failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ManufacturersArticleIDIsUsed'", e);
                    }
                    // deserialize BuyersArticleIDIsUsed
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BuyersArticleIDIsUsed.validateJsonElement(jsonElement);
                        actualAdapter = adapterBuyersArticleIDIsUsed;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'BuyersArticleIDIsUsed'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for BuyersArticleIDIsUsed failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'BuyersArticleIDIsUsed'", e);
                    }

                    if (match == 1) {
                        EDIWheelC11StockInquiryRequestOrderLineInnerOrderedArticleArticleIdentification ret = new EDIWheelC11StockInquiryRequestOrderLineInnerOrderedArticleArticleIdentification();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for EDIWheelC11StockInquiryRequestOrderLineInnerOrderedArticleArticleIdentification: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public EDIWheelC11StockInquiryRequestOrderLineInnerOrderedArticleArticleIdentification() {
        super("oneOf", Boolean.FALSE);
    }

    public EDIWheelC11StockInquiryRequestOrderLineInnerOrderedArticleArticleIdentification(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ManufacturersArticleIDIsUsed", ManufacturersArticleIDIsUsed.class);
        schemas.put("BuyersArticleIDIsUsed", BuyersArticleIDIsUsed.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return EDIWheelC11StockInquiryRequestOrderLineInnerOrderedArticleArticleIdentification.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * BuyersArticleIDIsUsed, ManufacturersArticleIDIsUsed
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ManufacturersArticleIDIsUsed) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof BuyersArticleIDIsUsed) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be BuyersArticleIDIsUsed, ManufacturersArticleIDIsUsed");
    }

    /**
     * Get the actual instance, which can be the following:
     * BuyersArticleIDIsUsed, ManufacturersArticleIDIsUsed
     *
     * @return The actual instance (BuyersArticleIDIsUsed, ManufacturersArticleIDIsUsed)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ManufacturersArticleIDIsUsed`. If the actual instance is not `ManufacturersArticleIDIsUsed`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ManufacturersArticleIDIsUsed`
     * @throws ClassCastException if the instance is not `ManufacturersArticleIDIsUsed`
     */
    public ManufacturersArticleIDIsUsed getManufacturersArticleIDIsUsed() throws ClassCastException {
        return (ManufacturersArticleIDIsUsed)super.getActualInstance();
    }

    /**
     * Get the actual instance of `BuyersArticleIDIsUsed`. If the actual instance is not `BuyersArticleIDIsUsed`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BuyersArticleIDIsUsed`
     * @throws ClassCastException if the instance is not `BuyersArticleIDIsUsed`
     */
    public BuyersArticleIDIsUsed getBuyersArticleIDIsUsed() throws ClassCastException {
        return (BuyersArticleIDIsUsed)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to EDIWheelC11StockInquiryRequestOrderLineInnerOrderedArticleArticleIdentification
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with ManufacturersArticleIDIsUsed
        try {
            ManufacturersArticleIDIsUsed.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ManufacturersArticleIDIsUsed failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with BuyersArticleIDIsUsed
        try {
            BuyersArticleIDIsUsed.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for BuyersArticleIDIsUsed failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for EDIWheelC11StockInquiryRequestOrderLineInnerOrderedArticleArticleIdentification with oneOf schemas: BuyersArticleIDIsUsed, ManufacturersArticleIDIsUsed. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of EDIWheelC11StockInquiryRequestOrderLineInnerOrderedArticleArticleIdentification given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of EDIWheelC11StockInquiryRequestOrderLineInnerOrderedArticleArticleIdentification
     * @throws IOException if the JSON string is invalid with respect to EDIWheelC11StockInquiryRequestOrderLineInnerOrderedArticleArticleIdentification
     */
    public static EDIWheelC11StockInquiryRequestOrderLineInnerOrderedArticleArticleIdentification fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, EDIWheelC11StockInquiryRequestOrderLineInnerOrderedArticleArticleIdentification.class);
    }

    /**
     * Convert an instance of EDIWheelC11StockInquiryRequestOrderLineInnerOrderedArticleArticleIdentification to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

