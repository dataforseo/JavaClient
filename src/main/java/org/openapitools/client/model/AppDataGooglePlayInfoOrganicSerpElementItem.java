/*
 * DataForSEO API documentation
 * DataForSEO API is the starting point on your journey towards building powerful SEO software. With DataForSEO you can get all the data you need to build an efficient application while also saving your time and budget. DataForSEO API is using the REST technology for interchanging data between your application and our service. The data exchange is made through the widely used HTTP protocol, which allows applying our API to almost all programming languages.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AppsInfo;
import org.openapitools.client.model.BaseAppDataSerpElementItem;
import org.openapitools.client.model.PriceInfo;
import org.openapitools.client.model.RatingInfo;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * AppDataGooglePlayInfoOrganicSerpElementItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T15:03:59.388297468Z[Etc/UTC]")
public class AppDataGooglePlayInfoOrganicSerpElementItem extends BaseAppDataSerpElementItem {
  public static final String SERIALIZED_NAME_RANK_GROUP = "rank_group";
  @SerializedName(SERIALIZED_NAME_RANK_GROUP)
  private Integer rankGroup;

  public static final String SERIALIZED_NAME_RANK_ABSOLUTE = "rank_absolute";
  @SerializedName(SERIALIZED_NAME_RANK_ABSOLUTE)
  private Integer rankAbsolute;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private String position;

  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_REVIEWS_COUNT = "reviews_count";
  @SerializedName(SERIALIZED_NAME_REVIEWS_COUNT)
  private Long reviewsCount;

  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private RatingInfo rating;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private PriceInfo price;

  public static final String SERIALIZED_NAME_IS_FREE = "is_free";
  @SerializedName(SERIALIZED_NAME_IS_FREE)
  private Boolean isFree;

  public static final String SERIALIZED_NAME_MAIN_CATEGORY = "main_category";
  @SerializedName(SERIALIZED_NAME_MAIN_CATEGORY)
  private String mainCategory;

  public static final String SERIALIZED_NAME_INSTALLS = "installs";
  @SerializedName(SERIALIZED_NAME_INSTALLS)
  private String installs;

  public static final String SERIALIZED_NAME_INSTALLS_COUNT = "installs_count";
  @SerializedName(SERIALIZED_NAME_INSTALLS_COUNT)
  private Long installsCount;

  public static final String SERIALIZED_NAME_DEVELOPER = "developer";
  @SerializedName(SERIALIZED_NAME_DEVELOPER)
  private String developer;

  public static final String SERIALIZED_NAME_DEVELOPER_ID = "developer_id";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_ID)
  private String developerId;

  public static final String SERIALIZED_NAME_DEVELOPER_URL = "developer_url";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_URL)
  private String developerUrl;

  public static final String SERIALIZED_NAME_DEVELOPER_EMAIL = "developer_email";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_EMAIL)
  private String developerEmail;

  public static final String SERIALIZED_NAME_DEVELOPER_ADDRESS = "developer_address";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_ADDRESS)
  private String developerAddress;

  public static final String SERIALIZED_NAME_DEVELOPER_WEBSITE = "developer_website";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_WEBSITE)
  private String developerWebsite;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_MINIMUM_OS_VERSION = "minimum_os_version";
  @SerializedName(SERIALIZED_NAME_MINIMUM_OS_VERSION)
  private String minimumOsVersion;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private String size;

  public static final String SERIALIZED_NAME_RELEASED_DATE = "released_date";
  @SerializedName(SERIALIZED_NAME_RELEASED_DATE)
  private String releasedDate;

  public static final String SERIALIZED_NAME_LAST_UPDATE_DATE = "last_update_date";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE_DATE)
  private String lastUpdateDate;

  public static final String SERIALIZED_NAME_UPDATE_NOTES = "update_notes";
  @SerializedName(SERIALIZED_NAME_UPDATE_NOTES)
  private String updateNotes;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<String> images;

  public static final String SERIALIZED_NAME_VIDEOS = "videos";
  @SerializedName(SERIALIZED_NAME_VIDEOS)
  private List<String> videos;

  public static final String SERIALIZED_NAME_SIMILAR_APPS = "similar_apps";
  @SerializedName(SERIALIZED_NAME_SIMILAR_APPS)
  private List<AppsInfo> similarApps;

  public static final String SERIALIZED_NAME_MORE_APPS_BY_DEVELOPER = "more_apps_by_developer";
  @SerializedName(SERIALIZED_NAME_MORE_APPS_BY_DEVELOPER)
  private List<AppsInfo> moreAppsByDeveloper;

  public static final String SERIALIZED_NAME_GENRES = "genres";
  @SerializedName(SERIALIZED_NAME_GENRES)
  private List<String> genres;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags;

  public AppDataGooglePlayInfoOrganicSerpElementItem() {
    this.type = this.getClass().getSimpleName();
  }

  public AppDataGooglePlayInfoOrganicSerpElementItem rankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
    return this;
  }

   /**
   * position within a group of elements with identical type values positions of elements with different type values are omitted from rank_group
   * @return rankGroup
  **/
  @javax.annotation.Nullable
  public Integer getRankGroup() {
    return rankGroup;
  }

  public void setRankGroup(Integer rankGroup) {
    this.rankGroup = rankGroup;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem rankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
    return this;
  }

   /**
   * absolute rank among all the listed apps absolute position among all apps on the list
   * @return rankAbsolute
  **/
  @javax.annotation.Nullable
  public Integer getRankAbsolute() {
    return rankAbsolute;
  }

  public void setRankAbsolute(Integer rankAbsolute) {
    this.rankAbsolute = rankAbsolute;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem position(String position) {
    this.position = position;
    return this;
  }

   /**
   * the alignment of the element in SERP can take the following values: left
   * @return position
  **/
  @javax.annotation.Nullable
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * ID of the app
   * @return appId
  **/
  @javax.annotation.Nullable
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem title(String title) {
    this.title = title;
    return this;
  }

   /**
   * title of the app
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL to the app page on Google Play
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * URL to the app icon
   * @return icon
  **/
  @javax.annotation.Nullable
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description of the app
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem reviewsCount(Long reviewsCount) {
    this.reviewsCount = reviewsCount;
    return this;
  }

   /**
   * the total number of reviews the app has
   * @return reviewsCount
  **/
  @javax.annotation.Nullable
  public Long getReviewsCount() {
    return reviewsCount;
  }

  public void setReviewsCount(Long reviewsCount) {
    this.reviewsCount = reviewsCount;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem rating(RatingInfo rating) {
    this.rating = rating;
    return this;
  }

   /**
   * Get rating
   * @return rating
  **/
  @javax.annotation.Nullable
  public RatingInfo getRating() {
    return rating;
  }

  public void setRating(RatingInfo rating) {
    this.rating = rating;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem price(PriceInfo price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  public PriceInfo getPrice() {
    return price;
  }

  public void setPrice(PriceInfo price) {
    this.price = price;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem isFree(Boolean isFree) {
    this.isFree = isFree;
    return this;
  }

   /**
   * indicates whether the app is free
   * @return isFree
  **/
  @javax.annotation.Nullable
  public Boolean getIsFree() {
    return isFree;
  }

  public void setIsFree(Boolean isFree) {
    this.isFree = isFree;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem mainCategory(String mainCategory) {
    this.mainCategory = mainCategory;
    return this;
  }

   /**
   * main category of the app
   * @return mainCategory
  **/
  @javax.annotation.Nullable
  public String getMainCategory() {
    return mainCategory;
  }

  public void setMainCategory(String mainCategory) {
    this.mainCategory = mainCategory;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem installs(String installs) {
    this.installs = installs;
    return this;
  }

   /**
   * number of installs of the app approximate number of installs as displayed on the app page
   * @return installs
  **/
  @javax.annotation.Nullable
  public String getInstalls() {
    return installs;
  }

  public void setInstalls(String installs) {
    this.installs = installs;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem installsCount(Long installsCount) {
    this.installsCount = installsCount;
    return this;
  }

   /**
   * number of installs of the app the exact number of installs of the app
   * @return installsCount
  **/
  @javax.annotation.Nullable
  public Long getInstallsCount() {
    return installsCount;
  }

  public void setInstallsCount(Long installsCount) {
    this.installsCount = installsCount;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem developer(String developer) {
    this.developer = developer;
    return this;
  }

   /**
   * name of the app developer
   * @return developer
  **/
  @javax.annotation.Nullable
  public String getDeveloper() {
    return developer;
  }

  public void setDeveloper(String developer) {
    this.developer = developer;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem developerId(String developerId) {
    this.developerId = developerId;
    return this;
  }

   /**
   * ID of the app developer
   * @return developerId
  **/
  @javax.annotation.Nullable
  public String getDeveloperId() {
    return developerId;
  }

  public void setDeveloperId(String developerId) {
    this.developerId = developerId;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem developerUrl(String developerUrl) {
    this.developerUrl = developerUrl;
    return this;
  }

   /**
   * URL to the developer page on Google Play
   * @return developerUrl
  **/
  @javax.annotation.Nullable
  public String getDeveloperUrl() {
    return developerUrl;
  }

  public void setDeveloperUrl(String developerUrl) {
    this.developerUrl = developerUrl;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem developerEmail(String developerEmail) {
    this.developerEmail = developerEmail;
    return this;
  }

   /**
   * email address of the developer
   * @return developerEmail
  **/
  @javax.annotation.Nullable
  public String getDeveloperEmail() {
    return developerEmail;
  }

  public void setDeveloperEmail(String developerEmail) {
    this.developerEmail = developerEmail;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem developerAddress(String developerAddress) {
    this.developerAddress = developerAddress;
    return this;
  }

   /**
   * physical address of the developer
   * @return developerAddress
  **/
  @javax.annotation.Nullable
  public String getDeveloperAddress() {
    return developerAddress;
  }

  public void setDeveloperAddress(String developerAddress) {
    this.developerAddress = developerAddress;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem developerWebsite(String developerWebsite) {
    this.developerWebsite = developerWebsite;
    return this;
  }

   /**
   * official website of the developer
   * @return developerWebsite
  **/
  @javax.annotation.Nullable
  public String getDeveloperWebsite() {
    return developerWebsite;
  }

  public void setDeveloperWebsite(String developerWebsite) {
    this.developerWebsite = developerWebsite;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem version(String version) {
    this.version = version;
    return this;
  }

   /**
   * current version of the app
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem minimumOsVersion(String minimumOsVersion) {
    this.minimumOsVersion = minimumOsVersion;
    return this;
  }

   /**
   * minimum OS version required to install the app
   * @return minimumOsVersion
  **/
  @javax.annotation.Nullable
  public String getMinimumOsVersion() {
    return minimumOsVersion;
  }

  public void setMinimumOsVersion(String minimumOsVersion) {
    this.minimumOsVersion = minimumOsVersion;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem size(String size) {
    this.size = size;
    return this;
  }

   /**
   * size of the app
   * @return size
  **/
  @javax.annotation.Nullable
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem releasedDate(String releasedDate) {
    this.releasedDate = releasedDate;
    return this;
  }

   /**
   * date and time when the app was released in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”; example: 2019-11-15 12:57:46 +00:00
   * @return releasedDate
  **/
  @javax.annotation.Nullable
  public String getReleasedDate() {
    return releasedDate;
  }

  public void setReleasedDate(String releasedDate) {
    this.releasedDate = releasedDate;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem lastUpdateDate(String lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
    return this;
  }

   /**
   * date and time when the app was last updated in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”; example: 2019-11-15 12:57:46 +00:00
   * @return lastUpdateDate
  **/
  @javax.annotation.Nullable
  public String getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(String lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem updateNotes(String updateNotes) {
    this.updateNotes = updateNotes;
    return this;
  }

   /**
   * update notes contains the latest update notes from the developer
   * @return updateNotes
  **/
  @javax.annotation.Nullable
  public String getUpdateNotes() {
    return updateNotes;
  }

  public void setUpdateNotes(String updateNotes) {
    this.updateNotes = updateNotes;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem images(List<String> images) {
    this.images = images;
    return this;
  }

  public AppDataGooglePlayInfoOrganicSerpElementItem addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * app images contains URLs to the images published on the app page on Google Play
   * @return images
  **/
  @javax.annotation.Nullable
  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem videos(List<String> videos) {
    this.videos = videos;
    return this;
  }

  public AppDataGooglePlayInfoOrganicSerpElementItem addVideosItem(String videosItem) {
    if (this.videos == null) {
      this.videos = new ArrayList<>();
    }
    this.videos.add(videosItem);
    return this;
  }

   /**
   * app videos contains URLs to the video published on the app page on Google Play
   * @return videos
  **/
  @javax.annotation.Nullable
  public List<String> getVideos() {
    return videos;
  }

  public void setVideos(List<String> videos) {
    this.videos = videos;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem similarApps(List<AppsInfo> similarApps) {
    this.similarApps = similarApps;
    return this;
  }

  public AppDataGooglePlayInfoOrganicSerpElementItem addSimilarAppsItem(AppsInfo similarAppsItem) {
    if (this.similarApps == null) {
      this.similarApps = new ArrayList<>();
    }
    this.similarApps.add(similarAppsItem);
    return this;
  }

   /**
   * similar apps displays apps similar to the app in a POST request
   * @return similarApps
  **/
  @javax.annotation.Nullable
  public List<AppsInfo> getSimilarApps() {
    return similarApps;
  }

  public void setSimilarApps(List<AppsInfo> similarApps) {
    this.similarApps = similarApps;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem moreAppsByDeveloper(List<AppsInfo> moreAppsByDeveloper) {
    this.moreAppsByDeveloper = moreAppsByDeveloper;
    return this;
  }

  public AppDataGooglePlayInfoOrganicSerpElementItem addMoreAppsByDeveloperItem(AppsInfo moreAppsByDeveloperItem) {
    if (this.moreAppsByDeveloper == null) {
      this.moreAppsByDeveloper = new ArrayList<>();
    }
    this.moreAppsByDeveloper.add(moreAppsByDeveloperItem);
    return this;
  }

   /**
   * similar apps information about apps built by the same developer
   * @return moreAppsByDeveloper
  **/
  @javax.annotation.Nullable
  public List<AppsInfo> getMoreAppsByDeveloper() {
    return moreAppsByDeveloper;
  }

  public void setMoreAppsByDeveloper(List<AppsInfo> moreAppsByDeveloper) {
    this.moreAppsByDeveloper = moreAppsByDeveloper;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem genres(List<String> genres) {
    this.genres = genres;
    return this;
  }

  public AppDataGooglePlayInfoOrganicSerpElementItem addGenresItem(String genresItem) {
    if (this.genres == null) {
      this.genres = new ArrayList<>();
    }
    this.genres.add(genresItem);
    return this;
  }

   /**
   * app genres contains relevant app categories
   * @return genres
  **/
  @javax.annotation.Nullable
  public List<String> getGenres() {
    return genres;
  }

  public void setGenres(List<String> genres) {
    this.genres = genres;
  }


  public AppDataGooglePlayInfoOrganicSerpElementItem tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public AppDataGooglePlayInfoOrganicSerpElementItem addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * app tags contains relevant app tags
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppDataGooglePlayInfoOrganicSerpElementItem appDataGooglePlayInfoOrganicSerpElementItem = (AppDataGooglePlayInfoOrganicSerpElementItem) o;
    return Objects.equals(this.rankGroup, appDataGooglePlayInfoOrganicSerpElementItem.rankGroup) &&
        Objects.equals(this.rankAbsolute, appDataGooglePlayInfoOrganicSerpElementItem.rankAbsolute) &&
        Objects.equals(this.position, appDataGooglePlayInfoOrganicSerpElementItem.position) &&
        Objects.equals(this.appId, appDataGooglePlayInfoOrganicSerpElementItem.appId) &&
        Objects.equals(this.title, appDataGooglePlayInfoOrganicSerpElementItem.title) &&
        Objects.equals(this.url, appDataGooglePlayInfoOrganicSerpElementItem.url) &&
        Objects.equals(this.icon, appDataGooglePlayInfoOrganicSerpElementItem.icon) &&
        Objects.equals(this.description, appDataGooglePlayInfoOrganicSerpElementItem.description) &&
        Objects.equals(this.reviewsCount, appDataGooglePlayInfoOrganicSerpElementItem.reviewsCount) &&
        Objects.equals(this.rating, appDataGooglePlayInfoOrganicSerpElementItem.rating) &&
        Objects.equals(this.price, appDataGooglePlayInfoOrganicSerpElementItem.price) &&
        Objects.equals(this.isFree, appDataGooglePlayInfoOrganicSerpElementItem.isFree) &&
        Objects.equals(this.mainCategory, appDataGooglePlayInfoOrganicSerpElementItem.mainCategory) &&
        Objects.equals(this.installs, appDataGooglePlayInfoOrganicSerpElementItem.installs) &&
        Objects.equals(this.installsCount, appDataGooglePlayInfoOrganicSerpElementItem.installsCount) &&
        Objects.equals(this.developer, appDataGooglePlayInfoOrganicSerpElementItem.developer) &&
        Objects.equals(this.developerId, appDataGooglePlayInfoOrganicSerpElementItem.developerId) &&
        Objects.equals(this.developerUrl, appDataGooglePlayInfoOrganicSerpElementItem.developerUrl) &&
        Objects.equals(this.developerEmail, appDataGooglePlayInfoOrganicSerpElementItem.developerEmail) &&
        Objects.equals(this.developerAddress, appDataGooglePlayInfoOrganicSerpElementItem.developerAddress) &&
        Objects.equals(this.developerWebsite, appDataGooglePlayInfoOrganicSerpElementItem.developerWebsite) &&
        Objects.equals(this.version, appDataGooglePlayInfoOrganicSerpElementItem.version) &&
        Objects.equals(this.minimumOsVersion, appDataGooglePlayInfoOrganicSerpElementItem.minimumOsVersion) &&
        Objects.equals(this.size, appDataGooglePlayInfoOrganicSerpElementItem.size) &&
        Objects.equals(this.releasedDate, appDataGooglePlayInfoOrganicSerpElementItem.releasedDate) &&
        Objects.equals(this.lastUpdateDate, appDataGooglePlayInfoOrganicSerpElementItem.lastUpdateDate) &&
        Objects.equals(this.updateNotes, appDataGooglePlayInfoOrganicSerpElementItem.updateNotes) &&
        Objects.equals(this.images, appDataGooglePlayInfoOrganicSerpElementItem.images) &&
        Objects.equals(this.videos, appDataGooglePlayInfoOrganicSerpElementItem.videos) &&
        Objects.equals(this.similarApps, appDataGooglePlayInfoOrganicSerpElementItem.similarApps) &&
        Objects.equals(this.moreAppsByDeveloper, appDataGooglePlayInfoOrganicSerpElementItem.moreAppsByDeveloper) &&
        Objects.equals(this.genres, appDataGooglePlayInfoOrganicSerpElementItem.genres) &&
        Objects.equals(this.tags, appDataGooglePlayInfoOrganicSerpElementItem.tags) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(rankGroup, rankAbsolute, position, appId, title, url, icon, description, reviewsCount, rating, price, isFree, mainCategory, installs, installsCount, developer, developerId, developerUrl, developerEmail, developerAddress, developerWebsite, version, minimumOsVersion, size, releasedDate, lastUpdateDate, updateNotes, images, videos, similarApps, moreAppsByDeveloper, genres, tags, super.hashCode());
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
    sb.append("class AppDataGooglePlayInfoOrganicSerpElementItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    reviewsCount: ").append(toIndentedString(reviewsCount)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    isFree: ").append(toIndentedString(isFree)).append("\n");
    sb.append("    mainCategory: ").append(toIndentedString(mainCategory)).append("\n");
    sb.append("    installs: ").append(toIndentedString(installs)).append("\n");
    sb.append("    installsCount: ").append(toIndentedString(installsCount)).append("\n");
    sb.append("    developer: ").append(toIndentedString(developer)).append("\n");
    sb.append("    developerId: ").append(toIndentedString(developerId)).append("\n");
    sb.append("    developerUrl: ").append(toIndentedString(developerUrl)).append("\n");
    sb.append("    developerEmail: ").append(toIndentedString(developerEmail)).append("\n");
    sb.append("    developerAddress: ").append(toIndentedString(developerAddress)).append("\n");
    sb.append("    developerWebsite: ").append(toIndentedString(developerWebsite)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    minimumOsVersion: ").append(toIndentedString(minimumOsVersion)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    releasedDate: ").append(toIndentedString(releasedDate)).append("\n");
    sb.append("    lastUpdateDate: ").append(toIndentedString(lastUpdateDate)).append("\n");
    sb.append("    updateNotes: ").append(toIndentedString(updateNotes)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
    sb.append("    similarApps: ").append(toIndentedString(similarApps)).append("\n");
    sb.append("    moreAppsByDeveloper: ").append(toIndentedString(moreAppsByDeveloper)).append("\n");
    sb.append("    genres: ").append(toIndentedString(genres)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("position");
    openapiFields.add("app_id");
    openapiFields.add("title");
    openapiFields.add("url");
    openapiFields.add("icon");
    openapiFields.add("description");
    openapiFields.add("reviews_count");
    openapiFields.add("rating");
    openapiFields.add("price");
    openapiFields.add("is_free");
    openapiFields.add("main_category");
    openapiFields.add("installs");
    openapiFields.add("installs_count");
    openapiFields.add("developer");
    openapiFields.add("developer_id");
    openapiFields.add("developer_url");
    openapiFields.add("developer_email");
    openapiFields.add("developer_address");
    openapiFields.add("developer_website");
    openapiFields.add("version");
    openapiFields.add("minimum_os_version");
    openapiFields.add("size");
    openapiFields.add("released_date");
    openapiFields.add("last_update_date");
    openapiFields.add("update_notes");
    openapiFields.add("images");
    openapiFields.add("videos");
    openapiFields.add("similar_apps");
    openapiFields.add("more_apps_by_developer");
    openapiFields.add("genres");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AppDataGooglePlayInfoOrganicSerpElementItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppDataGooglePlayInfoOrganicSerpElementItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppDataGooglePlayInfoOrganicSerpElementItem is not found in the empty JSON string", AppDataGooglePlayInfoOrganicSerpElementItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AppDataGooglePlayInfoOrganicSerpElementItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppDataGooglePlayInfoOrganicSerpElementItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppDataGooglePlayInfoOrganicSerpElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppDataGooglePlayInfoOrganicSerpElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppDataGooglePlayInfoOrganicSerpElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppDataGooglePlayInfoOrganicSerpElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<AppDataGooglePlayInfoOrganicSerpElementItem>() {
           @Override
           public void write(JsonWriter out, AppDataGooglePlayInfoOrganicSerpElementItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppDataGooglePlayInfoOrganicSerpElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppDataGooglePlayInfoOrganicSerpElementItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppDataGooglePlayInfoOrganicSerpElementItem
  * @throws IOException if the JSON string is invalid with respect to AppDataGooglePlayInfoOrganicSerpElementItem
  */
  public static AppDataGooglePlayInfoOrganicSerpElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppDataGooglePlayInfoOrganicSerpElementItem.class);
  }

 /**
  * Convert an instance of AppDataGooglePlayInfoOrganicSerpElementItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

