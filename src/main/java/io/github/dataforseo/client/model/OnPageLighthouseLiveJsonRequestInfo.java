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


public class OnPageLighthouseLiveJsonRequestInfo  {


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public OnPageLighthouseLiveJsonRequestInfo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <em>target URL</em><br><strong>required field</strong><br>target page should be specified with its absolute URL (including http:// or https://)<br>example:<br><code>https://dataforseo.com/</code>
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

  public OnPageLighthouseLiveJsonRequestInfo forMobile(Boolean forMobile) {
    this.forMobile = forMobile;
    return this;
  }

  /**
   * <em>applies mobile emulation</em><br>optional field<br>if set to <code>true</code>, Lighthouse will use mobile device and screen emulation to test the page against mobile environment<br>if set to <code>false</code>, the results will be provided for desktop<br>default value: <code>false</code>
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

  public OnPageLighthouseLiveJsonRequestInfo categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  /**
   * <em>categories of Lighthouse audits</em><br>optional field<br>each category is a collection of audits and audit groups that applies weighting and scoring to the section (<a href='https://github.com/GoogleChrome/lighthouse/blob/master/docs/architecture.md#auditreport-terminology' rel='noopener noreferrer' target='_blank'>see official definition</a>)<p><strong>if you ignore this field, we will return data for all categories unless you specify <code>audits</code></strong><br>use this field to get data for specific categories you indicate here<p>possible values:<br><code>seo</code>, <code>performance</code>, <code>best_practices</code>, <code>accessibility</code>
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

  public OnPageLighthouseLiveJsonRequestInfo audits(List<String> audits) {
    this.audits = audits;
    return this;
  }

  /**
   * <em>Lighthouse audits</em><br>optional field<br>audits are individual tests Lighthouse runs for each specific feature/optimization/metric to produce a numeric score (<a href='https://github.com/GoogleChrome/lighthouse/blob/master/docs/architecture.md#components--terminology' rel='noopener noreferrer' target='_blank'>see official definition</a>);  <p><strong>if you ignore this field, we will return data for all audits</strong>;<br>use this field to get data for specific audits you indicate here;<p><strong>Note:</strong> that some audits do not belong to a specific category and are stand-alone page quality measurements;<p>in general, there can be several use cases:<p>1. if you ignore <code>categories</code>, you can use this field to get data for the specified audits only<br>for example, if you ignore <code>'categories'</code> and specify <code>'audits': ['metrics/cumulative-layout-shift','metrics/largest-contentful-paint','metrics/total-blocking-time']</code>, you will get data only for these audits<p>2. if you specify a category, you can use this field to additionally receive audits that do not belong to the category(-ies) you specified<br>for example, if you specify <code>'categories': ['seo']</code> and <code>'audits': ['metrics/cumulative-layout-shift','metrics/largest-contentful-paint','metrics/total-blocking-time']</code>, you will get only these audits under 'performance' and all audits under 'seo'<p>you can get <a href='/v3/on_page/lighthouse/audits/'>the full list of possible audits here</a>
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

  public OnPageLighthouseLiveJsonRequestInfo version(String version) {
    this.version = version;
    return this;
  }

  /**
   * <em>lighthouse version</em><br>optional field<br>you can obtain the results specific to a certain Lighthouse version by specifying its number<br>the list of available versions is available through the <a href='/v3/on_page/lighthouse/versions/' rel='noopener noreferrer' target='_blank'>Lighthouse Versions endpoint</a>
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

  public OnPageLighthouseLiveJsonRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * <em>lighthouse language name</em><br>optional field<br>you can receive the list of available languages of the search engine with their <code>language_name</code> by making a separate request to <code>https://api.dataforseo.com/v3/on_page/lighthouse/languages</code><br>default value:<br><code class='long-string'>English</code>
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

  public OnPageLighthouseLiveJsonRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * <em>lighthouse language code</em><br>optional field<br>you can receive the list of available languages of the search engine with their <code>language_code</code> by making a separate request to <code>https://api.dataforseo.com/v3/on_page/lighthouse/languages</code><br>default value:<br><code class='long-string'>en</code>
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

  public OnPageLighthouseLiveJsonRequestInfo customUserAgent(String customUserAgent) {
    this.customUserAgent = customUserAgent;
    return this;
  }

  /**
   * <em>custom user agent</em><br>optional field<br>specify the custom user agent used by the browser when running the Lighthouse audit;<br>can be specified with up to 254 characters;
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

  public OnPageLighthouseLiveJsonRequestInfo browserScreenWidth(Long browserScreenWidth) {
    this.browserScreenWidth = browserScreenWidth;
    return this;
  }

  /**
   * <em>browser screen width</em><br>optional field<br>set the screen width of the browser used for the Lighthouse audit to emulate a specific device;<br>can be specified within the following range: <code>240–9999</code>;
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

  public OnPageLighthouseLiveJsonRequestInfo browserScreenHeight(Integer browserScreenHeight) {
    this.browserScreenHeight = browserScreenHeight;
    return this;
  }

  /**
   * <em>browser screen height</em><br>optional field<br>set the screen height of the browser used for the Lighthouse audit to emulate a specific device;<br>can be specified within the following range: <code>240–9999</code>;
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

  public OnPageLighthouseLiveJsonRequestInfo browserScreenScaleFactor(Double browserScreenScaleFactor) {
    this.browserScreenScaleFactor = browserScreenScaleFactor;
    return this;
  }

  /**
   * <em>browser screen scale factor</em><br>optional field<br>set the device pixel ratio of the browser used for the Lighthouse audit;<br>can be specified within the following range: <code>0.5–3</code>;
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

  public OnPageLighthouseLiveJsonRequestInfo browserNetworkThrottlingMethod(String browserNetworkThrottlingMethod) {
    this.browserNetworkThrottlingMethod = browserNetworkThrottlingMethod;
    return this;
  }

  /**
   * <em>browser network throttling method</em><br>optional field<br>defines the method used to apply throttling during the Lighthouse audit;<br>possible vaules:<br><code>simulate</code> - calculates estimated performance metrics without applying explicit throttling;<br><code>devtools</code> -  applies the throttling settings specified in <code>browser_network_throttling</code> and <code>browser_cpu_throttling_multiplier</code>;<br><code>provided</code> - uses the network conditions of the crawling environment;
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

  public OnPageLighthouseLiveJsonRequestInfo browserCpuThrottlingMultiplier(Double browserCpuThrottlingMultiplier) {
    this.browserCpuThrottlingMultiplier = browserCpuThrottlingMultiplier;
    return this;
  }

  /**
   * <em>browser CPU throttling multiplier</em><br><strong>required if <code>browser_network_throttling_method</code> is set to <code>devtools</code>;</strong><br>set the CPU throttling multiplier to simulate device performance conditions during the Lighthouse audit;<br>can be specified within the following range: <code>1–4</code>;<br><strong>Note:</strong> this parameter is applied only when <code>browser_network_throttling_method</code> is set to <code>devtools</code>;
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

  public OnPageLighthouseLiveJsonRequestInfo browserNetworkThrottling(String browserNetworkThrottling) {
    this.browserNetworkThrottling = browserNetworkThrottling;
    return this;
  }

  /**
   * <em>browser network throttling</em><br><strong>required if <code>browser_network_throttling_method</code> is set to <code>devtools</code>;</strong><br>set the network throttling profile to simulate connection speed conditions during the Lighthouse audit;<br>possible values: <code>no_throttling</code>, <code>fast_4g</code>, <code>slow_4g</code>, <code>regular_3g</code>, <code>pc</code>;<br><strong>Note:</strong> this parameter is applied only when <code>browser_network_throttling_method</code> is set to <code>devtools</code>;
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

  public OnPageLighthouseLiveJsonRequestInfo tag(String tag) {
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



  public OnPageLighthouseLiveJsonRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public OnPageLighthouseLiveJsonRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    OnPageLighthouseLiveJsonRequestInfo onPageLighthouseLiveJsonRequestInfo = (OnPageLighthouseLiveJsonRequestInfo) o;
    return

        Objects.equals(this.url, onPageLighthouseLiveJsonRequestInfo.url) &&
        Objects.equals(this.forMobile, onPageLighthouseLiveJsonRequestInfo.forMobile) &&
        Objects.equals(this.categories, onPageLighthouseLiveJsonRequestInfo.categories) &&
        Objects.equals(this.audits, onPageLighthouseLiveJsonRequestInfo.audits) &&
        Objects.equals(this.version, onPageLighthouseLiveJsonRequestInfo.version) &&
        Objects.equals(this.languageName, onPageLighthouseLiveJsonRequestInfo.languageName) &&
        Objects.equals(this.languageCode, onPageLighthouseLiveJsonRequestInfo.languageCode) &&
        Objects.equals(this.customUserAgent, onPageLighthouseLiveJsonRequestInfo.customUserAgent) &&
        Objects.equals(this.browserScreenWidth, onPageLighthouseLiveJsonRequestInfo.browserScreenWidth) &&
        Objects.equals(this.browserScreenHeight, onPageLighthouseLiveJsonRequestInfo.browserScreenHeight) &&
        Objects.equals(this.browserScreenScaleFactor, onPageLighthouseLiveJsonRequestInfo.browserScreenScaleFactor) &&
        Objects.equals(this.browserNetworkThrottlingMethod, onPageLighthouseLiveJsonRequestInfo.browserNetworkThrottlingMethod) &&
        Objects.equals(this.browserCpuThrottlingMultiplier, onPageLighthouseLiveJsonRequestInfo.browserCpuThrottlingMultiplier) &&
        Objects.equals(this.browserNetworkThrottling, onPageLighthouseLiveJsonRequestInfo.browserNetworkThrottling) &&
        Objects.equals(this.tag, onPageLighthouseLiveJsonRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(url, forMobile, categories, audits, version, languageName, languageCode, customUserAgent, browserScreenWidth, browserScreenHeight, browserScreenScaleFactor, browserNetworkThrottlingMethod, browserCpuThrottlingMultiplier, browserNetworkThrottling, tag);
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
    sb.append("class OnPageLighthouseLiveJsonRequestInfo {\n");

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
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OnPageLighthouseLiveJsonRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnPageLighthouseLiveJsonRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnPageLighthouseLiveJsonRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnPageLighthouseLiveJsonRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnPageLighthouseLiveJsonRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OnPageLighthouseLiveJsonRequestInfo>() {
           @Override
           public void write(JsonWriter out, OnPageLighthouseLiveJsonRequestInfo value) throws IOException {
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
           public OnPageLighthouseLiveJsonRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OnPageLighthouseLiveJsonRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static OnPageLighthouseLiveJsonRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnPageLighthouseLiveJsonRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}