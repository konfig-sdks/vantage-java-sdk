

# PostSegments

Create a Segment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of the Segment. |  |
|**description** | **String** | The description of the Segment. |  [optional] |
|**priority** | **Integer** | The priority of the Segment. |  [optional] |
|**trackUnallocated** | **Boolean** | Track Unallocated Costs which are not assigned to any of the created Segments. |  [optional] |
|**reportSettings** | [**PostSegmentsReportSettings**](PostSegmentsReportSettings.md) |  |  [optional] |
|**workspaceToken** | **String** | The token of the Workspace to add the Segment to. Ignored if &#39;segment_token&#39; is set. Required if the API token is associated with multiple Workspaces. |  [optional] |
|**filter** | **String** | The filter query language to apply to the Segment. Additional documentation available at https://docs.vantage.sh/vql. |  [optional] |
|**parentSegmentToken** | **String** | The token of the parent Segment this new Segment belongs to. Determines the Workspace the segment is assigned to. |  [optional] |



