

# PostCostReports

Create a CostReport.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of the CostReport. |  |
|**workspaceToken** | **String** | The token of the Workspace to add the Cost Report to. Ignored if &#39;folder_token&#39; is set. Required if the API token is associated with multiple Workspaces. |  [optional] |
|**groupings** | **String** | Grouping values for aggregating costs on the report. Valid groupings: account_id, billing_account_id, charge_type, cost_category, cost_subcategory, provider, region, resource_id, service, tagged, tag:&lt;tag_value&gt;. If providing multiple groupings, join as comma separated values: groupings&#x3D;provider,service,region |  [optional] |
|**filter** | **String** | The filter query language to apply to the CostReport. Additional documentation available at https://docs.vantage.sh/vql. |  [optional] |
|**savedFilterTokens** | **List&lt;String&gt;** | The tokens of the SavedFilters to apply to the CostReport. |  [optional] |
|**businessMetricTokensWithMetadata** | [**List&lt;PostCostReportsBusinessMetricTokensWithMetadataInner&gt;**](PostCostReportsBusinessMetricTokensWithMetadataInner.md) | The tokens for any BusinessMetrics to attach to the CostReport, and the unit scale. |  [optional] |
|**folderToken** | **String** | The token of the Folder to add the CostReport to. Determines the Workspace the report is assigned to. |  [optional] |
|**settings** | [**PostCostReportsSettings**](PostCostReportsSettings.md) |  |  [optional] |



