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



public class AppendixBusinessDataPriceData  {


  public static final String SERIALIZED_NAME_BUSINESS_LISTINGS = "business_listings";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LISTINGS)
  private AppendixBusinessListingsBusinessDataPriceData businessListings;

  public AppendixBusinessDataPriceData businessListings(AppendixBusinessListingsBusinessDataPriceData businessListings) {
    this.businessListings = businessListings;
    return this;
  }

  /**
   * 
   * @return businessListings
   */
  @javax.annotation.Nullable
  public AppendixBusinessListingsBusinessDataPriceData getBusinessListings() {
    return businessListings;
  }

  public void setBusinessListings(AppendixBusinessListingsBusinessDataPriceData businessListings) {
    this.businessListings = businessListings;
  }


  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private AppendixTaskKeywordsDataPriceDataInfo errors;

  public AppendixBusinessDataPriceData errors(AppendixTaskKeywordsDataPriceDataInfo errors) {
    this.errors = errors;
    return this;
  }

  /**
   * 
   * @return errors
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getErrors() {
    return errors;
  }

  public void setErrors(AppendixTaskKeywordsDataPriceDataInfo errors) {
    this.errors = errors;
  }


  public static final String SERIALIZED_NAME_GOOGLE = "google";
  @SerializedName(SERIALIZED_NAME_GOOGLE)
  private AppendixGoogleBusinessDataPriceData google;

  public AppendixBusinessDataPriceData google(AppendixGoogleBusinessDataPriceData google) {
    this.google = google;
    return this;
  }

  /**
   * 
   * @return google
   */
  @javax.annotation.Nullable
  public AppendixGoogleBusinessDataPriceData getGoogle() {
    return google;
  }

  public void setGoogle(AppendixGoogleBusinessDataPriceData google) {
    this.google = google;
  }


  public static final String SERIALIZED_NAME_SOCIAL_MEDIA = "social_media";
  @SerializedName(SERIALIZED_NAME_SOCIAL_MEDIA)
  private AppendixSocialMediaBusinessDataPriceData socialMedia;

  public AppendixBusinessDataPriceData socialMedia(AppendixSocialMediaBusinessDataPriceData socialMedia) {
    this.socialMedia = socialMedia;
    return this;
  }

  /**
   * 
   * @return socialMedia
   */
  @javax.annotation.Nullable
  public AppendixSocialMediaBusinessDataPriceData getSocialMedia() {
    return socialMedia;
  }

  public void setSocialMedia(AppendixSocialMediaBusinessDataPriceData socialMedia) {
    this.socialMedia = socialMedia;
  }


  public static final String SERIALIZED_NAME_LANGUAGES = "languages";
  @SerializedName(SERIALIZED_NAME_LANGUAGES)
  private AppendixTaskKeywordsDataPriceDataInfo languages;

  public AppendixBusinessDataPriceData languages(AppendixTaskKeywordsDataPriceDataInfo languages) {
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

  public AppendixBusinessDataPriceData locations(AppendixTaskKeywordsDataPriceDataInfo locations) {
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


  public static final String SERIALIZED_NAME_TRIPADVISOR = "tripadvisor";
  @SerializedName(SERIALIZED_NAME_TRIPADVISOR)
  private AppendixTrBusinessDataPriceDataInfo tripadvisor;

  public AppendixBusinessDataPriceData tripadvisor(AppendixTrBusinessDataPriceDataInfo tripadvisor) {
    this.tripadvisor = tripadvisor;
    return this;
  }

  /**
   * 
   * @return tripadvisor
   */
  @javax.annotation.Nullable
  public AppendixTrBusinessDataPriceDataInfo getTripadvisor() {
    return tripadvisor;
  }

  public void setTripadvisor(AppendixTrBusinessDataPriceDataInfo tripadvisor) {
    this.tripadvisor = tripadvisor;
  }


  public static final String SERIALIZED_NAME_TRUSTPILOT = "trustpilot";
  @SerializedName(SERIALIZED_NAME_TRUSTPILOT)
  private AppendixTrBusinessDataPriceDataInfo trustpilot;

  public AppendixBusinessDataPriceData trustpilot(AppendixTrBusinessDataPriceDataInfo trustpilot) {
    this.trustpilot = trustpilot;
    return this;
  }

  /**
   * 
   * @return trustpilot
   */
  @javax.annotation.Nullable
  public AppendixTrBusinessDataPriceDataInfo getTrustpilot() {
    return trustpilot;
  }

  public void setTrustpilot(AppendixTrBusinessDataPriceDataInfo trustpilot) {
    this.trustpilot = trustpilot;
  }


  public static final String SERIALIZED_NAME_YELP = "yelp";
  @SerializedName(SERIALIZED_NAME_YELP)
  private AppendixTrBusinessDataPriceDataInfo yelp;

  public AppendixBusinessDataPriceData yelp(AppendixTrBusinessDataPriceDataInfo yelp) {
    this.yelp = yelp;
    return this;
  }

  /**
   * 
   * @return yelp
   */
  @javax.annotation.Nullable
  public AppendixTrBusinessDataPriceDataInfo getYelp() {
    return yelp;
  }

  public void setYelp(AppendixTrBusinessDataPriceDataInfo yelp) {
    this.yelp = yelp;
  }


  public static final String SERIALIZED_NAME_TASKS_READY = "tasks_ready";
  @SerializedName(SERIALIZED_NAME_TASKS_READY)
  private AppendixTaskKeywordsDataPriceDataInfo tasksReady;

  public AppendixBusinessDataPriceData tasksReady(AppendixTaskKeywordsDataPriceDataInfo tasksReady) {
    this.tasksReady = tasksReady;
    return this;
  }

  /**
   * 
   * @return tasksReady
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getTasksReady() {
    return tasksReady;
  }

  public void setTasksReady(AppendixTaskKeywordsDataPriceDataInfo tasksReady) {
    this.tasksReady = tasksReady;
  }



  public AppendixBusinessDataPriceData() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixBusinessDataPriceData putAdditionalProperty(String key, Object value) {
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


    
    AppendixBusinessDataPriceData appendixBusinessDataPriceData = (AppendixBusinessDataPriceData) o;
    return

        Objects.equals(this.businessListings, appendixBusinessDataPriceData.businessListings) &&
        Objects.equals(this.errors, appendixBusinessDataPriceData.errors) &&
        Objects.equals(this.google, appendixBusinessDataPriceData.google) &&
        Objects.equals(this.socialMedia, appendixBusinessDataPriceData.socialMedia) &&
        Objects.equals(this.languages, appendixBusinessDataPriceData.languages) &&
        Objects.equals(this.locations, appendixBusinessDataPriceData.locations) &&
        Objects.equals(this.tripadvisor, appendixBusinessDataPriceData.tripadvisor) &&
        Objects.equals(this.trustpilot, appendixBusinessDataPriceData.trustpilot) &&
        Objects.equals(this.yelp, appendixBusinessDataPriceData.yelp) &&
        Objects.equals(this.tasksReady, appendixBusinessDataPriceData.tasksReady);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(businessListings, errors, google, socialMedia, languages, locations, tripadvisor, trustpilot, yelp, tasksReady);
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
    sb.append("class AppendixBusinessDataPriceData {\n");

    sb.append("    businessListings: ").append(toIndentedString(businessListings)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    google: ").append(toIndentedString(google)).append("\n");
    sb.append("    socialMedia: ").append(toIndentedString(socialMedia)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    tripadvisor: ").append(toIndentedString(tripadvisor)).append("\n");
    sb.append("    trustpilot: ").append(toIndentedString(trustpilot)).append("\n");
    sb.append("    yelp: ").append(toIndentedString(yelp)).append("\n");
    sb.append("    tasksReady: ").append(toIndentedString(tasksReady)).append("\n");
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
    
    openapiFields.add("business_listings");
    
    openapiFields.add("errors");
    
    openapiFields.add("google");
    
    openapiFields.add("social_media");
    
    openapiFields.add("languages");
    
    openapiFields.add("locations");
    
    openapiFields.add("tripadvisor");
    
    openapiFields.add("trustpilot");
    
    openapiFields.add("yelp");
    
    openapiFields.add("tasks_ready");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixBusinessDataPriceData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixBusinessDataPriceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixBusinessDataPriceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixBusinessDataPriceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixBusinessDataPriceData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixBusinessDataPriceData>() {
           @Override
           public void write(JsonWriter out, AppendixBusinessDataPriceData value) throws IOException {
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
           public AppendixBusinessDataPriceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixBusinessDataPriceData instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixBusinessDataPriceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixBusinessDataPriceData.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}