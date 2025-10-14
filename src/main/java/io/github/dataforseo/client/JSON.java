package io.github.dataforseo.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
            .registerTypeSelector(io.github.dataforseo.client.model.BaseChatGptLlmScraperElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseChatGptLlmScraperElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseChatGptLlmScraperElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("chat_gpt_text", io.github.dataforseo.client.model.ChatGptTextElementItem.class);
                    classByDiscriminatorValue.put("chat_gpt_table", io.github.dataforseo.client.model.ChatGptTableElementItem.class);
                    classByDiscriminatorValue.put("chat_gpt_navigation_list", io.github.dataforseo.client.model.ChatGptNavigationListElementItem.class);
                    classByDiscriminatorValue.put("chat_gpt_images", io.github.dataforseo.client.model.ChatGptImagesElementItem.class);
                    classByDiscriminatorValue.put("chat_gpt_products", io.github.dataforseo.client.model.ChatGptProductsElementItem.class);
                    classByDiscriminatorValue.put("chat_gpt_local_businesses", io.github.dataforseo.client.model.ChatGptLocalBusinessesElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseBingSerpApiElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseBingSerpApiElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseBingSerpApiElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("organic", io.github.dataforseo.client.model.BingOrganicSerpElementItem.class);
                    classByDiscriminatorValue.put("paid", io.github.dataforseo.client.model.BingPaidSerpElementItem.class);
                    classByDiscriminatorValue.put("featured_snippet", io.github.dataforseo.client.model.BingFeaturedSnippetSerpElementItem.class);
                    classByDiscriminatorValue.put("related_searches", io.github.dataforseo.client.model.BingRelatedSearchesSerpElementItem.class);
                    classByDiscriminatorValue.put("ai_overview", io.github.dataforseo.client.model.BingAiOverviewSerpElementItem.class);
                    classByDiscriminatorValue.put("images", io.github.dataforseo.client.model.BingImagesSerpElementItem.class);
                    classByDiscriminatorValue.put("video", io.github.dataforseo.client.model.BingVideoSerpElementItem.class);
                    classByDiscriminatorValue.put("shopping", io.github.dataforseo.client.model.BingShoppingSerpElementItem.class);
                    classByDiscriminatorValue.put("answer_box", io.github.dataforseo.client.model.BingAnswerBoxSerpElementItem.class);
                    classByDiscriminatorValue.put("local_pack", io.github.dataforseo.client.model.BingLocalPackSerpElementItem.class);
                    classByDiscriminatorValue.put("questions_and_answers", io.github.dataforseo.client.model.BingQuestionsAndAnswersSerpElementItem.class);
                    classByDiscriminatorValue.put("hotels_pack", io.github.dataforseo.client.model.BingHotelsPackSerpElementItem.class);
                    classByDiscriminatorValue.put("jobs", io.github.dataforseo.client.model.BingJobsSerpElementItem.class);
                    classByDiscriminatorValue.put("top_stories", io.github.dataforseo.client.model.BingTopStoriesSerpElementItem.class);
                    classByDiscriminatorValue.put("carousel", io.github.dataforseo.client.model.BingCarouselSerpElementItem.class);
                    classByDiscriminatorValue.put("map", io.github.dataforseo.client.model.BingMapSerpElementItem.class);
                    classByDiscriminatorValue.put("events", io.github.dataforseo.client.model.BingEventsSerpElementItem.class);
                    classByDiscriminatorValue.put("recipes", io.github.dataforseo.client.model.BingRecipesSerpElementItem.class);
                    classByDiscriminatorValue.put("people_also_ask", io.github.dataforseo.client.model.BingPeopleAlsoAskSerpElementItem.class);
                    classByDiscriminatorValue.put("people_also_search", io.github.dataforseo.client.model.BingPeopleAlsoSearchSerpElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseSerpApiElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseSerpApiElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseSerpApiElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("paid", io.github.dataforseo.client.model.PaidSerpElementItem.class);
                    classByDiscriminatorValue.put("organic", io.github.dataforseo.client.model.OrganicSerpElementItem.class);
                    classByDiscriminatorValue.put("featured_snippet", io.github.dataforseo.client.model.FeaturedSnippetSerpElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph", io.github.dataforseo.client.model.KnowledgeGraphSerpElementItem.class);
                    classByDiscriminatorValue.put("top_stories", io.github.dataforseo.client.model.TopStoriesSerpElementItem.class);
                    classByDiscriminatorValue.put("people_also_ask", io.github.dataforseo.client.model.PeopleAlsoAskSerpElementItem.class);
                    classByDiscriminatorValue.put("people_also_search", io.github.dataforseo.client.model.PeopleAlsoSearchSerpElementItem.class);
                    classByDiscriminatorValue.put("images", io.github.dataforseo.client.model.ImagesSerpElementItem.class);
                    classByDiscriminatorValue.put("twitter", io.github.dataforseo.client.model.TwitterSerpElementItem.class);
                    classByDiscriminatorValue.put("google_reviews", io.github.dataforseo.client.model.GoogleReviewsSerpElementItem.class);
                    classByDiscriminatorValue.put("jobs", io.github.dataforseo.client.model.JobsSerpElementItem.class);
                    classByDiscriminatorValue.put("map", io.github.dataforseo.client.model.MapSerpElementItem.class);
                    classByDiscriminatorValue.put("app", io.github.dataforseo.client.model.AppSerpElementItem.class);
                    classByDiscriminatorValue.put("local_pack", io.github.dataforseo.client.model.LocalPackSerpElementItem.class);
                    classByDiscriminatorValue.put("carousel", io.github.dataforseo.client.model.CarouselSerpElementItem.class);
                    classByDiscriminatorValue.put("video", io.github.dataforseo.client.model.VideoSerpElementItem.class);
                    classByDiscriminatorValue.put("answer_box", io.github.dataforseo.client.model.AnswerBoxSerpElementItem.class);
                    classByDiscriminatorValue.put("shopping", io.github.dataforseo.client.model.ShoppingSerpElementItem.class);
                    classByDiscriminatorValue.put("google_flights", io.github.dataforseo.client.model.GoogleFlightsSerpElementItem.class);
                    classByDiscriminatorValue.put("mention_carousel", io.github.dataforseo.client.model.MentionCarouselSerpElementItem.class);
                    classByDiscriminatorValue.put("events", io.github.dataforseo.client.model.EventsSerpElementItem.class);
                    classByDiscriminatorValue.put("related_searches", io.github.dataforseo.client.model.RelatedSearchesSerpElementItem.class);
                    classByDiscriminatorValue.put("multi_carousel", io.github.dataforseo.client.model.MultiCarouselSerpElementItem.class);
                    classByDiscriminatorValue.put("recipes", io.github.dataforseo.client.model.RecipesSerpElementItem.class);
                    classByDiscriminatorValue.put("top_sights", io.github.dataforseo.client.model.TopSightsSerpElementItem.class);
                    classByDiscriminatorValue.put("scholarly_articles", io.github.dataforseo.client.model.ScholarlyArticlesSerpElementItem.class);
                    classByDiscriminatorValue.put("popular_products", io.github.dataforseo.client.model.PopularProductsSerpElementItem.class);
                    classByDiscriminatorValue.put("podcasts", io.github.dataforseo.client.model.PodcastsSerpElementItem.class);
                    classByDiscriminatorValue.put("stocks_box", io.github.dataforseo.client.model.StocksBoxSerpElementItem.class);
                    classByDiscriminatorValue.put("find_results_on", io.github.dataforseo.client.model.FindResultsOnSerpElementItem.class);
                    classByDiscriminatorValue.put("questions_and_answers", io.github.dataforseo.client.model.QuestionsAndAnswersSerpElementItem.class);
                    classByDiscriminatorValue.put("hotels_pack", io.github.dataforseo.client.model.HotelsPackSerpElementItem.class);
                    classByDiscriminatorValue.put("visual_stories", io.github.dataforseo.client.model.VisualStoriesSerpElementItem.class);
                    classByDiscriminatorValue.put("commercial_units", io.github.dataforseo.client.model.CommercialUnitsSerpElementItem.class);
                    classByDiscriminatorValue.put("local_services", io.github.dataforseo.client.model.LocalServicesSerpElementItem.class);
                    classByDiscriminatorValue.put("google_hotels", io.github.dataforseo.client.model.GoogleHotelsSerpElementItem.class);
                    classByDiscriminatorValue.put("math_solver", io.github.dataforseo.client.model.MathSolverSerpElementItem.class);
                    classByDiscriminatorValue.put("currency_box", io.github.dataforseo.client.model.CurrencyBoxSerpElementItem.class);
                    classByDiscriminatorValue.put("google_posts", io.github.dataforseo.client.model.GooglePostsSerpElementItem.class);
                    classByDiscriminatorValue.put("product_considerations", io.github.dataforseo.client.model.ProductConsiderationsSerpElementItem.class);
                    classByDiscriminatorValue.put("found_on_web", io.github.dataforseo.client.model.FoundOnWebSerpElementItem.class);
                    classByDiscriminatorValue.put("short_videos", io.github.dataforseo.client.model.ShortVideosSerpElementItem.class);
                    classByDiscriminatorValue.put("refine_products", io.github.dataforseo.client.model.RefineProductsSerpElementItem.class);
                    classByDiscriminatorValue.put("explore_brands", io.github.dataforseo.client.model.ExploreBrandsSerpElementItem.class);
                    classByDiscriminatorValue.put("perspectives", io.github.dataforseo.client.model.PerspectivesSerpElementItem.class);
                    classByDiscriminatorValue.put("discussions_and_forums", io.github.dataforseo.client.model.DiscussionsAndForumsSerpElementItem.class);
                    classByDiscriminatorValue.put("compare_sites", io.github.dataforseo.client.model.CompareSitesSerpElementItem.class);
                    classByDiscriminatorValue.put("courses", io.github.dataforseo.client.model.CoursesSerpElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_carousel_item", io.github.dataforseo.client.model.KnowledgeGraphCarouselItemSerpElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_description_item", io.github.dataforseo.client.model.KnowledgeGraphDescriptionItemSerpElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_images_item", io.github.dataforseo.client.model.KnowledgeGraphImagesItemSerpElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_list_item", io.github.dataforseo.client.model.KnowledgeGraphListItemSerpElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_row_item", io.github.dataforseo.client.model.KnowledgeGraphRowItemSerpElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_hotels_booking_item", io.github.dataforseo.client.model.KnowledgeGraphHotelsBookingItemSerpElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_expanded_item", io.github.dataforseo.client.model.KnowledgeGraphExpandedItemSerpElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_part_item", io.github.dataforseo.client.model.KnowledgeGraphPartItemSerpElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_shopping_item", io.github.dataforseo.client.model.KnowledgeGraphShoppingItemSerpElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_ai_overview_item", io.github.dataforseo.client.model.KnowledgeGraphAiOverviewItemSerpElementItem.class);
                    classByDiscriminatorValue.put("ai_overview", io.github.dataforseo.client.model.AiOverviewSerpElementItem.class);
                    classByDiscriminatorValue.put("third_party_reviews", io.github.dataforseo.client.model.ThirdPartyReviewsSerpElementItem.class);
                    classByDiscriminatorValue.put("dictionary", io.github.dataforseo.client.model.DictionarySerpElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseSerpApiKnowledgeGraphElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseSerpApiKnowledgeGraphElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseSerpApiKnowledgeGraphElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("knowledge_graph_carousel_item", io.github.dataforseo.client.model.SerpApiKnowledgeGraphCarouselItemElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_description_item", io.github.dataforseo.client.model.SerpApiKnowledgeGraphDescriptionItemElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_images_item", io.github.dataforseo.client.model.SerpApiKnowledgeGraphImagesItemElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_list_item", io.github.dataforseo.client.model.SerpApiKnowledgeGraphListItemElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_row_item", io.github.dataforseo.client.model.SerpApiKnowledgeGraphRowItemElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_expanded_item", io.github.dataforseo.client.model.SerpApiKnowledgeGraphExpandedItemElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_part_item", io.github.dataforseo.client.model.SerpApiKnowledgeGraphPartItemElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_shopping_item", io.github.dataforseo.client.model.SerpApiKnowledgeGraphShoppingItemElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_hotels_booking_item", io.github.dataforseo.client.model.SerpApiKnowledgeGraphHotelsBookingItemElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_ai_overview_item", io.github.dataforseo.client.model.SerpApiKnowledgeGraphAiOverviewItemElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseSerpApiProductConsiderationExpandedElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseSerpApiProductConsiderationExpandedElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseSerpApiProductConsiderationExpandedElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("product_considerations_expanded_element", io.github.dataforseo.client.model.SerpApiProductConsiderationsExpandedElementItem.class);
                    classByDiscriminatorValue.put("product_considerations_ai_overview_expanded_element", io.github.dataforseo.client.model.SerpApiProductConsiderationsAiOverviewExpandedElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseSerpApiBingPeopleAlsoAskExpandedElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseSerpApiBingPeopleAlsoAskExpandedElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseSerpApiBingPeopleAlsoAskExpandedElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("people_also_ask_expanded_element", io.github.dataforseo.client.model.SerpApiBingPeopleAlsoAskExpandedElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseSerpApiPeopleAlsoAskExpandedElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseSerpApiPeopleAlsoAskExpandedElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseSerpApiPeopleAlsoAskExpandedElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("people_also_ask_expanded_element", io.github.dataforseo.client.model.SerpApiPeopleAlsoAskExpandedElementItem.class);
                    classByDiscriminatorValue.put("people_also_ask_ai_overview_expanded_element", io.github.dataforseo.client.model.SerpApiPeopleAlsoAskAiOverviewExpandedElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseSerpApiBingAiOverviewElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseSerpApiBingAiOverviewElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseSerpApiBingAiOverviewElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("ai_overview_element", io.github.dataforseo.client.model.SerpApiBingAiOverviewElementItem.class);
                    classByDiscriminatorValue.put("ai_overview_video_element", io.github.dataforseo.client.model.SerpApiBingAiOverviewVideoElementItem.class);
                    classByDiscriminatorValue.put("ai_overview_videos_element", io.github.dataforseo.client.model.SerpApiBingAiOverviewVideosElementItem.class);
                    classByDiscriminatorValue.put("ai_overview_images_element", io.github.dataforseo.client.model.SerpApiBingAiOverviewImagesElementItem.class);
                    classByDiscriminatorValue.put("ai_overview_organic_element", io.github.dataforseo.client.model.SerpApiBingAiOverviewOrganicElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseSerpApiAiOverviewElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseSerpApiAiOverviewElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseSerpApiAiOverviewElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("ai_overview_element", io.github.dataforseo.client.model.SerpApiAiOverviewElementItem.class);
                    classByDiscriminatorValue.put("ai_overview_expanded_element", io.github.dataforseo.client.model.SerpApiAiOverviewExpandedElementItem.class);
                    classByDiscriminatorValue.put("ai_overview_video_element", io.github.dataforseo.client.model.SerpApiAiOverviewVideoElementItem.class);
                    classByDiscriminatorValue.put("ai_overview_table_element", io.github.dataforseo.client.model.SerpApiAiOverviewTableElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseSerpApiGoogleMapsElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseSerpApiGoogleMapsElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseSerpApiGoogleMapsElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("maps_search", io.github.dataforseo.client.model.SerpApiMapsSearchElementItem.class);
                    classByDiscriminatorValue.put("maps_paid_item", io.github.dataforseo.client.model.SerpApiMapsPaidItemElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseSerpApiAiModeAiOverviewElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseSerpApiAiModeAiOverviewElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseSerpApiAiModeAiOverviewElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("ai_overview_element", io.github.dataforseo.client.model.SerpApiAiModeAiOverviewElementItem.class);
                    classByDiscriminatorValue.put("ai_overview_expanded_element", io.github.dataforseo.client.model.SerpApiAiModeAiOverviewExpandedElementItem.class);
                    classByDiscriminatorValue.put("ai_overview_video_element", io.github.dataforseo.client.model.SerpApiAiModeAiOverviewVideoElementItem.class);
                    classByDiscriminatorValue.put("ai_overview_table_element", io.github.dataforseo.client.model.SerpApiAiModeAiOverviewTableElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseSerpApiGoogleNewsElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseSerpApiGoogleNewsElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseSerpApiGoogleNewsElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("news_search", io.github.dataforseo.client.model.SerpApiGoogleNewsNewsSearchElementItem.class);
                    classByDiscriminatorValue.put("top_stories", io.github.dataforseo.client.model.SerpApiGoogleNewsTopStoriesElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseSerpApiGoogleImagesElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseSerpApiGoogleImagesElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseSerpApiGoogleImagesElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("carousel", io.github.dataforseo.client.model.SerpApiGoogleImagesCarouselElementItem.class);
                    classByDiscriminatorValue.put("images_search", io.github.dataforseo.client.model.SerpApiGoogleImagesImagesSearchElementItem.class);
                    classByDiscriminatorValue.put("related_searches", io.github.dataforseo.client.model.SerpApiGoogleImagesRelatedSearchesElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseSerpApiAdsAdvertiserElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseSerpApiAdsAdvertiserElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseSerpApiAdsAdvertiserElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("ads_multi_account_advertiser", io.github.dataforseo.client.model.SerpApiAdsMultiAccountAdvertiserElementItem.class);
                    classByDiscriminatorValue.put("ads_advertiser", io.github.dataforseo.client.model.SerpApiAdsAdvertiserElementItem.class);
                    classByDiscriminatorValue.put("ads_domain", io.github.dataforseo.client.model.SerpApiAdsDomainElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseSerpApiGoogleSearchByImagesElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseSerpApiGoogleSearchByImagesElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseSerpApiGoogleSearchByImagesElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("organic", io.github.dataforseo.client.model.SerpApiGoogleSearchByImagesOrganicElementItem.class);
                    classByDiscriminatorValue.put("images", io.github.dataforseo.client.model.SerpApiGoogleSearchByImagesImagesElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseSerpApiGoogleFinanceElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseSerpApiGoogleFinanceElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseSerpApiGoogleFinanceElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("google_finance_asset_pair_element", io.github.dataforseo.client.model.SerpApiGoogleFinanceAssetPairElementElementItem.class);
                    classByDiscriminatorValue.put("google_finance_market_index_element", io.github.dataforseo.client.model.SerpApiGoogleFinanceMarketIndexElementElementItem.class);
                    classByDiscriminatorValue.put("google_finance_market_instrument_element", io.github.dataforseo.client.model.SerpApiGoogleFinanceMarketInstrumentElementElementItem.class);
                    classByDiscriminatorValue.put("google_finance_hero_groups", io.github.dataforseo.client.model.SerpApiGoogleFinanceHeroGroupsElementItem.class);
                    classByDiscriminatorValue.put("google_finance_interested", io.github.dataforseo.client.model.SerpApiGoogleFinanceInterestedElementItem.class);
                    classByDiscriminatorValue.put("google_finance_news", io.github.dataforseo.client.model.SerpApiGoogleFinanceNewsElementItem.class);
                    classByDiscriminatorValue.put("google_finance_earnings_calendar", io.github.dataforseo.client.model.SerpApiGoogleFinanceEarningsCalendarElementItem.class);
                    classByDiscriminatorValue.put("google_finance_most_followed", io.github.dataforseo.client.model.SerpApiGoogleFinanceMostFollowedElementItem.class);
                    classByDiscriminatorValue.put("google_finance_market_trends", io.github.dataforseo.client.model.SerpApiGoogleFinanceMarketTrendsElementItem.class);
                    classByDiscriminatorValue.put("google_finance_people_also_search", io.github.dataforseo.client.model.SerpApiGoogleFinancePeopleAlsoSearchElementItem.class);
                    classByDiscriminatorValue.put("google_finance_explore_market_trends", io.github.dataforseo.client.model.SerpApiGoogleFinanceExploreMarketTrendsElementItem.class);
                    classByDiscriminatorValue.put("google_finance_quote", io.github.dataforseo.client.model.SerpApiGoogleFinanceQuoteElementItem.class);
                    classByDiscriminatorValue.put("google_finance_compare_to", io.github.dataforseo.client.model.SerpApiGoogleFinanceCompareToElementItem.class);
                    classByDiscriminatorValue.put("google_finance_financial", io.github.dataforseo.client.model.SerpApiGoogleFinanceFinancialElementItem.class);
                    classByDiscriminatorValue.put("google_finance_futures_chain", io.github.dataforseo.client.model.SerpApiGoogleFinanceFuturesChainElementItem.class);
                    classByDiscriminatorValue.put("google_finance_details", io.github.dataforseo.client.model.SerpApiGoogleFinanceDetailsElementItem.class);
                    classByDiscriminatorValue.put("google_finance_about", io.github.dataforseo.client.model.SerpApiGoogleFinanceAboutElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseSerpApiGoogleFinanceTickerSearchElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseSerpApiGoogleFinanceTickerSearchElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseSerpApiGoogleFinanceTickerSearchElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("google_finance_asset_pair", io.github.dataforseo.client.model.SerpApiGoogleFinanceAssetPairElementItem.class);
                    classByDiscriminatorValue.put("google_finance_market_instrument", io.github.dataforseo.client.model.SerpApiGoogleFinanceMarketInstrumentElementItem.class);
                    classByDiscriminatorValue.put("google_finance_market_index", io.github.dataforseo.client.model.SerpApiGoogleFinanceMarketIndexElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseDataforseoLabsApiElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseDataforseoLabsApiElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseDataforseoLabsApiElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("featured_snippet", io.github.dataforseo.client.model.DataLabsFeaturedSnippetSerpElementItem.class);
                    classByDiscriminatorValue.put("paid", io.github.dataforseo.client.model.DataLabsPaidSerpElementItem.class);
                    classByDiscriminatorValue.put("organic", io.github.dataforseo.client.model.DataLabsOrganicSerpElementItem.class);
                    classByDiscriminatorValue.put("local_pack", io.github.dataforseo.client.model.DataLabsLocalPackSerpElementItem.class);
                    classByDiscriminatorValue.put("answer_box", io.github.dataforseo.client.model.DataLabsAnswerBoxSerpElementItem.class);
                    classByDiscriminatorValue.put("carousel", io.github.dataforseo.client.model.DataLabsCarouselSerpElementItem.class);
                    classByDiscriminatorValue.put("multi_carousel", io.github.dataforseo.client.model.DataLabsMultiCarouselSerpElementItem.class);
                    classByDiscriminatorValue.put("google_flights", io.github.dataforseo.client.model.DataLabsGoogleFlightsSerpElementItem.class);
                    classByDiscriminatorValue.put("google_reviews", io.github.dataforseo.client.model.DataLabsGoogleReviewsSerpElementItem.class);
                    classByDiscriminatorValue.put("google_posts", io.github.dataforseo.client.model.DataLabsGooglePostsSerpElementItem.class);
                    classByDiscriminatorValue.put("images", io.github.dataforseo.client.model.DataLabsImagesSerpElementItem.class);
                    classByDiscriminatorValue.put("jobs", io.github.dataforseo.client.model.DataLabsJobsSerpElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph", io.github.dataforseo.client.model.DataLabsKnowledgeGraphSerpElementItem.class);
                    classByDiscriminatorValue.put("hotels_pack", io.github.dataforseo.client.model.DataLabsHotelsPackSerpElementItem.class);
                    classByDiscriminatorValue.put("map", io.github.dataforseo.client.model.DataLabsMapSerpElementItem.class);
                    classByDiscriminatorValue.put("people_also_ask", io.github.dataforseo.client.model.DataLabsPeopleAlsoAskSerpElementItem.class);
                    classByDiscriminatorValue.put("related_searches", io.github.dataforseo.client.model.DataLabsRelatedSearchesSerpElementItem.class);
                    classByDiscriminatorValue.put("people_also_search", io.github.dataforseo.client.model.DataLabsPeopleAlsoSearchSerpElementItem.class);
                    classByDiscriminatorValue.put("shopping", io.github.dataforseo.client.model.DataLabsShoppingSerpElementItem.class);
                    classByDiscriminatorValue.put("top_stories", io.github.dataforseo.client.model.DataLabsTopStoriesSerpElementItem.class);
                    classByDiscriminatorValue.put("twitter", io.github.dataforseo.client.model.DataLabsTwitterSerpElementItem.class);
                    classByDiscriminatorValue.put("video", io.github.dataforseo.client.model.DataLabsVideoSerpElementItem.class);
                    classByDiscriminatorValue.put("events", io.github.dataforseo.client.model.DataLabsEventsSerpElementItem.class);
                    classByDiscriminatorValue.put("mention_carousel", io.github.dataforseo.client.model.DataLabsMentionCarouselSerpElementItem.class);
                    classByDiscriminatorValue.put("recipes", io.github.dataforseo.client.model.DataLabsRecipesSerpElementItem.class);
                    classByDiscriminatorValue.put("top_sights", io.github.dataforseo.client.model.DataLabsTopSightsSerpElementItem.class);
                    classByDiscriminatorValue.put("scholarly_articles", io.github.dataforseo.client.model.DataLabsScholarlyArticlesSerpElementItem.class);
                    classByDiscriminatorValue.put("popular_products", io.github.dataforseo.client.model.DataLabsPopularProductsSerpElementItem.class);
                    classByDiscriminatorValue.put("podcasts", io.github.dataforseo.client.model.DataLabsPodcastsSerpElementItem.class);
                    classByDiscriminatorValue.put("questions_and_answers", io.github.dataforseo.client.model.DataLabsQuestionsAndAnswersSerpElementItem.class);
                    classByDiscriminatorValue.put("find_results_on", io.github.dataforseo.client.model.DataLabsFindResultsOnSerpElementItem.class);
                    classByDiscriminatorValue.put("stocks_box", io.github.dataforseo.client.model.DataLabsStocksBoxSerpElementItem.class);
                    classByDiscriminatorValue.put("commercial_units", io.github.dataforseo.client.model.DataLabsCommercialUnitsSerpElementItem.class);
                    classByDiscriminatorValue.put("local_services", io.github.dataforseo.client.model.DataLabsLocalServicesSerpElementItem.class);
                    classByDiscriminatorValue.put("google_hotels", io.github.dataforseo.client.model.DataLabsGoogleHotelsSerpElementItem.class);
                    classByDiscriminatorValue.put("math_solver", io.github.dataforseo.client.model.DataLabsMathSolverSerpElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseDataforseoLabsKnowledgeGraphElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseDataforseoLabsKnowledgeGraphElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseDataforseoLabsKnowledgeGraphElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("knowledge_graph_images_item", io.github.dataforseo.client.model.DataforseoLabsKnowledgeGraphImagesItemElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_carousel_item", io.github.dataforseo.client.model.DataforseoLabsKnowledgeGraphCarouselItemElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_description_item", io.github.dataforseo.client.model.DataforseoLabsKnowledgeGraphDescriptionItemElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_list_item", io.github.dataforseo.client.model.DataforseoLabsKnowledgeGraphListItemElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_part_item", io.github.dataforseo.client.model.DataforseoLabsKnowledgeGraphPartItemElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_expanded_item", io.github.dataforseo.client.model.DataforseoLabsKnowledgeGraphExpandedItemElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_row_item", io.github.dataforseo.client.model.DataforseoLabsKnowledgeGraphRowItemElementItem.class);
                    classByDiscriminatorValue.put("knowledge_graph_shopping_item", io.github.dataforseo.client.model.DataforseoLabsKnowledgeGraphShoppingItemElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseMerchantAmazonElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseMerchantAmazonElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseMerchantAmazonElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("amazon_paid", io.github.dataforseo.client.model.MerchantAmazonPaidSerpElementItem.class);
                    classByDiscriminatorValue.put("amazon_serp", io.github.dataforseo.client.model.MerchantAmazonSerpSerpElementItem.class);
                    classByDiscriminatorValue.put("editorial_recommendations", io.github.dataforseo.client.model.MerchantEditorialRecommendationsSerpElementItem.class);
                    classByDiscriminatorValue.put("related_searches", io.github.dataforseo.client.model.MerchantRelatedSearchesSerpElementItem.class);
                    classByDiscriminatorValue.put("top_rated_from_our_brands", io.github.dataforseo.client.model.MerchantTopRatedFromOurBrandsSerpElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseMerchantAmazonSellersElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseMerchantAmazonSellersElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseMerchantAmazonSellersElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("amazon_seller_main_item", io.github.dataforseo.client.model.MerchantAmazonSellerMainItemSerpElementItem.class);
                    classByDiscriminatorValue.put("amazon_seller_item", io.github.dataforseo.client.model.MerchantAmazonSellerItemSerpElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseMerchantAmazonProductInformationElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseMerchantAmazonProductInformationElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseMerchantAmazonProductInformationElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("product_information_details_item", io.github.dataforseo.client.model.ProductInformationProductInformationDetailsItem.class);
                    classByDiscriminatorValue.put("product_information_text_item", io.github.dataforseo.client.model.ProductInformationProductInformationTextItem.class);
                    classByDiscriminatorValue.put("product_information_extended_item", io.github.dataforseo.client.model.ProductInformationProductInformationExtendedItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseMerchantAmazonProductInformationRowElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseMerchantAmazonProductInformationRowElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseMerchantAmazonProductInformationRowElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("product_information_image_row", io.github.dataforseo.client.model.ProductInformationRowProductInformationImageRowElementItem.class);
                    classByDiscriminatorValue.put("product_information_text_row", io.github.dataforseo.client.model.ProductInformationRowProductInformationTextRowElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseMerchantGoogleShoppingSellersElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseMerchantGoogleShoppingSellersElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseMerchantGoogleShoppingSellersElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("shops_list", io.github.dataforseo.client.model.GoogleShoppingSellersShopsListElementItem.class);
                    classByDiscriminatorValue.put("buy_on_google", io.github.dataforseo.client.model.GoogleShoppingSellersBuyOnGoogleElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseMerchantGoogleShoppingProductsElementItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseMerchantGoogleShoppingProductsElementItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseMerchantGoogleShoppingProductsElementItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("google_shopping_serp", io.github.dataforseo.client.model.GoogleShoppingSerpElementItem.class);
                    classByDiscriminatorValue.put("google_shopping_paid", io.github.dataforseo.client.model.GoogleShoppingPaidElementItem.class);
                    classByDiscriminatorValue.put("google_shopping_sponsored_carousel", io.github.dataforseo.client.model.GoogleShoppingSponsoredCarouselElementItem.class);
                    classByDiscriminatorValue.put("related_searches", io.github.dataforseo.client.model.RelatedSearchesElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseOnPageResourceItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseOnPageResourceItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseOnPageResourceItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("html", io.github.dataforseo.client.model.OnPageHtmlResourceItem.class);
                    classByDiscriminatorValue.put("broken", io.github.dataforseo.client.model.OnPageBrokenResourceItem.class);
                    classByDiscriminatorValue.put("redirect", io.github.dataforseo.client.model.OnPageRedirectResourceItem.class);
                    classByDiscriminatorValue.put("script", io.github.dataforseo.client.model.OnPageScriptResourceItem.class);
                    classByDiscriminatorValue.put("image", io.github.dataforseo.client.model.OnPageImageResourceItem.class);
                    classByDiscriminatorValue.put("stylesheet", io.github.dataforseo.client.model.OnPageStylesheetResourceItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "resource_type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseOnPageLinkItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseOnPageLinkItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseOnPageLinkItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("anchor", io.github.dataforseo.client.model.OnPageAnchorLinkItem.class);
                    classByDiscriminatorValue.put("image", io.github.dataforseo.client.model.OnPageImageLinkItem.class);
                    classByDiscriminatorValue.put("canonical", io.github.dataforseo.client.model.OnPageCanonicalLinkItem.class);
                    classByDiscriminatorValue.put("alternate", io.github.dataforseo.client.model.OnPageAlternateLinkItem.class);
                    classByDiscriminatorValue.put("link", io.github.dataforseo.client.model.OnPageLinkLinkItem.class);
                    classByDiscriminatorValue.put("redirect", io.github.dataforseo.client.model.OnPageRedirectLinkItem.class);
                    classByDiscriminatorValue.put("meta", io.github.dataforseo.client.model.OnPageMetaLinkItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseKeywordDataDataforseoTrendsItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseKeywordDataDataforseoTrendsItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseKeywordDataDataforseoTrendsItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("dataforseo_trends_graph", io.github.dataforseo.client.model.DataforseoTrendsDataforseoTrendsGraphElementItem.class);
                    classByDiscriminatorValue.put("subregion_interests", io.github.dataforseo.client.model.DataforseoTrendsSubregionInterestsElementItem.class);
                    classByDiscriminatorValue.put("demography", io.github.dataforseo.client.model.DataforseoTrendsDemographyElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseKeywordDataGoogleTrendsItem.class, new TypeSelector<io.github.dataforseo.client.model.BaseKeywordDataGoogleTrendsItem>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseKeywordDataGoogleTrendsItem> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("google_trends_graph", io.github.dataforseo.client.model.GoogleTrendsGoogleTrendsGraphElementItem.class);
                    classByDiscriminatorValue.put("google_trends_map", io.github.dataforseo.client.model.GoogleTrendsGoogleTrendsMapElementItem.class);
                    classByDiscriminatorValue.put("google_trends_queries_list", io.github.dataforseo.client.model.GoogleTrendsGoogleTrendsQueriesListElementItem.class);
                    classByDiscriminatorValue.put("google_trends_topics_list", io.github.dataforseo.client.model.GoogleTrendsGoogleTrendsTopicsListElementItem.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
            .registerTypeSelector(io.github.dataforseo.client.model.BaseLocalBusinessLink.class, new TypeSelector<io.github.dataforseo.client.model.BaseLocalBusinessLink>() {
                @Override
                public Class<? extends io.github.dataforseo.client.model.BaseLocalBusinessLink> getClassForElement(JsonElement readElement) {
                    Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                    classByDiscriminatorValue.put("reservation", io.github.dataforseo.client.model.LocalBusinessReservationLink.class);
                    classByDiscriminatorValue.put("order", io.github.dataforseo.client.model.LocalBusinessOrderLink.class);
                    classByDiscriminatorValue.put("menu", io.github.dataforseo.client.model.LocalBusinessMenuLink.class);
                    return getClassByDiscriminator(classByDiscriminatorValue,
                            getDiscriminatorValue(readElement, "type"));
                }
            })
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    static {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.LlmMessageChainItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DemographyComparisonInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ResourceMetaInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.VideoElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.RatingElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.RefinementChipsInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.RefinementChipsElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.LicensesElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ReviewResponseItemInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.WorkDayInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.TimeInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PopularWorkTimeInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AboutThisResultElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiModeRectangleInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.CrawlStatusInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.RelatedSearchesElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.LinkElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AmazonDeliveryInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.Table.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AmazonKeywordData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AmazonKeywordInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PriceInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.RatingInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SocialMetricsInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.TopDomainInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisCategoriesInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SpellInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.TechnologiesInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AuthorsElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MessageInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ClickstreamKeywordInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.LocalBusinessReservationLink.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.LocalBusinessOrderLink.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.LocalBusinessDeliveryServiceInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.LocalBusinessMenuLink.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BaseResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BaseResponseTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SectionContentItemInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordInfoNormalizedWithInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MonthlySearchesInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentUrlInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.TableContentInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.TableContentItemInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.RowCellInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentRatingInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentOfferInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentCommentInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpIdListRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpIdListResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpIdListTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpIdListResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpErrorsRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpErrorsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpErrorsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpErrorsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpScreenshotRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ScreenshotItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpScreenshotResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpScreenshotTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpScreenshotResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpAiSummaryRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpAiSummaryItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpAiSummaryResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpAiSummaryTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpAiSummaryResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocationsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocationsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocationsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocationsCountryResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocationsCountryTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocationsCountryResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicTasksFixedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicTasksFixedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicTasksFixedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PaidSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OrganicSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.FeaturedSnippetSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicTaskGetRegularResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicTaskGetRegularTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicTaskGetRegularResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KnowledgeGraphListElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiKnowledgeGraphCarouselItemElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiKnowledgeGraphDescriptionItemElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KnowledgeGraphImagesElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiKnowledgeGraphImagesItemElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiKnowledgeGraphListItemElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiKnowledgeGraphRowItemElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiModeImagesElementInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KnowledgeGraphExpandedElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiKnowledgeGraphExpandedItemElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiKnowledgeGraphPartItemElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KnowledgeGraphShoppingElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiKnowledgeGraphShoppingItemElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KnowledgeGraphHotelsBookingElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiKnowledgeGraphHotelsBookingItemElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiModeAiOverviewReferenceInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiAiOverviewElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOverviewExpandedComponent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiAiOverviewExpandedElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiAiOverviewVideoElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiAiOverviewTableElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiKnowledgeGraphAiOverviewItemElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KnowledgeGraphSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AdLinkElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.FaqBoxElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.FaqBox.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.RelatedResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.TopStoriesElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.TopStoriesSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiPeopleAlsoAskExpandedElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiPeopleAlsoAskAiOverviewExpandedElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PeopleAlsoAskElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PeopleAlsoAskSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PeopleAlsoSearchSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.RelatedImageSearchesElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ImagesSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.TwitterElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.TwitterSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleReviewsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.JobsElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.JobsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MapSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.LocalPackSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiCarouselElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.CarouselSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.VideoSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AnswerBoxSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ShoppingElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ShoppingSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleFlightsElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleFlightsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MentionCarouselElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MentionCarouselSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.EventsElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.EventsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.RelatedSearchesSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MultiCarouselElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MultiCarouselSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.RecipesElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.RecipesSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.TopSightsElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.TopSightsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ScholarlyArticlesElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ScholarlyArticlesSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PopularProductsElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PopularProductsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PodcastsElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PodcastsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GraphElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.Graph.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.StocksBoxSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.FindResultsOnElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.FindResultsOnSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.QuestionsAndAnswersElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.QuestionsAndAnswersSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.HotelsPackElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.HotelsPackSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.VisualStoriesSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.CommercialUnitsElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.CommercialUnitsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.LocalServicesElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.LocalServicesSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleHotelsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MathSolverExpandedElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MathSolverElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MathSolverSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.CurrencyBoxSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GooglePostsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiProductConsiderationsExpandedElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOverviewElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiProductConsiderationsAiOverviewExpandedElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ProductConsiderationsElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ProductConsiderationsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.FoundOnWebElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.FoundOnWebSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ShortVideosElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ShortVideosSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.RefineProductsElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.RefineProductsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ExploreBrandsElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ExploreBrandsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PerspectivesElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PerspectivesSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DiscussionsAndForumsElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DiscussionsAndForumsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.CompareSitesElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.CompareSitesSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.CoursesElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.CoursesSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KnowledgeGraphCarouselItemSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KnowledgeGraphDescriptionItemSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KnowledgeGraphImagesItemSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KnowledgeGraphListItemSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KnowledgeGraphRowItemSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KnowledgeGraphHotelsBookingItemSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KnowledgeGraphExpandedItemSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KnowledgeGraphPartItemSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KnowledgeGraphShoppingItemSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KnowledgeGraphAiOverviewItemSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOverviewSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ThirdPartyReviewsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.HtmlItemInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicLiveRegularRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicLiveRegularResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicLiveRegularTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicLiveRegularResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicLiveAdvancedRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicLiveAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicLiveAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicLiveAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicLiveHtmlRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicLiveHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicLiveHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleOrganicLiveHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeTasksFixedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeTasksFixedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeTasksFixedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiModeLinkElementInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiAiModeAiOverviewElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiModeAiOverviewExpandedComponentInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiAiModeAiOverviewExpandedElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiAiModeAiOverviewVideoElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiModeTableInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiAiModeAiOverviewTableElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiModeAiOverviewInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeLiveAdvancedRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeLiveAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeLiveAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeLiveAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeLiveHtmlRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeLiveHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeLiveHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAiModeLiveHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleMapsTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleMapsTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleMapsTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleMapsTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleMapsTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleMapsTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleMapsTasksFixedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleMapsTasksFixedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleMapsTasksFixedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AddressInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.WorkHours.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.LocalJustificationInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiMapsSearchElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiMapsPaidItemElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleMapsTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleMapsTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleMapsTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleMapsLiveAdvancedRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleMapsLiveAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleMapsLiveAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleMapsLiveAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocalFinderTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocalFinderTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocalFinderTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocalFinderTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocalFinderTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocalFinderTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocalFinderTasksFixedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocalFinderTasksFixedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocalFinderTasksFixedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocalFinderTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocalFinderTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocalFinderTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocalFinderTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocalFinderTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocalFinderTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocalFinderLiveAdvancedRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocalFinderLiveAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocalFinderLiveAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocalFinderLiveAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocalFinderLiveHtmlRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocalFinderLiveHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocalFinderLiveHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleLocalFinderLiveHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleNewsTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleNewsTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleNewsTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleNewsTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleNewsTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleNewsTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleNewsTasksFixedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleNewsTasksFixedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleNewsTasksFixedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleNewsNewsSearchElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleNewsTopStoriesElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleNewsTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleNewsTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleNewsTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleNewsTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleNewsTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleNewsTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleNewsLiveAdvancedRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleNewsLiveAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleNewsLiveAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleNewsLiveAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleNewsLiveHtmlRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleNewsLiveHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleNewsLiveHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleNewsLiveHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleEventsTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleEventsTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleEventsTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleEventsTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleEventsTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleEventsTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleEventsTasksFixedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleEventsTasksFixedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleEventsTasksFixedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.EventDates.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.LocationInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.EventItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleEventsTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleEventsTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleEventsTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleEventsLiveAdvancedRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleEventsLiveAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleEventsLiveAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleEventsLiveAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleImagesTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleImagesTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleImagesTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleImagesTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleImagesTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleImagesTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleImagesTasksFixedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleImagesTasksFixedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleImagesTasksFixedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleImagesCarouselElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleImagesImagesSearchElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleImagesRelatedSearchesElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleImagesTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleImagesTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleImagesTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleImagesTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleImagesTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleImagesTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleImagesLiveAdvancedRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleImagesLiveAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleImagesLiveAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleImagesLiveAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleImagesLiveHtmlRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleImagesLiveHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleImagesLiveHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleImagesLiveHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleSearchByImageTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleSearchByImageTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleSearchByImageTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleSearchByImageTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleSearchByImageTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleSearchByImageTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleSearchByImageTasksFixedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleSearchByImageTasksFixedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleSearchByImageTasksFixedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleSearchByImagesOrganicElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleSearchByImagesImagesElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleSearchByImageTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleSearchByImageTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleSearchByImageTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleJobsTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleJobsTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleJobsTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleJobsTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleJobsTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleJobsTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleJobsTasksFixedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleJobsTasksFixedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleJobsTasksFixedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleJobsItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleJobsTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleJobsTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleJobsTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleJobsTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleJobsTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleJobsTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAutocompleteTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAutocompleteTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAutocompleteTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAutocompleteTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAutocompleteTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAutocompleteTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAutocompleteTasksFixedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAutocompleteTasksFixedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAutocompleteTasksFixedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.Autocomplete.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAutocompleteTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAutocompleteTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAutocompleteTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAutocompleteLiveAdvancedRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAutocompleteLiveAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAutocompleteLiveAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAutocompleteLiveAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetSearchTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetSearchTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetSearchTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetSearchTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetSearchTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetSearchTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetSearchTasksFixedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetSearchTasksFixedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetSearchTasksFixedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.FormatsElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PeriodCovered.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DatasetDescription.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.Dataset.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetSearchTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetSearchTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetSearchTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetSearchLiveAdvancedRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetSearchLiveAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetSearchLiveAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetSearchLiveAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetInfoTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetInfoTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetInfoTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetInfoTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetInfoTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetInfoTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetInfoTasksFixedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetInfoTasksFixedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetInfoTasksFixedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetInfoTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetInfoTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetInfoTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetInfoLiveAdvancedRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetInfoLiveAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetInfoLiveAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleDatasetInfoLiveAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsAdvertisersLocationsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsAdvertisersLocationsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsAdvertisersLocationsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsAdvertisersTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsAdvertisersTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsAdvertisersTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsAdvertisersTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsAdvertisersTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsAdvertisersTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.Advertiser.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiAdsMultiAccountAdvertiserElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiAdsAdvertiserElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiAdsDomainElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsAdvertisersTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsAdvertisersTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsAdvertisersTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsSearchLocationsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsSearchLocationsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsSearchLocationsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsSearchTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsSearchTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsSearchTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsSearchTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsSearchTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsSearchTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PreviewImage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AdsSearch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsSearchTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsSearchTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleAdsSearchTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocationsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocationsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocationsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocationsCountryResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocationsCountryTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocationsCountryResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicTasksFixedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicTasksFixedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicTasksFixedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BingOrganicSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BingPaidSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BingFeaturedSnippetSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BingRelatedSearchesSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicTaskGetRegularResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicTaskGetRegularTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicTaskGetRegularResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiBingAiOverviewElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiBingAiOverviewVideoElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiBingAiOverviewVideosElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiBingAiOverviewImagesElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiBingAiOverviewOrganicElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BingAiOverviewSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BingImagesSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BingVideoSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BingShoppingSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BingAnswerBoxSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BingLocalPackSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BingQuestionsAndAnswersSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BingHotelsPackSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BingJobsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BingTopStoriesSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BingCarouselSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BingMapSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BingEventsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BingRecipesSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiBingPeopleAlsoAskExpandedElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BingPeopleAlsoAskSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BingPeopleAlsoSearchSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicLiveRegularRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicLiveRegularResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicLiveRegularTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicLiveRegularResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicLiveAdvancedRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicLiveAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicLiveAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicLiveAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicLiveHtmlRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicLiveHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicLiveHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingOrganicLiveHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocalPackTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocalPackTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocalPackTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocalPackTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocalPackTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocalPackTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocalPackTasksFixedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocalPackTasksFixedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocalPackTasksFixedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocalPackTaskGetRegularResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocalPackTaskGetRegularTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocalPackTaskGetRegularResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocalPackTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocalPackTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocalPackTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocalPackLiveRegularRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocalPackLiveRegularResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocalPackLiveRegularTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocalPackLiveRegularResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocalPackLiveHtmlRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocalPackLiveHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocalPackLiveHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBingLocalPackLiveHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeLocationsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeLocationsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeLocationsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeLocationsCountryResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeLocationsCountryTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeLocationsCountryResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoInfoTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoInfoTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoInfoTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoInfoTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoInfoTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoInfoTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoInfoTasksFixedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoInfoTasksFixedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoInfoTasksFixedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ChannelSubscribersCount.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.Subtitles.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.StreamingQualityElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.YoutubeVideoInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoInfoTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoInfoTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoInfoTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoInfoLiveAdvancedRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoInfoLiveAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoInfoLiveAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoInfoLiveAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoSubtitlesTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoSubtitlesTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoSubtitlesTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoSubtitlesTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoSubtitlesTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoSubtitlesTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoSubtitlesTasksFixedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoSubtitlesTasksFixedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoSubtitlesTasksFixedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.YoutubeSubtitles.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoSubtitlesTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoSubtitlesTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoSubtitlesTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoSubtitlesLiveAdvancedRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoSubtitlesLiveAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoSubtitlesLiveAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoSubtitlesLiveAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoCommentsTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoCommentsTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoCommentsTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoCommentsTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoCommentsTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoCommentsTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoCommentsTasksFixedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoCommentsTasksFixedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoCommentsTasksFixedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.YoutubeComment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoCommentsTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoCommentsTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoCommentsTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoCommentsLiveAdvancedRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoCommentsLiveAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoCommentsLiveAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYoutubeVideoCommentsLiveAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooLocationsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooLocationsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooLocationsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooLocationsCountryResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooLocationsCountryTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooLocationsCountryResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicTasksFixedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicTasksFixedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicTasksFixedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicTaskGetRegularResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicTaskGetRegularTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicTaskGetRegularResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicLiveRegularRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicLiveRegularResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicLiveRegularTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicLiveRegularResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicLiveAdvancedRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicLiveAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicLiveAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicLiveAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicLiveHtmlRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicLiveHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicLiveHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpYahooOrganicLiveHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduLocationsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduLocationsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduLocationsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduLocationsCountryResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduLocationsCountryTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduLocationsCountryResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduOrganicTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduOrganicTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduOrganicTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduOrganicTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduOrganicTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduOrganicTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduOrganicTasksFixedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduOrganicTasksFixedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduOrganicTasksFixedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduOrganicTaskGetRegularResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduOrganicTaskGetRegularTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduOrganicTaskGetRegularResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DictionarySerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduOrganicTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduOrganicTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduOrganicTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduOrganicTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduOrganicTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpBaiduOrganicTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpNaverOrganicTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpNaverOrganicTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpNaverOrganicTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpNaverOrganicTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpNaverOrganicTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpNaverOrganicTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpNaverOrganicTasksFixedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpNaverOrganicTasksFixedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpNaverOrganicTasksFixedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpNaverOrganicTaskGetRegularResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpNaverOrganicTaskGetRegularTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpNaverOrganicTaskGetRegularResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpNaverOrganicTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpNaverOrganicTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpNaverOrganicTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpNaverOrganicTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpNaverOrganicTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpNaverOrganicTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamLocationsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamLocationsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamLocationsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamLocationsCountryResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamLocationsCountryTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamLocationsCountryResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamOrganicTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamOrganicTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamOrganicTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamOrganicTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamOrganicTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamOrganicTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamOrganicTasksFixedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamOrganicTasksFixedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamOrganicTasksFixedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamOrganicTaskGetRegularResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamOrganicTaskGetRegularTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamOrganicTaskGetRegularResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamOrganicTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamOrganicTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamOrganicTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamOrganicTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamOrganicTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpSeznamOrganicTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceExploreTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceExploreTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceExploreTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceExploreTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceExploreTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceExploreTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleFinanceAssetPairElementElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleFinanceMarketIndexElementElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleFinanceMarketInstrumentElementElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.Markets.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleFinanceHeroGroupsElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleFinanceInterestedElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleFinanceNewsElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleFinanceNewsElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleFinanceEarningsCalendarElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleFinanceEarningsCalendarElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleFinanceMostFollowedElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleFinanceMarketTrendsElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceExploreAdvancedItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleFinanceMarketTrendsElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleFinancePeopleAlsoSearchElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceExploreTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceExploreTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceExploreTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceExploreTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceExploreTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceExploreTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceExploreLiveAdvancedRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceExploreLiveAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceExploreLiveAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceExploreLiveAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceExploreLiveHtmlRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceExploreLiveHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceExploreLiveHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceExploreLiveHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceMarketsTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceMarketsTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceMarketsTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceMarketsTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceMarketsTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceMarketsTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleFinanceExploreMarketTrendsElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceMarketsTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceMarketsTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceMarketsTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceMarketsTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceMarketsTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceMarketsTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceMarketsLiveAdvancedRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceMarketsLiveAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceMarketsLiveAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceMarketsLiveAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceMarketsLiveHtmlRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceMarketsLiveHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceMarketsLiveHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceMarketsLiveHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceQuoteTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceQuoteTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceQuoteTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceQuoteTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceQuoteTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceQuoteTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GraphItems.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleFinanceQuoteElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleFinanceCompareToElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleFinanceMetricsBundleInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleFinanceFinancialElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleFinanceFuturesChainElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleFinanceFuturesChainElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleFinanceDetailsElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleFinanceAboutElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceQuoteTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceQuoteTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceQuoteTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceQuoteTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceQuoteTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceQuoteTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceQuoteLiveAdvancedRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceQuoteLiveAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceQuoteLiveAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceQuoteLiveAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceQuoteLiveHtmlRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceQuoteLiveHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceQuoteLiveHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceQuoteLiveHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceTickerSearchTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceTickerSearchTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceTickerSearchTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceTickerSearchTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceTickerSearchTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceTickerSearchTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleFinanceAssetPairElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleFinanceMarketInstrumentElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpApiGoogleFinanceMarketIndexElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceTickerSearchTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceTickerSearchTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceTickerSearchTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceTickerSearchLiveAdvancedRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceTickerSearchLiveAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceTickerSearchLiveAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpGoogleFinanceTickerSearchLiveAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsIdListRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsIdListResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsIdListTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsIdListResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsStatusInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsStatusResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsStatusTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsStatusResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsErrorsRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsErrorsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsErrorsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsErrorsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAvailableFiltersResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAvailableFiltersTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAvailableFiltersResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AvailableLanguages.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsLocationsAndLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsLocationsAndLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsLocationsAndLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsCategoriesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsCategoriesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsCategoriesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleAvailableHistoryResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleAvailableHistoryTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleAvailableHistoryResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordsForSiteLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SearchVolumeTrend.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordProperties.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SerpInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AvgBacklinksInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SearchIntentInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordsForSiteLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordsForSiteLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordsForSiteLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleRelatedKeywordsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsRelatedKeywordsLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleRelatedKeywordsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleRelatedKeywordsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleRelatedKeywordsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordSuggestionsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordSuggestionsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordSuggestionsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordSuggestionsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordIdeasLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordIdeasLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordIdeasLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordIdeasLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleBulkKeywordDifficultyLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBulkKeywordDifficultyLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleBulkKeywordDifficultyLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleBulkKeywordDifficultyLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleBulkKeywordDifficultyLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleSearchIntentLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordIntentInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleSearchIntentLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleSearchIntentLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleSearchIntentLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleSearchIntentLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleCategoriesForKeywordsLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleCategoriesForKeywordsLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleCategoriesForKeywordsLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleCategoriesForDomainLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsMetricsInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleCategoriesForDomainLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleCategoriesForDomainLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleCategoriesForDomainLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleCategoriesForDomainLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleCategoriesForKeywordsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleCategoriesForKeywordsLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleCategoriesForKeywordsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleCategoriesForKeywordsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleCategoriesForKeywordsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordsForCategoriesLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordsForCategoriesLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordsForCategoriesLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordsForCategoriesLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleDomainMetricsByCategoriesLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleDomainMetricsByCategoriesLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleDomainMetricsByCategoriesLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleDomainMetricsByCategoriesLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleDomainMetricsByCategoriesLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleTopSearchesLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleTopSearchesLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleTopSearchesLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleTopSearchesLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleDomainWhoisOverviewLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleDomainWhoisOverviewLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleDomainWhoisOverviewLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleDomainWhoisOverviewLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleDomainWhoisOverviewLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleRankedKeywordsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.RankChanges.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.RankInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsFeaturedSnippetSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.RankedSerpElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsRankedKeywordsLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsPaidSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleRankedKeywordsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleRankedKeywordsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleRankedKeywordsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleSerpCompetitorsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsSerpCompetitorsLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleSerpCompetitorsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleSerpCompetitorsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleSerpCompetitorsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleCompetitorsDomainLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsCompetitorsDomainLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleCompetitorsDomainLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleCompetitorsDomainLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleCompetitorsDomainLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleDomainIntersectionLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsOrganicSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsDomainIntersectionLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsLocalPackSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleDomainIntersectionLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleDomainIntersectionLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleDomainIntersectionLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleSubdomainsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsSubdomainsLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleSubdomainsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleSubdomainsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleSubdomainsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleRelevantPagesLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsRelevantPagesLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleRelevantPagesLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleRelevantPagesLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleRelevantPagesLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleDomainRankOverviewLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsDomainRankOverviewLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleDomainRankOverviewLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleDomainRankOverviewLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleDomainRankOverviewLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalSerpsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsAnswerBoxSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsCarouselElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsCarouselSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsMultiCarouselSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsGoogleFlightsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsGoogleReviewsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsGooglePostsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsImagesSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsJobsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsKnowledgeGraphImagesItemElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsKnowledgeGraphCarouselItemElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KnowledgeGraphLinkElementInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsKnowledgeGraphDescriptionItemElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsKnowledgeGraphListItemElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsKnowledgeGraphPartItemElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsKnowledgeGraphExpandedItemElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsKnowledgeGraphRowItemElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsKnowledgeGraphShoppingItemElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsKnowledgeGraphSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsHotelsPackSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsMapSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsPeopleAlsoAskSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsRelatedSearchesSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsPeopleAlsoSearchSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsShoppingSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsTopStoriesSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsTwitterSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsVideoSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsEventsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsMentionCarouselSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsRecipesSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsTopSightsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsScholarlyArticlesSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsPopularProductsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsPodcastsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsQuestionsAndAnswersSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsFindResultsOnSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsStocksBoxSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsCommercialUnitsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsLocalServicesSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsGoogleHotelsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataLabsMathSolverSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalSerpsLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalSerpsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalSerpsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalSerpsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalRankOverviewLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalRankOverviewLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalRankOverviewLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalRankOverviewLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalRankOverviewLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGooglePageIntersectionLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsPageIntersectionLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGooglePageIntersectionLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGooglePageIntersectionLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGooglePageIntersectionLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleBulkTrafficEstimationLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BulkMetricsInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BulkMetricsBundleInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleBulkTrafficEstimationLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleBulkTrafficEstimationLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleBulkTrafficEstimationLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleBulkTrafficEstimationLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.HistoricalMetricsInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.HistoricalMetricsBundleInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalBulkTrafficEstimationLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalKeywordDataLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.History.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalKeywordDataLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalKeywordDataLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalKeywordDataLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleHistoricalKeywordDataLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordOverviewLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordOverviewLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordOverviewLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordOverviewLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordOverviewLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonBulkSearchVolumeLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonBulkSearchVolumeLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonBulkSearchVolumeLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonBulkSearchVolumeLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonBulkSearchVolumeLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonRelatedKeywordsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonRelatedKeywordsLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonRelatedKeywordsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonRelatedKeywordsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonRelatedKeywordsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonRankedKeywordsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AmazonInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AmazonRankedSerpElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonRankedKeywordsLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonRankedKeywordsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonRankedKeywordsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonRankedKeywordsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonProductRankOverviewLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppMetricsInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AmazonMetricsBundleInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonProductRankOverviewLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonProductRankOverviewLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonProductRankOverviewLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonProductRankOverviewLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonProductCompetitorsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonProductCompetitorsLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonProductCompetitorsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonProductCompetitorsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonProductCompetitorsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonProductKeywordIntersectionsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonProductKeywordIntersectionsLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonProductKeywordIntersectionsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonProductKeywordIntersectionsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAmazonProductKeywordIntersectionsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingBulkKeywordDifficultyLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingBulkKeywordDifficultyLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingBulkKeywordDifficultyLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingBulkKeywordDifficultyLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingBulkTrafficEstimationLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingBulkTrafficEstimationLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingBulkTrafficEstimationLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingBulkTrafficEstimationLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingBulkTrafficEstimationLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingCompetitorsDomainLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingCompetitorsDomainLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingCompetitorsDomainLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingCompetitorsDomainLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingDomainIntersectionLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingDomainIntersectionLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingDomainIntersectionLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingDomainIntersectionLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingDomainRankOverviewLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingDomainRankOverviewLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingDomainRankOverviewLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingDomainRankOverviewLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingPageIntersectionLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingPageIntersectionLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingPageIntersectionLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingPageIntersectionLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingRankedKeywordsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingRankedKeywordsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingRankedKeywordsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingRankedKeywordsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingRelatedKeywordsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingRelatedKeywordsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingRelatedKeywordsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingRelatedKeywordsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingRelevantPagesLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingRelevantPagesLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingRelevantPagesLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingRelevantPagesLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingSerpCompetitorsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingSerpCompetitorsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingSerpCompetitorsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingSerpCompetitorsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingSubdomainsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingSubdomainsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingSubdomainsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsBingSubdomainsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleBulkAppMetricsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsleBulkAppMetricsLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleBulkAppMetricsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleBulkAppMetricsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleBulkAppMetricsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordsForAppLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GooglePlaySearchOrganic.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GooglePlayRankedSerpElementInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordsForAppLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordsForAppLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordsForAppLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleKeywordsForAppLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleAppCompetitorsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsleAppCompetitorsLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleAppCompetitorsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleAppCompetitorsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleAppCompetitorsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleAppIntersectionLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleAppIntersectionLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleAppIntersectionLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleAppIntersectionLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsGoogleAppIntersectionLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAppleBulkAppMetricsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAppleBulkAppMetricsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAppleBulkAppMetricsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAppleBulkAppMetricsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAppleKeywordsForAppLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppStoreSearchOrganic.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppleRankedSerpElementInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAppleKeywordsForAppLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAppleKeywordsForAppLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAppleKeywordsForAppLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAppleKeywordsForAppLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAppleAppCompetitorsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAppleAppCompetitorsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAppleAppCompetitorsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAppleAppCompetitorsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAppleAppIntersectionLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAppleAppIntersectionLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAppleAppIntersectionLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAppleAppIntersectionLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoLabsAppleAppIntersectionLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsIdListRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsIdListResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsIdListTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsIdListResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsErrorsRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsErrorsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsErrorsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsErrorsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesAvailableFiltersResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesAvailableFiltersTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesAvailableFiltersResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesLocationsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesLocationsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesLocationsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.TechnologyCategoryInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.Groups.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesTechnologiesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesTechnologiesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesTechnologiesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesAggregationTechnologiesLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesAggregationTechnologiesLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesAggregationTechnologiesLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesAggregationTechnologiesLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesAggregationTechnologiesLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesTechnologiesSummaryLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesTechnologiesSummaryLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesTechnologiesSummaryLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesTechnologiesSummaryLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesTechnologyStatsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesTechnologyStatsLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesTechnologyStatsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesTechnologyStatsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesTechnologyStatsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainsByTechnologyLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainsByLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainsByTechnologyLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainsByTechnologyLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainsByTechnologyLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainsByHtmlTermsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainTechnologiesLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainTechnologiesLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainTechnologiesLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsTechnologiesDomainTechnologiesLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsWhoisAvailableFiltersResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsWhoisAvailableFiltersTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsWhoisAvailableFiltersResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsWhoisOverviewLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MetricsInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MetricsBundleInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsWhoisOverviewLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsWhoisOverviewLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsWhoisOverviewLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainAnalyticsWhoisOverviewLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataIdListRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataIdListResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataIdListTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataIdListResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataErrorsRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataErrorsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataErrorsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataErrorsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsStatusResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsStatusTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsStatusResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsLocationsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsLocationsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsLocationsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsLocationsCountryResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsLocationsCountryTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsLocationsCountryResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsSearchVolumeTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsSearchVolumeTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsSearchVolumeTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsSearchVolumeTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsSearchVolumeTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsSearchVolumeTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsSearchVolumeTaskGetResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsSearchVolumeTaskGetTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsSearchVolumeTaskGetResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsSearchVolumeLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsSearchVolumeLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsSearchVolumeLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsSearchVolumeLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForSiteTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForSiteTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForSiteTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForSiteTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForSiteTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForSiteTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForSiteTaskGetResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForSiteTaskGetTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForSiteTaskGetResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForSiteLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForSiteLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForSiteLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForSiteLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForKeywordsTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForKeywordsTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForKeywordsTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForKeywordsTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForKeywordsTaskGetResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForKeywordsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForKeywordsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForKeywordsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsKeywordsForKeywordsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsAdTrafficByKeywordsTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsAdTrafficByKeywordsTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsAdTrafficByKeywordsTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsAdTrafficByKeywordsTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsAdTrafficByKeywordsTaskGetResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsAdTrafficByKeywordsTaskGetTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsAdTrafficByKeywordsTaskGetResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsAdTrafficByKeywordsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsAdTrafficByKeywordsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleAdsAdTrafficByKeywordsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsLocationsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsLocationsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsLocationsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsLocationsCountryResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsLocationsCountryTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsLocationsCountryResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsCategoriesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsCategoriesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsCategoriesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsExploreTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsExploreTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsExploreTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsExploreTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsExploreTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsExploreTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.TrendsGraphDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleTrendsGoogleTrendsGraphElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.TrendsMapDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleTrendsGoogleTrendsMapElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ListDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleTrendsGoogleTrendsQueriesListElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleTrendsGoogleTrendsTopicsListElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsExploreTaskGetResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsExploreTaskGetTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsExploreTaskGetResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsExploreLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsExploreLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsExploreLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataGoogleTrendsExploreLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsLocationsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsLocationsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsLocationsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsLocationsCountryResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsLocationsCountryTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsLocationsCountryResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsExploreLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoTrendsGraphDataTrendsGraphDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoTrendsDataforseoTrendsGraphElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsExploreLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsExploreLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsExploreLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsSubregionInterestsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoTrendsinterestsValuesInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoTrendsinterestsInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AbsoluteItems.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.InterestsComparison.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoTrendsSubregionInterestsElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsSubregionInterestsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsSubregionInterestsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsSubregionInterestsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsDemographyLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DemographyItemValueInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoTrendsDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.Demography.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DataforseoTrendsDemographyElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsDemographyLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsDemographyLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsDemographyLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsMergedDataLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsMergedDataLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsMergedDataLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataDataforseoTrendsMergedDataLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingLocationsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingLocationsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingLocationsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeTaskGetResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeTaskGetTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeTaskGetResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationJobFunctionsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationJobFunctionsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationJobFunctionsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationIndustriesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationIndustriesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationIndustriesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AudienceEstimationInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationTaskGetResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationTaskGetTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationTaskGetResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingAudienceEstimationLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForSiteTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForSiteTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForSiteTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForSiteTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForSiteTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForSiteTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForSiteTaskGetResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForSiteTaskGetTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForSiteTaskGetResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForSiteLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForSiteLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForSiteLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForSiteLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForKeywordsTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForKeywordsTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForKeywordsTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForKeywordsTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForKeywordsTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForKeywordsTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForKeywordsTaskGetResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForKeywordsTaskGetTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForKeywordsTaskGetResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForKeywordsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForKeywordsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForKeywordsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordsForKeywordsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AvailableLocations.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordPerformanceLocationsAndLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordPerformanceLocationsAndLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordPerformanceLocationsAndLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordPerformanceTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordPerformanceTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordPerformanceTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordPerformanceTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordPerformanceTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordPerformanceTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordKpiItemInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordKpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordPerformanceTaskGetResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordPerformanceTaskGetTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordPerformanceTaskGetResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordPerformanceLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordPerformanceLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordPerformanceLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingKeywordPerformanceLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeHistoryLocationsAndLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeHistoryLocationsAndLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeHistoryLocationsAndLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeHistoryTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeHistoryTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeHistoryTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeHistoryTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeHistoryTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeHistoryTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SearchVolumeHistoryItemInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SearchVolumeHistorySearchInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeHistoryTaskGetResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeHistoryTaskGetTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeHistoryTaskGetResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeHistoryLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeHistoryLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeHistoryLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataBingSearchVolumeHistoryLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataClickstreamDataLocationsAndLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataClickstreamDataLocationsAndLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataClickstreamDataLocationsAndLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataClickstreamDataDataforseoSearchVolumeLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataClickstreamDataSearchVolumeLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataClickstreamDataDataforseoSearchVolumeLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataClickstreamDataDataforseoSearchVolumeLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataClickstreamDataDataforseoSearchVolumeLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataClickstreamDataGlobalSearchVolumeLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.CountryDistribution.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataClickstreamDataGlobalSearchVolumeLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataClickstreamDataGlobalSearchVolumeLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataClickstreamDataGlobalSearchVolumeLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataClickstreamDataGlobalSearchVolumeLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataClickstreamDataBulkSearchVolumeLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataClickstreamDataBulkSearchVolumeLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataClickstreamDataBulkSearchVolumeLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.KeywordsDataClickstreamDataBulkSearchVolumeLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksIdListRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksIdListResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksIdListTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksIdListResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksErrorsRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksErrorsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksErrorsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksErrorsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksAvailableFiltersResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksAvailableFiltersTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksAvailableFiltersResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.IndexHistory.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksIndexResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksIndexTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksIndexResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksSummaryLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.TargetInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksSummaryLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksSummaryLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksSummaryLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksHistoryLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksHistoryLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksHistoryLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksHistoryLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksHistoryLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBacklinksLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.RankedKeywordsInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksRedirectInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBacklinksLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBacklinksLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBacklinksLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBacklinksLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksAnchorsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksAnchorsLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksAnchorsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksAnchorsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksAnchorsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksDomainPagesLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksPageMeta.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PageSummary.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksDomainPagesLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksDomainPagesLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksDomainPagesLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksDomainPagesLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksDomainPagesSummaryLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksDomainPagesSummaryLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksDomainPagesSummaryLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksDomainPagesSummaryLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksDomainPagesSummaryLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksReferringDomainsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksReferringDomainsLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksReferringDomainsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksReferringDomainsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksReferringDomainsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksReferringNetworksLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksReferringNetworksLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksReferringNetworksLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksReferringNetworksLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksReferringNetworksLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksCompetitorsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksCompetitorsLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksCompetitorsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksCompetitorsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksCompetitorsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksDomainIntersectionLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksDomainIntersection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.IntersectionSummaryInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksDomainIntersectionLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksDomainIntersectionLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksDomainIntersectionLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksDomainIntersectionLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksPageIntersectionLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksPageIntersection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksPageIntersectionLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksPageIntersectionLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksPageIntersectionLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksPageIntersectionLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksTimeseriesSummaryLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksTimeseriesSummaryLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksTimeseriesSummaryLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksTimeseriesSummaryLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksTimeseriesSummaryLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksTimeseriesNewLostSummaryLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksTimeseriesNewLostSummaryLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksTimeseriesNewLostSummaryLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksTimeseriesNewLostSummaryLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksTimeseriesNewLostSummaryLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkRanksLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkRanksLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkRanksLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkRanksLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkRanksLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkBacklinksLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkBacklinksLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkBacklinksLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkBacklinksLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkBacklinksLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkSpamScoreLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkSpamScoreLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkSpamScoreLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkSpamScoreLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkSpamScoreLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkReferringDomainsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkReferringDomainsLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkReferringDomainsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkReferringDomainsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkReferringDomainsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkNewLostBacklinksLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkNewLostBacklinksLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkNewLostBacklinksLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkNewLostBacklinksLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkNewLostBacklinksLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkNewLostReferringDomainsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkNewLostReferringDomainsLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkNewLostReferringDomainsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkNewLostReferringDomainsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkNewLostReferringDomainsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkPagesSummaryLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkPagesSummaryLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkPagesSummaryLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkPagesSummaryLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BacklinksBulkPagesSummaryLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesModelsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesModelsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesModelsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AnnotationInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.LlmMessageSectionInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesTaskGetResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesTaskGetTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmResponsesTaskGetResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperLocationsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperLocationsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperLocationsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperLocationsCountryResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperLocationsCountryTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperLocationsCountryResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ChatgptSearchResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ChatGptSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ChatGptTextElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ChatGptTableElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ChatGptNavigationListElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ChatGptImagesElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ChatGptImagesElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ChatGptProductsElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ChatGptProductsElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ChatGptLocalBusinessesElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ChatGptLocalBusinessesElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationChatGptLlmScraperTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesModelsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesModelsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesModelsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesTaskGetResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesTaskGetTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationClaudeLlmResponsesTaskGetResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationGeminiLlmResponsesModelsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationGeminiLlmResponsesModelsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationGeminiLlmResponsesModelsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationGeminiLlmResponsesLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationGeminiLlmResponsesLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationGeminiLlmResponsesLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationGeminiLlmResponsesLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationPerplexityLlmResponsesModelsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationPerplexityLlmResponsesModelsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationPerplexityLlmResponsesModelsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationPerplexityLlmResponsesLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationPerplexityLlmResponsesLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationPerplexityLlmResponsesLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationPerplexityLlmResponsesLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationAiKeywordDataAvailableFiltersResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationAiKeywordDataAvailableFiltersTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationAiKeywordDataAvailableFiltersResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationAiKeywordDataLocationsAndLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationAiKeywordDataLocationsAndLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationAiKeywordDataLocationsAndLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiMonthlySearches.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AiOptimizationAiKeywordDataKeywordsSearchVolumeLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageIdListRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageIdListResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageIdListTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageIdListResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageErrorsRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageErrorsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageErrorsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageErrorsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageForceStopRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageForceStopTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageForceStopResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageAvailableFiltersResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageAvailableFiltersTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageAvailableFiltersResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SslInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DomainInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PageMetrics.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageSummaryResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageSummaryTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageSummaryResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPagePagesRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.HtmlContentInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.HunspellMisspelledInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.HunspellInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PageMetaInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PageTiming.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageResourceIssueItemInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageResourceIssueInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.CacheControl.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.LastModified.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageHtmlResourceItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.FetchTiming.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageBrokenResourceItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageRedirectResourceItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageScriptResourceItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageImageResourceItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageStylesheetResourceItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPagePagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPagePagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPagePagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPagePagesByResourceRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPagePagesByResourceResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPagePagesByResourceTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPagePagesByResourceResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageResourcesRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageResourcesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageResourcesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageResourcesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageDuplicateTagsRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageDuplicateTagsItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageDuplicateTagsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageDuplicateTagsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageDuplicateTagsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageDuplicateContentRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DuplicatePageInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageDuplicateContentItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageDuplicateContentResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageDuplicateContentTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageDuplicateContentResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLinksRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageAnchorLinkItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageImageLinkItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageCanonicalLinkItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageAlternateLinkItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLinkLinkItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageRedirectLinkItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageMetaLinkItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLinksResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLinksTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLinksResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageRedirectChainsRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageRedirectChainsItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageRedirectChainsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageRedirectChainsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageRedirectChainsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageNonIndexableRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageNonIndexableItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageNonIndexableResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageNonIndexableTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageNonIndexableResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageWaterfallRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageResourceLocationInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.WaterfallResourceInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageWaterfallItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageWaterfallResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageWaterfallTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageWaterfallResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageKeywordDensityRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageKeywordDensityItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageKeywordDensityResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageKeywordDensityTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageKeywordDensityResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageMicrodataRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.TestSummary.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MicrodataFieldsInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MicrodataInspectionInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageMicrodataInfoItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageMicrodataResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageMicrodataTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageMicrodataResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageRawHtmlRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageRawHtmlItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageRawHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageRawHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageRawHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPagePageScreenshotRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPagePageScreenshotResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPagePageScreenshotTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPagePageScreenshotResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageContentParsingRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PageSectionContentInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.TopicInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.Contacts.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PageContentInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentParsingElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageContentParsingResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageContentParsingTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageContentParsingResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageContentParsingLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageContentParsingLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageContentParsingLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageContentParsingLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageInstantPagesRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageInstantPagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageInstantPagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageInstantPagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLighthouseLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLighthouseLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLighthouseLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLighthouseAuditsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLighthouseAuditsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLighthouseAuditsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AvailibleVersions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLighthouseVersionsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLighthouseVersionsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLighthouseVersionsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLighthouseTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLighthouseTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLighthouseTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLighthouseTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLighthouseTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLighthouseTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLighthouseTaskGetJsonTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLighthouseTaskGetJsonResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLighthouseLiveJsonRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLighthouseLiveJsonTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OnPageLighthouseLiveJsonResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisIdListRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisIdListResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisIdListTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisIdListResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisAvailableFiltersResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisAvailableFiltersTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisAvailableFiltersResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisLocationsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisLocationsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisLocationsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisCategoriesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisCategoriesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisCategoriesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisSearchLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AnalysisContentInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisSearchLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisSearchLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisSearchLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisSearchLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisSummaryLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisSummaryInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisSummaryLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisSummaryLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisSentimentAnalysisLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PositiveConnotationDistribution.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SentimentConnotationDistribution.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisSentimentAnalysisLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisSentimentAnalysisLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisSentimentAnalysisLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisRatingDistributionLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisRatingDistributionLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisRatingDistributionLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisRatingDistributionLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisPhraseTrendsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisPhraseTrendsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisPhraseTrendsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisPhraseTrendsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisCategoryTrendsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisCategoryTrendsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisCategoryTrendsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentAnalysisCategoryTrendsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationGenerateLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationGenerateLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationGenerateLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationGenerateLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationGenerateTextLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationGenerateTextLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationGenerateTextLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationGenerateTextLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationGenerateMetaTagsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationGenerateMetaTagsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationGenerateMetaTagsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationGenerateMetaTagsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationGenerateSubTopicsLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationGenerateSubTopicsLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationGenerateSubTopicsLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationGenerateSubTopicsLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationParaphraseLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationParaphraseLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationParaphraseLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationParaphraseLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationCheckGrammarLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationCheckGrammarLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationCheckGrammarLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationCheckGrammarLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationCheckGrammarLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationCheckGrammarLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationCheckGrammarLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationCheckGrammarLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationGrammarRulesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationGrammarRulesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationGrammarRulesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationTextSummaryLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationTextSummaryLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationTextSummaryLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationTextSummaryLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationTextSummaryLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationTextSummaryLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ContentGenerationTextSummaryLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantIdListRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantIdListResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantIdListTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantIdListResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantErrorsRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantErrorsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantErrorsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantErrorsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleLocationsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleLocationsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleLocationsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleLocationsCountryResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleLocationsCountryTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleLocationsCountryResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductsTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductsTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductsTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductsTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductsTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductsTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.DeliveryInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.StoresCountInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleShoppingSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleShoppingPaidElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.SpecialOfferInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleShoppingSponsoredCarouselElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleShoppingSponsoredCarouselElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.RelatedSearchesElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductsTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductsTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductsTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductsTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductsTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductsTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleSellersTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleSellersTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleSellersTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleSellersTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleSellersTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleSellersTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleShoppingSellersShopsListElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleShoppingSellersBuyOnGoogleElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleSellersTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleSellersTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleSellersTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleSellersTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleSellersTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleSellersTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductSpecTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductSpecTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductSpecTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductSpecTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductSpecTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductSpecTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ShoppingSpecification.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductSpecTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductSpecTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductSpecTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductSpecTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductSpecTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductSpecTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductInfoTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductInfoTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductInfoTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductInfoTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductInfoTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductInfoTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ProductSeller.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ProductVariation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ProductInfoElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductInfoTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductInfoTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleProductInfoTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleSellersAdUrlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleSellersAdUrlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantGoogleSellersAdUrlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonLocationsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonLocationsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonLocationsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonLocationsCountryResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonLocationsCountryTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonLocationsCountryResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonProductsTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonProductsTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonProductsTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonProductsTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonProductsTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonProductsTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonPaidSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonSerpSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AmazonSerpElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantEditorialRecommendationsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantRelatedSearchesSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantTopRatedFromOurBrandsSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonProductsTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonProductsTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonProductsTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonProductsTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonProductsTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonProductsTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonAsinTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonAsinTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonAsinTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonAsinTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonAsinTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonAsinTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AmazonApplicableVouchersItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AmazonProductNewerModelInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ProductCategoryInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ProductInformationProductInformationDetailsItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ProductInformationProductInformationTextItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ProductInformationRowProductInformationImageRowElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ProductInformationRowProductInformationTextRowElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ProductInformationRows.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ProductInformationProductInformationExtendedItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.UserProfileInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AmazonReviewItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AmazonProductInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonAsinTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonAsinTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonAsinTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonAsinTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonAsinTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonAsinTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonSellersTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonSellersTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonSellersTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonSellersTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonSellersTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonSellersTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonSellerMainItemSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonSellerItemSerpElementItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonSellersTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonSellersTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonSellersTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonSellersTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonSellersTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonSellersTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonReviewsTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonReviewsTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonReviewsTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonReviewsTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonReviewsTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonReviewsTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonReviewsTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonReviewsTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonReviewsTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonReviewsTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonReviewsTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MerchantAmazonReviewsTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataIdListRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataIdListResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataIdListTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataIdListResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataErrorsRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataErrorsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataErrorsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataErrorsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleCategoriesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleCategoriesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleCategoriesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleLocationsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleLocationsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleLocationsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleLocationsCountryResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleLocationsCountryTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleLocationsCountryResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppSearchesTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppSearchesTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppSearchesTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppSearchesTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppSearchesTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppSearchesTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppSearchesTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppSearchesTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppSearchesTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppSearchesTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppSearchesTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppSearchesTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppListTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppListTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppListTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppListTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppListTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppListTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppListTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppListTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppListTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppListTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppListTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppListTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppInfoTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppInfoTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppInfoTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppInfoTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppInfoTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppInfoTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppsInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GooglePlayInfoOrganic.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppInfoTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppInfoTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppInfoTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppInfoTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppInfoTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppInfoTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppReviewsTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppReviewsTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppReviewsTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppReviewsTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppReviewsTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppReviewsTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppUserProfileInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ResponseDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GooglePlayReviewsSearch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppReviewsTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppReviewsTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppReviewsTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppReviewsTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppReviewsTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppReviewsTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppListingsCategoriesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppListingsCategoriesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppListingsCategoriesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppListingsSearchLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppListingsSearchLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppListingsSearchLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppListingsSearchLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataGoogleAppListingsSearchLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleCategoriesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleCategoriesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleCategoriesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleLocationsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleLocationsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleLocationsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppSearchesTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppSearchesTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppSearchesTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppSearchesTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppSearchesTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppSearchesTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppSearchesTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppSearchesTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppSearchesTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppInfoTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppInfoTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppInfoTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppInfoTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppInfoTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppInfoTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppStoreInfoOrganic.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppInfoTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppInfoTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppInfoTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppListTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppListTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppListTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppListTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppListTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppListTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppListTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppListTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppListTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppReviewsTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppReviewsTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppReviewsTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppReviewsTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppReviewsTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppReviewsTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppStoreReviewsSearch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppReviewsTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppReviewsTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppReviewsTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppListingsCategoriesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppListingsCategoriesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppListingsCategoriesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppListingsSearchLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppListingsSearchLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppListingsSearchLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppListingsSearchLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppDataAppleAppListingsSearchLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataIdListRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataIdListResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataIdListTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataIdListResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataErrorsRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataErrorsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataErrorsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataErrorsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataBusinessListingsLocationsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataBusinessListingsLocationsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataBusinessListingsLocationsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataBusinessListingsCategoriesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataBusinessListingsCategoriesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataBusinessListingsCategoriesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataBusinessListingsAvailableFiltersResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataBusinessListingsAvailableFiltersTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataBusinessListingsAvailableFiltersResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataBusinessListingsSearchLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataAttributesInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PeopleAlsoSearch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessWorkHoursInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PopularTimes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataContactInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataBusinessListingsSearchLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataBusinessListingsSearchLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataBusinessListingsSearchLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataBusinessListingsSearchLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataBusinessListingsCategoriesAggregationLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessListingAggregationInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataBusinessListingsCategoriesAggregationLiveItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataBusinessListingsCategoriesAggregationLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataBusinessListingsCategoriesAggregationLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataBusinessListingsCategoriesAggregationLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleLocationsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleLocationsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleLocationsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleLocationsCountryResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleLocationsCountryTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleLocationsCountryResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessInfoTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessInfoTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessInfoTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessInfoTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessInfoTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessInfoTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.MapsSearch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDirectoryInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleBusinessInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessInfoTaskGetResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessInfoTaskGetTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessInfoTaskGetResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessInfoLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ItemsGoogleBusinessInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessInfoLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessInfoLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessInfoLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessUpdatesTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessUpdatesTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessUpdatesTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessUpdatesTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessUpdatesTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessUpdatesTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleBusinessPost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessUpdatesTaskGetResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessUpdatesTaskGetTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleMyBusinessUpdatesTaskGetResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelSearchesTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelSearchesTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelSearchesTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelSearchesTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelSearchesTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelSearchesTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GpsCoordinatesLocationInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.HotelInfoPriceOffer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.HotelPriceItemInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.PricesByDates.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.HotelPriceInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelSearchesItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelSearchesTaskGetResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelSearchesTaskGetTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelSearchesTaskGetResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelSearchesLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelSearchesLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelSearchesLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelSearchesLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.HotelAmenityItemInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.HotelAmenityInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.HotelAboutInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.LocationChain.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.HotelLocationInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ReviewMentionInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.OtherSitesReviewsInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.HotelReviewInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoTaskGetAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoTaskGetAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoTaskGetAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoTaskGetHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoTaskGetHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoTaskGetHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoLiveAdvancedRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoLiveAdvancedResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoLiveAdvancedTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoLiveAdvancedResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoLiveHtmlRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoLiveHtmlResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoLiveHtmlTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleHotelInfoLiveHtmlResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleReviewsTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleReviewsTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleReviewsTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleReviewsTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleReviewsTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleReviewsTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ReviewHighlights.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleReviewsSearch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleReviewsTaskGetResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleReviewsTaskGetTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleReviewsTaskGetResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleExtendedReviewsTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleExtendedReviewsTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleExtendedReviewsTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleExtendedReviewsTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleExtendedReviewsTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleExtendedReviewsTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.Source.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleExtendedReviewsSearch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleExtendedReviewsTaskGetResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleExtendedReviewsTaskGetTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleExtendedReviewsTaskGetResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleQuestionsAndAnswersTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleQuestionsAndAnswersTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleQuestionsAndAnswersTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleQuestionsAndAnswersTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleQuestionsAndAnswersTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleQuestionsAndAnswersTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleBusinessQuestionItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.GoogleBusinessAnswerElement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleQuestionsAndAnswersTaskGetResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleQuestionsAndAnswersTaskGetTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleQuestionsAndAnswersTaskGetResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleQuestionsAndAnswersLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleQuestionsAndAnswersLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleQuestionsAndAnswersLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataGoogleQuestionsAndAnswersLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTrustpilotSearchTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTrustpilotSearchTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTrustpilotSearchTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTrustpilotSearchTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTrustpilotSearchTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTrustpilotSearchTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.TrustpilotSearchOrganic.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTrustpilotSearchTaskGetResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTrustpilotSearchTaskGetTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTrustpilotSearchTaskGetResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTrustpilotReviewsTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTrustpilotReviewsTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTrustpilotReviewsTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTrustpilotReviewsTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTrustpilotReviewsTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTrustpilotReviewsTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataUserProfileInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.TrustpilotReviewSearch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTrustpilotReviewsTaskGetResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTrustpilotReviewsTaskGetTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTrustpilotReviewsTaskGetResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorLocationsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorLocationsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorLocationsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorLocationsCountryResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorLocationsCountryTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorLocationsCountryResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorLanguagesResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorLanguagesTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorLanguagesResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorSearchTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorSearchTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorSearchTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorSearchTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorSearchTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorSearchTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.TripadvisorSearchOrganic.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorSearchTaskGetResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorSearchTaskGetTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorSearchTaskGetResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorReviewsTaskPostRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorReviewsTaskPostTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorReviewsTaskPostResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorReviewsTasksReadyResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorReviewsTasksReadyTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorReviewsTasksReadyResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.ImageUrlInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.TripadvisorReviewSearch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorReviewsTaskGetResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorReviewsTaskGetTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataTripadvisorReviewsTaskGetResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataSocialMediaPinterestLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataSocialMediaPinterestLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataSocialMediaPinterestLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataSocialMediaPinterestLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataSocialMediaFacebookLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataSocialMediaFacebookLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataSocialMediaFacebookLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataSocialMediaFacebookLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataSocialMediaRedditLiveRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.RedditReviews.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataSocialMediaRedditLiveResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataSocialMediaRedditLiveTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.BusinessDataSocialMediaRedditLiveResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixFunctionTypeInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixJobsSerpLimitsRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixSerpDaysRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixBingKeywordsDataLimitsRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixGoogleAdsKeywordsDataLimitsRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixDataforseoTrendsKeywordsDataLimitsRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixClickstreamDataKeywordsDataLimitsRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixKeywordsDataDaysRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixAppendixDaysRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixDataforseoLabsLimitsRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixWhoisDomainAnalyticsLimitsRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixTechnologiesDomainAnalyticsLimitsRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixDomainAnalyticsLimitsRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixSellersGoogleMerchantLimitsRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixMerchantGoogleInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixMerchantAmazonInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixMerchantLimitsRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixOnPageLimitsRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixBusinessDataGoogleInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixBusinessDataDayLimitsRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixSocialMediaBusinessDataLimitsRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixBusinessListingsBusinessDataLimitsRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixBusinessDataLimitsRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixBacklinksLimitsRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixAppDataLimitsRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixContentAnalysisLimitsRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixContentGenerationDayLimitsRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixContentGenerationLimitsRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixDayLimitsRatesData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixSerpDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixNaverKeywordsDataDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixKeywordsDataDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixAppendixDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixLimitsRatesData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixStatisticsRatesDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixStatisticsDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixRatesData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixLimitsMoneyData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixMoneyData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixPriorityTasksReadyKeywordsDataPriceDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixTaskKeywordsDataPriceDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixAKeywordsDataPriceDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixBingKeywordsDataPriceDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixBingKeywordsDataPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixClickstreamDataKeywordsDataPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixGoogleAdsKeywordsDataPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixDataforseoTrendsKeywordsDataPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixExploreKeywordsDataPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixKeywordsDataPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixTaskGetPriceDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixPriceDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixTaskGetProductGoogleMerchantPriceDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixProductGoogleMerchantPriceDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixSellersGoogleMerchantPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixGoogleMerchantPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixAmazonMerchantPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixMerchantPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixSerpPriceDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixSerpPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixAppendixPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixAppListingsAppDataPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixAppDataPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixBacklinksPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixBusinessListingsBusinessDataPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixHotelInfoGoogleBusinessDataPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixGoogleBusinessDataPriceDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixGoogleBusinessDataPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixSocialMediaBusinessDataPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixTrBusinessDataPriceDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixBusinessDataPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixContentAnalysisPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixContentGenerationPriceDataInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixContentGenerationPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixDataforseoLabsPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixWhoisDomainAnalyticsPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixTechnologiesDomainAnalyticsPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixDomainAnalyticsPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixOnPagePriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixPriceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixUserDataResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixUserDataTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixUserDataResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixErrorsResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixErrorsTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixErrorsResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixWebhookResendRequestInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixWebhookResendTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixWebhookResendResponseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixStatusEndpointsInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixStatusResultInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixStatusTaskInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.dataforseo.client.model.AppendixStatusResponseInfo.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}