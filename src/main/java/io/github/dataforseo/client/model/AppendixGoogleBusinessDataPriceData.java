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



public class AppendixGoogleBusinessDataPriceData  {


  public static final String SERIALIZED_NAME_EXTENDED_REVIEWS = "extended_reviews";
  @SerializedName(SERIALIZED_NAME_EXTENDED_REVIEWS)
  private AppendixAKeywordsDataPriceDataInfo extendedReviews;

  public AppendixGoogleBusinessDataPriceData extendedReviews(AppendixAKeywordsDataPriceDataInfo extendedReviews) {
    this.extendedReviews = extendedReviews;
    return this;
  }

  /**
   * 
   * @return extendedReviews
   */
  @javax.annotation.Nullable
  public AppendixAKeywordsDataPriceDataInfo getExtendedReviews() {
    return extendedReviews;
  }

  public void setExtendedReviews(AppendixAKeywordsDataPriceDataInfo extendedReviews) {
    this.extendedReviews = extendedReviews;
  }


  public static final String SERIALIZED_NAME_HOTEL_INFO = "hotel_info";
  @SerializedName(SERIALIZED_NAME_HOTEL_INFO)
  private AppendixHotelInfoGoogleBusinessDataPriceData hotelInfo;

  public AppendixGoogleBusinessDataPriceData hotelInfo(AppendixHotelInfoGoogleBusinessDataPriceData hotelInfo) {
    this.hotelInfo = hotelInfo;
    return this;
  }

  /**
   * 
   * @return hotelInfo
   */
  @javax.annotation.Nullable
  public AppendixHotelInfoGoogleBusinessDataPriceData getHotelInfo() {
    return hotelInfo;
  }

  public void setHotelInfo(AppendixHotelInfoGoogleBusinessDataPriceData hotelInfo) {
    this.hotelInfo = hotelInfo;
  }


  public static final String SERIALIZED_NAME_HOTEL_SEARCHES = "hotel_searches";
  @SerializedName(SERIALIZED_NAME_HOTEL_SEARCHES)
  private AppendixGoogleBusinessDataPriceDataInfo hotelSearches;

  public AppendixGoogleBusinessDataPriceData hotelSearches(AppendixGoogleBusinessDataPriceDataInfo hotelSearches) {
    this.hotelSearches = hotelSearches;
    return this;
  }

  /**
   * 
   * @return hotelSearches
   */
  @javax.annotation.Nullable
  public AppendixGoogleBusinessDataPriceDataInfo getHotelSearches() {
    return hotelSearches;
  }

  public void setHotelSearches(AppendixGoogleBusinessDataPriceDataInfo hotelSearches) {
    this.hotelSearches = hotelSearches;
  }


  public static final String SERIALIZED_NAME_MY_BUSINESS_INFO = "my_business_info";
  @SerializedName(SERIALIZED_NAME_MY_BUSINESS_INFO)
  private AppendixGoogleBusinessDataPriceDataInfo myBusinessInfo;

  public AppendixGoogleBusinessDataPriceData myBusinessInfo(AppendixGoogleBusinessDataPriceDataInfo myBusinessInfo) {
    this.myBusinessInfo = myBusinessInfo;
    return this;
  }

  /**
   * 
   * @return myBusinessInfo
   */
  @javax.annotation.Nullable
  public AppendixGoogleBusinessDataPriceDataInfo getMyBusinessInfo() {
    return myBusinessInfo;
  }

  public void setMyBusinessInfo(AppendixGoogleBusinessDataPriceDataInfo myBusinessInfo) {
    this.myBusinessInfo = myBusinessInfo;
  }


  public static final String SERIALIZED_NAME_MY_BUSINESS_UPDATES = "my_business_updates";
  @SerializedName(SERIALIZED_NAME_MY_BUSINESS_UPDATES)
  private AppendixGoogleBusinessDataPriceDataInfo myBusinessUpdates;

  public AppendixGoogleBusinessDataPriceData myBusinessUpdates(AppendixGoogleBusinessDataPriceDataInfo myBusinessUpdates) {
    this.myBusinessUpdates = myBusinessUpdates;
    return this;
  }

  /**
   * 
   * @return myBusinessUpdates
   */
  @javax.annotation.Nullable
  public AppendixGoogleBusinessDataPriceDataInfo getMyBusinessUpdates() {
    return myBusinessUpdates;
  }

  public void setMyBusinessUpdates(AppendixGoogleBusinessDataPriceDataInfo myBusinessUpdates) {
    this.myBusinessUpdates = myBusinessUpdates;
  }


  public static final String SERIALIZED_NAME_QUESTIONS_AND_ANSWERS = "questions_and_answers";
  @SerializedName(SERIALIZED_NAME_QUESTIONS_AND_ANSWERS)
  private AppendixGoogleBusinessDataPriceDataInfo questionsAndAnswers;

  public AppendixGoogleBusinessDataPriceData questionsAndAnswers(AppendixGoogleBusinessDataPriceDataInfo questionsAndAnswers) {
    this.questionsAndAnswers = questionsAndAnswers;
    return this;
  }

  /**
   * 
   * @return questionsAndAnswers
   */
  @javax.annotation.Nullable
  public AppendixGoogleBusinessDataPriceDataInfo getQuestionsAndAnswers() {
    return questionsAndAnswers;
  }

  public void setQuestionsAndAnswers(AppendixGoogleBusinessDataPriceDataInfo questionsAndAnswers) {
    this.questionsAndAnswers = questionsAndAnswers;
  }


  public static final String SERIALIZED_NAME_REVIEWS = "reviews";
  @SerializedName(SERIALIZED_NAME_REVIEWS)
  private AppendixGoogleBusinessDataPriceDataInfo reviews;

  public AppendixGoogleBusinessDataPriceData reviews(AppendixGoogleBusinessDataPriceDataInfo reviews) {
    this.reviews = reviews;
    return this;
  }

  /**
   * 
   * @return reviews
   */
  @javax.annotation.Nullable
  public AppendixGoogleBusinessDataPriceDataInfo getReviews() {
    return reviews;
  }

  public void setReviews(AppendixGoogleBusinessDataPriceDataInfo reviews) {
    this.reviews = reviews;
  }



  public AppendixGoogleBusinessDataPriceData() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixGoogleBusinessDataPriceData putAdditionalProperty(String key, Object value) {
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


    
    AppendixGoogleBusinessDataPriceData appendixGoogleBusinessDataPriceData = (AppendixGoogleBusinessDataPriceData) o;
    return

        Objects.equals(this.extendedReviews, appendixGoogleBusinessDataPriceData.extendedReviews) &&
        Objects.equals(this.hotelInfo, appendixGoogleBusinessDataPriceData.hotelInfo) &&
        Objects.equals(this.hotelSearches, appendixGoogleBusinessDataPriceData.hotelSearches) &&
        Objects.equals(this.myBusinessInfo, appendixGoogleBusinessDataPriceData.myBusinessInfo) &&
        Objects.equals(this.myBusinessUpdates, appendixGoogleBusinessDataPriceData.myBusinessUpdates) &&
        Objects.equals(this.questionsAndAnswers, appendixGoogleBusinessDataPriceData.questionsAndAnswers) &&
        Objects.equals(this.reviews, appendixGoogleBusinessDataPriceData.reviews);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(extendedReviews, hotelInfo, hotelSearches, myBusinessInfo, myBusinessUpdates, questionsAndAnswers, reviews);
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
    sb.append("class AppendixGoogleBusinessDataPriceData {\n");

    sb.append("    extendedReviews: ").append(toIndentedString(extendedReviews)).append("\n");
    sb.append("    hotelInfo: ").append(toIndentedString(hotelInfo)).append("\n");
    sb.append("    hotelSearches: ").append(toIndentedString(hotelSearches)).append("\n");
    sb.append("    myBusinessInfo: ").append(toIndentedString(myBusinessInfo)).append("\n");
    sb.append("    myBusinessUpdates: ").append(toIndentedString(myBusinessUpdates)).append("\n");
    sb.append("    questionsAndAnswers: ").append(toIndentedString(questionsAndAnswers)).append("\n");
    sb.append("    reviews: ").append(toIndentedString(reviews)).append("\n");
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
    
    openapiFields.add("extended_reviews");
    
    openapiFields.add("hotel_info");
    
    openapiFields.add("hotel_searches");
    
    openapiFields.add("my_business_info");
    
    openapiFields.add("my_business_updates");
    
    openapiFields.add("questions_and_answers");
    
    openapiFields.add("reviews");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixGoogleBusinessDataPriceData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixGoogleBusinessDataPriceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixGoogleBusinessDataPriceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixGoogleBusinessDataPriceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixGoogleBusinessDataPriceData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixGoogleBusinessDataPriceData>() {
           @Override
           public void write(JsonWriter out, AppendixGoogleBusinessDataPriceData value) throws IOException {
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
           public AppendixGoogleBusinessDataPriceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixGoogleBusinessDataPriceData instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixGoogleBusinessDataPriceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixGoogleBusinessDataPriceData.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}