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



public class AppendixTechnologiesDomainAnalyticsPriceData  {


  public static final String SERIALIZED_NAME_LANGUAGES = "languages";
  @SerializedName(SERIALIZED_NAME_LANGUAGES)
  private AppendixTaskKeywordsDataPriceDataInfo languages;

  public AppendixTechnologiesDomainAnalyticsPriceData languages(AppendixTaskKeywordsDataPriceDataInfo languages) {
    this.languages = languages;
    return this;
  }

  /**
   * 
   * @return languages
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getLanguages() {
    return languages;
  }

  public void setLanguages(AppendixTaskKeywordsDataPriceDataInfo languages) {
    this.languages = languages;
  }


  public static final String SERIALIZED_NAME_LOCATIONS = "locations";
  @SerializedName(SERIALIZED_NAME_LOCATIONS)
  private AppendixTaskKeywordsDataPriceDataInfo locations;

  public AppendixTechnologiesDomainAnalyticsPriceData locations(AppendixTaskKeywordsDataPriceDataInfo locations) {
    this.locations = locations;
    return this;
  }

  /**
   * 
   * @return locations
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getLocations() {
    return locations;
  }

  public void setLocations(AppendixTaskKeywordsDataPriceDataInfo locations) {
    this.locations = locations;
  }


  public static final String SERIALIZED_NAME_TECHNOLOGIES = "technologies";
  @SerializedName(SERIALIZED_NAME_TECHNOLOGIES)
  private AppendixTaskKeywordsDataPriceDataInfo technologies;

  public AppendixTechnologiesDomainAnalyticsPriceData technologies(AppendixTaskKeywordsDataPriceDataInfo technologies) {
    this.technologies = technologies;
    return this;
  }

  /**
   * 
   * @return technologies
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getTechnologies() {
    return technologies;
  }

  public void setTechnologies(AppendixTaskKeywordsDataPriceDataInfo technologies) {
    this.technologies = technologies;
  }


  public static final String SERIALIZED_NAME_AGGREGATION_TECHNOLOGIES = "aggregation_technologies";
  @SerializedName(SERIALIZED_NAME_AGGREGATION_TECHNOLOGIES)
  private AppendixBingKeywordsDataPriceDataInfo aggregationTechnologies;

  public AppendixTechnologiesDomainAnalyticsPriceData aggregationTechnologies(AppendixBingKeywordsDataPriceDataInfo aggregationTechnologies) {
    this.aggregationTechnologies = aggregationTechnologies;
    return this;
  }

  /**
   * 
   * @return aggregationTechnologies
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getAggregationTechnologies() {
    return aggregationTechnologies;
  }

  public void setAggregationTechnologies(AppendixBingKeywordsDataPriceDataInfo aggregationTechnologies) {
    this.aggregationTechnologies = aggregationTechnologies;
  }


  public static final String SERIALIZED_NAME_DOMAINS_BY_HTML_TERMS = "domains_by_html_terms";
  @SerializedName(SERIALIZED_NAME_DOMAINS_BY_HTML_TERMS)
  private AppendixBingKeywordsDataPriceDataInfo domainsByHtmlTerms;

  public AppendixTechnologiesDomainAnalyticsPriceData domainsByHtmlTerms(AppendixBingKeywordsDataPriceDataInfo domainsByHtmlTerms) {
    this.domainsByHtmlTerms = domainsByHtmlTerms;
    return this;
  }

  /**
   * 
   * @return domainsByHtmlTerms
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getDomainsByHtmlTerms() {
    return domainsByHtmlTerms;
  }

  public void setDomainsByHtmlTerms(AppendixBingKeywordsDataPriceDataInfo domainsByHtmlTerms) {
    this.domainsByHtmlTerms = domainsByHtmlTerms;
  }


  public static final String SERIALIZED_NAME_DOMAINS_BY_TECHNOLOGY = "domains_by_technology";
  @SerializedName(SERIALIZED_NAME_DOMAINS_BY_TECHNOLOGY)
  private AppendixBingKeywordsDataPriceDataInfo domainsByTechnology;

  public AppendixTechnologiesDomainAnalyticsPriceData domainsByTechnology(AppendixBingKeywordsDataPriceDataInfo domainsByTechnology) {
    this.domainsByTechnology = domainsByTechnology;
    return this;
  }

  /**
   * 
   * @return domainsByTechnology
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getDomainsByTechnology() {
    return domainsByTechnology;
  }

  public void setDomainsByTechnology(AppendixBingKeywordsDataPriceDataInfo domainsByTechnology) {
    this.domainsByTechnology = domainsByTechnology;
  }


  public static final String SERIALIZED_NAME_DOMAIN_TECHNOLOGIES = "domain_technologies";
  @SerializedName(SERIALIZED_NAME_DOMAIN_TECHNOLOGIES)
  private AppendixBingKeywordsDataPriceDataInfo domainTechnologies;

  public AppendixTechnologiesDomainAnalyticsPriceData domainTechnologies(AppendixBingKeywordsDataPriceDataInfo domainTechnologies) {
    this.domainTechnologies = domainTechnologies;
    return this;
  }

  /**
   * 
   * @return domainTechnologies
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getDomainTechnologies() {
    return domainTechnologies;
  }

  public void setDomainTechnologies(AppendixBingKeywordsDataPriceDataInfo domainTechnologies) {
    this.domainTechnologies = domainTechnologies;
  }


  public static final String SERIALIZED_NAME_TECHNOLOGIES_SUMMARY = "technologies_summary";
  @SerializedName(SERIALIZED_NAME_TECHNOLOGIES_SUMMARY)
  private AppendixBingKeywordsDataPriceDataInfo technologiesSummary;

  public AppendixTechnologiesDomainAnalyticsPriceData technologiesSummary(AppendixBingKeywordsDataPriceDataInfo technologiesSummary) {
    this.technologiesSummary = technologiesSummary;
    return this;
  }

  /**
   * 
   * @return technologiesSummary
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getTechnologiesSummary() {
    return technologiesSummary;
  }

  public void setTechnologiesSummary(AppendixBingKeywordsDataPriceDataInfo technologiesSummary) {
    this.technologiesSummary = technologiesSummary;
  }


  public static final String SERIALIZED_NAME_TECHNOLOGY_STATS = "technology_stats";
  @SerializedName(SERIALIZED_NAME_TECHNOLOGY_STATS)
  private AppendixBingKeywordsDataPriceDataInfo technologyStats;

  public AppendixTechnologiesDomainAnalyticsPriceData technologyStats(AppendixBingKeywordsDataPriceDataInfo technologyStats) {
    this.technologyStats = technologyStats;
    return this;
  }

  /**
   * 
   * @return technologyStats
   */
  @javax.annotation.Nullable
  public AppendixBingKeywordsDataPriceDataInfo getTechnologyStats() {
    return technologyStats;
  }

  public void setTechnologyStats(AppendixBingKeywordsDataPriceDataInfo technologyStats) {
    this.technologyStats = technologyStats;
  }



  public AppendixTechnologiesDomainAnalyticsPriceData() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixTechnologiesDomainAnalyticsPriceData putAdditionalProperty(String key, Object value) {
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


    
    AppendixTechnologiesDomainAnalyticsPriceData appendixTechnologiesDomainAnalyticsPriceData = (AppendixTechnologiesDomainAnalyticsPriceData) o;
    return

        Objects.equals(this.languages, appendixTechnologiesDomainAnalyticsPriceData.languages) &&
        Objects.equals(this.locations, appendixTechnologiesDomainAnalyticsPriceData.locations) &&
        Objects.equals(this.technologies, appendixTechnologiesDomainAnalyticsPriceData.technologies) &&
        Objects.equals(this.aggregationTechnologies, appendixTechnologiesDomainAnalyticsPriceData.aggregationTechnologies) &&
        Objects.equals(this.domainsByHtmlTerms, appendixTechnologiesDomainAnalyticsPriceData.domainsByHtmlTerms) &&
        Objects.equals(this.domainsByTechnology, appendixTechnologiesDomainAnalyticsPriceData.domainsByTechnology) &&
        Objects.equals(this.domainTechnologies, appendixTechnologiesDomainAnalyticsPriceData.domainTechnologies) &&
        Objects.equals(this.technologiesSummary, appendixTechnologiesDomainAnalyticsPriceData.technologiesSummary) &&
        Objects.equals(this.technologyStats, appendixTechnologiesDomainAnalyticsPriceData.technologyStats);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(languages, locations, technologies, aggregationTechnologies, domainsByHtmlTerms, domainsByTechnology, domainTechnologies, technologiesSummary, technologyStats);
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
    sb.append("class AppendixTechnologiesDomainAnalyticsPriceData {\n");

    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    technologies: ").append(toIndentedString(technologies)).append("\n");
    sb.append("    aggregationTechnologies: ").append(toIndentedString(aggregationTechnologies)).append("\n");
    sb.append("    domainsByHtmlTerms: ").append(toIndentedString(domainsByHtmlTerms)).append("\n");
    sb.append("    domainsByTechnology: ").append(toIndentedString(domainsByTechnology)).append("\n");
    sb.append("    domainTechnologies: ").append(toIndentedString(domainTechnologies)).append("\n");
    sb.append("    technologiesSummary: ").append(toIndentedString(technologiesSummary)).append("\n");
    sb.append("    technologyStats: ").append(toIndentedString(technologyStats)).append("\n");
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
    
    openapiFields.add("languages");
    
    openapiFields.add("locations");
    
    openapiFields.add("technologies");
    
    openapiFields.add("aggregation_technologies");
    
    openapiFields.add("domains_by_html_terms");
    
    openapiFields.add("domains_by_technology");
    
    openapiFields.add("domain_technologies");
    
    openapiFields.add("technologies_summary");
    
    openapiFields.add("technology_stats");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixTechnologiesDomainAnalyticsPriceData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixTechnologiesDomainAnalyticsPriceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixTechnologiesDomainAnalyticsPriceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixTechnologiesDomainAnalyticsPriceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixTechnologiesDomainAnalyticsPriceData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixTechnologiesDomainAnalyticsPriceData>() {
           @Override
           public void write(JsonWriter out, AppendixTechnologiesDomainAnalyticsPriceData value) throws IOException {
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
           public AppendixTechnologiesDomainAnalyticsPriceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixTechnologiesDomainAnalyticsPriceData instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixTechnologiesDomainAnalyticsPriceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixTechnologiesDomainAnalyticsPriceData.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}