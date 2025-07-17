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



public class AppendixAppDataPriceData  {


  public static final String SERIALIZED_NAME_APP_INFO = "app_info";
  @SerializedName(SERIALIZED_NAME_APP_INFO)
  private AppendixProductGoogleMerchantPriceDataInfo appInfo;

  public AppendixAppDataPriceData appInfo(AppendixProductGoogleMerchantPriceDataInfo appInfo) {
    this.appInfo = appInfo;
    return this;
  }

  /**
   * 
   * @return appInfo
   */
  @javax.annotation.Nullable
  public AppendixProductGoogleMerchantPriceDataInfo getAppInfo() {
    return appInfo;
  }

  public void setAppInfo(AppendixProductGoogleMerchantPriceDataInfo appInfo) {
    this.appInfo = appInfo;
  }


  public static final String SERIALIZED_NAME_APP_LISTINGS = "app_listings";
  @SerializedName(SERIALIZED_NAME_APP_LISTINGS)
  private AppendixAppListingsAppDataPriceData appListings;

  public AppendixAppDataPriceData appListings(AppendixAppListingsAppDataPriceData appListings) {
    this.appListings = appListings;
    return this;
  }

  /**
   * 
   * @return appListings
   */
  @javax.annotation.Nullable
  public AppendixAppListingsAppDataPriceData getAppListings() {
    return appListings;
  }

  public void setAppListings(AppendixAppListingsAppDataPriceData appListings) {
    this.appListings = appListings;
  }


  public static final String SERIALIZED_NAME_APP_LIST = "app_list";
  @SerializedName(SERIALIZED_NAME_APP_LIST)
  private AppendixProductGoogleMerchantPriceDataInfo appList;

  public AppendixAppDataPriceData appList(AppendixProductGoogleMerchantPriceDataInfo appList) {
    this.appList = appList;
    return this;
  }

  /**
   * 
   * @return appList
   */
  @javax.annotation.Nullable
  public AppendixProductGoogleMerchantPriceDataInfo getAppList() {
    return appList;
  }

  public void setAppList(AppendixProductGoogleMerchantPriceDataInfo appList) {
    this.appList = appList;
  }


  public static final String SERIALIZED_NAME_APP_REVIEWS = "app_reviews";
  @SerializedName(SERIALIZED_NAME_APP_REVIEWS)
  private AppendixPriceDataInfo appReviews;

  public AppendixAppDataPriceData appReviews(AppendixPriceDataInfo appReviews) {
    this.appReviews = appReviews;
    return this;
  }

  /**
   * 
   * @return appReviews
   */
  @javax.annotation.Nullable
  public AppendixPriceDataInfo getAppReviews() {
    return appReviews;
  }

  public void setAppReviews(AppendixPriceDataInfo appReviews) {
    this.appReviews = appReviews;
  }


  public static final String SERIALIZED_NAME_APP_SEARCHES = "app_searches";
  @SerializedName(SERIALIZED_NAME_APP_SEARCHES)
  private AppendixProductGoogleMerchantPriceDataInfo appSearches;

  public AppendixAppDataPriceData appSearches(AppendixProductGoogleMerchantPriceDataInfo appSearches) {
    this.appSearches = appSearches;
    return this;
  }

  /**
   * 
   * @return appSearches
   */
  @javax.annotation.Nullable
  public AppendixProductGoogleMerchantPriceDataInfo getAppSearches() {
    return appSearches;
  }

  public void setAppSearches(AppendixProductGoogleMerchantPriceDataInfo appSearches) {
    this.appSearches = appSearches;
  }


  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private AppendixTaskKeywordsDataPriceDataInfo categories;

  public AppendixAppDataPriceData categories(AppendixTaskKeywordsDataPriceDataInfo categories) {
    this.categories = categories;
    return this;
  }

  /**
   * 
   * @return categories
   */
  @javax.annotation.Nullable
  public AppendixTaskKeywordsDataPriceDataInfo getCategories() {
    return categories;
  }

  public void setCategories(AppendixTaskKeywordsDataPriceDataInfo categories) {
    this.categories = categories;
  }


  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private AppendixTaskKeywordsDataPriceDataInfo errors;

  public AppendixAppDataPriceData errors(AppendixTaskKeywordsDataPriceDataInfo errors) {
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


  public static final String SERIALIZED_NAME_LANGUAGES = "languages";
  @SerializedName(SERIALIZED_NAME_LANGUAGES)
  private AppendixTaskKeywordsDataPriceDataInfo languages;

  public AppendixAppDataPriceData languages(AppendixTaskKeywordsDataPriceDataInfo languages) {
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

  public AppendixAppDataPriceData locations(AppendixTaskKeywordsDataPriceDataInfo locations) {
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


  public static final String SERIALIZED_NAME_TASKS_READY = "tasks_ready";
  @SerializedName(SERIALIZED_NAME_TASKS_READY)
  private AppendixTaskKeywordsDataPriceDataInfo tasksReady;

  public AppendixAppDataPriceData tasksReady(AppendixTaskKeywordsDataPriceDataInfo tasksReady) {
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



  public AppendixAppDataPriceData() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixAppDataPriceData putAdditionalProperty(String key, Object value) {
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


    
    AppendixAppDataPriceData appendixAppDataPriceData = (AppendixAppDataPriceData) o;
    return

        Objects.equals(this.appInfo, appendixAppDataPriceData.appInfo) &&
        Objects.equals(this.appListings, appendixAppDataPriceData.appListings) &&
        Objects.equals(this.appList, appendixAppDataPriceData.appList) &&
        Objects.equals(this.appReviews, appendixAppDataPriceData.appReviews) &&
        Objects.equals(this.appSearches, appendixAppDataPriceData.appSearches) &&
        Objects.equals(this.categories, appendixAppDataPriceData.categories) &&
        Objects.equals(this.errors, appendixAppDataPriceData.errors) &&
        Objects.equals(this.languages, appendixAppDataPriceData.languages) &&
        Objects.equals(this.locations, appendixAppDataPriceData.locations) &&
        Objects.equals(this.tasksReady, appendixAppDataPriceData.tasksReady);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(appInfo, appListings, appList, appReviews, appSearches, categories, errors, languages, locations, tasksReady);
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
    sb.append("class AppendixAppDataPriceData {\n");

    sb.append("    appInfo: ").append(toIndentedString(appInfo)).append("\n");
    sb.append("    appListings: ").append(toIndentedString(appListings)).append("\n");
    sb.append("    appList: ").append(toIndentedString(appList)).append("\n");
    sb.append("    appReviews: ").append(toIndentedString(appReviews)).append("\n");
    sb.append("    appSearches: ").append(toIndentedString(appSearches)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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
    
    openapiFields.add("app_info");
    
    openapiFields.add("app_listings");
    
    openapiFields.add("app_list");
    
    openapiFields.add("app_reviews");
    
    openapiFields.add("app_searches");
    
    openapiFields.add("categories");
    
    openapiFields.add("errors");
    
    openapiFields.add("languages");
    
    openapiFields.add("locations");
    
    openapiFields.add("tasks_ready");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixAppDataPriceData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixAppDataPriceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixAppDataPriceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixAppDataPriceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixAppDataPriceData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixAppDataPriceData>() {
           @Override
           public void write(JsonWriter out, AppendixAppDataPriceData value) throws IOException {
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
           public AppendixAppDataPriceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixAppDataPriceData instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixAppDataPriceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixAppDataPriceData.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}