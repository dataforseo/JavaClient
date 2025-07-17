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



public class SerpApiGoogleFinanceAboutElementItem  extends BaseSerpApiGoogleFinanceElementItem  {


  public static final String SERIALIZED_NAME_RANK_GROUP = "rank_group";
  @SerializedName(SERIALIZED_NAME_RANK_GROUP)
  private Integer rankGroup;

  public SerpApiGoogleFinanceAboutElementItem rankGroup(Integer rankGroup) {
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

  public SerpApiGoogleFinanceAboutElementItem rankAbsolute(Integer rankAbsolute) {
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


  public static final String SERIALIZED_NAME_DISPLAYED_NAME = "displayed_name";
  @SerializedName(SERIALIZED_NAME_DISPLAYED_NAME)
  private String displayedName;

  public SerpApiGoogleFinanceAboutElementItem displayedName(String displayedName) {
    this.displayedName = displayedName;
    return this;
  }

  /**
   * displayed name of the market index
* example: E-mini Dow ($5)
   * @return displayedName
   */
  @javax.annotation.Nullable
  public String getDisplayedName() {
    return displayedName;
  }

  public void setDisplayedName(String displayedName) {
    this.displayedName = displayedName;
  }


  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public SerpApiGoogleFinanceAboutElementItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * company description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public static final String SERIALIZED_NAME_DESCRIPTION_SOURCE_URL = "description_source_url";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_SOURCE_URL)
  private String descriptionSourceUrl;

  public SerpApiGoogleFinanceAboutElementItem descriptionSourceUrl(String descriptionSourceUrl) {
    this.descriptionSourceUrl = descriptionSourceUrl;
    return this;
  }

  /**
   * source of information provided in description
   * @return descriptionSourceUrl
   */
  @javax.annotation.Nullable
  public String getDescriptionSourceUrl() {
    return descriptionSourceUrl;
  }

  public void setDescriptionSourceUrl(String descriptionSourceUrl) {
    this.descriptionSourceUrl = descriptionSourceUrl;
  }


  public static final String SERIALIZED_NAME_CEO = "ceo";
  @SerializedName(SERIALIZED_NAME_CEO)
  private String ceo;

  public SerpApiGoogleFinanceAboutElementItem ceo(String ceo) {
    this.ceo = ceo;
    return this;
  }

  /**
   * Chief Executive Officer of the company
   * @return ceo
   */
  @javax.annotation.Nullable
  public String getCeo() {
    return ceo;
  }

  public void setCeo(String ceo) {
    this.ceo = ceo;
  }


  public static final String SERIALIZED_NAME_FOUNDED = "founded";
  @SerializedName(SERIALIZED_NAME_FOUNDED)
  private String founded;

  public SerpApiGoogleFinanceAboutElementItem founded(String founded) {
    this.founded = founded;
    return this;
  }

  /**
   * date when the company was founded
* in the format: “yyyy-mm-ddThh-mm-ssZ”
* example:
* 1993-04-05T00:00:00Z
   * @return founded
   */
  @javax.annotation.Nullable
  public String getFounded() {
    return founded;
  }

  public void setFounded(String founded) {
    this.founded = founded;
  }


  public static final String SERIALIZED_NAME_HEADQUARTERS = "headquarters";
  @SerializedName(SERIALIZED_NAME_HEADQUARTERS)
  private String headquarters;

  public SerpApiGoogleFinanceAboutElementItem headquarters(String headquarters) {
    this.headquarters = headquarters;
    return this;
  }

  /**
   * company headquarters
   * @return headquarters
   */
  @javax.annotation.Nullable
  public String getHeadquarters() {
    return headquarters;
  }

  public void setHeadquarters(String headquarters) {
    this.headquarters = headquarters;
  }


  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public SerpApiGoogleFinanceAboutElementItem website(String website) {
    this.website = website;
    return this;
  }

  /**
   * company website
   * @return website
   */
  @javax.annotation.Nullable
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  public static final String SERIALIZED_NAME_EMPLOYEES = "employees";
  @SerializedName(SERIALIZED_NAME_EMPLOYEES)
  private Integer employees;

  public SerpApiGoogleFinanceAboutElementItem employees(Integer employees) {
    this.employees = employees;
    return this;
  }

  /**
   * number of company employees
   * @return employees
   */
  @javax.annotation.Nullable
  public Integer getEmployees() {
    return employees;
  }

  public void setEmployees(Integer employees) {
    this.employees = employees;
  }



  public SerpApiGoogleFinanceAboutElementItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SerpApiGoogleFinanceAboutElementItem putAdditionalProperty(String key, Object value) {
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


    
    SerpApiGoogleFinanceAboutElementItem serpApiGoogleFinanceAboutElementItem = (SerpApiGoogleFinanceAboutElementItem) o;
    return

        Objects.equals(this.rankGroup, serpApiGoogleFinanceAboutElementItem.rankGroup) &&
        Objects.equals(this.rankAbsolute, serpApiGoogleFinanceAboutElementItem.rankAbsolute) &&
        Objects.equals(this.displayedName, serpApiGoogleFinanceAboutElementItem.displayedName) &&
        Objects.equals(this.description, serpApiGoogleFinanceAboutElementItem.description) &&
        Objects.equals(this.descriptionSourceUrl, serpApiGoogleFinanceAboutElementItem.descriptionSourceUrl) &&
        Objects.equals(this.ceo, serpApiGoogleFinanceAboutElementItem.ceo) &&
        Objects.equals(this.founded, serpApiGoogleFinanceAboutElementItem.founded) &&
        Objects.equals(this.headquarters, serpApiGoogleFinanceAboutElementItem.headquarters) &&
        Objects.equals(this.website, serpApiGoogleFinanceAboutElementItem.website) &&
        Objects.equals(this.employees, serpApiGoogleFinanceAboutElementItem.employees) && 
        super.equals(o);
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(rankGroup, rankAbsolute, displayedName, description, descriptionSourceUrl, ceo, founded, headquarters, website, employees);
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
    sb.append("class SerpApiGoogleFinanceAboutElementItem {\n");

    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    displayedName: ").append(toIndentedString(displayedName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionSourceUrl: ").append(toIndentedString(descriptionSourceUrl)).append("\n");
    sb.append("    ceo: ").append(toIndentedString(ceo)).append("\n");
    sb.append("    founded: ").append(toIndentedString(founded)).append("\n");
    sb.append("    headquarters: ").append(toIndentedString(headquarters)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    employees: ").append(toIndentedString(employees)).append("\n");
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
    
    openapiFields.add("displayed_name");
    
    openapiFields.add("description");
    
    openapiFields.add("description_source_url");
    
    openapiFields.add("ceo");
    
    openapiFields.add("founded");
    
    openapiFields.add("headquarters");
    
    openapiFields.add("website");
    
    openapiFields.add("employees");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SerpApiGoogleFinanceAboutElementItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpApiGoogleFinanceAboutElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpApiGoogleFinanceAboutElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpApiGoogleFinanceAboutElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpApiGoogleFinanceAboutElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpApiGoogleFinanceAboutElementItem>() {
           @Override
           public void write(JsonWriter out, SerpApiGoogleFinanceAboutElementItem value) throws IOException {
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
           public SerpApiGoogleFinanceAboutElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SerpApiGoogleFinanceAboutElementItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SerpApiGoogleFinanceAboutElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpApiGoogleFinanceAboutElementItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}