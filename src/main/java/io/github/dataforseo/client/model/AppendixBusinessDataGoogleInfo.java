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



public class AppendixBusinessDataGoogleInfo  {


  public static final String SERIALIZED_NAME_MY_BUSINESS_INFO = "my_business_info";
  @SerializedName(SERIALIZED_NAME_MY_BUSINESS_INFO)
  private AppendixInfo myBusinessInfo;

  public AppendixBusinessDataGoogleInfo myBusinessInfo(AppendixInfo myBusinessInfo) {
    this.myBusinessInfo = myBusinessInfo;
    return this;
  }

  /**
   * 
   * @return myBusinessInfo
   */
  @javax.annotation.Nullable
  public AppendixInfo getMyBusinessInfo() {
    return myBusinessInfo;
  }

  public void setMyBusinessInfo(AppendixInfo myBusinessInfo) {
    this.myBusinessInfo = myBusinessInfo;
  }


  public static final String SERIALIZED_NAME_MY_BUSINESS_UPDATES = "my_business_updates";
  @SerializedName(SERIALIZED_NAME_MY_BUSINESS_UPDATES)
  private AppendixInfo myBusinessUpdates;

  public AppendixBusinessDataGoogleInfo myBusinessUpdates(AppendixInfo myBusinessUpdates) {
    this.myBusinessUpdates = myBusinessUpdates;
    return this;
  }

  /**
   * 
   * @return myBusinessUpdates
   */
  @javax.annotation.Nullable
  public AppendixInfo getMyBusinessUpdates() {
    return myBusinessUpdates;
  }

  public void setMyBusinessUpdates(AppendixInfo myBusinessUpdates) {
    this.myBusinessUpdates = myBusinessUpdates;
  }


  public static final String SERIALIZED_NAME_HOTEL_INFO = "hotel_info";
  @SerializedName(SERIALIZED_NAME_HOTEL_INFO)
  private AppendixSerpDaysRatesDataInfo hotelInfo;

  public AppendixBusinessDataGoogleInfo hotelInfo(AppendixSerpDaysRatesDataInfo hotelInfo) {
    this.hotelInfo = hotelInfo;
    return this;
  }

  /**
   * 
   * @return hotelInfo
   */
  @javax.annotation.Nullable
  public AppendixSerpDaysRatesDataInfo getHotelInfo() {
    return hotelInfo;
  }

  public void setHotelInfo(AppendixSerpDaysRatesDataInfo hotelInfo) {
    this.hotelInfo = hotelInfo;
  }


  public static final String SERIALIZED_NAME_HOTEL_SEARCHES = "hotel_searches";
  @SerializedName(SERIALIZED_NAME_HOTEL_SEARCHES)
  private AppendixInfo hotelSearches;

  public AppendixBusinessDataGoogleInfo hotelSearches(AppendixInfo hotelSearches) {
    this.hotelSearches = hotelSearches;
    return this;
  }

  /**
   * 
   * @return hotelSearches
   */
  @javax.annotation.Nullable
  public AppendixInfo getHotelSearches() {
    return hotelSearches;
  }

  public void setHotelSearches(AppendixInfo hotelSearches) {
    this.hotelSearches = hotelSearches;
  }


  public static final String SERIALIZED_NAME_REVIEWS = "reviews";
  @SerializedName(SERIALIZED_NAME_REVIEWS)
  private AppendixInfo reviews;

  public AppendixBusinessDataGoogleInfo reviews(AppendixInfo reviews) {
    this.reviews = reviews;
    return this;
  }

  /**
   * 
   * @return reviews
   */
  @javax.annotation.Nullable
  public AppendixInfo getReviews() {
    return reviews;
  }

  public void setReviews(AppendixInfo reviews) {
    this.reviews = reviews;
  }


  public static final String SERIALIZED_NAME_QUESTIONS_AND_ANSWERS = "questions_and_answers";
  @SerializedName(SERIALIZED_NAME_QUESTIONS_AND_ANSWERS)
  private AppendixInfo questionsAndAnswers;

  public AppendixBusinessDataGoogleInfo questionsAndAnswers(AppendixInfo questionsAndAnswers) {
    this.questionsAndAnswers = questionsAndAnswers;
    return this;
  }

  /**
   * 
   * @return questionsAndAnswers
   */
  @javax.annotation.Nullable
  public AppendixInfo getQuestionsAndAnswers() {
    return questionsAndAnswers;
  }

  public void setQuestionsAndAnswers(AppendixInfo questionsAndAnswers) {
    this.questionsAndAnswers = questionsAndAnswers;
  }


  public static final String SERIALIZED_NAME_EXTENDED_REVIEWS = "extended_reviews";
  @SerializedName(SERIALIZED_NAME_EXTENDED_REVIEWS)
  private AppendixInfo extendedReviews;

  public AppendixBusinessDataGoogleInfo extendedReviews(AppendixInfo extendedReviews) {
    this.extendedReviews = extendedReviews;
    return this;
  }

  /**
   * 
   * @return extendedReviews
   */
  @javax.annotation.Nullable
  public AppendixInfo getExtendedReviews() {
    return extendedReviews;
  }

  public void setExtendedReviews(AppendixInfo extendedReviews) {
    this.extendedReviews = extendedReviews;
  }



  public AppendixBusinessDataGoogleInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixBusinessDataGoogleInfo putAdditionalProperty(String key, Object value) {
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


    
    AppendixBusinessDataGoogleInfo appendixBusinessDataGoogleInfo = (AppendixBusinessDataGoogleInfo) o;
    return

        Objects.equals(this.myBusinessInfo, appendixBusinessDataGoogleInfo.myBusinessInfo) &&
        Objects.equals(this.myBusinessUpdates, appendixBusinessDataGoogleInfo.myBusinessUpdates) &&
        Objects.equals(this.hotelInfo, appendixBusinessDataGoogleInfo.hotelInfo) &&
        Objects.equals(this.hotelSearches, appendixBusinessDataGoogleInfo.hotelSearches) &&
        Objects.equals(this.reviews, appendixBusinessDataGoogleInfo.reviews) &&
        Objects.equals(this.questionsAndAnswers, appendixBusinessDataGoogleInfo.questionsAndAnswers) &&
        Objects.equals(this.extendedReviews, appendixBusinessDataGoogleInfo.extendedReviews);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(myBusinessInfo, myBusinessUpdates, hotelInfo, hotelSearches, reviews, questionsAndAnswers, extendedReviews);
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
    sb.append("class AppendixBusinessDataGoogleInfo {\n");

    sb.append("    myBusinessInfo: ").append(toIndentedString(myBusinessInfo)).append("\n");
    sb.append("    myBusinessUpdates: ").append(toIndentedString(myBusinessUpdates)).append("\n");
    sb.append("    hotelInfo: ").append(toIndentedString(hotelInfo)).append("\n");
    sb.append("    hotelSearches: ").append(toIndentedString(hotelSearches)).append("\n");
    sb.append("    reviews: ").append(toIndentedString(reviews)).append("\n");
    sb.append("    questionsAndAnswers: ").append(toIndentedString(questionsAndAnswers)).append("\n");
    sb.append("    extendedReviews: ").append(toIndentedString(extendedReviews)).append("\n");
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
    
    openapiFields.add("my_business_info");
    
    openapiFields.add("my_business_updates");
    
    openapiFields.add("hotel_info");
    
    openapiFields.add("hotel_searches");
    
    openapiFields.add("reviews");
    
    openapiFields.add("questions_and_answers");
    
    openapiFields.add("extended_reviews");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixBusinessDataGoogleInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixBusinessDataGoogleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixBusinessDataGoogleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixBusinessDataGoogleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixBusinessDataGoogleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixBusinessDataGoogleInfo>() {
           @Override
           public void write(JsonWriter out, AppendixBusinessDataGoogleInfo value) throws IOException {
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
           public AppendixBusinessDataGoogleInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixBusinessDataGoogleInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixBusinessDataGoogleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixBusinessDataGoogleInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}