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



public class SerpGoogleOrganicTasksFixedResultInfo  {


  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public SerpGoogleOrganicTasksFixedResultInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * task identifier of the completed task
* unique task identifier in our system in the UUID format
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public static final String SERIALIZED_NAME_SE = "se";
  @SerializedName(SERIALIZED_NAME_SE)
  private String se;

  public SerpGoogleOrganicTasksFixedResultInfo se(String se) {
    this.se = se;
    return this;
  }

  /**
   * search engine specified when setting the task
   * @return se
   */
  @javax.annotation.Nullable
  public String getSe() {
    return se;
  }

  public void setSe(String se) {
    this.se = se;
  }


  public static final String SERIALIZED_NAME_SE_TYPE = "se_type";
  @SerializedName(SERIALIZED_NAME_SE_TYPE)
  private String seType;

  public SerpGoogleOrganicTasksFixedResultInfo seType(String seType) {
    this.seType = seType;
    return this;
  }

  /**
   * type of search engine
* can take the following values: organic
   * @return seType
   */
  @javax.annotation.Nullable
  public String getSeType() {
    return seType;
  }

  public void setSeType(String seType) {
    this.seType = seType;
  }


  public static final String SERIALIZED_NAME_DATE_POSTED = "date_posted";
  @SerializedName(SERIALIZED_NAME_DATE_POSTED)
  private String datePosted;

  public SerpGoogleOrganicTasksFixedResultInfo datePosted(String datePosted) {
    this.datePosted = datePosted;
    return this;
  }

  /**
   * 
   * @return datePosted
   */
  @javax.annotation.Nullable
  public String getDatePosted() {
    return datePosted;
  }

  public void setDatePosted(String datePosted) {
    this.datePosted = datePosted;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public SerpGoogleOrganicTasksFixedResultInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * user-defined task identifier
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  public static final String SERIALIZED_NAME_ENDPOINT_REGULAR = "endpoint_regular";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_REGULAR)
  private String endpointRegular;

  public SerpGoogleOrganicTasksFixedResultInfo endpointRegular(String endpointRegular) {
    this.endpointRegular = endpointRegular;
    return this;
  }

  /**
   * URL for collecting the results of the SERP Regular task
* if SERP Regular is not supported in the specified endpoint, the value will be null
   * @return endpointRegular
   */
  @javax.annotation.Nullable
  public String getEndpointRegular() {
    return endpointRegular;
  }

  public void setEndpointRegular(String endpointRegular) {
    this.endpointRegular = endpointRegular;
  }


  public static final String SERIALIZED_NAME_ENDPOINT_ADVANCED = "endpoint_advanced";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_ADVANCED)
  private String endpointAdvanced;

  public SerpGoogleOrganicTasksFixedResultInfo endpointAdvanced(String endpointAdvanced) {
    this.endpointAdvanced = endpointAdvanced;
    return this;
  }

  /**
   * URL for collecting the results of the SERP Advanced task
* if SERP Advanced is not supported in the specified endpoint, the value will be null
   * @return endpointAdvanced
   */
  @javax.annotation.Nullable
  public String getEndpointAdvanced() {
    return endpointAdvanced;
  }

  public void setEndpointAdvanced(String endpointAdvanced) {
    this.endpointAdvanced = endpointAdvanced;
  }


  public static final String SERIALIZED_NAME_ENDPOINT_HTML = "endpoint_html";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_HTML)
  private String endpointHtml;

  public SerpGoogleOrganicTasksFixedResultInfo endpointHtml(String endpointHtml) {
    this.endpointHtml = endpointHtml;
    return this;
  }

  /**
   * URL for collecting the results of the SERP HTML task
* if SERP HTML is not supported in the specified endpoint, the value will be null
   * @return endpointHtml
   */
  @javax.annotation.Nullable
  public String getEndpointHtml() {
    return endpointHtml;
  }

  public void setEndpointHtml(String endpointHtml) {
    this.endpointHtml = endpointHtml;
  }



  public SerpGoogleOrganicTasksFixedResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SerpGoogleOrganicTasksFixedResultInfo putAdditionalProperty(String key, Object value) {
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


    
    SerpGoogleOrganicTasksFixedResultInfo serpGoogleOrganicTasksFixedResultInfo = (SerpGoogleOrganicTasksFixedResultInfo) o;
    return

        Objects.equals(this.id, serpGoogleOrganicTasksFixedResultInfo.id) &&
        Objects.equals(this.se, serpGoogleOrganicTasksFixedResultInfo.se) &&
        Objects.equals(this.seType, serpGoogleOrganicTasksFixedResultInfo.seType) &&
        Objects.equals(this.datePosted, serpGoogleOrganicTasksFixedResultInfo.datePosted) &&
        Objects.equals(this.tag, serpGoogleOrganicTasksFixedResultInfo.tag) &&
        Objects.equals(this.endpointRegular, serpGoogleOrganicTasksFixedResultInfo.endpointRegular) &&
        Objects.equals(this.endpointAdvanced, serpGoogleOrganicTasksFixedResultInfo.endpointAdvanced) &&
        Objects.equals(this.endpointHtml, serpGoogleOrganicTasksFixedResultInfo.endpointHtml);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(id, se, seType, datePosted, tag, endpointRegular, endpointAdvanced, endpointHtml);
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
    sb.append("class SerpGoogleOrganicTasksFixedResultInfo {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    se: ").append(toIndentedString(se)).append("\n");
    sb.append("    seType: ").append(toIndentedString(seType)).append("\n");
    sb.append("    datePosted: ").append(toIndentedString(datePosted)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    endpointRegular: ").append(toIndentedString(endpointRegular)).append("\n");
    sb.append("    endpointAdvanced: ").append(toIndentedString(endpointAdvanced)).append("\n");
    sb.append("    endpointHtml: ").append(toIndentedString(endpointHtml)).append("\n");
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
    
    openapiFields.add("se");
    
    openapiFields.add("se_type");
    
    openapiFields.add("date_posted");
    
    openapiFields.add("tag");
    
    openapiFields.add("endpoint_regular");
    
    openapiFields.add("endpoint_advanced");
    
    openapiFields.add("endpoint_html");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SerpGoogleOrganicTasksFixedResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpGoogleOrganicTasksFixedResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpGoogleOrganicTasksFixedResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpGoogleOrganicTasksFixedResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpGoogleOrganicTasksFixedResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpGoogleOrganicTasksFixedResultInfo>() {
           @Override
           public void write(JsonWriter out, SerpGoogleOrganicTasksFixedResultInfo value) throws IOException {
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
           public SerpGoogleOrganicTasksFixedResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SerpGoogleOrganicTasksFixedResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SerpGoogleOrganicTasksFixedResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpGoogleOrganicTasksFixedResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}