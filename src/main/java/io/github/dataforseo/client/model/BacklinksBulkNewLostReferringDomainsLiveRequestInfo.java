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


public class BacklinksBulkNewLostReferringDomainsLiveRequestInfo  {


  public static final String SERIALIZED_NAME_TARGETS = "targets";
  @SerializedName(SERIALIZED_NAME_TARGETS)
  private List<String> targets;

  public BacklinksBulkNewLostReferringDomainsLiveRequestInfo targets(List<String> targets) {
    this.targets = targets;
    return this;
  }

  /**
   * <em>domains, subdomains or webpages to get  new & lost referring domains for</em><br><strong>required field</strong><br>you can set up to 1000 domains, subdomains or webpages<br>the domain or subdomain should be specified without <code>https://</code> and <code>www.</code><br>the page should be specified with absolute URL (including <code>http://</code> or <code>https://</code>)<br>example:<br>`'targets': [<br>  'forbes.com',<br>  'cnn.com',<br>  'bbc.com',<br>  'yelp.com',<br>  'https://www.apple.com/iphone/',<br>  'https://ahrefs.com/blog/',<br>  'ibm.com',<br>  'https://variety.com/',<br>  'https://stackoverflow.com/',<br>  'www.trustpilot.com'<br>]`
   * @return targets
   */
  @javax.annotation.Nullable
  public List<String> getTargets() {
    return targets;
  }

  public void setTargets(List<String> targets) {
    this.targets = targets;
  }


  public static final String SERIALIZED_NAME_DATE_FROM = "date_from";
  @SerializedName(SERIALIZED_NAME_DATE_FROM)
  private String dateFrom;

  public BacklinksBulkNewLostReferringDomainsLiveRequestInfo dateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * <em>starting date of the time range</em><br>optional field<br>this field indicates the date which will be used as a threshold for new and lost referring domains;<br>the referring domains that appeared in our index after the specified date will be considered as new;<br>the referring domains that weren't found after the specified date, but were present before, will be considered as lost;<p>default value: today's date -(minus) one month;<br>e.g. if today is <code>2021-10-13</code>, default <code>date_from</code> will be <code>2021-09-13</code>.<br><strong>minimum value equals today's date -(minus) one year;</strong><br>e.g. if today is <code>2021-10-13</code>, minimum <code>date_from</code> will be <code>2020-10-13</code>.<p>date format: <code>'yyyy-mm-dd'</code><br>example:<br><code>'2021-01-01'</code>
   * @return dateFrom
   */
  @javax.annotation.Nullable
  public String getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public BacklinksBulkNewLostReferringDomainsLiveRequestInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * <em>user-defined task identifier</em><br>optional field<br><em>the character limit is 255</em><br>you can use this parameter to identify the task and match it with the result<br>you will find the specified <code>tag</code> value in the <code>data</code> object of the response
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }



  public BacklinksBulkNewLostReferringDomainsLiveRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BacklinksBulkNewLostReferringDomainsLiveRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    BacklinksBulkNewLostReferringDomainsLiveRequestInfo backlinksBulkNewLostReferringDomainsLiveRequestInfo = (BacklinksBulkNewLostReferringDomainsLiveRequestInfo) o;
    return

        Objects.equals(this.targets, backlinksBulkNewLostReferringDomainsLiveRequestInfo.targets) &&
        Objects.equals(this.dateFrom, backlinksBulkNewLostReferringDomainsLiveRequestInfo.dateFrom) &&
        Objects.equals(this.tag, backlinksBulkNewLostReferringDomainsLiveRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(targets, dateFrom, tag);
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
    sb.append("class BacklinksBulkNewLostReferringDomainsLiveRequestInfo {\n");

    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    
    openapiFields.add("targets");
    
    openapiFields.add("date_from");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BacklinksBulkNewLostReferringDomainsLiveRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BacklinksBulkNewLostReferringDomainsLiveRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BacklinksBulkNewLostReferringDomainsLiveRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BacklinksBulkNewLostReferringDomainsLiveRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BacklinksBulkNewLostReferringDomainsLiveRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BacklinksBulkNewLostReferringDomainsLiveRequestInfo>() {
           @Override
           public void write(JsonWriter out, BacklinksBulkNewLostReferringDomainsLiveRequestInfo value) throws IOException {
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
           public BacklinksBulkNewLostReferringDomainsLiveRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BacklinksBulkNewLostReferringDomainsLiveRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BacklinksBulkNewLostReferringDomainsLiveRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BacklinksBulkNewLostReferringDomainsLiveRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}