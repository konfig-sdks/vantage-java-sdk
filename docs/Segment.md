

# Segment

Segment model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of the Segment. |  [optional] |
|**description** | **String** | The description of the Segment. |  [optional] |
|**token** | **String** |  |  [optional] |
|**parentSegmentToken** | **String** | The token of the parent Segment of this Segment. |  [optional] |
|**trackUnallocated** | **Boolean** | Track Unallocated Costs which are not assigned to any of the created Segments. |  [optional] |
|**reportSettings** | [**SegmentReportSettings**](SegmentReportSettings.md) |  |  [optional] |
|**priority** | **Integer** | Costs are assigned in priority order across all Segments with assigned filters. |  [optional] |
|**filter** | **String** | The filter applied to the Segment. Additional documentation available at https://docs.vantage.sh/vql. |  [optional] |
|**createdAt** | **String** | The date and time, in UTC, the Segment was created. ISO 8601 Formatted. |  [optional] |
|**workspaceToken** | **String** | The token for the Workspace the Segment is a part of. |  [optional] |



