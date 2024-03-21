

# PostDashboards

Create a Dashboard.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of the Dashboard. |  |
|**widgetTokens** | **List&lt;String&gt;** | The tokens of the widgets to add to the Dashboard. Currently only supports CostReport tokens. |  [optional] |
|**savedFilterTokens** | **List&lt;String&gt;** | The tokens of the Saved Filters used in the Dashboard. |  [optional] |
|**dateBin** | [**DateBinEnum**](#DateBinEnum) | Determines how to group costs in the Dashboard. |  [optional] |
|**dateInterval** | [**DateIntervalEnum**](#DateIntervalEnum) | Determines the date range in the Dashboard. Incompatible with &#39;start_date&#39; and &#39;end_date&#39; parameters. |  [optional] |
|**startDate** | **String** | The start date for the date range for costs in the Dashboard. ISO 8601 Formatted. Incompatible with &#39;date_interval&#39; parameter. |  [optional] |
|**endDate** | **String** | The end date for the date range for costs in the Dashboard. ISO 8601 Formatted. Incompatible with &#39;date_interval&#39; parameter. |  |
|**workspaceToken** | **String** | The token of the Workspace to add the Dashboard to. Required if the API token is associated with multiple Workspaces. |  [optional] |



## Enum: DateBinEnum

| Name | Value |
|---- | -----|
| CUMULATIVE | &quot;cumulative&quot; |
| DAY | &quot;day&quot; |
| WEEK | &quot;week&quot; |
| MONTH | &quot;month&quot; |



## Enum: DateIntervalEnum

| Name | Value |
|---- | -----|
| THIS_MONTH | &quot;this_month&quot; |
| LAST_7_DAYS | &quot;last_7_days&quot; |
| LAST_30_DAYS | &quot;last_30_days&quot; |
| LAST_MONTH | &quot;last_month&quot; |
| LAST_3_MONTHS | &quot;last_3_months&quot; |
| LAST_6_MONTHS | &quot;last_6_months&quot; |
| CUSTOM | &quot;custom&quot; |
| LAST_12_MONTHS | &quot;last_12_months&quot; |
| LAST_24_MONTHS | &quot;last_24_months&quot; |
| LAST_36_MONTHS | &quot;last_36_months&quot; |
| NEXT_MONTH | &quot;next_month&quot; |
| NEXT_3_MONTHS | &quot;next_3_months&quot; |
| NEXT_6_MONTHS | &quot;next_6_months&quot; |
| NEXT_12_MONTHS | &quot;next_12_months&quot; |



