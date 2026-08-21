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


public class YoutubeVideoInfo  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public YoutubeVideoInfo type(String type) {
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

  public YoutubeVideoInfo rankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
    return this;
  }

  /**
   * <em>group rank in SERP</em><br>            position within a group of elements with identical <code>type</code> values<br>            positions of elements with different <code>type</code> values are omitted from <code>rank_group</code>
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

  public YoutubeVideoInfo rankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
    return this;
  }

  /**
   * <em> absolute rank in SERP for the target domain</em><br>            absolute position among all the elements in SERP
   * @return rankAbsolute
   */
  @javax.annotation.Nullable
  public Integer getRankAbsolute() {
    return rankAbsolute;
  }

  public void setRankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
  }


  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId;

  public YoutubeVideoInfo videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

  /**
   * <em>ID of the video received in a POST array</em>
   * @return videoId
   */
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public YoutubeVideoInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <em>title of the video</em>
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

  public YoutubeVideoInfo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <em>URL of the video</em>
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public static final String SERIALIZED_NAME_THUMBNAIL_URL = "thumbnail_url";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_URL)
  private String thumbnailUrl;

  public YoutubeVideoInfo thumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }

  /**
   * <em>the URL of the page where the thumbnail is hosted</em>
   * @return thumbnailUrl
   */
  @javax.annotation.Nullable
  public String getThumbnailUrl() {
    return thumbnailUrl;
  }

  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }


  public static final String SERIALIZED_NAME_CHANNEL_ID = "channel_id";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private String channelId;

  public YoutubeVideoInfo channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * <em>the ID of the channel where the video is published</em>
   * @return channelId
   */
  @javax.annotation.Nullable
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }


  public static final String SERIALIZED_NAME_CHANNEL_NAME = "channel_name";
  @SerializedName(SERIALIZED_NAME_CHANNEL_NAME)
  private String channelName;

  public YoutubeVideoInfo channelName(String channelName) {
    this.channelName = channelName;
    return this;
  }

  /**
   * <em>the name of the channel where the video is published</em>
   * @return channelName
   */
  @javax.annotation.Nullable
  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }


  public static final String SERIALIZED_NAME_CHANNEL_URL = "channel_url";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URL)
  private String channelUrl;

  public YoutubeVideoInfo channelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

  /**
   * <em>the URL of the channel where the video is published</em>
   * @return channelUrl
   */
  @javax.annotation.Nullable
  public String getChannelUrl() {
    return channelUrl;
  }

  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public static final String SERIALIZED_NAME_CHANNEL_LOGO = "channel_logo";
  @SerializedName(SERIALIZED_NAME_CHANNEL_LOGO)
  private String channelLogo;

  public YoutubeVideoInfo channelLogo(String channelLogo) {
    this.channelLogo = channelLogo;
    return this;
  }

  /**
   * <em>the URL of the page where the logo image of the channel is hosted</em>
   * @return channelLogo
   */
  @javax.annotation.Nullable
  public String getChannelLogo() {
    return channelLogo;
  }

  public void setChannelLogo(String channelLogo) {
    this.channelLogo = channelLogo;
  }


  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public YoutubeVideoInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <em>description of the video</em>
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public static final String SERIALIZED_NAME_VIEWS_COUNT = "views_count";
  @SerializedName(SERIALIZED_NAME_VIEWS_COUNT)
  private Long viewsCount;

  public YoutubeVideoInfo viewsCount(Long viewsCount) {
    this.viewsCount = viewsCount;
    return this;
  }

  /**
   * <em>number of views of the video</em>
   * @return viewsCount
   */
  @javax.annotation.Nullable
  public Long getViewsCount() {
    return viewsCount;
  }

  public void setViewsCount(Long viewsCount) {
    this.viewsCount = viewsCount;
  }


  public static final String SERIALIZED_NAME_LIKES_COUNT = "likes_count";
  @SerializedName(SERIALIZED_NAME_LIKES_COUNT)
  private Long likesCount;

  public YoutubeVideoInfo likesCount(Long likesCount) {
    this.likesCount = likesCount;
    return this;
  }

  /**
   * <em>number of likes on the video</em>
   * @return likesCount
   */
  @javax.annotation.Nullable
  public Long getLikesCount() {
    return likesCount;
  }

  public void setLikesCount(Long likesCount) {
    this.likesCount = likesCount;
  }


  public static final String SERIALIZED_NAME_COMMENTS_COUNT = "comments_count";
  @SerializedName(SERIALIZED_NAME_COMMENTS_COUNT)
  private Long commentsCount;

  public YoutubeVideoInfo commentsCount(Long commentsCount) {
    this.commentsCount = commentsCount;
    return this;
  }

  /**
   * <em>number of comments on the video</em>
   * @return commentsCount
   */
  @javax.annotation.Nullable
  public Long getCommentsCount() {
    return commentsCount;
  }

  public void setCommentsCount(Long commentsCount) {
    this.commentsCount = commentsCount;
  }


  public static final String SERIALIZED_NAME_CHANNEL_SUBSCRIBERS_COUNT = "channel_subscribers_count";
  @SerializedName(SERIALIZED_NAME_CHANNEL_SUBSCRIBERS_COUNT)
  private ChannelSubscribersCount channelSubscribersCount;

  public YoutubeVideoInfo channelSubscribersCount(ChannelSubscribersCount channelSubscribersCount) {
    this.channelSubscribersCount = channelSubscribersCount;
    return this;
  }

  /**
   * <em>number of subscribers of the channel</em>
   * @return channelSubscribersCount
   */
  @javax.annotation.Nullable
  public ChannelSubscribersCount getChannelSubscribersCount() {
    return channelSubscribersCount;
  }

  public void setChannelSubscribersCount(ChannelSubscribersCount channelSubscribersCount) {
    this.channelSubscribersCount = channelSubscribersCount;
  }


  public static final String SERIALIZED_NAME_PUBLICATION_DATE = "publication_date";
  @SerializedName(SERIALIZED_NAME_PUBLICATION_DATE)
  private String publicationDate;

  public YoutubeVideoInfo publicationDate(String publicationDate) {
    this.publicationDate = publicationDate;
    return this;
  }

  /**
   * <em>the date when the video is published</em>
   * @return publicationDate
   */
  @javax.annotation.Nullable
  public String getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(String publicationDate) {
    this.publicationDate = publicationDate;
  }


  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public YoutubeVideoInfo timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * <em>date and time when the result is published</em><br>            in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”<br>            example:<br>            <code>2022-11-15 12:57:46 +00:00</code>
   * @return timestamp
   */
  @javax.annotation.Nullable
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<String> keywords;

  public YoutubeVideoInfo keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  /**
   * <em>keywords relevant to the video</em><br>            also known as 'YouTube tags'
   * @return keywords
   */
  @javax.annotation.Nullable
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public YoutubeVideoInfo category(String category) {
    this.category = category;
    return this;
  }

  /**
   * <em>the category the video belongs to</em>
   * @return category
   */
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  public static final String SERIALIZED_NAME_IS_LIVE = "is_live";
  @SerializedName(SERIALIZED_NAME_IS_LIVE)
  private Boolean isLive;

  public YoutubeVideoInfo isLive(Boolean isLive) {
    this.isLive = isLive;
    return this;
  }

  /**
   * <em>indicates whether the video is on live</em>
   * @return isLive
   */
  @javax.annotation.Nullable
  public Boolean getIsLive() {
    return isLive;
  }

  public void setIsLive(Boolean isLive) {
    this.isLive = isLive;
  }


  public static final String SERIALIZED_NAME_IS_EMBEDDABLE = "is_embeddable";
  @SerializedName(SERIALIZED_NAME_IS_EMBEDDABLE)
  private Boolean isEmbeddable;

  public YoutubeVideoInfo isEmbeddable(Boolean isEmbeddable) {
    this.isEmbeddable = isEmbeddable;
    return this;
  }

  /**
   * <em>indicates whether the video is embeddable</em>
   * @return isEmbeddable
   */
  @javax.annotation.Nullable
  public Boolean getIsEmbeddable() {
    return isEmbeddable;
  }

  public void setIsEmbeddable(Boolean isEmbeddable) {
    this.isEmbeddable = isEmbeddable;
  }


  public static final String SERIALIZED_NAME_DURATION_TIME = "duration_time";
  @SerializedName(SERIALIZED_NAME_DURATION_TIME)
  private String durationTime;

  public YoutubeVideoInfo durationTime(String durationTime) {
    this.durationTime = durationTime;
    return this;
  }

  /**
   * <em>duration of the video</em>
   * @return durationTime
   */
  @javax.annotation.Nullable
  public String getDurationTime() {
    return durationTime;
  }

  public void setDurationTime(String durationTime) {
    this.durationTime = durationTime;
  }


  public static final String SERIALIZED_NAME_DURATION_TIME_SECONDS = "duration_time_seconds";
  @SerializedName(SERIALIZED_NAME_DURATION_TIME_SECONDS)
  private Integer durationTimeSeconds;

  public YoutubeVideoInfo durationTimeSeconds(Integer durationTimeSeconds) {
    this.durationTimeSeconds = durationTimeSeconds;
    return this;
  }

  /**
   * <em>duration of the video in seconds</em>
   * @return durationTimeSeconds
   */
  @javax.annotation.Nullable
  public Integer getDurationTimeSeconds() {
    return durationTimeSeconds;
  }

  public void setDurationTimeSeconds(Integer durationTimeSeconds) {
    this.durationTimeSeconds = durationTimeSeconds;
  }


  public static final String SERIALIZED_NAME_SUBTITLES = "subtitles";
  @SerializedName(SERIALIZED_NAME_SUBTITLES)
  private List<Subtitles> subtitles;

  public YoutubeVideoInfo subtitles(List<Subtitles> subtitles) {
    this.subtitles = subtitles;
    return this;
  }

  /**
   * <em>array of elements describing properties of subtitles in the video</em>
   * @return subtitles
   */
  @javax.annotation.Nullable
  public List<Subtitles> getSubtitles() {
    return subtitles;
  }

  public void setSubtitles(List<Subtitles> subtitles) {
    this.subtitles = subtitles;
  }


  public static final String SERIALIZED_NAME_STREAMING_QUALITY = "streaming_quality";
  @SerializedName(SERIALIZED_NAME_STREAMING_QUALITY)
  private List<StreamingQualityElement> streamingQuality;

  public YoutubeVideoInfo streamingQuality(List<StreamingQualityElement> streamingQuality) {
    this.streamingQuality = streamingQuality;
    return this;
  }

  /**
   * <em>array of elements that contain information about all possible streaming qualities of the video</em>
   * @return streamingQuality
   */
  @javax.annotation.Nullable
  public List<StreamingQualityElement> getStreamingQuality() {
    return streamingQuality;
  }

  public void setStreamingQuality(List<StreamingQualityElement> streamingQuality) {
    this.streamingQuality = streamingQuality;
  }



  public YoutubeVideoInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public YoutubeVideoInfo putAdditionalProperty(String key, Object value) {
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


    
    YoutubeVideoInfo youtubeVideoInfo = (YoutubeVideoInfo) o;
    return

        Objects.equals(this.type, youtubeVideoInfo.type) &&
        Objects.equals(this.rankGroup, youtubeVideoInfo.rankGroup) &&
        Objects.equals(this.rankAbsolute, youtubeVideoInfo.rankAbsolute) &&
        Objects.equals(this.videoId, youtubeVideoInfo.videoId) &&
        Objects.equals(this.title, youtubeVideoInfo.title) &&
        Objects.equals(this.url, youtubeVideoInfo.url) &&
        Objects.equals(this.thumbnailUrl, youtubeVideoInfo.thumbnailUrl) &&
        Objects.equals(this.channelId, youtubeVideoInfo.channelId) &&
        Objects.equals(this.channelName, youtubeVideoInfo.channelName) &&
        Objects.equals(this.channelUrl, youtubeVideoInfo.channelUrl) &&
        Objects.equals(this.channelLogo, youtubeVideoInfo.channelLogo) &&
        Objects.equals(this.description, youtubeVideoInfo.description) &&
        Objects.equals(this.viewsCount, youtubeVideoInfo.viewsCount) &&
        Objects.equals(this.likesCount, youtubeVideoInfo.likesCount) &&
        Objects.equals(this.commentsCount, youtubeVideoInfo.commentsCount) &&
        Objects.equals(this.channelSubscribersCount, youtubeVideoInfo.channelSubscribersCount) &&
        Objects.equals(this.publicationDate, youtubeVideoInfo.publicationDate) &&
        Objects.equals(this.timestamp, youtubeVideoInfo.timestamp) &&
        Objects.equals(this.keywords, youtubeVideoInfo.keywords) &&
        Objects.equals(this.category, youtubeVideoInfo.category) &&
        Objects.equals(this.isLive, youtubeVideoInfo.isLive) &&
        Objects.equals(this.isEmbeddable, youtubeVideoInfo.isEmbeddable) &&
        Objects.equals(this.durationTime, youtubeVideoInfo.durationTime) &&
        Objects.equals(this.durationTimeSeconds, youtubeVideoInfo.durationTimeSeconds) &&
        Objects.equals(this.subtitles, youtubeVideoInfo.subtitles) &&
        Objects.equals(this.streamingQuality, youtubeVideoInfo.streamingQuality);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, rankGroup, rankAbsolute, videoId, title, url, thumbnailUrl, channelId, channelName, channelUrl, channelLogo, description, viewsCount, likesCount, commentsCount, channelSubscribersCount, publicationDate, timestamp, keywords, category, isLive, isEmbeddable, durationTime, durationTimeSeconds, subtitles, streamingQuality);
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
    sb.append("class YoutubeVideoInfo {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    channelLogo: ").append(toIndentedString(channelLogo)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    viewsCount: ").append(toIndentedString(viewsCount)).append("\n");
    sb.append("    likesCount: ").append(toIndentedString(likesCount)).append("\n");
    sb.append("    commentsCount: ").append(toIndentedString(commentsCount)).append("\n");
    sb.append("    channelSubscribersCount: ").append(toIndentedString(channelSubscribersCount)).append("\n");
    sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    isLive: ").append(toIndentedString(isLive)).append("\n");
    sb.append("    isEmbeddable: ").append(toIndentedString(isEmbeddable)).append("\n");
    sb.append("    durationTime: ").append(toIndentedString(durationTime)).append("\n");
    sb.append("    durationTimeSeconds: ").append(toIndentedString(durationTimeSeconds)).append("\n");
    sb.append("    subtitles: ").append(toIndentedString(subtitles)).append("\n");
    sb.append("    streamingQuality: ").append(toIndentedString(streamingQuality)).append("\n");
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
    
    openapiFields.add("video_id");
    
    openapiFields.add("title");
    
    openapiFields.add("url");
    
    openapiFields.add("thumbnail_url");
    
    openapiFields.add("channel_id");
    
    openapiFields.add("channel_name");
    
    openapiFields.add("channel_url");
    
    openapiFields.add("channel_logo");
    
    openapiFields.add("description");
    
    openapiFields.add("views_count");
    
    openapiFields.add("likes_count");
    
    openapiFields.add("comments_count");
    
    openapiFields.add("channel_subscribers_count");
    
    openapiFields.add("publication_date");
    
    openapiFields.add("timestamp");
    
    openapiFields.add("keywords");
    
    openapiFields.add("category");
    
    openapiFields.add("is_live");
    
    openapiFields.add("is_embeddable");
    
    openapiFields.add("duration_time");
    
    openapiFields.add("duration_time_seconds");
    
    openapiFields.add("subtitles");
    
    openapiFields.add("streaming_quality");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to YoutubeVideoInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!YoutubeVideoInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'YoutubeVideoInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<YoutubeVideoInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(YoutubeVideoInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<YoutubeVideoInfo>() {
           @Override
           public void write(JsonWriter out, YoutubeVideoInfo value) throws IOException {
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
           public YoutubeVideoInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             YoutubeVideoInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static YoutubeVideoInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, YoutubeVideoInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}