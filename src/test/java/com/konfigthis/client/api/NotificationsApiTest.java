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
import com.konfigthis.client.model.PostReportNotifications;
import com.konfigthis.client.model.PutReportNotifications;
import com.konfigthis.client.model.ReportNotification;
import com.konfigthis.client.model.ReportNotifications;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotificationsApi
 */
@Disabled
public class NotificationsApiTest {

    private static NotificationsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new NotificationsApi(apiClient);
    }

    /**
     * Create a ReportNotification.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createReportNotificationTest() throws ApiException {
        String title = null;
        String costReportToken = null;
        String frequency = null;
        String change = null;
        String workspaceToken = null;
        List<String> userTokens = null;
        List<String> recipientChannels = null;
        ReportNotification response = api.createReportNotification(title, costReportToken, frequency, change)
                .workspaceToken(workspaceToken)
                .userTokens(userTokens)
                .recipientChannels(recipientChannels)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a ReportNotification.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteReportNotificationTest() throws ApiException {
        String reportNotificationToken = null;
        ReportNotification response = api.deleteReportNotification(reportNotificationToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Return all ReportNotifications.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllReportNotificationsTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        ReportNotifications response = api.getAllReportNotifications()
                .page(page)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Return a ReportNotification.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getReportNotificationTest() throws ApiException {
        String reportNotificationToken = null;
        ReportNotification response = api.getReportNotification(reportNotificationToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a ReportNotification.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateReportNotificationTest() throws ApiException {
        String reportNotificationToken = null;
        String title = null;
        String costReportToken = null;
        List<String> userTokens = null;
        List<String> recipientChannels = null;
        String frequency = null;
        String change = null;
        ReportNotification response = api.updateReportNotification(reportNotificationToken)
                .title(title)
                .costReportToken(costReportToken)
                .userTokens(userTokens)
                .recipientChannels(recipientChannels)
                .frequency(frequency)
                .change(change)
                .execute();
        // TODO: test validations
    }

}
