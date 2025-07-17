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



public class AdsSearch  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AdsSearch type(String type) {
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

  public AdsSearch rankGroup(Integer rankGroup) {
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

  public AdsSearch rankAbsolute(Integer rankAbsolute) {
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


  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private String advertiserId;

  public AdsSearch advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  /**
   * unique identifier of the advertiser account
   * @return advertiserId
   */
  @javax.annotation.Nullable
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }


  public static final String SERIALIZED_NAME_CREATIVE_ID = "creative_id";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private String creativeId;

  public AdsSearch creativeId(String creativeId) {
    this.creativeId = creativeId;
    return this;
  }

  /**
   * unique identifier of the advertisement
   * @return creativeId
   */
  @javax.annotation.Nullable
  public String getCreativeId() {
    return creativeId;
  }

  public void setCreativeId(String creativeId) {
    this.creativeId = creativeId;
  }


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public AdsSearch title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the element
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public AdsSearch url(String url) {
    this.url = url;
    return this;
  }

  /**
   * search URL with refinement parameters
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_VERIFIED = "verified";
  @SerializedName(SERIALIZED_NAME_VERIFIED)
  private Boolean verified;

  public AdsSearch verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  /**
   * verified advertiser account
* equals true if advertiser account is verified by Google Ads
   * @return verified
   */
  @javax.annotation.Nullable
  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public AdsSearch format(String format) {
    this.format = format;
    return this;
  }

  /**
   * format of the advertisement
* possible values: text, image, video
   * @return format
   */
  @javax.annotation.Nullable
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }


  public static final String SERIALIZED_NAME_PREVIEW_IMAGE = "preview_image";
  @SerializedName(SERIALIZED_NAME_PREVIEW_IMAGE)
  private PreviewImage previewImage;

  public AdsSearch previewImage(PreviewImage previewImage) {
    this.previewImage = previewImage;
    return this;
  }

  /**
   * preview image of the advertisement
   * @return previewImage
   */
  @javax.annotation.Nullable
  public PreviewImage getPreviewImage() {
    return previewImage;
  }

  public void setPreviewImage(PreviewImage previewImage) {
    this.previewImage = previewImage;
  }


  public static final String SERIALIZED_NAME_PREVIEW_URL = "preview_url";
  @SerializedName(SERIALIZED_NAME_PREVIEW_URL)
  private String previewUrl;

  public AdsSearch previewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
    return this;
  }

  /**
   * url pointing to the ad preview
   * @return previewUrl
   */
  @javax.annotation.Nullable
  public String getPreviewUrl() {
    return previewUrl;
  }

  public void setPreviewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
  }


  public static final String SERIALIZED_NAME_FIRST_SHOWN = "first_shown";
  @SerializedName(SERIALIZED_NAME_FIRST_SHOWN)
  private String firstShown;

  public AdsSearch firstShown(String firstShown) {
    this.firstShown = firstShown;
    return this;
  }

  /**
   * date and time when the ad was shown for the first time
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
   * @return firstShown
   */
  @javax.annotation.Nullable
  public String getFirstShown() {
    return firstShown;
  }

  public void setFirstShown(String firstShown) {
    this.firstShown = firstShown;
  }


  public static final String SERIALIZED_NAME_LAST_SHOWN = "last_shown";
  @SerializedName(SERIALIZED_NAME_LAST_SHOWN)
  private String lastShown;

  public AdsSearch lastShown(String lastShown) {
    this.lastShown = lastShown;
    return this;
  }

  /**
   * date and time when the ad was shown the last time
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
   * @return lastShown
   */
  @javax.annotation.Nullable
  public String getLastShown() {
    return lastShown;
  }

  public void setLastShown(String lastShown) {
    this.lastShown = lastShown;
  }



  public AdsSearch() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AdsSearch putAdditionalProperty(String key, Object value) {
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


    
    AdsSearch adsSearch = (AdsSearch) o;
    return

        Objects.equals(this.type, adsSearch.type) &&
        Objects.equals(this.rankGroup, adsSearch.rankGroup) &&
        Objects.equals(this.rankAbsolute, adsSearch.rankAbsolute) &&
        Objects.equals(this.advertiserId, adsSearch.advertiserId) &&
        Objects.equals(this.creativeId, adsSearch.creativeId) &&
        Objects.equals(this.title, adsSearch.title) &&
        Objects.equals(this.url, adsSearch.url) &&
        Objects.equals(this.verified, adsSearch.verified) &&
        Objects.equals(this.format, adsSearch.format) &&
        Objects.equals(this.previewImage, adsSearch.previewImage) &&
        Objects.equals(this.previewUrl, adsSearch.previewUrl) &&
        Objects.equals(this.firstShown, adsSearch.firstShown) &&
        Objects.equals(this.lastShown, adsSearch.lastShown);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, rankGroup, rankAbsolute, advertiserId, creativeId, title, url, verified, format, previewImage, previewUrl, firstShown, lastShown);
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
    sb.append("class AdsSearch {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    previewImage: ").append(toIndentedString(previewImage)).append("\n");
    sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
    sb.append("    firstShown: ").append(toIndentedString(firstShown)).append("\n");
    sb.append("    lastShown: ").append(toIndentedString(lastShown)).append("\n");
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
    
    openapiFields.add("advertiser_id");
    
    openapiFields.add("creative_id");
    
    openapiFields.add("title");
    
    openapiFields.add("url");
    
    openapiFields.add("verified");
    
    openapiFields.add("format");
    
    openapiFields.add("preview_image");
    
    openapiFields.add("preview_url");
    
    openapiFields.add("first_shown");
    
    openapiFields.add("last_shown");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AdsSearch
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdsSearch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdsSearch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdsSearch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdsSearch.class));

       return (TypeAdapter<T>) new TypeAdapter<AdsSearch>() {
           @Override
           public void write(JsonWriter out, AdsSearch value) throws IOException {
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
           public AdsSearch read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AdsSearch instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AdsSearch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdsSearch.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}