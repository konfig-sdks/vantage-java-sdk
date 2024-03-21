

# Dashboard

Dashboard model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of the Dashboard. |  [optional] |
|**token** | **String** |  |  [optional] |
|**widgetTokens** | **List&lt;String&gt;** | The tokens of the widgets displayed in the Dashboard. Currently only supports CostReport tokens. |  [optional] |
|**savedFilterTokens** | **List&lt;String&gt;** | The tokens of the Saved Filters used in the Dashboard. |  [optional] |
|**dateBin** | [**DateBinEnum**](#DateBinEnum) | Determines how to group costs in the Dashboard. |  [optional] |
|**dateInterval** | [**DateIntervalEnum**](#DateIntervalEnum) | Determines the date range in the Dashboard. Guaranteed to be set to &#39;custom&#39; if &#39;start_date&#39; and &#39;end_date&#39; are set. |  [optional] |
|**startDate** | **String** | The start date for the date range for CostReports in the Dashboard. ISO 8601 Formatted. Overwrites &#39;date_interval&#39; if set. |  [optional] |
|**endDate** | **String** | The end date for the date range for CostReports in the Dashboard. ISO 8601 Formatted. Overwrites &#39;date_interval&#39; if set. |  [optional] |
|**createdAt** | **String** | The date and time, in UTC, the Dashboard was created. ISO 8601 Formatted. |  [optional] |
|**updatedAt** | **String** | The date and time, in UTC, the Dashboard was created. ISO 8601 Formatted. |  [optional] |
|**workspaceToken** | **String** | The token for the Workspace the Dashboard is a part of. |  [optional] |



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



