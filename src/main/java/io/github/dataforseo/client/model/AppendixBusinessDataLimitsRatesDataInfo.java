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



public class AppendixBusinessDataLimitsRatesDataInfo  {


  public static final String SERIALIZED_NAME_GOOGLE = "google";
  @SerializedName(SERIALIZED_NAME_GOOGLE)
  private AppendixBusinessDataGoogleInfo google;

  public AppendixBusinessDataLimitsRatesDataInfo google(AppendixBusinessDataGoogleInfo google) {
    this.google = google;
    return this;
  }

  /**
   * 
   * @return google
   */
  @javax.annotation.Nullable
  public AppendixBusinessDataGoogleInfo getGoogle() {
    return google;
  }

  public void setGoogle(AppendixBusinessDataGoogleInfo google) {
    this.google = google;
  }


  public static final String SERIALIZED_NAME_LOCATIONS = "locations";
  @SerializedName(SERIALIZED_NAME_LOCATIONS)
  private Double locations;

  public AppendixBusinessDataLimitsRatesDataInfo locations(Double locations) {
    this.locations = locations;
    return this;
  }

  /**
   * 
   * @return locations
   */
  @javax.annotation.Nullable
  public Double getLocations() {
    return locations;
  }

  public void setLocations(Double locations) {
    this.locations = locations;
  }


  public static final String SERIALIZED_NAME_LANGUAGES = "languages";
  @SerializedName(SERIALIZED_NAME_LANGUAGES)
  private Double languages;

  public AppendixBusinessDataLimitsRatesDataInfo languages(Double languages) {
    this.languages = languages;
    return this;
  }

  /**
   * 
   * @return languages
   */
  @javax.annotation.Nullable
  public Double getLanguages() {
    return languages;
  }

  public void setLanguages(Double languages) {
    this.languages = languages;
  }


  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Double errors;

  public AppendixBusinessDataLimitsRatesDataInfo errors(Double errors) {
    this.errors = errors;
    return this;
  }

  /**
   * 
   * @return errors
   */
  @javax.annotation.Nullable
  public Double getErrors() {
    return errors;
  }

  public void setErrors(Double errors) {
    this.errors = errors;
  }


  public static final String SERIALIZED_NAME_YELP = "yelp";
  @SerializedName(SERIALIZED_NAME_YELP)
  private AppendixBusinessDataDayLimitsRatesDataInfo yelp;

  public AppendixBusinessDataLimitsRatesDataInfo yelp(AppendixBusinessDataDayLimitsRatesDataInfo yelp) {
    this.yelp = yelp;
    return this;
  }

  /**
   * 
   * @return yelp
   */
  @javax.annotation.Nullable
  public AppendixBusinessDataDayLimitsRatesDataInfo getYelp() {
    return yelp;
  }

  public void setYelp(AppendixBusinessDataDayLimitsRatesDataInfo yelp) {
    this.yelp = yelp;
  }


  public static final String SERIALIZED_NAME_SOCIAL_MEDIA = "social_media";
  @SerializedName(SERIALIZED_NAME_SOCIAL_MEDIA)
  private AppendixSocialMediaBusinessDataLimitsRatesDataInfo socialMedia;

  public AppendixBusinessDataLimitsRatesDataInfo socialMedia(AppendixSocialMediaBusinessDataLimitsRatesDataInfo socialMedia) {
    this.socialMedia = socialMedia;
    return this;
  }

  /**
   * 
   * @return socialMedia
   */
  @javax.annotation.Nullable
  public AppendixSocialMediaBusinessDataLimitsRatesDataInfo getSocialMedia() {
    return socialMedia;
  }

  public void setSocialMedia(AppendixSocialMediaBusinessDataLimitsRatesDataInfo socialMedia) {
    this.socialMedia = socialMedia;
  }


  public static final String SERIALIZED_NAME_TRIPADVISOR = "tripadvisor";
  @SerializedName(SERIALIZED_NAME_TRIPADVISOR)
  private AppendixBusinessDataDayLimitsRatesDataInfo tripadvisor;

  public AppendixBusinessDataLimitsRatesDataInfo tripadvisor(AppendixBusinessDataDayLimitsRatesDataInfo tripadvisor) {
    this.tripadvisor = tripadvisor;
    return this;
  }

  /**
   * 
   * @return tripadvisor
   */
  @javax.annotation.Nullable
  public AppendixBusinessDataDayLimitsRatesDataInfo getTripadvisor() {
    return tripadvisor;
  }

  public void setTripadvisor(AppendixBusinessDataDayLimitsRatesDataInfo tripadvisor) {
    this.tripadvisor = tripadvisor;
  }


  public static final String SERIALIZED_NAME_TRUSTPILOT = "trustpilot";
  @SerializedName(SERIALIZED_NAME_TRUSTPILOT)
  private AppendixBusinessDataDayLimitsRatesDataInfo trustpilot;

  public AppendixBusinessDataLimitsRatesDataInfo trustpilot(AppendixBusinessDataDayLimitsRatesDataInfo trustpilot) {
    this.trustpilot = trustpilot;
    return this;
  }

  /**
   * 
   * @return trustpilot
   */
  @javax.annotation.Nullable
  public AppendixBusinessDataDayLimitsRatesDataInfo getTrustpilot() {
    return trustpilot;
  }

  public void setTrustpilot(AppendixBusinessDataDayLimitsRatesDataInfo trustpilot) {
    this.trustpilot = trustpilot;
  }


  public static final String SERIALIZED_NAME_BUSINESS_LISTINGS = "business_listings";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LISTINGS)
  private AppendixBusinessListingsBusinessDataLimitsRatesDataInfo businessListings;

  public AppendixBusinessDataLimitsRatesDataInfo businessListings(AppendixBusinessListingsBusinessDataLimitsRatesDataInfo businessListings) {
    this.businessListings = businessListings;
    return this;
  }

  /**
   * 
   * @return businessListings
   */
  @javax.annotation.Nullable
  public AppendixBusinessListingsBusinessDataLimitsRatesDataInfo getBusinessListings() {
    return businessListings;
  }

  public void setBusinessListings(AppendixBusinessListingsBusinessDataLimitsRatesDataInfo businessListings) {
    this.businessListings = businessListings;
  }


  public static final String SERIALIZED_NAME_TASKS_READY = "tasks_ready";
  @SerializedName(SERIALIZED_NAME_TASKS_READY)
  private Double tasksReady;

  public AppendixBusinessDataLimitsRatesDataInfo tasksReady(Double tasksReady) {
    this.tasksReady = tasksReady;
    return this;
  }

  /**
   * 
   * @return tasksReady
   */
  @javax.annotation.Nullable
  public Double getTasksReady() {
    return tasksReady;
  }

  public void setTasksReady(Double tasksReady) {
    this.tasksReady = tasksReady;
  }



  public AppendixBusinessDataLimitsRatesDataInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixBusinessDataLimitsRatesDataInfo putAdditionalProperty(String key, Object value) {
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


    
    AppendixBusinessDataLimitsRatesDataInfo appendixBusinessDataLimitsRatesDataInfo = (AppendixBusinessDataLimitsRatesDataInfo) o;
    return

        Objects.equals(this.google, appendixBusinessDataLimitsRatesDataInfo.google) &&
        Objects.equals(this.locations, appendixBusinessDataLimitsRatesDataInfo.locations) &&
        Objects.equals(this.languages, appendixBusinessDataLimitsRatesDataInfo.languages) &&
        Objects.equals(this.errors, appendixBusinessDataLimitsRatesDataInfo.errors) &&
        Objects.equals(this.yelp, appendixBusinessDataLimitsRatesDataInfo.yelp) &&
        Objects.equals(this.socialMedia, appendixBusinessDataLimitsRatesDataInfo.socialMedia) &&
        Objects.equals(this.tripadvisor, appendixBusinessDataLimitsRatesDataInfo.tripadvisor) &&
        Objects.equals(this.trustpilot, appendixBusinessDataLimitsRatesDataInfo.trustpilot) &&
        Objects.equals(this.businessListings, appendixBusinessDataLimitsRatesDataInfo.businessListings) &&
        Objects.equals(this.tasksReady, appendixBusinessDataLimitsRatesDataInfo.tasksReady);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(google, locations, languages, errors, yelp, socialMedia, tripadvisor, trustpilot, businessListings, tasksReady);
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
    sb.append("class AppendixBusinessDataLimitsRatesDataInfo {\n");

    sb.append("    google: ").append(toIndentedString(google)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    yelp: ").append(toIndentedString(yelp)).append("\n");
    sb.append("    socialMedia: ").append(toIndentedString(socialMedia)).append("\n");
    sb.append("    tripadvisor: ").append(toIndentedString(tripadvisor)).append("\n");
    sb.append("    trustpilot: ").append(toIndentedString(trustpilot)).append("\n");
    sb.append("    businessListings: ").append(toIndentedString(businessListings)).append("\n");
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
    
    openapiFields.add("google");
    
    openapiFields.add("locations");
    
    openapiFields.add("languages");
    
    openapiFields.add("errors");
    
    openapiFields.add("yelp");
    
    openapiFields.add("social_media");
    
    openapiFields.add("tripadvisor");
    
    openapiFields.add("trustpilot");
    
    openapiFields.add("business_listings");
    
    openapiFields.add("tasks_ready");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixBusinessDataLimitsRatesDataInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixBusinessDataLimitsRatesDataInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixBusinessDataLimitsRatesDataInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixBusinessDataLimitsRatesDataInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixBusinessDataLimitsRatesDataInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixBusinessDataLimitsRatesDataInfo>() {
           @Override
           public void write(JsonWriter out, AppendixBusinessDataLimitsRatesDataInfo value) throws IOException {
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
           public AppendixBusinessDataLimitsRatesDataInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixBusinessDataLimitsRatesDataInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixBusinessDataLimitsRatesDataInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixBusinessDataLimitsRatesDataInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}