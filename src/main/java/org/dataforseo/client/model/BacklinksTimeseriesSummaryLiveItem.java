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


package org.dataforseo.client.model;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dataforseo.client.JSON;

/**
 * BacklinksTimeseriesSummaryLiveItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T15:18:23.103906100+03:00[Europe/Kiev]")
public class BacklinksTimeseriesSummaryLiveItem {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_RANK = "rank";
  @SerializedName(SERIALIZED_NAME_RANK)
  private Integer rank;

  public static final String SERIALIZED_NAME_BACKLINKS = "backlinks";
  @SerializedName(SERIALIZED_NAME_BACKLINKS)
  private Long backlinks;

  public static final String SERIALIZED_NAME_BACKLINKS_NOFOLLOW = "backlinks_nofollow";
  @SerializedName(SERIALIZED_NAME_BACKLINKS_NOFOLLOW)
  private Long backlinksNofollow;

  public static final String SERIALIZED_NAME_REFERRING_PAGES = "referring_pages";
  @SerializedName(SERIALIZED_NAME_REFERRING_PAGES)
  private Long referringPages;

  public static final String SERIALIZED_NAME_REFERRING_PAGES_NOFOLLOW = "referring_pages_nofollow";
  @SerializedName(SERIALIZED_NAME_REFERRING_PAGES_NOFOLLOW)
  private Long referringPagesNofollow;

  public static final String SERIALIZED_NAME_REFERRING_DOMAINS = "referring_domains";
  @SerializedName(SERIALIZED_NAME_REFERRING_DOMAINS)
  private Long referringDomains;

  public static final String SERIALIZED_NAME_REFERRING_DOMAINS_NOFOLLOW = "referring_domains_nofollow";
  @SerializedName(SERIALIZED_NAME_REFERRING_DOMAINS_NOFOLLOW)
  private Long referringDomainsNofollow;

  public static final String SERIALIZED_NAME_REFERRING_MAIN_DOMAINS = "referring_main_domains";
  @SerializedName(SERIALIZED_NAME_REFERRING_MAIN_DOMAINS)
  private Long referringMainDomains;

  public static final String SERIALIZED_NAME_REFERRING_MAIN_DOMAINS_NOFOLLOW = "referring_main_domains_nofollow";
  @SerializedName(SERIALIZED_NAME_REFERRING_MAIN_DOMAINS_NOFOLLOW)
  private Long referringMainDomainsNofollow;

  public static final String SERIALIZED_NAME_REFERRING_IPS = "referring_ips";
  @SerializedName(SERIALIZED_NAME_REFERRING_IPS)
  private Long referringIps;

  public static final String SERIALIZED_NAME_REFERRING_SUBNETS = "referring_subnets";
  @SerializedName(SERIALIZED_NAME_REFERRING_SUBNETS)
  private Long referringSubnets;

  public BacklinksTimeseriesSummaryLiveItem() {
  }

  public BacklinksTimeseriesSummaryLiveItem type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type of element
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public BacklinksTimeseriesSummaryLiveItem date(String date) {
    this.date = date;
    return this;
  }

   /**
   * date and time when the data for the target was stored in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2019-11-15 12:57:46 +00:00
   * @return date
  **/
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  public BacklinksTimeseriesSummaryLiveItem rank(Integer rank) {
    this.rank = rank;
    return this;
  }

   /**
   * target rank for the given date learn more about the metric and how it is calculated in this help center article
   * @return rank
  **/
  @javax.annotation.Nullable
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }


  public BacklinksTimeseriesSummaryLiveItem backlinks(Long backlinks) {
    this.backlinks = backlinks;
    return this;
  }

   /**
   * number of backlinks for the given date
   * @return backlinks
  **/
  @javax.annotation.Nullable
  public Long getBacklinks() {
    return backlinks;
  }

  public void setBacklinks(Long backlinks) {
    this.backlinks = backlinks;
  }


  public BacklinksTimeseriesSummaryLiveItem backlinksNofollow(Long backlinksNofollow) {
    this.backlinksNofollow = backlinksNofollow;
    return this;
  }

   /**
   * number of nofollow backlinks for the given date
   * @return backlinksNofollow
  **/
  @javax.annotation.Nullable
  public Long getBacklinksNofollow() {
    return backlinksNofollow;
  }

  public void setBacklinksNofollow(Long backlinksNofollow) {
    this.backlinksNofollow = backlinksNofollow;
  }


  public BacklinksTimeseriesSummaryLiveItem referringPages(Long referringPages) {
    this.referringPages = referringPages;
    return this;
  }

   /**
   * number of pages pointing to target for the given date
   * @return referringPages
  **/
  @javax.annotation.Nullable
  public Long getReferringPages() {
    return referringPages;
  }

  public void setReferringPages(Long referringPages) {
    this.referringPages = referringPages;
  }


  public BacklinksTimeseriesSummaryLiveItem referringPagesNofollow(Long referringPagesNofollow) {
    this.referringPagesNofollow = referringPagesNofollow;
    return this;
  }

   /**
   * number of referring pages pointing at least one nofollow link to the target for the given date
   * @return referringPagesNofollow
  **/
  @javax.annotation.Nullable
  public Long getReferringPagesNofollow() {
    return referringPagesNofollow;
  }

  public void setReferringPagesNofollow(Long referringPagesNofollow) {
    this.referringPagesNofollow = referringPagesNofollow;
  }


  public BacklinksTimeseriesSummaryLiveItem referringDomains(Long referringDomains) {
    this.referringDomains = referringDomains;
    return this;
  }

   /**
   * number of referring domains for the given date referring domains include subdomains that are counted as separate domains for this metric
   * @return referringDomains
  **/
  @javax.annotation.Nullable
  public Long getReferringDomains() {
    return referringDomains;
  }

  public void setReferringDomains(Long referringDomains) {
    this.referringDomains = referringDomains;
  }


  public BacklinksTimeseriesSummaryLiveItem referringDomainsNofollow(Long referringDomainsNofollow) {
    this.referringDomainsNofollow = referringDomainsNofollow;
    return this;
  }

   /**
   * number of domains pointing at least one nofollow link to the target for the given date
   * @return referringDomainsNofollow
  **/
  @javax.annotation.Nullable
  public Long getReferringDomainsNofollow() {
    return referringDomainsNofollow;
  }

  public void setReferringDomainsNofollow(Long referringDomainsNofollow) {
    this.referringDomainsNofollow = referringDomainsNofollow;
  }


  public BacklinksTimeseriesSummaryLiveItem referringMainDomains(Long referringMainDomains) {
    this.referringMainDomains = referringMainDomains;
    return this;
  }

   /**
   * number of referring main domains for the given date
   * @return referringMainDomains
  **/
  @javax.annotation.Nullable
  public Long getReferringMainDomains() {
    return referringMainDomains;
  }

  public void setReferringMainDomains(Long referringMainDomains) {
    this.referringMainDomains = referringMainDomains;
  }


  public BacklinksTimeseriesSummaryLiveItem referringMainDomainsNofollow(Long referringMainDomainsNofollow) {
    this.referringMainDomainsNofollow = referringMainDomainsNofollow;
    return this;
  }

   /**
   * number of main domains pointing at least one nofollow link to the target for the given date
   * @return referringMainDomainsNofollow
  **/
  @javax.annotation.Nullable
  public Long getReferringMainDomainsNofollow() {
    return referringMainDomainsNofollow;
  }

  public void setReferringMainDomainsNofollow(Long referringMainDomainsNofollow) {
    this.referringMainDomainsNofollow = referringMainDomainsNofollow;
  }


  public BacklinksTimeseriesSummaryLiveItem referringIps(Long referringIps) {
    this.referringIps = referringIps;
    return this;
  }

   /**
   * number of referring IP addresses for the given date number of IP addresses pointing to this page
   * @return referringIps
  **/
  @javax.annotation.Nullable
  public Long getReferringIps() {
    return referringIps;
  }

  public void setReferringIps(Long referringIps) {
    this.referringIps = referringIps;
  }


  public BacklinksTimeseriesSummaryLiveItem referringSubnets(Long referringSubnets) {
    this.referringSubnets = referringSubnets;
    return this;
  }

   /**
   * number of referring subnetworks for the given date
   * @return referringSubnets
  **/
  @javax.annotation.Nullable
  public Long getReferringSubnets() {
    return referringSubnets;
  }

  public void setReferringSubnets(Long referringSubnets) {
    this.referringSubnets = referringSubnets;
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
    return Objects.equals(this.type, backlinksTimeseriesSummaryLiveItem.type) &&
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
      if (jsonElement == null) {
        if (!BacklinksTimeseriesSummaryLiveItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BacklinksTimeseriesSummaryLiveItem is not found in the empty JSON string", BacklinksTimeseriesSummaryLiveItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BacklinksTimeseriesSummaryLiveItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BacklinksTimeseriesSummaryLiveItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("date") != null && !jsonObj.get("date").isJsonNull()) && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
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
             elementAdapter.write(out, obj);
           }

           @Override
           public BacklinksTimeseriesSummaryLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BacklinksTimeseriesSummaryLiveItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BacklinksTimeseriesSummaryLiveItem
  * @throws IOException if the JSON string is invalid with respect to BacklinksTimeseriesSummaryLiveItem
  */
  public static BacklinksTimeseriesSummaryLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BacklinksTimeseriesSummaryLiveItem.class);
  }

 /**
  * Convert an instance of BacklinksTimeseriesSummaryLiveItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

