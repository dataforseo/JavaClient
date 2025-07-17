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



public class SentimentConnotationDistribution  {


  public static final String SERIALIZED_NAME_ANGER = "anger";
  @SerializedName(SERIALIZED_NAME_ANGER)
  private ContentAnalysisSummaryInfo anger;

  public SentimentConnotationDistribution anger(ContentAnalysisSummaryInfo anger) {
    this.anger = anger;
    return this;
  }

  /**
   * 
   * @return anger
   */
  @javax.annotation.Nullable
  public ContentAnalysisSummaryInfo getAnger() {
    return anger;
  }

  public void setAnger(ContentAnalysisSummaryInfo anger) {
    this.anger = anger;
  }


  public static final String SERIALIZED_NAME_HAPPINESS = "happiness";
  @SerializedName(SERIALIZED_NAME_HAPPINESS)
  private ContentAnalysisSummaryInfo happiness;

  public SentimentConnotationDistribution happiness(ContentAnalysisSummaryInfo happiness) {
    this.happiness = happiness;
    return this;
  }

  /**
   * 
   * @return happiness
   */
  @javax.annotation.Nullable
  public ContentAnalysisSummaryInfo getHappiness() {
    return happiness;
  }

  public void setHappiness(ContentAnalysisSummaryInfo happiness) {
    this.happiness = happiness;
  }


  public static final String SERIALIZED_NAME_LOVE = "love";
  @SerializedName(SERIALIZED_NAME_LOVE)
  private ContentAnalysisSummaryInfo love;

  public SentimentConnotationDistribution love(ContentAnalysisSummaryInfo love) {
    this.love = love;
    return this;
  }

  /**
   * 
   * @return love
   */
  @javax.annotation.Nullable
  public ContentAnalysisSummaryInfo getLove() {
    return love;
  }

  public void setLove(ContentAnalysisSummaryInfo love) {
    this.love = love;
  }


  public static final String SERIALIZED_NAME_SADNESS = "sadness";
  @SerializedName(SERIALIZED_NAME_SADNESS)
  private ContentAnalysisSummaryInfo sadness;

  public SentimentConnotationDistribution sadness(ContentAnalysisSummaryInfo sadness) {
    this.sadness = sadness;
    return this;
  }

  /**
   * 
   * @return sadness
   */
  @javax.annotation.Nullable
  public ContentAnalysisSummaryInfo getSadness() {
    return sadness;
  }

  public void setSadness(ContentAnalysisSummaryInfo sadness) {
    this.sadness = sadness;
  }


  public static final String SERIALIZED_NAME_SHARE = "share";
  @SerializedName(SERIALIZED_NAME_SHARE)
  private ContentAnalysisSummaryInfo share;

  public SentimentConnotationDistribution share(ContentAnalysisSummaryInfo share) {
    this.share = share;
    return this;
  }

  /**
   * 
   * @return share
   */
  @javax.annotation.Nullable
  public ContentAnalysisSummaryInfo getShare() {
    return share;
  }

  public void setShare(ContentAnalysisSummaryInfo share) {
    this.share = share;
  }


  public static final String SERIALIZED_NAME_FUN = "fun";
  @SerializedName(SERIALIZED_NAME_FUN)
  private ContentAnalysisSummaryInfo fun;

  public SentimentConnotationDistribution fun(ContentAnalysisSummaryInfo fun) {
    this.fun = fun;
    return this;
  }

  /**
   * 
   * @return fun
   */
  @javax.annotation.Nullable
  public ContentAnalysisSummaryInfo getFun() {
    return fun;
  }

  public void setFun(ContentAnalysisSummaryInfo fun) {
    this.fun = fun;
  }



  public SentimentConnotationDistribution() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SentimentConnotationDistribution putAdditionalProperty(String key, Object value) {
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


    
    SentimentConnotationDistribution sentimentConnotationDistribution = (SentimentConnotationDistribution) o;
    return

        Objects.equals(this.anger, sentimentConnotationDistribution.anger) &&
        Objects.equals(this.happiness, sentimentConnotationDistribution.happiness) &&
        Objects.equals(this.love, sentimentConnotationDistribution.love) &&
        Objects.equals(this.sadness, sentimentConnotationDistribution.sadness) &&
        Objects.equals(this.share, sentimentConnotationDistribution.share) &&
        Objects.equals(this.fun, sentimentConnotationDistribution.fun);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(anger, happiness, love, sadness, share, fun);
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
    sb.append("class SentimentConnotationDistribution {\n");

    sb.append("    anger: ").append(toIndentedString(anger)).append("\n");
    sb.append("    happiness: ").append(toIndentedString(happiness)).append("\n");
    sb.append("    love: ").append(toIndentedString(love)).append("\n");
    sb.append("    sadness: ").append(toIndentedString(sadness)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    fun: ").append(toIndentedString(fun)).append("\n");
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
    
    openapiFields.add("anger");
    
    openapiFields.add("happiness");
    
    openapiFields.add("love");
    
    openapiFields.add("sadness");
    
    openapiFields.add("share");
    
    openapiFields.add("fun");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SentimentConnotationDistribution
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SentimentConnotationDistribution.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SentimentConnotationDistribution' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SentimentConnotationDistribution> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SentimentConnotationDistribution.class));

       return (TypeAdapter<T>) new TypeAdapter<SentimentConnotationDistribution>() {
           @Override
           public void write(JsonWriter out, SentimentConnotationDistribution value) throws IOException {
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
           public SentimentConnotationDistribution read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SentimentConnotationDistribution instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SentimentConnotationDistribution fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SentimentConnotationDistribution.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}