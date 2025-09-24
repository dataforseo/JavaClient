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



public class DataLabsLocalPackSerpElementItem  extends BaseDataforseoLabsApiElementItem  {


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public DataLabsLocalPackSerpElementItem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the result in SERP
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public DataLabsLocalPackSerpElementItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description of the results element in SERP
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public DataLabsLocalPackSerpElementItem domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * domain in SERP of the Ad element
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public DataLabsLocalPackSerpElementItem phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * phone number
   * @return phone
   */
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public DataLabsLocalPackSerpElementItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * result’s URL
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_IS_PAID = "is_paid";
  @SerializedName(SERIALIZED_NAME_IS_PAID)
  private Boolean isPaid;

  public DataLabsLocalPackSerpElementItem isPaid(Boolean isPaid) {
    this.isPaid = isPaid;
    return this;
  }

  /**
   * indicates whether the element is an ad
   * @return isPaid
   */
  @javax.annotation.Nullable
  public Boolean getIsPaid() {
    return isPaid;
  }

  public void setIsPaid(Boolean isPaid) {
    this.isPaid = isPaid;
  }


  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private RatingElement rating;

  public DataLabsLocalPackSerpElementItem rating(RatingElement rating) {
    this.rating = rating;
    return this;
  }

  /**
   * the item’s rating 
* the popularity rate based on reviews and displayed in SERP
   * @return rating
   */
  @javax.annotation.Nullable
  public RatingElement getRating() {
    return rating;
  }

  public void setRating(RatingElement rating) {
    this.rating = rating;
  }


  public static final String SERIALIZED_NAME_MAIN_DOMAIN = "main_domain";
  @SerializedName(SERIALIZED_NAME_MAIN_DOMAIN)
  private String mainDomain;

  public DataLabsLocalPackSerpElementItem mainDomain(String mainDomain) {
    this.mainDomain = mainDomain;
    return this;
  }

  /**
   * primary domain name in SERP
   * @return mainDomain
   */
  @javax.annotation.Nullable
  public String getMainDomain() {
    return mainDomain;
  }

  public void setMainDomain(String mainDomain) {
    this.mainDomain = mainDomain;
  }


  public static final String SERIALIZED_NAME_RELATIVE_URL = "relative_url";
  @SerializedName(SERIALIZED_NAME_RELATIVE_URL)
  private String relativeUrl;

  public DataLabsLocalPackSerpElementItem relativeUrl(String relativeUrl) {
    this.relativeUrl = relativeUrl;
    return this;
  }

  /**
   * URL in SERP that does not specify the HTTPs protocol and domain name
   * @return relativeUrl
   */
  @javax.annotation.Nullable
  public String getRelativeUrl() {
    return relativeUrl;
  }

  public void setRelativeUrl(String relativeUrl) {
    this.relativeUrl = relativeUrl;
  }


  public static final String SERIALIZED_NAME_ETV = "etv";
  @SerializedName(SERIALIZED_NAME_ETV)
  private Double etv;

  public DataLabsLocalPackSerpElementItem etv(Double etv) {
    this.etv = etv;
    return this;
  }

  /**
   * estimated traffic volume
* estimated organic monthly traffic to the domain
* calculated as the product of CTR (click-through-rate) and search volume values of the returned keyword
* learn more about how the metric is calculated in this help center article
   * @return etv
   */
  @javax.annotation.Nullable
  public Double getEtv() {
    return etv;
  }

  public void setEtv(Double etv) {
    this.etv = etv;
  }


  public static final String SERIALIZED_NAME_ESTIMATED_PAID_TRAFFIC_COST = "estimated_paid_traffic_cost";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_PAID_TRAFFIC_COST)
  private Double estimatedPaidTrafficCost;

  public DataLabsLocalPackSerpElementItem estimatedPaidTrafficCost(Double estimatedPaidTrafficCost) {
    this.estimatedPaidTrafficCost = estimatedPaidTrafficCost;
    return this;
  }

  /**
   * estimated cost of paid monthly search traffic
* represents the estimated cost of paid monthly traffic (USD) based on etv and cpc values
* learn more about how the metric is calculated in this help center article
   * @return estimatedPaidTrafficCost
   */
  @javax.annotation.Nullable
  public Double getEstimatedPaidTrafficCost() {
    return estimatedPaidTrafficCost;
  }

  public void setEstimatedPaidTrafficCost(Double estimatedPaidTrafficCost) {
    this.estimatedPaidTrafficCost = estimatedPaidTrafficCost;
  }


  public static final String SERIALIZED_NAME_CLICKSTREAM_ETV = "clickstream_etv";
  @SerializedName(SERIALIZED_NAME_CLICKSTREAM_ETV)
  private Double clickstreamEtv;

  public DataLabsLocalPackSerpElementItem clickstreamEtv(Double clickstreamEtv) {
    this.clickstreamEtv = clickstreamEtv;
    return this;
  }

  /**
   * estimated traffic volume based on clickstream data
* calculated as the product of click-through-rate and clickstream search volume values of all keywords the domain ranks for
* to retrieve results for this field, the parameter include_clickstream_data must be set to true
* learn more about how the metric is calculated in this help center article
   * @return clickstreamEtv
   */
  @javax.annotation.Nullable
  public Double getClickstreamEtv() {
    return clickstreamEtv;
  }

  public void setClickstreamEtv(Double clickstreamEtv) {
    this.clickstreamEtv = clickstreamEtv;
  }


  public static final String SERIALIZED_NAME_RANK_CHANGES = "rank_changes";
  @SerializedName(SERIALIZED_NAME_RANK_CHANGES)
  private RankChanges rankChanges;

  public DataLabsLocalPackSerpElementItem rankChanges(RankChanges rankChanges) {
    this.rankChanges = rankChanges;
    return this;
  }

  /**
   * changes in rankings
* contains information about the ranking changes of the SERP element since the previous_updated_time
   * @return rankChanges
   */
  @javax.annotation.Nullable
  public RankChanges getRankChanges() {
    return rankChanges;
  }

  public void setRankChanges(RankChanges rankChanges) {
    this.rankChanges = rankChanges;
  }


  public static final String SERIALIZED_NAME_BACKLINKS_INFO = "backlinks_info";
  @SerializedName(SERIALIZED_NAME_BACKLINKS_INFO)
  private BacklinksInfo backlinksInfo;

  public DataLabsLocalPackSerpElementItem backlinksInfo(BacklinksInfo backlinksInfo) {
    this.backlinksInfo = backlinksInfo;
    return this;
  }

  /**
   * backlinks information for the ranked website
   * @return backlinksInfo
   */
  @javax.annotation.Nullable
  public BacklinksInfo getBacklinksInfo() {
    return backlinksInfo;
  }

  public void setBacklinksInfo(BacklinksInfo backlinksInfo) {
    this.backlinksInfo = backlinksInfo;
  }


  public static final String SERIALIZED_NAME_RANK_INFO = "rank_info";
  @SerializedName(SERIALIZED_NAME_RANK_INFO)
  private RankInfo rankInfo;

  public DataLabsLocalPackSerpElementItem rankInfo(RankInfo rankInfo) {
    this.rankInfo = rankInfo;
    return this;
  }

  /**
   * page and domain rank information
   * @return rankInfo
   */
  @javax.annotation.Nullable
  public RankInfo getRankInfo() {
    return rankInfo;
  }

  public void setRankInfo(RankInfo rankInfo) {
    this.rankInfo = rankInfo;
  }



  public DataLabsLocalPackSerpElementItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DataLabsLocalPackSerpElementItem putAdditionalProperty(String key, Object value) {
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


    
    DataLabsLocalPackSerpElementItem dataLabsLocalPackSerpElementItem = (DataLabsLocalPackSerpElementItem) o;
    return

        Objects.equals(this.title, dataLabsLocalPackSerpElementItem.title) &&
        Objects.equals(this.description, dataLabsLocalPackSerpElementItem.description) &&
        Objects.equals(this.domain, dataLabsLocalPackSerpElementItem.domain) &&
        Objects.equals(this.phone, dataLabsLocalPackSerpElementItem.phone) &&
        Objects.equals(this.url, dataLabsLocalPackSerpElementItem.url) &&
        Objects.equals(this.isPaid, dataLabsLocalPackSerpElementItem.isPaid) &&
        Objects.equals(this.rating, dataLabsLocalPackSerpElementItem.rating) &&
        Objects.equals(this.mainDomain, dataLabsLocalPackSerpElementItem.mainDomain) &&
        Objects.equals(this.relativeUrl, dataLabsLocalPackSerpElementItem.relativeUrl) &&
        Objects.equals(this.etv, dataLabsLocalPackSerpElementItem.etv) &&
        Objects.equals(this.estimatedPaidTrafficCost, dataLabsLocalPackSerpElementItem.estimatedPaidTrafficCost) &&
        Objects.equals(this.clickstreamEtv, dataLabsLocalPackSerpElementItem.clickstreamEtv) &&
        Objects.equals(this.rankChanges, dataLabsLocalPackSerpElementItem.rankChanges) &&
        Objects.equals(this.backlinksInfo, dataLabsLocalPackSerpElementItem.backlinksInfo) &&
        Objects.equals(this.rankInfo, dataLabsLocalPackSerpElementItem.rankInfo) && 
        super.equals(o);
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(title, description, domain, phone, url, isPaid, rating, mainDomain, relativeUrl, etv, estimatedPaidTrafficCost, clickstreamEtv, rankChanges, backlinksInfo, rankInfo);
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
    sb.append("class DataLabsLocalPackSerpElementItem {\n");

    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    isPaid: ").append(toIndentedString(isPaid)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    mainDomain: ").append(toIndentedString(mainDomain)).append("\n");
    sb.append("    relativeUrl: ").append(toIndentedString(relativeUrl)).append("\n");
    sb.append("    etv: ").append(toIndentedString(etv)).append("\n");
    sb.append("    estimatedPaidTrafficCost: ").append(toIndentedString(estimatedPaidTrafficCost)).append("\n");
    sb.append("    clickstreamEtv: ").append(toIndentedString(clickstreamEtv)).append("\n");
    sb.append("    rankChanges: ").append(toIndentedString(rankChanges)).append("\n");
    sb.append("    backlinksInfo: ").append(toIndentedString(backlinksInfo)).append("\n");
    sb.append("    rankInfo: ").append(toIndentedString(rankInfo)).append("\n");
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
    openapiFields.add("se_type");
    openapiFields.add("rank_group");
    openapiFields.add("rank_absolute");
    openapiFields.add("position");
    openapiFields.add("xpath");
    
    openapiFields.add("title");
    
    openapiFields.add("description");
    
    openapiFields.add("domain");
    
    openapiFields.add("phone");
    
    openapiFields.add("url");
    
    openapiFields.add("is_paid");
    
    openapiFields.add("rating");
    
    openapiFields.add("main_domain");
    
    openapiFields.add("relative_url");
    
    openapiFields.add("etv");
    
    openapiFields.add("estimated_paid_traffic_cost");
    
    openapiFields.add("clickstream_etv");
    
    openapiFields.add("rank_changes");
    
    openapiFields.add("backlinks_info");
    
    openapiFields.add("rank_info");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataLabsLocalPackSerpElementItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataLabsLocalPackSerpElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataLabsLocalPackSerpElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataLabsLocalPackSerpElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataLabsLocalPackSerpElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<DataLabsLocalPackSerpElementItem>() {
           @Override
           public void write(JsonWriter out, DataLabsLocalPackSerpElementItem value) throws IOException {
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
           public DataLabsLocalPackSerpElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DataLabsLocalPackSerpElementItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DataLabsLocalPackSerpElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataLabsLocalPackSerpElementItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}