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



public class AiOptimizationClaudeLlmResponsesTaskPostRequestInfo  {


  public static final String SERIALIZED_NAME_USER_PROMPT = "user_prompt";
  @SerializedName(SERIALIZED_NAME_USER_PROMPT)
  private String userPrompt;

  public AiOptimizationClaudeLlmResponsesTaskPostRequestInfo userPrompt(String userPrompt) {
    this.userPrompt = userPrompt;
    return this;
  }

  /**
   * prompt for the AI model
* required field
* the question or task you want to send to the AI model;
* you can specify up to 500 characters in the user_prompt field
   * @return userPrompt
   */
  @javax.annotation.Nullable
  public String getUserPrompt() {
    return userPrompt;
  }

  public void setUserPrompt(String userPrompt) {
    this.userPrompt = userPrompt;
  }


  public static final String SERIALIZED_NAME_MODEL_NAME = "model_name";
  @SerializedName(SERIALIZED_NAME_MODEL_NAME)
  private String modelName;

  public AiOptimizationClaudeLlmResponsesTaskPostRequestInfo modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  /**
   * name of the AI model
* required field
* model_nameconsists of the actual model name and version name;
* if the basic model name is specified, its latest version will be set by default;
* for example, if claude-opus-4-0 is specified, the claude-opus-4-20250514 will be set as model_name automatically;
* you can receive the list of available LLM models by making a separate request to the https://api.dataforseo.com/v3/ai_optimization/claude/llm_responses/models
   * @return modelName
   */
  @javax.annotation.Nullable
  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }


  public static final String SERIALIZED_NAME_MAX_OUTPUT_TOKENS = "max_output_tokens";
  @SerializedName(SERIALIZED_NAME_MAX_OUTPUT_TOKENS)
  private Integer maxOutputTokens;

  public AiOptimizationClaudeLlmResponsesTaskPostRequestInfo maxOutputTokens(Integer maxOutputTokens) {
    this.maxOutputTokens = maxOutputTokens;
    return this;
  }

  /**
   * maximum number of tokens in the AI response
* optional field
* minimum value: 1
* maximum value: 2048
* default value: 2048
* Note: when web_search is set to true, the output token count may exceed the specified max_output_tokens limit
   * @return maxOutputTokens
   */
  @javax.annotation.Nullable
  public Integer getMaxOutputTokens() {
    return maxOutputTokens;
  }

  public void setMaxOutputTokens(Integer maxOutputTokens) {
    this.maxOutputTokens = maxOutputTokens;
  }


  public static final String SERIALIZED_NAME_TEMPERATURE = "temperature";
  @SerializedName(SERIALIZED_NAME_TEMPERATURE)
  private Double temperature;

  public AiOptimizationClaudeLlmResponsesTaskPostRequestInfo temperature(Double temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * randomness of the AI response
* optional field
* higher values make output more diverse;
* lower values make output more focused;
* minimum value: 0
* maximum value: 1
* default value: 0.7
   * @return temperature
   */
  @javax.annotation.Nullable
  public Double getTemperature() {
    return temperature;
  }

  public void setTemperature(Double temperature) {
    this.temperature = temperature;
  }


  public static final String SERIALIZED_NAME_TOP_P = "top_p";
  @SerializedName(SERIALIZED_NAME_TOP_P)
  private Double topP;

  public AiOptimizationClaudeLlmResponsesTaskPostRequestInfo topP(Double topP) {
    this.topP = topP;
    return this;
  }

  /**
   * diversity of the AI response
* optional field
* controls diversity of the response by limiting token selection;
* minimum value: 0
* maximum value: 1
* default value: null
   * @return topP
   */
  @javax.annotation.Nullable
  public Double getTopP() {
    return topP;
  }

  public void setTopP(Double topP) {
    this.topP = topP;
  }


  public static final String SERIALIZED_NAME_WEB_SEARCH = "web_search";
  @SerializedName(SERIALIZED_NAME_WEB_SEARCH)
  private Boolean webSearch;

  public AiOptimizationClaudeLlmResponsesTaskPostRequestInfo webSearch(Boolean webSearch) {
    this.webSearch = webSearch;
    return this;
  }

  /**
   * enable web search for current information
* optional field
* when enabled, the AI model can access and cite current web information;
* Note: refer to the Models endpoint for a list of models that support web_search;
* default value: false;
* The cost of the parameter can be calculated on the Pricing page
   * @return webSearch
   */
  @javax.annotation.Nullable
  public Boolean getWebSearch() {
    return webSearch;
  }

  public void setWebSearch(Boolean webSearch) {
    this.webSearch = webSearch;
  }


  public static final String SERIALIZED_NAME_FORCE_WEB_SEARCH = "force_web_search";
  @SerializedName(SERIALIZED_NAME_FORCE_WEB_SEARCH)
  private Boolean forceWebSearch;

  public AiOptimizationClaudeLlmResponsesTaskPostRequestInfo forceWebSearch(Boolean forceWebSearch) {
    this.forceWebSearch = forceWebSearch;
    return this;
  }

  /**
   * force AI agent to use web search
* optional field
* to enable this parameter, web_search must also be enabled;
* when enabled, the AI model is forced to access and cite current web information;
* default value: false;
* Note: even if the parameter is set to true, there is no guarantee web sources will be cited in the response
   * @return forceWebSearch
   */
  @javax.annotation.Nullable
  public Boolean getForceWebSearch() {
    return forceWebSearch;
  }

  public void setForceWebSearch(Boolean forceWebSearch) {
    this.forceWebSearch = forceWebSearch;
  }


  public static final String SERIALIZED_NAME_WEB_SEARCH_COUNTRY_ISO_CODE = "web_search_country_iso_code";
  @SerializedName(SERIALIZED_NAME_WEB_SEARCH_COUNTRY_ISO_CODE)
  private String webSearchCountryIsoCode;

  public AiOptimizationClaudeLlmResponsesTaskPostRequestInfo webSearchCountryIsoCode(String webSearchCountryIsoCode) {
    this.webSearchCountryIsoCode = webSearchCountryIsoCode;
    return this;
  }

  /**
   * ISO country code of the location
* optional field
* possible values: 'AR','AT','AU','BE','BR','CA','CH','CL','CN','DE','DK','ES','FI','FR','GB','HK','ID','IN','IT','JP','KR','MX','MY','NL','NO','NZ','PH','PL','PT','RU','SA','SE','TR','TW','US','ZA'
   * @return webSearchCountryIsoCode
   */
  @javax.annotation.Nullable
  public String getWebSearchCountryIsoCode() {
    return webSearchCountryIsoCode;
  }

  public void setWebSearchCountryIsoCode(String webSearchCountryIsoCode) {
    this.webSearchCountryIsoCode = webSearchCountryIsoCode;
  }


  public static final String SERIALIZED_NAME_WEB_SEARCH_CITY = "web_search_city";
  @SerializedName(SERIALIZED_NAME_WEB_SEARCH_CITY)
  private String webSearchCity;

  public AiOptimizationClaudeLlmResponsesTaskPostRequestInfo webSearchCity(String webSearchCity) {
    this.webSearchCity = webSearchCity;
    return this;
  }

  /**
   * city name of the location
* optional field
* Note: specify web_search_country_iso_code to use this parameter
   * @return webSearchCity
   */
  @javax.annotation.Nullable
  public String getWebSearchCity() {
    return webSearchCity;
  }

  public void setWebSearchCity(String webSearchCity) {
    this.webSearchCity = webSearchCity;
  }


  public static final String SERIALIZED_NAME_SYSTEM_MESSAGE = "system_message";
  @SerializedName(SERIALIZED_NAME_SYSTEM_MESSAGE)
  private String systemMessage;

  public AiOptimizationClaudeLlmResponsesTaskPostRequestInfo systemMessage(String systemMessage) {
    this.systemMessage = systemMessage;
    return this;
  }

  /**
   * instructions for the AI behaviour
* optional field
* defines the AI’s role, tone, or specific behavior;
* you can specify up to 500 characters in the system_message field
   * @return systemMessage
   */
  @javax.annotation.Nullable
  public String getSystemMessage() {
    return systemMessage;
  }

  public void setSystemMessage(String systemMessage) {
    this.systemMessage = systemMessage;
  }


  public static final String SERIALIZED_NAME_MESSAGE_CHAIN = "message_chain";
  @SerializedName(SERIALIZED_NAME_MESSAGE_CHAIN)
  private List<LlmMessageChainItem> messageChain;

  public AiOptimizationClaudeLlmResponsesTaskPostRequestInfo messageChain(List<LlmMessageChainItem> messageChain) {
    this.messageChain = messageChain;
    return this;
  }

  /**
   * conversation history
* optional field
* array of message objects representing previous conversation turns;
* each object must contain:
* role string with either user or ai role;
* message string with message content (max 500 characters);
* you can specify maximum of 10 message objects in the array;
* Note: for Perplexity models, messages must strictly alternate between user and AI roles (user → ai);
* example:
* 'message_chain': [{'role':'user','message':'Hello, what’s up?'},{'role':'ai','message':'Hello! I’m doing well, thank you. How can I assist you today?'}]
   * @return messageChain
   */
  @javax.annotation.Nullable
  public List<LlmMessageChainItem> getMessageChain() {
    return messageChain;
  }

  public void setMessageChain(List<LlmMessageChainItem> messageChain) {
    this.messageChain = messageChain;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public AiOptimizationClaudeLlmResponsesTaskPostRequestInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * user-defined task identifier
* optional field
* the character limit is 255
* you can use this parameter to identify the task and match it with the result
* you will find the specified tag value in the data array of the response
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  public static final String SERIALIZED_NAME_POSTBACK_URL = "postback_url";
  @SerializedName(SERIALIZED_NAME_POSTBACK_URL)
  private String postbackUrl;

  public AiOptimizationClaudeLlmResponsesTaskPostRequestInfo postbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
    return this;
  }

  /**
   * return URL for sending task results
* optional field
* once the task is completed, we will send a POST request with its results compressed in the gzip format to the postback_url you specified
* you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request.
* example:
* http://your-server.com/postbackscript?id=$id
* http://your-server.com/postbackscript?id=$id&tag=$tag
* Note: special character in postback_url will be urlencoded;
* i.a., the # character will be encoded into %23
* learn more on our Help Center
   * @return postbackUrl
   */
  @javax.annotation.Nullable
  public String getPostbackUrl() {
    return postbackUrl;
  }

  public void setPostbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
  }


  public static final String SERIALIZED_NAME_PINGBACK_URL = "pingback_url";
  @SerializedName(SERIALIZED_NAME_PINGBACK_URL)
  private String pingbackUrl;

  public AiOptimizationClaudeLlmResponsesTaskPostRequestInfo pingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
    return this;
  }

  /**
   * notification URL of a completed task
* optional field
* when a task is completed we will notify you by GET request sent to the URL you have specified
* you can use the ‘$id’ string as a $id variable and ‘$tag’ as urlencoded $tag variable. We will set the necessary values before sending the request
* example:
* http://your-server.com/pingscript?id=$id
* http://your-server.com/pingscript?id=$id&tag=$tag
* Note: special character in pingback_url will be urlencoded;
* i.a., the # character will be encoded into %23
* learn more on our Help Center
   * @return pingbackUrl
   */
  @javax.annotation.Nullable
  public String getPingbackUrl() {
    return pingbackUrl;
  }

  public void setPingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
  }



  public AiOptimizationClaudeLlmResponsesTaskPostRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AiOptimizationClaudeLlmResponsesTaskPostRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    AiOptimizationClaudeLlmResponsesTaskPostRequestInfo aiOptimizationClaudeLlmResponsesTaskPostRequestInfo = (AiOptimizationClaudeLlmResponsesTaskPostRequestInfo) o;
    return

        Objects.equals(this.userPrompt, aiOptimizationClaudeLlmResponsesTaskPostRequestInfo.userPrompt) &&
        Objects.equals(this.modelName, aiOptimizationClaudeLlmResponsesTaskPostRequestInfo.modelName) &&
        Objects.equals(this.maxOutputTokens, aiOptimizationClaudeLlmResponsesTaskPostRequestInfo.maxOutputTokens) &&
        Objects.equals(this.temperature, aiOptimizationClaudeLlmResponsesTaskPostRequestInfo.temperature) &&
        Objects.equals(this.topP, aiOptimizationClaudeLlmResponsesTaskPostRequestInfo.topP) &&
        Objects.equals(this.webSearch, aiOptimizationClaudeLlmResponsesTaskPostRequestInfo.webSearch) &&
        Objects.equals(this.forceWebSearch, aiOptimizationClaudeLlmResponsesTaskPostRequestInfo.forceWebSearch) &&
        Objects.equals(this.webSearchCountryIsoCode, aiOptimizationClaudeLlmResponsesTaskPostRequestInfo.webSearchCountryIsoCode) &&
        Objects.equals(this.webSearchCity, aiOptimizationClaudeLlmResponsesTaskPostRequestInfo.webSearchCity) &&
        Objects.equals(this.systemMessage, aiOptimizationClaudeLlmResponsesTaskPostRequestInfo.systemMessage) &&
        Objects.equals(this.messageChain, aiOptimizationClaudeLlmResponsesTaskPostRequestInfo.messageChain) &&
        Objects.equals(this.tag, aiOptimizationClaudeLlmResponsesTaskPostRequestInfo.tag) &&
        Objects.equals(this.postbackUrl, aiOptimizationClaudeLlmResponsesTaskPostRequestInfo.postbackUrl) &&
        Objects.equals(this.pingbackUrl, aiOptimizationClaudeLlmResponsesTaskPostRequestInfo.pingbackUrl);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(userPrompt, modelName, maxOutputTokens, temperature, topP, webSearch, forceWebSearch, webSearchCountryIsoCode, webSearchCity, systemMessage, messageChain, tag, postbackUrl, pingbackUrl);
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
    sb.append("class AiOptimizationClaudeLlmResponsesTaskPostRequestInfo {\n");

    sb.append("    userPrompt: ").append(toIndentedString(userPrompt)).append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    maxOutputTokens: ").append(toIndentedString(maxOutputTokens)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
    sb.append("    webSearch: ").append(toIndentedString(webSearch)).append("\n");
    sb.append("    forceWebSearch: ").append(toIndentedString(forceWebSearch)).append("\n");
    sb.append("    webSearchCountryIsoCode: ").append(toIndentedString(webSearchCountryIsoCode)).append("\n");
    sb.append("    webSearchCity: ").append(toIndentedString(webSearchCity)).append("\n");
    sb.append("    systemMessage: ").append(toIndentedString(systemMessage)).append("\n");
    sb.append("    messageChain: ").append(toIndentedString(messageChain)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    postbackUrl: ").append(toIndentedString(postbackUrl)).append("\n");
    sb.append("    pingbackUrl: ").append(toIndentedString(pingbackUrl)).append("\n");
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
    
    openapiFields.add("user_prompt");
    
    openapiFields.add("model_name");
    
    openapiFields.add("max_output_tokens");
    
    openapiFields.add("temperature");
    
    openapiFields.add("top_p");
    
    openapiFields.add("web_search");
    
    openapiFields.add("force_web_search");
    
    openapiFields.add("web_search_country_iso_code");
    
    openapiFields.add("web_search_city");
    
    openapiFields.add("system_message");
    
    openapiFields.add("message_chain");
    
    openapiFields.add("tag");
    
    openapiFields.add("postback_url");
    
    openapiFields.add("pingback_url");
    

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AiOptimizationClaudeLlmResponsesTaskPostRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiOptimizationClaudeLlmResponsesTaskPostRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiOptimizationClaudeLlmResponsesTaskPostRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiOptimizationClaudeLlmResponsesTaskPostRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiOptimizationClaudeLlmResponsesTaskPostRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AiOptimizationClaudeLlmResponsesTaskPostRequestInfo>() {
           @Override
           public void write(JsonWriter out, AiOptimizationClaudeLlmResponsesTaskPostRequestInfo value) throws IOException {
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
           public AiOptimizationClaudeLlmResponsesTaskPostRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AiOptimizationClaudeLlmResponsesTaskPostRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AiOptimizationClaudeLlmResponsesTaskPostRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiOptimizationClaudeLlmResponsesTaskPostRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}