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



public class AppendixUserDataResultInfo  {


  public static final String SERIALIZED_NAME_LOGIN = "login";
  @SerializedName(SERIALIZED_NAME_LOGIN)
  private String login;

  public AppendixUserDataResultInfo login(String login) {
    this.login = login;
    return this;
  }

  /**
   * your login
   * @return login
   */
  @javax.annotation.Nullable
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }


  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public AppendixUserDataResultInfo timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * your time zone
* can be set in your profile settings
   * @return timezone
   */
  @javax.annotation.Nullable
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public static final String SERIALIZED_NAME_RATES = "rates";
  @SerializedName(SERIALIZED_NAME_RATES)
  private AppendixRatesData rates;

  public AppendixUserDataResultInfo rates(AppendixRatesData rates) {
    this.rates = rates;
    return this;
  }

  /**
   * your API rates
   * @return rates
   */
  @javax.annotation.Nullable
  public AppendixRatesData getRates() {
    return rates;
  }

  public void setRates(AppendixRatesData rates) {
    this.rates = rates;
  }


  public static final String SERIALIZED_NAME_MONEY = "money";
  @SerializedName(SERIALIZED_NAME_MONEY)
  private AppendixMoneyData money;

  public AppendixUserDataResultInfo money(AppendixMoneyData money) {
    this.money = money;
    return this;
  }

  /**
   * section of your spending, USD
   * @return money
   */
  @javax.annotation.Nullable
  public AppendixMoneyData getMoney() {
    return money;
  }

  public void setMoney(AppendixMoneyData money) {
    this.money = money;
  }


  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private AppendixPriceData price;

  public AppendixUserDataResultInfo price(AppendixPriceData price) {
    this.price = price;
    return this;
  }

  /**
   * pricing
   * @return price
   */
  @javax.annotation.Nullable
  public AppendixPriceData getPrice() {
    return price;
  }

  public void setPrice(AppendixPriceData price) {
    this.price = price;
  }


  public static final String SERIALIZED_NAME_BACKLINKS_SUBSCRIPTION_EXPIRY_DATE = "backlinks_subscription_expiry_date";
  @SerializedName(SERIALIZED_NAME_BACKLINKS_SUBSCRIPTION_EXPIRY_DATE)
  private String backlinksSubscriptionExpiryDate;

  public AppendixUserDataResultInfo backlinksSubscriptionExpiryDate(String backlinksSubscriptionExpiryDate) {
    this.backlinksSubscriptionExpiryDate = backlinksSubscriptionExpiryDate;
    return this;
  }

  /**
   * expiry date of the backlinks api subscription
* date and time when the current subscription to Backlinks API expires;
* in the UTC format: “yyyy-mm-dd hh-mm-ss +00:00”
* example:
* 2025-06-15 12:57:46 +00:00
* Note: if there is no active subscription to Backlinks API, the value equals null
   * @return backlinksSubscriptionExpiryDate
   */
  @javax.annotation.Nullable
  public String getBacklinksSubscriptionExpiryDate() {
    return backlinksSubscriptionExpiryDate;
  }

  public void setBacklinksSubscriptionExpiryDate(String backlinksSubscriptionExpiryDate) {
    this.backlinksSubscriptionExpiryDate = backlinksSubscriptionExpiryDate;
  }



  public AppendixUserDataResultInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AppendixUserDataResultInfo putAdditionalProperty(String key, Object value) {
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


    
    AppendixUserDataResultInfo appendixUserDataResultInfo = (AppendixUserDataResultInfo) o;
    return

        Objects.equals(this.login, appendixUserDataResultInfo.login) &&
        Objects.equals(this.timezone, appendixUserDataResultInfo.timezone) &&
        Objects.equals(this.rates, appendixUserDataResultInfo.rates) &&
        Objects.equals(this.money, appendixUserDataResultInfo.money) &&
        Objects.equals(this.price, appendixUserDataResultInfo.price) &&
        Objects.equals(this.backlinksSubscriptionExpiryDate, appendixUserDataResultInfo.backlinksSubscriptionExpiryDate);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(login, timezone, rates, money, price, backlinksSubscriptionExpiryDate);
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
    sb.append("class AppendixUserDataResultInfo {\n");

    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    rates: ").append(toIndentedString(rates)).append("\n");
    sb.append("    money: ").append(toIndentedString(money)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    backlinksSubscriptionExpiryDate: ").append(toIndentedString(backlinksSubscriptionExpiryDate)).append("\n");
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
    
    openapiFields.add("login");
    
    openapiFields.add("timezone");
    
    openapiFields.add("rates");
    
    openapiFields.add("money");
    
    openapiFields.add("price");
    
    openapiFields.add("backlinks_subscription_expiry_date");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppendixUserDataResultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendixUserDataResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendixUserDataResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendixUserDataResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendixUserDataResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendixUserDataResultInfo>() {
           @Override
           public void write(JsonWriter out, AppendixUserDataResultInfo value) throws IOException {
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
           public AppendixUserDataResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AppendixUserDataResultInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AppendixUserDataResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendixUserDataResultInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}