package com.konfigthis.client;

import com.konfigthis.client.api.AccessGrantsApi;
import com.konfigthis.client.api.BusinessMetricsApi;
import com.konfigthis.client.api.CostsApi;
import com.konfigthis.client.api.DashboardsApi;
import com.konfigthis.client.api.FiltersApi;
import com.konfigthis.client.api.FoldersApi;
import com.konfigthis.client.api.NotificationsApi;
import com.konfigthis.client.api.PingApi;
import com.konfigthis.client.api.PricesApi;
import com.konfigthis.client.api.SegmentsApi;
import com.konfigthis.client.api.TeamsApi;
import com.konfigthis.client.api.UsersApi;
import com.konfigthis.client.api.WorkspacesApi;

public class Vantage {
    private ApiClient apiClient;
    public final AccessGrantsApi accessGrants;
    public final BusinessMetricsApi businessMetrics;
    public final CostsApi costs;
    public final DashboardsApi dashboards;
    public final FiltersApi filters;
    public final FoldersApi folders;
    public final NotificationsApi notifications;
    public final PingApi ping;
    public final PricesApi prices;
    public final SegmentsApi segments;
    public final TeamsApi teams;
    public final UsersApi users;
    public final WorkspacesApi workspaces;

    public Vantage() {
        this(null);
    }

    public Vantage(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.accessGrants = new AccessGrantsApi(this.apiClient);
        this.businessMetrics = new BusinessMetricsApi(this.apiClient);
        this.costs = new CostsApi(this.apiClient);
        this.dashboards = new DashboardsApi(this.apiClient);
        this.filters = new FiltersApi(this.apiClient);
        this.folders = new FoldersApi(this.apiClient);
        this.notifications = new NotificationsApi(this.apiClient);
        this.ping = new PingApi(this.apiClient);
        this.prices = new PricesApi(this.apiClient);
        this.segments = new SegmentsApi(this.apiClient);
        this.teams = new TeamsApi(this.apiClient);
        this.users = new UsersApi(this.apiClient);
        this.workspaces = new WorkspacesApi(this.apiClient);
    }

}
