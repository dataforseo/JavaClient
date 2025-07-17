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



public class SerpErrorsResultInfo  {


  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public SerpErrorsResultInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * id of the task
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public static final String SERIALIZED_NAME_DATETIME = "datetime";
  @SerializedName(SERIALIZED_NAME_DATETIME)
  private String datetime;

  public SerpErrorsResultInfo datetime(String datetime) {
    this.datetime = datetime;
    return this;
  }

  /**
   * date and time when an error occurred
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return datetime
   */
  @javax.annotation.Nullable
  public String getDatetime() {
    return datetime;
  }

  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }


  public static final String SERIALIZED_NAME_FUNCTION = "function";
  @SerializedName(SERIALIZED_NAME_FUNCTION)
  private String function;

  public SerpErrorsResultInfo function(String function) {
    this.function = function;
    return this;
  }

  /**
   * corresponding API function
   * @return function
   */
  @javax.annotation.Nullable
  public String getFunction() {
    return function;
  }

  public void setFunction(String function) {
    this.function = function;
  }


  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private Integer errorCode;

  public SerpErrorsResultInfo errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * error code
   * @return errorCode
   */
  @javax.annotation.Nullable
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }


  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public SerpErrorsResultInfo errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * error message or error URL
* error message (see full list) or URL that caused an error
   * @return errorMessage
   */
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public static final String SERIALIZED_NAME_HTTP_URL = "http_url";
  @SerializedName(SERIALIZED_NAME_HTTP_URL)
  private String httpUrl;

  public SerpErrorsResultInfo httpUrl(String httpUrl) {
    this.httpUrl = httpUrl;
    return this;
  }

  /**
   * URL that caused an error
* URL you used for making an API call or pingback/postback URL
   * @return httpUrl
   */
  @javax.annotation.Nullable
  public String getHttpUrl() {
    return httpUrl;
  }

  public void setHttpUrl(String httpUrl) {
    this.httpUrl = httpUrl;
  }


  public static final String SERIALIZED_NAME_HTTP_METHOD = "http_method";
  @SerializedName(SERIALIZED_NAME_HTTP_METHOD)
  private String httpMethod;

  public SerpErrorsResultInfo httpMethod(String httpMethod) {
    this.httpMethod = httpMethod;
    return this;
  }

  /**
   * HTTP method
   * @return httpMethod
   */
  @javax.annotation.Nullable
  public String getHttpMethod() {
    return httpMethod;
  }

  public void setHttpMethod(String httpMethod) {
    this.httpMethod = httpMethod;
  }


  public static final String SERIALIZED_NAME_HTTP_CODE = "http_code";
  @SerializedName(SERIALIZED_NAME_HTTP_CODE)
  private Integer httpCode;

  public SerpErrorsResultInfo httpCode(Integer httpCode) {
    this.httpCode = httpCode;
    return this;
  }

  /**
   * HTTP status code
   * @return httpCode
   */
  @javax.annotation.Nullable
  public Integer getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(Integer httpCode) {
    this.httpCode = httpCode;
  }


  public static final String SERIALIZED_NAME_HTTP_TIME = "http_time";
  @SerializedName(SERIALIZED_NAME_HTTP_TIME)
  private Double httpTime;

  public SerpErrorsResultInfo httpTime(Double httpTime) {
    this.httpTime = httpTime;
    return this;
  }

  /**
   * time taken by HTTP request
* for tasks set with a pingback/postback, this field will show the time it took your server to respond
   * @return httpTime
   */
  @javax.annotation.Nullable
  public Double getHttpTime() {
    return httpTime;
  }

  public void setHttpTime(Double httpTime) {
    this.httpTime = httpTime;
  }


  public static final String SERIALIZED_NAME_HTTP_RESPONSE = "http_response";
  @SerializedName(SERIALIZED_NAME_HTTP_RESPONSE)
  private String httpResponse;

  public SerpErrorsResultInfo httpResponse(String httpResponse) {
    this.httpResponse = httpResponse;
    return this;
  }

  /**
   * HTTP response
* server response
   * @return httpResponse
   */
  @javax.annotation.Nullable
  public String getHttpResponse() {
    return httpResponse;
  }

  public void setHttpResponse(String httpResponse) {
    this.httpResponse = httpResponse;
  }



  public SerpErrorsResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SerpErrorsResultInfo putAdditionalProperty(String key, Object value) {
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


    
    SerpErrorsResultInfo serpErrorsResultInfo = (SerpErrorsResultInfo) o;
    return

        Objects.equals(this.id, serpErrorsResultInfo.id) &&
        Objects.equals(this.datetime, serpErrorsResultInfo.datetime) &&
        Objects.equals(this.function, serpErrorsResultInfo.function) &&
        Objects.equals(this.errorCode, serpErrorsResultInfo.errorCode) &&
        Objects.equals(this.errorMessage, serpErrorsResultInfo.errorMessage) &&
        Objects.equals(this.httpUrl, serpErrorsResultInfo.httpUrl) &&
        Objects.equals(this.httpMethod, serpErrorsResultInfo.httpMethod) &&
        Objects.equals(this.httpCode, serpErrorsResultInfo.httpCode) &&
        Objects.equals(this.httpTime, serpErrorsResultInfo.httpTime) &&
        Objects.equals(this.httpResponse, serpErrorsResultInfo.httpResponse);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(id, datetime, function, errorCode, errorMessage, httpUrl, httpMethod, httpCode, httpTime, httpResponse);
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
    sb.append("class SerpErrorsResultInfo {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    httpUrl: ").append(toIndentedString(httpUrl)).append("\n");
    sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    httpTime: ").append(toIndentedString(httpTime)).append("\n");
    sb.append("    httpResponse: ").append(toIndentedString(httpResponse)).append("\n");
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
    
    openapiFields.add("id");
    
    openapiFields.add("datetime");
    
    openapiFields.add("function");
    
    openapiFields.add("error_code");
    
    openapiFields.add("error_message");
    
    openapiFields.add("http_url");
    
    openapiFields.add("http_method");
    
    openapiFields.add("http_code");
    
    openapiFields.add("http_time");
    
    openapiFields.add("http_response");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SerpErrorsResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpErrorsResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpErrorsResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpErrorsResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpErrorsResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpErrorsResultInfo>() {
           @Override
           public void write(JsonWriter out, SerpErrorsResultInfo value) throws IOException {
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
           public SerpErrorsResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SerpErrorsResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SerpErrorsResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpErrorsResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}