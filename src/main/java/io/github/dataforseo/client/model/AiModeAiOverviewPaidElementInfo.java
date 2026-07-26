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


public class AiModeAiOverviewPaidElementInfo  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AiModeAiOverviewPaidElementInfo type(String type) {
    this.type = type;
    return this;
  }

  /**
   * type of element
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public AiModeAiOverviewPaidElementInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <em>title of the element in SERP</em>
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public AiModeAiOverviewPaidElementInfo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <em>reference page URL</em>
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public AiModeAiOverviewPaidElementInfo domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * <em>domain name of the reference</em>
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public static final String SERIALIZED_NAME_AD_ACLK = "ad_aclk";
  @SerializedName(SERIALIZED_NAME_AD_ACLK)
  private String adAclk;

  public AiModeAiOverviewPaidElementInfo adAclk(String adAclk) {
    this.adAclk = adAclk;
    return this;
  }

  /**
   * <em>unique ad click referral parameter</em><br>using this parameter you can get a URL of the advertisement in <a href='https://docs.dataforseo.com/v3/merchant/google/sellers/ad_url/' rel='noopener noreferrer' target='_blank'>Google Shopping Sellers Ad URL</a>
   * @return adAclk
   */
  @javax.annotation.Nullable
  public String getAdAclk() {
    return adAclk;
  }

  public void setAdAclk(String adAclk) {
    this.adAclk = adAclk;
  }


  public static final String SERIALIZED_NAME_WEBSITE_NAME = "website_name";
  @SerializedName(SERIALIZED_NAME_WEBSITE_NAME)
  private String websiteName;

  public AiModeAiOverviewPaidElementInfo websiteName(String websiteName) {
    this.websiteName = websiteName;
    return this;
  }

  /**
   * <em>displayed name of the advertiser's website</em>
   * @return websiteName
   */
  @javax.annotation.Nullable
  public String getWebsiteName() {
    return websiteName;
  }

  public void setWebsiteName(String websiteName) {
    this.websiteName = websiteName;
  }


  public static final String SERIALIZED_NAME_BREADCRUMB = "breadcrumb";
  @SerializedName(SERIALIZED_NAME_BREADCRUMB)
  private String breadcrumb;

  public AiModeAiOverviewPaidElementInfo breadcrumb(String breadcrumb) {
    this.breadcrumb = breadcrumb;
    return this;
  }

  /**
   * <em>breadcrumb path displayed in the ad</em>
   * @return breadcrumb
   */
  @javax.annotation.Nullable
  public String getBreadcrumb() {
    return breadcrumb;
  }

  public void setBreadcrumb(String breadcrumb) {
    this.breadcrumb = breadcrumb;
  }


  public static final String SERIALIZED_NAME_SNIPPET = "snippet";
  @SerializedName(SERIALIZED_NAME_SNIPPET)
  private String snippet;

  public AiModeAiOverviewPaidElementInfo snippet(String snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * <em>description text of the ad</em>
   * @return snippet
   */
  @javax.annotation.Nullable
  public String getSnippet() {
    return snippet;
  }

  public void setSnippet(String snippet) {
    this.snippet = snippet;
  }


  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<AiModeImagesElementInfo> images;

  public AiModeAiOverviewPaidElementInfo images(List<AiModeImagesElementInfo> images) {
    this.images = images;
    return this;
  }

  /**
   * <em>images present in the ad</em><br>if there are none, equals <code>null</code>
   * @return images
   */
  @javax.annotation.Nullable
  public List<AiModeImagesElementInfo> getImages() {
    return images;
  }

  public void setImages(List<AiModeImagesElementInfo> images) {
    this.images = images;
  }



  public AiModeAiOverviewPaidElementInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AiModeAiOverviewPaidElementInfo putAdditionalProperty(String key, Object value) {
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


    
    AiModeAiOverviewPaidElementInfo aiModeAiOverviewPaidElementInfo = (AiModeAiOverviewPaidElementInfo) o;
    return

        Objects.equals(this.type, aiModeAiOverviewPaidElementInfo.type) &&
        Objects.equals(this.title, aiModeAiOverviewPaidElementInfo.title) &&
        Objects.equals(this.url, aiModeAiOverviewPaidElementInfo.url) &&
        Objects.equals(this.domain, aiModeAiOverviewPaidElementInfo.domain) &&
        Objects.equals(this.adAclk, aiModeAiOverviewPaidElementInfo.adAclk) &&
        Objects.equals(this.websiteName, aiModeAiOverviewPaidElementInfo.websiteName) &&
        Objects.equals(this.breadcrumb, aiModeAiOverviewPaidElementInfo.breadcrumb) &&
        Objects.equals(this.snippet, aiModeAiOverviewPaidElementInfo.snippet) &&
        Objects.equals(this.images, aiModeAiOverviewPaidElementInfo.images);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, title, url, domain, adAclk, websiteName, breadcrumb, snippet, images);
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
    sb.append("class AiModeAiOverviewPaidElementInfo {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    adAclk: ").append(toIndentedString(adAclk)).append("\n");
    sb.append("    websiteName: ").append(toIndentedString(websiteName)).append("\n");
    sb.append("    breadcrumb: ").append(toIndentedString(breadcrumb)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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
    
    openapiFields.add("type");
    
    openapiFields.add("title");
    
    openapiFields.add("url");
    
    openapiFields.add("domain");
    
    openapiFields.add("ad_aclk");
    
    openapiFields.add("website_name");
    
    openapiFields.add("breadcrumb");
    
    openapiFields.add("snippet");
    
    openapiFields.add("images");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AiModeAiOverviewPaidElementInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiModeAiOverviewPaidElementInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiModeAiOverviewPaidElementInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiModeAiOverviewPaidElementInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiModeAiOverviewPaidElementInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AiModeAiOverviewPaidElementInfo>() {
           @Override
           public void write(JsonWriter out, AiModeAiOverviewPaidElementInfo value) throws IOException {
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
           public AiModeAiOverviewPaidElementInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AiModeAiOverviewPaidElementInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AiModeAiOverviewPaidElementInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiModeAiOverviewPaidElementInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}