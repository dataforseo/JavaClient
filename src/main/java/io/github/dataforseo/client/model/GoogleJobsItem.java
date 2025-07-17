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



public class GoogleJobsItem  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public GoogleJobsItem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * type of element
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public static final String SERIALIZED_NAME_RANK_GROUP = "rank_group";
  @SerializedName(SERIALIZED_NAME_RANK_GROUP)
  private Integer rankGroup;

  public GoogleJobsItem rankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
    return this;
  }

  /**
   * group rank in SERP
* position within a group of elements with identical type values
* positions of elements with different type values are omitted from rank_group
   * @return rankGroup
   */
  @javax.annotation.Nullable
  public Integer getRankGroup() {
    return rankGroup;
  }

  public void setRankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
  }


  public static final String SERIALIZED_NAME_RANK_ABSOLUTE = "rank_absolute";
  @SerializedName(SERIALIZED_NAME_RANK_ABSOLUTE)
  private Integer rankAbsolute;

  public GoogleJobsItem rankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
    return this;
  }

  /**
   * absolute rank in SERP
* absolute position among all the elements in SERP
   * @return rankAbsolute
   */
  @javax.annotation.Nullable
  public Integer getRankAbsolute() {
    return rankAbsolute;
  }

  public void setRankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
  }


  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private String position;

  public GoogleJobsItem position(String position) {
    this.position = position;
    return this;
  }

  /**
   * the alignment of the element in SERP
* can take the following values:
* left, right
   * @return position
   */
  @javax.annotation.Nullable
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public static final String SERIALIZED_NAME_XPATH = "xpath";
  @SerializedName(SERIALIZED_NAME_XPATH)
  private String xpath;

  public GoogleJobsItem xpath(String xpath) {
    this.xpath = xpath;
    return this;
  }

  /**
   * the XPath of the element
   * @return xpath
   */
  @javax.annotation.Nullable
  public String getXpath() {
    return xpath;
  }

  public void setXpath(String xpath) {
    this.xpath = xpath;
  }


  public static final String SERIALIZED_NAME_JOB_ID = "job_id";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private String jobId;

  public GoogleJobsItem jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * ID of the job on Google Jobs
   * @return jobId
   */
  @javax.annotation.Nullable
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public GoogleJobsItem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the element
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_EMPLOYER_NAME = "employer_name";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_NAME)
  private String employerName;

  public GoogleJobsItem employerName(String employerName) {
    this.employerName = employerName;
    return this;
  }

  /**
   * name of the employer
   * @return employerName
   */
  @javax.annotation.Nullable
  public String getEmployerName() {
    return employerName;
  }

  public void setEmployerName(String employerName) {
    this.employerName = employerName;
  }


  public static final String SERIALIZED_NAME_EMPLOYER_URL = "employer_url";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_URL)
  private String employerUrl;

  public GoogleJobsItem employerUrl(String employerUrl) {
    this.employerUrl = employerUrl;
    return this;
  }

  /**
   * URL to the employer’s website
   * @return employerUrl
   */
  @javax.annotation.Nullable
  public String getEmployerUrl() {
    return employerUrl;
  }

  public void setEmployerUrl(String employerUrl) {
    this.employerUrl = employerUrl;
  }


  public static final String SERIALIZED_NAME_EMPLOYER_IMAGE_URL = "employer_image_url";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_IMAGE_URL)
  private String employerImageUrl;

  public GoogleJobsItem employerImageUrl(String employerImageUrl) {
    this.employerImageUrl = employerImageUrl;
    return this;
  }

  /**
   * URL to the image used in the job posting
   * @return employerImageUrl
   */
  @javax.annotation.Nullable
  public String getEmployerImageUrl() {
    return employerImageUrl;
  }

  public void setEmployerImageUrl(String employerImageUrl) {
    this.employerImageUrl = employerImageUrl;
  }


  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public GoogleJobsItem location(String location) {
    this.location = location;
    return this;
  }

  /**
   * location for which the job vacancy is posted
   * @return location
   */
  @javax.annotation.Nullable
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  public static final String SERIALIZED_NAME_SOURCE_NAME = "source_name";
  @SerializedName(SERIALIZED_NAME_SOURCE_NAME)
  private String sourceName;

  public GoogleJobsItem sourceName(String sourceName) {
    this.sourceName = sourceName;
    return this;
  }

  /**
   * original source of the job vacancy
   * @return sourceName
   */
  @javax.annotation.Nullable
  public String getSourceName() {
    return sourceName;
  }

  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }


  public static final String SERIALIZED_NAME_SOURCE_URL = "source_url";
  @SerializedName(SERIALIZED_NAME_SOURCE_URL)
  private String sourceUrl;

  public GoogleJobsItem sourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

  /**
   * URL to the original source of the job vacancy
   * @return sourceUrl
   */
  @javax.annotation.Nullable
  public String getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }


  public static final String SERIALIZED_NAME_SALARY = "salary";
  @SerializedName(SERIALIZED_NAME_SALARY)
  private String salary;

  public GoogleJobsItem salary(String salary) {
    this.salary = salary;
    return this;
  }

  /**
   * the salary indicated in the job vacancy
* if the salary isn’t indicated, this field will equal null
   * @return salary
   */
  @javax.annotation.Nullable
  public String getSalary() {
    return salary;
  }

  public void setSalary(String salary) {
    this.salary = salary;
  }


  public static final String SERIALIZED_NAME_CONTRACT_TYPE = "contract_type";
  @SerializedName(SERIALIZED_NAME_CONTRACT_TYPE)
  private String contractType;

  public GoogleJobsItem contractType(String contractType) {
    this.contractType = contractType;
    return this;
  }

  /**
   * employment contract type
   * @return contractType
   */
  @javax.annotation.Nullable
  public String getContractType() {
    return contractType;
  }

  public void setContractType(String contractType) {
    this.contractType = contractType;
  }


  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public GoogleJobsItem timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * date and time when the result was published
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return timestamp
   */
  @javax.annotation.Nullable
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public static final String SERIALIZED_NAME_TIME_AGO = "time_ago";
  @SerializedName(SERIALIZED_NAME_TIME_AGO)
  private String timeAgo;

  public GoogleJobsItem timeAgo(String timeAgo) {
    this.timeAgo = timeAgo;
    return this;
  }

  /**
   * indicates how long ago the job vacancy was posted
   * @return timeAgo
   */
  @javax.annotation.Nullable
  public String getTimeAgo() {
    return timeAgo;
  }

  public void setTimeAgo(String timeAgo) {
    this.timeAgo = timeAgo;
  }


  public static final String SERIALIZED_NAME_RECTANGLE = "rectangle";
  @SerializedName(SERIALIZED_NAME_RECTANGLE)
  private RectangleInfo rectangle;

  public GoogleJobsItem rectangle(RectangleInfo rectangle) {
    this.rectangle = rectangle;
    return this;
  }

  /**
   * rectangle parameters
* contains cartesian coordinates and pixel dimensions of the result’s snippet in SERP;
* in this case, will equal null
   * @return rectangle
   */
  @javax.annotation.Nullable
  public RectangleInfo getRectangle() {
    return rectangle;
  }

  public void setRectangle(RectangleInfo rectangle) {
    this.rectangle = rectangle;
  }



  public GoogleJobsItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public GoogleJobsItem putAdditionalProperty(String key, Object value) {
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


    
    GoogleJobsItem googleJobsItem = (GoogleJobsItem) o;
    return

        Objects.equals(this.type, googleJobsItem.type) &&
        Objects.equals(this.rankGroup, googleJobsItem.rankGroup) &&
        Objects.equals(this.rankAbsolute, googleJobsItem.rankAbsolute) &&
        Objects.equals(this.position, googleJobsItem.position) &&
        Objects.equals(this.xpath, googleJobsItem.xpath) &&
        Objects.equals(this.jobId, googleJobsItem.jobId) &&
        Objects.equals(this.title, googleJobsItem.title) &&
        Objects.equals(this.employerName, googleJobsItem.employerName) &&
        Objects.equals(this.employerUrl, googleJobsItem.employerUrl) &&
        Objects.equals(this.employerImageUrl, googleJobsItem.employerImageUrl) &&
        Objects.equals(this.location, googleJobsItem.location) &&
        Objects.equals(this.sourceName, googleJobsItem.sourceName) &&
        Objects.equals(this.sourceUrl, googleJobsItem.sourceUrl) &&
        Objects.equals(this.salary, googleJobsItem.salary) &&
        Objects.equals(this.contractType, googleJobsItem.contractType) &&
        Objects.equals(this.timestamp, googleJobsItem.timestamp) &&
        Objects.equals(this.timeAgo, googleJobsItem.timeAgo) &&
        Objects.equals(this.rectangle, googleJobsItem.rectangle);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, rankGroup, rankAbsolute, position, xpath, jobId, title, employerName, employerUrl, employerImageUrl, location, sourceName, sourceUrl, salary, contractType, timestamp, timeAgo, rectangle);
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
    sb.append("class GoogleJobsItem {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    employerName: ").append(toIndentedString(employerName)).append("\n");
    sb.append("    employerUrl: ").append(toIndentedString(employerUrl)).append("\n");
    sb.append("    employerImageUrl: ").append(toIndentedString(employerImageUrl)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    timeAgo: ").append(toIndentedString(timeAgo)).append("\n");
    sb.append("    rectangle: ").append(toIndentedString(rectangle)).append("\n");
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
    
    openapiFields.add("type");
    
    openapiFields.add("rank_group");
    
    openapiFields.add("rank_absolute");
    
    openapiFields.add("position");
    
    openapiFields.add("xpath");
    
    openapiFields.add("job_id");
    
    openapiFields.add("title");
    
    openapiFields.add("employer_name");
    
    openapiFields.add("employer_url");
    
    openapiFields.add("employer_image_url");
    
    openapiFields.add("location");
    
    openapiFields.add("source_name");
    
    openapiFields.add("source_url");
    
    openapiFields.add("salary");
    
    openapiFields.add("contract_type");
    
    openapiFields.add("timestamp");
    
    openapiFields.add("time_ago");
    
    openapiFields.add("rectangle");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleJobsItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleJobsItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleJobsItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleJobsItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleJobsItem.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleJobsItem>() {
           @Override
           public void write(JsonWriter out, GoogleJobsItem value) throws IOException {
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
           public GoogleJobsItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             GoogleJobsItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static GoogleJobsItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleJobsItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}