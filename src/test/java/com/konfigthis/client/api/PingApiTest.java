/*
 * Vantage
 * Vantage API
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@vantage.sh
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PingApi
 */
@Disabled
public class PingApiTest {

    private static PingApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PingApi(apiClient);
    }

    /**
     * This is a health check endpoint that can be used to determine Vantage API healthiness. It will return 200 if everything is running smoothly.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void healthCheckTest() throws ApiException {
        api.healthCheck()
                .execute();
        // TODO: test validations
    }

}
