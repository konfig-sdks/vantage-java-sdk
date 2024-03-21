

# PutReportNotifications

Update a ReportNotification.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of the ReportNotification. |  [optional] |
|**costReportToken** | **String** | The CostReport token. |  [optional] |
|**userTokens** | **List&lt;String&gt;** | The Users that receive the notification. |  [optional] |
|**recipientChannels** | **List&lt;String&gt;** | The Slack or Microsoft Teams channels that receive the notification. |  [optional] |
|**frequency** | **String** | The frequency the ReportNotification is sent. Possible values: daily, weekly, monthly. |  [optional] |
|**change** | **String** | The type of change the ReportNotification is tracking. Possible values: percentage, dollars. |  [optional] |



