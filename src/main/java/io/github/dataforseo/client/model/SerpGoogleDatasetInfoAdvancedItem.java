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
import io.github.dataforseo.client.model.DatasetDescription;
import io.github.dataforseo.client.model.FormatsElement;
import io.github.dataforseo.client.model.LicensesElement;
import io.github.dataforseo.client.model.LinkElement;
import io.github.dataforseo.client.model.PeriodCovered;
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
 * SerpGoogleDatasetInfoAdvancedItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T19:08:02.252153200+03:00[Europe/Kiev]", comments = "Generator version: 7.8.0")
public class SerpGoogleDatasetInfoAdvancedItem {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_RANK_GROUP = "rank_group";
  @SerializedName(SERIALIZED_NAME_RANK_GROUP)
  private Integer rankGroup;

  public static final String SERIALIZED_NAME_RANK_ABSOLUTE = "rank_absolute";
  @SerializedName(SERIALIZED_NAME_RANK_ABSOLUTE)
  private Integer rankAbsolute;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private String position;

  public static final String SERIALIZED_NAME_XPATH = "xpath";
  @SerializedName(SERIALIZED_NAME_XPATH)
  private String xpath;

  public static final String SERIALIZED_NAME_DATASET_ID = "dataset_id";
  @SerializedName(SERIALIZED_NAME_DATASET_ID)
  private String datasetId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_SCHOLARLY_CITATIONS_COUNT = "scholarly_citations_count";
  @SerializedName(SERIALIZED_NAME_SCHOLARLY_CITATIONS_COUNT)
  private Long scholarlyCitationsCount;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<LinkElement> links;

  public static final String SERIALIZED_NAME_DATASET_PROVIDERS = "dataset_providers";
  @SerializedName(SERIALIZED_NAME_DATASET_PROVIDERS)
  private List<LicensesElement> datasetProviders;

  public static final String SERIALIZED_NAME_FORMATS = "formats";
  @SerializedName(SERIALIZED_NAME_FORMATS)
  private List<FormatsElement> formats;

  public static final String SERIALIZED_NAME_AUTHORS = "authors";
  @SerializedName(SERIALIZED_NAME_AUTHORS)
  private Object authors;

  public static final String SERIALIZED_NAME_LICENSES = "licenses";
  @SerializedName(SERIALIZED_NAME_LICENSES)
  private List<LicensesElement> licenses;

  public static final String SERIALIZED_NAME_UPDATED_DATE = "updated_date";
  @SerializedName(SERIALIZED_NAME_UPDATED_DATE)
  private String updatedDate;

  public static final String SERIALIZED_NAME_AREA_COVERED = "area_covered";
  @SerializedName(SERIALIZED_NAME_AREA_COVERED)
  private Object areaCovered;

  public static final String SERIALIZED_NAME_PERIOD_COVERED = "period_covered";
  @SerializedName(SERIALIZED_NAME_PERIOD_COVERED)
  private PeriodCovered periodCovered;

  public static final String SERIALIZED_NAME_DATASET_DESCRIPTION = "dataset_description";
  @SerializedName(SERIALIZED_NAME_DATASET_DESCRIPTION)
  private DatasetDescription datasetDescription;

  public SerpGoogleDatasetInfoAdvancedItem() {
  }

  public SerpGoogleDatasetInfoAdvancedItem type(String type) {
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


  public SerpGoogleDatasetInfoAdvancedItem rankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
    return this;
  }

  /**
   * group rank in SERP position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group
   * @return rankGroup
   */
  @javax.annotation.Nullable
  public Integer getRankGroup() {
    return rankGroup;
  }

  public void setRankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
  }


  public SerpGoogleDatasetInfoAdvancedItem rankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
    return this;
  }

  /**
   * absolute rank in SERP absolute position among all the elements in SERP
   * @return rankAbsolute
   */
  @javax.annotation.Nullable
  public Integer getRankAbsolute() {
    return rankAbsolute;
  }

  public void setRankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
  }


  public SerpGoogleDatasetInfoAdvancedItem position(String position) {
    this.position = position;
    return this;
  }

  /**
   * the alignment of the element in SERP can take the following values: left, right
   * @return position
   */
  @javax.annotation.Nullable
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public SerpGoogleDatasetInfoAdvancedItem xpath(String xpath) {
    this.xpath = xpath;
    return this;
  }

  /**
   * the XPath of the element
   * @return xpath
   */
  @javax.annotation.Nullable
  public String getXpath() {
    return xpath;
  }

  public void setXpath(String xpath) {
    this.xpath = xpath;
  }


  public SerpGoogleDatasetInfoAdvancedItem datasetId(String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * ID of the dataset
   * @return datasetId
   */
  @javax.annotation.Nullable
  public String getDatasetId() {
    return datasetId;
  }

  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }


  public SerpGoogleDatasetInfoAdvancedItem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the result in SERP
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public SerpGoogleDatasetInfoAdvancedItem imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * URL of the image the URL leading to the image on the original resource or DataForSEO storage (in case the original source is not available)
   * @return imageUrl
   */
  @javax.annotation.Nullable
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public SerpGoogleDatasetInfoAdvancedItem scholarlyCitationsCount(Long scholarlyCitationsCount) {
    this.scholarlyCitationsCount = scholarlyCitationsCount;
    return this;
  }

  /**
   * count of articles that refer to the dataset
   * @return scholarlyCitationsCount
   */
  @javax.annotation.Nullable
  public Long getScholarlyCitationsCount() {
    return scholarlyCitationsCount;
  }

  public void setScholarlyCitationsCount(Long scholarlyCitationsCount) {
    this.scholarlyCitationsCount = scholarlyCitationsCount;
  }


  public SerpGoogleDatasetInfoAdvancedItem links(List<LinkElement> links) {
    this.links = links;
    return this;
  }

  public SerpGoogleDatasetInfoAdvancedItem addLinksItem(LinkElement linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * sitelinks the links shown below some of Google Dataset’s search results if there are none, equals null
   * @return links
   */
  @javax.annotation.Nullable
  public List<LinkElement> getLinks() {
    return links;
  }

  public void setLinks(List<LinkElement> links) {
    this.links = links;
  }


  public SerpGoogleDatasetInfoAdvancedItem datasetProviders(List<LicensesElement> datasetProviders) {
    this.datasetProviders = datasetProviders;
    return this;
  }

  public SerpGoogleDatasetInfoAdvancedItem addDatasetProvidersItem(LicensesElement datasetProvidersItem) {
    if (this.datasetProviders == null) {
      this.datasetProviders = new ArrayList<>();
    }
    this.datasetProviders.add(datasetProvidersItem);
    return this;
  }

  /**
   * the list of institutions that provided the dataset
   * @return datasetProviders
   */
  @javax.annotation.Nullable
  public List<LicensesElement> getDatasetProviders() {
    return datasetProviders;
  }

  public void setDatasetProviders(List<LicensesElement> datasetProviders) {
    this.datasetProviders = datasetProviders;
  }


  public SerpGoogleDatasetInfoAdvancedItem formats(List<FormatsElement> formats) {
    this.formats = formats;
    return this;
  }

  public SerpGoogleDatasetInfoAdvancedItem addFormatsItem(FormatsElement formatsItem) {
    if (this.formats == null) {
      this.formats = new ArrayList<>();
    }
    this.formats.add(formatsItem);
    return this;
  }

  /**
   * the list of file formats of the dataset
   * @return formats
   */
  @javax.annotation.Nullable
  public List<FormatsElement> getFormats() {
    return formats;
  }

  public void setFormats(List<FormatsElement> formats) {
    this.formats = formats;
  }


  public SerpGoogleDatasetInfoAdvancedItem authors(Object authors) {
    this.authors = authors;
    return this;
  }

  /**
   * the list of authors of the dataset
   * @return authors
   */
  @javax.annotation.Nullable
  public Object getAuthors() {
    return authors;
  }

  public void setAuthors(Object authors) {
    this.authors = authors;
  }


  public SerpGoogleDatasetInfoAdvancedItem licenses(List<LicensesElement> licenses) {
    this.licenses = licenses;
    return this;
  }

  public SerpGoogleDatasetInfoAdvancedItem addLicensesItem(LicensesElement licensesItem) {
    if (this.licenses == null) {
      this.licenses = new ArrayList<>();
    }
    this.licenses.add(licensesItem);
    return this;
  }

  /**
   * the list of licenses issued to the dataset
   * @return licenses
   */
  @javax.annotation.Nullable
  public List<LicensesElement> getLicenses() {
    return licenses;
  }

  public void setLicenses(List<LicensesElement> licenses) {
    this.licenses = licenses;
  }


  public SerpGoogleDatasetInfoAdvancedItem updatedDate(String updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

  /**
   * date and time when the result was last updated in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00” example: 2022-11-27 02:00:00 +00:00
   * @return updatedDate
   */
  @javax.annotation.Nullable
  public String getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(String updatedDate) {
    this.updatedDate = updatedDate;
  }


  public SerpGoogleDatasetInfoAdvancedItem areaCovered(Object areaCovered) {
    this.areaCovered = areaCovered;
    return this;
  }

  /**
   * the list of areas covered in the dataset for example: Africa, Global
   * @return areaCovered
   */
  @javax.annotation.Nullable
  public Object getAreaCovered() {
    return areaCovered;
  }

  public void setAreaCovered(Object areaCovered) {
    this.areaCovered = areaCovered;
  }


  public SerpGoogleDatasetInfoAdvancedItem periodCovered(PeriodCovered periodCovered) {
    this.periodCovered = periodCovered;
    return this;
  }

  /**
   * Get periodCovered
   * @return periodCovered
   */
  @javax.annotation.Nullable
  public PeriodCovered getPeriodCovered() {
    return periodCovered;
  }

  public void setPeriodCovered(PeriodCovered periodCovered) {
    this.periodCovered = periodCovered;
  }


  public SerpGoogleDatasetInfoAdvancedItem datasetDescription(DatasetDescription datasetDescription) {
    this.datasetDescription = datasetDescription;
    return this;
  }

  /**
   * Get datasetDescription
   * @return datasetDescription
   */
  @javax.annotation.Nullable
  public DatasetDescription getDatasetDescription() {
    return datasetDescription;
  }

  public void setDatasetDescription(DatasetDescription datasetDescription) {
    this.datasetDescription = datasetDescription;
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
   * @return the SerpGoogleDatasetInfoAdvancedItem instance itself
   */
  public SerpGoogleDatasetInfoAdvancedItem putAdditionalProperty(String key, Object value) {
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
    SerpGoogleDatasetInfoAdvancedItem serpGoogleDatasetInfoAdvancedItem = (SerpGoogleDatasetInfoAdvancedItem) o;
    return Objects.equals(this.type, serpGoogleDatasetInfoAdvancedItem.type) &&
        Objects.equals(this.rankGroup, serpGoogleDatasetInfoAdvancedItem.rankGroup) &&
        Objects.equals(this.rankAbsolute, serpGoogleDatasetInfoAdvancedItem.rankAbsolute) &&
        Objects.equals(this.position, serpGoogleDatasetInfoAdvancedItem.position) &&
        Objects.equals(this.xpath, serpGoogleDatasetInfoAdvancedItem.xpath) &&
        Objects.equals(this.datasetId, serpGoogleDatasetInfoAdvancedItem.datasetId) &&
        Objects.equals(this.title, serpGoogleDatasetInfoAdvancedItem.title) &&
        Objects.equals(this.imageUrl, serpGoogleDatasetInfoAdvancedItem.imageUrl) &&
        Objects.equals(this.scholarlyCitationsCount, serpGoogleDatasetInfoAdvancedItem.scholarlyCitationsCount) &&
        Objects.equals(this.links, serpGoogleDatasetInfoAdvancedItem.links) &&
        Objects.equals(this.datasetProviders, serpGoogleDatasetInfoAdvancedItem.datasetProviders) &&
        Objects.equals(this.formats, serpGoogleDatasetInfoAdvancedItem.formats) &&
        Objects.equals(this.authors, serpGoogleDatasetInfoAdvancedItem.authors) &&
        Objects.equals(this.licenses, serpGoogleDatasetInfoAdvancedItem.licenses) &&
        Objects.equals(this.updatedDate, serpGoogleDatasetInfoAdvancedItem.updatedDate) &&
        Objects.equals(this.areaCovered, serpGoogleDatasetInfoAdvancedItem.areaCovered) &&
        Objects.equals(this.periodCovered, serpGoogleDatasetInfoAdvancedItem.periodCovered) &&
        Objects.equals(this.datasetDescription, serpGoogleDatasetInfoAdvancedItem.datasetDescription)&&
        Objects.equals(this.additionalProperties, serpGoogleDatasetInfoAdvancedItem.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, rankGroup, rankAbsolute, position, xpath, datasetId, title, imageUrl, scholarlyCitationsCount, links, datasetProviders, formats, authors, licenses, updatedDate, areaCovered, periodCovered, datasetDescription, additionalProperties);
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
    sb.append("class SerpGoogleDatasetInfoAdvancedItem {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    scholarlyCitationsCount: ").append(toIndentedString(scholarlyCitationsCount)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    datasetProviders: ").append(toIndentedString(datasetProviders)).append("\n");
    sb.append("    formats: ").append(toIndentedString(formats)).append("\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    licenses: ").append(toIndentedString(licenses)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    areaCovered: ").append(toIndentedString(areaCovered)).append("\n");
    sb.append("    periodCovered: ").append(toIndentedString(periodCovered)).append("\n");
    sb.append("    datasetDescription: ").append(toIndentedString(datasetDescription)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("rank_group");
    openapiFields.add("rank_absolute");
    openapiFields.add("position");
    openapiFields.add("xpath");
    openapiFields.add("dataset_id");
    openapiFields.add("title");
    openapiFields.add("image_url");
    openapiFields.add("scholarly_citations_count");
    openapiFields.add("links");
    openapiFields.add("dataset_providers");
    openapiFields.add("formats");
    openapiFields.add("authors");
    openapiFields.add("licenses");
    openapiFields.add("updated_date");
    openapiFields.add("area_covered");
    openapiFields.add("period_covered");
    openapiFields.add("dataset_description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SerpGoogleDatasetInfoAdvancedItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SerpGoogleDatasetInfoAdvancedItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SerpGoogleDatasetInfoAdvancedItem is not found in the empty JSON string", SerpGoogleDatasetInfoAdvancedItem.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("position") != null && !jsonObj.get("position").isJsonNull()) && !jsonObj.get("position").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `position` to be a primitive type in the JSON string but got `%s`", jsonObj.get("position").toString()));
      }
      if ((jsonObj.get("xpath") != null && !jsonObj.get("xpath").isJsonNull()) && !jsonObj.get("xpath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xpath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xpath").toString()));
      }
      if ((jsonObj.get("dataset_id") != null && !jsonObj.get("dataset_id").isJsonNull()) && !jsonObj.get("dataset_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataset_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataset_id").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("image_url") != null && !jsonObj.get("image_url").isJsonNull()) && !jsonObj.get("image_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image_url").toString()));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            LinkElement.validateJsonElement(jsonArraylinks.get(i));
          };
        }
      }
      if (jsonObj.get("dataset_providers") != null && !jsonObj.get("dataset_providers").isJsonNull()) {
        JsonArray jsonArraydatasetProviders = jsonObj.getAsJsonArray("dataset_providers");
        if (jsonArraydatasetProviders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dataset_providers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dataset_providers` to be an array in the JSON string but got `%s`", jsonObj.get("dataset_providers").toString()));
          }

          // validate the optional field `dataset_providers` (array)
          for (int i = 0; i < jsonArraydatasetProviders.size(); i++) {
            LicensesElement.validateJsonElement(jsonArraydatasetProviders.get(i));
          };
        }
      }
      if (jsonObj.get("formats") != null && !jsonObj.get("formats").isJsonNull()) {
        JsonArray jsonArrayformats = jsonObj.getAsJsonArray("formats");
        if (jsonArrayformats != null) {
          // ensure the json data is an array
          if (!jsonObj.get("formats").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `formats` to be an array in the JSON string but got `%s`", jsonObj.get("formats").toString()));
          }

          // validate the optional field `formats` (array)
          for (int i = 0; i < jsonArrayformats.size(); i++) {
            FormatsElement.validateJsonElement(jsonArrayformats.get(i));
          };
        }
      }
      if (jsonObj.get("licenses") != null && !jsonObj.get("licenses").isJsonNull()) {
        JsonArray jsonArraylicenses = jsonObj.getAsJsonArray("licenses");
        if (jsonArraylicenses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("licenses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `licenses` to be an array in the JSON string but got `%s`", jsonObj.get("licenses").toString()));
          }

          // validate the optional field `licenses` (array)
          for (int i = 0; i < jsonArraylicenses.size(); i++) {
            LicensesElement.validateJsonElement(jsonArraylicenses.get(i));
          };
        }
      }
      if ((jsonObj.get("updated_date") != null && !jsonObj.get("updated_date").isJsonNull()) && !jsonObj.get("updated_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_date").toString()));
      }
      // validate the optional field `period_covered`
      if (jsonObj.get("period_covered") != null && !jsonObj.get("period_covered").isJsonNull()) {
        PeriodCovered.validateJsonElement(jsonObj.get("period_covered"));
      }
      // validate the optional field `dataset_description`
      if (jsonObj.get("dataset_description") != null && !jsonObj.get("dataset_description").isJsonNull()) {
        DatasetDescription.validateJsonElement(jsonObj.get("dataset_description"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpGoogleDatasetInfoAdvancedItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpGoogleDatasetInfoAdvancedItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpGoogleDatasetInfoAdvancedItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpGoogleDatasetInfoAdvancedItem.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpGoogleDatasetInfoAdvancedItem>() {
           @Override
           public void write(JsonWriter out, SerpGoogleDatasetInfoAdvancedItem value) throws IOException {
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
           public SerpGoogleDatasetInfoAdvancedItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SerpGoogleDatasetInfoAdvancedItem instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of SerpGoogleDatasetInfoAdvancedItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SerpGoogleDatasetInfoAdvancedItem
   * @throws IOException if the JSON string is invalid with respect to SerpGoogleDatasetInfoAdvancedItem
   */
  public static SerpGoogleDatasetInfoAdvancedItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpGoogleDatasetInfoAdvancedItem.class);
  }

  /**
   * Convert an instance of SerpGoogleDatasetInfoAdvancedItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
