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


public class AiOptimizationGeminiLlmResponsesTaskPostRequestInfo  {


  public static final String SERIALIZED_NAME_USER_PROMPT = "user_prompt";
  @SerializedName(SERIALIZED_NAME_USER_PROMPT)
  private String userPrompt;

  public AiOptimizationGeminiLlmResponsesTaskPostRequestInfo userPrompt(String userPrompt) {
    this.userPrompt = userPrompt;
    return this;
  }

  /**
   * <em>prompt for the AI model</em><br><strong>required field</strong><br>the question or task you want to send to the AI model;<br>you can specify <strong>up to 500 characters</strong> in the <code>user_prompt</code> field
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

  public AiOptimizationGeminiLlmResponsesTaskPostRequestInfo modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  /**
   * <em>name of the AI model</em><br><strong>required field</strong><br><code>model_name</code >consists of the actual model name and version name;<br>if the basic model name is specified, its latest version will be set by default;<br>for example, if <code>gemini-1.5-pro</code> is specified, the <code>gemini-1.5-pro-002</code> will be set as <code>model_name</code> automatically;<br>you can receive the list of available LLM models by making a separate request to the <code>https://api.dataforseo.com/v3/ai_optimization/gemini/llm_responses/models</code>
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

  public AiOptimizationGeminiLlmResponsesTaskPostRequestInfo maxOutputTokens(Integer maxOutputTokens) {
    this.maxOutputTokens = maxOutputTokens;
    return this;
  }

  /**
   * <em>maximum number of tokens in the AI response</em><br>optional field<br>minimum value: <code>1</code>;<br>maximum value: <code>4096</code>;<br>default value: <code>2048</code>;<br><strong>Note:</strong> if <code>web_search</code> is set to <code>true</code> or the reasoning model is specified in the request, the output token count may exceed the specified <code>max_output_tokens</code> limit<br><strong>Note #2:</strong> if <code>use_reasoning</code> is set to <code>true</code>, the minimum value for <code>max_output_tokens</code> is <code>1024</code>
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

  public AiOptimizationGeminiLlmResponsesTaskPostRequestInfo temperature(Double temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * <em>randomness of the AI response</em><br>optional field<br>higher values make output more diverse <br>lower values make output more focused<br>minimum value: <code>0</code><br>maximum value: <code>2</code><br>default value: <code>1.3</code>
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

  public AiOptimizationGeminiLlmResponsesTaskPostRequestInfo topP(Double topP) {
    this.topP = topP;
    return this;
  }

  /**
   * <em>diversity of the AI response</em><br>optional field <br>controls diversity of the response by limiting token selection<br>minimum value: <code>0</code><br>maximum value: <code>1</code> <br>default value: <code>0.9</code>
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

  public AiOptimizationGeminiLlmResponsesTaskPostRequestInfo webSearch(Boolean webSearch) {
    this.webSearch = webSearch;
    return this;
  }

  /**
   * <em>enable web search for current information</em><br>optional field<br>when enabled, the AI model can access and cite current web information;<br><strong>Note:</strong> refer to the <a href='https://docs.dataforseo.com/v3/ai_optimization/gemini/llm_responses/models/'>Models endpoint</a> for a list of models that support <code>web_search</code>; <br>default value: <code>false</code>;<br>The cost of the parameter can be calculated on the <a title='Gemini API Pricing' href='https://ai.google.dev/gemini-api/docs/pricing' target='_blank' rel='noopener noreferrer'>Pricing</a> page
   * @return webSearch
   */
  @javax.annotation.Nullable
  public Boolean getWebSearch() {
    return webSearch;
  }

  public void setWebSearch(Boolean webSearch) {
    this.webSearch = webSearch;
  }


  public static final String SERIALIZED_NAME_SYSTEM_MESSAGE = "system_message";
  @SerializedName(SERIALIZED_NAME_SYSTEM_MESSAGE)
  private String systemMessage;

  public AiOptimizationGeminiLlmResponsesTaskPostRequestInfo systemMessage(String systemMessage) {
    this.systemMessage = systemMessage;
    return this;
  }

  /**
   * <em>instructions for the AI behavior</em><br>optional field<br>defines the AI's role, tone, or specific behavior <br>you can specify <strong>up to 500 characters</strong> in the <code>system_message</code> field
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

  public AiOptimizationGeminiLlmResponsesTaskPostRequestInfo messageChain(List<LlmMessageChainItem> messageChain) {
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


  public static final String SERIALIZED_NAME_USE_REASONING = "use_reasoning";
  @SerializedName(SERIALIZED_NAME_USE_REASONING)
  private Boolean useReasoning;

  public AiOptimizationGeminiLlmResponsesTaskPostRequestInfo useReasoning(Boolean useReasoning) {
    this.useReasoning = useReasoning;
    return this;
  }

  /**
   * <em>enable reasoning for the AI model</em><br>optional field<br>when enabled, the model will perform reasoning before generating a response<br>refer to the <a href='https://docs.dataforseo.com/v3/ai_optimization/gemini/llm_responses/models/' target='_blank'>Models endpoint</a> for a list of models that support <code>reasoning</code><br>default value: <code>false</code><br><strong>Note:</strong> if set to <code>true</code>, the minimum value for <code>max_output_tokens</code> is <code>1024</code><br><strong>Note #2:</strong> for Gemini Pro models, the <code>use_reasoning</code> will automatically be set to <code>true</code>
   * @return useReasoning
   */
  @javax.annotation.Nullable
  public Boolean getUseReasoning() {
    return useReasoning;
  }

  public void setUseReasoning(Boolean useReasoning) {
    this.useReasoning = useReasoning;
  }


  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public AiOptimizationGeminiLlmResponsesTaskPostRequestInfo tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * <em>user-defined task identifier</em><br>optional field<br><em>the character limit is 255</em><br>you can use this parameter to identify the task and match it with the result<br>you will find the specified <code>tag</code> value in the <code>data</code> object of the response
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

  public AiOptimizationGeminiLlmResponsesTaskPostRequestInfo postbackUrl(String postbackUrl) {
    this.postbackUrl = postbackUrl;
    return this;
  }

  /**
   * <em>URL for sending task results</em><br>optional field<br>once the task is completed, we will send a POST request with its results compressed in the <code>gzip</code> format to the <code>postback_url</code> you specified<br>you can use the ‘$id’ string as a <code>$id</code> variable and ‘$tag’ as urlencoded <code>$tag</code> variable. We will set the necessary values before sending the request.<br>example:<br><code>http://your-server.com/postbackscript?id=$id</code><br><code>http://your-server.com/postbackscript?id=$id&tag=$tag</code><br><strong>Note:</strong> special character in <code>postback_url</code> will be urlencoded;<br>i.a., the <code>#</code> character will be encoded into <code>%23</code><p>learn more on our <a href='https://dataforseo.com/help-center/pingbacks-postbacks-with-dataforseo-api' target='_blank' rel='noopener noreferrer'>Help Center</a>
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

  public AiOptimizationGeminiLlmResponsesTaskPostRequestInfo pingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
    return this;
  }

  /**
   * <em>notification URL of a completed task</em><br>optional field<br>when a task is completed we will notify you by GET request sent to the URL you have specified<br>you can use the ‘$id’ string as a <code>$id</code> variable and ‘$tag’ as urlencoded <code>$tag</code> variable. We will set the necessary values before sending the request<br>example:<br><code>http://your-server.com/pingscript?id=$id</code><br><code>http://your-server.com/pingscript?id=$id&tag=$tag</code><br><strong>Note:</strong> special character in <code>pingback_url</code> will be urlencoded;<br>i.a., the <code>#</code> character will be encoded into <code>%23</code><p>learn more on our <a href='https://dataforseo.com/help-center/pingbacks-postbacks-with-dataforseo-api' target='_blank' rel='noopener noreferrer'>Help Center</a>
   * @return pingbackUrl
   */
  @javax.annotation.Nullable
  public String getPingbackUrl() {
    return pingbackUrl;
  }

  public void setPingbackUrl(String pingbackUrl) {
    this.pingbackUrl = pingbackUrl;
  }



  public AiOptimizationGeminiLlmResponsesTaskPostRequestInfo() {
  }

  
    
  private Map<String, Object> additionalProperties;

  public AiOptimizationGeminiLlmResponsesTaskPostRequestInfo putAdditionalProperty(String key, Object value) {
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


    
    AiOptimizationGeminiLlmResponsesTaskPostRequestInfo aiOptimizationGeminiLlmResponsesTaskPostRequestInfo = (AiOptimizationGeminiLlmResponsesTaskPostRequestInfo) o;
    return

        Objects.equals(this.userPrompt, aiOptimizationGeminiLlmResponsesTaskPostRequestInfo.userPrompt) &&
        Objects.equals(this.modelName, aiOptimizationGeminiLlmResponsesTaskPostRequestInfo.modelName) &&
        Objects.equals(this.maxOutputTokens, aiOptimizationGeminiLlmResponsesTaskPostRequestInfo.maxOutputTokens) &&
        Objects.equals(this.temperature, aiOptimizationGeminiLlmResponsesTaskPostRequestInfo.temperature) &&
        Objects.equals(this.topP, aiOptimizationGeminiLlmResponsesTaskPostRequestInfo.topP) &&
        Objects.equals(this.webSearch, aiOptimizationGeminiLlmResponsesTaskPostRequestInfo.webSearch) &&
        Objects.equals(this.systemMessage, aiOptimizationGeminiLlmResponsesTaskPostRequestInfo.systemMessage) &&
        Objects.equals(this.messageChain, aiOptimizationGeminiLlmResponsesTaskPostRequestInfo.messageChain) &&
        Objects.equals(this.useReasoning, aiOptimizationGeminiLlmResponsesTaskPostRequestInfo.useReasoning) &&
        Objects.equals(this.tag, aiOptimizationGeminiLlmResponsesTaskPostRequestInfo.tag) &&
        Objects.equals(this.postbackUrl, aiOptimizationGeminiLlmResponsesTaskPostRequestInfo.postbackUrl) &&
        Objects.equals(this.pingbackUrl, aiOptimizationGeminiLlmResponsesTaskPostRequestInfo.pingbackUrl);  
    
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
  return Objects.hash(userPrompt, modelName, maxOutputTokens, temperature, topP, webSearch, systemMessage, messageChain, useReasoning, tag, postbackUrl, pingbackUrl);
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
    sb.append("class AiOptimizationGeminiLlmResponsesTaskPostRequestInfo {\n");

    sb.append("    userPrompt: ").append(toIndentedString(userPrompt)).append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    maxOutputTokens: ").append(toIndentedString(maxOutputTokens)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
    sb.append("    webSearch: ").append(toIndentedString(webSearch)).append("\n");
    sb.append("    systemMessage: ").append(toIndentedString(systemMessage)).append("\n");
    sb.append("    messageChain: ").append(toIndentedString(messageChain)).append("\n");
    sb.append("    useReasoning: ").append(toIndentedString(useReasoning)).append("\n");
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
    
    openapiFields.add("system_message");
    
    openapiFields.add("message_chain");
    
    openapiFields.add("use_reasoning");
    
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
   * @throws IOException if the JSON Element is invalid with respect to AiOptimizationGeminiLlmResponsesTaskPostRequestInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiOptimizationGeminiLlmResponsesTaskPostRequestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiOptimizationGeminiLlmResponsesTaskPostRequestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiOptimizationGeminiLlmResponsesTaskPostRequestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiOptimizationGeminiLlmResponsesTaskPostRequestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AiOptimizationGeminiLlmResponsesTaskPostRequestInfo>() {
           @Override
           public void write(JsonWriter out, AiOptimizationGeminiLlmResponsesTaskPostRequestInfo value) throws IOException {
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
           public AiOptimizationGeminiLlmResponsesTaskPostRequestInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AiOptimizationGeminiLlmResponsesTaskPostRequestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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


  public static AiOptimizationGeminiLlmResponsesTaskPostRequestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiOptimizationGeminiLlmResponsesTaskPostRequestInfo.class);
  }

  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}