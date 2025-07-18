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



public class PageMetaInfo  {


  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public PageMetaInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * page title
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public static final String SERIALIZED_NAME_CHARSET = "charset";
  @SerializedName(SERIALIZED_NAME_CHARSET)
  private Integer charset;

  public PageMetaInfo charset(Integer charset) {
    this.charset = charset;
    return this;
  }

  /**
   * code page
* example: 65001
   * @return charset
   */
  @javax.annotation.Nullable
  public Integer getCharset() {
    return charset;
  }

  public void setCharset(Integer charset) {
    this.charset = charset;
  }


  public static final String SERIALIZED_NAME_FOLLOW = "follow";
  @SerializedName(SERIALIZED_NAME_FOLLOW)
  private Boolean follow;

  public PageMetaInfo follow(Boolean follow) {
    this.follow = follow;
    return this;
  }

  /**
   * indicates whether a page’s ‘meta robots’ allows crawlers to follow the links on the page
* if false, the page’s ‘meta robots’ tag contains “nofollow” parameter instructing crawlers not to follow the links on the page
   * @return follow
   */
  @javax.annotation.Nullable
  public Boolean getFollow() {
    return follow;
  }

  public void setFollow(Boolean follow) {
    this.follow = follow;
  }


  public static final String SERIALIZED_NAME_GENERATOR = "generator";
  @SerializedName(SERIALIZED_NAME_GENERATOR)
  private String generator;

  public PageMetaInfo generator(String generator) {
    this.generator = generator;
    return this;
  }

  /**
   * meta tag generator
   * @return generator
   */
  @javax.annotation.Nullable
  public String getGenerator() {
    return generator;
  }

  public void setGenerator(String generator) {
    this.generator = generator;
  }


  public static final String SERIALIZED_NAME_HTAGS = "htags";
  @SerializedName(SERIALIZED_NAME_HTAGS)
  private Map<String, List<String>> htags;

  public PageMetaInfo htags(Map<String, List<String>> htags) {
    this.htags = htags;
    return this;
  }

  /**
   * HTML header tags
   * @return htags
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getHtags() {
    return htags;
  }

  public void setHtags(Map<String, List<String>> htags) {
    this.htags = htags;
  }


  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public PageMetaInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * content of the meta description tag
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public static final String SERIALIZED_NAME_FAVICON = "favicon";
  @SerializedName(SERIALIZED_NAME_FAVICON)
  private String favicon;

  public PageMetaInfo favicon(String favicon) {
    this.favicon = favicon;
    return this;
  }

  /**
   * favicon of the page
   * @return favicon
   */
  @javax.annotation.Nullable
  public String getFavicon() {
    return favicon;
  }

  public void setFavicon(String favicon) {
    this.favicon = favicon;
  }


  public static final String SERIALIZED_NAME_META_KEYWORDS = "meta_keywords";
  @SerializedName(SERIALIZED_NAME_META_KEYWORDS)
  private String metaKeywords;

  public PageMetaInfo metaKeywords(String metaKeywords) {
    this.metaKeywords = metaKeywords;
    return this;
  }

  /**
   * content of the keywords meta tag
   * @return metaKeywords
   */
  @javax.annotation.Nullable
  public String getMetaKeywords() {
    return metaKeywords;
  }

  public void setMetaKeywords(String metaKeywords) {
    this.metaKeywords = metaKeywords;
  }


  public static final String SERIALIZED_NAME_CANONICAL = "canonical";
  @SerializedName(SERIALIZED_NAME_CANONICAL)
  private String canonical;

  public PageMetaInfo canonical(String canonical) {
    this.canonical = canonical;
    return this;
  }

  /**
   * canonical page
   * @return canonical
   */
  @javax.annotation.Nullable
  public String getCanonical() {
    return canonical;
  }

  public void setCanonical(String canonical) {
    this.canonical = canonical;
  }


  public static final String SERIALIZED_NAME_INTERNAL_LINKS_COUNT = "internal_links_count";
  @SerializedName(SERIALIZED_NAME_INTERNAL_LINKS_COUNT)
  private Long internalLinksCount;

  public PageMetaInfo internalLinksCount(Long internalLinksCount) {
    this.internalLinksCount = internalLinksCount;
    return this;
  }

  /**
   * number of internal links on the page
   * @return internalLinksCount
   */
  @javax.annotation.Nullable
  public Long getInternalLinksCount() {
    return internalLinksCount;
  }

  public void setInternalLinksCount(Long internalLinksCount) {
    this.internalLinksCount = internalLinksCount;
  }


  public static final String SERIALIZED_NAME_EXTERNAL_LINKS_COUNT = "external_links_count";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_LINKS_COUNT)
  private Long externalLinksCount;

  public PageMetaInfo externalLinksCount(Long externalLinksCount) {
    this.externalLinksCount = externalLinksCount;
    return this;
  }

  /**
   * number of external links on the page
   * @return externalLinksCount
   */
  @javax.annotation.Nullable
  public Long getExternalLinksCount() {
    return externalLinksCount;
  }

  public void setExternalLinksCount(Long externalLinksCount) {
    this.externalLinksCount = externalLinksCount;
  }


  public static final String SERIALIZED_NAME_INBOUND_LINKS_COUNT = "inbound_links_count";
  @SerializedName(SERIALIZED_NAME_INBOUND_LINKS_COUNT)
  private Long inboundLinksCount;

  public PageMetaInfo inboundLinksCount(Long inboundLinksCount) {
    this.inboundLinksCount = inboundLinksCount;
    return this;
  }

  /**
   * number of internal links pointing at the page
   * @return inboundLinksCount
   */
  @javax.annotation.Nullable
  public Long getInboundLinksCount() {
    return inboundLinksCount;
  }

  public void setInboundLinksCount(Long inboundLinksCount) {
    this.inboundLinksCount = inboundLinksCount;
  }


  public static final String SERIALIZED_NAME_IMAGES_COUNT = "images_count";
  @SerializedName(SERIALIZED_NAME_IMAGES_COUNT)
  private Long imagesCount;

  public PageMetaInfo imagesCount(Long imagesCount) {
    this.imagesCount = imagesCount;
    return this;
  }

  /**
   * number of images on the page
   * @return imagesCount
   */
  @javax.annotation.Nullable
  public Long getImagesCount() {
    return imagesCount;
  }

  public void setImagesCount(Long imagesCount) {
    this.imagesCount = imagesCount;
  }


  public static final String SERIALIZED_NAME_IMAGES_SIZE = "images_size";
  @SerializedName(SERIALIZED_NAME_IMAGES_SIZE)
  private Integer imagesSize;

  public PageMetaInfo imagesSize(Integer imagesSize) {
    this.imagesSize = imagesSize;
    return this;
  }

  /**
   * total size of images on the page measured in bytes
   * @return imagesSize
   */
  @javax.annotation.Nullable
  public Integer getImagesSize() {
    return imagesSize;
  }

  public void setImagesSize(Integer imagesSize) {
    this.imagesSize = imagesSize;
  }


  public static final String SERIALIZED_NAME_SCRIPTS_COUNT = "scripts_count";
  @SerializedName(SERIALIZED_NAME_SCRIPTS_COUNT)
  private Long scriptsCount;

  public PageMetaInfo scriptsCount(Long scriptsCount) {
    this.scriptsCount = scriptsCount;
    return this;
  }

  /**
   * number of scripts on the page
   * @return scriptsCount
   */
  @javax.annotation.Nullable
  public Long getScriptsCount() {
    return scriptsCount;
  }

  public void setScriptsCount(Long scriptsCount) {
    this.scriptsCount = scriptsCount;
  }


  public static final String SERIALIZED_NAME_SCRIPTS_SIZE = "scripts_size";
  @SerializedName(SERIALIZED_NAME_SCRIPTS_SIZE)
  private Integer scriptsSize;

  public PageMetaInfo scriptsSize(Integer scriptsSize) {
    this.scriptsSize = scriptsSize;
    return this;
  }

  /**
   * total size of scripts on the page measured in bytes
   * @return scriptsSize
   */
  @javax.annotation.Nullable
  public Integer getScriptsSize() {
    return scriptsSize;
  }

  public void setScriptsSize(Integer scriptsSize) {
    this.scriptsSize = scriptsSize;
  }


  public static final String SERIALIZED_NAME_STYLESHEETS_COUNT = "stylesheets_count";
  @SerializedName(SERIALIZED_NAME_STYLESHEETS_COUNT)
  private Long stylesheetsCount;

  public PageMetaInfo stylesheetsCount(Long stylesheetsCount) {
    this.stylesheetsCount = stylesheetsCount;
    return this;
  }

  /**
   * number of stylesheets on the page
   * @return stylesheetsCount
   */
  @javax.annotation.Nullable
  public Long getStylesheetsCount() {
    return stylesheetsCount;
  }

  public void setStylesheetsCount(Long stylesheetsCount) {
    this.stylesheetsCount = stylesheetsCount;
  }


  public static final String SERIALIZED_NAME_STYLESHEETS_SIZE = "stylesheets_size";
  @SerializedName(SERIALIZED_NAME_STYLESHEETS_SIZE)
  private Integer stylesheetsSize;

  public PageMetaInfo stylesheetsSize(Integer stylesheetsSize) {
    this.stylesheetsSize = stylesheetsSize;
    return this;
  }

  /**
   * total size of stylesheets on the page measured in bytes
   * @return stylesheetsSize
   */
  @javax.annotation.Nullable
  public Integer getStylesheetsSize() {
    return stylesheetsSize;
  }

  public void setStylesheetsSize(Integer stylesheetsSize) {
    this.stylesheetsSize = stylesheetsSize;
  }


  public static final String SERIALIZED_NAME_TITLE_LENGTH = "title_length";
  @SerializedName(SERIALIZED_NAME_TITLE_LENGTH)
  private Integer titleLength;

  public PageMetaInfo titleLength(Integer titleLength) {
    this.titleLength = titleLength;
    return this;
  }

  /**
   * length of the title tag in characters
   * @return titleLength
   */
  @javax.annotation.Nullable
  public Integer getTitleLength() {
    return titleLength;
  }

  public void setTitleLength(Integer titleLength) {
    this.titleLength = titleLength;
  }


  public static final String SERIALIZED_NAME_DESCRIPTION_LENGTH = "description_length";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_LENGTH)
  private Integer descriptionLength;

  public PageMetaInfo descriptionLength(Integer descriptionLength) {
    this.descriptionLength = descriptionLength;
    return this;
  }

  /**
   * length of the description tag in characters
   * @return descriptionLength
   */
  @javax.annotation.Nullable
  public Integer getDescriptionLength() {
    return descriptionLength;
  }

  public void setDescriptionLength(Integer descriptionLength) {
    this.descriptionLength = descriptionLength;
  }


  public static final String SERIALIZED_NAME_RENDER_BLOCKING_SCRIPTS_COUNT = "render_blocking_scripts_count";
  @SerializedName(SERIALIZED_NAME_RENDER_BLOCKING_SCRIPTS_COUNT)
  private Long renderBlockingScriptsCount;

  public PageMetaInfo renderBlockingScriptsCount(Long renderBlockingScriptsCount) {
    this.renderBlockingScriptsCount = renderBlockingScriptsCount;
    return this;
  }

  /**
   * number of scripts on the page that block page rendering
   * @return renderBlockingScriptsCount
   */
  @javax.annotation.Nullable
  public Long getRenderBlockingScriptsCount() {
    return renderBlockingScriptsCount;
  }

  public void setRenderBlockingScriptsCount(Long renderBlockingScriptsCount) {
    this.renderBlockingScriptsCount = renderBlockingScriptsCount;
  }


  public static final String SERIALIZED_NAME_RENDER_BLOCKING_STYLESHEETS_COUNT = "render_blocking_stylesheets_count";
  @SerializedName(SERIALIZED_NAME_RENDER_BLOCKING_STYLESHEETS_COUNT)
  private Long renderBlockingStylesheetsCount;

  public PageMetaInfo renderBlockingStylesheetsCount(Long renderBlockingStylesheetsCount) {
    this.renderBlockingStylesheetsCount = renderBlockingStylesheetsCount;
    return this;
  }

  /**
   * number of CSS styles on the page that block page rendering
   * @return renderBlockingStylesheetsCount
   */
  @javax.annotation.Nullable
  public Long getRenderBlockingStylesheetsCount() {
    return renderBlockingStylesheetsCount;
  }

  public void setRenderBlockingStylesheetsCount(Long renderBlockingStylesheetsCount) {
    this.renderBlockingStylesheetsCount = renderBlockingStylesheetsCount;
  }


  public static final String SERIALIZED_NAME_CUMULATIVE_LAYOUT_SHIFT = "cumulative_layout_shift";
  @SerializedName(SERIALIZED_NAME_CUMULATIVE_LAYOUT_SHIFT)
  private Double cumulativeLayoutShift;

  public PageMetaInfo cumulativeLayoutShift(Double cumulativeLayoutShift) {
    this.cumulativeLayoutShift = cumulativeLayoutShift;
    return this;
  }

  /**
   * Core Web Vitals metric measuring the layout stability of the page
* measures the sum total of all individual layout shift scores for every unexpected layout shift that occurs during the entire lifespan of the page. Learn more.
   * @return cumulativeLayoutShift
   */
  @javax.annotation.Nullable
  public Double getCumulativeLayoutShift() {
    return cumulativeLayoutShift;
  }

  public void setCumulativeLayoutShift(Double cumulativeLayoutShift) {
    this.cumulativeLayoutShift = cumulativeLayoutShift;
  }


  public static final String SERIALIZED_NAME_META_TITLE = "meta_title";
  @SerializedName(SERIALIZED_NAME_META_TITLE)
  private String metaTitle;

  public PageMetaInfo metaTitle(String metaTitle) {
    this.metaTitle = metaTitle;
    return this;
  }

  /**
   * meta title of the page
* meta tag in the head section of an HTML document that defines the title of a page
   * @return metaTitle
   */
  @javax.annotation.Nullable
  public String getMetaTitle() {
    return metaTitle;
  }

  public void setMetaTitle(String metaTitle) {
    this.metaTitle = metaTitle;
  }


  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private HtmlContentInfo content;

  public PageMetaInfo content(HtmlContentInfo content) {
    this.content = content;
    return this;
  }

  /**
   * overall information about content of the page
   * @return content
   */
  @javax.annotation.Nullable
  public HtmlContentInfo getContent() {
    return content;
  }

  public void setContent(HtmlContentInfo content) {
    this.content = content;
  }


  public static final String SERIALIZED_NAME_DEPRECATED_TAGS = "deprecated_tags";
  @SerializedName(SERIALIZED_NAME_DEPRECATED_TAGS)
  private List<String> deprecatedTags;

  public PageMetaInfo deprecatedTags(List<String> deprecatedTags) {
    this.deprecatedTags = deprecatedTags;
    return this;
  }

  /**
   * deprecated tags on the page
   * @return deprecatedTags
   */
  @javax.annotation.Nullable
  public List<String> getDeprecatedTags() {
    return deprecatedTags;
  }

  public void setDeprecatedTags(List<String> deprecatedTags) {
    this.deprecatedTags = deprecatedTags;
  }


  public static final String SERIALIZED_NAME_DUPLICATE_META_TAGS = "duplicate_meta_tags";
  @SerializedName(SERIALIZED_NAME_DUPLICATE_META_TAGS)
  private List<String> duplicateMetaTags;

  public PageMetaInfo duplicateMetaTags(List<String> duplicateMetaTags) {
    this.duplicateMetaTags = duplicateMetaTags;
    return this;
  }

  /**
   * duplicate meta tags on the page
   * @return duplicateMetaTags
   */
  @javax.annotation.Nullable
  public List<String> getDuplicateMetaTags() {
    return duplicateMetaTags;
  }

  public void setDuplicateMetaTags(List<String> duplicateMetaTags) {
    this.duplicateMetaTags = duplicateMetaTags;
  }


  public static final String SERIALIZED_NAME_SPELL = "spell";
  @SerializedName(SERIALIZED_NAME_SPELL)
  private HunspellInfo spell;

  public PageMetaInfo spell(HunspellInfo spell) {
    this.spell = spell;
    return this;
  }

  /**
   * spellcheck
* hunspell spellcheck errors
   * @return spell
   */
  @javax.annotation.Nullable
  public HunspellInfo getSpell() {
    return spell;
  }

  public void setSpell(HunspellInfo spell) {
    this.spell = spell;
  }


  public static final String SERIALIZED_NAME_SOCIAL_MEDIA_TAGS = "social_media_tags";
  @SerializedName(SERIALIZED_NAME_SOCIAL_MEDIA_TAGS)
  private Map<String, String> socialMediaTags;

  public PageMetaInfo socialMediaTags(Map<String, String> socialMediaTags) {
    this.socialMediaTags = socialMediaTags;
    return this;
  }

  /**
   * object of social media tags found on the page
* contains social media tags and their content
* supported tags include but are not limited to Open Graph and Twitter card
   * @return socialMediaTags
   */
  @javax.annotation.Nullable
  public Map<String, String> getSocialMediaTags() {
    return socialMediaTags;
  }

  public void setSocialMediaTags(Map<String, String> socialMediaTags) {
    this.socialMediaTags = socialMediaTags;
  }


  public static final String SERIALIZED_NAME_BROKEN_HTML = "broken_html";
  @SerializedName(SERIALIZED_NAME_BROKEN_HTML)
  private OnPageResourceIssueInfo brokenHtml;

  public PageMetaInfo brokenHtml(OnPageResourceIssueInfo brokenHtml) {
    this.brokenHtml = brokenHtml;
    return this;
  }

  /**
   * resource errors and warnings
   * @return brokenHtml
   */
  @javax.annotation.Nullable
  public OnPageResourceIssueInfo getBrokenHtml() {
    return brokenHtml;
  }

  public void setBrokenHtml(OnPageResourceIssueInfo brokenHtml) {
    this.brokenHtml = brokenHtml;
  }



  public PageMetaInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public PageMetaInfo putAdditionalProperty(String key, Object value) {
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


    
    PageMetaInfo pageMetaInfo = (PageMetaInfo) o;
    return

        Objects.equals(this.title, pageMetaInfo.title) &&
        Objects.equals(this.charset, pageMetaInfo.charset) &&
        Objects.equals(this.follow, pageMetaInfo.follow) &&
        Objects.equals(this.generator, pageMetaInfo.generator) &&
        Objects.equals(this.htags, pageMetaInfo.htags) &&
        Objects.equals(this.description, pageMetaInfo.description) &&
        Objects.equals(this.favicon, pageMetaInfo.favicon) &&
        Objects.equals(this.metaKeywords, pageMetaInfo.metaKeywords) &&
        Objects.equals(this.canonical, pageMetaInfo.canonical) &&
        Objects.equals(this.internalLinksCount, pageMetaInfo.internalLinksCount) &&
        Objects.equals(this.externalLinksCount, pageMetaInfo.externalLinksCount) &&
        Objects.equals(this.inboundLinksCount, pageMetaInfo.inboundLinksCount) &&
        Objects.equals(this.imagesCount, pageMetaInfo.imagesCount) &&
        Objects.equals(this.imagesSize, pageMetaInfo.imagesSize) &&
        Objects.equals(this.scriptsCount, pageMetaInfo.scriptsCount) &&
        Objects.equals(this.scriptsSize, pageMetaInfo.scriptsSize) &&
        Objects.equals(this.stylesheetsCount, pageMetaInfo.stylesheetsCount) &&
        Objects.equals(this.stylesheetsSize, pageMetaInfo.stylesheetsSize) &&
        Objects.equals(this.titleLength, pageMetaInfo.titleLength) &&
        Objects.equals(this.descriptionLength, pageMetaInfo.descriptionLength) &&
        Objects.equals(this.renderBlockingScriptsCount, pageMetaInfo.renderBlockingScriptsCount) &&
        Objects.equals(this.renderBlockingStylesheetsCount, pageMetaInfo.renderBlockingStylesheetsCount) &&
        Objects.equals(this.cumulativeLayoutShift, pageMetaInfo.cumulativeLayoutShift) &&
        Objects.equals(this.metaTitle, pageMetaInfo.metaTitle) &&
        Objects.equals(this.content, pageMetaInfo.content) &&
        Objects.equals(this.deprecatedTags, pageMetaInfo.deprecatedTags) &&
        Objects.equals(this.duplicateMetaTags, pageMetaInfo.duplicateMetaTags) &&
        Objects.equals(this.spell, pageMetaInfo.spell) &&
        Objects.equals(this.socialMediaTags, pageMetaInfo.socialMediaTags) &&
        Objects.equals(this.brokenHtml, pageMetaInfo.brokenHtml);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(title, charset, follow, generator, htags, description, favicon, metaKeywords, canonical, internalLinksCount, externalLinksCount, inboundLinksCount, imagesCount, imagesSize, scriptsCount, scriptsSize, stylesheetsCount, stylesheetsSize, titleLength, descriptionLength, renderBlockingScriptsCount, renderBlockingStylesheetsCount, cumulativeLayoutShift, metaTitle, content, deprecatedTags, duplicateMetaTags, spell, socialMediaTags, brokenHtml);
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
    sb.append("class PageMetaInfo {\n");

    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    charset: ").append(toIndentedString(charset)).append("\n");
    sb.append("    follow: ").append(toIndentedString(follow)).append("\n");
    sb.append("    generator: ").append(toIndentedString(generator)).append("\n");
    sb.append("    htags: ").append(toIndentedString(htags)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    favicon: ").append(toIndentedString(favicon)).append("\n");
    sb.append("    metaKeywords: ").append(toIndentedString(metaKeywords)).append("\n");
    sb.append("    canonical: ").append(toIndentedString(canonical)).append("\n");
    sb.append("    internalLinksCount: ").append(toIndentedString(internalLinksCount)).append("\n");
    sb.append("    externalLinksCount: ").append(toIndentedString(externalLinksCount)).append("\n");
    sb.append("    inboundLinksCount: ").append(toIndentedString(inboundLinksCount)).append("\n");
    sb.append("    imagesCount: ").append(toIndentedString(imagesCount)).append("\n");
    sb.append("    imagesSize: ").append(toIndentedString(imagesSize)).append("\n");
    sb.append("    scriptsCount: ").append(toIndentedString(scriptsCount)).append("\n");
    sb.append("    scriptsSize: ").append(toIndentedString(scriptsSize)).append("\n");
    sb.append("    stylesheetsCount: ").append(toIndentedString(stylesheetsCount)).append("\n");
    sb.append("    stylesheetsSize: ").append(toIndentedString(stylesheetsSize)).append("\n");
    sb.append("    titleLength: ").append(toIndentedString(titleLength)).append("\n");
    sb.append("    descriptionLength: ").append(toIndentedString(descriptionLength)).append("\n");
    sb.append("    renderBlockingScriptsCount: ").append(toIndentedString(renderBlockingScriptsCount)).append("\n");
    sb.append("    renderBlockingStylesheetsCount: ").append(toIndentedString(renderBlockingStylesheetsCount)).append("\n");
    sb.append("    cumulativeLayoutShift: ").append(toIndentedString(cumulativeLayoutShift)).append("\n");
    sb.append("    metaTitle: ").append(toIndentedString(metaTitle)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    deprecatedTags: ").append(toIndentedString(deprecatedTags)).append("\n");
    sb.append("    duplicateMetaTags: ").append(toIndentedString(duplicateMetaTags)).append("\n");
    sb.append("    spell: ").append(toIndentedString(spell)).append("\n");
    sb.append("    socialMediaTags: ").append(toIndentedString(socialMediaTags)).append("\n");
    sb.append("    brokenHtml: ").append(toIndentedString(brokenHtml)).append("\n");
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
    
    openapiFields.add("title");
    
    openapiFields.add("charset");
    
    openapiFields.add("follow");
    
    openapiFields.add("generator");
    
    openapiFields.add("htags");
    
    openapiFields.add("description");
    
    openapiFields.add("favicon");
    
    openapiFields.add("meta_keywords");
    
    openapiFields.add("canonical");
    
    openapiFields.add("internal_links_count");
    
    openapiFields.add("external_links_count");
    
    openapiFields.add("inbound_links_count");
    
    openapiFields.add("images_count");
    
    openapiFields.add("images_size");
    
    openapiFields.add("scripts_count");
    
    openapiFields.add("scripts_size");
    
    openapiFields.add("stylesheets_count");
    
    openapiFields.add("stylesheets_size");
    
    openapiFields.add("title_length");
    
    openapiFields.add("description_length");
    
    openapiFields.add("render_blocking_scripts_count");
    
    openapiFields.add("render_blocking_stylesheets_count");
    
    openapiFields.add("cumulative_layout_shift");
    
    openapiFields.add("meta_title");
    
    openapiFields.add("content");
    
    openapiFields.add("deprecated_tags");
    
    openapiFields.add("duplicate_meta_tags");
    
    openapiFields.add("spell");
    
    openapiFields.add("social_media_tags");
    
    openapiFields.add("broken_html");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PageMetaInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageMetaInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageMetaInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageMetaInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageMetaInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PageMetaInfo>() {
           @Override
           public void write(JsonWriter out, PageMetaInfo value) throws IOException {
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
           public PageMetaInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PageMetaInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static PageMetaInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageMetaInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}