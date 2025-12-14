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



public class DataLabsKnowledgeGraphSerpElementItem  extends BaseDataforseoLabsApiElementItem  {


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public DataLabsKnowledgeGraphSerpElementItem title(String title) {
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


  public static final String SERIALIZED_NAME_SUB_TITLE = "sub_title";
  @SerializedName(SERIALIZED_NAME_SUB_TITLE)
  private String subTitle;

  public DataLabsKnowledgeGraphSerpElementItem subTitle(String subTitle) {
    this.subTitle = subTitle;
    return this;
  }

  /**
   * subtitle of the item
   * @return subTitle
   */
  @javax.annotation.Nullable
  public String getSubTitle() {
    return subTitle;
  }

  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }


  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public DataLabsKnowledgeGraphSerpElementItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description of the results element in SERP
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public static final String SERIALIZED_NAME_CARD_ID = "card_id";
  @SerializedName(SERIALIZED_NAME_CARD_ID)
  private String cardId;

  public DataLabsKnowledgeGraphSerpElementItem cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

  /**
   * card id
   * @return cardId
   */
  @javax.annotation.Nullable
  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public DataLabsKnowledgeGraphSerpElementItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * sitelink URL
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public DataLabsKnowledgeGraphSerpElementItem imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * URL of the image
   * @return imageUrl
   */
  @javax.annotation.Nullable
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public static final String SERIALIZED_NAME_LOGO_URL = "logo_url";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public DataLabsKnowledgeGraphSerpElementItem logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

  /**
   * URL of the logo from knowledge graph
   * @return logoUrl
   */
  @javax.annotation.Nullable
  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private String cid;

  public DataLabsKnowledgeGraphSerpElementItem cid(String cid) {
    this.cid = cid;
    return this;
  }

  /**
   * google-defined client id
   * @return cid
   */
  @javax.annotation.Nullable
  public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }


  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<BaseDataforseoLabsKnowledgeGraphElementItem> items;

  public DataLabsKnowledgeGraphSerpElementItem items(List<BaseDataforseoLabsKnowledgeGraphElementItem> items) {
    this.items = items;
    return this;
  }

  /**
   * historical SERPs and related data found in the database
   * @return items
   */
  @javax.annotation.Nullable
  public List<BaseDataforseoLabsKnowledgeGraphElementItem> getItems() {
    return items;
  }

  public void setItems(List<BaseDataforseoLabsKnowledgeGraphElementItem> items) {
    this.items = items;
  }



  public DataLabsKnowledgeGraphSerpElementItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DataLabsKnowledgeGraphSerpElementItem putAdditionalProperty(String key, Object value) {
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


    
    DataLabsKnowledgeGraphSerpElementItem dataLabsKnowledgeGraphSerpElementItem = (DataLabsKnowledgeGraphSerpElementItem) o;
    return

        Objects.equals(this.title, dataLabsKnowledgeGraphSerpElementItem.title) &&
        Objects.equals(this.subTitle, dataLabsKnowledgeGraphSerpElementItem.subTitle) &&
        Objects.equals(this.description, dataLabsKnowledgeGraphSerpElementItem.description) &&
        Objects.equals(this.cardId, dataLabsKnowledgeGraphSerpElementItem.cardId) &&
        Objects.equals(this.url, dataLabsKnowledgeGraphSerpElementItem.url) &&
        Objects.equals(this.imageUrl, dataLabsKnowledgeGraphSerpElementItem.imageUrl) &&
        Objects.equals(this.logoUrl, dataLabsKnowledgeGraphSerpElementItem.logoUrl) &&
        Objects.equals(this.cid, dataLabsKnowledgeGraphSerpElementItem.cid) &&
        Objects.equals(this.items, dataLabsKnowledgeGraphSerpElementItem.items) && 
        super.equals(o);
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(title, subTitle, description, cardId, url, imageUrl, logoUrl, cid, items);
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
    sb.append("class DataLabsKnowledgeGraphSerpElementItem {\n");

    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subTitle: ").append(toIndentedString(subTitle)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    openapiFields.add("se_type");
    openapiFields.add("rank_group");
    openapiFields.add("rank_absolute");
    openapiFields.add("position");
    openapiFields.add("xpath");
    
    openapiFields.add("title");
    
    openapiFields.add("sub_title");
    
    openapiFields.add("description");
    
    openapiFields.add("card_id");
    
    openapiFields.add("url");
    
    openapiFields.add("image_url");
    
    openapiFields.add("logo_url");
    
    openapiFields.add("cid");
    
    openapiFields.add("items");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataLabsKnowledgeGraphSerpElementItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataLabsKnowledgeGraphSerpElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataLabsKnowledgeGraphSerpElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataLabsKnowledgeGraphSerpElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataLabsKnowledgeGraphSerpElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<DataLabsKnowledgeGraphSerpElementItem>() {
           @Override
           public void write(JsonWriter out, DataLabsKnowledgeGraphSerpElementItem value) throws IOException {
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
           public DataLabsKnowledgeGraphSerpElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DataLabsKnowledgeGraphSerpElementItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DataLabsKnowledgeGraphSerpElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataLabsKnowledgeGraphSerpElementItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}