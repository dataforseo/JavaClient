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



public class PageTiming  {


  public static final String SERIALIZED_NAME_TIME_TO_INTERACTIVE = "time_to_interactive";
  @SerializedName(SERIALIZED_NAME_TIME_TO_INTERACTIVE)
  private Integer timeToInteractive;

  public PageTiming timeToInteractive(Integer timeToInteractive) {
    this.timeToInteractive = timeToInteractive;
    return this;
  }

  /**
   * Time To Interactive (TTI) metric
* the time it takes until the user can interact with a page (in milliseconds)
   * @return timeToInteractive
   */
  @javax.annotation.Nullable
  public Integer getTimeToInteractive() {
    return timeToInteractive;
  }

  public void setTimeToInteractive(Integer timeToInteractive) {
    this.timeToInteractive = timeToInteractive;
  }


  public static final String SERIALIZED_NAME_DOM_COMPLETE = "dom_complete";
  @SerializedName(SERIALIZED_NAME_DOM_COMPLETE)
  private Integer domComplete;

  public PageTiming domComplete(Integer domComplete) {
    this.domComplete = domComplete;
    return this;
  }

  /**
   * time to load resources
* the time it takes until the page and all of its subresources are downloaded (in milliseconds)
   * @return domComplete
   */
  @javax.annotation.Nullable
  public Integer getDomComplete() {
    return domComplete;
  }

  public void setDomComplete(Integer domComplete) {
    this.domComplete = domComplete;
  }


  public static final String SERIALIZED_NAME_LARGEST_CONTENTFUL_PAINT = "largest_contentful_paint";
  @SerializedName(SERIALIZED_NAME_LARGEST_CONTENTFUL_PAINT)
  private Double largestContentfulPaint;

  public PageTiming largestContentfulPaint(Double largestContentfulPaint) {
    this.largestContentfulPaint = largestContentfulPaint;
    return this;
  }

  /**
   * Core Web Vitals metric measuring how fast the largest above-the-fold content element is displayed
* The amount of time (in milliseconds) to render the largest content element visible in the viewport, from when the user requests the URL. Learn more.
   * @return largestContentfulPaint
   */
  @javax.annotation.Nullable
  public Double getLargestContentfulPaint() {
    return largestContentfulPaint;
  }

  public void setLargestContentfulPaint(Double largestContentfulPaint) {
    this.largestContentfulPaint = largestContentfulPaint;
  }


  public static final String SERIALIZED_NAME_FIRST_INPUT_DELAY = "first_input_delay";
  @SerializedName(SERIALIZED_NAME_FIRST_INPUT_DELAY)
  private Double firstInputDelay;

  public PageTiming firstInputDelay(Double firstInputDelay) {
    this.firstInputDelay = firstInputDelay;
    return this;
  }

  /**
   * Core Web Vitals metric indicating the responsiveness of a page
* The time (in milliseconds) from when a user first interacts with your page to the time when the browser responds to that interaction. Learn more.
   * @return firstInputDelay
   */
  @javax.annotation.Nullable
  public Double getFirstInputDelay() {
    return firstInputDelay;
  }

  public void setFirstInputDelay(Double firstInputDelay) {
    this.firstInputDelay = firstInputDelay;
  }


  public static final String SERIALIZED_NAME_CONNECTION_TIME = "connection_time";
  @SerializedName(SERIALIZED_NAME_CONNECTION_TIME)
  private Integer connectionTime;

  public PageTiming connectionTime(Integer connectionTime) {
    this.connectionTime = connectionTime;
    return this;
  }

  /**
   * time to connect to a server
* the time it takes until the connection with a server is established (in milliseconds)
   * @return connectionTime
   */
  @javax.annotation.Nullable
  public Integer getConnectionTime() {
    return connectionTime;
  }

  public void setConnectionTime(Integer connectionTime) {
    this.connectionTime = connectionTime;
  }


  public static final String SERIALIZED_NAME_TIME_TO_SECURE_CONNECTION = "time_to_secure_connection";
  @SerializedName(SERIALIZED_NAME_TIME_TO_SECURE_CONNECTION)
  private Integer timeToSecureConnection;

  public PageTiming timeToSecureConnection(Integer timeToSecureConnection) {
    this.timeToSecureConnection = timeToSecureConnection;
    return this;
  }

  /**
   * time to establish a secure connection
* the time it takes until the secure connection with a server is established (in milliseconds)
   * @return timeToSecureConnection
   */
  @javax.annotation.Nullable
  public Integer getTimeToSecureConnection() {
    return timeToSecureConnection;
  }

  public void setTimeToSecureConnection(Integer timeToSecureConnection) {
    this.timeToSecureConnection = timeToSecureConnection;
  }


  public static final String SERIALIZED_NAME_REQUEST_SENT_TIME = "request_sent_time";
  @SerializedName(SERIALIZED_NAME_REQUEST_SENT_TIME)
  private Integer requestSentTime;

  public PageTiming requestSentTime(Integer requestSentTime) {
    this.requestSentTime = requestSentTime;
    return this;
  }

  /**
   * time to send a request to a server
* the time it takes until the request to a server is sent (in milliseconds)
   * @return requestSentTime
   */
  @javax.annotation.Nullable
  public Integer getRequestSentTime() {
    return requestSentTime;
  }

  public void setRequestSentTime(Integer requestSentTime) {
    this.requestSentTime = requestSentTime;
  }


  public static final String SERIALIZED_NAME_WAITING_TIME = "waiting_time";
  @SerializedName(SERIALIZED_NAME_WAITING_TIME)
  private Integer waitingTime;

  public PageTiming waitingTime(Integer waitingTime) {
    this.waitingTime = waitingTime;
    return this;
  }

  /**
   * time to first byte (TTFB) in milliseconds
   * @return waitingTime
   */
  @javax.annotation.Nullable
  public Integer getWaitingTime() {
    return waitingTime;
  }

  public void setWaitingTime(Integer waitingTime) {
    this.waitingTime = waitingTime;
  }


  public static final String SERIALIZED_NAME_DOWNLOAD_TIME = "download_time";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_TIME)
  private Integer downloadTime;

  public PageTiming downloadTime(Integer downloadTime) {
    this.downloadTime = downloadTime;
    return this;
  }

  /**
   * time it takes for a browser to receive a response (in milliseconds)
   * @return downloadTime
   */
  @javax.annotation.Nullable
  public Integer getDownloadTime() {
    return downloadTime;
  }

  public void setDownloadTime(Integer downloadTime) {
    this.downloadTime = downloadTime;
  }


  public static final String SERIALIZED_NAME_DURATION_TIME = "duration_time";
  @SerializedName(SERIALIZED_NAME_DURATION_TIME)
  private Integer durationTime;

  public PageTiming durationTime(Integer durationTime) {
    this.durationTime = durationTime;
    return this;
  }

  /**
   * total time it takes until a browser receives a complete response from a server (in milliseconds)
   * @return durationTime
   */
  @javax.annotation.Nullable
  public Integer getDurationTime() {
    return durationTime;
  }

  public void setDurationTime(Integer durationTime) {
    this.durationTime = durationTime;
  }


  public static final String SERIALIZED_NAME_FETCH_START = "fetch_start";
  @SerializedName(SERIALIZED_NAME_FETCH_START)
  private Integer fetchStart;

  public PageTiming fetchStart(Integer fetchStart) {
    this.fetchStart = fetchStart;
    return this;
  }

  /**
   * time to start downloading the HTML resource
* the amount of time the browser needs to start downloading a page
   * @return fetchStart
   */
  @javax.annotation.Nullable
  public Integer getFetchStart() {
    return fetchStart;
  }

  public void setFetchStart(Integer fetchStart) {
    this.fetchStart = fetchStart;
  }


  public static final String SERIALIZED_NAME_FETCH_END = "fetch_end";
  @SerializedName(SERIALIZED_NAME_FETCH_END)
  private Integer fetchEnd;

  public PageTiming fetchEnd(Integer fetchEnd) {
    this.fetchEnd = fetchEnd;
    return this;
  }

  /**
   * time to complete downloading the HTML resource
* the amount of time the browser needs to complete downloading a page
   * @return fetchEnd
   */
  @javax.annotation.Nullable
  public Integer getFetchEnd() {
    return fetchEnd;
  }

  public void setFetchEnd(Integer fetchEnd) {
    this.fetchEnd = fetchEnd;
  }



  public PageTiming() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public PageTiming putAdditionalProperty(String key, Object value) {
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


    
    PageTiming pageTiming = (PageTiming) o;
    return

        Objects.equals(this.timeToInteractive, pageTiming.timeToInteractive) &&
        Objects.equals(this.domComplete, pageTiming.domComplete) &&
        Objects.equals(this.largestContentfulPaint, pageTiming.largestContentfulPaint) &&
        Objects.equals(this.firstInputDelay, pageTiming.firstInputDelay) &&
        Objects.equals(this.connectionTime, pageTiming.connectionTime) &&
        Objects.equals(this.timeToSecureConnection, pageTiming.timeToSecureConnection) &&
        Objects.equals(this.requestSentTime, pageTiming.requestSentTime) &&
        Objects.equals(this.waitingTime, pageTiming.waitingTime) &&
        Objects.equals(this.downloadTime, pageTiming.downloadTime) &&
        Objects.equals(this.durationTime, pageTiming.durationTime) &&
        Objects.equals(this.fetchStart, pageTiming.fetchStart) &&
        Objects.equals(this.fetchEnd, pageTiming.fetchEnd);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(timeToInteractive, domComplete, largestContentfulPaint, firstInputDelay, connectionTime, timeToSecureConnection, requestSentTime, waitingTime, downloadTime, durationTime, fetchStart, fetchEnd);
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
    sb.append("class PageTiming {\n");

    sb.append("    timeToInteractive: ").append(toIndentedString(timeToInteractive)).append("\n");
    sb.append("    domComplete: ").append(toIndentedString(domComplete)).append("\n");
    sb.append("    largestContentfulPaint: ").append(toIndentedString(largestContentfulPaint)).append("\n");
    sb.append("    firstInputDelay: ").append(toIndentedString(firstInputDelay)).append("\n");
    sb.append("    connectionTime: ").append(toIndentedString(connectionTime)).append("\n");
    sb.append("    timeToSecureConnection: ").append(toIndentedString(timeToSecureConnection)).append("\n");
    sb.append("    requestSentTime: ").append(toIndentedString(requestSentTime)).append("\n");
    sb.append("    waitingTime: ").append(toIndentedString(waitingTime)).append("\n");
    sb.append("    downloadTime: ").append(toIndentedString(downloadTime)).append("\n");
    sb.append("    durationTime: ").append(toIndentedString(durationTime)).append("\n");
    sb.append("    fetchStart: ").append(toIndentedString(fetchStart)).append("\n");
    sb.append("    fetchEnd: ").append(toIndentedString(fetchEnd)).append("\n");
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
    
    openapiFields.add("time_to_interactive");
    
    openapiFields.add("dom_complete");
    
    openapiFields.add("largest_contentful_paint");
    
    openapiFields.add("first_input_delay");
    
    openapiFields.add("connection_time");
    
    openapiFields.add("time_to_secure_connection");
    
    openapiFields.add("request_sent_time");
    
    openapiFields.add("waiting_time");
    
    openapiFields.add("download_time");
    
    openapiFields.add("duration_time");
    
    openapiFields.add("fetch_start");
    
    openapiFields.add("fetch_end");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PageTiming
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageTiming.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageTiming' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageTiming> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageTiming.class));

       return (TypeAdapter<T>) new TypeAdapter<PageTiming>() {
           @Override
           public void write(JsonWriter out, PageTiming value) throws IOException {
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
           public PageTiming read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PageTiming instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static PageTiming fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageTiming.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}