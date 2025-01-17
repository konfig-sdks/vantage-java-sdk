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
import com.konfigthis.client.model.Dashboard;
import com.konfigthis.client.model.Dashboards;
import com.konfigthis.client.model.PostDashboards;
import com.konfigthis.client.model.PutDashboards;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DashboardsApi
 */
@Disabled
public class DashboardsApiTest {

    private static DashboardsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new DashboardsApi(apiClient);
    }

    /**
     * Create a Dashboard.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createDashboardTest() throws ApiException {
        String title = null;
        String endDate = null;
        List<String> widgetTokens = null;
        List<String> savedFilterTokens = null;
        String dateBin = null;
        String dateInterval = null;
        String startDate = null;
        String workspaceToken = null;
        Dashboard response = api.createDashboard(title, endDate)
                .widgetTokens(widgetTokens)
                .savedFilterTokens(savedFilterTokens)
                .dateBin(dateBin)
                .dateInterval(dateInterval)
                .startDate(startDate)
                .workspaceToken(workspaceToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a Dashboard.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDashboardTest() throws ApiException {
        String dashboardToken = null;
        Dashboard response = api.deleteDashboard(dashboardToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Return all Dashboards.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        Dashboards response = api.getAll()
                .page(page)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Return a specific Dashboard.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificDashboardTest() throws ApiException {
        String dashboardToken = null;
        Dashboard response = api.getSpecificDashboard(dashboardToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a Dashboard.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateDashboardTest() throws ApiException {
        String endDate = null;
        String dashboardToken = null;
        String title = null;
        List<String> widgetTokens = null;
        List<String> savedFilterTokens = null;
        String dateBin = null;
        String dateInterval = null;
        String startDate = null;
        Dashboard response = api.updateDashboard(endDate, dashboardToken)
                .title(title)
                .widgetTokens(widgetTokens)
                .savedFilterTokens(savedFilterTokens)
                .dateBin(dateBin)
                .dateInterval(dateInterval)
                .startDate(startDate)
                .execute();
        // TODO: test validations
    }

}
