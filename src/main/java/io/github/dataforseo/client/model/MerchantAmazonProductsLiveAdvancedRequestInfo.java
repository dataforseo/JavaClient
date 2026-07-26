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


public class MerchantAmazonProductsLiveAdvancedRequestInfo  {


  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public MerchantAmazonProductsLiveAdvancedRequestInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * <em>keyword</em><br><strong>required field</strong><br>you can specify <strong>up to 700 characters</strong> in this field<br><strong>all %## will be decoded (plus character ‘+’ will be decoded to a space character)</strong><br>if you need to use the “%” character for your <code>keyword</code>, please specify it as “%25”;<p>learn more about rules and limitations of <code>keyword</code> and <code>keywords</code> fields in DataForSEO APIs in this <a href='https://dataforseo.com/help-center/rules-and-limitations-of-keyword-and-keywords-fields-in-dataforseo-apis' rel='noopener noreferrer' target='_blank'>Help Center article</a>
   * @return keyword
   */
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public MerchantAmazonProductsLiveAdvancedRequestInfo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <em>direct URL of the search query</em><br>optional field<br>you can specify a direct URL and we will sort it out to the necessary fields. Note that this method is the most difficult for our API to process and also requires you to specify the exact language and location in the URL. In most cases, we wouldn’t recommend using this method.<br>example:<br><code class='long-string'>https://www.amazon.com/s/?field-keywords=shoes&language=en_US</code>
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_LOCATION_NAME = "location_name";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public MerchantAmazonProductsLiveAdvancedRequestInfo locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * <em>full name of search engine location</em><br><strong>required field if you don't specify</strong> <code>location_code</code> or <code>location_coordinate</code><br><strong>if you use this field, you don't need to specify <code>location_code</code> or <code>location_coordinate</code></strong><br>you can receive the list of available locations with their <code>location_name</code> parameters by making a separate request to the <code>https://api.dataforseo.com/v3/merchant/amazon/locations</code><br>example:<br><code class='long-string'>HA1,England,United Kingdom</code>
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

  public MerchantAmazonProductsLiveAdvancedRequestInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * <em>search engine location code</em><br><strong>required field if you don't specify</strong> <code>location_name</code> or <code>location_coordinate</code><br><strong>if you use this field, you don't need to specify <code>location_name</code> or <code>location_coordinate</code></strong><br>you can receive the list of available locations with their <code>location_code</code> parameters by making a separate request to the<br><code>https://api.dataforseo.com/v3/merchant/amazon/locations</code><br>example:<br><code class='long-string'>9045969</code>
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

  public MerchantAmazonProductsLiveAdvancedRequestInfo locationCoordinate(String locationCoordinate) {
    this.locationCoordinate = locationCoordinate;
    return this;
  }

  /**
   * <em>GPS coordinates of a location</em><br><strong>required field if you don't specify</strong> <code>location_name</code> or <code>location_code</code><br><strong>if you use this field, you don't need to specify <code>location_name</code> or <code>location_code</code></strong><br><code>location_coordinate</code> parameter should be specified in the <em>'latitude,longitude,radius'</em> format<br>the maximum number of decimal digits for <em>'latitude'</em> and <em>'longitude'</em>: 7<br>the minimum value for <em>'radius'</em>: 199.9<br>example:<br><code class='long-string'>53.476225,-2.243572,200</code>
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

  public MerchantAmazonProductsLiveAdvancedRequestInfo languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * <em>full name of search engine language</em><br><strong>required field if you don't specify</strong> <code>language_code</code><br><strong>if you use this field, you don't need to specify <code>language_code</code></strong><br>you can receive the list of available languages with their <code>language_name</code> parameters by making a separate request to the<br><code>https://api.dataforseo.com/v3/merchant/amazon/languages</code><br>example:<br><code class='long-string'>English (United Kingdom)</code>
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

  public MerchantAmazonProductsLiveAdvancedRequestInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * <em>search engine language code</em><br><strong>required field if you don't specify</strong> <code>language_name</code><br><strong>if you use this field, you don't need to specify <code>language_name</code></strong><br>you can receive the list of available languages with their <code>language_code</code> parameters by making a separate request to the <code>https://api.dataforseo.com/v3/merchant/amazon/languages</code><em><br></em>example:<em><br></em><code class='long-string'>en_GB</code>
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_SE_DOMAIN = "se_domain";
  @SerializedName(SERIALIZED_NAME_SE_DOMAIN)
  private String seDomain;

  public MerchantAmazonProductsLiveAdvancedRequestInfo seDomain(String seDomain) {
    this.seDomain = seDomain;
    return this;
  }

  /**
   * <em>search engine domain</em><br>optional field<br>we choose the relevant search engine domain automatically according to the location and language you specify<br>however, you can set a custom search engine domain in this field<br>example:<br><code><em>amazon.com</em></code>, <code><em>amazon.co.uk</em></code>, <code><em>amazon.fr</em></code>, etc.
   * @return seDomain
   */
  @javax.annotation.Nullable
  public String getSeDomain() {
    return seDomain;
  }

  public void setSeDomain(String seDomain) {
    this.seDomain = seDomain;
  }


  public static final String SERIALIZED_NAME_DEPTH = "depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private Integer depth;

  public MerchantAmazonProductsLiveAdvancedRequestInfo depth(Integer depth) {
    this.depth = depth;
    return this;
  }

  /**
   * <em>parsing depth</em><br>optional field<br>number of results to be retrieved from the Amazon results page<br>default value: <code>100</code><br>max value: <code>700</code><br><strong>Your account will be billed per each SERP containing up to 100 results;</strong> <br>Setting depth above 100 may result in additional charges if the search engine returns more than 100 results</a>;<br>The cost can be calculated on the <a title='Pricing' href='https://dataforseo.com/pricing/merchant/amazon-api' target='_blank' rel='noopener noreferrer'>Pricing</a> page.
   * @return depth
   */
  @javax.annotation.Nullable
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }


  public static final String SERIALIZED_NAME_MAX_CRAWL_PAGES = "max_crawl_pages";
  @SerializedName(SERIALIZED_NAME_MAX_CRAWL_PAGES)
  private Integer maxCrawlPages;

  public MerchantAmazonProductsLiveAdvancedRequestInfo maxCrawlPages(Integer maxCrawlPages) {
    this.maxCrawlPages = maxCrawlPages;
    return this;
  }

  /**
   * <em>page crawl limit</em><br>optional field<br>number of search results pages to crawl<br>max value: <code>7</code><br><strong>Note:</strong> the <code>max_crawl_pages</code> and <code>depth</code> parameters complement each other;<br>learn more at <a href='https://dataforseo.com/help-center/what-is-max-crawl-pages-and-how-does-it-work' rel='noopener noreferrer' target='_blank'>our help center</a>
   * @return maxCrawlPages
   */
  @javax.annotation.Nullable
  public Integer getMaxCrawlPages() {
    return maxCrawlPages;
  }

  public void setMaxCrawlPages(Integer maxCrawlPages) {
    this.maxCrawlPages = maxCrawlPages;
  }


  public static final String SERIALIZED_NAME_DEPARTMENT = "department";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT)
  private String department;

  public MerchantAmazonProductsLiveAdvancedRequestInfo department(String department) {
    this.department = department;
    return this;
  }

  /**
   * <em>amazon product department</em><br>optional field<br>specify one of the following amazon departments for extracting product listings:<br><code>'Arts & Crafts'</code>, <code>'Automotive'</code>, <code>'Baby'</code>, <code>'Beauty & Personal Care'</code>, <code>'Books'</code>, <code>'Computers'</code>, <code>'Digital Music'</code>, <code>'Electronics'</code>, <code>'Kindle Store'</code>, <code>'Prime Video'</code>, <code>'Women's Fashion'</code>, <code>'Men's Fashion'</code>, <code>'Girls' Fashion'</code>, <code>'Boys' Fashion'</code>, <code>'Deals'</code>, <code>'Health & Household'</code>, <code>'Home & Kitchen'</code>, <code>'Industrial & Scientific'</code>, <code>'Luggage'</code>, <code>'Movies & TV'</code>, <code>'Music, CDs & Vinyl'</code>, <code>'Pet Supplies'</code>, <code>'Software'</code>, <code>'Sports & Outdoors'</code>, <code>'Tools & Home Improvement'</code>, <code>'Toys & Games'</code>, <code>'Video Games'</code>
   * @return department
   */
  @javax.annotation.Nullable
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }


  public static final String SERIALIZED_NAME_SEARCH_PARAM = "search_param";
  @SerializedName(SERIALIZED_NAME_SEARCH_PARAM)
  private String searchParam;

  public MerchantAmazonProductsLiveAdvancedRequestInfo searchParam(String searchParam) {
    this.searchParam = searchParam;
    return this;
  }

  /**
   * <em>additional parameters of the search query</em><br>optional field<br>you can use the following Amazon search URL parameters for customizing the search<br>example:<br><code>&low-price=52</code> - search for products that cost <em>more than 52 USD</em>;<br><code>&high-price=45</code> - search for products that cost <em>less than 45 USD</em>;<br><code>&sort=relevancerank</code> - sort results by <em>relevance</em>;<br><code>&sort=featured-rank</code> - sort results by <em>featured</em> products;<br><code>&sort=price-asc-rank</code> - sort by <em>ascending price</em>;<br><code>&sort=price-desc-rank</code> - sort by <em>descending price</em>;<br><code>&sort=review-rank</code> - sort by the average <em>customer reviews</em> value;<br><code>&sort=date-desc-rank</code> - sort by the <em>newest arrival</em><br><strong>Note</strong> that <code>search_param</code> values will be ignored if any of the following parameters is used: <code>price_min</code>, <code>price_max</code>, <code>sort_by</code>
   * @return searchParam
   */
  @javax.annotation.Nullable
  public String getSearchParam() {
    return searchParam;
  }

  public void setSearchParam(String searchParam) {
    this.searchParam = searchParam;
  }


  public static final String SERIALIZED_NAME_PRICE_MIN = "price_min";
  @SerializedName(SERIALIZED_NAME_PRICE_MIN)
  private Integer priceMin;

  public MerchantAmazonProductsLiveAdvancedRequestInfo priceMin(Integer priceMin) {
    this.priceMin = priceMin;
    return this;
  }

  /**
   * <em>minimum product price</em><br>optional field<br>minimum price of the returned products listed on Amazon for the specified query<br>example:<br><code>5</code><br><strong>Note:</strong> if you specify <code>price_min</code>, the <code>search_param</code> parameter will be ignored
   * @return priceMin
   */
  @javax.annotation.Nullable
  public Integer getPriceMin() {
    return priceMin;
  }

  public void setPriceMin(Integer priceMin) {
    this.priceMin = priceMin;
  }


  public static final String SERIALIZED_NAME_PRICE_MAX = "price_max";
  @SerializedName(SERIALIZED_NAME_PRICE_MAX)
  private Integer priceMax;

  public MerchantAmazonProductsLiveAdvancedRequestInfo priceMax(Integer priceMax) {
    this.priceMax = priceMax;
    return this;
  }

  /**
   * <em>maximum product price</em><br>optional field<br>maximum price of the returned products listed on Amazon for the specified query<br>example:<br><code>100</code><br><strong>Note:</strong> if you specify <code>price_max</code>, the <code>search_param</code> parameter will be ignored
   * @return priceMax
   */
  @javax.annotation.Nullable
  public Integer getPriceMax() {
    return priceMax;
  }

  public void setPriceMax(Integer priceMax) {
    this.priceMax = priceMax;
  }


  public static final String SERIALIZED_NAME_SORT_BY = "sort_by";
  @SerializedName(SERIALIZED_NAME_SORT_BY)
  private String sortBy;

  public MerchantAmazonProductsLiveAdvancedRequestInfo sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * <em>results sorting rules</em><br>optional field<br>the following sorting rules are supported:<br><code>relevance</code>, <code>price_low_to_high</code>, <code>price_high_to_low</code>, <code>featured</code>, <code>avg_customer_review</code>, <code>newest_arrival</code><br>example:<br><code>sort_by:'relevance'</code><br><strong>Note:</strong> if you specify <code>sort_by</code>, the <code>search_param</code> parameter will be ignored
   * @return sortBy
   */
  @javax.annotation.Nullable
  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public MerchantAmazonProductsLiveAdvancedRequestInfo tag(String tag) {
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



  public MerchantAmazonProductsLiveAdvancedRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public MerchantAmazonProductsLiveAdvancedRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    MerchantAmazonProductsLiveAdvancedRequestInfo merchantAmazonProductsLiveAdvancedRequestInfo = (MerchantAmazonProductsLiveAdvancedRequestInfo) o;
    return

        Objects.equals(this.keyword, merchantAmazonProductsLiveAdvancedRequestInfo.keyword) &&
        Objects.equals(this.url, merchantAmazonProductsLiveAdvancedRequestInfo.url) &&
        Objects.equals(this.locationName, merchantAmazonProductsLiveAdvancedRequestInfo.locationName) &&
        Objects.equals(this.locationCode, merchantAmazonProductsLiveAdvancedRequestInfo.locationCode) &&
        Objects.equals(this.locationCoordinate, merchantAmazonProductsLiveAdvancedRequestInfo.locationCoordinate) &&
        Objects.equals(this.languageName, merchantAmazonProductsLiveAdvancedRequestInfo.languageName) &&
        Objects.equals(this.languageCode, merchantAmazonProductsLiveAdvancedRequestInfo.languageCode) &&
        Objects.equals(this.seDomain, merchantAmazonProductsLiveAdvancedRequestInfo.seDomain) &&
        Objects.equals(this.depth, merchantAmazonProductsLiveAdvancedRequestInfo.depth) &&
        Objects.equals(this.maxCrawlPages, merchantAmazonProductsLiveAdvancedRequestInfo.maxCrawlPages) &&
        Objects.equals(this.department, merchantAmazonProductsLiveAdvancedRequestInfo.department) &&
        Objects.equals(this.searchParam, merchantAmazonProductsLiveAdvancedRequestInfo.searchParam) &&
        Objects.equals(this.priceMin, merchantAmazonProductsLiveAdvancedRequestInfo.priceMin) &&
        Objects.equals(this.priceMax, merchantAmazonProductsLiveAdvancedRequestInfo.priceMax) &&
        Objects.equals(this.sortBy, merchantAmazonProductsLiveAdvancedRequestInfo.sortBy) &&
        Objects.equals(this.tag, merchantAmazonProductsLiveAdvancedRequestInfo.tag);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keyword, url, locationName, locationCode, locationCoordinate, languageName, languageCode, seDomain, depth, maxCrawlPages, department, searchParam, priceMin, priceMax, sortBy, tag);
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
    sb.append("class MerchantAmazonProductsLiveAdvancedRequestInfo {\n");

    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    locationCoordinate: ").append(toIndentedString(locationCoordinate)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    seDomain: ").append(toIndentedString(seDomain)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    maxCrawlPages: ").append(toIndentedString(maxCrawlPages)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    searchParam: ").append(toIndentedString(searchParam)).append("\n");
    sb.append("    priceMin: ").append(toIndentedString(priceMin)).append("\n");
    sb.append("    priceMax: ").append(toIndentedString(priceMax)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
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
    
    openapiFields.add("keyword");
    
    openapiFields.add("url");
    
    openapiFields.add("location_name");
    
    openapiFields.add("location_code");
    
    openapiFields.add("location_coordinate");
    
    openapiFields.add("language_name");
    
    openapiFields.add("language_code");
    
    openapiFields.add("se_domain");
    
    openapiFields.add("depth");
    
    openapiFields.add("max_crawl_pages");
    
    openapiFields.add("department");
    
    openapiFields.add("search_param");
    
    openapiFields.add("price_min");
    
    openapiFields.add("price_max");
    
    openapiFields.add("sort_by");
    
    openapiFields.add("tag");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MerchantAmazonProductsLiveAdvancedRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantAmazonProductsLiveAdvancedRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantAmazonProductsLiveAdvancedRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantAmazonProductsLiveAdvancedRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantAmazonProductsLiveAdvancedRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantAmazonProductsLiveAdvancedRequestInfo>() {
           @Override
           public void write(JsonWriter out, MerchantAmazonProductsLiveAdvancedRequestInfo value) throws IOException {
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
           public MerchantAmazonProductsLiveAdvancedRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             MerchantAmazonProductsLiveAdvancedRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static MerchantAmazonProductsLiveAdvancedRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantAmazonProductsLiveAdvancedRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}