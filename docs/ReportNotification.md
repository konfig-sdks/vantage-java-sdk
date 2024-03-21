

# ReportNotification

ReportNotification model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of the ReportNotification. |  [optional] |
|**token** | **String** |  |  [optional] |
|**costReportToken** | **String** | The token for a CostReport the ReportNotification is applied to. |  [optional] |
|**userTokens** | **List&lt;String&gt;** | The Users that receive the notification. |  [optional] |
|**recipientChannels** | **List&lt;String&gt;** | The Slack or Microsoft Teams channels that receive the notification. |  [optional] |
|**frequency** | [**FrequencyEnum**](#FrequencyEnum) | The frequency the ReportNotification is sent. |  [optional] |
|**change** | [**ChangeEnum**](#ChangeEnum) | The type of change the ReportNotification is tracking. |  [optional] |



## Enum: FrequencyEnum

| Name | Value |
|---- | -----|
| DAILY | &quot;daily&quot; |
| WEEKLY | &quot;weekly&quot; |
| MONTHLY | &quot;monthly&quot; |



## Enum: ChangeEnum

| Name | Value |
|---- | -----|
| PERCENTAGE | &quot;percentage&quot; |
| DOLLARS | &quot;dollars&quot; |



