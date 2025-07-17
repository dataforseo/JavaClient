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



public class PageContentInfo  {


  public static final String SERIALIZED_NAME_HEADER = "header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private PageSectionContentInfo header;

  public PageContentInfo header(PageSectionContentInfo header) {
    this.header = header;
    return this;
  }

  /**
   * content of the header of the table
   * @return header
   */
  @javax.annotation.Nullable
  public PageSectionContentInfo getHeader() {
    return header;
  }

  public void setHeader(PageSectionContentInfo header) {
    this.header = header;
  }


  public static final String SERIALIZED_NAME_FOOTER = "footer";
  @SerializedName(SERIALIZED_NAME_FOOTER)
  private PageSectionContentInfo footer;

  public PageContentInfo footer(PageSectionContentInfo footer) {
    this.footer = footer;
    return this;
  }

  /**
   * content of the footer of the table
   * @return footer
   */
  @javax.annotation.Nullable
  public PageSectionContentInfo getFooter() {
    return footer;
  }

  public void setFooter(PageSectionContentInfo footer) {
    this.footer = footer;
  }


  public static final String SERIALIZED_NAME_MAIN_TOPIC = "main_topic";
  @SerializedName(SERIALIZED_NAME_MAIN_TOPIC)
  private List<TopicInfo> mainTopic;

  public PageContentInfo mainTopic(List<TopicInfo> mainTopic) {
    this.mainTopic = mainTopic;
    return this;
  }

  /**
   * main topic on the page
* you can find more information about topic priority calculation in this help center article
   * @return mainTopic
   */
  @javax.annotation.Nullable
  public List<TopicInfo> getMainTopic() {
    return mainTopic;
  }

  public void setMainTopic(List<TopicInfo> mainTopic) {
    this.mainTopic = mainTopic;
  }


  public static final String SERIALIZED_NAME_SECONDARY_TOPIC = "secondary_topic";
  @SerializedName(SERIALIZED_NAME_SECONDARY_TOPIC)
  private List<TopicInfo> secondaryTopic;

  public PageContentInfo secondaryTopic(List<TopicInfo> secondaryTopic) {
    this.secondaryTopic = secondaryTopic;
    return this;
  }

  /**
   * secondary topic on the page
* you can find more information about topic priority calculation in this help center article
   * @return secondaryTopic
   */
  @javax.annotation.Nullable
  public List<TopicInfo> getSecondaryTopic() {
    return secondaryTopic;
  }

  public void setSecondaryTopic(List<TopicInfo> secondaryTopic) {
    this.secondaryTopic = secondaryTopic;
  }


  public static final String SERIALIZED_NAME_RATINGS = "ratings";
  @SerializedName(SERIALIZED_NAME_RATINGS)
  private List<ContentRatingInfo> ratings;

  public PageContentInfo ratings(List<ContentRatingInfo> ratings) {
    this.ratings = ratings;
    return this;
  }

  /**
   * contains objects with rating information for the products displayed on the page
   * @return ratings
   */
  @javax.annotation.Nullable
  public List<ContentRatingInfo> getRatings() {
    return ratings;
  }

  public void setRatings(List<ContentRatingInfo> ratings) {
    this.ratings = ratings;
  }


  public static final String SERIALIZED_NAME_OFFERS = "offers";
  @SerializedName(SERIALIZED_NAME_OFFERS)
  private List<ContentOfferInfo> offers;

  public PageContentInfo offers(List<ContentOfferInfo> offers) {
    this.offers = offers;
    return this;
  }

  /**
   * array of products displayed on the page
* contains objects with information on products displayed on the page
   * @return offers
   */
  @javax.annotation.Nullable
  public List<ContentOfferInfo> getOffers() {
    return offers;
  }

  public void setOffers(List<ContentOfferInfo> offers) {
    this.offers = offers;
  }


  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private List<ContentCommentInfo> comments;

  public PageContentInfo comments(List<ContentCommentInfo> comments) {
    this.comments = comments;
    return this;
  }

  /**
   * array of comments displayed on the page
* contains objects with information on comments related to displayed products
   * @return comments
   */
  @javax.annotation.Nullable
  public List<ContentCommentInfo> getComments() {
    return comments;
  }

  public void setComments(List<ContentCommentInfo> comments) {
    this.comments = comments;
  }


  public static final String SERIALIZED_NAME_CONTACTS = "contacts";
  @SerializedName(SERIALIZED_NAME_CONTACTS)
  private Contacts contacts;

  public PageContentInfo contacts(Contacts contacts) {
    this.contacts = contacts;
    return this;
  }

  /**
   * contact information
* contains contact information displayed on the page
   * @return contacts
   */
  @javax.annotation.Nullable
  public Contacts getContacts() {
    return contacts;
  }

  public void setContacts(Contacts contacts) {
    this.contacts = contacts;
  }



  public PageContentInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public PageContentInfo putAdditionalProperty(String key, Object value) {
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


    
    PageContentInfo pageContentInfo = (PageContentInfo) o;
    return

        Objects.equals(this.header, pageContentInfo.header) &&
        Objects.equals(this.footer, pageContentInfo.footer) &&
        Objects.equals(this.mainTopic, pageContentInfo.mainTopic) &&
        Objects.equals(this.secondaryTopic, pageContentInfo.secondaryTopic) &&
        Objects.equals(this.ratings, pageContentInfo.ratings) &&
        Objects.equals(this.offers, pageContentInfo.offers) &&
        Objects.equals(this.comments, pageContentInfo.comments) &&
        Objects.equals(this.contacts, pageContentInfo.contacts);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(header, footer, mainTopic, secondaryTopic, ratings, offers, comments, contacts);
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
    sb.append("class PageContentInfo {\n");

    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    mainTopic: ").append(toIndentedString(mainTopic)).append("\n");
    sb.append("    secondaryTopic: ").append(toIndentedString(secondaryTopic)).append("\n");
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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
    
    openapiFields.add("header");
    
    openapiFields.add("footer");
    
    openapiFields.add("main_topic");
    
    openapiFields.add("secondary_topic");
    
    openapiFields.add("ratings");
    
    openapiFields.add("offers");
    
    openapiFields.add("comments");
    
    openapiFields.add("contacts");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PageContentInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageContentInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageContentInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageContentInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageContentInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PageContentInfo>() {
           @Override
           public void write(JsonWriter out, PageContentInfo value) throws IOException {
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
           public PageContentInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PageContentInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static PageContentInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageContentInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}