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



public class SerpApiGoogleFinanceDetailsElementItem  extends BaseSerpApiGoogleFinanceElementItem  {


  public static final String SERIALIZED_NAME_RANK_GROUP = "rank_group";
  @SerializedName(SERIALIZED_NAME_RANK_GROUP)
  private Integer rankGroup;

  public SerpApiGoogleFinanceDetailsElementItem rankGroup(Integer rankGroup) {
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

  public SerpApiGoogleFinanceDetailsElementItem rankAbsolute(Integer rankAbsolute) {
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


  public static final String SERIALIZED_NAME_BADGES = "badges";
  @SerializedName(SERIALIZED_NAME_BADGES)
  private List<String> badges;

  public SerpApiGoogleFinanceDetailsElementItem badges(List<String> badges) {
    this.badges = badges;
    return this;
  }

  /**
   * google finance badges relevant to the element
* example: Futures Contract
   * @return badges
   */
  @javax.annotation.Nullable
  public List<String> getBadges() {
    return badges;
  }

  public void setBadges(List<String> badges) {
    this.badges = badges;
  }


  public static final String SERIALIZED_NAME_PREVIOUS_CLOSE = "previous_close";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_CLOSE)
  private Double previousClose;

  public SerpApiGoogleFinanceDetailsElementItem previousClose(Double previousClose) {
    this.previousClose = previousClose;
    return this;
  }

  /**
   * value of the previous close
   * @return previousClose
   */
  @javax.annotation.Nullable
  public Double getPreviousClose() {
    return previousClose;
  }

  public void setPreviousClose(Double previousClose) {
    this.previousClose = previousClose;
  }


  public static final String SERIALIZED_NAME_START_DAY_RANGE = "start_day_range";
  @SerializedName(SERIALIZED_NAME_START_DAY_RANGE)
  private Double startDayRange;

  public SerpApiGoogleFinanceDetailsElementItem startDayRange(Double startDayRange) {
    this.startDayRange = startDayRange;
    return this;
  }

  /**
   * value of the start day range
   * @return startDayRange
   */
  @javax.annotation.Nullable
  public Double getStartDayRange() {
    return startDayRange;
  }

  public void setStartDayRange(Double startDayRange) {
    this.startDayRange = startDayRange;
  }


  public static final String SERIALIZED_NAME_END_DAY_RANGE = "end_day_range";
  @SerializedName(SERIALIZED_NAME_END_DAY_RANGE)
  private Double endDayRange;

  public SerpApiGoogleFinanceDetailsElementItem endDayRange(Double endDayRange) {
    this.endDayRange = endDayRange;
    return this;
  }

  /**
   * value of the end day range
   * @return endDayRange
   */
  @javax.annotation.Nullable
  public Double getEndDayRange() {
    return endDayRange;
  }

  public void setEndDayRange(Double endDayRange) {
    this.endDayRange = endDayRange;
  }


  public static final String SERIALIZED_NAME_START_YEAR_RANGE = "start_year_range";
  @SerializedName(SERIALIZED_NAME_START_YEAR_RANGE)
  private Double startYearRange;

  public SerpApiGoogleFinanceDetailsElementItem startYearRange(Double startYearRange) {
    this.startYearRange = startYearRange;
    return this;
  }

  /**
   * value of the start year range
   * @return startYearRange
   */
  @javax.annotation.Nullable
  public Double getStartYearRange() {
    return startYearRange;
  }

  public void setStartYearRange(Double startYearRange) {
    this.startYearRange = startYearRange;
  }


  public static final String SERIALIZED_NAME_END_YEAR_RANGE = "end_year_range";
  @SerializedName(SERIALIZED_NAME_END_YEAR_RANGE)
  private Double endYearRange;

  public SerpApiGoogleFinanceDetailsElementItem endYearRange(Double endYearRange) {
    this.endYearRange = endYearRange;
    return this;
  }

  /**
   * value of the end year range
   * @return endYearRange
   */
  @javax.annotation.Nullable
  public Double getEndYearRange() {
    return endYearRange;
  }

  public void setEndYearRange(Double endYearRange) {
    this.endYearRange = endYearRange;
  }


  public static final String SERIALIZED_NAME_MARKET_CAP = "market_cap";
  @SerializedName(SERIALIZED_NAME_MARKET_CAP)
  private Double marketCap;

  public SerpApiGoogleFinanceDetailsElementItem marketCap(Double marketCap) {
    this.marketCap = marketCap;
    return this;
  }

  /**
   * market cap value
   * @return marketCap
   */
  @javax.annotation.Nullable
  public Double getMarketCap() {
    return marketCap;
  }

  public void setMarketCap(Double marketCap) {
    this.marketCap = marketCap;
  }


  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private Double volume;

  public SerpApiGoogleFinanceDetailsElementItem volume(Double volume) {
    this.volume = volume;
    return this;
  }

  /**
   * total volume value
   * @return volume
   */
  @javax.annotation.Nullable
  public Double getVolume() {
    return volume;
  }

  public void setVolume(Double volume) {
    this.volume = volume;
  }


  public static final String SERIALIZED_NAME_AVG_VOLUME = "avg_volume";
  @SerializedName(SERIALIZED_NAME_AVG_VOLUME)
  private Double avgVolume;

  public SerpApiGoogleFinanceDetailsElementItem avgVolume(Double avgVolume) {
    this.avgVolume = avgVolume;
    return this;
  }

  /**
   * average volume value
   * @return avgVolume
   */
  @javax.annotation.Nullable
  public Double getAvgVolume() {
    return avgVolume;
  }

  public void setAvgVolume(Double avgVolume) {
    this.avgVolume = avgVolume;
  }


  public static final String SERIALIZED_NAME_PE_RATIO = "pe_ratio";
  @SerializedName(SERIALIZED_NAME_PE_RATIO)
  private Double peRatio;

  public SerpApiGoogleFinanceDetailsElementItem peRatio(Double peRatio) {
    this.peRatio = peRatio;
    return this;
  }

  /**
   * price-earnings ratio
   * @return peRatio
   */
  @javax.annotation.Nullable
  public Double getPeRatio() {
    return peRatio;
  }

  public void setPeRatio(Double peRatio) {
    this.peRatio = peRatio;
  }


  public static final String SERIALIZED_NAME_DIVIDEND_YIELD = "dividend_yield";
  @SerializedName(SERIALIZED_NAME_DIVIDEND_YIELD)
  private Double dividendYield;

  public SerpApiGoogleFinanceDetailsElementItem dividendYield(Double dividendYield) {
    this.dividendYield = dividendYield;
    return this;
  }

  /**
   * dividend yield value
   * @return dividendYield
   */
  @javax.annotation.Nullable
  public Double getDividendYield() {
    return dividendYield;
  }

  public void setDividendYield(Double dividendYield) {
    this.dividendYield = dividendYield;
  }


  public static final String SERIALIZED_NAME_PRIMARY_EXCHANGE = "primary_exchange";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EXCHANGE)
  private String primaryExchange;

  public SerpApiGoogleFinanceDetailsElementItem primaryExchange(String primaryExchange) {
    this.primaryExchange = primaryExchange;
    return this;
  }

  /**
   * primary exchange value
   * @return primaryExchange
   */
  @javax.annotation.Nullable
  public String getPrimaryExchange() {
    return primaryExchange;
  }

  public void setPrimaryExchange(String primaryExchange) {
    this.primaryExchange = primaryExchange;
  }


  public static final String SERIALIZED_NAME_YTD_RETURN = "ytd_return";
  @SerializedName(SERIALIZED_NAME_YTD_RETURN)
  private Double ytdReturn;

  public SerpApiGoogleFinanceDetailsElementItem ytdReturn(Double ytdReturn) {
    this.ytdReturn = ytdReturn;
    return this;
  }

  /**
   * year-to-date return value
   * @return ytdReturn
   */
  @javax.annotation.Nullable
  public Double getYtdReturn() {
    return ytdReturn;
  }

  public void setYtdReturn(Double ytdReturn) {
    this.ytdReturn = ytdReturn;
  }


  public static final String SERIALIZED_NAME_EXPENSE_RATIO = "expense_ratio";
  @SerializedName(SERIALIZED_NAME_EXPENSE_RATIO)
  private Double expenseRatio;

  public SerpApiGoogleFinanceDetailsElementItem expenseRatio(Double expenseRatio) {
    this.expenseRatio = expenseRatio;
    return this;
  }

  /**
   * expense ratio value
   * @return expenseRatio
   */
  @javax.annotation.Nullable
  public Double getExpenseRatio() {
    return expenseRatio;
  }

  public void setExpenseRatio(Double expenseRatio) {
    this.expenseRatio = expenseRatio;
  }


  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public SerpApiGoogleFinanceDetailsElementItem category(String category) {
    this.category = category;
    return this;
  }

  /**
   * category name
   * @return category
   */
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  public static final String SERIALIZED_NAME_NET_ASSETS = "net_assets";
  @SerializedName(SERIALIZED_NAME_NET_ASSETS)
  private Double netAssets;

  public SerpApiGoogleFinanceDetailsElementItem netAssets(Double netAssets) {
    this.netAssets = netAssets;
    return this;
  }

  /**
   * 
   * @return netAssets
   */
  @javax.annotation.Nullable
  public Double getNetAssets() {
    return netAssets;
  }

  public void setNetAssets(Double netAssets) {
    this.netAssets = netAssets;
  }


  public static final String SERIALIZED_NAME_YIELD = "yield";
  @SerializedName(SERIALIZED_NAME_YIELD)
  private Double yield;

  public SerpApiGoogleFinanceDetailsElementItem yield(Double yield) {
    this.yield = yield;
    return this;
  }

  /**
   * yield value
   * @return yield
   */
  @javax.annotation.Nullable
  public Double getYield() {
    return yield;
  }

  public void setYield(Double yield) {
    this.yield = yield;
  }


  public static final String SERIALIZED_NAME_FRONT_LOAD = "front_load";
  @SerializedName(SERIALIZED_NAME_FRONT_LOAD)
  private Double frontLoad;

  public SerpApiGoogleFinanceDetailsElementItem frontLoad(Double frontLoad) {
    this.frontLoad = frontLoad;
    return this;
  }

  /**
   * front load value
   * @return frontLoad
   */
  @javax.annotation.Nullable
  public Double getFrontLoad() {
    return frontLoad;
  }

  public void setFrontLoad(Double frontLoad) {
    this.frontLoad = frontLoad;
  }


  public static final String SERIALIZED_NAME_MARKET_SEGMENT = "market_segment";
  @SerializedName(SERIALIZED_NAME_MARKET_SEGMENT)
  private String marketSegment;

  public SerpApiGoogleFinanceDetailsElementItem marketSegment(String marketSegment) {
    this.marketSegment = marketSegment;
    return this;
  }

  /**
   * name of the relevant market segment
   * @return marketSegment
   */
  @javax.annotation.Nullable
  public String getMarketSegment() {
    return marketSegment;
  }

  public void setMarketSegment(String marketSegment) {
    this.marketSegment = marketSegment;
  }


  public static final String SERIALIZED_NAME_OPEN_INTEREST = "open_interest";
  @SerializedName(SERIALIZED_NAME_OPEN_INTEREST)
  private Double openInterest;

  public SerpApiGoogleFinanceDetailsElementItem openInterest(Double openInterest) {
    this.openInterest = openInterest;
    return this;
  }

  /**
   * open interest value
   * @return openInterest
   */
  @javax.annotation.Nullable
  public Double getOpenInterest() {
    return openInterest;
  }

  public void setOpenInterest(Double openInterest) {
    this.openInterest = openInterest;
  }


  public static final String SERIALIZED_NAME_SETTLEMENT_PRICE = "settlement_price";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_PRICE)
  private Double settlementPrice;

  public SerpApiGoogleFinanceDetailsElementItem settlementPrice(Double settlementPrice) {
    this.settlementPrice = settlementPrice;
    return this;
  }

  /**
   * settlement price value
   * @return settlementPrice
   */
  @javax.annotation.Nullable
  public Double getSettlementPrice() {
    return settlementPrice;
  }

  public void setSettlementPrice(Double settlementPrice) {
    this.settlementPrice = settlementPrice;
  }


  public static final String SERIALIZED_NAME_CDP_CLIMATE_CHANGE_SCORE = "cdp_climate_change_score";
  @SerializedName(SERIALIZED_NAME_CDP_CLIMATE_CHANGE_SCORE)
  private String cdpClimateChangeScore;

  public SerpApiGoogleFinanceDetailsElementItem cdpClimateChangeScore(String cdpClimateChangeScore) {
    this.cdpClimateChangeScore = cdpClimateChangeScore;
    return this;
  }

  /**
   * climate change score by carbon disclosure project methodology
   * @return cdpClimateChangeScore
   */
  @javax.annotation.Nullable
  public String getCdpClimateChangeScore() {
    return cdpClimateChangeScore;
  }

  public void setCdpClimateChangeScore(String cdpClimateChangeScore) {
    this.cdpClimateChangeScore = cdpClimateChangeScore;
  }


  public static final String SERIALIZED_NAME_METRICS_CURRENCY = "metrics_currency";
  @SerializedName(SERIALIZED_NAME_METRICS_CURRENCY)
  private String metricsCurrency;

  public SerpApiGoogleFinanceDetailsElementItem metricsCurrency(String metricsCurrency) {
    this.metricsCurrency = metricsCurrency;
    return this;
  }

  /**
   * currency of the metrics
   * @return metricsCurrency
   */
  @javax.annotation.Nullable
  public String getMetricsCurrency() {
    return metricsCurrency;
  }

  public void setMetricsCurrency(String metricsCurrency) {
    this.metricsCurrency = metricsCurrency;
  }



  public SerpApiGoogleFinanceDetailsElementItem() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public SerpApiGoogleFinanceDetailsElementItem putAdditionalProperty(String key, Object value) {
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


    
    SerpApiGoogleFinanceDetailsElementItem serpApiGoogleFinanceDetailsElementItem = (SerpApiGoogleFinanceDetailsElementItem) o;
    return

        Objects.equals(this.rankGroup, serpApiGoogleFinanceDetailsElementItem.rankGroup) &&
        Objects.equals(this.rankAbsolute, serpApiGoogleFinanceDetailsElementItem.rankAbsolute) &&
        Objects.equals(this.badges, serpApiGoogleFinanceDetailsElementItem.badges) &&
        Objects.equals(this.previousClose, serpApiGoogleFinanceDetailsElementItem.previousClose) &&
        Objects.equals(this.startDayRange, serpApiGoogleFinanceDetailsElementItem.startDayRange) &&
        Objects.equals(this.endDayRange, serpApiGoogleFinanceDetailsElementItem.endDayRange) &&
        Objects.equals(this.startYearRange, serpApiGoogleFinanceDetailsElementItem.startYearRange) &&
        Objects.equals(this.endYearRange, serpApiGoogleFinanceDetailsElementItem.endYearRange) &&
        Objects.equals(this.marketCap, serpApiGoogleFinanceDetailsElementItem.marketCap) &&
        Objects.equals(this.volume, serpApiGoogleFinanceDetailsElementItem.volume) &&
        Objects.equals(this.avgVolume, serpApiGoogleFinanceDetailsElementItem.avgVolume) &&
        Objects.equals(this.peRatio, serpApiGoogleFinanceDetailsElementItem.peRatio) &&
        Objects.equals(this.dividendYield, serpApiGoogleFinanceDetailsElementItem.dividendYield) &&
        Objects.equals(this.primaryExchange, serpApiGoogleFinanceDetailsElementItem.primaryExchange) &&
        Objects.equals(this.ytdReturn, serpApiGoogleFinanceDetailsElementItem.ytdReturn) &&
        Objects.equals(this.expenseRatio, serpApiGoogleFinanceDetailsElementItem.expenseRatio) &&
        Objects.equals(this.category, serpApiGoogleFinanceDetailsElementItem.category) &&
        Objects.equals(this.netAssets, serpApiGoogleFinanceDetailsElementItem.netAssets) &&
        Objects.equals(this.yield, serpApiGoogleFinanceDetailsElementItem.yield) &&
        Objects.equals(this.frontLoad, serpApiGoogleFinanceDetailsElementItem.frontLoad) &&
        Objects.equals(this.marketSegment, serpApiGoogleFinanceDetailsElementItem.marketSegment) &&
        Objects.equals(this.openInterest, serpApiGoogleFinanceDetailsElementItem.openInterest) &&
        Objects.equals(this.settlementPrice, serpApiGoogleFinanceDetailsElementItem.settlementPrice) &&
        Objects.equals(this.cdpClimateChangeScore, serpApiGoogleFinanceDetailsElementItem.cdpClimateChangeScore) &&
        Objects.equals(this.metricsCurrency, serpApiGoogleFinanceDetailsElementItem.metricsCurrency) && 
        super.equals(o);
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(rankGroup, rankAbsolute, badges, previousClose, startDayRange, endDayRange, startYearRange, endYearRange, marketCap, volume, avgVolume, peRatio, dividendYield, primaryExchange, ytdReturn, expenseRatio, category, netAssets, yield, frontLoad, marketSegment, openInterest, settlementPrice, cdpClimateChangeScore, metricsCurrency);
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
    sb.append("class SerpApiGoogleFinanceDetailsElementItem {\n");

    sb.append("    rankGroup: ").append(toIndentedString(rankGroup)).append("\n");
    sb.append("    rankAbsolute: ").append(toIndentedString(rankAbsolute)).append("\n");
    sb.append("    badges: ").append(toIndentedString(badges)).append("\n");
    sb.append("    previousClose: ").append(toIndentedString(previousClose)).append("\n");
    sb.append("    startDayRange: ").append(toIndentedString(startDayRange)).append("\n");
    sb.append("    endDayRange: ").append(toIndentedString(endDayRange)).append("\n");
    sb.append("    startYearRange: ").append(toIndentedString(startYearRange)).append("\n");
    sb.append("    endYearRange: ").append(toIndentedString(endYearRange)).append("\n");
    sb.append("    marketCap: ").append(toIndentedString(marketCap)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    avgVolume: ").append(toIndentedString(avgVolume)).append("\n");
    sb.append("    peRatio: ").append(toIndentedString(peRatio)).append("\n");
    sb.append("    dividendYield: ").append(toIndentedString(dividendYield)).append("\n");
    sb.append("    primaryExchange: ").append(toIndentedString(primaryExchange)).append("\n");
    sb.append("    ytdReturn: ").append(toIndentedString(ytdReturn)).append("\n");
    sb.append("    expenseRatio: ").append(toIndentedString(expenseRatio)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    netAssets: ").append(toIndentedString(netAssets)).append("\n");
    sb.append("    yield: ").append(toIndentedString(yield)).append("\n");
    sb.append("    frontLoad: ").append(toIndentedString(frontLoad)).append("\n");
    sb.append("    marketSegment: ").append(toIndentedString(marketSegment)).append("\n");
    sb.append("    openInterest: ").append(toIndentedString(openInterest)).append("\n");
    sb.append("    settlementPrice: ").append(toIndentedString(settlementPrice)).append("\n");
    sb.append("    cdpClimateChangeScore: ").append(toIndentedString(cdpClimateChangeScore)).append("\n");
    sb.append("    metricsCurrency: ").append(toIndentedString(metricsCurrency)).append("\n");
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
    
    openapiFields.add("badges");
    
    openapiFields.add("previous_close");
    
    openapiFields.add("start_day_range");
    
    openapiFields.add("end_day_range");
    
    openapiFields.add("start_year_range");
    
    openapiFields.add("end_year_range");
    
    openapiFields.add("market_cap");
    
    openapiFields.add("volume");
    
    openapiFields.add("avg_volume");
    
    openapiFields.add("pe_ratio");
    
    openapiFields.add("dividend_yield");
    
    openapiFields.add("primary_exchange");
    
    openapiFields.add("ytd_return");
    
    openapiFields.add("expense_ratio");
    
    openapiFields.add("category");
    
    openapiFields.add("net_assets");
    
    openapiFields.add("yield");
    
    openapiFields.add("front_load");
    
    openapiFields.add("market_segment");
    
    openapiFields.add("open_interest");
    
    openapiFields.add("settlement_price");
    
    openapiFields.add("cdp_climate_change_score");
    
    openapiFields.add("metrics_currency");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SerpApiGoogleFinanceDetailsElementItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SerpApiGoogleFinanceDetailsElementItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SerpApiGoogleFinanceDetailsElementItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SerpApiGoogleFinanceDetailsElementItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SerpApiGoogleFinanceDetailsElementItem.class));

       return (TypeAdapter<T>) new TypeAdapter<SerpApiGoogleFinanceDetailsElementItem>() {
           @Override
           public void write(JsonWriter out, SerpApiGoogleFinanceDetailsElementItem value) throws IOException {
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
           public SerpApiGoogleFinanceDetailsElementItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SerpApiGoogleFinanceDetailsElementItem instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static SerpApiGoogleFinanceDetailsElementItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SerpApiGoogleFinanceDetailsElementItem.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}