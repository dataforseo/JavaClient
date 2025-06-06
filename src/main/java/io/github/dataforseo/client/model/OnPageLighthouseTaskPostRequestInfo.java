/*
 * DataForSEO API documentation
 * DataForSEO API is the starting point on your journey towards building powerful SEO software. With DataForSEO you can get all the data you need to build an efficient application while also saving your time and budget. DataForSEO API is using the REST technology for interchanging data between your application and our service. The data exchange is made through the widely used HTTP protocol, which allows applying our API to almost all programming languages.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.dataforseo.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

/**
 * OnPageLighthouseTaskPostRequestInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-30T15:21:14.476580900+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class OnPageLighthouseTaskPostRequestInfo {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_FOR_MOBILE = "for_mobile";
  @SerializedName(SERIALIZED_NAME_FOR_MOBILE)
  private Boolean forMobile;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<String> categories;

  public static final String SERIALIZED_NAME_AUDITS = "audits";
  @SerializedName(SERIALIZED_NAME_AUDITS)
  private List<String> audits;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_LANGUAGE_NAME = "language_name";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
  private String languageName;

  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_PINGBACK_URL = "pingback_url";
  @SerializedName(SERIALIZED_NAME_PINGBACK_URL)
  private String pingbackUrl;

  public static final String SERIALIZED_NAME_POSTBACK_URL = "postback_url";
  @SerializedName(SERIALIZED_NAME_POSTBACK_URL)
  private String postbackUrl;

  public OnPageLighthouseTaskPostRequestInfo() {
  }

  public OnPageLighthouseTaskPostRequestInfo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * target URL required field target page should be specified with its absolute URL (including http:// or https://) example: https://dataforseo.com/
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public OnPageLighthouseTaskPostRequestInfo forMobile(Boolean forMobile) {
    this.forMobile = forMobile;
    return this;
  }

  /**
   * applies mobile emulation optional field if set to true, Lighthouse will use mobile device and screen emulation to test the page against mobile environment if set to false, the results will be provided for desktop default value: false
   * @return forMobile
   */
  @javax.annotation.Nullable
  public Boolean getForMobile() {
    return forMobile;
  }

  public void setForMobile(Boolean forMobile) {
    this.forMobile = forMobile;
  }


  public OnPageLighthouseTaskPostRequestInfo categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public OnPageLighthouseTaskPostRequestInfo addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * categories of Lighthouse audits optional field each category is a collection of audits and audit groups that applies weighting and scoring to the section (see official definition) if you ignore this field, we will return data for all categories unless you specify audits use this field to get data for specific categories you indicate here possible values: seo, pwa, performance, best_practices, accessibility
   * @return categories
   */
  @javax.annotation.Nullable
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }


  public OnPageLighthouseTaskPostRequestInfo audits(List<String> audits) {
    this.audits = audits;
    return this;
  }

  public OnPageLighthouseTaskPostRequestInfo addAuditsItem(String auditsItem) {
    if (this.audits == null) {
      this.audits = new ArrayList<>();
    }
    this.audits.add(auditsItem);
    return this;
  }

  /**
   * Lighthouse audits optional field audits are individual tests Lighthouse runs for each specific feature/optimization/metric to produce a numeric score (see official definition)   if you ignore this field, we will return data for all audits use this field to get data for specific audits you indicate here note that some audits do not belong to a specific category and are stand-alone page quality measurements in general, there can be several use cases: 1. if you ignore categories, you can use this field to get data for the specified audits only for example, if you ignore \&quot;categories\&quot; and specify \&quot;audits\&quot;: [\&quot;metrics/cumulative-layout-shift\&quot;,\&quot;metrics/largest-contentful-paint\&quot;,\&quot;metrics/total-blocking-time\&quot;], you will get data only for these audits 2. if you specify a category, you can use this field to additionally receive audits that do not belong to the category(-ies) you specified for example, if you specify \&quot;categories\&quot;: [\&quot;seo\&quot;] and \&quot;audits\&quot;: [\&quot;metrics/cumulative-layout-shift\&quot;,\&quot;metrics/largest-contentful-paint\&quot;,\&quot;metrics/total-blocking-time\&quot;], you will get only these audits under “performance” and all audits under “seo” you can get the full list of possible audits here
   * @return audits
   */
  @javax.annotation.Nullable
  public List<String> getAudits() {
    return audits;
  }

  public void setAudits(List<String> audits) {
    this.audits = audits;
  }


  public OnPageLighthouseTaskPostRequestInfo version(String version) {
    this.version = version;
    return this;
  }

  /**
   * lighthouse version optional field you can obtain the results specific to a certain Lighthouse version by specifying its number the list of available versions is available through the Lighthouse Versions endpoint
   * @return version
   */
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public OnPageLighthouseTaskPostRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * lighthouse language name optional field you can receive the list of available languages of the search engine with their language_name by making a separate request to https://api.dataforseo.com/v3/on_page/lighthouse/languages default value: English
   * @return languageName
   */
  @javax.annotation.Nullable
  public String getLanguageName() {
    return languageName;
  }

  public void setLanguageName(String languageName) {
    this.languageName = languageName;
  }


  public OnPageLighthouseTaskPostRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * lighthouse language code optional field you can receive the list of available languages of the search engine with their language_code by making a separate request to https://api.dataforseo.com/v3/on_page/lighthouse/languages default value: en
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public OnPageLighthouseTaskPostRequestInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * user-defined task identifier optional field the character limit is 255 you can use this parameter to identify the task and match it with the result you will find the specified tag value in the data object of the response
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  public OnPageLighthouseTaskPostRequestInfo pingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
    return this;
  }

  /**
   * notification URL of a completed task optional field when a task is completed we will notify you by GET request sent to the URL you have specified you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request. example: http://your-server.com/pingscript?id&#x3D;$id http://your-server.com/pingscript?id&#x3D;$id&amp;tag&#x3D;$tag Note: special characters in pingback_url will be urlencoded; i.a., the # character will be encoded into %23 learn more on our Help Center
   * @return pingbackUrl
   */
  @javax.annotation.Nullable
  public String getPingbackUrl() {
    return pingbackUrl;
  }

  public void setPingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
  }


  public OnPageLighthouseTaskPostRequestInfo postbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
    return this;
  }

  /**
   * return URL for sending task results optional field once the task is completed, we will send a POST request with its results compressed in the gzip format to the postback_url you specified you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request example: http://your-server.com/postbackscript?id&#x3D;$id http://your-server.com/postbackscript?id&#x3D;$id&amp;tag&#x3D;$tag Note: special characters in postback_url will be urlencoded; i.a., the # character will be encoded into %23 learn more on our Help Center
   * @return postbackUrl
   */
  @javax.annotation.Nullable
  public String getPostbackUrl() {
    return postbackUrl;
  }

  public void setPostbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
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
   * @return the OnPageLighthouseTaskPostRequestInfo instance itself
   */
  public OnPageLighthouseTaskPostRequestInfo putAdditionalProperty(String key, Object value) {
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
    OnPageLighthouseTaskPostRequestInfo onPageLighthouseTaskPostRequestInfo = (OnPageLighthouseTaskPostRequestInfo) o;
    return Objects.equals(this.url, onPageLighthouseTaskPostRequestInfo.url) &&
        Objects.equals(this.forMobile, onPageLighthouseTaskPostRequestInfo.forMobile) &&
        Objects.equals(this.categories, onPageLighthouseTaskPostRequestInfo.categories) &&
        Objects.equals(this.audits, onPageLighthouseTaskPostRequestInfo.audits) &&
        Objects.equals(this.version, onPageLighthouseTaskPostRequestInfo.version) &&
        Objects.equals(this.languageName, onPageLighthouseTaskPostRequestInfo.languageName) &&
        Objects.equals(this.languageCode, onPageLighthouseTaskPostRequestInfo.languageCode) &&
        Objects.equals(this.tag, onPageLighthouseTaskPostRequestInfo.tag) &&
        Objects.equals(this.pingbackUrl, onPageLighthouseTaskPostRequestInfo.pingbackUrl) &&
        Objects.equals(this.postbackUrl, onPageLighthouseTaskPostRequestInfo.postbackUrl)&&
        Objects.equals(this.additionalProperties, onPageLighthouseTaskPostRequestInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, forMobile, categories, audits, version, languageName, languageCode, tag, pingbackUrl, postbackUrl, additionalProperties);
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
    sb.append("class OnPageLighthouseTaskPostRequestInfo {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    forMobile: ").append(toIndentedString(forMobile)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    audits: ").append(toIndentedString(audits)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    pingbackUrl: ").append(toIndentedString(pingbackUrl)).append("\n");
    sb.append("    postbackUrl: ").append(toIndentedString(postbackUrl)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("for_mobile");
    openapiFields.add("categories");
    openapiFields.add("audits");
    openapiFields.add("version");
    openapiFields.add("language_name");
    openapiFields.add("language_code");
    openapiFields.add("tag");
    openapiFields.add("pingback_url");
    openapiFields.add("postback_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OnPageLighthouseTaskPostRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OnPageLighthouseTaskPostRequestInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnPageLighthouseTaskPostRequestInfo is not found in the empty JSON string", OnPageLighthouseTaskPostRequestInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("categories") != null && !jsonObj.get("categories").isJsonNull() && !jsonObj.get("categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `categories` to be an array in the JSON string but got `%s`", jsonObj.get("categories").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("audits") != null && !jsonObj.get("audits").isJsonNull() && !jsonObj.get("audits").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `audits` to be an array in the JSON string but got `%s`", jsonObj.get("audits").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("language_name") != null && !jsonObj.get("language_name").isJsonNull()) && !jsonObj.get("language_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language_name").toString()));
      }
      if ((jsonObj.get("language_code") != null && !jsonObj.get("language_code").isJsonNull()) && !jsonObj.get("language_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language_code").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      if ((jsonObj.get("pingback_url") != null && !jsonObj.get("pingback_url").isJsonNull()) && !jsonObj.get("pingback_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pingback_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pingback_url").toString()));
      }
      if ((jsonObj.get("postback_url") != null && !jsonObj.get("postback_url").isJsonNull()) && !jsonObj.get("postback_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postback_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postback_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnPageLighthouseTaskPostRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnPageLighthouseTaskPostRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnPageLighthouseTaskPostRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnPageLighthouseTaskPostRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OnPageLighthouseTaskPostRequestInfo>() {
           @Override
           public void write(JsonWriter out, OnPageLighthouseTaskPostRequestInfo value) throws IOException {
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
           public OnPageLighthouseTaskPostRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OnPageLighthouseTaskPostRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of OnPageLighthouseTaskPostRequestInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OnPageLighthouseTaskPostRequestInfo
   * @throws IOException if the JSON string is invalid with respect to OnPageLighthouseTaskPostRequestInfo
   */
  public static OnPageLighthouseTaskPostRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnPageLighthouseTaskPostRequestInfo.class);
  }

  /**
   * Convert an instance of OnPageLighthouseTaskPostRequestInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

