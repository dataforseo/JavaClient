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



public class OnPagePageScreenshotRequestInfo  {


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public OnPagePageScreenshotRequestInfo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * page url
* required field
* absolute URL of the page to snap
* note: if the URL you indicate here returns a 404 status code or the indicated value is not a valid URL, you will obtain 'error_message':'Screenshot is empty' in the response array
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_ACCEPT_LANGUAGE = "accept_language";
  @SerializedName(SERIALIZED_NAME_ACCEPT_LANGUAGE)
  private String acceptLanguage;

  public OnPagePageScreenshotRequestInfo acceptLanguage(String acceptLanguage) {
    this.acceptLanguage = acceptLanguage;
    return this;
  }

  /**
   * language header for accessing the website
* optional field
* all locale formats are supported (xx, xx-XX, xxx-XX, etc.)
* note: if you do not specify this parameter, some websites may deny access; in this case, you will obtain 'error_message':'Screenshot is empty' in the response array
   * @return acceptLanguage
   */
  @javax.annotation.Nullable
  public String getAcceptLanguage() {
    return acceptLanguage;
  }

  public void setAcceptLanguage(String acceptLanguage) {
    this.acceptLanguage = acceptLanguage;
  }


  public static final String SERIALIZED_NAME_CUSTOM_USER_AGENT = "custom_user_agent";
  @SerializedName(SERIALIZED_NAME_CUSTOM_USER_AGENT)
  private String customUserAgent;

  public OnPagePageScreenshotRequestInfo customUserAgent(String customUserAgent) {
    this.customUserAgent = customUserAgent;
    return this;
  }

  /**
   * custom user agent
* optional field
* custom user agent for crawling a website
* example: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36
* 
* default value: Mozilla/5.0 (compatible; RSiteAuditor)
   * @return customUserAgent
   */
  @javax.annotation.Nullable
  public String getCustomUserAgent() {
    return customUserAgent;
  }

  public void setCustomUserAgent(String customUserAgent) {
    this.customUserAgent = customUserAgent;
  }


  public static final String SERIALIZED_NAME_BROWSER_PRESET = "browser_preset";
  @SerializedName(SERIALIZED_NAME_BROWSER_PRESET)
  private String browserPreset;

  public OnPagePageScreenshotRequestInfo browserPreset(String browserPreset) {
    this.browserPreset = browserPreset;
    return this;
  }

  /**
   * preset for browser screen parameters
* optional field
* if you use this field, you don’t need to indicate browser_screen_width, browser_screen_height, browser_screen_scale_factor
* possible values:
* desktop, mobile, tablet
* desktop preset will apply the following values:
* browser_screen_width: 1920
* browser_screen_height: 1080
* browser_screen_scale_factor: 1
* mobile preset will apply the following values:
* browser_screen_width: 390
* browser_screen_height: 844
* browser_screen_scale_factor: 3
* tablet preset will apply the following values:
* browser_screen_width: 1024
* browser_screen_height: 1366
* browser_screen_scale_factor: 2
* Note: in this endpoint, the enable_browser_rendering, enable_javascript, load_resources, and enable_xhr parameters are always enabled.
   * @return browserPreset
   */
  @javax.annotation.Nullable
  public String getBrowserPreset() {
    return browserPreset;
  }

  public void setBrowserPreset(String browserPreset) {
    this.browserPreset = browserPreset;
  }


  public static final String SERIALIZED_NAME_BROWSER_SCREEN_WIDTH = "browser_screen_width";
  @SerializedName(SERIALIZED_NAME_BROWSER_SCREEN_WIDTH)
  private Long browserScreenWidth;

  public OnPagePageScreenshotRequestInfo browserScreenWidth(Long browserScreenWidth) {
    this.browserScreenWidth = browserScreenWidth;
    return this;
  }

  /**
   * browser screen width
* optional field
* you can set a custom browser screen width to perform audit for a particular device;
* if you use this field, you don’t need to indicate browser_preset as it will be ignored;
* minimum value, in pixels: 240
* maximum value, in pixels: 9999
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

  public OnPagePageScreenshotRequestInfo browserScreenHeight(Integer browserScreenHeight) {
    this.browserScreenHeight = browserScreenHeight;
    return this;
  }

  /**
   * browser screen height
* optional field
* you can set a custom browser screen height to perform audit for a particular device;
* if you use this field, you don’t need to indicate browser_preset as it will be ignored;
* minimum value, in pixels: 240
* maximum value, in pixels: 9999
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

  public OnPagePageScreenshotRequestInfo browserScreenScaleFactor(Double browserScreenScaleFactor) {
    this.browserScreenScaleFactor = browserScreenScaleFactor;
    return this;
  }

  /**
   * browser screen scale factor
* optional field
* you can set a custom browser screen resolution ratio to perform audit for a particular device;
* if you use this field, you don’t need to indicate browser_preset as it will be ignored;
* minimum value: 0.5
* maximum value: 3
   * @return browserScreenScaleFactor
   */
  @javax.annotation.Nullable
  public Double getBrowserScreenScaleFactor() {
    return browserScreenScaleFactor;
  }

  public void setBrowserScreenScaleFactor(Double browserScreenScaleFactor) {
    this.browserScreenScaleFactor = browserScreenScaleFactor;
  }


  public static final String SERIALIZED_NAME_FULL_PAGE_SCREENSHOT = "full_page_screenshot";
  @SerializedName(SERIALIZED_NAME_FULL_PAGE_SCREENSHOT)
  private Boolean fullPageScreenshot;

  public OnPagePageScreenshotRequestInfo fullPageScreenshot(Boolean fullPageScreenshot) {
    this.fullPageScreenshot = fullPageScreenshot;
    return this;
  }

  /**
   * take a screenshot of the full page
* optional field
* set to false if you want to capture only the part of the page displayed before scrolling
* default value: true
   * @return fullPageScreenshot
   */
  @javax.annotation.Nullable
  public Boolean getFullPageScreenshot() {
    return fullPageScreenshot;
  }

  public void setFullPageScreenshot(Boolean fullPageScreenshot) {
    this.fullPageScreenshot = fullPageScreenshot;
  }


  public static final String SERIALIZED_NAME_DISABLE_COOKIE_POPUP = "disable_cookie_popup";
  @SerializedName(SERIALIZED_NAME_DISABLE_COOKIE_POPUP)
  private Boolean disableCookiePopup;

  public OnPagePageScreenshotRequestInfo disableCookiePopup(Boolean disableCookiePopup) {
    this.disableCookiePopup = disableCookiePopup;
    return this;
  }

  /**
   * disable the cookie popup 
* optional field
* set to true if you want to disable the popup requesting cookie consent from the user;
* default value:
* false
   * @return disableCookiePopup
   */
  @javax.annotation.Nullable
  public Boolean getDisableCookiePopup() {
    return disableCookiePopup;
  }

  public void setDisableCookiePopup(Boolean disableCookiePopup) {
    this.disableCookiePopup = disableCookiePopup;
  }


  public static final String SERIALIZED_NAME_SWITCH_POOL = "switch_pool";
  @SerializedName(SERIALIZED_NAME_SWITCH_POOL)
  private Boolean switchPool;

  public OnPagePageScreenshotRequestInfo switchPool(Boolean switchPool) {
    this.switchPool = switchPool;
    return this;
  }

  /**
   * switch proxy pool
* optional field
* if true, additional proxy pools will be used to obtain the requested data;
* the parameter can be used if a multitude of tasks is set simultaneously, resulting in occasional rate-limit and/or site_unreachable errors
   * @return switchPool
   */
  @javax.annotation.Nullable
  public Boolean getSwitchPool() {
    return switchPool;
  }

  public void setSwitchPool(Boolean switchPool) {
    this.switchPool = switchPool;
  }


  public static final String SERIALIZED_NAME_IP_POOL_FOR_SCAN = "ip_pool_for_scan";
  @SerializedName(SERIALIZED_NAME_IP_POOL_FOR_SCAN)
  private String ipPoolForScan;

  public OnPagePageScreenshotRequestInfo ipPoolForScan(String ipPoolForScan) {
    this.ipPoolForScan = ipPoolForScan;
    return this;
  }

  /**
   * proxy pool
* optional field
* you can choose a location of the proxy pool that will be used to obtain the requested data;
* the parameter can be used if page content is inaccessible in one of the locations, resulting in occasional site_unreachable errors
* possible values: us, de
   * @return ipPoolForScan
   */
  @javax.annotation.Nullable
  public String getIpPoolForScan() {
    return ipPoolForScan;
  }

  public void setIpPoolForScan(String ipPoolForScan) {
    this.ipPoolForScan = ipPoolForScan;
  }



  public OnPagePageScreenshotRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public OnPagePageScreenshotRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    OnPagePageScreenshotRequestInfo onPagePageScreenshotRequestInfo = (OnPagePageScreenshotRequestInfo) o;
    return

        Objects.equals(this.url, onPagePageScreenshotRequestInfo.url) &&
        Objects.equals(this.acceptLanguage, onPagePageScreenshotRequestInfo.acceptLanguage) &&
        Objects.equals(this.customUserAgent, onPagePageScreenshotRequestInfo.customUserAgent) &&
        Objects.equals(this.browserPreset, onPagePageScreenshotRequestInfo.browserPreset) &&
        Objects.equals(this.browserScreenWidth, onPagePageScreenshotRequestInfo.browserScreenWidth) &&
        Objects.equals(this.browserScreenHeight, onPagePageScreenshotRequestInfo.browserScreenHeight) &&
        Objects.equals(this.browserScreenScaleFactor, onPagePageScreenshotRequestInfo.browserScreenScaleFactor) &&
        Objects.equals(this.fullPageScreenshot, onPagePageScreenshotRequestInfo.fullPageScreenshot) &&
        Objects.equals(this.disableCookiePopup, onPagePageScreenshotRequestInfo.disableCookiePopup) &&
        Objects.equals(this.switchPool, onPagePageScreenshotRequestInfo.switchPool) &&
        Objects.equals(this.ipPoolForScan, onPagePageScreenshotRequestInfo.ipPoolForScan);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(url, acceptLanguage, customUserAgent, browserPreset, browserScreenWidth, browserScreenHeight, browserScreenScaleFactor, fullPageScreenshot, disableCookiePopup, switchPool, ipPoolForScan);
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
    sb.append("class OnPagePageScreenshotRequestInfo {\n");

    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
    sb.append("    customUserAgent: ").append(toIndentedString(customUserAgent)).append("\n");
    sb.append("    browserPreset: ").append(toIndentedString(browserPreset)).append("\n");
    sb.append("    browserScreenWidth: ").append(toIndentedString(browserScreenWidth)).append("\n");
    sb.append("    browserScreenHeight: ").append(toIndentedString(browserScreenHeight)).append("\n");
    sb.append("    browserScreenScaleFactor: ").append(toIndentedString(browserScreenScaleFactor)).append("\n");
    sb.append("    fullPageScreenshot: ").append(toIndentedString(fullPageScreenshot)).append("\n");
    sb.append("    disableCookiePopup: ").append(toIndentedString(disableCookiePopup)).append("\n");
    sb.append("    switchPool: ").append(toIndentedString(switchPool)).append("\n");
    sb.append("    ipPoolForScan: ").append(toIndentedString(ipPoolForScan)).append("\n");
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
    
    openapiFields.add("accept_language");
    
    openapiFields.add("custom_user_agent");
    
    openapiFields.add("browser_preset");
    
    openapiFields.add("browser_screen_width");
    
    openapiFields.add("browser_screen_height");
    
    openapiFields.add("browser_screen_scale_factor");
    
    openapiFields.add("full_page_screenshot");
    
    openapiFields.add("disable_cookie_popup");
    
    openapiFields.add("switch_pool");
    
    openapiFields.add("ip_pool_for_scan");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OnPagePageScreenshotRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnPagePageScreenshotRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnPagePageScreenshotRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnPagePageScreenshotRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnPagePageScreenshotRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OnPagePageScreenshotRequestInfo>() {
           @Override
           public void write(JsonWriter out, OnPagePageScreenshotRequestInfo value) throws IOException {
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
           public OnPagePageScreenshotRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OnPagePageScreenshotRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static OnPagePageScreenshotRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnPagePageScreenshotRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}