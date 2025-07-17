package io.github.dataforseo.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.dataforseo.client.JSON;



public class DomainAnalyticsErrorsRequestInfo  {


  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public DomainAnalyticsErrorsRequestInfo limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * the maximum number of returned tasks that responded with an error
* optional field
* default value: 1000
* maximum value: 1000
   * @return limit
   */
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public DomainAnalyticsErrorsRequestInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * offset in the results array of returned tasks
* optional field
* default value: 0
* if you specify the 10 value, the first ten tasks in the results array will be omitted and the data will be provided for the successive tasks
   * @return offset
   */
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public static final String SERIALIZED_NAME_FILTERED_FUNCTION = "filtered_function";
  @SerializedName(SERIALIZED_NAME_FILTERED_FUNCTION)
  private String filteredFunction;

  public DomainAnalyticsErrorsRequestInfo filteredFunction(String filteredFunction) {
    this.filteredFunction = filteredFunction;
    return this;
  }

  /**
   * return tasks with a certain function
* use this field to obtain a list of tasks that returned an error filtered by a certain function
* you can filter the results by the values you receive in the function fields of the API response
* i.e., once you receive unfiltered results, you can call this API again to filter them by function
* example: domain_analytics/task_get, postback_url, pingback_url
   * @return filteredFunction
   */
  @javax.annotation.Nullable
  public String getFilteredFunction() {
    return filteredFunction;
  }

  public void setFilteredFunction(String filteredFunction) {
    this.filteredFunction = filteredFunction;
  }


  public static final String SERIALIZED_NAME_DATETIME_FROM = "datetime_from";
  @SerializedName(SERIALIZED_NAME_DATETIME_FROM)
  private String datetimeFrom;

  public DomainAnalyticsErrorsRequestInfo datetimeFrom(String datetimeFrom) {
    this.datetimeFrom = datetimeFrom;
    return this;
  }

  /**
   * start time for filtering results
* optional field
* allows filtering results by the datetime parameter within the range of the last 7 days;
* must be specified in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2021-11-15 12:57:46 +00:00
   * @return datetimeFrom
   */
  @javax.annotation.Nullable
  public String getDatetimeFrom() {
    return datetimeFrom;
  }

  public void setDatetimeFrom(String datetimeFrom) {
    this.datetimeFrom = datetimeFrom;
  }


  public static final String SERIALIZED_NAME_DATETIME_TO = "datetime_to";
  @SerializedName(SERIALIZED_NAME_DATETIME_TO)
  private String datetimeTo;

  public DomainAnalyticsErrorsRequestInfo datetimeTo(String datetimeTo) {
    this.datetimeTo = datetimeTo;
    return this;
  }

  /**
   * finish time for filtering results
* optional field
* allows filtering results by the datetime parameter within the range of the last 7 days;
* must be specified in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2021-11-15 13:57:46 +00:00
   * @return datetimeTo
   */
  @javax.annotation.Nullable
  public String getDatetimeTo() {
    return datetimeTo;
  }

  public void setDatetimeTo(String datetimeTo) {
    this.datetimeTo = datetimeTo;
  }



  public DomainAnalyticsErrorsRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DomainAnalyticsErrorsRequestInfo putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

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


    
    DomainAnalyticsErrorsRequestInfo domainAnalyticsErrorsRequestInfo = (DomainAnalyticsErrorsRequestInfo) o;
    return

        Objects.equals(this.limit, domainAnalyticsErrorsRequestInfo.limit) &&
        Objects.equals(this.offset, domainAnalyticsErrorsRequestInfo.offset) &&
        Objects.equals(this.filteredFunction, domainAnalyticsErrorsRequestInfo.filteredFunction) &&
        Objects.equals(this.datetimeFrom, domainAnalyticsErrorsRequestInfo.datetimeFrom) &&
        Objects.equals(this.datetimeTo, domainAnalyticsErrorsRequestInfo.datetimeTo);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(limit, offset, filteredFunction, datetimeFrom, datetimeTo);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainAnalyticsErrorsRequestInfo {\n");

    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    filteredFunction: ").append(toIndentedString(filteredFunction)).append("\n");
    sb.append("    datetimeFrom: ").append(toIndentedString(datetimeFrom)).append("\n");
    sb.append("    datetimeTo: ").append(toIndentedString(datetimeTo)).append("\n");
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
    
    openapiFields.add("limit");
    
    openapiFields.add("offset");
    
    openapiFields.add("filtered_function");
    
    openapiFields.add("datetime_from");
    
    openapiFields.add("datetime_to");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DomainAnalyticsErrorsRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DomainAnalyticsErrorsRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DomainAnalyticsErrorsRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DomainAnalyticsErrorsRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DomainAnalyticsErrorsRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DomainAnalyticsErrorsRequestInfo>() {
           @Override
           public void write(JsonWriter out, DomainAnalyticsErrorsRequestInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
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
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public DomainAnalyticsErrorsRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DomainAnalyticsErrorsRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DomainAnalyticsErrorsRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DomainAnalyticsErrorsRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}