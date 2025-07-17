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



public class MerchantGoogleSellersAdUrlResultInfo  {


  public static final String SERIALIZED_NAME_AD_ACLK = "ad_aclk";
  @SerializedName(SERIALIZED_NAME_AD_ACLK)
  private String adAclk;

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


  public static final String SERIALIZED_NAME_AD_URL = "ad_url";
  @SerializedName(SERIALIZED_NAME_AD_URL)
  private String adUrl;

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


  public static final String SERIALIZED_NAME_AD_URL_REDIRECTS = "ad_url_redirects";
  @SerializedName(SERIALIZED_NAME_AD_URL_REDIRECTS)
  private List<String> adUrlRedirects;

  public MerchantGoogleSellersAdUrlResultInfo adUrlRedirects(List<String> adUrlRedirects) {
    this.adUrlRedirects = adUrlRedirects;
    return this;
  }

  /**
   * URLs where the link from Google Shopping redirects before reaching a final URL
* includes up to 10 URLs of the ad’s redirect path to the seller’s ad_url
   * @return adUrlRedirects
   */
  @javax.annotation.Nullable
  public List<String> getAdUrlRedirects() {
    return adUrlRedirects;
  }

  public void setAdUrlRedirects(List<String> adUrlRedirects) {
    this.adUrlRedirects = adUrlRedirects;
  }



  public MerchantGoogleSellersAdUrlResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public MerchantGoogleSellersAdUrlResultInfo putAdditionalProperty(String key, Object value) {
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


    
    MerchantGoogleSellersAdUrlResultInfo merchantGoogleSellersAdUrlResultInfo = (MerchantGoogleSellersAdUrlResultInfo) o;
    return

        Objects.equals(this.adAclk, merchantGoogleSellersAdUrlResultInfo.adAclk) &&
        Objects.equals(this.adUrl, merchantGoogleSellersAdUrlResultInfo.adUrl) &&
        Objects.equals(this.adUrlRedirects, merchantGoogleSellersAdUrlResultInfo.adUrlRedirects);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(adAclk, adUrl, adUrlRedirects);
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


  public static MerchantGoogleSellersAdUrlResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantGoogleSellersAdUrlResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}