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


package com.michelin.adk.amn.o2c;

import com.michelin.adk.amn.ApiException;
import com.michelin.adk.amn.o2c.model.EDIWheelC11StockInquiryRequest;
import com.michelin.adk.amn.o2c.model.EDIWheelC11StockInquiryResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StockApi
 */
@Disabled
public class StockApiTest {

    private final StockApi api = new StockApi();

    /**
     * Stock inquiry for the quote of given products
     *
     * This API will give you the quote of stock for a list of given products and required quantities.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void stockAmnC11InquiryPostTest() throws ApiException {
        EDIWheelC11StockInquiryRequest edIWheelC11StockInquiryRequest = null;
        EDIWheelC11StockInquiryResponse response = api.stockAmnC11InquiryPost(edIWheelC11StockInquiryRequest);
        // TODO: test validations
    }

}
