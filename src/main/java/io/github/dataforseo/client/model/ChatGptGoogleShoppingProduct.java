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



public class ChatGptGoogleShoppingProduct  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ChatGptGoogleShoppingProduct type(String type) {
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


  public static final String SERIALIZED_NAME_EI = "ei";
  @SerializedName(SERIALIZED_NAME_EI)
  private String ei;

  public ChatGptGoogleShoppingProduct ei(String ei) {
    this.ei = ei;
    return this;
  }

  /**
   * event identifierinternal event identifier used by Google
   * @return ei
   */
  @javax.annotation.Nullable
  public String getEi() {
    return ei;
  }

  public void setEi(String ei) {
    this.ei = ei;
  }


  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public ChatGptGoogleShoppingProduct productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * product identifiercan be used as a data_docid in Google Shopping API endpoints
   * @return productId
   */
  @javax.annotation.Nullable
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }


  public static final String SERIALIZED_NAME_CATALOG_ID = "catalog_id";
  @SerializedName(SERIALIZED_NAME_CATALOG_ID)
  private String catalogId;

  public ChatGptGoogleShoppingProduct catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Google Shopping catalog identifier of the productcan be used as a product_id in Google Shopping API endpoints
   * @return catalogId
   */
  @javax.annotation.Nullable
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }


  public static final String SERIALIZED_NAME_GPCID = "gpcid";
  @SerializedName(SERIALIZED_NAME_GPCID)
  private String gpcid;

  public ChatGptGoogleShoppingProduct gpcid(String gpcid) {
    this.gpcid = gpcid;
    return this;
  }

  /**
   * Google product cluster identifiercan be used as a gid in Google Shopping API endpoints
   * @return gpcid
   */
  @javax.annotation.Nullable
  public String getGpcid() {
    return gpcid;
  }

  public void setGpcid(String gpcid) {
    this.gpcid = gpcid;
  }


  public static final String SERIALIZED_NAME_HEADLINE_OFFER_DOCID = "headline_offer_docid";
  @SerializedName(SERIALIZED_NAME_HEADLINE_OFFER_DOCID)
  private String headlineOfferDocid;

  public ChatGptGoogleShoppingProduct headlineOfferDocid(String headlineOfferDocid) {
    this.headlineOfferDocid = headlineOfferDocid;
    return this;
  }

  /**
   * document identifier of the main offer in the headlinecan be used as a data_docid in Google Shopping API endpoints
   * @return headlineOfferDocid
   */
  @javax.annotation.Nullable
  public String getHeadlineOfferDocid() {
    return headlineOfferDocid;
  }

  public void setHeadlineOfferDocid(String headlineOfferDocid) {
    this.headlineOfferDocid = headlineOfferDocid;
  }


  public static final String SERIALIZED_NAME_IMAGE_DOCID = "image_docid";
  @SerializedName(SERIALIZED_NAME_IMAGE_DOCID)
  private String imageDocid;

  public ChatGptGoogleShoppingProduct imageDocid(String imageDocid) {
    this.imageDocid = imageDocid;
    return this;
  }

  /**
   * identifier for the displayed product’s image
   * @return imageDocid
   */
  @javax.annotation.Nullable
  public String getImageDocid() {
    return imageDocid;
  }

  public void setImageDocid(String imageDocid) {
    this.imageDocid = imageDocid;
  }


  public static final String SERIALIZED_NAME_RDS = "rds";
  @SerializedName(SERIALIZED_NAME_RDS)
  private String rds;

  public ChatGptGoogleShoppingProduct rds(String rds) {
    this.rds = rds;
    return this;
  }

  /**
   * resource descriptor string internal Google resource descriptor string that identifies the product within Google's Shopping index
   * @return rds
   */
  @javax.annotation.Nullable
  public String getRds() {
    return rds;
  }

  public void setRds(String rds) {
    this.rds = rds;
  }


  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public ChatGptGoogleShoppingProduct query(String query) {
    this.query = query;
    return this;
  }

  /**
   * search querysearch query used by ChatGPT to retrieve the product from Google Shopping
   * @return query
   */
  @javax.annotation.Nullable
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }


  public static final String SERIALIZED_NAME_MID = "mid";
  @SerializedName(SERIALIZED_NAME_MID)
  private String mid;

  public ChatGptGoogleShoppingProduct mid(String mid) {
    this.mid = mid;
    return this;
  }

  /**
   * merchant identifieridentifier of the seller or merchant account in Google Shopping
   * @return mid
   */
  @javax.annotation.Nullable
  public String getMid() {
    return mid;
  }

  public void setMid(String mid) {
    this.mid = mid;
  }


  public static final String SERIALIZED_NAME_PVT = "pvt";
  @SerializedName(SERIALIZED_NAME_PVT)
  private String pvt;

  public ChatGptGoogleShoppingProduct pvt(String pvt) {
    this.pvt = pvt;
    return this;
  }

  /**
   * product view typeinternal Google parameter that specifies the product view type used when rendering the product item
   * @return pvt
   */
  @javax.annotation.Nullable
  public String getPvt() {
    return pvt;
  }

  public void setPvt(String pvt) {
    this.pvt = pvt;
  }


  public static final String SERIALIZED_NAME_UULE = "uule";
  @SerializedName(SERIALIZED_NAME_UULE)
  private String uule;

  public ChatGptGoogleShoppingProduct uule(String uule) {
    this.uule = uule;
    return this;
  }

  /**
   * encoded location parameterindicates the location for a search
   * @return uule
   */
  @javax.annotation.Nullable
  public String getUule() {
    return uule;
  }

  public void setUule(String uule) {
    this.uule = uule;
  }


  public static final String SERIALIZED_NAME_GL = "gl";
  @SerializedName(SERIALIZED_NAME_GL)
  private String gl;

  public ChatGptGoogleShoppingProduct gl(String gl) {
    this.gl = gl;
    return this;
  }

  /**
   * country codeindicates the location for which search results are displayed
   * @return gl
   */
  @javax.annotation.Nullable
  public String getGl() {
    return gl;
  }

  public void setGl(String gl) {
    this.gl = gl;
  }


  public static final String SERIALIZED_NAME_HL = "hl";
  @SerializedName(SERIALIZED_NAME_HL)
  private String hl;

  public ChatGptGoogleShoppingProduct hl(String hl) {
    this.hl = hl;
    return this;
  }

  /**
   * host language codeindicates the language in which search results are displayed
   * @return hl
   */
  @javax.annotation.Nullable
  public String getHl() {
    return hl;
  }

  public void setHl(String hl) {
    this.hl = hl;
  }



  public ChatGptGoogleShoppingProduct() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public ChatGptGoogleShoppingProduct putAdditionalProperty(String key, Object value) {
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


    
    ChatGptGoogleShoppingProduct chatGptGoogleShoppingProduct = (ChatGptGoogleShoppingProduct) o;
    return

        Objects.equals(this.type, chatGptGoogleShoppingProduct.type) &&
        Objects.equals(this.ei, chatGptGoogleShoppingProduct.ei) &&
        Objects.equals(this.productId, chatGptGoogleShoppingProduct.productId) &&
        Objects.equals(this.catalogId, chatGptGoogleShoppingProduct.catalogId) &&
        Objects.equals(this.gpcid, chatGptGoogleShoppingProduct.gpcid) &&
        Objects.equals(this.headlineOfferDocid, chatGptGoogleShoppingProduct.headlineOfferDocid) &&
        Objects.equals(this.imageDocid, chatGptGoogleShoppingProduct.imageDocid) &&
        Objects.equals(this.rds, chatGptGoogleShoppingProduct.rds) &&
        Objects.equals(this.query, chatGptGoogleShoppingProduct.query) &&
        Objects.equals(this.mid, chatGptGoogleShoppingProduct.mid) &&
        Objects.equals(this.pvt, chatGptGoogleShoppingProduct.pvt) &&
        Objects.equals(this.uule, chatGptGoogleShoppingProduct.uule) &&
        Objects.equals(this.gl, chatGptGoogleShoppingProduct.gl) &&
        Objects.equals(this.hl, chatGptGoogleShoppingProduct.hl);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, ei, productId, catalogId, gpcid, headlineOfferDocid, imageDocid, rds, query, mid, pvt, uule, gl, hl);
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
    sb.append("class ChatGptGoogleShoppingProduct {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ei: ").append(toIndentedString(ei)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    gpcid: ").append(toIndentedString(gpcid)).append("\n");
    sb.append("    headlineOfferDocid: ").append(toIndentedString(headlineOfferDocid)).append("\n");
    sb.append("    imageDocid: ").append(toIndentedString(imageDocid)).append("\n");
    sb.append("    rds: ").append(toIndentedString(rds)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
    sb.append("    pvt: ").append(toIndentedString(pvt)).append("\n");
    sb.append("    uule: ").append(toIndentedString(uule)).append("\n");
    sb.append("    gl: ").append(toIndentedString(gl)).append("\n");
    sb.append("    hl: ").append(toIndentedString(hl)).append("\n");
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
    
    openapiFields.add("ei");
    
    openapiFields.add("product_id");
    
    openapiFields.add("catalog_id");
    
    openapiFields.add("gpcid");
    
    openapiFields.add("headline_offer_docid");
    
    openapiFields.add("image_docid");
    
    openapiFields.add("rds");
    
    openapiFields.add("query");
    
    openapiFields.add("mid");
    
    openapiFields.add("pvt");
    
    openapiFields.add("uule");
    
    openapiFields.add("gl");
    
    openapiFields.add("hl");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ChatGptGoogleShoppingProduct
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChatGptGoogleShoppingProduct.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChatGptGoogleShoppingProduct' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChatGptGoogleShoppingProduct> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChatGptGoogleShoppingProduct.class));

       return (TypeAdapter<T>) new TypeAdapter<ChatGptGoogleShoppingProduct>() {
           @Override
           public void write(JsonWriter out, ChatGptGoogleShoppingProduct value) throws IOException {
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
           public ChatGptGoogleShoppingProduct read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ChatGptGoogleShoppingProduct instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static ChatGptGoogleShoppingProduct fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChatGptGoogleShoppingProduct.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}