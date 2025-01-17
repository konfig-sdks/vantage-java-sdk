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
import com.konfigthis.client.model.PostTeams;
import com.konfigthis.client.model.PutTeams;
import com.konfigthis.client.model.Team;
import com.konfigthis.client.model.Teams;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TeamsApi
 */
@Disabled
public class TeamsApiTest {

    private static TeamsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TeamsApi(apiClient);
    }

    /**
     * Create a new Team.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewTeamTest() throws ApiException {
        String name = null;
        String description = null;
        List<String> workspaceTokens = null;
        List<String> userTokens = null;
        List<String> userEmails = null;
        String role = null;
        Team response = api.createNewTeam(name)
                .description(description)
                .workspaceTokens(workspaceTokens)
                .userTokens(userTokens)
                .userEmails(userEmails)
                .role(role)
                .execute();
        // TODO: test validations
    }

    /**
     * Return a specific Team.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificTeamTest() throws ApiException {
        String teamToken = null;
        Team response = api.getSpecificTeam(teamToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Return all Teams that the current API token has access to.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAccessibleTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        Teams response = api.listAccessible()
                .page(page)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a Team.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeTeamTest() throws ApiException {
        String teamToken = null;
        Team response = api.removeTeam(teamToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a Team.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTeamTest() throws ApiException {
        String teamToken = null;
        String description = null;
        String name = null;
        List<String> workspaceTokens = null;
        List<String> userTokens = null;
        List<String> userEmails = null;
        String role = null;
        Team response = api.updateTeam(teamToken)
                .description(description)
                .name(name)
                .workspaceTokens(workspaceTokens)
                .userTokens(userTokens)
                .userEmails(userEmails)
                .role(role)
                .execute();
        // TODO: test validations
    }

}
