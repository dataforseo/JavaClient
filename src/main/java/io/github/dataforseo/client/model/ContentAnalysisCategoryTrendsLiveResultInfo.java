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



public class ContentAnalysisCategoryTrendsLiveResultInfo  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ContentAnalysisCategoryTrendsLiveResultInfo type(String type) {
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


  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public ContentAnalysisCategoryTrendsLiveResultInfo date(String date) {
    this.date = date;
    return this;
  }

  /**
   * date for which the data is provided
   * @return date
   */
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Long totalCount;

  public ContentAnalysisCategoryTrendsLiveResultInfo totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * total number of results in our database relevant to your request
   * @return totalCount
   */
  @javax.annotation.Nullable
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }


  public static final String SERIALIZED_NAME_RANK = "rank";
  @SerializedName(SERIALIZED_NAME_RANK)
  private Integer rank;

  public ContentAnalysisCategoryTrendsLiveResultInfo rank(Integer rank) {
    this.rank = rank;
    return this;
  }

  /**
   * rank of all URLs citing the keyword
* normalized sum of ranks of all URLs citing the target keyword for the given date
   * @return rank
   */
  @javax.annotation.Nullable
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }


  public static final String SERIALIZED_NAME_TOP_DOMAINS = "top_domains";
  @SerializedName(SERIALIZED_NAME_TOP_DOMAINS)
  private List<TopDomainInfo> topDomains;

  public ContentAnalysisCategoryTrendsLiveResultInfo topDomains(List<TopDomainInfo> topDomains) {
    this.topDomains = topDomains;
    return this;
  }

  /**
   * top domains citing the target keyword
* contains objects with top domains citing the target category and citation count per each domain
   * @return topDomains
   */
  @javax.annotation.Nullable
  public List<TopDomainInfo> getTopDomains() {
    return topDomains;
  }

  public void setTopDomains(List<TopDomainInfo> topDomains) {
    this.topDomains = topDomains;
  }


  public static final String SERIALIZED_NAME_SENTIMENT_CONNOTATIONS = "sentiment_connotations";
  @SerializedName(SERIALIZED_NAME_SENTIMENT_CONNOTATIONS)
  private Map<String, Long> sentimentConnotations;

  public ContentAnalysisCategoryTrendsLiveResultInfo sentimentConnotations(Map<String, Long> sentimentConnotations) {
    this.sentimentConnotations = sentimentConnotations;
    return this;
  }

  /**
   * sentiment connotations
* contains sentiments (emotional reactions) related to the target category citation and the number of citations per each sentiment
* possible connotations: 'anger', 'fear', 'happiness', 'love', 'sadness', 'share', 'neutral', 'fun'
   * @return sentimentConnotations
   */
  @javax.annotation.Nullable
  public Map<String, Long> getSentimentConnotations() {
    return sentimentConnotations;
  }

  public void setSentimentConnotations(Map<String, Long> sentimentConnotations) {
    this.sentimentConnotations = sentimentConnotations;
  }


  public static final String SERIALIZED_NAME_CONNOTATION_TYPES = "connotation_types";
  @SerializedName(SERIALIZED_NAME_CONNOTATION_TYPES)
  private Map<String, Long> connotationTypes;

  public ContentAnalysisCategoryTrendsLiveResultInfo connotationTypes(Map<String, Long> connotationTypes) {
    this.connotationTypes = connotationTypes;
    return this;
  }

  /**
   * connotation types
* contains types of sentiments (sentiment polarity) related to the category citation and citation count per each sentiment type
* possible connotation types: 'positive', 'negative', 'neutral'
   * @return connotationTypes
   */
  @javax.annotation.Nullable
  public Map<String, Long> getConnotationTypes() {
    return connotationTypes;
  }

  public void setConnotationTypes(Map<String, Long> connotationTypes) {
    this.connotationTypes = connotationTypes;
  }


  public static final String SERIALIZED_NAME_TEXT_CATEGORIES = "text_categories";
  @SerializedName(SERIALIZED_NAME_TEXT_CATEGORIES)
  private List<ContentAnalysisCategoriesInfo> textCategories;

  public ContentAnalysisCategoryTrendsLiveResultInfo textCategories(List<ContentAnalysisCategoriesInfo> textCategories) {
    this.textCategories = textCategories;
    return this;
  }

  /**
   * text categories
* contains objects with text categories and citation count in each text category
* to obtain a full list of available categories, refer to the Categories endpoint
   * @return textCategories
   */
  @javax.annotation.Nullable
  public List<ContentAnalysisCategoriesInfo> getTextCategories() {
    return textCategories;
  }

  public void setTextCategories(List<ContentAnalysisCategoriesInfo> textCategories) {
    this.textCategories = textCategories;
  }


  public static final String SERIALIZED_NAME_PAGE_CATEGORIES = "page_categories";
  @SerializedName(SERIALIZED_NAME_PAGE_CATEGORIES)
  private List<ContentAnalysisCategoriesInfo> pageCategories;

  public ContentAnalysisCategoryTrendsLiveResultInfo pageCategories(List<ContentAnalysisCategoriesInfo> pageCategories) {
    this.pageCategories = pageCategories;
    return this;
  }

  /**
   * page categories
* contains objects with page categories and citation count in each page category
* to obtain a full list of available categories, refer to the Categories endpoint
   * @return pageCategories
   */
  @javax.annotation.Nullable
  public List<ContentAnalysisCategoriesInfo> getPageCategories() {
    return pageCategories;
  }

  public void setPageCategories(List<ContentAnalysisCategoriesInfo> pageCategories) {
    this.pageCategories = pageCategories;
  }


  public static final String SERIALIZED_NAME_PAGE_TYPES = "page_types";
  @SerializedName(SERIALIZED_NAME_PAGE_TYPES)
  private Map<String, Long> pageTypes;

  public ContentAnalysisCategoryTrendsLiveResultInfo pageTypes(Map<String, Long> pageTypes) {
    this.pageTypes = pageTypes;
    return this;
  }

  /**
   * page types
* contains page types and citation count per each page type
   * @return pageTypes
   */
  @javax.annotation.Nullable
  public Map<String, Long> getPageTypes() {
    return pageTypes;
  }

  public void setPageTypes(Map<String, Long> pageTypes) {
    this.pageTypes = pageTypes;
  }


  public static final String SERIALIZED_NAME_COUNTRIES = "countries";
  @SerializedName(SERIALIZED_NAME_COUNTRIES)
  private Map<String, Long> countries;

  public ContentAnalysisCategoryTrendsLiveResultInfo countries(Map<String, Long> countries) {
    this.countries = countries;
    return this;
  }

  /**
   * countries
* contains countries and citation count in each country
* to obtain a full list of available countries, refer to the Locations endpoint
   * @return countries
   */
  @javax.annotation.Nullable
  public Map<String, Long> getCountries() {
    return countries;
  }

  public void setCountries(Map<String, Long> countries) {
    this.countries = countries;
  }


  public static final String SERIALIZED_NAME_LANGUAGES = "languages";
  @SerializedName(SERIALIZED_NAME_LANGUAGES)
  private Map<String, Long> languages;

  public ContentAnalysisCategoryTrendsLiveResultInfo languages(Map<String, Long> languages) {
    this.languages = languages;
    return this;
  }

  /**
   * languages
* contains languages and citation count in each language
* to obtain a full list of available languages, refer to the Languages endpoint
   * @return languages
   */
  @javax.annotation.Nullable
  public Map<String, Long> getLanguages() {
    return languages;
  }

  public void setLanguages(Map<String, Long> languages) {
    this.languages = languages;
  }



  public ContentAnalysisCategoryTrendsLiveResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public ContentAnalysisCategoryTrendsLiveResultInfo putAdditionalProperty(String key, Object value) {
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


    
    ContentAnalysisCategoryTrendsLiveResultInfo contentAnalysisCategoryTrendsLiveResultInfo = (ContentAnalysisCategoryTrendsLiveResultInfo) o;
    return

        Objects.equals(this.type, contentAnalysisCategoryTrendsLiveResultInfo.type) &&
        Objects.equals(this.date, contentAnalysisCategoryTrendsLiveResultInfo.date) &&
        Objects.equals(this.totalCount, contentAnalysisCategoryTrendsLiveResultInfo.totalCount) &&
        Objects.equals(this.rank, contentAnalysisCategoryTrendsLiveResultInfo.rank) &&
        Objects.equals(this.topDomains, contentAnalysisCategoryTrendsLiveResultInfo.topDomains) &&
        Objects.equals(this.sentimentConnotations, contentAnalysisCategoryTrendsLiveResultInfo.sentimentConnotations) &&
        Objects.equals(this.connotationTypes, contentAnalysisCategoryTrendsLiveResultInfo.connotationTypes) &&
        Objects.equals(this.textCategories, contentAnalysisCategoryTrendsLiveResultInfo.textCategories) &&
        Objects.equals(this.pageCategories, contentAnalysisCategoryTrendsLiveResultInfo.pageCategories) &&
        Objects.equals(this.pageTypes, contentAnalysisCategoryTrendsLiveResultInfo.pageTypes) &&
        Objects.equals(this.countries, contentAnalysisCategoryTrendsLiveResultInfo.countries) &&
        Objects.equals(this.languages, contentAnalysisCategoryTrendsLiveResultInfo.languages);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, date, totalCount, rank, topDomains, sentimentConnotations, connotationTypes, textCategories, pageCategories, pageTypes, countries, languages);
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
    sb.append("class ContentAnalysisCategoryTrendsLiveResultInfo {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    topDomains: ").append(toIndentedString(topDomains)).append("\n");
    sb.append("    sentimentConnotations: ").append(toIndentedString(sentimentConnotations)).append("\n");
    sb.append("    connotationTypes: ").append(toIndentedString(connotationTypes)).append("\n");
    sb.append("    textCategories: ").append(toIndentedString(textCategories)).append("\n");
    sb.append("    pageCategories: ").append(toIndentedString(pageCategories)).append("\n");
    sb.append("    pageTypes: ").append(toIndentedString(pageTypes)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
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
    
    openapiFields.add("date");
    
    openapiFields.add("total_count");
    
    openapiFields.add("rank");
    
    openapiFields.add("top_domains");
    
    openapiFields.add("sentiment_connotations");
    
    openapiFields.add("connotation_types");
    
    openapiFields.add("text_categories");
    
    openapiFields.add("page_categories");
    
    openapiFields.add("page_types");
    
    openapiFields.add("countries");
    
    openapiFields.add("languages");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContentAnalysisCategoryTrendsLiveResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContentAnalysisCategoryTrendsLiveResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContentAnalysisCategoryTrendsLiveResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContentAnalysisCategoryTrendsLiveResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContentAnalysisCategoryTrendsLiveResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ContentAnalysisCategoryTrendsLiveResultInfo>() {
           @Override
           public void write(JsonWriter out, ContentAnalysisCategoryTrendsLiveResultInfo value) throws IOException {
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
           public ContentAnalysisCategoryTrendsLiveResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ContentAnalysisCategoryTrendsLiveResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static ContentAnalysisCategoryTrendsLiveResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentAnalysisCategoryTrendsLiveResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}