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



public class SerpGoogleOrganicTaskGetAdvancedResultInfo  {


  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public SerpGoogleOrganicTaskGetAdvancedResultInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * keyword received in a POST array
* the keyword is returned with decoded %## (plus symbol ‘+’ will be decoded to a space character)
   * @return keyword
   */
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public SerpGoogleOrganicTaskGetAdvancedResultInfo type(String type) {
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


  public static final String SERIALIZED_NAME_SE_DOMAIN = "se_domain";
  @SerializedName(SERIALIZED_NAME_SE_DOMAIN)
  private String seDomain;

  public SerpGoogleOrganicTaskGetAdvancedResultInfo seDomain(String seDomain) {
    this.seDomain = seDomain;
    return this;
  }

  /**
   * search engine domain in a POST array
   * @return seDomain
   */
  @javax.annotation.Nullable
  public String getSeDomain() {
    return seDomain;
  }

  public void setSeDomain(String seDomain) {
    this.seDomain = seDomain;
  }


  public static final String SERIALIZED_NAME_LOCATION_CODE = "location_code";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public SerpGoogleOrganicTaskGetAdvancedResultInfo locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

  /**
   * location code in a POST array
   * @return locationCode
   */
  @javax.annotation.Nullable
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }


  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public SerpGoogleOrganicTaskGetAdvancedResultInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * language code in a POST array
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public static final String SERIALIZED_NAME_CHECK_URL = "check_url";
  @SerializedName(SERIALIZED_NAME_CHECK_URL)
  private String checkUrl;

  public SerpGoogleOrganicTaskGetAdvancedResultInfo checkUrl(String checkUrl) {
    this.checkUrl = checkUrl;
    return this;
  }

  /**
   * direct URL to search engine results
* you can use it to make sure that we provided accurate results
   * @return checkUrl
   */
  @javax.annotation.Nullable
  public String getCheckUrl() {
    return checkUrl;
  }

  public void setCheckUrl(String checkUrl) {
    this.checkUrl = checkUrl;
  }


  public static final String SERIALIZED_NAME_DATETIME = "datetime";
  @SerializedName(SERIALIZED_NAME_DATETIME)
  private String datetime;

  public SerpGoogleOrganicTaskGetAdvancedResultInfo datetime(String datetime) {
    this.datetime = datetime;
    return this;
  }

  /**
   * date and time when the result was received
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return datetime
   */
  @javax.annotation.Nullable
  public String getDatetime() {
    return datetime;
  }

  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }


  public static final String SERIALIZED_NAME_SPELL = "spell";
  @SerializedName(SERIALIZED_NAME_SPELL)
  private SpellInfo spell;

  public SerpGoogleOrganicTaskGetAdvancedResultInfo spell(SpellInfo spell) {
    this.spell = spell;
    return this;
  }

  /**
   * autocorrection of the search engine
* if the search engine provided results for a keyword that was corrected, we will specify the keyword corrected by the search engine and the type of autocorrection
   * @return spell
   */
  @javax.annotation.Nullable
  public SpellInfo getSpell() {
    return spell;
  }

  public void setSpell(SpellInfo spell) {
    this.spell = spell;
  }


  public static final String SERIALIZED_NAME_REFINEMENT_CHIPS = "refinement_chips";
  @SerializedName(SERIALIZED_NAME_REFINEMENT_CHIPS)
  private RefinementChipsInfo refinementChips;

  public SerpGoogleOrganicTaskGetAdvancedResultInfo refinementChips(RefinementChipsInfo refinementChips) {
    this.refinementChips = refinementChips;
    return this;
  }

  /**
   * search refinement chips
   * @return refinementChips
   */
  @javax.annotation.Nullable
  public RefinementChipsInfo getRefinementChips() {
    return refinementChips;
  }

  public void setRefinementChips(RefinementChipsInfo refinementChips) {
    this.refinementChips = refinementChips;
  }


  public static final String SERIALIZED_NAME_ITEM_TYPES = "item_types";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPES)
  private List<String> itemTypes;

  public SerpGoogleOrganicTaskGetAdvancedResultInfo itemTypes(List<String> itemTypes) {
    this.itemTypes = itemTypes;
    return this;
  }

  /**
   * types of search results in SERP
* contains types of search results (items) found in SERP.
* possible item types:
* answer_box, app, carousel, multi_carousel, featured_snippet, google_flights, google_reviews, third_party_reviews, google_posts, images, jobs, knowledge_graph, local_pack, hotels_pack, map, organic, paid, people_also_ask, related_searches, people_also_search, shopping, top_stories, twitter, video, events, mention_carousel, recipes, top_sights, scholarly_articles, popular_products, podcasts, questions_and_answers, find_results_on, stocks_box, visual_stories, commercial_units, local_services, google_hotels, math_solver, currency_box,product_considerations, found_on_web, short_videos, refine_products, explore_brands, perspectives, discussions_and_forums, compare_sites, courses, ai_overview
   * @return itemTypes
   */
  @javax.annotation.Nullable
  public List<String> getItemTypes() {
    return itemTypes;
  }

  public void setItemTypes(List<String> itemTypes) {
    this.itemTypes = itemTypes;
  }


  public static final String SERIALIZED_NAME_SE_RESULTS_COUNT = "se_results_count";
  @SerializedName(SERIALIZED_NAME_SE_RESULTS_COUNT)
  private Long seResultsCount;

  public SerpGoogleOrganicTaskGetAdvancedResultInfo seResultsCount(Long seResultsCount) {
    this.seResultsCount = seResultsCount;
    return this;
  }

  /**
   * total number of results in SERP
   * @return seResultsCount
   */
  @javax.annotation.Nullable
  public Long getSeResultsCount() {
    return seResultsCount;
  }

  public void setSeResultsCount(Long seResultsCount) {
    this.seResultsCount = seResultsCount;
  }


  public static final String SERIALIZED_NAME_PAGES_COUNT = "pages_count";
  @SerializedName(SERIALIZED_NAME_PAGES_COUNT)
  private Long pagesCount;

  public SerpGoogleOrganicTaskGetAdvancedResultInfo pagesCount(Long pagesCount) {
    this.pagesCount = pagesCount;
    return this;
  }

  /**
   * total search results pages retrieved
* total number of retrieved SERPs in the result
   * @return pagesCount
   */
  @javax.annotation.Nullable
  public Long getPagesCount() {
    return pagesCount;
  }

  public void setPagesCount(Long pagesCount) {
    this.pagesCount = pagesCount;
  }


  public static final String SERIALIZED_NAME_ITEMS_COUNT = "items_count";
  @SerializedName(SERIALIZED_NAME_ITEMS_COUNT)
  private Long itemsCount;

  public SerpGoogleOrganicTaskGetAdvancedResultInfo itemsCount(Long itemsCount) {
    this.itemsCount = itemsCount;
    return this;
  }

  /**
   * the number of results returned in the items array
   * @return itemsCount
   */
  @javax.annotation.Nullable
  public Long getItemsCount() {
    return itemsCount;
  }

  public void setItemsCount(Long itemsCount) {
    this.itemsCount = itemsCount;
  }


  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<BaseSerpApiElementItem> items;

  public SerpGoogleOrganicTaskGetAdvancedResultInfo items(List<BaseSerpApiElementItem> items) {
    this.items = items;
    return this;
  }

  /**
   * contains arrays of elements available in the list
   * @return items
   */
  @javax.annotation.Nullable
  public List<BaseSerpApiElementItem> getItems() {
    return items;
  }

  public void setItems(List<BaseSerpApiElementItem> items) {
    this.items = items;
  }



  public SerpGoogleOrganicTaskGetAdvancedResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SerpGoogleOrganicTaskGetAdvancedResultInfo putAdditionalProperty(String key, Object value) {
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


    
    SerpGoogleOrganicTaskGetAdvancedResultInfo serpGoogleOrganicTaskGetAdvancedResultInfo = (SerpGoogleOrganicTaskGetAdvancedResultInfo) o;
    return

        Objects.equals(this.keyword, serpGoogleOrganicTaskGetAdvancedResultInfo.keyword) &&
        Objects.equals(this.type, serpGoogleOrganicTaskGetAdvancedResultInfo.type) &&
        Objects.equals(this.seDomain, serpGoogleOrganicTaskGetAdvancedResultInfo.seDomain) &&
        Objects.equals(this.locationCode, serpGoogleOrganicTaskGetAdvancedResultInfo.locationCode) &&
        Objects.equals(this.languageCode, serpGoogleOrganicTaskGetAdvancedResultInfo.languageCode) &&
        Objects.equals(this.checkUrl, serpGoogleOrganicTaskGetAdvancedResultInfo.checkUrl) &&
        Objects.equals(this.datetime, serpGoogleOrganicTaskGetAdvancedResultInfo.datetime) &&
        Objects.equals(this.spell, serpGoogleOrganicTaskGetAdvancedResultInfo.spell) &&
        Objects.equals(this.refinementChips, serpGoogleOrganicTaskGetAdvancedResultInfo.refinementChips) &&
        Objects.equals(this.itemTypes, serpGoogleOrganicTaskGetAdvancedResultInfo.itemTypes) &&
        Objects.equals(this.seResultsCount, serpGoogleOrganicTaskGetAdvancedResultInfo.seResultsCount) &&
        Objects.equals(this.pagesCount, serpGoogleOrganicTaskGetAdvancedResultInfo.pagesCount) &&
        Objects.equals(this.itemsCount, serpGoogleOrganicTaskGetAdvancedResultInfo.itemsCount) &&
        Objects.equals(this.items, serpGoogleOrganicTaskGetAdvancedResultInfo.items);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keyword, type, seDomain, locationCode, languageCode, checkUrl, datetime, spell, refinementChips, itemTypes, seResultsCount, pagesCount, itemsCount, items);
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
    sb.append("class SerpGoogleOrganicTaskGetAdvancedResultInfo {\n");

    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    seDomain: ").append(toIndentedString(seDomain)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    checkUrl: ").append(toIndentedString(checkUrl)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    spell: ").append(toIndentedString(spell)).append("\n");
    sb.append("    refinementChips: ").append(toIndentedString(refinementChips)).append("\n");
    sb.append("    itemTypes: ").append(toIndentedString(itemTypes)).append("\n");
    sb.append("    seResultsCount: ").append(toIndentedString(seResultsCount)).append("\n");
    sb.append("    pagesCount: ").append(toIndentedString(pagesCount)).append("\n");
    sb.append("    itemsCount: ").append(toIndentedString(itemsCount)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    
    openapiFields.add("type");
    
    openapiFields.add("se_domain");
    
    openapiFields.add("location_code");
    
    openapiFields.add("language_code");
    
    openapiFields.add("check_url");
    
    openapiFields.add("datetime");
    
    openapiFields.add("spell");
    
    openapiFields.add("refinement_chips");
    
    openapiFields.add("item_types");
    
    openapiFields.add("se_results_count");
    
    openapiFields.add("pages_count");
    
    openapiFields.add("items_count");
    
    openapiFields.add("items");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SerpGoogleOrganicTaskGetAdvancedResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpGoogleOrganicTaskGetAdvancedResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpGoogleOrganicTaskGetAdvancedResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpGoogleOrganicTaskGetAdvancedResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpGoogleOrganicTaskGetAdvancedResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpGoogleOrganicTaskGetAdvancedResultInfo>() {
           @Override
           public void write(JsonWriter out, SerpGoogleOrganicTaskGetAdvancedResultInfo value) throws IOException {
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
           public SerpGoogleOrganicTaskGetAdvancedResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SerpGoogleOrganicTaskGetAdvancedResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SerpGoogleOrganicTaskGetAdvancedResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpGoogleOrganicTaskGetAdvancedResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}