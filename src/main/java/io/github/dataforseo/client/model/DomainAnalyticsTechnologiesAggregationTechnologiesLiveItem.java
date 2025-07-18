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



public class DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem type(String type) {
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


  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem group(String group) {
    this.group = group;
    return this;
  }

  /**
   * technology group id
   * @return group
   */
  @javax.annotation.Nullable
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }


  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem category(String category) {
    this.category = category;
    return this;
  }

  /**
   * technology category id
   * @return category
   */
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  public static final String SERIALIZED_NAME_TECHNOLOGY = "technology";
  @SerializedName(SERIALIZED_NAME_TECHNOLOGY)
  private String technology;

  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem technology(String technology) {
    this.technology = technology;
    return this;
  }

  /**
   * technology name
   * @return technology
   */
  @javax.annotation.Nullable
  public String getTechnology() {
    return technology;
  }

  public void setTechnology(String technology) {
    this.technology = technology;
  }


  public static final String SERIALIZED_NAME_GROUPS_COUNT = "groups_count";
  @SerializedName(SERIALIZED_NAME_GROUPS_COUNT)
  private Long groupsCount;

  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem groupsCount(Long groupsCount) {
    this.groupsCount = groupsCount;
    return this;
  }

  /**
   * technology groups count
* number of domains that match the parameters you specified and are using technologies from the indicated group
   * @return groupsCount
   */
  @javax.annotation.Nullable
  public Long getGroupsCount() {
    return groupsCount;
  }

  public void setGroupsCount(Long groupsCount) {
    this.groupsCount = groupsCount;
  }


  public static final String SERIALIZED_NAME_CATEGORIES_COUNT = "categories_count";
  @SerializedName(SERIALIZED_NAME_CATEGORIES_COUNT)
  private Long categoriesCount;

  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem categoriesCount(Long categoriesCount) {
    this.categoriesCount = categoriesCount;
    return this;
  }

  /**
   * technology categories count
* number of domains that match the parameters you specified and are using technologies from the indicated category
   * @return categoriesCount
   */
  @javax.annotation.Nullable
  public Long getCategoriesCount() {
    return categoriesCount;
  }

  public void setCategoriesCount(Long categoriesCount) {
    this.categoriesCount = categoriesCount;
  }


  public static final String SERIALIZED_NAME_TECHNOLOGIES_COUNT = "technologies_count";
  @SerializedName(SERIALIZED_NAME_TECHNOLOGIES_COUNT)
  private Long technologiesCount;

  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem technologiesCount(Long technologiesCount) {
    this.technologiesCount = technologiesCount;
    return this;
  }

  /**
   * technologies count
* number of domains that match the parameters you specified and are using the indicated technology
   * @return technologiesCount
   */
  @javax.annotation.Nullable
  public Long getTechnologiesCount() {
    return technologiesCount;
  }

  public void setTechnologiesCount(Long technologiesCount) {
    this.technologiesCount = technologiesCount;
  }



  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem putAdditionalProperty(String key, Object value) {
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


    
    DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem domainAnalyticsTechnologiesAggregationTechnologiesLiveItem = (DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem) o;
    return

        Objects.equals(this.type, domainAnalyticsTechnologiesAggregationTechnologiesLiveItem.type) &&
        Objects.equals(this.group, domainAnalyticsTechnologiesAggregationTechnologiesLiveItem.group) &&
        Objects.equals(this.category, domainAnalyticsTechnologiesAggregationTechnologiesLiveItem.category) &&
        Objects.equals(this.technology, domainAnalyticsTechnologiesAggregationTechnologiesLiveItem.technology) &&
        Objects.equals(this.groupsCount, domainAnalyticsTechnologiesAggregationTechnologiesLiveItem.groupsCount) &&
        Objects.equals(this.categoriesCount, domainAnalyticsTechnologiesAggregationTechnologiesLiveItem.categoriesCount) &&
        Objects.equals(this.technologiesCount, domainAnalyticsTechnologiesAggregationTechnologiesLiveItem.technologiesCount);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, group, category, technology, groupsCount, categoriesCount, technologiesCount);
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
    sb.append("class DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    technology: ").append(toIndentedString(technology)).append("\n");
    sb.append("    groupsCount: ").append(toIndentedString(groupsCount)).append("\n");
    sb.append("    categoriesCount: ").append(toIndentedString(categoriesCount)).append("\n");
    sb.append("    technologiesCount: ").append(toIndentedString(technologiesCount)).append("\n");
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
    
    openapiFields.add("group");
    
    openapiFields.add("category");
    
    openapiFields.add("technology");
    
    openapiFields.add("groups_count");
    
    openapiFields.add("categories_count");
    
    openapiFields.add("technologies_count");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem.class));

       return (TypeAdapter<T>) new TypeAdapter<DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem>() {
           @Override
           public void write(JsonWriter out, DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem value) throws IOException {
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
           public DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}