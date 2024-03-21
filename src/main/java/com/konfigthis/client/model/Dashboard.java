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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Dashboard model
 */
@ApiModel(description = "Dashboard model")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Dashboard {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_WIDGET_TOKENS = "widget_tokens";
  @SerializedName(SERIALIZED_NAME_WIDGET_TOKENS)
  private List<String> widgetTokens = null;

  public static final String SERIALIZED_NAME_SAVED_FILTER_TOKENS = "saved_filter_tokens";
  @SerializedName(SERIALIZED_NAME_SAVED_FILTER_TOKENS)
  private List<String> savedFilterTokens = null;

  /**
   * Determines how to group costs in the Dashboard.
   */
  @JsonAdapter(DateBinEnum.Adapter.class)
 public enum DateBinEnum {
    CUMULATIVE("cumulative"),
    
    DAY("day"),
    
    WEEK("week"),
    
    MONTH("month");

    private String value;

    DateBinEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DateBinEnum fromValue(String value) {
      for (DateBinEnum b : DateBinEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DateBinEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DateBinEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DateBinEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DateBinEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DATE_BIN = "date_bin";
  @SerializedName(SERIALIZED_NAME_DATE_BIN)
  private DateBinEnum dateBin;

  /**
   * Determines the date range in the Dashboard. Guaranteed to be set to &#39;custom&#39; if &#39;start_date&#39; and &#39;end_date&#39; are set.
   */
  @JsonAdapter(DateIntervalEnum.Adapter.class)
 public enum DateIntervalEnum {
    THIS_MONTH("this_month"),
    
    LAST_7_DAYS("last_7_days"),
    
    LAST_30_DAYS("last_30_days"),
    
    LAST_MONTH("last_month"),
    
    LAST_3_MONTHS("last_3_months"),
    
    LAST_6_MONTHS("last_6_months"),
    
    CUSTOM("custom"),
    
    LAST_12_MONTHS("last_12_months"),
    
    LAST_24_MONTHS("last_24_months"),
    
    LAST_36_MONTHS("last_36_months"),
    
    NEXT_MONTH("next_month"),
    
    NEXT_3_MONTHS("next_3_months"),
    
    NEXT_6_MONTHS("next_6_months"),
    
    NEXT_12_MONTHS("next_12_months");

    private String value;

    DateIntervalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DateIntervalEnum fromValue(String value) {
      for (DateIntervalEnum b : DateIntervalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DateIntervalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DateIntervalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DateIntervalEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DateIntervalEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DATE_INTERVAL = "date_interval";
  @SerializedName(SERIALIZED_NAME_DATE_INTERVAL)
  private DateIntervalEnum dateInterval;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_WORKSPACE_TOKEN = "workspace_token";
  @SerializedName(SERIALIZED_NAME_WORKSPACE_TOKEN)
  private String workspaceToken;

  public Dashboard() {
  }

  public Dashboard title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * The title of the Dashboard.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AWS Dashboard", value = "The title of the Dashboard.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public Dashboard token(String token) {
    
    
    
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dshbrd_abcd1234567890", value = "")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    
    
    
    this.token = token;
  }


  public Dashboard widgetTokens(List<String> widgetTokens) {
    
    
    
    
    this.widgetTokens = widgetTokens;
    return this;
  }

  public Dashboard addWidgetTokensItem(String widgetTokensItem) {
    if (this.widgetTokens == null) {
      this.widgetTokens = new ArrayList<>();
    }
    this.widgetTokens.add(widgetTokensItem);
    return this;
  }

   /**
   * The tokens of the widgets displayed in the Dashboard. Currently only supports CostReport tokens.
   * @return widgetTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tokens of the widgets displayed in the Dashboard. Currently only supports CostReport tokens.")

  public List<String> getWidgetTokens() {
    return widgetTokens;
  }


  public void setWidgetTokens(List<String> widgetTokens) {
    
    
    
    this.widgetTokens = widgetTokens;
  }


  public Dashboard savedFilterTokens(List<String> savedFilterTokens) {
    
    
    
    
    this.savedFilterTokens = savedFilterTokens;
    return this;
  }

  public Dashboard addSavedFilterTokensItem(String savedFilterTokensItem) {
    if (this.savedFilterTokens == null) {
      this.savedFilterTokens = new ArrayList<>();
    }
    this.savedFilterTokens.add(savedFilterTokensItem);
    return this;
  }

   /**
   * The tokens of the Saved Filters used in the Dashboard.
   * @return savedFilterTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tokens of the Saved Filters used in the Dashboard.")

  public List<String> getSavedFilterTokens() {
    return savedFilterTokens;
  }


  public void setSavedFilterTokens(List<String> savedFilterTokens) {
    
    
    
    this.savedFilterTokens = savedFilterTokens;
  }


  public Dashboard dateBin(DateBinEnum dateBin) {
    
    
    
    
    this.dateBin = dateBin;
    return this;
  }

   /**
   * Determines how to group costs in the Dashboard.
   * @return dateBin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines how to group costs in the Dashboard.")

  public DateBinEnum getDateBin() {
    return dateBin;
  }


  public void setDateBin(DateBinEnum dateBin) {
    
    
    
    this.dateBin = dateBin;
  }


  public Dashboard dateInterval(DateIntervalEnum dateInterval) {
    
    
    
    
    this.dateInterval = dateInterval;
    return this;
  }

   /**
   * Determines the date range in the Dashboard. Guaranteed to be set to &#39;custom&#39; if &#39;start_date&#39; and &#39;end_date&#39; are set.
   * @return dateInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines the date range in the Dashboard. Guaranteed to be set to 'custom' if 'start_date' and 'end_date' are set.")

  public DateIntervalEnum getDateInterval() {
    return dateInterval;
  }


  public void setDateInterval(DateIntervalEnum dateInterval) {
    
    
    
    this.dateInterval = dateInterval;
  }


  public Dashboard startDate(String startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date for the date range for CostReports in the Dashboard. ISO 8601 Formatted. Overwrites &#39;date_interval&#39; if set.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-08-04", value = "The start date for the date range for CostReports in the Dashboard. ISO 8601 Formatted. Overwrites 'date_interval' if set.")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    
    
    
    this.startDate = startDate;
  }


  public Dashboard endDate(String endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date for the date range for CostReports in the Dashboard. ISO 8601 Formatted. Overwrites &#39;date_interval&#39; if set.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-09-04", value = "The end date for the date range for CostReports in the Dashboard. ISO 8601 Formatted. Overwrites 'date_interval' if set.")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    
    
    
    this.endDate = endDate;
  }


  public Dashboard createdAt(String createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time, in UTC, the Dashboard was created. ISO 8601 Formatted.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-08-04T00:00:00Z", value = "The date and time, in UTC, the Dashboard was created. ISO 8601 Formatted.")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public Dashboard updatedAt(String updatedAt) {
    
    
    
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time, in UTC, the Dashboard was created. ISO 8601 Formatted.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-08-04T00:00:00Z", value = "The date and time, in UTC, the Dashboard was created. ISO 8601 Formatted.")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    
    
    
    this.updatedAt = updatedAt;
  }


  public Dashboard workspaceToken(String workspaceToken) {
    
    
    
    
    this.workspaceToken = workspaceToken;
    return this;
  }

   /**
   * The token for the Workspace the Dashboard is a part of.
   * @return workspaceToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "wrkspc_abcd1234567890", value = "The token for the Workspace the Dashboard is a part of.")

  public String getWorkspaceToken() {
    return workspaceToken;
  }


  public void setWorkspaceToken(String workspaceToken) {
    
    
    
    this.workspaceToken = workspaceToken;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the Dashboard instance itself
   */
  public Dashboard putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dashboard dashboard = (Dashboard) o;
    return Objects.equals(this.title, dashboard.title) &&
        Objects.equals(this.token, dashboard.token) &&
        Objects.equals(this.widgetTokens, dashboard.widgetTokens) &&
        Objects.equals(this.savedFilterTokens, dashboard.savedFilterTokens) &&
        Objects.equals(this.dateBin, dashboard.dateBin) &&
        Objects.equals(this.dateInterval, dashboard.dateInterval) &&
        Objects.equals(this.startDate, dashboard.startDate) &&
        Objects.equals(this.endDate, dashboard.endDate) &&
        Objects.equals(this.createdAt, dashboard.createdAt) &&
        Objects.equals(this.updatedAt, dashboard.updatedAt) &&
        Objects.equals(this.workspaceToken, dashboard.workspaceToken)&&
        Objects.equals(this.additionalProperties, dashboard.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, token, widgetTokens, savedFilterTokens, dateBin, dateInterval, startDate, endDate, createdAt, updatedAt, workspaceToken, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dashboard {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    widgetTokens: ").append(toIndentedString(widgetTokens)).append("\n");
    sb.append("    savedFilterTokens: ").append(toIndentedString(savedFilterTokens)).append("\n");
    sb.append("    dateBin: ").append(toIndentedString(dateBin)).append("\n");
    sb.append("    dateInterval: ").append(toIndentedString(dateInterval)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workspaceToken: ").append(toIndentedString(workspaceToken)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("title");
    openapiFields.add("token");
    openapiFields.add("widget_tokens");
    openapiFields.add("saved_filter_tokens");
    openapiFields.add("date_bin");
    openapiFields.add("date_interval");
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("workspace_token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Dashboard
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Dashboard.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dashboard is not found in the empty JSON string", Dashboard.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("widget_tokens") != null && !jsonObj.get("widget_tokens").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `widget_tokens` to be an array in the JSON string but got `%s`", jsonObj.get("widget_tokens").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("saved_filter_tokens") != null && !jsonObj.get("saved_filter_tokens").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `saved_filter_tokens` to be an array in the JSON string but got `%s`", jsonObj.get("saved_filter_tokens").toString()));
      }
      if ((jsonObj.get("date_bin") != null && !jsonObj.get("date_bin").isJsonNull()) && !jsonObj.get("date_bin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_bin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_bin").toString()));
      }
      if ((jsonObj.get("date_interval") != null && !jsonObj.get("date_interval").isJsonNull()) && !jsonObj.get("date_interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_interval").toString()));
      }
      if ((jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonNull()) && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      if ((jsonObj.get("end_date") != null && !jsonObj.get("end_date").isJsonNull()) && !jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonNull()) && !jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
      if ((jsonObj.get("workspace_token") != null && !jsonObj.get("workspace_token").isJsonNull()) && !jsonObj.get("workspace_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workspace_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workspace_token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dashboard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dashboard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dashboard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dashboard.class));

       return (TypeAdapter<T>) new TypeAdapter<Dashboard>() {
           @Override
           public void write(JsonWriter out, Dashboard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Dashboard read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Dashboard instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dashboard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dashboard
  * @throws IOException if the JSON string is invalid with respect to Dashboard
  */
  public static Dashboard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dashboard.class);
  }

 /**
  * Convert an instance of Dashboard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

