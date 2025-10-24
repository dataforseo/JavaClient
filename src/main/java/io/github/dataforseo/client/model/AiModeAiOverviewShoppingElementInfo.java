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



public class AiModeAiOverviewShoppingElementInfo  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AiModeAiOverviewShoppingElementInfo type(String type) {
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


  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public AiModeAiOverviewShoppingElementInfo productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * 
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

  public AiModeAiOverviewShoppingElementInfo title(String title) {
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


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public AiModeAiOverviewShoppingElementInfo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * reference page URL
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

  public AiModeAiOverviewShoppingElementInfo domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * domain in link
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private RatingInfo rating;

  public AiModeAiOverviewShoppingElementInfo rating(RatingInfo rating) {
    this.rating = rating;
    return this;
  }

  /**
   * the item’s rating 
* the popularity rate based on reviews and displayed in SERP
   * @return rating
   */
  @javax.annotation.Nullable
  public RatingInfo getRating() {
    return rating;
  }

  public void setRating(RatingInfo rating) {
    this.rating = rating;
  }


  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private PriceInfo price;

  public AiModeAiOverviewShoppingElementInfo price(PriceInfo price) {
    this.price = price;
    return this;
  }

  /**
   * pricing details
* contains the pricing details of the product or service featured in the result
   * @return price
   */
  @javax.annotation.Nullable
  public PriceInfo getPrice() {
    return price;
  }

  public void setPrice(PriceInfo price) {
    this.price = price;
  }


  public static final String SERIALIZED_NAME_SELLER = "seller";
  @SerializedName(SERIALIZED_NAME_SELLER)
  private String seller;

  public AiModeAiOverviewShoppingElementInfo seller(String seller) {
    this.seller = seller;
    return this;
  }

  /**
   * seller of the product
   * @return seller
   */
  @javax.annotation.Nullable
  public String getSeller() {
    return seller;
  }

  public void setSeller(String seller) {
    this.seller = seller;
  }


  public static final String SERIALIZED_NAME_SNIPPET = "snippet";
  @SerializedName(SERIALIZED_NAME_SNIPPET)
  private String snippet;

  public AiModeAiOverviewShoppingElementInfo snippet(String snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * text alongside the link title
   * @return snippet
   */
  @javax.annotation.Nullable
  public String getSnippet() {
    return snippet;
  }

  public void setSnippet(String snippet) {
    this.snippet = snippet;
  }


  public static final String SERIALIZED_NAME_MARKETPLACE = "marketplace";
  @SerializedName(SERIALIZED_NAME_MARKETPLACE)
  private String marketplace;

  public AiModeAiOverviewShoppingElementInfo marketplace(String marketplace) {
    this.marketplace = marketplace;
    return this;
  }

  /**
   * merchant account provider
* commerce site that hosts products or websites of individual sellers under the same merchant account
* example:
* by Google
   * @return marketplace
   */
  @javax.annotation.Nullable
  public String getMarketplace() {
    return marketplace;
  }

  public void setMarketplace(String marketplace) {
    this.marketplace = marketplace;
  }


  public static final String SERIALIZED_NAME_MARKETPLACE_URL = "marketplace_url";
  @SerializedName(SERIALIZED_NAME_MARKETPLACE_URL)
  private String marketplaceUrl;

  public AiModeAiOverviewShoppingElementInfo marketplaceUrl(String marketplaceUrl) {
    this.marketplaceUrl = marketplaceUrl;
    return this;
  }

  /**
   * relevant marketplace URL
* URL of the page on the marketplace website where the product is hosted
   * @return marketplaceUrl
   */
  @javax.annotation.Nullable
  public String getMarketplaceUrl() {
    return marketplaceUrl;
  }

  public void setMarketplaceUrl(String marketplaceUrl) {
    this.marketplaceUrl = marketplaceUrl;
  }


  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public AiModeAiOverviewShoppingElementInfo imageUrl(String imageUrl) {
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



  public AiModeAiOverviewShoppingElementInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AiModeAiOverviewShoppingElementInfo putAdditionalProperty(String key, Object value) {
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


    
    AiModeAiOverviewShoppingElementInfo aiModeAiOverviewShoppingElementInfo = (AiModeAiOverviewShoppingElementInfo) o;
    return

        Objects.equals(this.type, aiModeAiOverviewShoppingElementInfo.type) &&
        Objects.equals(this.productId, aiModeAiOverviewShoppingElementInfo.productId) &&
        Objects.equals(this.title, aiModeAiOverviewShoppingElementInfo.title) &&
        Objects.equals(this.url, aiModeAiOverviewShoppingElementInfo.url) &&
        Objects.equals(this.domain, aiModeAiOverviewShoppingElementInfo.domain) &&
        Objects.equals(this.rating, aiModeAiOverviewShoppingElementInfo.rating) &&
        Objects.equals(this.price, aiModeAiOverviewShoppingElementInfo.price) &&
        Objects.equals(this.seller, aiModeAiOverviewShoppingElementInfo.seller) &&
        Objects.equals(this.snippet, aiModeAiOverviewShoppingElementInfo.snippet) &&
        Objects.equals(this.marketplace, aiModeAiOverviewShoppingElementInfo.marketplace) &&
        Objects.equals(this.marketplaceUrl, aiModeAiOverviewShoppingElementInfo.marketplaceUrl) &&
        Objects.equals(this.imageUrl, aiModeAiOverviewShoppingElementInfo.imageUrl);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, productId, title, url, domain, rating, price, seller, snippet, marketplace, marketplaceUrl, imageUrl);
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
    sb.append("class AiModeAiOverviewShoppingElementInfo {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
    sb.append("    marketplace: ").append(toIndentedString(marketplace)).append("\n");
    sb.append("    marketplaceUrl: ").append(toIndentedString(marketplaceUrl)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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
    
    openapiFields.add("product_id");
    
    openapiFields.add("title");
    
    openapiFields.add("url");
    
    openapiFields.add("domain");
    
    openapiFields.add("rating");
    
    openapiFields.add("price");
    
    openapiFields.add("seller");
    
    openapiFields.add("snippet");
    
    openapiFields.add("marketplace");
    
    openapiFields.add("marketplace_url");
    
    openapiFields.add("image_url");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AiModeAiOverviewShoppingElementInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiModeAiOverviewShoppingElementInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiModeAiOverviewShoppingElementInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiModeAiOverviewShoppingElementInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiModeAiOverviewShoppingElementInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AiModeAiOverviewShoppingElementInfo>() {
           @Override
           public void write(JsonWriter out, AiModeAiOverviewShoppingElementInfo value) throws IOException {
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
           public AiModeAiOverviewShoppingElementInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AiModeAiOverviewShoppingElementInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AiModeAiOverviewShoppingElementInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiModeAiOverviewShoppingElementInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}