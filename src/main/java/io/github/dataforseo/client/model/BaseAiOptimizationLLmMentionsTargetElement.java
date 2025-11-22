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



public class BaseAiOptimizationLLmMentionsTargetElement  {


  public static final String SERIALIZED_NAME_SEARCH_SCOPE = "search_scope";
  @SerializedName(SERIALIZED_NAME_SEARCH_SCOPE)
  private List<String> searchScope;

  public BaseAiOptimizationLLmMentionsTargetElement searchScope(List<String> searchScope) {
    this.searchScope = searchScope;
    return this;
  }

  /**
   * target domain search scope
* optional field
* possible values:
* any, sources, search_results
* default value: any
   * @return searchScope
   */
  @javax.annotation.Nullable
  public List<String> getSearchScope() {
    return searchScope;
  }

  public void setSearchScope(List<String> searchScope) {
    this.searchScope = searchScope;
  }


  public static final String SERIALIZED_NAME_SEARCH_FILTER = "search_filter";
  @SerializedName(SERIALIZED_NAME_SEARCH_FILTER)
  private String searchFilter;

  public BaseAiOptimizationLLmMentionsTargetElement searchFilter(String searchFilter) {
    this.searchFilter = searchFilter;
    return this;
  }

  /**
   * target domain search filter
* optional field
* possible values:
* include, exclude
* default value: include
   * @return searchFilter
   */
  @javax.annotation.Nullable
  public String getSearchFilter() {
    return searchFilter;
  }

  public void setSearchFilter(String searchFilter) {
    this.searchFilter = searchFilter;
  }



  public BaseAiOptimizationLLmMentionsTargetElement() {
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }


    
    BaseAiOptimizationLLmMentionsTargetElement baseAiOptimizationLLmMentionsTargetElement = (BaseAiOptimizationLLmMentionsTargetElement) o;
    return

        Objects.equals(this.searchScope, baseAiOptimizationLLmMentionsTargetElement.searchScope) &&
        Objects.equals(this.searchFilter, baseAiOptimizationLLmMentionsTargetElement.searchFilter);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(searchScope, searchFilter);
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
    sb.append("class BaseAiOptimizationLLmMentionsTargetElement {\n");

    sb.append("    searchScope: ").append(toIndentedString(searchScope)).append("\n");
    sb.append("    searchFilter: ").append(toIndentedString(searchFilter)).append("\n");
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
    
    openapiFields.add("search_scope");
    
    openapiFields.add("search_filter");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  
  public static BaseAiOptimizationLLmMentionsTargetElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BaseAiOptimizationLLmMentionsTargetElement.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}