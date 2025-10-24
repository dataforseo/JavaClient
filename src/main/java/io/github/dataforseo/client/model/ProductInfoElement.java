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



public class ProductInfoElement  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ProductInfoElement type(String type) {
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

  public ProductInfoElement rankGroup(Integer rankGroup) {
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

  public ProductInfoElement rankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
    return this;
  }

  /**
   * absolute rank on the product specification page
* absolute position among all the elements found on the product specification page
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

  public ProductInfoElement position(String position) {
    this.position = position;
    return this;
  }

  /**
   * alignment of the element on the product specification page
* can take the following values:
* right, left
   * @return position
   */
  @javax.annotation.Nullable
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public ProductInfoElement productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * product_id received in a POST array
* ilearn more about the parameter in this help center guide
   * @return productId
   */
  @javax.annotation.Nullable
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public ProductInfoElement title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the product
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public ProductInfoElement description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description of the product
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public ProductInfoElement url(String url) {
    this.url = url;
    return this;
  }

  /**
   * product url
* url of the product on Google Shopping
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<String> images;

  public ProductInfoElement images(List<String> images) {
    this.images = images;
    return this;
  }

  /**
   * product images
* contains urls to product images
   * @return images
   */
  @javax.annotation.Nullable
  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }


  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private List<String> features;

  public ProductInfoElement features(List<String> features) {
    this.features = features;
    return this;
  }

  /**
   * product features
* contains snippets with the description of product features
   * @return features
   */
  @javax.annotation.Nullable
  public List<String> getFeatures() {
    return features;
  }

  public void setFeatures(List<String> features) {
    this.features = features;
  }


  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private RatingElement rating;

  public ProductInfoElement rating(RatingElement rating) {
    this.rating = rating;
    return this;
  }

  /**
   * product rating 
* the popularity rate based on reviews
   * @return rating
   */
  @javax.annotation.Nullable
  public RatingElement getRating() {
    return rating;
  }

  public void setRating(RatingElement rating) {
    this.rating = rating;
  }


  public static final String SERIALIZED_NAME_SELLER_REVIEWS_COUNT = "seller_reviews_count";
  @SerializedName(SERIALIZED_NAME_SELLER_REVIEWS_COUNT)
  private Long sellerReviewsCount;

  public ProductInfoElement sellerReviewsCount(Long sellerReviewsCount) {
    this.sellerReviewsCount = sellerReviewsCount;
    return this;
  }

  /**
   * number of seller reviews
* number of reviews on the product seller’s account
   * @return sellerReviewsCount
   */
  @javax.annotation.Nullable
  public Long getSellerReviewsCount() {
    return sellerReviewsCount;
  }

  public void setSellerReviewsCount(Long sellerReviewsCount) {
    this.sellerReviewsCount = sellerReviewsCount;
  }


  public static final String SERIALIZED_NAME_DATA_DOCID = "data_docid";
  @SerializedName(SERIALIZED_NAME_DATA_DOCID)
  private String dataDocid;

  public ProductInfoElement dataDocid(String dataDocid) {
    this.dataDocid = dataDocid;
    return this;
  }

  /**
   * unique identifier of the SERP data element
* note that there is no full list of possible values as the data_docid is a dynamic value assigned by Google
* example:
* 17363035694596624076
   * @return dataDocid
   */
  @javax.annotation.Nullable
  public String getDataDocid() {
    return dataDocid;
  }

  public void setDataDocid(String dataDocid) {
    this.dataDocid = dataDocid;
  }


  public static final String SERIALIZED_NAME_GID = "gid";
  @SerializedName(SERIALIZED_NAME_GID)
  private String gid;

  public ProductInfoElement gid(String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * global product identifier on Google Shopping
* note that there is no full list of possible values as the gid is a dynamic value assigned by Google
* if there are no values, you will get null
* example:
* 4702526954592161872
* learn more about gid in this help center guide
   * @return gid
   */
  @javax.annotation.Nullable
  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }


  public static final String SERIALIZED_NAME_SPECIFICATIONS = "specifications";
  @SerializedName(SERIALIZED_NAME_SPECIFICATIONS)
  private List<ShoppingSpecification> specifications;

  public ProductInfoElement specifications(List<ShoppingSpecification> specifications) {
    this.specifications = specifications;
    return this;
  }

  /**
   * product specifications
* contains all product attributes and related data listed on the product specification page
   * @return specifications
   */
  @javax.annotation.Nullable
  public List<ShoppingSpecification> getSpecifications() {
    return specifications;
  }

  public void setSpecifications(List<ShoppingSpecification> specifications) {
    this.specifications = specifications;
  }


  public static final String SERIALIZED_NAME_SELLERS = "sellers";
  @SerializedName(SERIALIZED_NAME_SELLERS)
  private List<ProductSeller> sellers;

  public ProductInfoElement sellers(List<ProductSeller> sellers) {
    this.sellers = sellers;
    return this;
  }

  /**
   * sellers of the product
* number of reviews on the product seller’s account
   * @return sellers
   */
  @javax.annotation.Nullable
  public List<ProductSeller> getSellers() {
    return sellers;
  }

  public void setSellers(List<ProductSeller> sellers) {
    this.sellers = sellers;
  }


  public static final String SERIALIZED_NAME_VARIATIONS = "variations";
  @SerializedName(SERIALIZED_NAME_VARIATIONS)
  private List<ProductVariation> variations;

  public ProductInfoElement variations(List<ProductVariation> variations) {
    this.variations = variations;
    return this;
  }

  /**
   * variations of the product
* contains brief information about different product variations
   * @return variations
   */
  @javax.annotation.Nullable
  public List<ProductVariation> getVariations() {
    return variations;
  }

  public void setVariations(List<ProductVariation> variations) {
    this.variations = variations;
  }



  public ProductInfoElement() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public ProductInfoElement putAdditionalProperty(String key, Object value) {
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


    
    ProductInfoElement productInfoElement = (ProductInfoElement) o;
    return

        Objects.equals(this.type, productInfoElement.type) &&
        Objects.equals(this.rankGroup, productInfoElement.rankGroup) &&
        Objects.equals(this.rankAbsolute, productInfoElement.rankAbsolute) &&
        Objects.equals(this.position, productInfoElement.position) &&
        Objects.equals(this.productId, productInfoElement.productId) &&
        Objects.equals(this.title, productInfoElement.title) &&
        Objects.equals(this.description, productInfoElement.description) &&
        Objects.equals(this.url, productInfoElement.url) &&
        Objects.equals(this.images, productInfoElement.images) &&
        Objects.equals(this.features, productInfoElement.features) &&
        Objects.equals(this.rating, productInfoElement.rating) &&
        Objects.equals(this.sellerReviewsCount, productInfoElement.sellerReviewsCount) &&
        Objects.equals(this.dataDocid, productInfoElement.dataDocid) &&
        Objects.equals(this.gid, productInfoElement.gid) &&
        Objects.equals(this.specifications, productInfoElement.specifications) &&
        Objects.equals(this.sellers, productInfoElement.sellers) &&
        Objects.equals(this.variations, productInfoElement.variations);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, rankGroup, rankAbsolute, position, productId, title, description, url, images, features, rating, sellerReviewsCount, dataDocid, gid, specifications, sellers, variations);
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
    sb.append("class ProductInfoElement {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    sellerReviewsCount: ").append(toIndentedString(sellerReviewsCount)).append("\n");
    sb.append("    dataDocid: ").append(toIndentedString(dataDocid)).append("\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    specifications: ").append(toIndentedString(specifications)).append("\n");
    sb.append("    sellers: ").append(toIndentedString(sellers)).append("\n");
    sb.append("    variations: ").append(toIndentedString(variations)).append("\n");
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
    
    openapiFields.add("product_id");
    
    openapiFields.add("title");
    
    openapiFields.add("description");
    
    openapiFields.add("url");
    
    openapiFields.add("images");
    
    openapiFields.add("features");
    
    openapiFields.add("rating");
    
    openapiFields.add("seller_reviews_count");
    
    openapiFields.add("data_docid");
    
    openapiFields.add("gid");
    
    openapiFields.add("specifications");
    
    openapiFields.add("sellers");
    
    openapiFields.add("variations");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProductInfoElement
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductInfoElement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductInfoElement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductInfoElement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductInfoElement.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductInfoElement>() {
           @Override
           public void write(JsonWriter out, ProductInfoElement value) throws IOException {
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
           public ProductInfoElement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ProductInfoElement instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static ProductInfoElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductInfoElement.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}