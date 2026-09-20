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


public class AiOptimizationLlmMentionsAvailableFiltersResultInfo  {


  public static final String SERIALIZED_NAME_SEARCH = "search";
  @SerializedName(SERIALIZED_NAME_SEARCH)
  private Map<String, String> search;

  public AiOptimizationLlmMentionsAvailableFiltersResultInfo search(Map<String, String> search) {
    this.search = search;
    return this;
  }

  /**
   * 
   * @return search
   */
  @javax.annotation.Nullable
  public Map<String, String> getSearch() {
    return search;
  }

  public void setSearch(Map<String, String> search) {
    this.search = search;
  }


  public static final String SERIALIZED_NAME_SEARCH_MENTIONS = "search_mentions";
  @SerializedName(SERIALIZED_NAME_SEARCH_MENTIONS)
  private Map<String, String> searchMentions;

  public AiOptimizationLlmMentionsAvailableFiltersResultInfo searchMentions(Map<String, String> searchMentions) {
    this.searchMentions = searchMentions;
    return this;
  }

  /**
   * 
   * @return searchMentions
   */
  @javax.annotation.Nullable
  public Map<String, String> getSearchMentions() {
    return searchMentions;
  }

  public void setSearchMentions(Map<String, String> searchMentions) {
    this.searchMentions = searchMentions;
  }


  public static final String SERIALIZED_NAME_TARGET_METRICS = "target_metrics";
  @SerializedName(SERIALIZED_NAME_TARGET_METRICS)
  private Map<String, String> targetMetrics;

  public AiOptimizationLlmMentionsAvailableFiltersResultInfo targetMetrics(Map<String, String> targetMetrics) {
    this.targetMetrics = targetMetrics;
    return this;
  }

  /**
   * 
   * @return targetMetrics
   */
  @javax.annotation.Nullable
  public Map<String, String> getTargetMetrics() {
    return targetMetrics;
  }

  public void setTargetMetrics(Map<String, String> targetMetrics) {
    this.targetMetrics = targetMetrics;
  }


  public static final String SERIALIZED_NAME_MULTI_TARGET_METRICS = "multi_target_metrics";
  @SerializedName(SERIALIZED_NAME_MULTI_TARGET_METRICS)
  private Map<String, String> multiTargetMetrics;

  public AiOptimizationLlmMentionsAvailableFiltersResultInfo multiTargetMetrics(Map<String, String> multiTargetMetrics) {
    this.multiTargetMetrics = multiTargetMetrics;
    return this;
  }

  /**
   * 
   * @return multiTargetMetrics
   */
  @javax.annotation.Nullable
  public Map<String, String> getMultiTargetMetrics() {
    return multiTargetMetrics;
  }

  public void setMultiTargetMetrics(Map<String, String> multiTargetMetrics) {
    this.multiTargetMetrics = multiTargetMetrics;
  }


  public static final String SERIALIZED_NAME_TOP_MENTIONED_DOMAINS = "top_mentioned_domains";
  @SerializedName(SERIALIZED_NAME_TOP_MENTIONED_DOMAINS)
  private Map<String, String> topMentionedDomains;

  public AiOptimizationLlmMentionsAvailableFiltersResultInfo topMentionedDomains(Map<String, String> topMentionedDomains) {
    this.topMentionedDomains = topMentionedDomains;
    return this;
  }

  /**
   * 
   * @return topMentionedDomains
   */
  @javax.annotation.Nullable
  public Map<String, String> getTopMentionedDomains() {
    return topMentionedDomains;
  }

  public void setTopMentionedDomains(Map<String, String> topMentionedDomains) {
    this.topMentionedDomains = topMentionedDomains;
  }


  public static final String SERIALIZED_NAME_TOP_MENTIONED_PAGES = "top_mentioned_pages";
  @SerializedName(SERIALIZED_NAME_TOP_MENTIONED_PAGES)
  private Map<String, String> topMentionedPages;

  public AiOptimizationLlmMentionsAvailableFiltersResultInfo topMentionedPages(Map<String, String> topMentionedPages) {
    this.topMentionedPages = topMentionedPages;
    return this;
  }

  /**
   * 
   * @return topMentionedPages
   */
  @javax.annotation.Nullable
  public Map<String, String> getTopMentionedPages() {
    return topMentionedPages;
  }

  public void setTopMentionedPages(Map<String, String> topMentionedPages) {
    this.topMentionedPages = topMentionedPages;
  }


  public static final String SERIALIZED_NAME_TOP_MENTIONED_BRANDS = "top_mentioned_brands";
  @SerializedName(SERIALIZED_NAME_TOP_MENTIONED_BRANDS)
  private Map<String, String> topMentionedBrands;

  public AiOptimizationLlmMentionsAvailableFiltersResultInfo topMentionedBrands(Map<String, String> topMentionedBrands) {
    this.topMentionedBrands = topMentionedBrands;
    return this;
  }

  /**
   * 
   * @return topMentionedBrands
   */
  @javax.annotation.Nullable
  public Map<String, String> getTopMentionedBrands() {
    return topMentionedBrands;
  }

  public void setTopMentionedBrands(Map<String, String> topMentionedBrands) {
    this.topMentionedBrands = topMentionedBrands;
  }


  public static final String SERIALIZED_NAME_TOP_MENTIONED_BRAND_CATEGORIES = "top_mentioned_brand_categories";
  @SerializedName(SERIALIZED_NAME_TOP_MENTIONED_BRAND_CATEGORIES)
  private Map<String, String> topMentionedBrandCategories;

  public AiOptimizationLlmMentionsAvailableFiltersResultInfo topMentionedBrandCategories(Map<String, String> topMentionedBrandCategories) {
    this.topMentionedBrandCategories = topMentionedBrandCategories;
    return this;
  }

  /**
   * 
   * @return topMentionedBrandCategories
   */
  @javax.annotation.Nullable
  public Map<String, String> getTopMentionedBrandCategories() {
    return topMentionedBrandCategories;
  }

  public void setTopMentionedBrandCategories(Map<String, String> topMentionedBrandCategories) {
    this.topMentionedBrandCategories = topMentionedBrandCategories;
  }


  public static final String SERIALIZED_NAME_TARGET_METRICS_LITE = "target_metrics_lite";
  @SerializedName(SERIALIZED_NAME_TARGET_METRICS_LITE)
  private Map<String, String> targetMetricsLite;

  public AiOptimizationLlmMentionsAvailableFiltersResultInfo targetMetricsLite(Map<String, String> targetMetricsLite) {
    this.targetMetricsLite = targetMetricsLite;
    return this;
  }

  /**
   * 
   * @return targetMetricsLite
   */
  @javax.annotation.Nullable
  public Map<String, String> getTargetMetricsLite() {
    return targetMetricsLite;
  }

  public void setTargetMetricsLite(Map<String, String> targetMetricsLite) {
    this.targetMetricsLite = targetMetricsLite;
  }


  public static final String SERIALIZED_NAME_TOP_MENTIONED_DOMAINS_LITE = "top_mentioned_domains_lite";
  @SerializedName(SERIALIZED_NAME_TOP_MENTIONED_DOMAINS_LITE)
  private Map<String, String> topMentionedDomainsLite;

  public AiOptimizationLlmMentionsAvailableFiltersResultInfo topMentionedDomainsLite(Map<String, String> topMentionedDomainsLite) {
    this.topMentionedDomainsLite = topMentionedDomainsLite;
    return this;
  }

  /**
   * 
   * @return topMentionedDomainsLite
   */
  @javax.annotation.Nullable
  public Map<String, String> getTopMentionedDomainsLite() {
    return topMentionedDomainsLite;
  }

  public void setTopMentionedDomainsLite(Map<String, String> topMentionedDomainsLite) {
    this.topMentionedDomainsLite = topMentionedDomainsLite;
  }


  public static final String SERIALIZED_NAME_TOP_MENTIONED_PAGES_LITE = "top_mentioned_pages_lite";
  @SerializedName(SERIALIZED_NAME_TOP_MENTIONED_PAGES_LITE)
  private Map<String, String> topMentionedPagesLite;

  public AiOptimizationLlmMentionsAvailableFiltersResultInfo topMentionedPagesLite(Map<String, String> topMentionedPagesLite) {
    this.topMentionedPagesLite = topMentionedPagesLite;
    return this;
  }

  /**
   * 
   * @return topMentionedPagesLite
   */
  @javax.annotation.Nullable
  public Map<String, String> getTopMentionedPagesLite() {
    return topMentionedPagesLite;
  }

  public void setTopMentionedPagesLite(Map<String, String> topMentionedPagesLite) {
    this.topMentionedPagesLite = topMentionedPagesLite;
  }


  public static final String SERIALIZED_NAME_TOP_MENTIONED_BRANDS_LITE = "top_mentioned_brands_lite";
  @SerializedName(SERIALIZED_NAME_TOP_MENTIONED_BRANDS_LITE)
  private Map<String, String> topMentionedBrandsLite;

  public AiOptimizationLlmMentionsAvailableFiltersResultInfo topMentionedBrandsLite(Map<String, String> topMentionedBrandsLite) {
    this.topMentionedBrandsLite = topMentionedBrandsLite;
    return this;
  }

  /**
   * 
   * @return topMentionedBrandsLite
   */
  @javax.annotation.Nullable
  public Map<String, String> getTopMentionedBrandsLite() {
    return topMentionedBrandsLite;
  }

  public void setTopMentionedBrandsLite(Map<String, String> topMentionedBrandsLite) {
    this.topMentionedBrandsLite = topMentionedBrandsLite;
  }


  public static final String SERIALIZED_NAME_TOP_MENTIONED_BRAND_CATEGORIES_LITE = "top_mentioned_brand_categories_lite";
  @SerializedName(SERIALIZED_NAME_TOP_MENTIONED_BRAND_CATEGORIES_LITE)
  private Map<String, String> topMentionedBrandCategoriesLite;

  public AiOptimizationLlmMentionsAvailableFiltersResultInfo topMentionedBrandCategoriesLite(Map<String, String> topMentionedBrandCategoriesLite) {
    this.topMentionedBrandCategoriesLite = topMentionedBrandCategoriesLite;
    return this;
  }

  /**
   * 
   * @return topMentionedBrandCategoriesLite
   */
  @javax.annotation.Nullable
  public Map<String, String> getTopMentionedBrandCategoriesLite() {
    return topMentionedBrandCategoriesLite;
  }

  public void setTopMentionedBrandCategoriesLite(Map<String, String> topMentionedBrandCategoriesLite) {
    this.topMentionedBrandCategoriesLite = topMentionedBrandCategoriesLite;
  }



  public AiOptimizationLlmMentionsAvailableFiltersResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AiOptimizationLlmMentionsAvailableFiltersResultInfo putAdditionalProperty(String key, Object value) {
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


    
    AiOptimizationLlmMentionsAvailableFiltersResultInfo aiOptimizationLlmMentionsAvailableFiltersResultInfo = (AiOptimizationLlmMentionsAvailableFiltersResultInfo) o;
    return

        Objects.equals(this.search, aiOptimizationLlmMentionsAvailableFiltersResultInfo.search) &&
        Objects.equals(this.searchMentions, aiOptimizationLlmMentionsAvailableFiltersResultInfo.searchMentions) &&
        Objects.equals(this.targetMetrics, aiOptimizationLlmMentionsAvailableFiltersResultInfo.targetMetrics) &&
        Objects.equals(this.multiTargetMetrics, aiOptimizationLlmMentionsAvailableFiltersResultInfo.multiTargetMetrics) &&
        Objects.equals(this.topMentionedDomains, aiOptimizationLlmMentionsAvailableFiltersResultInfo.topMentionedDomains) &&
        Objects.equals(this.topMentionedPages, aiOptimizationLlmMentionsAvailableFiltersResultInfo.topMentionedPages) &&
        Objects.equals(this.topMentionedBrands, aiOptimizationLlmMentionsAvailableFiltersResultInfo.topMentionedBrands) &&
        Objects.equals(this.topMentionedBrandCategories, aiOptimizationLlmMentionsAvailableFiltersResultInfo.topMentionedBrandCategories) &&
        Objects.equals(this.targetMetricsLite, aiOptimizationLlmMentionsAvailableFiltersResultInfo.targetMetricsLite) &&
        Objects.equals(this.topMentionedDomainsLite, aiOptimizationLlmMentionsAvailableFiltersResultInfo.topMentionedDomainsLite) &&
        Objects.equals(this.topMentionedPagesLite, aiOptimizationLlmMentionsAvailableFiltersResultInfo.topMentionedPagesLite) &&
        Objects.equals(this.topMentionedBrandsLite, aiOptimizationLlmMentionsAvailableFiltersResultInfo.topMentionedBrandsLite) &&
        Objects.equals(this.topMentionedBrandCategoriesLite, aiOptimizationLlmMentionsAvailableFiltersResultInfo.topMentionedBrandCategoriesLite);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(search, searchMentions, targetMetrics, multiTargetMetrics, topMentionedDomains, topMentionedPages, topMentionedBrands, topMentionedBrandCategories, targetMetricsLite, topMentionedDomainsLite, topMentionedPagesLite, topMentionedBrandsLite, topMentionedBrandCategoriesLite);
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
    sb.append("class AiOptimizationLlmMentionsAvailableFiltersResultInfo {\n");

    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    searchMentions: ").append(toIndentedString(searchMentions)).append("\n");
    sb.append("    targetMetrics: ").append(toIndentedString(targetMetrics)).append("\n");
    sb.append("    multiTargetMetrics: ").append(toIndentedString(multiTargetMetrics)).append("\n");
    sb.append("    topMentionedDomains: ").append(toIndentedString(topMentionedDomains)).append("\n");
    sb.append("    topMentionedPages: ").append(toIndentedString(topMentionedPages)).append("\n");
    sb.append("    topMentionedBrands: ").append(toIndentedString(topMentionedBrands)).append("\n");
    sb.append("    topMentionedBrandCategories: ").append(toIndentedString(topMentionedBrandCategories)).append("\n");
    sb.append("    targetMetricsLite: ").append(toIndentedString(targetMetricsLite)).append("\n");
    sb.append("    topMentionedDomainsLite: ").append(toIndentedString(topMentionedDomainsLite)).append("\n");
    sb.append("    topMentionedPagesLite: ").append(toIndentedString(topMentionedPagesLite)).append("\n");
    sb.append("    topMentionedBrandsLite: ").append(toIndentedString(topMentionedBrandsLite)).append("\n");
    sb.append("    topMentionedBrandCategoriesLite: ").append(toIndentedString(topMentionedBrandCategoriesLite)).append("\n");
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
    
    openapiFields.add("search");
    
    openapiFields.add("search_mentions");
    
    openapiFields.add("target_metrics");
    
    openapiFields.add("multi_target_metrics");
    
    openapiFields.add("top_mentioned_domains");
    
    openapiFields.add("top_mentioned_pages");
    
    openapiFields.add("top_mentioned_brands");
    
    openapiFields.add("top_mentioned_brand_categories");
    
    openapiFields.add("target_metrics_lite");
    
    openapiFields.add("top_mentioned_domains_lite");
    
    openapiFields.add("top_mentioned_pages_lite");
    
    openapiFields.add("top_mentioned_brands_lite");
    
    openapiFields.add("top_mentioned_brand_categories_lite");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AiOptimizationLlmMentionsAvailableFiltersResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiOptimizationLlmMentionsAvailableFiltersResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiOptimizationLlmMentionsAvailableFiltersResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiOptimizationLlmMentionsAvailableFiltersResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiOptimizationLlmMentionsAvailableFiltersResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AiOptimizationLlmMentionsAvailableFiltersResultInfo>() {
           @Override
           public void write(JsonWriter out, AiOptimizationLlmMentionsAvailableFiltersResultInfo value) throws IOException {
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
           public AiOptimizationLlmMentionsAvailableFiltersResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AiOptimizationLlmMentionsAvailableFiltersResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AiOptimizationLlmMentionsAvailableFiltersResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiOptimizationLlmMentionsAvailableFiltersResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}