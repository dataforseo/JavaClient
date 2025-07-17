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



public class Dataset  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public Dataset type(String type) {
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


  public static final String SERIALIZED_NAME_RANK_GROUP = "rank_group";
  @SerializedName(SERIALIZED_NAME_RANK_GROUP)
  private Integer rankGroup;

  public Dataset rankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
    return this;
  }

  /**
   * group rank in SERP
* position within a group of elements with identical type values
* positions of elements with different type values are omitted from rank_group
   * @return rankGroup
   */
  @javax.annotation.Nullable
  public Integer getRankGroup() {
    return rankGroup;
  }

  public void setRankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
  }


  public static final String SERIALIZED_NAME_RANK_ABSOLUTE = "rank_absolute";
  @SerializedName(SERIALIZED_NAME_RANK_ABSOLUTE)
  private Integer rankAbsolute;

  public Dataset rankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
    return this;
  }

  /**
   * absolute rank in SERP
* absolute position among all the elements in SERP
   * @return rankAbsolute
   */
  @javax.annotation.Nullable
  public Integer getRankAbsolute() {
    return rankAbsolute;
  }

  public void setRankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
  }


  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private String position;

  public Dataset position(String position) {
    this.position = position;
    return this;
  }

  /**
   * the alignment of the element in SERP
* can take the following values:
* left, right
   * @return position
   */
  @javax.annotation.Nullable
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public static final String SERIALIZED_NAME_XPATH = "xpath";
  @SerializedName(SERIALIZED_NAME_XPATH)
  private String xpath;

  public Dataset xpath(String xpath) {
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


  public static final String SERIALIZED_NAME_DATASET_ID = "dataset_id";
  @SerializedName(SERIALIZED_NAME_DATASET_ID)
  private String datasetId;

  public Dataset datasetId(String datasetId) {
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


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public Dataset title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the element
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public Dataset imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * URL of the image
* the URL leading to the image on the original resource or DataForSEO storage (in case the original source is not available)
   * @return imageUrl
   */
  @javax.annotation.Nullable
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public static final String SERIALIZED_NAME_SCHOLARLY_CITATIONS_COUNT = "scholarly_citations_count";
  @SerializedName(SERIALIZED_NAME_SCHOLARLY_CITATIONS_COUNT)
  private Long scholarlyCitationsCount;

  public Dataset scholarlyCitationsCount(Long scholarlyCitationsCount) {
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


  public static final String SERIALIZED_NAME_SCHOLARLY_ARTICLES_URL = "scholarly_articles_url";
  @SerializedName(SERIALIZED_NAME_SCHOLARLY_ARTICLES_URL)
  private String scholarlyArticlesUrl;

  public Dataset scholarlyArticlesUrl(String scholarlyArticlesUrl) {
    this.scholarlyArticlesUrl = scholarlyArticlesUrl;
    return this;
  }

  /**
   * url of scholarly articles
* link to the list of scholarly articles on Google Scholar
* example: https://scholar.google.com/scholar?q=%2210.6084%20m9%20figshare%207427933%20v1%22
   * @return scholarlyArticlesUrl
   */
  @javax.annotation.Nullable
  public String getScholarlyArticlesUrl() {
    return scholarlyArticlesUrl;
  }

  public void setScholarlyArticlesUrl(String scholarlyArticlesUrl) {
    this.scholarlyArticlesUrl = scholarlyArticlesUrl;
  }


  public static final String SERIALIZED_NAME_UNIQUE_IDENTIFIER = "unique_identifier";
  @SerializedName(SERIALIZED_NAME_UNIQUE_IDENTIFIER)
  private String uniqueIdentifier;

  public Dataset uniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
  }

  /**
   * digital identifier of an object
* unique digital identifier of the dataset
* example: https://doi.org/10.5061/dryad.hmgqnk9m3
   * @return uniqueIdentifier
   */
  @javax.annotation.Nullable
  public String getUniqueIdentifier() {
    return uniqueIdentifier;
  }

  public void setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
  }


  public static final String SERIALIZED_NAME_RELATED_ARTICLE = "related_article";
  @SerializedName(SERIALIZED_NAME_RELATED_ARTICLE)
  private String relatedArticle;

  public Dataset relatedArticle(String relatedArticle) {
    this.relatedArticle = relatedArticle;
    return this;
  }

  /**
   * link to related article
* link to the published article that is related to the dataset
   * @return relatedArticle
   */
  @javax.annotation.Nullable
  public String getRelatedArticle() {
    return relatedArticle;
  }

  public void setRelatedArticle(String relatedArticle) {
    this.relatedArticle = relatedArticle;
  }


  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<LinkElement> links;

  public Dataset links(List<LinkElement> links) {
    this.links = links;
    return this;
  }

  /**
   * sitelinks
* the links shown below some of Google Dataset’s search results
* if there are none, equals null
   * @return links
   */
  @javax.annotation.Nullable
  public List<LinkElement> getLinks() {
    return links;
  }

  public void setLinks(List<LinkElement> links) {
    this.links = links;
  }


  public static final String SERIALIZED_NAME_DATASET_PROVIDERS = "dataset_providers";
  @SerializedName(SERIALIZED_NAME_DATASET_PROVIDERS)
  private List<LicensesElement> datasetProviders;

  public Dataset datasetProviders(List<LicensesElement> datasetProviders) {
    this.datasetProviders = datasetProviders;
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


  public static final String SERIALIZED_NAME_FORMATS = "formats";
  @SerializedName(SERIALIZED_NAME_FORMATS)
  private List<FormatsElement> formats;

  public Dataset formats(List<FormatsElement> formats) {
    this.formats = formats;
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


  public static final String SERIALIZED_NAME_AUTHORS = "authors";
  @SerializedName(SERIALIZED_NAME_AUTHORS)
  private List<AuthorsElement> authors;

  public Dataset authors(List<AuthorsElement> authors) {
    this.authors = authors;
    return this;
  }

  /**
   * the list of authors of the dataset
   * @return authors
   */
  @javax.annotation.Nullable
  public List<AuthorsElement> getAuthors() {
    return authors;
  }

  public void setAuthors(List<AuthorsElement> authors) {
    this.authors = authors;
  }


  public static final String SERIALIZED_NAME_LICENSES = "licenses";
  @SerializedName(SERIALIZED_NAME_LICENSES)
  private List<LicensesElement> licenses;

  public Dataset licenses(List<LicensesElement> licenses) {
    this.licenses = licenses;
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


  public static final String SERIALIZED_NAME_UPDATED_DATE = "updated_date";
  @SerializedName(SERIALIZED_NAME_UPDATED_DATE)
  private String updatedDate;

  public Dataset updatedDate(String updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

  /**
   * date and time when the result was last updated
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2022-11-27 02:00:00 +00:00
   * @return updatedDate
   */
  @javax.annotation.Nullable
  public String getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(String updatedDate) {
    this.updatedDate = updatedDate;
  }


  public static final String SERIALIZED_NAME_AREA_COVERED = "area_covered";
  @SerializedName(SERIALIZED_NAME_AREA_COVERED)
  private List<String> areaCovered;

  public Dataset areaCovered(List<String> areaCovered) {
    this.areaCovered = areaCovered;
    return this;
  }

  /**
   * the list of areas covered in the dataset
* for example: Africa, Global
   * @return areaCovered
   */
  @javax.annotation.Nullable
  public List<String> getAreaCovered() {
    return areaCovered;
  }

  public void setAreaCovered(List<String> areaCovered) {
    this.areaCovered = areaCovered;
  }


  public static final String SERIALIZED_NAME_PERIOD_COVERED = "period_covered";
  @SerializedName(SERIALIZED_NAME_PERIOD_COVERED)
  private PeriodCovered periodCovered;

  public Dataset periodCovered(PeriodCovered periodCovered) {
    this.periodCovered = periodCovered;
    return this;
  }

  /**
   * period covered in the dataset
   * @return periodCovered
   */
  @javax.annotation.Nullable
  public PeriodCovered getPeriodCovered() {
    return periodCovered;
  }

  public void setPeriodCovered(PeriodCovered periodCovered) {
    this.periodCovered = periodCovered;
  }


  public static final String SERIALIZED_NAME_DATASET_DESCRIPTION = "dataset_description";
  @SerializedName(SERIALIZED_NAME_DATASET_DESCRIPTION)
  private DatasetDescription datasetDescription;

  public Dataset datasetDescription(DatasetDescription datasetDescription) {
    this.datasetDescription = datasetDescription;
    return this;
  }

  /**
   * description of the dataset
   * @return datasetDescription
   */
  @javax.annotation.Nullable
  public DatasetDescription getDatasetDescription() {
    return datasetDescription;
  }

  public void setDatasetDescription(DatasetDescription datasetDescription) {
    this.datasetDescription = datasetDescription;
  }



  public Dataset() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public Dataset putAdditionalProperty(String key, Object value) {
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


    
    Dataset dataset = (Dataset) o;
    return

        Objects.equals(this.type, dataset.type) &&
        Objects.equals(this.rankGroup, dataset.rankGroup) &&
        Objects.equals(this.rankAbsolute, dataset.rankAbsolute) &&
        Objects.equals(this.position, dataset.position) &&
        Objects.equals(this.xpath, dataset.xpath) &&
        Objects.equals(this.datasetId, dataset.datasetId) &&
        Objects.equals(this.title, dataset.title) &&
        Objects.equals(this.imageUrl, dataset.imageUrl) &&
        Objects.equals(this.scholarlyCitationsCount, dataset.scholarlyCitationsCount) &&
        Objects.equals(this.scholarlyArticlesUrl, dataset.scholarlyArticlesUrl) &&
        Objects.equals(this.uniqueIdentifier, dataset.uniqueIdentifier) &&
        Objects.equals(this.relatedArticle, dataset.relatedArticle) &&
        Objects.equals(this.links, dataset.links) &&
        Objects.equals(this.datasetProviders, dataset.datasetProviders) &&
        Objects.equals(this.formats, dataset.formats) &&
        Objects.equals(this.authors, dataset.authors) &&
        Objects.equals(this.licenses, dataset.licenses) &&
        Objects.equals(this.updatedDate, dataset.updatedDate) &&
        Objects.equals(this.areaCovered, dataset.areaCovered) &&
        Objects.equals(this.periodCovered, dataset.periodCovered) &&
        Objects.equals(this.datasetDescription, dataset.datasetDescription);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, rankGroup, rankAbsolute, position, xpath, datasetId, title, imageUrl, scholarlyCitationsCount, scholarlyArticlesUrl, uniqueIdentifier, relatedArticle, links, datasetProviders, formats, authors, licenses, updatedDate, areaCovered, periodCovered, datasetDescription);
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
    sb.append("class Dataset {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    scholarlyCitationsCount: ").append(toIndentedString(scholarlyCitationsCount)).append("\n");
    sb.append("    scholarlyArticlesUrl: ").append(toIndentedString(scholarlyArticlesUrl)).append("\n");
    sb.append("    uniqueIdentifier: ").append(toIndentedString(uniqueIdentifier)).append("\n");
    sb.append("    relatedArticle: ").append(toIndentedString(relatedArticle)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    datasetProviders: ").append(toIndentedString(datasetProviders)).append("\n");
    sb.append("    formats: ").append(toIndentedString(formats)).append("\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    licenses: ").append(toIndentedString(licenses)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    areaCovered: ").append(toIndentedString(areaCovered)).append("\n");
    sb.append("    periodCovered: ").append(toIndentedString(periodCovered)).append("\n");
    sb.append("    datasetDescription: ").append(toIndentedString(datasetDescription)).append("\n");
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
    
    openapiFields.add("scholarly_articles_url");
    
    openapiFields.add("unique_identifier");
    
    openapiFields.add("related_article");
    
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
   * @throws IOException if the JSON Element is invalid with respect to Dataset
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dataset.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dataset' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dataset> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dataset.class));

       return (TypeAdapter<T>) new TypeAdapter<Dataset>() {
           @Override
           public void write(JsonWriter out, Dataset value) throws IOException {
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
           public Dataset read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Dataset instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static Dataset fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dataset.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}