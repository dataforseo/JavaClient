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



public class DomainAnalyticsTechnologiesDomainsByLiveItem  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public DomainAnalyticsTechnologiesDomainsByLiveItem type(String type) {
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


  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public DomainAnalyticsTechnologiesDomainsByLiveItem domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * specified domain name
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public DomainAnalyticsTechnologiesDomainsByLiveItem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * domain meta title
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

  public DomainAnalyticsTechnologiesDomainsByLiveItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * domain meta description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public static final String SERIALIZED_NAME_META_KEYWORDS = "meta_keywords";
  @SerializedName(SERIALIZED_NAME_META_KEYWORDS)
  private List<String> metaKeywords;

  public DomainAnalyticsTechnologiesDomainsByLiveItem metaKeywords(List<String> metaKeywords) {
    this.metaKeywords = metaKeywords;
    return this;
  }

  /**
   * domain meta keywords
   * @return metaKeywords
   */
  @javax.annotation.Nullable
  public List<String> getMetaKeywords() {
    return metaKeywords;
  }

  public void setMetaKeywords(List<String> metaKeywords) {
    this.metaKeywords = metaKeywords;
  }


  public static final String SERIALIZED_NAME_DOMAIN_RANK = "domain_rank";
  @SerializedName(SERIALIZED_NAME_DOMAIN_RANK)
  private Integer domainRank;

  public DomainAnalyticsTechnologiesDomainsByLiveItem domainRank(Integer domainRank) {
    this.domainRank = domainRank;
    return this;
  }

  /**
   * backlink rank of the target domain
* learn more about the metric and how it is calculated in this help center article
   * @return domainRank
   */
  @javax.annotation.Nullable
  public Integer getDomainRank() {
    return domainRank;
  }

  public void setDomainRank(Integer domainRank) {
    this.domainRank = domainRank;
  }


  public static final String SERIALIZED_NAME_LAST_VISITED = "last_visited";
  @SerializedName(SERIALIZED_NAME_LAST_VISITED)
  private String lastVisited;

  public DomainAnalyticsTechnologiesDomainsByLiveItem lastVisited(String lastVisited) {
    this.lastVisited = lastVisited;
    return this;
  }

  /**
   * most recent date when our crawler visited the domain
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2022-10-10 12:57:46 +00:00
   * @return lastVisited
   */
  @javax.annotation.Nullable
  public String getLastVisited() {
    return lastVisited;
  }

  public void setLastVisited(String lastVisited) {
    this.lastVisited = lastVisited;
  }


  public static final String SERIALIZED_NAME_COUNTRY_ISO_CODE = "country_iso_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ISO_CODE)
  private String countryIsoCode;

  public DomainAnalyticsTechnologiesDomainsByLiveItem countryIsoCode(String countryIsoCode) {
    this.countryIsoCode = countryIsoCode;
    return this;
  }

  /**
   * domain ISO code
* ISO code of the country that target domain is determined to belong to
   * @return countryIsoCode
   */
  @javax.annotation.Nullable
  public String getCountryIsoCode() {
    return countryIsoCode;
  }

  public void setCountryIsoCode(String countryIsoCode) {
    this.countryIsoCode = countryIsoCode;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public DomainAnalyticsTechnologiesDomainsByLiveItem languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * domain language
* code of the language that target domain is determined to be associated with
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_CONTENT_LANGUAGE_CODE = "content_language_code";
  @SerializedName(SERIALIZED_NAME_CONTENT_LANGUAGE_CODE)
  private String contentLanguageCode;

  public DomainAnalyticsTechnologiesDomainsByLiveItem contentLanguageCode(String contentLanguageCode) {
    this.contentLanguageCode = contentLanguageCode;
    return this;
  }

  /**
   * content language
* code of the language that content on the target domain is written with
   * @return contentLanguageCode
   */
  @javax.annotation.Nullable
  public String getContentLanguageCode() {
    return contentLanguageCode;
  }

  public void setContentLanguageCode(String contentLanguageCode) {
    this.contentLanguageCode = contentLanguageCode;
  }


  public static final String SERIALIZED_NAME_PHONE_NUMBERS = "phone_numbers";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBERS)
  private List<String> phoneNumbers;

  public DomainAnalyticsTechnologiesDomainsByLiveItem phoneNumbers(List<String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  /**
   * phone numbers of the target
* contact phone numbers indicated on the target website
   * @return phoneNumbers
   */
  @javax.annotation.Nullable
  public List<String> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public static final String SERIALIZED_NAME_EMAILS = "emails";
  @SerializedName(SERIALIZED_NAME_EMAILS)
  private List<String> emails;

  public DomainAnalyticsTechnologiesDomainsByLiveItem emails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  /**
   * emails of the target
* emails indicated on the target website
   * @return emails
   */
  @javax.annotation.Nullable
  public List<String> getEmails() {
    return emails;
  }

  public void setEmails(List<String> emails) {
    this.emails = emails;
  }


  public static final String SERIALIZED_NAME_SOCIAL_GRAPH_URLS = "social_graph_urls";
  @SerializedName(SERIALIZED_NAME_SOCIAL_GRAPH_URLS)
  private List<String> socialGraphUrls;

  public DomainAnalyticsTechnologiesDomainsByLiveItem socialGraphUrls(List<String> socialGraphUrls) {
    this.socialGraphUrls = socialGraphUrls;
    return this;
  }

  /**
   * social media links and handles
* social media URLs detected in the social graphs of the target website
   * @return socialGraphUrls
   */
  @javax.annotation.Nullable
  public List<String> getSocialGraphUrls() {
    return socialGraphUrls;
  }

  public void setSocialGraphUrls(List<String> socialGraphUrls) {
    this.socialGraphUrls = socialGraphUrls;
  }


  public static final String SERIALIZED_NAME_TECHNOLOGIES = "technologies";
  @SerializedName(SERIALIZED_NAME_TECHNOLOGIES)
  private TechnologiesInfo technologies;

  public DomainAnalyticsTechnologiesDomainsByLiveItem technologies(TechnologiesInfo technologies) {
    this.technologies = technologies;
    return this;
  }

  /**
   * technologies used by target domain
* contains objects with the names of technologies used on the website;
* to get a full list of technologies and their structure, refer to the technologies endpoint
   * @return technologies
   */
  @javax.annotation.Nullable
  public TechnologiesInfo getTechnologies() {
    return technologies;
  }

  public void setTechnologies(TechnologiesInfo technologies) {
    this.technologies = technologies;
  }



  public DomainAnalyticsTechnologiesDomainsByLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DomainAnalyticsTechnologiesDomainsByLiveItem putAdditionalProperty(String key, Object value) {
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


    
    DomainAnalyticsTechnologiesDomainsByLiveItem domainAnalyticsTechnologiesDomainsByLiveItem = (DomainAnalyticsTechnologiesDomainsByLiveItem) o;
    return

        Objects.equals(this.type, domainAnalyticsTechnologiesDomainsByLiveItem.type) &&
        Objects.equals(this.domain, domainAnalyticsTechnologiesDomainsByLiveItem.domain) &&
        Objects.equals(this.title, domainAnalyticsTechnologiesDomainsByLiveItem.title) &&
        Objects.equals(this.description, domainAnalyticsTechnologiesDomainsByLiveItem.description) &&
        Objects.equals(this.metaKeywords, domainAnalyticsTechnologiesDomainsByLiveItem.metaKeywords) &&
        Objects.equals(this.domainRank, domainAnalyticsTechnologiesDomainsByLiveItem.domainRank) &&
        Objects.equals(this.lastVisited, domainAnalyticsTechnologiesDomainsByLiveItem.lastVisited) &&
        Objects.equals(this.countryIsoCode, domainAnalyticsTechnologiesDomainsByLiveItem.countryIsoCode) &&
        Objects.equals(this.languageCode, domainAnalyticsTechnologiesDomainsByLiveItem.languageCode) &&
        Objects.equals(this.contentLanguageCode, domainAnalyticsTechnologiesDomainsByLiveItem.contentLanguageCode) &&
        Objects.equals(this.phoneNumbers, domainAnalyticsTechnologiesDomainsByLiveItem.phoneNumbers) &&
        Objects.equals(this.emails, domainAnalyticsTechnologiesDomainsByLiveItem.emails) &&
        Objects.equals(this.socialGraphUrls, domainAnalyticsTechnologiesDomainsByLiveItem.socialGraphUrls) &&
        Objects.equals(this.technologies, domainAnalyticsTechnologiesDomainsByLiveItem.technologies);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, domain, title, description, metaKeywords, domainRank, lastVisited, countryIsoCode, languageCode, contentLanguageCode, phoneNumbers, emails, socialGraphUrls, technologies);
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
    sb.append("class DomainAnalyticsTechnologiesDomainsByLiveItem {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metaKeywords: ").append(toIndentedString(metaKeywords)).append("\n");
    sb.append("    domainRank: ").append(toIndentedString(domainRank)).append("\n");
    sb.append("    lastVisited: ").append(toIndentedString(lastVisited)).append("\n");
    sb.append("    countryIsoCode: ").append(toIndentedString(countryIsoCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    contentLanguageCode: ").append(toIndentedString(contentLanguageCode)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    socialGraphUrls: ").append(toIndentedString(socialGraphUrls)).append("\n");
    sb.append("    technologies: ").append(toIndentedString(technologies)).append("\n");
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
    
    openapiFields.add("domain");
    
    openapiFields.add("title");
    
    openapiFields.add("description");
    
    openapiFields.add("meta_keywords");
    
    openapiFields.add("domain_rank");
    
    openapiFields.add("last_visited");
    
    openapiFields.add("country_iso_code");
    
    openapiFields.add("language_code");
    
    openapiFields.add("content_language_code");
    
    openapiFields.add("phone_numbers");
    
    openapiFields.add("emails");
    
    openapiFields.add("social_graph_urls");
    
    openapiFields.add("technologies");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DomainAnalyticsTechnologiesDomainsByLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DomainAnalyticsTechnologiesDomainsByLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DomainAnalyticsTechnologiesDomainsByLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DomainAnalyticsTechnologiesDomainsByLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DomainAnalyticsTechnologiesDomainsByLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<DomainAnalyticsTechnologiesDomainsByLiveItem>() {
           @Override
           public void write(JsonWriter out, DomainAnalyticsTechnologiesDomainsByLiveItem value) throws IOException {
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
           public DomainAnalyticsTechnologiesDomainsByLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DomainAnalyticsTechnologiesDomainsByLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DomainAnalyticsTechnologiesDomainsByLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DomainAnalyticsTechnologiesDomainsByLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}