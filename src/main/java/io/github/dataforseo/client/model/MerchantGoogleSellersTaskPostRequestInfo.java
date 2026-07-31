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


public class MerchantGoogleSellersTaskPostRequestInfo  {


  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public MerchantGoogleSellersTaskPostRequestInfo productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * <em>unique product identifier on Google Shopping</em><br><strong>required field if <code>data_docid</code> or <code>gid</code> is not specified</strong><br>we recommend specifying <code>product_id</code> together with <code>data_docid</code> and <code>gid</code> for optimal results;<br>you can get this value for a certain product by making a separate request to <a href='/v3/merchant/google/products/task_post'>the Google Shopping Products endpoint</a><br>example:<br><code>4485466949985702538</code><br>learn more about the parameter in <a href='https://dataforseo.com/help-center/product-id-google-shopping' rel='noopener noreferrer' target='_blank'>this help center guide</a>
   * @return productId
   */
  @javax.annotation.Nullable
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }


  public static final String SERIALIZED_NAME_DATA_DOCID = "data_docid";
  @SerializedName(SERIALIZED_NAME_DATA_DOCID)
  private String dataDocid;

  public MerchantGoogleSellersTaskPostRequestInfo dataDocid(String dataDocid) {
    this.dataDocid = dataDocid;
    return this;
  }

  /**
   * <em>unique identifier of the SERP data element</em><br><strong>required field if <code>product_id</code> or <code>gid</code> is not specified</strong><br>we recommend specifying <code>data_docid</code> together with <code>product_id</code> and <code>gid</code> for optimal results;<br>you can get this value for a certain element by making a separate request to <a href='/v3/merchant/google/products/task_post'>the Google Shopping Products endpoint</a><br>example:<br><code>13071766526042404278</code>
   * @return dataDocid
   */
  @javax.annotation.Nullable
  public String getDataDocid() {
    return dataDocid;
  }

  public void setDataDocid(String dataDocid) {
    this.dataDocid = dataDocid;
  }


  public static final String SERIALIZED_NAME_GID = "gid";
  @SerializedName(SERIALIZED_NAME_GID)
  private String gid;

  public MerchantGoogleSellersTaskPostRequestInfo gid(String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * <em>global product identifier on Google Shopping</em><br><strong>required field if <code>product_id</code> or <code>data_docid</code> is not specified</strong><br>we recommend specifying <code>gid</code> together with <code>product_id</code> and <code>data_docid</code> for optimal results;<br>you can get this value for a certain product by making a separate request to <a href='/v3/merchant/google/products/task_post'>the Google Shopping Products endpoint</a><br>example:<br><code>4702526954592161872</code><br>learn more about the parameter in <a href='https://dataforseo.com/help-center/whats-a-gid-in-google-shopping-api' rel='noopener noreferrer' target='_blank'>this help center guide</a>
   * @return gid
   */
  @javax.annotation.Nullable
  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }


  public static final String SERIALIZED_NAME_PVF = "pvf";
  @SerializedName(SERIALIZED_NAME_PVF)
  private String pvf;

  public MerchantGoogleSellersTaskPostRequestInfo pvf(String pvf) {
    this.pvf = pvf;
    return this;
  }

  /**
   * <em>product variant filter  on Google Shopping</em><br>optional field<br>parameter in Google Shopping URL, setting optional product variant filtration;<br>example:<br><code>Eg4iBWNvbG9yKgV3aGl0ZRISIgxwYWNrYWdlIHNpemUqAjE0EgoiBHNpemUqAnhs</code>
   * @return pvf
   */
  @javax.annotation.Nullable
  public String getPvf() {
    return pvf;
  }

  public void setPvf(String pvf) {
    this.pvf = pvf;
  }


  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public MerchantGoogleSellersTaskPostRequestInfo priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * <em>task priority</em><br>optional field<br>can take the following values:<br>1 – normal execution priority (set by default)<br>2 – high execution priorityYou will be additionally charged for the tasks with high execution priority.<br>The cost can be calculated on the <a title='Pricing' href='https://dataforseo.com/pricing/merchant/google-shopping-api' target='_blank' rel='noopener noreferrer'>Pricing</a> page.
   * @return priority
   */
  @javax.annotation.Nullable
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public MerchantGoogleSellersTaskPostRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * <em>full name of the location</em><br><strong>required field if you don't specify</strong> <code>location_code</code> or <code>location_coordinate</code><br><strong>if you use this field, you don't need to specify <code>location_code</code> or <code>location_coordinate</code></strong><br>you can receive the list of available Google Shopping locations with their <code>location_name</code> by making a separate request to the <code>https://api.dataforseo.com/v3/merchant/google/locations</code><br>example:<br><code class='long-string'>London,England,United Kingdom</code>
   * @return locationName
   */
  @javax.annotation.Nullable
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }


  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public MerchantGoogleSellersTaskPostRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * <em>location code</em><br><strong>required field if you don't specify</strong> <code>location_name</code>_or <code>location_coordinate</code><br><strong>if you use this field, you don't need to specify <code>location_name</code> or <code>location_coordinate</code></strong><br>you can receive the list of available Google Shopping locations with their <code>location_code</code> by making a separate request to the <code>https://api.dataforseo.com/v3/merchant/google/locations</code><br>example:<br><code class='long-string'>2840</code>
   * @return locationCode
   */
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public static final String SERIALIZED_NAME_LOCATION_COORDINATE = "location_coordinate";
  @SerializedName(SERIALIZED_NAME_LOCATION_COORDINATE)
  private String locationCoordinate;

  public MerchantGoogleSellersTaskPostRequestInfo locationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
    return this;
  }

  /**
   * <em>GPS coordinates of a location</em><br><strong>required field if you don't specify</strong> <code>location_name</code>_or <code>location_code</code><br><strong>if you use this field, you don't need to specify <code>location_name</code> or <code>location_code</code></strong><br><code>location_coordinate</code> parameter should be specified in the <em>'latitude,longitude,radius'</em> format<br>the maximum number of decimal digits for <em>'latitude'</em> and <em>'longitude'</em>: 7<br>the minimum value for <em>'radius'</em>: 199.9<br>example:<br><code class='long-string'>53.476225,-2.243572,200</code>
   * @return locationCoordinate
   */
  @javax.annotation.Nullable
  public String getLocationCoordinate() {
    return locationCoordinate;
  }

  public void setLocationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_NAME = "language_name";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
  private String languageName;

  public MerchantGoogleSellersTaskPostRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * <em>full name of the language</em><br><strong>required field if you don't specify</strong> <code>language_code</code><br><strong>if you use this field, you don't need to specify <code>language_code</code></strong><br>you can receive the list of available Google Shopping languages with their <code>language_name</code> by making a separate request to the <code>https://api.dataforseo.com/v3/merchant/google/languages</code><br>example:<br><code class='long-string'>English</code>
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

  public MerchantGoogleSellersTaskPostRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * <em>language code</em><br><strong>required field if you don't specify</strong> <code>language_name</code><br><strong>if you use this field, you don't need to specify <code>language_name</code></strong><br>you can receive the list of available Google Shopping languages with their <code>language_code</code>_by making a separate request to the <code>https://api.dataforseo.com/v3/merchant/google/languages</code><em><br></em>example:<em><br></em><code class='long-string'>en</code>
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_DEPTH = "depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private Integer depth;

  public MerchantGoogleSellersTaskPostRequestInfo depth(Integer depth) {
    this.depth = depth;
    return this;
  }

  /**
   * <em>parsing depth</em><br>optional field<br>number of results to be retrieved from Google Shopping SERP<br>default value: <code>10</code><br>max value: <code>200</code><br><strong>your account will be billed per each SERP containing up to 10 results;</strong> <br>setting depth above 10 may result in additional charges <a href='https://dataforseo.com/help-center/how-many-results-scraped' rel='noopener noreferrer' target='_blank'>if the search engine returns more than 10 results</a>;<br>the cost can be calculated on the <a title='Pricing' href='https://dataforseo.com/pricing/merchant/google-shopping-api' target='_blank' rel='noopener noreferrer'>Pricing</a> page
   * @return depth
   */
  @javax.annotation.Nullable
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }


  public static final String SERIALIZED_NAME_SE_DOMAIN = "se_domain";
  @SerializedName(SERIALIZED_NAME_SE_DOMAIN)
  private String seDomain;

  public MerchantGoogleSellersTaskPostRequestInfo seDomain(String seDomain) {
    this.seDomain = seDomain;
    return this;
  }

  /**
   * <em>search engine domain</em><br>optional field<br>we choose the relevant search engine domain automatically according to the location and language you specify<br>however, you can set a custom search engine domain in this field<br>example:<br><em><code>google.co.uk</code></em>, <em><code>google.com.au</code></em>, <em><code>google.de</code></em>, etc.
   * @return seDomain
   */
  @javax.annotation.Nullable
  public String getSeDomain() {
    return seDomain;
  }

  public void setSeDomain(String seDomain) {
    this.seDomain = seDomain;
  }


  public static final String SERIALIZED_NAME_GET_SHOPS_ON_GOOGLE = "get_shops_on_google";
  @SerializedName(SERIALIZED_NAME_GET_SHOPS_ON_GOOGLE)
  private Boolean getShopsOnGoogle;

  public MerchantGoogleSellersTaskPostRequestInfo getShopsOnGoogle(Boolean getShopsOnGoogle) {
    this.getShopsOnGoogle = getShopsOnGoogle;
    return this;
  }

  /**
   * <em>include 'buy on Google' shops</em><br>optional field<br>if set to <code>true</code>, the response will contain the list of sellers that allow to purchase a given product directly on Google<br>Note: if set to <code>true</code>, the cost of a task will be doubled
   * @return getShopsOnGoogle
   */
  @javax.annotation.Nullable
  public Boolean getGetShopsOnGoogle() {
    return getShopsOnGoogle;
  }

  public void setGetShopsOnGoogle(Boolean getShopsOnGoogle) {
    this.getShopsOnGoogle = getShopsOnGoogle;
  }


  public static final String SERIALIZED_NAME_ADDITIONAL_SPECIFICATIONS = "additional_specifications";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_SPECIFICATIONS)
  private Map<String, String> additionalSpecifications;

  public MerchantGoogleSellersTaskPostRequestInfo additionalSpecifications(Map<String, String> additionalSpecifications) {
    this.additionalSpecifications = additionalSpecifications;
    return this;
  }

  /**
   * <em>object containing additional url parameters</em><br>you can get additional information about the product by using the <code>'additional_specifications</code> object, which you can get by making a separate request to the <a href='/v3/merchant/google/products/task_post'>Google Shopping Products endpoint</a><br>example:<br><code>'additional_specifications': {<br>'eto': '16157121050167572763_0'<br>}</code>
   * @return additionalSpecifications
   */
  @javax.annotation.Nullable
  public Map<String, String> getAdditionalSpecifications() {
    return additionalSpecifications;
  }

  public void setAdditionalSpecifications(Map<String, String> additionalSpecifications) {
    this.additionalSpecifications = additionalSpecifications;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public MerchantGoogleSellersTaskPostRequestInfo tag(String tag) {
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


  public static final String SERIALIZED_NAME_POSTBACK_URL = "postback_url";
  @SerializedName(SERIALIZED_NAME_POSTBACK_URL)
  private String postbackUrl;

  public MerchantGoogleSellersTaskPostRequestInfo postbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
    return this;
  }

  /**
   * <em>URL for sending task results</em><br>optional field<br>once the task is completed, we will send a POST request with its results compressed in the <code>gzip</code> format to the <code>postback_url</code> you specified<br>you can use the ‘$id’ string as a <code>$id</code> variable and ‘$tag’ as urlencoded <code>$tag</code> variable. We will set the necessary values before sending the request.<br>example:<br><code>http://your-server.com/postbackscript?id=$id</code><br><code>http://your-server.com/postbackscript?id=$id&tag=$tag</code><br><strong>Note:</strong> special characters in <code>postback_url</code> will be urlencoded; <br>i.a., the <code>#</code> character will be encoded into <code>%23</code><p>learn more on our <a href='https://dataforseo.com/help-center/pingbacks-postbacks-with-dataforseo-api' target='_blank' rel='noopener noreferrer'>Help Center</a>
   * @return postbackUrl
   */
  @javax.annotation.Nullable
  public String getPostbackUrl() {
    return postbackUrl;
  }

  public void setPostbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
  }


  public static final String SERIALIZED_NAME_POSTBACK_DATA = "postback_data";
  @SerializedName(SERIALIZED_NAME_POSTBACK_DATA)
  private String postbackData;

  public MerchantGoogleSellersTaskPostRequestInfo postbackData(String postbackData) {
    this.postbackData = postbackData;
    return this;
  }

  /**
   * 
   * @return postbackData
   */
  @javax.annotation.Nullable
  public String getPostbackData() {
    return postbackData;
  }

  public void setPostbackData(String postbackData) {
    this.postbackData = postbackData;
  }


  public static final String SERIALIZED_NAME_PINGBACK_URL = "pingback_url";
  @SerializedName(SERIALIZED_NAME_PINGBACK_URL)
  private String pingbackUrl;

  public MerchantGoogleSellersTaskPostRequestInfo pingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
    return this;
  }

  /**
   * <em>notification URL of a completed task</em><br>optional field<br>when a task is completed we will notify you by GET request sent to the URL you have specified<br>you can use the ‘$id’ string as a <code>$id</code> variable and ‘$tag’ as urlencoded <code>$tag</code> variable. We will set the necessary values before sending the request.<br>example:<br><code>http://your-server.com/pingscript?id=$id</code><br><code>http://your-server.com/pingscript?id=$id&tag=$tag</code><br><strong>Note:</strong> special characters in <code>pingback_url</code> will be urlencoded; <br>i.a., the <code>#</code> character will be encoded into <code>%23</code><p>learn more on our <a href='https://dataforseo.com/help-center/pingbacks-postbacks-with-dataforseo-api' target='_blank' rel='noopener noreferrer'>Help Center</a>
   * @return pingbackUrl
   */
  @javax.annotation.Nullable
  public String getPingbackUrl() {
    return pingbackUrl;
  }

  public void setPingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
  }



  public MerchantGoogleSellersTaskPostRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public MerchantGoogleSellersTaskPostRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    MerchantGoogleSellersTaskPostRequestInfo merchantGoogleSellersTaskPostRequestInfo = (MerchantGoogleSellersTaskPostRequestInfo) o;
    return

        Objects.equals(this.productId, merchantGoogleSellersTaskPostRequestInfo.productId) &&
        Objects.equals(this.dataDocid, merchantGoogleSellersTaskPostRequestInfo.dataDocid) &&
        Objects.equals(this.gid, merchantGoogleSellersTaskPostRequestInfo.gid) &&
        Objects.equals(this.pvf, merchantGoogleSellersTaskPostRequestInfo.pvf) &&
        Objects.equals(this.priority, merchantGoogleSellersTaskPostRequestInfo.priority) &&
        Objects.equals(this.locationName, merchantGoogleSellersTaskPostRequestInfo.locationName) &&
        Objects.equals(this.locationCode, merchantGoogleSellersTaskPostRequestInfo.locationCode) &&
        Objects.equals(this.locationCoordinate, merchantGoogleSellersTaskPostRequestInfo.locationCoordinate) &&
        Objects.equals(this.languageName, merchantGoogleSellersTaskPostRequestInfo.languageName) &&
        Objects.equals(this.languageCode, merchantGoogleSellersTaskPostRequestInfo.languageCode) &&
        Objects.equals(this.depth, merchantGoogleSellersTaskPostRequestInfo.depth) &&
        Objects.equals(this.seDomain, merchantGoogleSellersTaskPostRequestInfo.seDomain) &&
        Objects.equals(this.getShopsOnGoogle, merchantGoogleSellersTaskPostRequestInfo.getShopsOnGoogle) &&
        Objects.equals(this.additionalSpecifications, merchantGoogleSellersTaskPostRequestInfo.additionalSpecifications) &&
        Objects.equals(this.tag, merchantGoogleSellersTaskPostRequestInfo.tag) &&
        Objects.equals(this.postbackUrl, merchantGoogleSellersTaskPostRequestInfo.postbackUrl) &&
        Objects.equals(this.postbackData, merchantGoogleSellersTaskPostRequestInfo.postbackData) &&
        Objects.equals(this.pingbackUrl, merchantGoogleSellersTaskPostRequestInfo.pingbackUrl);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(productId, dataDocid, gid, pvf, priority, locationName, locationCode, locationCoordinate, languageName, languageCode, depth, seDomain, getShopsOnGoogle, additionalSpecifications, tag, postbackUrl, postbackData, pingbackUrl);
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
    sb.append("class MerchantGoogleSellersTaskPostRequestInfo {\n");

    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    dataDocid: ").append(toIndentedString(dataDocid)).append("\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    pvf: ").append(toIndentedString(pvf)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    locationCoordinate: ").append(toIndentedString(locationCoordinate)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    seDomain: ").append(toIndentedString(seDomain)).append("\n");
    sb.append("    getShopsOnGoogle: ").append(toIndentedString(getShopsOnGoogle)).append("\n");
    sb.append("    additionalSpecifications: ").append(toIndentedString(additionalSpecifications)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    postbackUrl: ").append(toIndentedString(postbackUrl)).append("\n");
    sb.append("    postbackData: ").append(toIndentedString(postbackData)).append("\n");
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
    
    openapiFields.add("product_id");
    
    openapiFields.add("data_docid");
    
    openapiFields.add("gid");
    
    openapiFields.add("pvf");
    
    openapiFields.add("priority");
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("location_coordinate");
    
    openapiFields.add("language_name");
    
    openapiFields.add("language_code");
    
    openapiFields.add("depth");
    
    openapiFields.add("se_domain");
    
    openapiFields.add("get_shops_on_google");
    
    openapiFields.add("additional_specifications");
    
    openapiFields.add("tag");
    
    openapiFields.add("postback_url");
    
    openapiFields.add("postback_data");
    
    openapiFields.add("pingback_url");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MerchantGoogleSellersTaskPostRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantGoogleSellersTaskPostRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantGoogleSellersTaskPostRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantGoogleSellersTaskPostRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantGoogleSellersTaskPostRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantGoogleSellersTaskPostRequestInfo>() {
           @Override
           public void write(JsonWriter out, MerchantGoogleSellersTaskPostRequestInfo value) throws IOException {
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
           public MerchantGoogleSellersTaskPostRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             MerchantGoogleSellersTaskPostRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static MerchantGoogleSellersTaskPostRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantGoogleSellersTaskPostRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}