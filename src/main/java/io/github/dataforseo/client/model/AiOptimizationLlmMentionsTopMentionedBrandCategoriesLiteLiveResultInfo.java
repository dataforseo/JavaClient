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


public class AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo  {


  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Long totalCount;

  public AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * <em>total number of results</em>
   * @return totalCount
   */
  @javax.annotation.Nullable
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }


  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * <em>offset in the results array of the returned mentions data</em><br><code>offset</code> specified in the request
   * @return offset
   */
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public static final String SERIALIZED_NAME_ITEMS_COUNT = "items_count";
  @SerializedName(SERIALIZED_NAME_ITEMS_COUNT)
  private Long itemsCount;

  public AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo itemsCount(Long itemsCount) {
    this.itemsCount = itemsCount;
    return this;
  }

  /**
   * <em>number of items in the results array</em>
   * @return itemsCount
   */
  @javax.annotation.Nullable
  public Long getItemsCount() {
    return itemsCount;
  }

  public void setItemsCount(Long itemsCount) {
    this.itemsCount = itemsCount;
  }


  public static final String SERIALIZED_NAME_AGGREGATED_METRICS = "aggregated_metrics";
  @SerializedName(SERIALIZED_NAME_AGGREGATED_METRICS)
  private Object aggregatedMetrics;

  public AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo aggregatedMetrics(Object aggregatedMetrics) {
    this.aggregatedMetrics = aggregatedMetrics;
    return this;
  }

  /**
   * <em>aggregated mentions metrics summary</em><br>contains overall aggregated LLM mention metrics across all found domains, grouped by various dimensions</br>in this case, the value will be <code>null</code>
   * @return aggregatedMetrics
   */
  @javax.annotation.Nullable
  public Object getAggregatedMetrics() {
    return aggregatedMetrics;
  }

  public void setAggregatedMetrics(Object aggregatedMetrics) {
    this.aggregatedMetrics = aggregatedMetrics;
  }


  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveItem> items;

  public AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo items(List<AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveItem> items) {
    this.items = items;
    return this;
  }

  /**
   * <em>contains relevant mentions data</em>
   * @return items
   */
  @javax.annotation.Nullable
  public List<AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveItem> getItems() {
    return items;
  }

  public void setItems(List<AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveItem> items) {
    this.items = items;
  }



  public AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo putAdditionalProperty(String key, Object value) {
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


    
    AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo aiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo = (AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo) o;
    return

        Objects.equals(this.totalCount, aiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo.totalCount) &&
        Objects.equals(this.offset, aiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo.offset) &&
        Objects.equals(this.itemsCount, aiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo.itemsCount) &&
        Objects.equals(this.aggregatedMetrics, aiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo.aggregatedMetrics) &&
        Objects.equals(this.items, aiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo.items);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(totalCount, offset, itemsCount, aggregatedMetrics, items);
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
    sb.append("class AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo {\n");

    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    itemsCount: ").append(toIndentedString(itemsCount)).append("\n");
    sb.append("    aggregatedMetrics: ").append(toIndentedString(aggregatedMetrics)).append("\n");
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
    
    openapiFields.add("total_count");
    
    openapiFields.add("offset");
    
    openapiFields.add("items_count");
    
    openapiFields.add("aggregated_metrics");
    
    openapiFields.add("items");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo>() {
           @Override
           public void write(JsonWriter out, AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo value) throws IOException {
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
           public AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiOptimizationLlmMentionsTopMentionedBrandCategoriesLiteLiveResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}