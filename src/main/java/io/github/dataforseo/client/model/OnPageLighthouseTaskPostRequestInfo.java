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



public class OnPageLighthouseTaskPostRequestInfo  {


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public OnPageLighthouseTaskPostRequestInfo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * target URLrequired fieldtarget page should be specified with its absolute URL (including http:// or https://)example:https://dataforseo.com/
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_FOR_MOBILE = "for_mobile";
  @SerializedName(SERIALIZED_NAME_FOR_MOBILE)
  private Boolean forMobile;

  public OnPageLighthouseTaskPostRequestInfo forMobile(Boolean forMobile) {
    this.forMobile = forMobile;
    return this;
  }

  /**
   * applies mobile emulationoptional fieldif set to true, Lighthouse will use mobile device and screen emulation to test the page against mobile environmentif set to false, the results will be provided for desktopdefault value: false
   * @return forMobile
   */
  @javax.annotation.Nullable
  public Boolean getForMobile() {
    return forMobile;
  }

  public void setForMobile(Boolean forMobile) {
    this.forMobile = forMobile;
  }


  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<String> categories;

  public OnPageLighthouseTaskPostRequestInfo categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  /**
   * categories of Lighthouse auditsoptional fieldeach category is a collection of audits and audit groups that applies weighting and scoring to the section (see official definition)if you ignore this field, we will return data for all categories unless you specify auditsuse this field to get data for specific categories you indicate herepossible values:seo, performance, best_practices, accessibility
   * @return categories
   */
  @javax.annotation.Nullable
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }


  public static final String SERIALIZED_NAME_AUDITS = "audits";
  @SerializedName(SERIALIZED_NAME_AUDITS)
  private List<String> audits;

  public OnPageLighthouseTaskPostRequestInfo audits(List<String> audits) {
    this.audits = audits;
    return this;
  }

  /**
   * Lighthouse auditsoptional fieldaudits are individual tests Lighthouse runs for each specific feature/optimization/metric to produce a numeric score (see official definition)if you ignore this field, we will return data for all auditsuse this field to get data for specific audits you indicate herenote that some audits do not belong to a specific category and are stand-alone page quality measurementsin general, there can be several use cases:1. if you ignore categories, you can use this field to get data for the specified audits onlyfor example, if you ignore 'categories' and specify 'audits': ['metrics/cumulative-layout-shift','metrics/largest-contentful-paint','metrics/total-blocking-time'], you will get data only for these audits2. if you specify a category, you can use this field to additionally receive audits that do not belong to the category(-ies) you specifiedfor example, if you specify 'categories': ['seo'] and 'audits': ['metrics/cumulative-layout-shift','metrics/largest-contentful-paint','metrics/total-blocking-time'], you will get only these audits under 'performance' and all audits under 'seo'you can get the full list of possible audits here
   * @return audits
   */
  @javax.annotation.Nullable
  public List<String> getAudits() {
    return audits;
  }

  public void setAudits(List<String> audits) {
    this.audits = audits;
  }


  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public OnPageLighthouseTaskPostRequestInfo version(String version) {
    this.version = version;
    return this;
  }

  /**
   * lighthouse versionoptional fieldyou can obtain the results specific to a certain Lighthouse version by specifying its numberthe list of available versions is available through the Lighthouse Versions endpoint
   * @return version
   */
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_NAME = "language_name";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
  private String languageName;

  public OnPageLighthouseTaskPostRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * lighthouse language nameoptional fieldyou can receive the list of available languages of the search engine with their language_name by making a separate request to https://api.dataforseo.com/v3/on_page/lighthouse/languagesdefault value:English
   * @return languageName
   */
  @javax.annotation.Nullable
  public String getLanguageName() {
    return languageName;
  }

  public void setLanguageName(String languageName) {
    this.languageName = languageName;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public OnPageLighthouseTaskPostRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * lighthouse language codeoptional fieldyou can receive the list of available languages of the search engine with their language_code by making a separate request to https://api.dataforseo.com/v3/on_page/lighthouse/languagesdefault value:en
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_CUSTOM_USER_AGENT = "custom_user_agent";
  @SerializedName(SERIALIZED_NAME_CUSTOM_USER_AGENT)
  private String customUserAgent;

  public OnPageLighthouseTaskPostRequestInfo customUserAgent(String customUserAgent) {
    this.customUserAgent = customUserAgent;
    return this;
  }

  /**
   * custom user agentoptional fieldspecify the custom user agent used by the browser when running the Lighthouse audit;can be specified with up to 254 characters;
   * @return customUserAgent
   */
  @javax.annotation.Nullable
  public String getCustomUserAgent() {
    return customUserAgent;
  }

  public void setCustomUserAgent(String customUserAgent) {
    this.customUserAgent = customUserAgent;
  }


  public static final String SERIALIZED_NAME_BROWSER_SCREEN_WIDTH = "browser_screen_width";
  @SerializedName(SERIALIZED_NAME_BROWSER_SCREEN_WIDTH)
  private Long browserScreenWidth;

  public OnPageLighthouseTaskPostRequestInfo browserScreenWidth(Long browserScreenWidth) {
    this.browserScreenWidth = browserScreenWidth;
    return this;
  }

  /**
   * browser screen widthoptional fieldset the screen width of the browser used for the Lighthouse audit to emulate a specific device;can be specified within the following range: 240–9999;
   * @return browserScreenWidth
   */
  @javax.annotation.Nullable
  public Long getBrowserScreenWidth() {
    return browserScreenWidth;
  }

  public void setBrowserScreenWidth(Long browserScreenWidth) {
    this.browserScreenWidth = browserScreenWidth;
  }


  public static final String SERIALIZED_NAME_BROWSER_SCREEN_HEIGHT = "browser_screen_height";
  @SerializedName(SERIALIZED_NAME_BROWSER_SCREEN_HEIGHT)
  private Integer browserScreenHeight;

  public OnPageLighthouseTaskPostRequestInfo browserScreenHeight(Integer browserScreenHeight) {
    this.browserScreenHeight = browserScreenHeight;
    return this;
  }

  /**
   * browser screen heightoptional fieldset the screen height of the browser used for the Lighthouse audit to emulate a specific device;can be specified within the following range: 240–9999;
   * @return browserScreenHeight
   */
  @javax.annotation.Nullable
  public Integer getBrowserScreenHeight() {
    return browserScreenHeight;
  }

  public void setBrowserScreenHeight(Integer browserScreenHeight) {
    this.browserScreenHeight = browserScreenHeight;
  }


  public static final String SERIALIZED_NAME_BROWSER_SCREEN_SCALE_FACTOR = "browser_screen_scale_factor";
  @SerializedName(SERIALIZED_NAME_BROWSER_SCREEN_SCALE_FACTOR)
  private Double browserScreenScaleFactor;

  public OnPageLighthouseTaskPostRequestInfo browserScreenScaleFactor(Double browserScreenScaleFactor) {
    this.browserScreenScaleFactor = browserScreenScaleFactor;
    return this;
  }

  /**
   * browser screen scale factoroptional fieldset the device pixel ratio of the browser used for the Lighthouse audit;can be specified within the following range: 0.5–3;
   * @return browserScreenScaleFactor
   */
  @javax.annotation.Nullable
  public Double getBrowserScreenScaleFactor() {
    return browserScreenScaleFactor;
  }

  public void setBrowserScreenScaleFactor(Double browserScreenScaleFactor) {
    this.browserScreenScaleFactor = browserScreenScaleFactor;
  }


  public static final String SERIALIZED_NAME_BROWSER_NETWORK_THROTTLING_METHOD = "browser_network_throttling_method";
  @SerializedName(SERIALIZED_NAME_BROWSER_NETWORK_THROTTLING_METHOD)
  private String browserNetworkThrottlingMethod;

  public OnPageLighthouseTaskPostRequestInfo browserNetworkThrottlingMethod(String browserNetworkThrottlingMethod) {
    this.browserNetworkThrottlingMethod = browserNetworkThrottlingMethod;
    return this;
  }

  /**
   * browser network throttling methodoptional fielddefines the method used to apply throttling during the Lighthouse audit;possible vaules:simulate - calculates estimated performance metrics without applying explicit throttling;devtools -  applies the throttling settings specified in browser_network_throttling and browser_cpu_throttling_multiplier;provided - uses the network conditions of the crawling environment;
   * @return browserNetworkThrottlingMethod
   */
  @javax.annotation.Nullable
  public String getBrowserNetworkThrottlingMethod() {
    return browserNetworkThrottlingMethod;
  }

  public void setBrowserNetworkThrottlingMethod(String browserNetworkThrottlingMethod) {
    this.browserNetworkThrottlingMethod = browserNetworkThrottlingMethod;
  }


  public static final String SERIALIZED_NAME_BROWSER_CPU_THROTTLING_MULTIPLIER = "browser_cpu_throttling_multiplier";
  @SerializedName(SERIALIZED_NAME_BROWSER_CPU_THROTTLING_MULTIPLIER)
  private Double browserCpuThrottlingMultiplier;

  public OnPageLighthouseTaskPostRequestInfo browserCpuThrottlingMultiplier(Double browserCpuThrottlingMultiplier) {
    this.browserCpuThrottlingMultiplier = browserCpuThrottlingMultiplier;
    return this;
  }

  /**
   * browser CPU throttling multiplierrequired if browser_network_throttling_method is set to devtools;set the CPU throttling multiplier to simulate device performance conditions during the Lighthouse audit;can be specified within the following range: 1–4;Note: this parameter is applied only when browser_network_throttling_method is set to devtools;
   * @return browserCpuThrottlingMultiplier
   */
  @javax.annotation.Nullable
  public Double getBrowserCpuThrottlingMultiplier() {
    return browserCpuThrottlingMultiplier;
  }

  public void setBrowserCpuThrottlingMultiplier(Double browserCpuThrottlingMultiplier) {
    this.browserCpuThrottlingMultiplier = browserCpuThrottlingMultiplier;
  }


  public static final String SERIALIZED_NAME_BROWSER_NETWORK_THROTTLING = "browser_network_throttling";
  @SerializedName(SERIALIZED_NAME_BROWSER_NETWORK_THROTTLING)
  private String browserNetworkThrottling;

  public OnPageLighthouseTaskPostRequestInfo browserNetworkThrottling(String browserNetworkThrottling) {
    this.browserNetworkThrottling = browserNetworkThrottling;
    return this;
  }

  /**
   * browser network throttlingrequired if browser_network_throttling_method is set to devtools;set the network throttling profile to simulate connection speed conditions during the Lighthouse audit;possible values: no_throttling, fast_4g, slow_4g, regular_3g, pc;Note: this parameter is applied only when browser_network_throttling_method is set to devtools;
   * @return browserNetworkThrottling
   */
  @javax.annotation.Nullable
  public String getBrowserNetworkThrottling() {
    return browserNetworkThrottling;
  }

  public void setBrowserNetworkThrottling(String browserNetworkThrottling) {
    this.browserNetworkThrottling = browserNetworkThrottling;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public OnPageLighthouseTaskPostRequestInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * user-defined task identifieroptional fieldthe character limit is 255you can use this parameter to identify the task and match it with the resultyou will find the specified tag value in the data object of the response
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  public static final String SERIALIZED_NAME_PINGBACK_URL = "pingback_url";
  @SerializedName(SERIALIZED_NAME_PINGBACK_URL)
  private String pingbackUrl;

  public OnPageLighthouseTaskPostRequestInfo pingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
    return this;
  }

  /**
   * notification URL of a completed taskoptional fieldwhen a task is completed we will notify you by GET request sent to the URL you have specifiedyou can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request.example:http://your-server.com/pingscript?id=$idhttp://your-server.com/pingscript?id=$id&tag=$tagNote: special characters in pingback_url will be urlencoded;i.a., the # character will be encoded into %23learn more on our Help Center
   * @return pingbackUrl
   */
  @javax.annotation.Nullable
  public String getPingbackUrl() {
    return pingbackUrl;
  }

  public void setPingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
  }



  public OnPageLighthouseTaskPostRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public OnPageLighthouseTaskPostRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    OnPageLighthouseTaskPostRequestInfo onPageLighthouseTaskPostRequestInfo = (OnPageLighthouseTaskPostRequestInfo) o;
    return

        Objects.equals(this.url, onPageLighthouseTaskPostRequestInfo.url) &&
        Objects.equals(this.forMobile, onPageLighthouseTaskPostRequestInfo.forMobile) &&
        Objects.equals(this.categories, onPageLighthouseTaskPostRequestInfo.categories) &&
        Objects.equals(this.audits, onPageLighthouseTaskPostRequestInfo.audits) &&
        Objects.equals(this.version, onPageLighthouseTaskPostRequestInfo.version) &&
        Objects.equals(this.languageName, onPageLighthouseTaskPostRequestInfo.languageName) &&
        Objects.equals(this.languageCode, onPageLighthouseTaskPostRequestInfo.languageCode) &&
        Objects.equals(this.customUserAgent, onPageLighthouseTaskPostRequestInfo.customUserAgent) &&
        Objects.equals(this.browserScreenWidth, onPageLighthouseTaskPostRequestInfo.browserScreenWidth) &&
        Objects.equals(this.browserScreenHeight, onPageLighthouseTaskPostRequestInfo.browserScreenHeight) &&
        Objects.equals(this.browserScreenScaleFactor, onPageLighthouseTaskPostRequestInfo.browserScreenScaleFactor) &&
        Objects.equals(this.browserNetworkThrottlingMethod, onPageLighthouseTaskPostRequestInfo.browserNetworkThrottlingMethod) &&
        Objects.equals(this.browserCpuThrottlingMultiplier, onPageLighthouseTaskPostRequestInfo.browserCpuThrottlingMultiplier) &&
        Objects.equals(this.browserNetworkThrottling, onPageLighthouseTaskPostRequestInfo.browserNetworkThrottling) &&
        Objects.equals(this.tag, onPageLighthouseTaskPostRequestInfo.tag) &&
        Objects.equals(this.pingbackUrl, onPageLighthouseTaskPostRequestInfo.pingbackUrl);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(url, forMobile, categories, audits, version, languageName, languageCode, customUserAgent, browserScreenWidth, browserScreenHeight, browserScreenScaleFactor, browserNetworkThrottlingMethod, browserCpuThrottlingMultiplier, browserNetworkThrottling, tag, pingbackUrl);
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
    sb.append("    customUserAgent: ").append(toIndentedString(customUserAgent)).append("\n");
    sb.append("    browserScreenWidth: ").append(toIndentedString(browserScreenWidth)).append("\n");
    sb.append("    browserScreenHeight: ").append(toIndentedString(browserScreenHeight)).append("\n");
    sb.append("    browserScreenScaleFactor: ").append(toIndentedString(browserScreenScaleFactor)).append("\n");
    sb.append("    browserNetworkThrottlingMethod: ").append(toIndentedString(browserNetworkThrottlingMethod)).append("\n");
    sb.append("    browserCpuThrottlingMultiplier: ").append(toIndentedString(browserCpuThrottlingMultiplier)).append("\n");
    sb.append("    browserNetworkThrottling: ").append(toIndentedString(browserNetworkThrottling)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    pingbackUrl: ").append(toIndentedString(pingbackUrl)).append("\n");
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
    
    openapiFields.add("custom_user_agent");
    
    openapiFields.add("browser_screen_width");
    
    openapiFields.add("browser_screen_height");
    
    openapiFields.add("browser_screen_scale_factor");
    
    openapiFields.add("browser_network_throttling_method");
    
    openapiFields.add("browser_cpu_throttling_multiplier");
    
    openapiFields.add("browser_network_throttling");
    
    openapiFields.add("tag");
    
    openapiFields.add("pingback_url");
    

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


  public static OnPageLighthouseTaskPostRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnPageLighthouseTaskPostRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}