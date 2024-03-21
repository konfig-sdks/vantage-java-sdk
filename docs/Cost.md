

# Cost


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **List&lt;String&gt;** | The tag pairs attached to the cost that was incurred. |  [optional] |
|**links** | **Object** |  |  [optional] |
|**accruedAt** | **String** | The date the cost was accrued. ISO 8601 Formatted. |  [optional] |
|**amount** | **String** | The amount of the cost. |  [optional] |
|**currency** | **String** | The currency of the cost. |  [optional] |
|**provider** | [**ProviderEnum**](#ProviderEnum) | The cost provider which incurred the cost. |  [optional] |
|**billingAccountId** | **String** | The cost provider&#39;s billing account id that incurred the cost. |  [optional] |
|**accountId** | **String** | The cost provider&#39;s account id that incurred the cost. |  [optional] |
|**service** | **String** | The service which incurred the cost. |  [optional] |
|**region** | **String** | The region which incurred the cost. |  [optional] |
|**resourceId** | **String** | The resource id which incurred the cost. |  [optional] |
|**tag** | **String** | The tag attached to the cost that was incurred. DEPRECATED: does not support multiple tags. |  [optional] |
|**costCategory** | **String** | The category for the cost. |  [optional] |
|**costSubcategory** | **String** | The subcategory for the cost. |  [optional] |



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| AWS | &quot;aws&quot; |
| AZURE | &quot;azure&quot; |
| GCP | &quot;gcp&quot; |
| SNOWFLAKE | &quot;snowflake&quot; |
| DATABRICKS | &quot;databricks&quot; |
| MONGO | &quot;mongo&quot; |
| DATADOG | &quot;datadog&quot; |
| FASTLY | &quot;fastly&quot; |
| NEW_RELIC | &quot;new_relic&quot; |
| OPENCOST | &quot;opencost&quot; |
| OPEN_AI | &quot;open_ai&quot; |
| ORACLE | &quot;oracle&quot; |
| CONFLUENT | &quot;confluent&quot; |
| PLANETSCALE | &quot;planetscale&quot; |
| CORALOGIX | &quot;coralogix&quot; |
| KUBERNETES | &quot;kubernetes&quot; |



