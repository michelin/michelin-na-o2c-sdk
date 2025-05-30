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


package com.michelin.adk.amn.o2c;

import com.michelin.adk.amn.ApiException;
import com.michelin.adk.amn.o2c.model.EDIWheelC10DesadvRequest;
import com.michelin.adk.amn.o2c.model.EDIWheelC10DesadvResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AsnApi
 */
@Disabled
public class AsnApiTest {

    private final AsnApi api = new AsnApi();

    /**
     * Get Advanced Shipping Notice
     *
     * Get Advanced Shipping Notice
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void desadvAmnC10DesadvPostTest() throws ApiException {
        EDIWheelC10DesadvRequest edIWheelC10DesadvRequest = null;
        EDIWheelC10DesadvResponse response = api.desadvAmnC10DesadvPost(edIWheelC10DesadvRequest);
        // TODO: test validations
    }

}
