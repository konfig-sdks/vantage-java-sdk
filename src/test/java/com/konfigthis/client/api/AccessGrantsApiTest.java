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
import com.konfigthis.client.model.AccessGrant;
import com.konfigthis.client.model.AccessGrants;
import com.konfigthis.client.model.PostAccessGrants;
import com.konfigthis.client.model.PutAccessGrants;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccessGrantsApi
 */
@Disabled
public class AccessGrantsApiTest {

    private static AccessGrantsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AccessGrantsApi(apiClient);
    }

    /**
     * Create an Access Grant.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createGrantTest() throws ApiException {
        String resourceToken = null;
        String teamToken = null;
        String access = null;
        AccessGrant response = api.createGrant(resourceToken, teamToken)
                .access(access)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete an Access Grant.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        String accessGrantToken = null;
        AccessGrant response = api.delete(accessGrantToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Return a specific Access Grant.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificGrantTest() throws ApiException {
        String accessGrantToken = null;
        AccessGrant response = api.getSpecificGrant(accessGrantToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Return all Access Grants that the current API token has access to.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAccessibleTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        AccessGrants response = api.listAccessible()
                .page(page)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an AccessGrant.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateGrantTokenTest() throws ApiException {
        String access = null;
        String accessGrantToken = null;
        AccessGrant response = api.updateGrantToken(access, accessGrantToken)
                .execute();
        // TODO: test validations
    }

}