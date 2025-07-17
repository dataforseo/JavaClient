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



public class BaseOnPageLinkItem  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public BaseOnPageLinkItem type(String type) {
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


  public static final String SERIALIZED_NAME_DOMAIN_FROM = "domain_from";
  @SerializedName(SERIALIZED_NAME_DOMAIN_FROM)
  private String domainFrom;

  public BaseOnPageLinkItem domainFrom(String domainFrom) {
    this.domainFrom = domainFrom;
    return this;
  }

  /**
   * referring domain
* the link was found on this domain
   * @return domainFrom
   */
  @javax.annotation.Nullable
  public String getDomainFrom() {
    return domainFrom;
  }

  public void setDomainFrom(String domainFrom) {
    this.domainFrom = domainFrom;
  }


  public static final String SERIALIZED_NAME_DOMAIN_TO = "domain_to";
  @SerializedName(SERIALIZED_NAME_DOMAIN_TO)
  private String domainTo;

  public BaseOnPageLinkItem domainTo(String domainTo) {
    this.domainTo = domainTo;
    return this;
  }

  /**
   * referenced domain
* the link is pointing to this domain
   * @return domainTo
   */
  @javax.annotation.Nullable
  public String getDomainTo() {
    return domainTo;
  }

  public void setDomainTo(String domainTo) {
    this.domainTo = domainTo;
  }


  public static final String SERIALIZED_NAME_PAGE_FROM = "page_from";
  @SerializedName(SERIALIZED_NAME_PAGE_FROM)
  private String pageFrom;

  public BaseOnPageLinkItem pageFrom(String pageFrom) {
    this.pageFrom = pageFrom;
    return this;
  }

  /**
   * referring page
* relative URL of the page on which the link was found
   * @return pageFrom
   */
  @javax.annotation.Nullable
  public String getPageFrom() {
    return pageFrom;
  }

  public void setPageFrom(String pageFrom) {
    this.pageFrom = pageFrom;
  }


  public static final String SERIALIZED_NAME_PAGE_TO = "page_to";
  @SerializedName(SERIALIZED_NAME_PAGE_TO)
  private String pageTo;

  public BaseOnPageLinkItem pageTo(String pageTo) {
    this.pageTo = pageTo;
    return this;
  }

  /**
   * referenced page
* relative URL of the page to which the link is pointing
   * @return pageTo
   */
  @javax.annotation.Nullable
  public String getPageTo() {
    return pageTo;
  }

  public void setPageTo(String pageTo) {
    this.pageTo = pageTo;
  }


  public static final String SERIALIZED_NAME_LINK_FROM = "link_from";
  @SerializedName(SERIALIZED_NAME_LINK_FROM)
  private String linkFrom;

  public BaseOnPageLinkItem linkFrom(String linkFrom) {
    this.linkFrom = linkFrom;
    return this;
  }

  /**
   * referring page
* absolute URL of the page on which the link was found
   * @return linkFrom
   */
  @javax.annotation.Nullable
  public String getLinkFrom() {
    return linkFrom;
  }

  public void setLinkFrom(String linkFrom) {
    this.linkFrom = linkFrom;
  }


  public static final String SERIALIZED_NAME_LINK_TO = "link_to";
  @SerializedName(SERIALIZED_NAME_LINK_TO)
  private String linkTo;

  public BaseOnPageLinkItem linkTo(String linkTo) {
    this.linkTo = linkTo;
    return this;
  }

  /**
   * referenced page
* absolute URL of the page to which the link is pointing
   * @return linkTo
   */
  @javax.annotation.Nullable
  public String getLinkTo() {
    return linkTo;
  }

  public void setLinkTo(String linkTo) {
    this.linkTo = linkTo;
  }


  public static final String SERIALIZED_NAME_DOFOLLOW = "dofollow";
  @SerializedName(SERIALIZED_NAME_DOFOLLOW)
  private Boolean dofollow;

  public BaseOnPageLinkItem dofollow(Boolean dofollow) {
    this.dofollow = dofollow;
    return this;
  }

  /**
   * indicates whether the link is dofollow
* if the value is true, the link doesn’t have a rel='nofollow' attribute
   * @return dofollow
   */
  @javax.annotation.Nullable
  public Boolean getDofollow() {
    return dofollow;
  }

  public void setDofollow(Boolean dofollow) {
    this.dofollow = dofollow;
  }


  public static final String SERIALIZED_NAME_PAGE_FROM_SCHEME = "page_from_scheme";
  @SerializedName(SERIALIZED_NAME_PAGE_FROM_SCHEME)
  private String pageFromScheme;

  public BaseOnPageLinkItem pageFromScheme(String pageFromScheme) {
    this.pageFromScheme = pageFromScheme;
    return this;
  }

  /**
   * url scheme of the referring page
   * @return pageFromScheme
   */
  @javax.annotation.Nullable
  public String getPageFromScheme() {
    return pageFromScheme;
  }

  public void setPageFromScheme(String pageFromScheme) {
    this.pageFromScheme = pageFromScheme;
  }


  public static final String SERIALIZED_NAME_PAGE_TO_SCHEME = "page_to_scheme";
  @SerializedName(SERIALIZED_NAME_PAGE_TO_SCHEME)
  private String pageToScheme;

  public BaseOnPageLinkItem pageToScheme(String pageToScheme) {
    this.pageToScheme = pageToScheme;
    return this;
  }

  /**
   * url scheme of the referenced page
   * @return pageToScheme
   */
  @javax.annotation.Nullable
  public String getPageToScheme() {
    return pageToScheme;
  }

  public void setPageToScheme(String pageToScheme) {
    this.pageToScheme = pageToScheme;
  }


  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private String direction;

  public BaseOnPageLinkItem direction(String direction) {
    this.direction = direction;
    return this;
  }

  /**
   * direction of the link
* possible values: internal, external
   * @return direction
   */
  @javax.annotation.Nullable
  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }


  public static final String SERIALIZED_NAME_IS_BROKEN = "is_broken";
  @SerializedName(SERIALIZED_NAME_IS_BROKEN)
  private Boolean isBroken;

  public BaseOnPageLinkItem isBroken(Boolean isBroken) {
    this.isBroken = isBroken;
    return this;
  }

  /**
   * link is broken
* indicates whether a link is directing to a broken page or resource
   * @return isBroken
   */
  @javax.annotation.Nullable
  public Boolean getIsBroken() {
    return isBroken;
  }

  public void setIsBroken(Boolean isBroken) {
    this.isBroken = isBroken;
  }


  public static final String SERIALIZED_NAME_IS_LINK_RELATION_CONFLICT = "is_link_relation_conflict";
  @SerializedName(SERIALIZED_NAME_IS_LINK_RELATION_CONFLICT)
  private Boolean isLinkRelationConflict;

  public BaseOnPageLinkItem isLinkRelationConflict(Boolean isLinkRelationConflict) {
    this.isLinkRelationConflict = isLinkRelationConflict;
    return this;
  }

  /**
   * indicates that the link may have a conflict with another link
* if true, at least one link pointing to link_to has a rel='nofollow' attribute and at least one is dofollow
   * @return isLinkRelationConflict
   */
  @javax.annotation.Nullable
  public Boolean getIsLinkRelationConflict() {
    return isLinkRelationConflict;
  }

  public void setIsLinkRelationConflict(Boolean isLinkRelationConflict) {
    this.isLinkRelationConflict = isLinkRelationConflict;
  }


  public static final String SERIALIZED_NAME_PAGE_TO_STATUS_CODE = "page_to_status_code";
  @SerializedName(SERIALIZED_NAME_PAGE_TO_STATUS_CODE)
  private Integer pageToStatusCode;

  public BaseOnPageLinkItem pageToStatusCode(Integer pageToStatusCode) {
    this.pageToStatusCode = pageToStatusCode;
    return this;
  }

  /**
   * status code of the referenced page
* status code of the page to which the link is pointing
   * @return pageToStatusCode
   */
  @javax.annotation.Nullable
  public Integer getPageToStatusCode() {
    return pageToStatusCode;
  }

  public void setPageToStatusCode(Integer pageToStatusCode) {
    this.pageToStatusCode = pageToStatusCode;
  }



  public BaseOnPageLinkItem() {
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }


    
    BaseOnPageLinkItem baseOnPageLinkItem = (BaseOnPageLinkItem) o;
    return

        Objects.equals(this.type, baseOnPageLinkItem.type) &&
        Objects.equals(this.domainFrom, baseOnPageLinkItem.domainFrom) &&
        Objects.equals(this.domainTo, baseOnPageLinkItem.domainTo) &&
        Objects.equals(this.pageFrom, baseOnPageLinkItem.pageFrom) &&
        Objects.equals(this.pageTo, baseOnPageLinkItem.pageTo) &&
        Objects.equals(this.linkFrom, baseOnPageLinkItem.linkFrom) &&
        Objects.equals(this.linkTo, baseOnPageLinkItem.linkTo) &&
        Objects.equals(this.dofollow, baseOnPageLinkItem.dofollow) &&
        Objects.equals(this.pageFromScheme, baseOnPageLinkItem.pageFromScheme) &&
        Objects.equals(this.pageToScheme, baseOnPageLinkItem.pageToScheme) &&
        Objects.equals(this.direction, baseOnPageLinkItem.direction) &&
        Objects.equals(this.isBroken, baseOnPageLinkItem.isBroken) &&
        Objects.equals(this.isLinkRelationConflict, baseOnPageLinkItem.isLinkRelationConflict) &&
        Objects.equals(this.pageToStatusCode, baseOnPageLinkItem.pageToStatusCode);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, domainFrom, domainTo, pageFrom, pageTo, linkFrom, linkTo, dofollow, pageFromScheme, pageToScheme, direction, isBroken, isLinkRelationConflict, pageToStatusCode);
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
    sb.append("class BaseOnPageLinkItem {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    domainFrom: ").append(toIndentedString(domainFrom)).append("\n");
    sb.append("    domainTo: ").append(toIndentedString(domainTo)).append("\n");
    sb.append("    pageFrom: ").append(toIndentedString(pageFrom)).append("\n");
    sb.append("    pageTo: ").append(toIndentedString(pageTo)).append("\n");
    sb.append("    linkFrom: ").append(toIndentedString(linkFrom)).append("\n");
    sb.append("    linkTo: ").append(toIndentedString(linkTo)).append("\n");
    sb.append("    dofollow: ").append(toIndentedString(dofollow)).append("\n");
    sb.append("    pageFromScheme: ").append(toIndentedString(pageFromScheme)).append("\n");
    sb.append("    pageToScheme: ").append(toIndentedString(pageToScheme)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    isBroken: ").append(toIndentedString(isBroken)).append("\n");
    sb.append("    isLinkRelationConflict: ").append(toIndentedString(isLinkRelationConflict)).append("\n");
    sb.append("    pageToStatusCode: ").append(toIndentedString(pageToStatusCode)).append("\n");
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
    
    openapiFields.add("domain_from");
    
    openapiFields.add("domain_to");
    
    openapiFields.add("page_from");
    
    openapiFields.add("page_to");
    
    openapiFields.add("link_from");
    
    openapiFields.add("link_to");
    
    openapiFields.add("dofollow");
    
    openapiFields.add("page_from_scheme");
    
    openapiFields.add("page_to_scheme");
    
    openapiFields.add("direction");
    
    openapiFields.add("is_broken");
    
    openapiFields.add("is_link_relation_conflict");
    
    openapiFields.add("page_to_status_code");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  
  public static BaseOnPageLinkItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BaseOnPageLinkItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}