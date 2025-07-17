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



public class GoogleFinanceMetricsBundleInfo  {


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public GoogleFinanceMetricsBundleInfo type(String type) {
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


  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public GoogleFinanceMetricsBundleInfo timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * date and time of the value readout
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2025-02-10 09:40:00 +00:00
   * @return timestamp
   */
  @javax.annotation.Nullable
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public static final String SERIALIZED_NAME_REVENUE = "revenue";
  @SerializedName(SERIALIZED_NAME_REVENUE)
  private Double revenue;

  public GoogleFinanceMetricsBundleInfo revenue(Double revenue) {
    this.revenue = revenue;
    return this;
  }

  /**
   * revenue value
   * @return revenue
   */
  @javax.annotation.Nullable
  public Double getRevenue() {
    return revenue;
  }

  public void setRevenue(Double revenue) {
    this.revenue = revenue;
  }


  public static final String SERIALIZED_NAME_REVENUE_DELTA = "revenue_delta";
  @SerializedName(SERIALIZED_NAME_REVENUE_DELTA)
  private Double revenueDelta;

  public GoogleFinanceMetricsBundleInfo revenueDelta(Double revenueDelta) {
    this.revenueDelta = revenueDelta;
    return this;
  }

  /**
   * change in revenue
   * @return revenueDelta
   */
  @javax.annotation.Nullable
  public Double getRevenueDelta() {
    return revenueDelta;
  }

  public void setRevenueDelta(Double revenueDelta) {
    this.revenueDelta = revenueDelta;
  }


  public static final String SERIALIZED_NAME_OPERATING_EXPENSE = "operating_expense";
  @SerializedName(SERIALIZED_NAME_OPERATING_EXPENSE)
  private Double operatingExpense;

  public GoogleFinanceMetricsBundleInfo operatingExpense(Double operatingExpense) {
    this.operatingExpense = operatingExpense;
    return this;
  }

  /**
   * operating expense value
   * @return operatingExpense
   */
  @javax.annotation.Nullable
  public Double getOperatingExpense() {
    return operatingExpense;
  }

  public void setOperatingExpense(Double operatingExpense) {
    this.operatingExpense = operatingExpense;
  }


  public static final String SERIALIZED_NAME_OPERATING_EXPENSE_DELTA = "operating_expense_delta";
  @SerializedName(SERIALIZED_NAME_OPERATING_EXPENSE_DELTA)
  private Double operatingExpenseDelta;

  public GoogleFinanceMetricsBundleInfo operatingExpenseDelta(Double operatingExpenseDelta) {
    this.operatingExpenseDelta = operatingExpenseDelta;
    return this;
  }

  /**
   * change in operating expense
   * @return operatingExpenseDelta
   */
  @javax.annotation.Nullable
  public Double getOperatingExpenseDelta() {
    return operatingExpenseDelta;
  }

  public void setOperatingExpenseDelta(Double operatingExpenseDelta) {
    this.operatingExpenseDelta = operatingExpenseDelta;
  }


  public static final String SERIALIZED_NAME_NET_INCOME = "net_income";
  @SerializedName(SERIALIZED_NAME_NET_INCOME)
  private Double netIncome;

  public GoogleFinanceMetricsBundleInfo netIncome(Double netIncome) {
    this.netIncome = netIncome;
    return this;
  }

  /**
   * net income value
   * @return netIncome
   */
  @javax.annotation.Nullable
  public Double getNetIncome() {
    return netIncome;
  }

  public void setNetIncome(Double netIncome) {
    this.netIncome = netIncome;
  }


  public static final String SERIALIZED_NAME_NET_INCOME_DELTA = "net_income_delta";
  @SerializedName(SERIALIZED_NAME_NET_INCOME_DELTA)
  private Double netIncomeDelta;

  public GoogleFinanceMetricsBundleInfo netIncomeDelta(Double netIncomeDelta) {
    this.netIncomeDelta = netIncomeDelta;
    return this;
  }

  /**
   * change in net income
   * @return netIncomeDelta
   */
  @javax.annotation.Nullable
  public Double getNetIncomeDelta() {
    return netIncomeDelta;
  }

  public void setNetIncomeDelta(Double netIncomeDelta) {
    this.netIncomeDelta = netIncomeDelta;
  }


  public static final String SERIALIZED_NAME_NET_PROFIT_MARGIN = "net_profit_margin";
  @SerializedName(SERIALIZED_NAME_NET_PROFIT_MARGIN)
  private Double netProfitMargin;

  public GoogleFinanceMetricsBundleInfo netProfitMargin(Double netProfitMargin) {
    this.netProfitMargin = netProfitMargin;
    return this;
  }

  /**
   * net profit margin value
   * @return netProfitMargin
   */
  @javax.annotation.Nullable
  public Double getNetProfitMargin() {
    return netProfitMargin;
  }

  public void setNetProfitMargin(Double netProfitMargin) {
    this.netProfitMargin = netProfitMargin;
  }


  public static final String SERIALIZED_NAME_NET_PROFIT_MARGIN_DELTA = "net_profit_margin_delta";
  @SerializedName(SERIALIZED_NAME_NET_PROFIT_MARGIN_DELTA)
  private Double netProfitMarginDelta;

  public GoogleFinanceMetricsBundleInfo netProfitMarginDelta(Double netProfitMarginDelta) {
    this.netProfitMarginDelta = netProfitMarginDelta;
    return this;
  }

  /**
   * change in net profit margin
   * @return netProfitMarginDelta
   */
  @javax.annotation.Nullable
  public Double getNetProfitMarginDelta() {
    return netProfitMarginDelta;
  }

  public void setNetProfitMarginDelta(Double netProfitMarginDelta) {
    this.netProfitMarginDelta = netProfitMarginDelta;
  }


  public static final String SERIALIZED_NAME_EARNINGS_PER_SHARE = "earnings_per_share";
  @SerializedName(SERIALIZED_NAME_EARNINGS_PER_SHARE)
  private Double earningsPerShare;

  public GoogleFinanceMetricsBundleInfo earningsPerShare(Double earningsPerShare) {
    this.earningsPerShare = earningsPerShare;
    return this;
  }

  /**
   * earnings per share value
   * @return earningsPerShare
   */
  @javax.annotation.Nullable
  public Double getEarningsPerShare() {
    return earningsPerShare;
  }

  public void setEarningsPerShare(Double earningsPerShare) {
    this.earningsPerShare = earningsPerShare;
  }


  public static final String SERIALIZED_NAME_EARNINGS_PER_SHARE_DELTA = "earnings_per_share_delta";
  @SerializedName(SERIALIZED_NAME_EARNINGS_PER_SHARE_DELTA)
  private Double earningsPerShareDelta;

  public GoogleFinanceMetricsBundleInfo earningsPerShareDelta(Double earningsPerShareDelta) {
    this.earningsPerShareDelta = earningsPerShareDelta;
    return this;
  }

  /**
   * change in earnings per share
   * @return earningsPerShareDelta
   */
  @javax.annotation.Nullable
  public Double getEarningsPerShareDelta() {
    return earningsPerShareDelta;
  }

  public void setEarningsPerShareDelta(Double earningsPerShareDelta) {
    this.earningsPerShareDelta = earningsPerShareDelta;
  }


  public static final String SERIALIZED_NAME_EBITDA = "ebitda";
  @SerializedName(SERIALIZED_NAME_EBITDA)
  private Double ebitda;

  public GoogleFinanceMetricsBundleInfo ebitda(Double ebitda) {
    this.ebitda = ebitda;
    return this;
  }

  /**
   * earnings before interest, taxes, deprecation, amortisation
   * @return ebitda
   */
  @javax.annotation.Nullable
  public Double getEbitda() {
    return ebitda;
  }

  public void setEbitda(Double ebitda) {
    this.ebitda = ebitda;
  }


  public static final String SERIALIZED_NAME_EBITDA_DELTA = "ebitda_delta";
  @SerializedName(SERIALIZED_NAME_EBITDA_DELTA)
  private Double ebitdaDelta;

  public GoogleFinanceMetricsBundleInfo ebitdaDelta(Double ebitdaDelta) {
    this.ebitdaDelta = ebitdaDelta;
    return this;
  }

  /**
   * change in ebitda
   * @return ebitdaDelta
   */
  @javax.annotation.Nullable
  public Double getEbitdaDelta() {
    return ebitdaDelta;
  }

  public void setEbitdaDelta(Double ebitdaDelta) {
    this.ebitdaDelta = ebitdaDelta;
  }


  public static final String SERIALIZED_NAME_EFFECTIVE_TAX_RATE = "effective_tax_rate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_TAX_RATE)
  private Double effectiveTaxRate;

  public GoogleFinanceMetricsBundleInfo effectiveTaxRate(Double effectiveTaxRate) {
    this.effectiveTaxRate = effectiveTaxRate;
    return this;
  }

  /**
   * effective tax rate value
   * @return effectiveTaxRate
   */
  @javax.annotation.Nullable
  public Double getEffectiveTaxRate() {
    return effectiveTaxRate;
  }

  public void setEffectiveTaxRate(Double effectiveTaxRate) {
    this.effectiveTaxRate = effectiveTaxRate;
  }


  public static final String SERIALIZED_NAME_CASH_AND_SHORT_TERM_INVESTMENTS = "cash_and_short_term_investments";
  @SerializedName(SERIALIZED_NAME_CASH_AND_SHORT_TERM_INVESTMENTS)
  private Double cashAndShortTermInvestments;

  public GoogleFinanceMetricsBundleInfo cashAndShortTermInvestments(Double cashAndShortTermInvestments) {
    this.cashAndShortTermInvestments = cashAndShortTermInvestments;
    return this;
  }

  /**
   * cash and short-term investments value
   * @return cashAndShortTermInvestments
   */
  @javax.annotation.Nullable
  public Double getCashAndShortTermInvestments() {
    return cashAndShortTermInvestments;
  }

  public void setCashAndShortTermInvestments(Double cashAndShortTermInvestments) {
    this.cashAndShortTermInvestments = cashAndShortTermInvestments;
  }


  public static final String SERIALIZED_NAME_CASH_AND_SHORT_TERM_INVESTMENTS_DELTA = "cash_and_short_term_investments_delta";
  @SerializedName(SERIALIZED_NAME_CASH_AND_SHORT_TERM_INVESTMENTS_DELTA)
  private Double cashAndShortTermInvestmentsDelta;

  public GoogleFinanceMetricsBundleInfo cashAndShortTermInvestmentsDelta(Double cashAndShortTermInvestmentsDelta) {
    this.cashAndShortTermInvestmentsDelta = cashAndShortTermInvestmentsDelta;
    return this;
  }

  /**
   * change in cash and short-term investments
   * @return cashAndShortTermInvestmentsDelta
   */
  @javax.annotation.Nullable
  public Double getCashAndShortTermInvestmentsDelta() {
    return cashAndShortTermInvestmentsDelta;
  }

  public void setCashAndShortTermInvestmentsDelta(Double cashAndShortTermInvestmentsDelta) {
    this.cashAndShortTermInvestmentsDelta = cashAndShortTermInvestmentsDelta;
  }


  public static final String SERIALIZED_NAME_TOTAL_ASSETS = "total_assets";
  @SerializedName(SERIALIZED_NAME_TOTAL_ASSETS)
  private Double totalAssets;

  public GoogleFinanceMetricsBundleInfo totalAssets(Double totalAssets) {
    this.totalAssets = totalAssets;
    return this;
  }

  /**
   * total assets value
   * @return totalAssets
   */
  @javax.annotation.Nullable
  public Double getTotalAssets() {
    return totalAssets;
  }

  public void setTotalAssets(Double totalAssets) {
    this.totalAssets = totalAssets;
  }


  public static final String SERIALIZED_NAME_TOTAL_ASSETS_DELTA = "total_assets_delta";
  @SerializedName(SERIALIZED_NAME_TOTAL_ASSETS_DELTA)
  private Double totalAssetsDelta;

  public GoogleFinanceMetricsBundleInfo totalAssetsDelta(Double totalAssetsDelta) {
    this.totalAssetsDelta = totalAssetsDelta;
    return this;
  }

  /**
   * change in total assets
   * @return totalAssetsDelta
   */
  @javax.annotation.Nullable
  public Double getTotalAssetsDelta() {
    return totalAssetsDelta;
  }

  public void setTotalAssetsDelta(Double totalAssetsDelta) {
    this.totalAssetsDelta = totalAssetsDelta;
  }


  public static final String SERIALIZED_NAME_TOTAL_LIABILITIES = "total_liabilities";
  @SerializedName(SERIALIZED_NAME_TOTAL_LIABILITIES)
  private Double totalLiabilities;

  public GoogleFinanceMetricsBundleInfo totalLiabilities(Double totalLiabilities) {
    this.totalLiabilities = totalLiabilities;
    return this;
  }

  /**
   * total liabilities value
   * @return totalLiabilities
   */
  @javax.annotation.Nullable
  public Double getTotalLiabilities() {
    return totalLiabilities;
  }

  public void setTotalLiabilities(Double totalLiabilities) {
    this.totalLiabilities = totalLiabilities;
  }


  public static final String SERIALIZED_NAME_TOTAL_LIABILITIES_DELTA = "total_liabilities_delta";
  @SerializedName(SERIALIZED_NAME_TOTAL_LIABILITIES_DELTA)
  private Double totalLiabilitiesDelta;

  public GoogleFinanceMetricsBundleInfo totalLiabilitiesDelta(Double totalLiabilitiesDelta) {
    this.totalLiabilitiesDelta = totalLiabilitiesDelta;
    return this;
  }

  /**
   * change in total liabilities
   * @return totalLiabilitiesDelta
   */
  @javax.annotation.Nullable
  public Double getTotalLiabilitiesDelta() {
    return totalLiabilitiesDelta;
  }

  public void setTotalLiabilitiesDelta(Double totalLiabilitiesDelta) {
    this.totalLiabilitiesDelta = totalLiabilitiesDelta;
  }


  public static final String SERIALIZED_NAME_TOTAL_EQUITY = "total_equity";
  @SerializedName(SERIALIZED_NAME_TOTAL_EQUITY)
  private Double totalEquity;

  public GoogleFinanceMetricsBundleInfo totalEquity(Double totalEquity) {
    this.totalEquity = totalEquity;
    return this;
  }

  /**
   * total equity value
   * @return totalEquity
   */
  @javax.annotation.Nullable
  public Double getTotalEquity() {
    return totalEquity;
  }

  public void setTotalEquity(Double totalEquity) {
    this.totalEquity = totalEquity;
  }


  public static final String SERIALIZED_NAME_SHARES_OUTSTANDING = "shares_outstanding";
  @SerializedName(SERIALIZED_NAME_SHARES_OUTSTANDING)
  private Double sharesOutstanding;

  public GoogleFinanceMetricsBundleInfo sharesOutstanding(Double sharesOutstanding) {
    this.sharesOutstanding = sharesOutstanding;
    return this;
  }

  /**
   * outstanding shares value
   * @return sharesOutstanding
   */
  @javax.annotation.Nullable
  public Double getSharesOutstanding() {
    return sharesOutstanding;
  }

  public void setSharesOutstanding(Double sharesOutstanding) {
    this.sharesOutstanding = sharesOutstanding;
  }


  public static final String SERIALIZED_NAME_PRICE_TO_BOOK = "price_to_book";
  @SerializedName(SERIALIZED_NAME_PRICE_TO_BOOK)
  private Double priceToBook;

  public GoogleFinanceMetricsBundleInfo priceToBook(Double priceToBook) {
    this.priceToBook = priceToBook;
    return this;
  }

  /**
   * price to book
   * @return priceToBook
   */
  @javax.annotation.Nullable
  public Double getPriceToBook() {
    return priceToBook;
  }

  public void setPriceToBook(Double priceToBook) {
    this.priceToBook = priceToBook;
  }


  public static final String SERIALIZED_NAME_RETURN_ON_ASSETS = "return_on_assets";
  @SerializedName(SERIALIZED_NAME_RETURN_ON_ASSETS)
  private Double returnOnAssets;

  public GoogleFinanceMetricsBundleInfo returnOnAssets(Double returnOnAssets) {
    this.returnOnAssets = returnOnAssets;
    return this;
  }

  /**
   * return on assets
   * @return returnOnAssets
   */
  @javax.annotation.Nullable
  public Double getReturnOnAssets() {
    return returnOnAssets;
  }

  public void setReturnOnAssets(Double returnOnAssets) {
    this.returnOnAssets = returnOnAssets;
  }


  public static final String SERIALIZED_NAME_RETURN_ON_CAPITAL = "return_on_capital";
  @SerializedName(SERIALIZED_NAME_RETURN_ON_CAPITAL)
  private Double returnOnCapital;

  public GoogleFinanceMetricsBundleInfo returnOnCapital(Double returnOnCapital) {
    this.returnOnCapital = returnOnCapital;
    return this;
  }

  /**
   * return on capital
   * @return returnOnCapital
   */
  @javax.annotation.Nullable
  public Double getReturnOnCapital() {
    return returnOnCapital;
  }

  public void setReturnOnCapital(Double returnOnCapital) {
    this.returnOnCapital = returnOnCapital;
  }


  public static final String SERIALIZED_NAME_CASH_FROM_OPERATIONS = "cash_from_operations";
  @SerializedName(SERIALIZED_NAME_CASH_FROM_OPERATIONS)
  private Double cashFromOperations;

  public GoogleFinanceMetricsBundleInfo cashFromOperations(Double cashFromOperations) {
    this.cashFromOperations = cashFromOperations;
    return this;
  }

  /**
   * cash from operations
   * @return cashFromOperations
   */
  @javax.annotation.Nullable
  public Double getCashFromOperations() {
    return cashFromOperations;
  }

  public void setCashFromOperations(Double cashFromOperations) {
    this.cashFromOperations = cashFromOperations;
  }


  public static final String SERIALIZED_NAME_CASH_FROM_OPERATIONS_DELTA = "cash_from_operations_delta";
  @SerializedName(SERIALIZED_NAME_CASH_FROM_OPERATIONS_DELTA)
  private Double cashFromOperationsDelta;

  public GoogleFinanceMetricsBundleInfo cashFromOperationsDelta(Double cashFromOperationsDelta) {
    this.cashFromOperationsDelta = cashFromOperationsDelta;
    return this;
  }

  /**
   * change in cash from operations
   * @return cashFromOperationsDelta
   */
  @javax.annotation.Nullable
  public Double getCashFromOperationsDelta() {
    return cashFromOperationsDelta;
  }

  public void setCashFromOperationsDelta(Double cashFromOperationsDelta) {
    this.cashFromOperationsDelta = cashFromOperationsDelta;
  }


  public static final String SERIALIZED_NAME_CASH_FROM_INVESTING = "cash_from_investing";
  @SerializedName(SERIALIZED_NAME_CASH_FROM_INVESTING)
  private Double cashFromInvesting;

  public GoogleFinanceMetricsBundleInfo cashFromInvesting(Double cashFromInvesting) {
    this.cashFromInvesting = cashFromInvesting;
    return this;
  }

  /**
   * cash from investing
   * @return cashFromInvesting
   */
  @javax.annotation.Nullable
  public Double getCashFromInvesting() {
    return cashFromInvesting;
  }

  public void setCashFromInvesting(Double cashFromInvesting) {
    this.cashFromInvesting = cashFromInvesting;
  }


  public static final String SERIALIZED_NAME_CASH_FROM_INVESTING_DELTA = "cash_from_investing_delta";
  @SerializedName(SERIALIZED_NAME_CASH_FROM_INVESTING_DELTA)
  private Double cashFromInvestingDelta;

  public GoogleFinanceMetricsBundleInfo cashFromInvestingDelta(Double cashFromInvestingDelta) {
    this.cashFromInvestingDelta = cashFromInvestingDelta;
    return this;
  }

  /**
   * change in cash from investing
   * @return cashFromInvestingDelta
   */
  @javax.annotation.Nullable
  public Double getCashFromInvestingDelta() {
    return cashFromInvestingDelta;
  }

  public void setCashFromInvestingDelta(Double cashFromInvestingDelta) {
    this.cashFromInvestingDelta = cashFromInvestingDelta;
  }


  public static final String SERIALIZED_NAME_CASH_FROM_FINANCING = "cash_from_financing";
  @SerializedName(SERIALIZED_NAME_CASH_FROM_FINANCING)
  private Double cashFromFinancing;

  public GoogleFinanceMetricsBundleInfo cashFromFinancing(Double cashFromFinancing) {
    this.cashFromFinancing = cashFromFinancing;
    return this;
  }

  /**
   * cash from financing/em>
   * @return cashFromFinancing
   */
  @javax.annotation.Nullable
  public Double getCashFromFinancing() {
    return cashFromFinancing;
  }

  public void setCashFromFinancing(Double cashFromFinancing) {
    this.cashFromFinancing = cashFromFinancing;
  }


  public static final String SERIALIZED_NAME_CASH_FROM_FINANCING_DELTA = "cash_from_financing_delta";
  @SerializedName(SERIALIZED_NAME_CASH_FROM_FINANCING_DELTA)
  private Double cashFromFinancingDelta;

  public GoogleFinanceMetricsBundleInfo cashFromFinancingDelta(Double cashFromFinancingDelta) {
    this.cashFromFinancingDelta = cashFromFinancingDelta;
    return this;
  }

  /**
   * change in cash from financing
   * @return cashFromFinancingDelta
   */
  @javax.annotation.Nullable
  public Double getCashFromFinancingDelta() {
    return cashFromFinancingDelta;
  }

  public void setCashFromFinancingDelta(Double cashFromFinancingDelta) {
    this.cashFromFinancingDelta = cashFromFinancingDelta;
  }


  public static final String SERIALIZED_NAME_NET_CHANGE_IN_CASH = "net_change_in_cash";
  @SerializedName(SERIALIZED_NAME_NET_CHANGE_IN_CASH)
  private Double netChangeInCash;

  public GoogleFinanceMetricsBundleInfo netChangeInCash(Double netChangeInCash) {
    this.netChangeInCash = netChangeInCash;
    return this;
  }

  /**
   * net change in cash
   * @return netChangeInCash
   */
  @javax.annotation.Nullable
  public Double getNetChangeInCash() {
    return netChangeInCash;
  }

  public void setNetChangeInCash(Double netChangeInCash) {
    this.netChangeInCash = netChangeInCash;
  }


  public static final String SERIALIZED_NAME_NET_CHANGE_IN_CASH_DELTA = "net_change_in_cash_delta";
  @SerializedName(SERIALIZED_NAME_NET_CHANGE_IN_CASH_DELTA)
  private Double netChangeInCashDelta;

  public GoogleFinanceMetricsBundleInfo netChangeInCashDelta(Double netChangeInCashDelta) {
    this.netChangeInCashDelta = netChangeInCashDelta;
    return this;
  }

  /**
   * change in net change in cash
   * @return netChangeInCashDelta
   */
  @javax.annotation.Nullable
  public Double getNetChangeInCashDelta() {
    return netChangeInCashDelta;
  }

  public void setNetChangeInCashDelta(Double netChangeInCashDelta) {
    this.netChangeInCashDelta = netChangeInCashDelta;
  }


  public static final String SERIALIZED_NAME_FREE_CASH_FLOW = "free_cash_flow";
  @SerializedName(SERIALIZED_NAME_FREE_CASH_FLOW)
  private Double freeCashFlow;

  public GoogleFinanceMetricsBundleInfo freeCashFlow(Double freeCashFlow) {
    this.freeCashFlow = freeCashFlow;
    return this;
  }

  /**
   * free cash flow value
   * @return freeCashFlow
   */
  @javax.annotation.Nullable
  public Double getFreeCashFlow() {
    return freeCashFlow;
  }

  public void setFreeCashFlow(Double freeCashFlow) {
    this.freeCashFlow = freeCashFlow;
  }


  public static final String SERIALIZED_NAME_FREE_CASH_FLOW_DELTA = "free_cash_flow_delta";
  @SerializedName(SERIALIZED_NAME_FREE_CASH_FLOW_DELTA)
  private Double freeCashFlowDelta;

  public GoogleFinanceMetricsBundleInfo freeCashFlowDelta(Double freeCashFlowDelta) {
    this.freeCashFlowDelta = freeCashFlowDelta;
    return this;
  }

  /**
   * change in free cash flow
   * @return freeCashFlowDelta
   */
  @javax.annotation.Nullable
  public Double getFreeCashFlowDelta() {
    return freeCashFlowDelta;
  }

  public void setFreeCashFlowDelta(Double freeCashFlowDelta) {
    this.freeCashFlowDelta = freeCashFlowDelta;
  }



  public GoogleFinanceMetricsBundleInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public GoogleFinanceMetricsBundleInfo putAdditionalProperty(String key, Object value) {
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


    
    GoogleFinanceMetricsBundleInfo googleFinanceMetricsBundleInfo = (GoogleFinanceMetricsBundleInfo) o;
    return

        Objects.equals(this.type, googleFinanceMetricsBundleInfo.type) &&
        Objects.equals(this.timestamp, googleFinanceMetricsBundleInfo.timestamp) &&
        Objects.equals(this.revenue, googleFinanceMetricsBundleInfo.revenue) &&
        Objects.equals(this.revenueDelta, googleFinanceMetricsBundleInfo.revenueDelta) &&
        Objects.equals(this.operatingExpense, googleFinanceMetricsBundleInfo.operatingExpense) &&
        Objects.equals(this.operatingExpenseDelta, googleFinanceMetricsBundleInfo.operatingExpenseDelta) &&
        Objects.equals(this.netIncome, googleFinanceMetricsBundleInfo.netIncome) &&
        Objects.equals(this.netIncomeDelta, googleFinanceMetricsBundleInfo.netIncomeDelta) &&
        Objects.equals(this.netProfitMargin, googleFinanceMetricsBundleInfo.netProfitMargin) &&
        Objects.equals(this.netProfitMarginDelta, googleFinanceMetricsBundleInfo.netProfitMarginDelta) &&
        Objects.equals(this.earningsPerShare, googleFinanceMetricsBundleInfo.earningsPerShare) &&
        Objects.equals(this.earningsPerShareDelta, googleFinanceMetricsBundleInfo.earningsPerShareDelta) &&
        Objects.equals(this.ebitda, googleFinanceMetricsBundleInfo.ebitda) &&
        Objects.equals(this.ebitdaDelta, googleFinanceMetricsBundleInfo.ebitdaDelta) &&
        Objects.equals(this.effectiveTaxRate, googleFinanceMetricsBundleInfo.effectiveTaxRate) &&
        Objects.equals(this.cashAndShortTermInvestments, googleFinanceMetricsBundleInfo.cashAndShortTermInvestments) &&
        Objects.equals(this.cashAndShortTermInvestmentsDelta, googleFinanceMetricsBundleInfo.cashAndShortTermInvestmentsDelta) &&
        Objects.equals(this.totalAssets, googleFinanceMetricsBundleInfo.totalAssets) &&
        Objects.equals(this.totalAssetsDelta, googleFinanceMetricsBundleInfo.totalAssetsDelta) &&
        Objects.equals(this.totalLiabilities, googleFinanceMetricsBundleInfo.totalLiabilities) &&
        Objects.equals(this.totalLiabilitiesDelta, googleFinanceMetricsBundleInfo.totalLiabilitiesDelta) &&
        Objects.equals(this.totalEquity, googleFinanceMetricsBundleInfo.totalEquity) &&
        Objects.equals(this.sharesOutstanding, googleFinanceMetricsBundleInfo.sharesOutstanding) &&
        Objects.equals(this.priceToBook, googleFinanceMetricsBundleInfo.priceToBook) &&
        Objects.equals(this.returnOnAssets, googleFinanceMetricsBundleInfo.returnOnAssets) &&
        Objects.equals(this.returnOnCapital, googleFinanceMetricsBundleInfo.returnOnCapital) &&
        Objects.equals(this.cashFromOperations, googleFinanceMetricsBundleInfo.cashFromOperations) &&
        Objects.equals(this.cashFromOperationsDelta, googleFinanceMetricsBundleInfo.cashFromOperationsDelta) &&
        Objects.equals(this.cashFromInvesting, googleFinanceMetricsBundleInfo.cashFromInvesting) &&
        Objects.equals(this.cashFromInvestingDelta, googleFinanceMetricsBundleInfo.cashFromInvestingDelta) &&
        Objects.equals(this.cashFromFinancing, googleFinanceMetricsBundleInfo.cashFromFinancing) &&
        Objects.equals(this.cashFromFinancingDelta, googleFinanceMetricsBundleInfo.cashFromFinancingDelta) &&
        Objects.equals(this.netChangeInCash, googleFinanceMetricsBundleInfo.netChangeInCash) &&
        Objects.equals(this.netChangeInCashDelta, googleFinanceMetricsBundleInfo.netChangeInCashDelta) &&
        Objects.equals(this.freeCashFlow, googleFinanceMetricsBundleInfo.freeCashFlow) &&
        Objects.equals(this.freeCashFlowDelta, googleFinanceMetricsBundleInfo.freeCashFlowDelta);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(type, timestamp, revenue, revenueDelta, operatingExpense, operatingExpenseDelta, netIncome, netIncomeDelta, netProfitMargin, netProfitMarginDelta, earningsPerShare, earningsPerShareDelta, ebitda, ebitdaDelta, effectiveTaxRate, cashAndShortTermInvestments, cashAndShortTermInvestmentsDelta, totalAssets, totalAssetsDelta, totalLiabilities, totalLiabilitiesDelta, totalEquity, sharesOutstanding, priceToBook, returnOnAssets, returnOnCapital, cashFromOperations, cashFromOperationsDelta, cashFromInvesting, cashFromInvestingDelta, cashFromFinancing, cashFromFinancingDelta, netChangeInCash, netChangeInCashDelta, freeCashFlow, freeCashFlowDelta);
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
    sb.append("class GoogleFinanceMetricsBundleInfo {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
    sb.append("    revenueDelta: ").append(toIndentedString(revenueDelta)).append("\n");
    sb.append("    operatingExpense: ").append(toIndentedString(operatingExpense)).append("\n");
    sb.append("    operatingExpenseDelta: ").append(toIndentedString(operatingExpenseDelta)).append("\n");
    sb.append("    netIncome: ").append(toIndentedString(netIncome)).append("\n");
    sb.append("    netIncomeDelta: ").append(toIndentedString(netIncomeDelta)).append("\n");
    sb.append("    netProfitMargin: ").append(toIndentedString(netProfitMargin)).append("\n");
    sb.append("    netProfitMarginDelta: ").append(toIndentedString(netProfitMarginDelta)).append("\n");
    sb.append("    earningsPerShare: ").append(toIndentedString(earningsPerShare)).append("\n");
    sb.append("    earningsPerShareDelta: ").append(toIndentedString(earningsPerShareDelta)).append("\n");
    sb.append("    ebitda: ").append(toIndentedString(ebitda)).append("\n");
    sb.append("    ebitdaDelta: ").append(toIndentedString(ebitdaDelta)).append("\n");
    sb.append("    effectiveTaxRate: ").append(toIndentedString(effectiveTaxRate)).append("\n");
    sb.append("    cashAndShortTermInvestments: ").append(toIndentedString(cashAndShortTermInvestments)).append("\n");
    sb.append("    cashAndShortTermInvestmentsDelta: ").append(toIndentedString(cashAndShortTermInvestmentsDelta)).append("\n");
    sb.append("    totalAssets: ").append(toIndentedString(totalAssets)).append("\n");
    sb.append("    totalAssetsDelta: ").append(toIndentedString(totalAssetsDelta)).append("\n");
    sb.append("    totalLiabilities: ").append(toIndentedString(totalLiabilities)).append("\n");
    sb.append("    totalLiabilitiesDelta: ").append(toIndentedString(totalLiabilitiesDelta)).append("\n");
    sb.append("    totalEquity: ").append(toIndentedString(totalEquity)).append("\n");
    sb.append("    sharesOutstanding: ").append(toIndentedString(sharesOutstanding)).append("\n");
    sb.append("    priceToBook: ").append(toIndentedString(priceToBook)).append("\n");
    sb.append("    returnOnAssets: ").append(toIndentedString(returnOnAssets)).append("\n");
    sb.append("    returnOnCapital: ").append(toIndentedString(returnOnCapital)).append("\n");
    sb.append("    cashFromOperations: ").append(toIndentedString(cashFromOperations)).append("\n");
    sb.append("    cashFromOperationsDelta: ").append(toIndentedString(cashFromOperationsDelta)).append("\n");
    sb.append("    cashFromInvesting: ").append(toIndentedString(cashFromInvesting)).append("\n");
    sb.append("    cashFromInvestingDelta: ").append(toIndentedString(cashFromInvestingDelta)).append("\n");
    sb.append("    cashFromFinancing: ").append(toIndentedString(cashFromFinancing)).append("\n");
    sb.append("    cashFromFinancingDelta: ").append(toIndentedString(cashFromFinancingDelta)).append("\n");
    sb.append("    netChangeInCash: ").append(toIndentedString(netChangeInCash)).append("\n");
    sb.append("    netChangeInCashDelta: ").append(toIndentedString(netChangeInCashDelta)).append("\n");
    sb.append("    freeCashFlow: ").append(toIndentedString(freeCashFlow)).append("\n");
    sb.append("    freeCashFlowDelta: ").append(toIndentedString(freeCashFlowDelta)).append("\n");
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
    
    openapiFields.add("timestamp");
    
    openapiFields.add("revenue");
    
    openapiFields.add("revenue_delta");
    
    openapiFields.add("operating_expense");
    
    openapiFields.add("operating_expense_delta");
    
    openapiFields.add("net_income");
    
    openapiFields.add("net_income_delta");
    
    openapiFields.add("net_profit_margin");
    
    openapiFields.add("net_profit_margin_delta");
    
    openapiFields.add("earnings_per_share");
    
    openapiFields.add("earnings_per_share_delta");
    
    openapiFields.add("ebitda");
    
    openapiFields.add("ebitda_delta");
    
    openapiFields.add("effective_tax_rate");
    
    openapiFields.add("cash_and_short_term_investments");
    
    openapiFields.add("cash_and_short_term_investments_delta");
    
    openapiFields.add("total_assets");
    
    openapiFields.add("total_assets_delta");
    
    openapiFields.add("total_liabilities");
    
    openapiFields.add("total_liabilities_delta");
    
    openapiFields.add("total_equity");
    
    openapiFields.add("shares_outstanding");
    
    openapiFields.add("price_to_book");
    
    openapiFields.add("return_on_assets");
    
    openapiFields.add("return_on_capital");
    
    openapiFields.add("cash_from_operations");
    
    openapiFields.add("cash_from_operations_delta");
    
    openapiFields.add("cash_from_investing");
    
    openapiFields.add("cash_from_investing_delta");
    
    openapiFields.add("cash_from_financing");
    
    openapiFields.add("cash_from_financing_delta");
    
    openapiFields.add("net_change_in_cash");
    
    openapiFields.add("net_change_in_cash_delta");
    
    openapiFields.add("free_cash_flow");
    
    openapiFields.add("free_cash_flow_delta");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleFinanceMetricsBundleInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleFinanceMetricsBundleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleFinanceMetricsBundleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleFinanceMetricsBundleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleFinanceMetricsBundleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleFinanceMetricsBundleInfo>() {
           @Override
           public void write(JsonWriter out, GoogleFinanceMetricsBundleInfo value) throws IOException {
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
           public GoogleFinanceMetricsBundleInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             GoogleFinanceMetricsBundleInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static GoogleFinanceMetricsBundleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleFinanceMetricsBundleInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}