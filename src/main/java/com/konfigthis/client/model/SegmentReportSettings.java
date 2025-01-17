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
 * Report settings configurable on top-level Segments.
 */
@ApiModel(description = "Report settings configurable on top-level Segments.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SegmentReportSettings {
  public static final String SERIALIZED_NAME_INCLUDE_CREDITS = "include_credits";
  @SerializedName(SERIALIZED_NAME_INCLUDE_CREDITS)
  private Boolean includeCredits;

  public static final String SERIALIZED_NAME_INCLUDE_REFUNDS = "include_refunds";
  @SerializedName(SERIALIZED_NAME_INCLUDE_REFUNDS)
  private Boolean includeRefunds;

  public static final String SERIALIZED_NAME_INCLUDE_DISCOUNTS = "include_discounts";
  @SerializedName(SERIALIZED_NAME_INCLUDE_DISCOUNTS)
  private Boolean includeDiscounts;

  public static final String SERIALIZED_NAME_INCLUDE_TAX = "include_tax";
  @SerializedName(SERIALIZED_NAME_INCLUDE_TAX)
  private Boolean includeTax;

  public static final String SERIALIZED_NAME_AMORTIZE = "amortize";
  @SerializedName(SERIALIZED_NAME_AMORTIZE)
  private Boolean amortize;

  public SegmentReportSettings() {
  }

  public SegmentReportSettings includeCredits(Boolean includeCredits) {
    
    
    
    
    this.includeCredits = includeCredits;
    return this;
  }

   /**
   * Get includeCredits
   * @return includeCredits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIncludeCredits() {
    return includeCredits;
  }


  public void setIncludeCredits(Boolean includeCredits) {
    
    
    
    this.includeCredits = includeCredits;
  }


  public SegmentReportSettings includeRefunds(Boolean includeRefunds) {
    
    
    
    
    this.includeRefunds = includeRefunds;
    return this;
  }

   /**
   * Get includeRefunds
   * @return includeRefunds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIncludeRefunds() {
    return includeRefunds;
  }


  public void setIncludeRefunds(Boolean includeRefunds) {
    
    
    
    this.includeRefunds = includeRefunds;
  }


  public SegmentReportSettings includeDiscounts(Boolean includeDiscounts) {
    
    
    
    
    this.includeDiscounts = includeDiscounts;
    return this;
  }

   /**
   * Get includeDiscounts
   * @return includeDiscounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIncludeDiscounts() {
    return includeDiscounts;
  }


  public void setIncludeDiscounts(Boolean includeDiscounts) {
    
    
    
    this.includeDiscounts = includeDiscounts;
  }


  public SegmentReportSettings includeTax(Boolean includeTax) {
    
    
    
    
    this.includeTax = includeTax;
    return this;
  }

   /**
   * Get includeTax
   * @return includeTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIncludeTax() {
    return includeTax;
  }


  public void setIncludeTax(Boolean includeTax) {
    
    
    
    this.includeTax = includeTax;
  }


  public SegmentReportSettings amortize(Boolean amortize) {
    
    
    
    
    this.amortize = amortize;
    return this;
  }

   /**
   * Get amortize
   * @return amortize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAmortize() {
    return amortize;
  }


  public void setAmortize(Boolean amortize) {
    
    
    
    this.amortize = amortize;
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
   * @return the SegmentReportSettings instance itself
   */
  public SegmentReportSettings putAdditionalProperty(String key, Object value) {
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
    SegmentReportSettings segmentReportSettings = (SegmentReportSettings) o;
    return Objects.equals(this.includeCredits, segmentReportSettings.includeCredits) &&
        Objects.equals(this.includeRefunds, segmentReportSettings.includeRefunds) &&
        Objects.equals(this.includeDiscounts, segmentReportSettings.includeDiscounts) &&
        Objects.equals(this.includeTax, segmentReportSettings.includeTax) &&
        Objects.equals(this.amortize, segmentReportSettings.amortize)&&
        Objects.equals(this.additionalProperties, segmentReportSettings.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeCredits, includeRefunds, includeDiscounts, includeTax, amortize, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentReportSettings {\n");
    sb.append("    includeCredits: ").append(toIndentedString(includeCredits)).append("\n");
    sb.append("    includeRefunds: ").append(toIndentedString(includeRefunds)).append("\n");
    sb.append("    includeDiscounts: ").append(toIndentedString(includeDiscounts)).append("\n");
    sb.append("    includeTax: ").append(toIndentedString(includeTax)).append("\n");
    sb.append("    amortize: ").append(toIndentedString(amortize)).append("\n");
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
    openapiFields.add("include_credits");
    openapiFields.add("include_refunds");
    openapiFields.add("include_discounts");
    openapiFields.add("include_tax");
    openapiFields.add("amortize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SegmentReportSettings
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SegmentReportSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SegmentReportSettings is not found in the empty JSON string", SegmentReportSettings.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SegmentReportSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SegmentReportSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SegmentReportSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SegmentReportSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<SegmentReportSettings>() {
           @Override
           public void write(JsonWriter out, SegmentReportSettings value) throws IOException {
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
           public SegmentReportSettings read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SegmentReportSettings instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SegmentReportSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SegmentReportSettings
  * @throws IOException if the JSON string is invalid with respect to SegmentReportSettings
  */
  public static SegmentReportSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SegmentReportSettings.class);
  }

 /**
  * Convert an instance of SegmentReportSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

