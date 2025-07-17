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



public class Autocomplete  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public Autocomplete type(String type) {
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


  public static final String SERIALIZED_NAME_RANK_GROUP = "rank_group";
  @SerializedName(SERIALIZED_NAME_RANK_GROUP)
  private Integer rankGroup;

  public Autocomplete rankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
    return this;
  }

  /**
   * group rank in SERP
* position within a group of elements with identical type values
* positions of elements with different type values are omitted from rank_group
   * @return rankGroup
   */
  @javax.annotation.Nullable
  public Integer getRankGroup() {
    return rankGroup;
  }

  public void setRankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
  }


  public static final String SERIALIZED_NAME_RANK_ABSOLUTE = "rank_absolute";
  @SerializedName(SERIALIZED_NAME_RANK_ABSOLUTE)
  private Integer rankAbsolute;

  public Autocomplete rankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
    return this;
  }

  /**
   * absolute rank in SERP
* absolute position among all the elements in SERP
   * @return rankAbsolute
   */
  @javax.annotation.Nullable
  public Integer getRankAbsolute() {
    return rankAbsolute;
  }

  public void setRankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
  }


  public static final String SERIALIZED_NAME_RELEVANCE = "relevance";
  @SerializedName(SERIALIZED_NAME_RELEVANCE)
  private Integer relevance;

  public Autocomplete relevance(Integer relevance) {
    this.relevance = relevance;
    return this;
  }

  /**
   * relevance of suggested keyword
* represents the relevant of the autocomplete suggestion to the target keyword
* can take values from 500 to 2000
* the higher the value, the more relevant is the suggestion
* Note: only available for the following client:
* chrome/chrome-omni
   * @return relevance
   */
  @javax.annotation.Nullable
  public Integer getRelevance() {
    return relevance;
  }

  public void setRelevance(Integer relevance) {
    this.relevance = relevance;
  }


  public static final String SERIALIZED_NAME_SUGGESTION = "suggestion";
  @SerializedName(SERIALIZED_NAME_SUGGESTION)
  private String suggestion;

  public Autocomplete suggestion(String suggestion) {
    this.suggestion = suggestion;
    return this;
  }

  /**
   * google autocomplete keyword suggestion
   * @return suggestion
   */
  @javax.annotation.Nullable
  public String getSuggestion() {
    return suggestion;
  }

  public void setSuggestion(String suggestion) {
    this.suggestion = suggestion;
  }


  public static final String SERIALIZED_NAME_SUGGESTION_TYPE = "suggestion_type";
  @SerializedName(SERIALIZED_NAME_SUGGESTION_TYPE)
  private String suggestionType;

  public Autocomplete suggestionType(String suggestionType) {
    this.suggestionType = suggestionType;
    return this;
  }

  /**
   * google autocomplete suggestion type
* Note: only available for the following client:
* chrome/chrome-omni
   * @return suggestionType
   */
  @javax.annotation.Nullable
  public String getSuggestionType() {
    return suggestionType;
  }

  public void setSuggestionType(String suggestionType) {
    this.suggestionType = suggestionType;
  }


  public static final String SERIALIZED_NAME_SEARCH_QUERY_URL = "search_query_url";
  @SerializedName(SERIALIZED_NAME_SEARCH_QUERY_URL)
  private String searchQueryUrl;

  public Autocomplete searchQueryUrl(String searchQueryUrl) {
    this.searchQueryUrl = searchQueryUrl;
    return this;
  }

  /**
   * url to search results
* url to search results relevant to the google autocomplete suggestion
   * @return searchQueryUrl
   */
  @javax.annotation.Nullable
  public String getSearchQueryUrl() {
    return searchQueryUrl;
  }

  public void setSearchQueryUrl(String searchQueryUrl) {
    this.searchQueryUrl = searchQueryUrl;
  }


  public static final String SERIALIZED_NAME_THUMBNAIL_URL = "thumbnail_url";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_URL)
  private String thumbnailUrl;

  public Autocomplete thumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }

  /**
   * url of the thumbnail image
* url of the thumbnail image of the google autocomplete suggestion
* Note: only available for the following client:
* gws-wiz
* gws-wiz-serp
   * @return thumbnailUrl
   */
  @javax.annotation.Nullable
  public String getThumbnailUrl() {
    return thumbnailUrl;
  }

  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }


  public static final String SERIALIZED_NAME_HIGHLIGHTED = "highlighted";
  @SerializedName(SERIALIZED_NAME_HIGHLIGHTED)
  private List<String> highlighted;

  public Autocomplete highlighted(List<String> highlighted) {
    this.highlighted = highlighted;
    return this;
  }

  /**
   * keywords highlighted in autocomplete
* contains a list of google autocomplete suggestions that are highlighted in the search bar;
* Note: array is only available for the following client:
* gws-wiz
* psy-ab
* gws-wiz-local
   * @return highlighted
   */
  @javax.annotation.Nullable
  public List<String> getHighlighted() {
    return highlighted;
  }

  public void setHighlighted(List<String> highlighted) {
    this.highlighted = highlighted;
  }



  public Autocomplete() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public Autocomplete putAdditionalProperty(String key, Object value) {
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


    
    Autocomplete autocomplete = (Autocomplete) o;
    return

        Objects.equals(this.type, autocomplete.type) &&
        Objects.equals(this.rankGroup, autocomplete.rankGroup) &&
        Objects.equals(this.rankAbsolute, autocomplete.rankAbsolute) &&
        Objects.equals(this.relevance, autocomplete.relevance) &&
        Objects.equals(this.suggestion, autocomplete.suggestion) &&
        Objects.equals(this.suggestionType, autocomplete.suggestionType) &&
        Objects.equals(this.searchQueryUrl, autocomplete.searchQueryUrl) &&
        Objects.equals(this.thumbnailUrl, autocomplete.thumbnailUrl) &&
        Objects.equals(this.highlighted, autocomplete.highlighted);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, rankGroup, rankAbsolute, relevance, suggestion, suggestionType, searchQueryUrl, thumbnailUrl, highlighted);
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
    sb.append("class Autocomplete {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    relevance: ").append(toIndentedString(relevance)).append("\n");
    sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
    sb.append("    suggestionType: ").append(toIndentedString(suggestionType)).append("\n");
    sb.append("    searchQueryUrl: ").append(toIndentedString(searchQueryUrl)).append("\n");
    sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
    sb.append("    highlighted: ").append(toIndentedString(highlighted)).append("\n");
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
    
    openapiFields.add("rank_group");
    
    openapiFields.add("rank_absolute");
    
    openapiFields.add("relevance");
    
    openapiFields.add("suggestion");
    
    openapiFields.add("suggestion_type");
    
    openapiFields.add("search_query_url");
    
    openapiFields.add("thumbnail_url");
    
    openapiFields.add("highlighted");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Autocomplete
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Autocomplete.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Autocomplete' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Autocomplete> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Autocomplete.class));

       return (TypeAdapter<T>) new TypeAdapter<Autocomplete>() {
           @Override
           public void write(JsonWriter out, Autocomplete value) throws IOException {
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
           public Autocomplete read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Autocomplete instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static Autocomplete fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Autocomplete.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}