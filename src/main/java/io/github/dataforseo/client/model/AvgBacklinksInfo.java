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



public class AvgBacklinksInfo  {


  public static final String SERIALIZED_NAME_SE_TYPE = "se_type";
  @SerializedName(SERIALIZED_NAME_SE_TYPE)
  private String seType;

  public AvgBacklinksInfo seType(String seType) {
    this.seType = seType;
    return this;
  }

  /**
   * search engine type
   * @return seType
   */
  @javax.annotation.Nullable
  public String getSeType() {
    return seType;
  }

  public void setSeType(String seType) {
    this.seType = seType;
  }


  public static final String SERIALIZED_NAME_BACKLINKS = "backlinks";
  @SerializedName(SERIALIZED_NAME_BACKLINKS)
  private Double backlinks;

  public AvgBacklinksInfo backlinks(Double backlinks) {
    this.backlinks = backlinks;
    return this;
  }

  /**
   * average number of backlinks
   * @return backlinks
   */
  @javax.annotation.Nullable
  public Double getBacklinks() {
    return backlinks;
  }

  public void setBacklinks(Double backlinks) {
    this.backlinks = backlinks;
  }


  public static final String SERIALIZED_NAME_DOFOLLOW = "dofollow";
  @SerializedName(SERIALIZED_NAME_DOFOLLOW)
  private Double dofollow;

  public AvgBacklinksInfo dofollow(Double dofollow) {
    this.dofollow = dofollow;
    return this;
  }

  /**
   * average number of dofollow links
   * @return dofollow
   */
  @javax.annotation.Nullable
  public Double getDofollow() {
    return dofollow;
  }

  public void setDofollow(Double dofollow) {
    this.dofollow = dofollow;
  }


  public static final String SERIALIZED_NAME_REFERRING_PAGES = "referring_pages";
  @SerializedName(SERIALIZED_NAME_REFERRING_PAGES)
  private Double referringPages;

  public AvgBacklinksInfo referringPages(Double referringPages) {
    this.referringPages = referringPages;
    return this;
  }

  /**
   * average number of referring pages
   * @return referringPages
   */
  @javax.annotation.Nullable
  public Double getReferringPages() {
    return referringPages;
  }

  public void setReferringPages(Double referringPages) {
    this.referringPages = referringPages;
  }


  public static final String SERIALIZED_NAME_REFERRING_DOMAINS = "referring_domains";
  @SerializedName(SERIALIZED_NAME_REFERRING_DOMAINS)
  private Double referringDomains;

  public AvgBacklinksInfo referringDomains(Double referringDomains) {
    this.referringDomains = referringDomains;
    return this;
  }

  /**
   * average number of referring domains
   * @return referringDomains
   */
  @javax.annotation.Nullable
  public Double getReferringDomains() {
    return referringDomains;
  }

  public void setReferringDomains(Double referringDomains) {
    this.referringDomains = referringDomains;
  }


  public static final String SERIALIZED_NAME_REFERRING_MAIN_DOMAINS = "referring_main_domains";
  @SerializedName(SERIALIZED_NAME_REFERRING_MAIN_DOMAINS)
  private Double referringMainDomains;

  public AvgBacklinksInfo referringMainDomains(Double referringMainDomains) {
    this.referringMainDomains = referringMainDomains;
    return this;
  }

  /**
   * average number of referring main domains
   * @return referringMainDomains
   */
  @javax.annotation.Nullable
  public Double getReferringMainDomains() {
    return referringMainDomains;
  }

  public void setReferringMainDomains(Double referringMainDomains) {
    this.referringMainDomains = referringMainDomains;
  }


  public static final String SERIALIZED_NAME_RANK = "rank";
  @SerializedName(SERIALIZED_NAME_RANK)
  private Double rank;

  public AvgBacklinksInfo rank(Double rank) {
    this.rank = rank;
    return this;
  }

  /**
   * average rank
* learn more about the metric and its calculation formula in this help center article
   * @return rank
   */
  @javax.annotation.Nullable
  public Double getRank() {
    return rank;
  }

  public void setRank(Double rank) {
    this.rank = rank;
  }


  public static final String SERIALIZED_NAME_MAIN_DOMAIN_RANK = "main_domain_rank";
  @SerializedName(SERIALIZED_NAME_MAIN_DOMAIN_RANK)
  private Double mainDomainRank;

  public AvgBacklinksInfo mainDomainRank(Double mainDomainRank) {
    this.mainDomainRank = mainDomainRank;
    return this;
  }

  /**
   * average main domain rank
* learn more about the metric and its calculation formula in this help center article
   * @return mainDomainRank
   */
  @javax.annotation.Nullable
  public Double getMainDomainRank() {
    return mainDomainRank;
  }

  public void setMainDomainRank(Double mainDomainRank) {
    this.mainDomainRank = mainDomainRank;
  }


  public static final String SERIALIZED_NAME_LAST_UPDATED_TIME = "last_updated_time";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_TIME)
  private String lastUpdatedTime;

  public AvgBacklinksInfo lastUpdatedTime(String lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

  /**
   * date and time when the dataset was updated
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return lastUpdatedTime
   */
  @javax.annotation.Nullable
  public String getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(String lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }



  public AvgBacklinksInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AvgBacklinksInfo putAdditionalProperty(String key, Object value) {
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


    
    AvgBacklinksInfo avgBacklinksInfo = (AvgBacklinksInfo) o;
    return

        Objects.equals(this.seType, avgBacklinksInfo.seType) &&
        Objects.equals(this.backlinks, avgBacklinksInfo.backlinks) &&
        Objects.equals(this.dofollow, avgBacklinksInfo.dofollow) &&
        Objects.equals(this.referringPages, avgBacklinksInfo.referringPages) &&
        Objects.equals(this.referringDomains, avgBacklinksInfo.referringDomains) &&
        Objects.equals(this.referringMainDomains, avgBacklinksInfo.referringMainDomains) &&
        Objects.equals(this.rank, avgBacklinksInfo.rank) &&
        Objects.equals(this.mainDomainRank, avgBacklinksInfo.mainDomainRank) &&
        Objects.equals(this.lastUpdatedTime, avgBacklinksInfo.lastUpdatedTime);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(seType, backlinks, dofollow, referringPages, referringDomains, referringMainDomains, rank, mainDomainRank, lastUpdatedTime);
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
    sb.append("class AvgBacklinksInfo {\n");

    sb.append("    seType: ").append(toIndentedString(seType)).append("\n");
    sb.append("    backlinks: ").append(toIndentedString(backlinks)).append("\n");
    sb.append("    dofollow: ").append(toIndentedString(dofollow)).append("\n");
    sb.append("    referringPages: ").append(toIndentedString(referringPages)).append("\n");
    sb.append("    referringDomains: ").append(toIndentedString(referringDomains)).append("\n");
    sb.append("    referringMainDomains: ").append(toIndentedString(referringMainDomains)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    mainDomainRank: ").append(toIndentedString(mainDomainRank)).append("\n");
    sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
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
    
    openapiFields.add("se_type");
    
    openapiFields.add("backlinks");
    
    openapiFields.add("dofollow");
    
    openapiFields.add("referring_pages");
    
    openapiFields.add("referring_domains");
    
    openapiFields.add("referring_main_domains");
    
    openapiFields.add("rank");
    
    openapiFields.add("main_domain_rank");
    
    openapiFields.add("last_updated_time");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AvgBacklinksInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AvgBacklinksInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AvgBacklinksInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AvgBacklinksInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AvgBacklinksInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AvgBacklinksInfo>() {
           @Override
           public void write(JsonWriter out, AvgBacklinksInfo value) throws IOException {
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
           public AvgBacklinksInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AvgBacklinksInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AvgBacklinksInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AvgBacklinksInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}