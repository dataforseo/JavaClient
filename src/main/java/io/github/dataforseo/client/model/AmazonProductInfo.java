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



public class AmazonProductInfo  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AmazonProductInfo type(String type) {
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

  public AmazonProductInfo rankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
    return this;
  }

  /**
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

  public AmazonProductInfo rankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
    return this;
  }

  /**
   * absolute rank
* absolute position among all the elements in the response array
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

  public AmazonProductInfo position(String position) {
    this.position = position;
    return this;
  }

  /**
   * the alignment of the element in Amazon SERP
* possible values:
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

  public AmazonProductInfo xpath(String xpath) {
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


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public AmazonProductInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * product title
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  public AmazonProductInfo details(String details) {
    this.details = details;
    return this;
  }

  /**
   * product specs and other details
   * @return details
   */
  @javax.annotation.Nullable
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }


  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public AmazonProductInfo imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * the URL of the product image
   * @return imageUrl
   */
  @javax.annotation.Nullable
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public AmazonProductInfo author(String author) {
    this.author = author;
    return this;
  }

  /**
   * product brand name
   * @return author
   */
  @javax.annotation.Nullable
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public static final String SERIALIZED_NAME_DATA_ASIN = "data_asin";
  @SerializedName(SERIALIZED_NAME_DATA_ASIN)
  private String dataAsin;

  public AmazonProductInfo dataAsin(String dataAsin) {
    this.dataAsin = dataAsin;
    return this;
  }

  /**
   * ASIN of the product received in a POST array
   * @return dataAsin
   */
  @javax.annotation.Nullable
  public String getDataAsin() {
    return dataAsin;
  }

  public void setDataAsin(String dataAsin) {
    this.dataAsin = dataAsin;
  }


  public static final String SERIALIZED_NAME_PARENT_ASIN = "parent_asin";
  @SerializedName(SERIALIZED_NAME_PARENT_ASIN)
  private String parentAsin;

  public AmazonProductInfo parentAsin(String parentAsin) {
    this.parentAsin = parentAsin;
    return this;
  }

  /**
   * parent ASIN of the product
   * @return parentAsin
   */
  @javax.annotation.Nullable
  public String getParentAsin() {
    return parentAsin;
  }

  public void setParentAsin(String parentAsin) {
    this.parentAsin = parentAsin;
  }


  public static final String SERIALIZED_NAME_PRODUCT_ASINS = "product_asins";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ASINS)
  private List<String> productAsins;

  public AmazonProductInfo productAsins(List<String> productAsins) {
    this.productAsins = productAsins;
    return this;
  }

  /**
   * ASINs of all found product modifications
   * @return productAsins
   */
  @javax.annotation.Nullable
  public List<String> getProductAsins() {
    return productAsins;
  }

  public void setProductAsins(List<String> productAsins) {
    this.productAsins = productAsins;
  }


  public static final String SERIALIZED_NAME_PRICE_FROM = "price_from";
  @SerializedName(SERIALIZED_NAME_PRICE_FROM)
  private Double priceFrom;

  public AmazonProductInfo priceFrom(Double priceFrom) {
    this.priceFrom = priceFrom;
    return this;
  }

  /**
   * the lower limit of the product price range
* example:
* 49.98
   * @return priceFrom
   */
  @javax.annotation.Nullable
  public Double getPriceFrom() {
    return priceFrom;
  }

  public void setPriceFrom(Double priceFrom) {
    this.priceFrom = priceFrom;
  }


  public static final String SERIALIZED_NAME_PRICE_TO = "price_to";
  @SerializedName(SERIALIZED_NAME_PRICE_TO)
  private Double priceTo;

  public AmazonProductInfo priceTo(Double priceTo) {
    this.priceTo = priceTo;
    return this;
  }

  /**
   * the upper limit of the product price range
* example:
* 384.99
   * @return priceTo
   */
  @javax.annotation.Nullable
  public Double getPriceTo() {
    return priceTo;
  }

  public void setPriceTo(Double priceTo) {
    this.priceTo = priceTo;
  }


  public static final String SERIALIZED_NAME_PERCENTAGE_DISCOUNT = "percentage_discount";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE_DISCOUNT)
  private String percentageDiscount;

  public AmazonProductInfo percentageDiscount(String percentageDiscount) {
    this.percentageDiscount = percentageDiscount;
    return this;
  }

  /**
   * value of the percentage discount
   * @return percentageDiscount
   */
  @javax.annotation.Nullable
  public String getPercentageDiscount() {
    return percentageDiscount;
  }

  public void setPercentageDiscount(String percentageDiscount) {
    this.percentageDiscount = percentageDiscount;
  }


  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public AmazonProductInfo currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * currency in the ISO format
* example:
* USD
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public static final String SERIALIZED_NAME_IS_AMAZON_CHOICE = "is_amazon_choice";
  @SerializedName(SERIALIZED_NAME_IS_AMAZON_CHOICE)
  private Boolean isAmazonChoice;

  public AmazonProductInfo isAmazonChoice(Boolean isAmazonChoice) {
    this.isAmazonChoice = isAmazonChoice;
    return this;
  }

  /**
   * “Amazon’s choice” label
* if the value is true, the product is marked with the “Amazon’s choice” label
   * @return isAmazonChoice
   */
  @javax.annotation.Nullable
  public Boolean getIsAmazonChoice() {
    return isAmazonChoice;
  }

  public void setIsAmazonChoice(Boolean isAmazonChoice) {
    this.isAmazonChoice = isAmazonChoice;
  }


  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private RatingElement rating;

  public AmazonProductInfo rating(RatingElement rating) {
    this.rating = rating;
    return this;
  }

  /**
   * product rating info
   * @return rating
   */
  @javax.annotation.Nullable
  public RatingElement getRating() {
    return rating;
  }

  public void setRating(RatingElement rating) {
    this.rating = rating;
  }


  public static final String SERIALIZED_NAME_IS_NEWER_MODEL_AVAILABLE = "is_newer_model_available";
  @SerializedName(SERIALIZED_NAME_IS_NEWER_MODEL_AVAILABLE)
  private Boolean isNewerModelAvailable;

  public AmazonProductInfo isNewerModelAvailable(Boolean isNewerModelAvailable) {
    this.isNewerModelAvailable = isNewerModelAvailable;
    return this;
  }

  /**
   * indicates whether the newer model of the product is available
   * @return isNewerModelAvailable
   */
  @javax.annotation.Nullable
  public Boolean getIsNewerModelAvailable() {
    return isNewerModelAvailable;
  }

  public void setIsNewerModelAvailable(Boolean isNewerModelAvailable) {
    this.isNewerModelAvailable = isNewerModelAvailable;
  }


  public static final String SERIALIZED_NAME_APPLICABLE_VOUCHERS = "applicable_vouchers";
  @SerializedName(SERIALIZED_NAME_APPLICABLE_VOUCHERS)
  private List<AmazonApplicableVouchersItem> applicableVouchers;

  public AmazonProductInfo applicableVouchers(List<AmazonApplicableVouchersItem> applicableVouchers) {
    this.applicableVouchers = applicableVouchers;
    return this;
  }

  /**
   * array of objects containing information about applicable vouchers
   * @return applicableVouchers
   */
  @javax.annotation.Nullable
  public List<AmazonApplicableVouchersItem> getApplicableVouchers() {
    return applicableVouchers;
  }

  public void setApplicableVouchers(List<AmazonApplicableVouchersItem> applicableVouchers) {
    this.applicableVouchers = applicableVouchers;
  }


  public static final String SERIALIZED_NAME_NEWER_MODEL = "newer_model";
  @SerializedName(SERIALIZED_NAME_NEWER_MODEL)
  private AmazonProductNewerModelInfo newerModel;

  public AmazonProductInfo newerModel(AmazonProductNewerModelInfo newerModel) {
    this.newerModel = newerModel;
    return this;
  }

  /**
   * information about the newer model of the product
   * @return newerModel
   */
  @javax.annotation.Nullable
  public AmazonProductNewerModelInfo getNewerModel() {
    return newerModel;
  }

  public void setNewerModel(AmazonProductNewerModelInfo newerModel) {
    this.newerModel = newerModel;
  }


  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<ProductCategoryInfo> categories;

  public AmazonProductInfo categories(List<ProductCategoryInfo> categories) {
    this.categories = categories;
    return this;
  }

  /**
   * contains related product categories
   * @return categories
   */
  @javax.annotation.Nullable
  public List<ProductCategoryInfo> getCategories() {
    return categories;
  }

  public void setCategories(List<ProductCategoryInfo> categories) {
    this.categories = categories;
  }


  public static final String SERIALIZED_NAME_PRODUCT_INFORMATION = "product_information";
  @SerializedName(SERIALIZED_NAME_PRODUCT_INFORMATION)
  private List<BaseMerchantAmazonProductInformationElementItem> productInformation;

  public AmazonProductInfo productInformation(List<BaseMerchantAmazonProductInformationElementItem> productInformation) {
    this.productInformation = productInformation;
    return this;
  }

  /**
   * contains related product information
   * @return productInformation
   */
  @javax.annotation.Nullable
  public List<BaseMerchantAmazonProductInformationElementItem> getProductInformation() {
    return productInformation;
  }

  public void setProductInformation(List<BaseMerchantAmazonProductInformationElementItem> productInformation) {
    this.productInformation = productInformation;
  }


  public static final String SERIALIZED_NAME_PRODUCT_IMAGES_LIST = "product_images_list";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMAGES_LIST)
  private List<String> productImagesList;

  public AmazonProductInfo productImagesList(List<String> productImagesList) {
    this.productImagesList = productImagesList;
    return this;
  }

  /**
   * contains URLs for all images of the product displayed on the left side of the main image
   * @return productImagesList
   */
  @javax.annotation.Nullable
  public List<String> getProductImagesList() {
    return productImagesList;
  }

  public void setProductImagesList(List<String> productImagesList) {
    this.productImagesList = productImagesList;
  }


  public static final String SERIALIZED_NAME_PRODUCT_VIDEOS_LIST = "product_videos_list";
  @SerializedName(SERIALIZED_NAME_PRODUCT_VIDEOS_LIST)
  private List<String> productVideosList;

  public AmazonProductInfo productVideosList(List<String> productVideosList) {
    this.productVideosList = productVideosList;
    return this;
  }

  /**
   * contains URLs for all videos of the product displayed on the right side of the main video
   * @return productVideosList
   */
  @javax.annotation.Nullable
  public List<String> getProductVideosList() {
    return productVideosList;
  }

  public void setProductVideosList(List<String> productVideosList) {
    this.productVideosList = productVideosList;
  }


  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public AmazonProductInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * contains description of the product
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public static final String SERIALIZED_NAME_IS_AVAILABLE = "is_available";
  @SerializedName(SERIALIZED_NAME_IS_AVAILABLE)
  private Boolean isAvailable;

  public AmazonProductInfo isAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
    return this;
  }

  /**
   * indicates whether the product is available for ordering
* if the value is true, the product can be ordered
   * @return isAvailable
   */
  @javax.annotation.Nullable
  public Boolean getIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
  }


  public static final String SERIALIZED_NAME_TOP_LOCAL_REVIEWS = "top_local_reviews";
  @SerializedName(SERIALIZED_NAME_TOP_LOCAL_REVIEWS)
  private List<AmazonReviewItem> topLocalReviews;

  public AmazonProductInfo topLocalReviews(List<AmazonReviewItem> topLocalReviews) {
    this.topLocalReviews = topLocalReviews;
    return this;
  }

  /**
   * array of objects with top reviews from target location
   * @return topLocalReviews
   */
  @javax.annotation.Nullable
  public List<AmazonReviewItem> getTopLocalReviews() {
    return topLocalReviews;
  }

  public void setTopLocalReviews(List<AmazonReviewItem> topLocalReviews) {
    this.topLocalReviews = topLocalReviews;
  }


  public static final String SERIALIZED_NAME_TOP_GLOBAL_REVIEWS = "top_global_reviews";
  @SerializedName(SERIALIZED_NAME_TOP_GLOBAL_REVIEWS)
  private List<AmazonReviewItem> topGlobalReviews;

  public AmazonProductInfo topGlobalReviews(List<AmazonReviewItem> topGlobalReviews) {
    this.topGlobalReviews = topGlobalReviews;
    return this;
  }

  /**
   * array of objects with top reviews from around the world
   * @return topGlobalReviews
   */
  @javax.annotation.Nullable
  public List<AmazonReviewItem> getTopGlobalReviews() {
    return topGlobalReviews;
  }

  public void setTopGlobalReviews(List<AmazonReviewItem> topGlobalReviews) {
    this.topGlobalReviews = topGlobalReviews;
  }



  public AmazonProductInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AmazonProductInfo putAdditionalProperty(String key, Object value) {
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


    
    AmazonProductInfo amazonProductInfo = (AmazonProductInfo) o;
    return

        Objects.equals(this.type, amazonProductInfo.type) &&
        Objects.equals(this.rankGroup, amazonProductInfo.rankGroup) &&
        Objects.equals(this.rankAbsolute, amazonProductInfo.rankAbsolute) &&
        Objects.equals(this.position, amazonProductInfo.position) &&
        Objects.equals(this.xpath, amazonProductInfo.xpath) &&
        Objects.equals(this.title, amazonProductInfo.title) &&
        Objects.equals(this.details, amazonProductInfo.details) &&
        Objects.equals(this.imageUrl, amazonProductInfo.imageUrl) &&
        Objects.equals(this.author, amazonProductInfo.author) &&
        Objects.equals(this.dataAsin, amazonProductInfo.dataAsin) &&
        Objects.equals(this.parentAsin, amazonProductInfo.parentAsin) &&
        Objects.equals(this.productAsins, amazonProductInfo.productAsins) &&
        Objects.equals(this.priceFrom, amazonProductInfo.priceFrom) &&
        Objects.equals(this.priceTo, amazonProductInfo.priceTo) &&
        Objects.equals(this.percentageDiscount, amazonProductInfo.percentageDiscount) &&
        Objects.equals(this.currency, amazonProductInfo.currency) &&
        Objects.equals(this.isAmazonChoice, amazonProductInfo.isAmazonChoice) &&
        Objects.equals(this.rating, amazonProductInfo.rating) &&
        Objects.equals(this.isNewerModelAvailable, amazonProductInfo.isNewerModelAvailable) &&
        Objects.equals(this.applicableVouchers, amazonProductInfo.applicableVouchers) &&
        Objects.equals(this.newerModel, amazonProductInfo.newerModel) &&
        Objects.equals(this.categories, amazonProductInfo.categories) &&
        Objects.equals(this.productInformation, amazonProductInfo.productInformation) &&
        Objects.equals(this.productImagesList, amazonProductInfo.productImagesList) &&
        Objects.equals(this.productVideosList, amazonProductInfo.productVideosList) &&
        Objects.equals(this.description, amazonProductInfo.description) &&
        Objects.equals(this.isAvailable, amazonProductInfo.isAvailable) &&
        Objects.equals(this.topLocalReviews, amazonProductInfo.topLocalReviews) &&
        Objects.equals(this.topGlobalReviews, amazonProductInfo.topGlobalReviews);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, rankGroup, rankAbsolute, position, xpath, title, details, imageUrl, author, dataAsin, parentAsin, productAsins, priceFrom, priceTo, percentageDiscount, currency, isAmazonChoice, rating, isNewerModelAvailable, applicableVouchers, newerModel, categories, productInformation, productImagesList, productVideosList, description, isAvailable, topLocalReviews, topGlobalReviews);
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
    sb.append("class AmazonProductInfo {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    dataAsin: ").append(toIndentedString(dataAsin)).append("\n");
    sb.append("    parentAsin: ").append(toIndentedString(parentAsin)).append("\n");
    sb.append("    productAsins: ").append(toIndentedString(productAsins)).append("\n");
    sb.append("    priceFrom: ").append(toIndentedString(priceFrom)).append("\n");
    sb.append("    priceTo: ").append(toIndentedString(priceTo)).append("\n");
    sb.append("    percentageDiscount: ").append(toIndentedString(percentageDiscount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    isAmazonChoice: ").append(toIndentedString(isAmazonChoice)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    isNewerModelAvailable: ").append(toIndentedString(isNewerModelAvailable)).append("\n");
    sb.append("    applicableVouchers: ").append(toIndentedString(applicableVouchers)).append("\n");
    sb.append("    newerModel: ").append(toIndentedString(newerModel)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    productInformation: ").append(toIndentedString(productInformation)).append("\n");
    sb.append("    productImagesList: ").append(toIndentedString(productImagesList)).append("\n");
    sb.append("    productVideosList: ").append(toIndentedString(productVideosList)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
    sb.append("    topLocalReviews: ").append(toIndentedString(topLocalReviews)).append("\n");
    sb.append("    topGlobalReviews: ").append(toIndentedString(topGlobalReviews)).append("\n");
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
    
    openapiFields.add("title");
    
    openapiFields.add("details");
    
    openapiFields.add("image_url");
    
    openapiFields.add("author");
    
    openapiFields.add("data_asin");
    
    openapiFields.add("parent_asin");
    
    openapiFields.add("product_asins");
    
    openapiFields.add("price_from");
    
    openapiFields.add("price_to");
    
    openapiFields.add("percentage_discount");
    
    openapiFields.add("currency");
    
    openapiFields.add("is_amazon_choice");
    
    openapiFields.add("rating");
    
    openapiFields.add("is_newer_model_available");
    
    openapiFields.add("applicable_vouchers");
    
    openapiFields.add("newer_model");
    
    openapiFields.add("categories");
    
    openapiFields.add("product_information");
    
    openapiFields.add("product_images_list");
    
    openapiFields.add("product_videos_list");
    
    openapiFields.add("description");
    
    openapiFields.add("is_available");
    
    openapiFields.add("top_local_reviews");
    
    openapiFields.add("top_global_reviews");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AmazonProductInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AmazonProductInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AmazonProductInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AmazonProductInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AmazonProductInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AmazonProductInfo>() {
           @Override
           public void write(JsonWriter out, AmazonProductInfo value) throws IOException {
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
           public AmazonProductInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AmazonProductInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AmazonProductInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AmazonProductInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}