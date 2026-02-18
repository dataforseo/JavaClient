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



public class BaseSerpApiYoutubeOrganicElementItem  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public BaseSerpApiYoutubeOrganicElementItem type(String type) {
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

  public BaseSerpApiYoutubeOrganicElementItem rankGroup(Integer rankGroup) {
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

  public BaseSerpApiYoutubeOrganicElementItem rankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
    return this;
  }

  /**
   * absolute rank in SERP for the target domain
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


  public static final String SERIALIZED_NAME_BLOCK_RANK = "block_rank";
  @SerializedName(SERIALIZED_NAME_BLOCK_RANK)
  private Integer blockRank;

  public BaseSerpApiYoutubeOrganicElementItem blockRank(Integer blockRank) {
    this.blockRank = blockRank;
    return this;
  }

  /**
   * block rank in SERP
* position among all the blocks in SERP
   * @return blockRank
   */
  @javax.annotation.Nullable
  public Integer getBlockRank() {
    return blockRank;
  }

  public void setBlockRank(Integer blockRank) {
    this.blockRank = blockRank;
  }


  public static final String SERIALIZED_NAME_BLOCK_NAME = "block_name";
  @SerializedName(SERIALIZED_NAME_BLOCK_NAME)
  private String blockName;

  public BaseSerpApiYoutubeOrganicElementItem blockName(String blockName) {
    this.blockName = blockName;
    return this;
  }

  /**
   * name of the block in SERP
* example:
* 'People also watched'
   * @return blockName
   */
  @javax.annotation.Nullable
  public String getBlockName() {
    return blockName;
  }

  public void setBlockName(String blockName) {
    this.blockName = blockName;
  }


  public static final String SERIALIZED_NAME_CHANNEL_ID = "channel_id";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private String channelId;

  public BaseSerpApiYoutubeOrganicElementItem channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * ID of the channel
   * @return channelId
   */
  @javax.annotation.Nullable
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }


  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public BaseSerpApiYoutubeOrganicElementItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the channel
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }



  public BaseSerpApiYoutubeOrganicElementItem() {
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }


    
    BaseSerpApiYoutubeOrganicElementItem baseSerpApiYoutubeOrganicElementItem = (BaseSerpApiYoutubeOrganicElementItem) o;
    return

        Objects.equals(this.type, baseSerpApiYoutubeOrganicElementItem.type) &&
        Objects.equals(this.rankGroup, baseSerpApiYoutubeOrganicElementItem.rankGroup) &&
        Objects.equals(this.rankAbsolute, baseSerpApiYoutubeOrganicElementItem.rankAbsolute) &&
        Objects.equals(this.blockRank, baseSerpApiYoutubeOrganicElementItem.blockRank) &&
        Objects.equals(this.blockName, baseSerpApiYoutubeOrganicElementItem.blockName) &&
        Objects.equals(this.channelId, baseSerpApiYoutubeOrganicElementItem.channelId) &&
        Objects.equals(this.url, baseSerpApiYoutubeOrganicElementItem.url);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, rankGroup, rankAbsolute, blockRank, blockName, channelId, url);
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
    sb.append("class BaseSerpApiYoutubeOrganicElementItem {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    blockRank: ").append(toIndentedString(blockRank)).append("\n");
    sb.append("    blockName: ").append(toIndentedString(blockName)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    
    openapiFields.add("block_rank");
    
    openapiFields.add("block_name");
    
    openapiFields.add("channel_id");
    
    openapiFields.add("url");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  
  public static BaseSerpApiYoutubeOrganicElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BaseSerpApiYoutubeOrganicElementItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}