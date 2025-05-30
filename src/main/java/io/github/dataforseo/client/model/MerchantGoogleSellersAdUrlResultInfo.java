/*
 * DataForSEO API documentation
 * DataForSEO API is the starting point on your journey towards building powerful SEO software. With DataForSEO you can get all the data you need to build an efficient application while also saving your time and budget. DataForSEO API is using the REST technology for interchanging data between your application and our service. The data exchange is made through the widely used HTTP protocol, which allows applying our API to almost all programming languages.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.dataforseo.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

/**
 * MerchantGoogleSellersAdUrlResultInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-30T15:21:14.476580900+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class MerchantGoogleSellersAdUrlResultInfo {
  public static final String SERIALIZED_NAME_AD_ACLK = "ad_aclk";
  @SerializedName(SERIALIZED_NAME_AD_ACLK)
  private String adAclk;

  public static final String SERIALIZED_NAME_AD_URL = "ad_url";
  @SerializedName(SERIALIZED_NAME_AD_URL)
  private String adUrl;

  public static final String SERIALIZED_NAME_AD_URL_REDIRECTS = "ad_url_redirects";
  @SerializedName(SERIALIZED_NAME_AD_URL_REDIRECTS)
  private List<String> adUrlRedirects;

  public MerchantGoogleSellersAdUrlResultInfo() {
  }

  public MerchantGoogleSellersAdUrlResultInfo adAclk(String adAclk) {
    this.adAclk = adAclk;
    return this;
  }

  /**
   * unique ad click referral parameter
   * @return adAclk
   */
  @javax.annotation.Nullable
  public String getAdAclk() {
    return adAclk;
  }

  public void setAdAclk(String adAclk) {
    this.adAclk = adAclk;
  }


  public MerchantGoogleSellersAdUrlResultInfo adUrl(String adUrl) {
    this.adUrl = adUrl;
    return this;
  }

  /**
   * full URL of the advertisement
   * @return adUrl
   */
  @javax.annotation.Nullable
  public String getAdUrl() {
    return adUrl;
  }

  public void setAdUrl(String adUrl) {
    this.adUrl = adUrl;
  }


  public MerchantGoogleSellersAdUrlResultInfo adUrlRedirects(List<String> adUrlRedirects) {
    this.adUrlRedirects = adUrlRedirects;
    return this;
  }

  public MerchantGoogleSellersAdUrlResultInfo addAdUrlRedirectsItem(String adUrlRedirectsItem) {
    if (this.adUrlRedirects == null) {
      this.adUrlRedirects = new ArrayList<>();
    }
    this.adUrlRedirects.add(adUrlRedirectsItem);
    return this;
  }

  /**
   * URLs where the link from Google Shopping redirects before reaching a final URL includes up to 10 URLs of the ad’s redirect path to the seller’s ad_url
   * @return adUrlRedirects
   */
  @javax.annotation.Nullable
  public List<String> getAdUrlRedirects() {
    return adUrlRedirects;
  }

  public void setAdUrlRedirects(List<String> adUrlRedirects) {
    this.adUrlRedirects = adUrlRedirects;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the MerchantGoogleSellersAdUrlResultInfo instance itself
   */
  public MerchantGoogleSellersAdUrlResultInfo putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
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
    MerchantGoogleSellersAdUrlResultInfo merchantGoogleSellersAdUrlResultInfo = (MerchantGoogleSellersAdUrlResultInfo) o;
    return Objects.equals(this.adAclk, merchantGoogleSellersAdUrlResultInfo.adAclk) &&
        Objects.equals(this.adUrl, merchantGoogleSellersAdUrlResultInfo.adUrl) &&
        Objects.equals(this.adUrlRedirects, merchantGoogleSellersAdUrlResultInfo.adUrlRedirects)&&
        Objects.equals(this.additionalProperties, merchantGoogleSellersAdUrlResultInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAclk, adUrl, adUrlRedirects, additionalProperties);
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
    sb.append("class MerchantGoogleSellersAdUrlResultInfo {\n");
    sb.append("    adAclk: ").append(toIndentedString(adAclk)).append("\n");
    sb.append("    adUrl: ").append(toIndentedString(adUrl)).append("\n");
    sb.append("    adUrlRedirects: ").append(toIndentedString(adUrlRedirects)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("ad_aclk");
    openapiFields.add("ad_url");
    openapiFields.add("ad_url_redirects");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MerchantGoogleSellersAdUrlResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MerchantGoogleSellersAdUrlResultInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantGoogleSellersAdUrlResultInfo is not found in the empty JSON string", MerchantGoogleSellersAdUrlResultInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ad_aclk") != null && !jsonObj.get("ad_aclk").isJsonNull()) && !jsonObj.get("ad_aclk").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ad_aclk` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ad_aclk").toString()));
      }
      if ((jsonObj.get("ad_url") != null && !jsonObj.get("ad_url").isJsonNull()) && !jsonObj.get("ad_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ad_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ad_url").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ad_url_redirects") != null && !jsonObj.get("ad_url_redirects").isJsonNull() && !jsonObj.get("ad_url_redirects").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ad_url_redirects` to be an array in the JSON string but got `%s`", jsonObj.get("ad_url_redirects").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantGoogleSellersAdUrlResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantGoogleSellersAdUrlResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantGoogleSellersAdUrlResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantGoogleSellersAdUrlResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantGoogleSellersAdUrlResultInfo>() {
           @Override
           public void write(JsonWriter out, MerchantGoogleSellersAdUrlResultInfo value) throws IOException {
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
           public MerchantGoogleSellersAdUrlResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             MerchantGoogleSellersAdUrlResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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

  /**
   * Create an instance of MerchantGoogleSellersAdUrlResultInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MerchantGoogleSellersAdUrlResultInfo
   * @throws IOException if the JSON string is invalid with respect to MerchantGoogleSellersAdUrlResultInfo
   */
  public static MerchantGoogleSellersAdUrlResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantGoogleSellersAdUrlResultInfo.class);
  }

  /**
   * Convert an instance of MerchantGoogleSellersAdUrlResultInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

