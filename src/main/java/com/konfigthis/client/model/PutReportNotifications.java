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
 * Update a ReportNotification.
 */
@ApiModel(description = "Update a ReportNotification.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PutReportNotifications {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_COST_REPORT_TOKEN = "cost_report_token";
  @SerializedName(SERIALIZED_NAME_COST_REPORT_TOKEN)
  private String costReportToken;

  public static final String SERIALIZED_NAME_USER_TOKENS = "user_tokens";
  @SerializedName(SERIALIZED_NAME_USER_TOKENS)
  private List<String> userTokens = null;

  public static final String SERIALIZED_NAME_RECIPIENT_CHANNELS = "recipient_channels";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_CHANNELS)
  private List<String> recipientChannels = null;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private String frequency;

  public static final String SERIALIZED_NAME_CHANGE = "change";
  @SerializedName(SERIALIZED_NAME_CHANGE)
  private String change;

  public PutReportNotifications() {
  }

  public PutReportNotifications title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * The title of the ReportNotification.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of the ReportNotification.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public PutReportNotifications costReportToken(String costReportToken) {
    
    
    
    
    this.costReportToken = costReportToken;
    return this;
  }

   /**
   * The CostReport token.
   * @return costReportToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The CostReport token.")

  public String getCostReportToken() {
    return costReportToken;
  }


  public void setCostReportToken(String costReportToken) {
    
    
    
    this.costReportToken = costReportToken;
  }


  public PutReportNotifications userTokens(List<String> userTokens) {
    
    
    
    
    this.userTokens = userTokens;
    return this;
  }

  public PutReportNotifications addUserTokensItem(String userTokensItem) {
    if (this.userTokens == null) {
      this.userTokens = new ArrayList<>();
    }
    this.userTokens.add(userTokensItem);
    return this;
  }

   /**
   * The Users that receive the notification.
   * @return userTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Users that receive the notification.")

  public List<String> getUserTokens() {
    return userTokens;
  }


  public void setUserTokens(List<String> userTokens) {
    
    
    
    this.userTokens = userTokens;
  }


  public PutReportNotifications recipientChannels(List<String> recipientChannels) {
    
    
    
    
    this.recipientChannels = recipientChannels;
    return this;
  }

  public PutReportNotifications addRecipientChannelsItem(String recipientChannelsItem) {
    if (this.recipientChannels == null) {
      this.recipientChannels = new ArrayList<>();
    }
    this.recipientChannels.add(recipientChannelsItem);
    return this;
  }

   /**
   * The Slack or Microsoft Teams channels that receive the notification.
   * @return recipientChannels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Slack or Microsoft Teams channels that receive the notification.")

  public List<String> getRecipientChannels() {
    return recipientChannels;
  }


  public void setRecipientChannels(List<String> recipientChannels) {
    
    
    
    this.recipientChannels = recipientChannels;
  }


  public PutReportNotifications frequency(String frequency) {
    
    
    
    
    this.frequency = frequency;
    return this;
  }

   /**
   * The frequency the ReportNotification is sent. Possible values: daily, weekly, monthly.
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The frequency the ReportNotification is sent. Possible values: daily, weekly, monthly.")

  public String getFrequency() {
    return frequency;
  }


  public void setFrequency(String frequency) {
    
    
    
    this.frequency = frequency;
  }


  public PutReportNotifications change(String change) {
    
    
    
    
    this.change = change;
    return this;
  }

   /**
   * The type of change the ReportNotification is tracking. Possible values: percentage, dollars.
   * @return change
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of change the ReportNotification is tracking. Possible values: percentage, dollars.")

  public String getChange() {
    return change;
  }


  public void setChange(String change) {
    
    
    
    this.change = change;
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
   * @return the PutReportNotifications instance itself
   */
  public PutReportNotifications putAdditionalProperty(String key, Object value) {
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
    PutReportNotifications putReportNotifications = (PutReportNotifications) o;
    return Objects.equals(this.title, putReportNotifications.title) &&
        Objects.equals(this.costReportToken, putReportNotifications.costReportToken) &&
        Objects.equals(this.userTokens, putReportNotifications.userTokens) &&
        Objects.equals(this.recipientChannels, putReportNotifications.recipientChannels) &&
        Objects.equals(this.frequency, putReportNotifications.frequency) &&
        Objects.equals(this.change, putReportNotifications.change)&&
        Objects.equals(this.additionalProperties, putReportNotifications.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, costReportToken, userTokens, recipientChannels, frequency, change, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutReportNotifications {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    costReportToken: ").append(toIndentedString(costReportToken)).append("\n");
    sb.append("    userTokens: ").append(toIndentedString(userTokens)).append("\n");
    sb.append("    recipientChannels: ").append(toIndentedString(recipientChannels)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
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
    openapiFields.add("cost_report_token");
    openapiFields.add("user_tokens");
    openapiFields.add("recipient_channels");
    openapiFields.add("frequency");
    openapiFields.add("change");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PutReportNotifications
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PutReportNotifications.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PutReportNotifications is not found in the empty JSON string", PutReportNotifications.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("cost_report_token") != null && !jsonObj.get("cost_report_token").isJsonNull()) && !jsonObj.get("cost_report_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cost_report_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cost_report_token").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("user_tokens") != null && !jsonObj.get("user_tokens").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_tokens` to be an array in the JSON string but got `%s`", jsonObj.get("user_tokens").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("recipient_channels") != null && !jsonObj.get("recipient_channels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipient_channels` to be an array in the JSON string but got `%s`", jsonObj.get("recipient_channels").toString()));
      }
      if ((jsonObj.get("frequency") != null && !jsonObj.get("frequency").isJsonNull()) && !jsonObj.get("frequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frequency").toString()));
      }
      if ((jsonObj.get("change") != null && !jsonObj.get("change").isJsonNull()) && !jsonObj.get("change").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `change` to be a primitive type in the JSON string but got `%s`", jsonObj.get("change").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PutReportNotifications.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PutReportNotifications' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PutReportNotifications> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PutReportNotifications.class));

       return (TypeAdapter<T>) new TypeAdapter<PutReportNotifications>() {
           @Override
           public void write(JsonWriter out, PutReportNotifications value) throws IOException {
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
           public PutReportNotifications read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PutReportNotifications instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PutReportNotifications given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PutReportNotifications
  * @throws IOException if the JSON string is invalid with respect to PutReportNotifications
  */
  public static PutReportNotifications fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PutReportNotifications.class);
  }

 /**
  * Convert an instance of PutReportNotifications to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

