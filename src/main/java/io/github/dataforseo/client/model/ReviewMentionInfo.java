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



public class ReviewMentionInfo  {


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public ReviewMentionInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the evaluated criterion
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_POSITIVE_SCORE = "positive_score";
  @SerializedName(SERIALIZED_NAME_POSITIVE_SCORE)
  private Double positiveScore;

  public ReviewMentionInfo positiveScore(Double positiveScore) {
    this.positiveScore = positiveScore;
    return this;
  }

  /**
   * positive score by criterion
   * @return positiveScore
   */
  @javax.annotation.Nullable
  public Double getPositiveScore() {
    return positiveScore;
  }

  public void setPositiveScore(Double positiveScore) {
    this.positiveScore = positiveScore;
  }


  public static final String SERIALIZED_NAME_POSITIVE_COUNT = "positive_count";
  @SerializedName(SERIALIZED_NAME_POSITIVE_COUNT)
  private Long positiveCount;

  public ReviewMentionInfo positiveCount(Long positiveCount) {
    this.positiveCount = positiveCount;
    return this;
  }

  /**
   * count of positive reviews by criterion
   * @return positiveCount
   */
  @javax.annotation.Nullable
  public Long getPositiveCount() {
    return positiveCount;
  }

  public void setPositiveCount(Long positiveCount) {
    this.positiveCount = positiveCount;
  }


  public static final String SERIALIZED_NAME_NEGATIVE_COUNT = "negative_count";
  @SerializedName(SERIALIZED_NAME_NEGATIVE_COUNT)
  private Long negativeCount;

  public ReviewMentionInfo negativeCount(Long negativeCount) {
    this.negativeCount = negativeCount;
    return this;
  }

  /**
   * count of negative reviews by criterion
   * @return negativeCount
   */
  @javax.annotation.Nullable
  public Long getNegativeCount() {
    return negativeCount;
  }

  public void setNegativeCount(Long negativeCount) {
    this.negativeCount = negativeCount;
  }


  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Long totalCount;

  public ReviewMentionInfo totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * count of all reviews by criterion
   * @return totalCount
   */
  @javax.annotation.Nullable
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }


  public static final String SERIALIZED_NAME_VISIBLE_BY_DEFAULT = "visible_by_default";
  @SerializedName(SERIALIZED_NAME_VISIBLE_BY_DEFAULT)
  private Boolean visibleByDefault;

  public ReviewMentionInfo visibleByDefault(Boolean visibleByDefault) {
    this.visibleByDefault = visibleByDefault;
    return this;
  }

  /**
   * element is visible by default
* indicates whether the review element is visible by default
   * @return visibleByDefault
   */
  @javax.annotation.Nullable
  public Boolean getVisibleByDefault() {
    return visibleByDefault;
  }

  public void setVisibleByDefault(Boolean visibleByDefault) {
    this.visibleByDefault = visibleByDefault;
  }



  public ReviewMentionInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public ReviewMentionInfo putAdditionalProperty(String key, Object value) {
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


    
    ReviewMentionInfo reviewMentionInfo = (ReviewMentionInfo) o;
    return

        Objects.equals(this.title, reviewMentionInfo.title) &&
        Objects.equals(this.positiveScore, reviewMentionInfo.positiveScore) &&
        Objects.equals(this.positiveCount, reviewMentionInfo.positiveCount) &&
        Objects.equals(this.negativeCount, reviewMentionInfo.negativeCount) &&
        Objects.equals(this.totalCount, reviewMentionInfo.totalCount) &&
        Objects.equals(this.visibleByDefault, reviewMentionInfo.visibleByDefault);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(title, positiveScore, positiveCount, negativeCount, totalCount, visibleByDefault);
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
    sb.append("class ReviewMentionInfo {\n");

    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    positiveScore: ").append(toIndentedString(positiveScore)).append("\n");
    sb.append("    positiveCount: ").append(toIndentedString(positiveCount)).append("\n");
    sb.append("    negativeCount: ").append(toIndentedString(negativeCount)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    visibleByDefault: ").append(toIndentedString(visibleByDefault)).append("\n");
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
    
    openapiFields.add("title");
    
    openapiFields.add("positive_score");
    
    openapiFields.add("positive_count");
    
    openapiFields.add("negative_count");
    
    openapiFields.add("total_count");
    
    openapiFields.add("visible_by_default");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReviewMentionInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReviewMentionInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReviewMentionInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReviewMentionInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReviewMentionInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ReviewMentionInfo>() {
           @Override
           public void write(JsonWriter out, ReviewMentionInfo value) throws IOException {
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
           public ReviewMentionInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ReviewMentionInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static ReviewMentionInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReviewMentionInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}