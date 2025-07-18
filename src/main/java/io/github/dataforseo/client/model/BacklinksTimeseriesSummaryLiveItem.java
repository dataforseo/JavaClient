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



public class BacklinksTimeseriesSummaryLiveItem  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public BacklinksTimeseriesSummaryLiveItem type(String type) {
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


  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public BacklinksTimeseriesSummaryLiveItem date(String date) {
    this.date = date;
    return this;
  }

  /**
   * date and time when the data for the target was stored
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2019-11-15 12:57:46 +00:00
   * @return date
   */
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  public static final String SERIALIZED_NAME_RANK = "rank";
  @SerializedName(SERIALIZED_NAME_RANK)
  private Integer rank;

  public BacklinksTimeseriesSummaryLiveItem rank(Integer rank) {
    this.rank = rank;
    return this;
  }

  /**
   * target rank for the given date
* learn more about the metric and how it is calculated in this help center article
   * @return rank
   */
  @javax.annotation.Nullable
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }


  public static final String SERIALIZED_NAME_BACKLINKS = "backlinks";
  @SerializedName(SERIALIZED_NAME_BACKLINKS)
  private Long backlinks;

  public BacklinksTimeseriesSummaryLiveItem backlinks(Long backlinks) {
    this.backlinks = backlinks;
    return this;
  }

  /**
   * number of backlinks for the given date
   * @return backlinks
   */
  @javax.annotation.Nullable
  public Long getBacklinks() {
    return backlinks;
  }

  public void setBacklinks(Long backlinks) {
    this.backlinks = backlinks;
  }


  public static final String SERIALIZED_NAME_BACKLINKS_NOFOLLOW = "backlinks_nofollow";
  @SerializedName(SERIALIZED_NAME_BACKLINKS_NOFOLLOW)
  private Long backlinksNofollow;

  public BacklinksTimeseriesSummaryLiveItem backlinksNofollow(Long backlinksNofollow) {
    this.backlinksNofollow = backlinksNofollow;
    return this;
  }

  /**
   * number of nofollow backlinks for the given date
   * @return backlinksNofollow
   */
  @javax.annotation.Nullable
  public Long getBacklinksNofollow() {
    return backlinksNofollow;
  }

  public void setBacklinksNofollow(Long backlinksNofollow) {
    this.backlinksNofollow = backlinksNofollow;
  }


  public static final String SERIALIZED_NAME_REFERRING_PAGES = "referring_pages";
  @SerializedName(SERIALIZED_NAME_REFERRING_PAGES)
  private Long referringPages;

  public BacklinksTimeseriesSummaryLiveItem referringPages(Long referringPages) {
    this.referringPages = referringPages;
    return this;
  }

  /**
   * number of pages pointing to target for the given date
   * @return referringPages
   */
  @javax.annotation.Nullable
  public Long getReferringPages() {
    return referringPages;
  }

  public void setReferringPages(Long referringPages) {
    this.referringPages = referringPages;
  }


  public static final String SERIALIZED_NAME_REFERRING_PAGES_NOFOLLOW = "referring_pages_nofollow";
  @SerializedName(SERIALIZED_NAME_REFERRING_PAGES_NOFOLLOW)
  private Long referringPagesNofollow;

  public BacklinksTimeseriesSummaryLiveItem referringPagesNofollow(Long referringPagesNofollow) {
    this.referringPagesNofollow = referringPagesNofollow;
    return this;
  }

  /**
   * number of referring pages pointing at least one nofollow link to the target for the given date
   * @return referringPagesNofollow
   */
  @javax.annotation.Nullable
  public Long getReferringPagesNofollow() {
    return referringPagesNofollow;
  }

  public void setReferringPagesNofollow(Long referringPagesNofollow) {
    this.referringPagesNofollow = referringPagesNofollow;
  }


  public static final String SERIALIZED_NAME_REFERRING_DOMAINS = "referring_domains";
  @SerializedName(SERIALIZED_NAME_REFERRING_DOMAINS)
  private Long referringDomains;

  public BacklinksTimeseriesSummaryLiveItem referringDomains(Long referringDomains) {
    this.referringDomains = referringDomains;
    return this;
  }

  /**
   * number of referring domains for the given date
* referring domains include subdomains that are counted as separate domains for this metric
   * @return referringDomains
   */
  @javax.annotation.Nullable
  public Long getReferringDomains() {
    return referringDomains;
  }

  public void setReferringDomains(Long referringDomains) {
    this.referringDomains = referringDomains;
  }


  public static final String SERIALIZED_NAME_REFERRING_DOMAINS_NOFOLLOW = "referring_domains_nofollow";
  @SerializedName(SERIALIZED_NAME_REFERRING_DOMAINS_NOFOLLOW)
  private Long referringDomainsNofollow;

  public BacklinksTimeseriesSummaryLiveItem referringDomainsNofollow(Long referringDomainsNofollow) {
    this.referringDomainsNofollow = referringDomainsNofollow;
    return this;
  }

  /**
   * number of domains pointing at least one nofollow link to the target for the given date
   * @return referringDomainsNofollow
   */
  @javax.annotation.Nullable
  public Long getReferringDomainsNofollow() {
    return referringDomainsNofollow;
  }

  public void setReferringDomainsNofollow(Long referringDomainsNofollow) {
    this.referringDomainsNofollow = referringDomainsNofollow;
  }


  public static final String SERIALIZED_NAME_REFERRING_MAIN_DOMAINS = "referring_main_domains";
  @SerializedName(SERIALIZED_NAME_REFERRING_MAIN_DOMAINS)
  private Long referringMainDomains;

  public BacklinksTimeseriesSummaryLiveItem referringMainDomains(Long referringMainDomains) {
    this.referringMainDomains = referringMainDomains;
    return this;
  }

  /**
   * number of referring main domains for the given date
   * @return referringMainDomains
   */
  @javax.annotation.Nullable
  public Long getReferringMainDomains() {
    return referringMainDomains;
  }

  public void setReferringMainDomains(Long referringMainDomains) {
    this.referringMainDomains = referringMainDomains;
  }


  public static final String SERIALIZED_NAME_REFERRING_MAIN_DOMAINS_NOFOLLOW = "referring_main_domains_nofollow";
  @SerializedName(SERIALIZED_NAME_REFERRING_MAIN_DOMAINS_NOFOLLOW)
  private Long referringMainDomainsNofollow;

  public BacklinksTimeseriesSummaryLiveItem referringMainDomainsNofollow(Long referringMainDomainsNofollow) {
    this.referringMainDomainsNofollow = referringMainDomainsNofollow;
    return this;
  }

  /**
   * number of main domains pointing at least one nofollow link to the target for the given date
   * @return referringMainDomainsNofollow
   */
  @javax.annotation.Nullable
  public Long getReferringMainDomainsNofollow() {
    return referringMainDomainsNofollow;
  }

  public void setReferringMainDomainsNofollow(Long referringMainDomainsNofollow) {
    this.referringMainDomainsNofollow = referringMainDomainsNofollow;
  }


  public static final String SERIALIZED_NAME_REFERRING_IPS = "referring_ips";
  @SerializedName(SERIALIZED_NAME_REFERRING_IPS)
  private Long referringIps;

  public BacklinksTimeseriesSummaryLiveItem referringIps(Long referringIps) {
    this.referringIps = referringIps;
    return this;
  }

  /**
   * number of referring IP addresses for the given date
* number of IP addresses pointing to this page
   * @return referringIps
   */
  @javax.annotation.Nullable
  public Long getReferringIps() {
    return referringIps;
  }

  public void setReferringIps(Long referringIps) {
    this.referringIps = referringIps;
  }


  public static final String SERIALIZED_NAME_REFERRING_SUBNETS = "referring_subnets";
  @SerializedName(SERIALIZED_NAME_REFERRING_SUBNETS)
  private Long referringSubnets;

  public BacklinksTimeseriesSummaryLiveItem referringSubnets(Long referringSubnets) {
    this.referringSubnets = referringSubnets;
    return this;
  }

  /**
   * number of referring subnetworks for the given date
   * @return referringSubnets
   */
  @javax.annotation.Nullable
  public Long getReferringSubnets() {
    return referringSubnets;
  }

  public void setReferringSubnets(Long referringSubnets) {
    this.referringSubnets = referringSubnets;
  }



  public BacklinksTimeseriesSummaryLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public BacklinksTimeseriesSummaryLiveItem putAdditionalProperty(String key, Object value) {
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


    
    BacklinksTimeseriesSummaryLiveItem backlinksTimeseriesSummaryLiveItem = (BacklinksTimeseriesSummaryLiveItem) o;
    return

        Objects.equals(this.type, backlinksTimeseriesSummaryLiveItem.type) &&
        Objects.equals(this.date, backlinksTimeseriesSummaryLiveItem.date) &&
        Objects.equals(this.rank, backlinksTimeseriesSummaryLiveItem.rank) &&
        Objects.equals(this.backlinks, backlinksTimeseriesSummaryLiveItem.backlinks) &&
        Objects.equals(this.backlinksNofollow, backlinksTimeseriesSummaryLiveItem.backlinksNofollow) &&
        Objects.equals(this.referringPages, backlinksTimeseriesSummaryLiveItem.referringPages) &&
        Objects.equals(this.referringPagesNofollow, backlinksTimeseriesSummaryLiveItem.referringPagesNofollow) &&
        Objects.equals(this.referringDomains, backlinksTimeseriesSummaryLiveItem.referringDomains) &&
        Objects.equals(this.referringDomainsNofollow, backlinksTimeseriesSummaryLiveItem.referringDomainsNofollow) &&
        Objects.equals(this.referringMainDomains, backlinksTimeseriesSummaryLiveItem.referringMainDomains) &&
        Objects.equals(this.referringMainDomainsNofollow, backlinksTimeseriesSummaryLiveItem.referringMainDomainsNofollow) &&
        Objects.equals(this.referringIps, backlinksTimeseriesSummaryLiveItem.referringIps) &&
        Objects.equals(this.referringSubnets, backlinksTimeseriesSummaryLiveItem.referringSubnets);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, date, rank, backlinks, backlinksNofollow, referringPages, referringPagesNofollow, referringDomains, referringDomainsNofollow, referringMainDomains, referringMainDomainsNofollow, referringIps, referringSubnets);
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
    sb.append("class BacklinksTimeseriesSummaryLiveItem {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    backlinks: ").append(toIndentedString(backlinks)).append("\n");
    sb.append("    backlinksNofollow: ").append(toIndentedString(backlinksNofollow)).append("\n");
    sb.append("    referringPages: ").append(toIndentedString(referringPages)).append("\n");
    sb.append("    referringPagesNofollow: ").append(toIndentedString(referringPagesNofollow)).append("\n");
    sb.append("    referringDomains: ").append(toIndentedString(referringDomains)).append("\n");
    sb.append("    referringDomainsNofollow: ").append(toIndentedString(referringDomainsNofollow)).append("\n");
    sb.append("    referringMainDomains: ").append(toIndentedString(referringMainDomains)).append("\n");
    sb.append("    referringMainDomainsNofollow: ").append(toIndentedString(referringMainDomainsNofollow)).append("\n");
    sb.append("    referringIps: ").append(toIndentedString(referringIps)).append("\n");
    sb.append("    referringSubnets: ").append(toIndentedString(referringSubnets)).append("\n");
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
    
    openapiFields.add("date");
    
    openapiFields.add("rank");
    
    openapiFields.add("backlinks");
    
    openapiFields.add("backlinks_nofollow");
    
    openapiFields.add("referring_pages");
    
    openapiFields.add("referring_pages_nofollow");
    
    openapiFields.add("referring_domains");
    
    openapiFields.add("referring_domains_nofollow");
    
    openapiFields.add("referring_main_domains");
    
    openapiFields.add("referring_main_domains_nofollow");
    
    openapiFields.add("referring_ips");
    
    openapiFields.add("referring_subnets");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BacklinksTimeseriesSummaryLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BacklinksTimeseriesSummaryLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BacklinksTimeseriesSummaryLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BacklinksTimeseriesSummaryLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BacklinksTimeseriesSummaryLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<BacklinksTimeseriesSummaryLiveItem>() {
           @Override
           public void write(JsonWriter out, BacklinksTimeseriesSummaryLiveItem value) throws IOException {
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
           public BacklinksTimeseriesSummaryLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BacklinksTimeseriesSummaryLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static BacklinksTimeseriesSummaryLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BacklinksTimeseriesSummaryLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}