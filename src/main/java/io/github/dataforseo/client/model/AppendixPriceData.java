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



public class AppendixPriceData  {


  public static final String SERIALIZED_NAME_KEYWORDS_DATA = "keywords_data";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_DATA)
  private AppendixKeywordsDataPriceData keywordsData;

  public AppendixPriceData keywordsData(AppendixKeywordsDataPriceData keywordsData) {
    this.keywordsData = keywordsData;
    return this;
  }

  /**
   * 
   * @return keywordsData
   */
  @javax.annotation.Nullable
  public AppendixKeywordsDataPriceData getKeywordsData() {
    return keywordsData;
  }

  public void setKeywordsData(AppendixKeywordsDataPriceData keywordsData) {
    this.keywordsData = keywordsData;
  }


  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private AppendixMerchantPriceData merchant;

  public AppendixPriceData merchant(AppendixMerchantPriceData merchant) {
    this.merchant = merchant;
    return this;
  }

  /**
   * 
   * @return merchant
   */
  @javax.annotation.Nullable
  public AppendixMerchantPriceData getMerchant() {
    return merchant;
  }

  public void setMerchant(AppendixMerchantPriceData merchant) {
    this.merchant = merchant;
  }


  public static final String SERIALIZED_NAME_SERP = "serp";
  @SerializedName(SERIALIZED_NAME_SERP)
  private AppendixSerpPriceData serp;

  public AppendixPriceData serp(AppendixSerpPriceData serp) {
    this.serp = serp;
    return this;
  }

  /**
   * 
   * @return serp
   */
  @javax.annotation.Nullable
  public AppendixSerpPriceData getSerp() {
    return serp;
  }

  public void setSerp(AppendixSerpPriceData serp) {
    this.serp = serp;
  }


  public static final String SERIALIZED_NAME_APPENDIX = "appendix";
  @SerializedName(SERIALIZED_NAME_APPENDIX)
  private AppendixAppendixPriceData appendix;

  public AppendixPriceData appendix(AppendixAppendixPriceData appendix) {
    this.appendix = appendix;
    return this;
  }

  /**
   * 
   * @return appendix
   */
  @javax.annotation.Nullable
  public AppendixAppendixPriceData getAppendix() {
    return appendix;
  }

  public void setAppendix(AppendixAppendixPriceData appendix) {
    this.appendix = appendix;
  }


  public static final String SERIALIZED_NAME_APP_DATA = "app_data";
  @SerializedName(SERIALIZED_NAME_APP_DATA)
  private AppendixAppDataPriceData appData;

  public AppendixPriceData appData(AppendixAppDataPriceData appData) {
    this.appData = appData;
    return this;
  }

  /**
   * 
   * @return appData
   */
  @javax.annotation.Nullable
  public AppendixAppDataPriceData getAppData() {
    return appData;
  }

  public void setAppData(AppendixAppDataPriceData appData) {
    this.appData = appData;
  }


  public static final String SERIALIZED_NAME_BACKLINKS = "backlinks";
  @SerializedName(SERIALIZED_NAME_BACKLINKS)
  private AppendixBacklinksPriceData backlinks;

  public AppendixPriceData backlinks(AppendixBacklinksPriceData backlinks) {
    this.backlinks = backlinks;
    return this;
  }

  /**
   * 
   * @return backlinks
   */
  @javax.annotation.Nullable
  public AppendixBacklinksPriceData getBacklinks() {
    return backlinks;
  }

  public void setBacklinks(AppendixBacklinksPriceData backlinks) {
    this.backlinks = backlinks;
  }


  public static final String SERIALIZED_NAME_BUSINESS_DATA = "business_data";
  @SerializedName(SERIALIZED_NAME_BUSINESS_DATA)
  private AppendixBusinessDataPriceData businessData;

  public AppendixPriceData businessData(AppendixBusinessDataPriceData businessData) {
    this.businessData = businessData;
    return this;
  }

  /**
   * 
   * @return businessData
   */
  @javax.annotation.Nullable
  public AppendixBusinessDataPriceData getBusinessData() {
    return businessData;
  }

  public void setBusinessData(AppendixBusinessDataPriceData businessData) {
    this.businessData = businessData;
  }


  public static final String SERIALIZED_NAME_CONTENT_ANALYSIS = "content_analysis";
  @SerializedName(SERIALIZED_NAME_CONTENT_ANALYSIS)
  private AppendixContentAnalysisPriceData contentAnalysis;

  public AppendixPriceData contentAnalysis(AppendixContentAnalysisPriceData contentAnalysis) {
    this.contentAnalysis = contentAnalysis;
    return this;
  }

  /**
   * 
   * @return contentAnalysis
   */
  @javax.annotation.Nullable
  public AppendixContentAnalysisPriceData getContentAnalysis() {
    return contentAnalysis;
  }

  public void setContentAnalysis(AppendixContentAnalysisPriceData contentAnalysis) {
    this.contentAnalysis = contentAnalysis;
  }


  public static final String SERIALIZED_NAME_CONTENT_GENERATION = "content_generation";
  @SerializedName(SERIALIZED_NAME_CONTENT_GENERATION)
  private AppendixContentGenerationPriceData contentGeneration;

  public AppendixPriceData contentGeneration(AppendixContentGenerationPriceData contentGeneration) {
    this.contentGeneration = contentGeneration;
    return this;
  }

  /**
   * 
   * @return contentGeneration
   */
  @javax.annotation.Nullable
  public AppendixContentGenerationPriceData getContentGeneration() {
    return contentGeneration;
  }

  public void setContentGeneration(AppendixContentGenerationPriceData contentGeneration) {
    this.contentGeneration = contentGeneration;
  }


  public static final String SERIALIZED_NAME_DATAFORSEO_LABS = "dataforseo_labs";
  @SerializedName(SERIALIZED_NAME_DATAFORSEO_LABS)
  private AppendixDataforseoLabsPriceData dataforseoLabs;

  public AppendixPriceData dataforseoLabs(AppendixDataforseoLabsPriceData dataforseoLabs) {
    this.dataforseoLabs = dataforseoLabs;
    return this;
  }

  /**
   * 
   * @return dataforseoLabs
   */
  @javax.annotation.Nullable
  public AppendixDataforseoLabsPriceData getDataforseoLabs() {
    return dataforseoLabs;
  }

  public void setDataforseoLabs(AppendixDataforseoLabsPriceData dataforseoLabs) {
    this.dataforseoLabs = dataforseoLabs;
  }


  public static final String SERIALIZED_NAME_DOMAIN_ANALYTICS = "domain_analytics";
  @SerializedName(SERIALIZED_NAME_DOMAIN_ANALYTICS)
  private AppendixDomainAnalyticsPriceData domainAnalytics;

  public AppendixPriceData domainAnalytics(AppendixDomainAnalyticsPriceData domainAnalytics) {
    this.domainAnalytics = domainAnalytics;
    return this;
  }

  /**
   * 
   * @return domainAnalytics
   */
  @javax.annotation.Nullable
  public AppendixDomainAnalyticsPriceData getDomainAnalytics() {
    return domainAnalytics;
  }

  public void setDomainAnalytics(AppendixDomainAnalyticsPriceData domainAnalytics) {
    this.domainAnalytics = domainAnalytics;
  }


  public static final String SERIALIZED_NAME_ON_PAGE = "on_page";
  @SerializedName(SERIALIZED_NAME_ON_PAGE)
  private AppendixOnPagePriceData onPage;

  public AppendixPriceData onPage(AppendixOnPagePriceData onPage) {
    this.onPage = onPage;
    return this;
  }

  /**
   * 
   * @return onPage
   */
  @javax.annotation.Nullable
  public AppendixOnPagePriceData getOnPage() {
    return onPage;
  }

  public void setOnPage(AppendixOnPagePriceData onPage) {
    this.onPage = onPage;
  }



  public AppendixPriceData() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixPriceData putAdditionalProperty(String key, Object value) {
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


    
    AppendixPriceData appendixPriceData = (AppendixPriceData) o;
    return

        Objects.equals(this.keywordsData, appendixPriceData.keywordsData) &&
        Objects.equals(this.merchant, appendixPriceData.merchant) &&
        Objects.equals(this.serp, appendixPriceData.serp) &&
        Objects.equals(this.appendix, appendixPriceData.appendix) &&
        Objects.equals(this.appData, appendixPriceData.appData) &&
        Objects.equals(this.backlinks, appendixPriceData.backlinks) &&
        Objects.equals(this.businessData, appendixPriceData.businessData) &&
        Objects.equals(this.contentAnalysis, appendixPriceData.contentAnalysis) &&
        Objects.equals(this.contentGeneration, appendixPriceData.contentGeneration) &&
        Objects.equals(this.dataforseoLabs, appendixPriceData.dataforseoLabs) &&
        Objects.equals(this.domainAnalytics, appendixPriceData.domainAnalytics) &&
        Objects.equals(this.onPage, appendixPriceData.onPage);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(keywordsData, merchant, serp, appendix, appData, backlinks, businessData, contentAnalysis, contentGeneration, dataforseoLabs, domainAnalytics, onPage);
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
    sb.append("class AppendixPriceData {\n");

    sb.append("    keywordsData: ").append(toIndentedString(keywordsData)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    serp: ").append(toIndentedString(serp)).append("\n");
    sb.append("    appendix: ").append(toIndentedString(appendix)).append("\n");
    sb.append("    appData: ").append(toIndentedString(appData)).append("\n");
    sb.append("    backlinks: ").append(toIndentedString(backlinks)).append("\n");
    sb.append("    businessData: ").append(toIndentedString(businessData)).append("\n");
    sb.append("    contentAnalysis: ").append(toIndentedString(contentAnalysis)).append("\n");
    sb.append("    contentGeneration: ").append(toIndentedString(contentGeneration)).append("\n");
    sb.append("    dataforseoLabs: ").append(toIndentedString(dataforseoLabs)).append("\n");
    sb.append("    domainAnalytics: ").append(toIndentedString(domainAnalytics)).append("\n");
    sb.append("    onPage: ").append(toIndentedString(onPage)).append("\n");
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
    
    openapiFields.add("keywords_data");
    
    openapiFields.add("merchant");
    
    openapiFields.add("serp");
    
    openapiFields.add("appendix");
    
    openapiFields.add("app_data");
    
    openapiFields.add("backlinks");
    
    openapiFields.add("business_data");
    
    openapiFields.add("content_analysis");
    
    openapiFields.add("content_generation");
    
    openapiFields.add("dataforseo_labs");
    
    openapiFields.add("domain_analytics");
    
    openapiFields.add("on_page");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixPriceData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixPriceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixPriceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixPriceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixPriceData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixPriceData>() {
           @Override
           public void write(JsonWriter out, AppendixPriceData value) throws IOException {
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
           public AppendixPriceData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixPriceData instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixPriceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixPriceData.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}