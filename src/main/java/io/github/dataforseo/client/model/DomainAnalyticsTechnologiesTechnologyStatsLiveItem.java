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



public class DomainAnalyticsTechnologiesTechnologyStatsLiveItem  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public DomainAnalyticsTechnologiesTechnologyStatsLiveItem type(String type) {
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

  public DomainAnalyticsTechnologiesTechnologyStatsLiveItem date(String date) {
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


  public static final String SERIALIZED_NAME_DOMAINS_COUNT = "domains_count";
  @SerializedName(SERIALIZED_NAME_DOMAINS_COUNT)
  private Long domainsCount;

  public DomainAnalyticsTechnologiesTechnologyStatsLiveItem domainsCount(Long domainsCount) {
    this.domainsCount = domainsCount;
    return this;
  }

  /**
   * number of domains that use the specified technology
   * @return domainsCount
   */
  @javax.annotation.Nullable
  public Long getDomainsCount() {
    return domainsCount;
  }

  public void setDomainsCount(Long domainsCount) {
    this.domainsCount = domainsCount;
  }


  public static final String SERIALIZED_NAME_COUNTRIES = "countries";
  @SerializedName(SERIALIZED_NAME_COUNTRIES)
  private Map<String, Long> countries;

  public DomainAnalyticsTechnologiesTechnologyStatsLiveItem countries(Map<String, Long> countries) {
    this.countries = countries;
    return this;
  }

  /**
   * distribution of websites by country
* contains country codes and number of websites per country
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

  public DomainAnalyticsTechnologiesTechnologyStatsLiveItem languages(Map<String, Long> languages) {
    this.languages = languages;
    return this;
  }

  /**
   * distribution of websites by language
* contains language codes and number of websites per language
   * @return languages
   */
  @javax.annotation.Nullable
  public Map<String, Long> getLanguages() {
    return languages;
  }

  public void setLanguages(Map<String, Long> languages) {
    this.languages = languages;
  }


  public static final String SERIALIZED_NAME_DOMAINS_RANK = "domains_rank";
  @SerializedName(SERIALIZED_NAME_DOMAINS_RANK)
  private Map<String, Long> domainsRank;

  public DomainAnalyticsTechnologiesTechnologyStatsLiveItem domainsRank(Map<String, Long> domainsRank) {
    this.domainsRank = domainsRank;
    return this;
  }

  /**
   * distribution of websites by backlink rank
* contains domain rank ranges and number of websites per range
* learn more about rank and how it is calculated in this help center article
   * @return domainsRank
   */
  @javax.annotation.Nullable
  public Map<String, Long> getDomainsRank() {
    return domainsRank;
  }

  public void setDomainsRank(Map<String, Long> domainsRank) {
    this.domainsRank = domainsRank;
  }



  public DomainAnalyticsTechnologiesTechnologyStatsLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DomainAnalyticsTechnologiesTechnologyStatsLiveItem putAdditionalProperty(String key, Object value) {
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


    
    DomainAnalyticsTechnologiesTechnologyStatsLiveItem domainAnalyticsTechnologiesTechnologyStatsLiveItem = (DomainAnalyticsTechnologiesTechnologyStatsLiveItem) o;
    return

        Objects.equals(this.type, domainAnalyticsTechnologiesTechnologyStatsLiveItem.type) &&
        Objects.equals(this.date, domainAnalyticsTechnologiesTechnologyStatsLiveItem.date) &&
        Objects.equals(this.domainsCount, domainAnalyticsTechnologiesTechnologyStatsLiveItem.domainsCount) &&
        Objects.equals(this.countries, domainAnalyticsTechnologiesTechnologyStatsLiveItem.countries) &&
        Objects.equals(this.languages, domainAnalyticsTechnologiesTechnologyStatsLiveItem.languages) &&
        Objects.equals(this.domainsRank, domainAnalyticsTechnologiesTechnologyStatsLiveItem.domainsRank);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, date, domainsCount, countries, languages, domainsRank);
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
    sb.append("class DomainAnalyticsTechnologiesTechnologyStatsLiveItem {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    domainsCount: ").append(toIndentedString(domainsCount)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    domainsRank: ").append(toIndentedString(domainsRank)).append("\n");
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
    
    openapiFields.add("domains_count");
    
    openapiFields.add("countries");
    
    openapiFields.add("languages");
    
    openapiFields.add("domains_rank");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DomainAnalyticsTechnologiesTechnologyStatsLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DomainAnalyticsTechnologiesTechnologyStatsLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DomainAnalyticsTechnologiesTechnologyStatsLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DomainAnalyticsTechnologiesTechnologyStatsLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DomainAnalyticsTechnologiesTechnologyStatsLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<DomainAnalyticsTechnologiesTechnologyStatsLiveItem>() {
           @Override
           public void write(JsonWriter out, DomainAnalyticsTechnologiesTechnologyStatsLiveItem value) throws IOException {
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
           public DomainAnalyticsTechnologiesTechnologyStatsLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DomainAnalyticsTechnologiesTechnologyStatsLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DomainAnalyticsTechnologiesTechnologyStatsLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DomainAnalyticsTechnologiesTechnologyStatsLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}