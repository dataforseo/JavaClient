# SerpApi

All URIs are relative to *https://api.dataforseo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**idList**](SerpApi.md#idList) | **POST**  /v3/serp/id_list  |
| [**errors**](SerpApi.md#errors) | **POST**  /v3/serp/errors  |
| [**screenshot**](SerpApi.md#screenshot) | **POST**  /v3/serp/screenshot  |
| [**aiSummary**](SerpApi.md#aiSummary) | **POST**  /v3/serp/ai_summary  |
| [**googleLocations**](SerpApi.md#googleLocations) | **GET**  /v3/serp/google/locations  |
| [**googleLocationsCountry**](SerpApi.md#googleLocationsCountry) | **GET**  /v3/serp/google/locations/{country}  |
| [**googleLanguages**](SerpApi.md#googleLanguages) | **GET**  /v3/serp/google/languages  |
| [**googleOrganicTaskPost**](SerpApi.md#googleOrganicTaskPost) | **POST**  /v3/serp/google/organic/task_post  |
| [**googleOrganicTasksReady**](SerpApi.md#googleOrganicTasksReady) | **GET**  /v3/serp/google/organic/tasks_ready  |
| [**tasksReady**](SerpApi.md#tasksReady) | **GET**  /v3/serp/tasks_ready  |
| [**googleOrganicTasksFixed**](SerpApi.md#googleOrganicTasksFixed) | **GET**  /v3/serp/google/organic/tasks_fixed  |
| [**googleOrganicTaskGetRegular**](SerpApi.md#googleOrganicTaskGetRegular) | **GET**  /v3/serp/google/organic/task_get/regular/{id}  |
| [**googleOrganicTaskGetAdvanced**](SerpApi.md#googleOrganicTaskGetAdvanced) | **GET**  /v3/serp/google/organic/task_get/advanced/{id}  |
| [**googleOrganicTaskGetHtml**](SerpApi.md#googleOrganicTaskGetHtml) | **GET**  /v3/serp/google/organic/task_get/html/{id}  |
| [**googleOrganicLiveRegular**](SerpApi.md#googleOrganicLiveRegular) | **POST**  /v3/serp/google/organic/live/regular  |
| [**googleOrganicLiveAdvanced**](SerpApi.md#googleOrganicLiveAdvanced) | **POST**  /v3/serp/google/organic/live/advanced  |
| [**googleOrganicLiveHtml**](SerpApi.md#googleOrganicLiveHtml) | **POST**  /v3/serp/google/organic/live/html  |
| [**googleAiModeLanguages**](SerpApi.md#googleAiModeLanguages) | **GET**  /v3/serp/google/ai_mode/languages  |
| [**googleAiModeTaskPost**](SerpApi.md#googleAiModeTaskPost) | **POST**  /v3/serp/google/ai_mode/task_post  |
| [**googleAiModeTasksReady**](SerpApi.md#googleAiModeTasksReady) | **GET**  /v3/serp/google/ai_mode/tasks_ready  |
| [**googleAiModeTasksFixed**](SerpApi.md#googleAiModeTasksFixed) | **GET**  /v3/serp/google/ai_mode/tasks_fixed  |
| [**googleAiModeTaskGetAdvanced**](SerpApi.md#googleAiModeTaskGetAdvanced) | **GET**  /v3/serp/google/ai_mode/task_get/advanced/{id}  |
| [**googleAiModeTaskGetHtml**](SerpApi.md#googleAiModeTaskGetHtml) | **GET**  /v3/serp/google/ai_mode/task_get/html/{id}  |
| [**googleAiModeLiveAdvanced**](SerpApi.md#googleAiModeLiveAdvanced) | **POST**  /v3/serp/google/ai_mode/live/advanced  |
| [**googleAiModeLiveHtml**](SerpApi.md#googleAiModeLiveHtml) | **POST**  /v3/serp/google/ai_mode/live/html  |
| [**googleMapsTaskPost**](SerpApi.md#googleMapsTaskPost) | **POST**  /v3/serp/google/maps/task_post  |
| [**googleMapsTasksReady**](SerpApi.md#googleMapsTasksReady) | **GET**  /v3/serp/google/maps/tasks_ready  |
| [**googleMapsTasksFixed**](SerpApi.md#googleMapsTasksFixed) | **GET**  /v3/serp/google/maps/tasks_fixed  |
| [**googleMapsTaskGetAdvanced**](SerpApi.md#googleMapsTaskGetAdvanced) | **GET**  /v3/serp/google/maps/task_get/advanced/{id}  |
| [**googleMapsLiveAdvanced**](SerpApi.md#googleMapsLiveAdvanced) | **POST**  /v3/serp/google/maps/live/advanced  |
| [**googleLocalFinderTaskPost**](SerpApi.md#googleLocalFinderTaskPost) | **POST**  /v3/serp/google/local_finder/task_post  |
| [**googleLocalFinderTasksReady**](SerpApi.md#googleLocalFinderTasksReady) | **GET**  /v3/serp/google/local_finder/tasks_ready  |
| [**googleLocalFinderTasksFixed**](SerpApi.md#googleLocalFinderTasksFixed) | **GET**  /v3/serp/google/local_finder/tasks_fixed  |
| [**googleLocalFinderTaskGetAdvanced**](SerpApi.md#googleLocalFinderTaskGetAdvanced) | **GET**  /v3/serp/google/local_finder/task_get/advanced/{id}  |
| [**googleLocalFinderTaskGetHtml**](SerpApi.md#googleLocalFinderTaskGetHtml) | **GET**  /v3/serp/google/local_finder/task_get/html/{id}  |
| [**googleLocalFinderLiveAdvanced**](SerpApi.md#googleLocalFinderLiveAdvanced) | **POST**  /v3/serp/google/local_finder/live/advanced  |
| [**googleLocalFinderLiveHtml**](SerpApi.md#googleLocalFinderLiveHtml) | **POST**  /v3/serp/google/local_finder/live/html  |
| [**googleNewsTaskPost**](SerpApi.md#googleNewsTaskPost) | **POST**  /v3/serp/google/news/task_post  |
| [**googleNewsTasksReady**](SerpApi.md#googleNewsTasksReady) | **GET**  /v3/serp/google/news/tasks_ready  |
| [**googleNewsTasksFixed**](SerpApi.md#googleNewsTasksFixed) | **GET**  /v3/serp/google/news/tasks_fixed  |
| [**googleNewsTaskGetAdvanced**](SerpApi.md#googleNewsTaskGetAdvanced) | **GET**  /v3/serp/google/news/task_get/advanced/{id}  |
| [**googleNewsTaskGetHtml**](SerpApi.md#googleNewsTaskGetHtml) | **GET**  /v3/serp/google/news/task_get/html/{id}  |
| [**googleNewsLiveAdvanced**](SerpApi.md#googleNewsLiveAdvanced) | **POST**  /v3/serp/google/news/live/advanced  |
| [**googleNewsLiveHtml**](SerpApi.md#googleNewsLiveHtml) | **POST**  /v3/serp/google/news/live/html  |
| [**googleEventsTaskPost**](SerpApi.md#googleEventsTaskPost) | **POST**  /v3/serp/google/events/task_post  |
| [**googleEventsTasksReady**](SerpApi.md#googleEventsTasksReady) | **GET**  /v3/serp/google/events/tasks_ready  |
| [**googleEventsTasksFixed**](SerpApi.md#googleEventsTasksFixed) | **GET**  /v3/serp/google/events/tasks_fixed  |
| [**googleEventsTaskGetAdvanced**](SerpApi.md#googleEventsTaskGetAdvanced) | **GET**  /v3/serp/google/events/task_get/advanced/{id}  |
| [**googleEventsLiveAdvanced**](SerpApi.md#googleEventsLiveAdvanced) | **POST**  /v3/serp/google/events/live/advanced  |
| [**googleImagesTaskPost**](SerpApi.md#googleImagesTaskPost) | **POST**  /v3/serp/google/images/task_post  |
| [**googleImagesTasksReady**](SerpApi.md#googleImagesTasksReady) | **GET**  /v3/serp/google/images/tasks_ready  |
| [**googleImagesTasksFixed**](SerpApi.md#googleImagesTasksFixed) | **GET**  /v3/serp/google/images/tasks_fixed  |
| [**googleImagesTaskGetAdvanced**](SerpApi.md#googleImagesTaskGetAdvanced) | **GET**  /v3/serp/google/images/task_get/advanced/{id}  |
| [**googleImagesTaskGetHtml**](SerpApi.md#googleImagesTaskGetHtml) | **GET**  /v3/serp/google/images/task_get/html/{id}  |
| [**googleImagesLiveAdvanced**](SerpApi.md#googleImagesLiveAdvanced) | **POST**  /v3/serp/google/images/live/advanced  |
| [**googleImagesLiveHtml**](SerpApi.md#googleImagesLiveHtml) | **POST**  /v3/serp/google/images/live/html  |
| [**googleSearchByImageTaskPost**](SerpApi.md#googleSearchByImageTaskPost) | **POST**  /v3/serp/google/search_by_image/task_post  |
| [**googleSearchByImageTasksReady**](SerpApi.md#googleSearchByImageTasksReady) | **GET**  /v3/serp/google/search_by_image/tasks_ready  |
| [**googleSearchByImageTasksFixed**](SerpApi.md#googleSearchByImageTasksFixed) | **GET**  /v3/serp/google/search_by_image/tasks_fixed  |
| [**googleSearchByImageTaskGetAdvanced**](SerpApi.md#googleSearchByImageTaskGetAdvanced) | **GET**  /v3/serp/google/search_by_image/task_get/advanced/{id}  |
| [**googleJobsTaskPost**](SerpApi.md#googleJobsTaskPost) | **POST**  /v3/serp/google/jobs/task_post  |
| [**googleJobsTasksReady**](SerpApi.md#googleJobsTasksReady) | **GET**  /v3/serp/google/jobs/tasks_ready  |
| [**googleJobsTasksFixed**](SerpApi.md#googleJobsTasksFixed) | **GET**  /v3/serp/google/jobs/tasks_fixed  |
| [**googleJobsTaskGetAdvanced**](SerpApi.md#googleJobsTaskGetAdvanced) | **GET**  /v3/serp/google/jobs/task_get/advanced/{id}  |
| [**googleJobsTaskGetHtml**](SerpApi.md#googleJobsTaskGetHtml) | **GET**  /v3/serp/google/jobs/task_get/html/{id}  |
| [**googleAutocompleteTaskPost**](SerpApi.md#googleAutocompleteTaskPost) | **POST**  /v3/serp/google/autocomplete/task_post  |
| [**googleAutocompleteTasksReady**](SerpApi.md#googleAutocompleteTasksReady) | **GET**  /v3/serp/google/autocomplete/tasks_ready  |
| [**googleAutocompleteTasksFixed**](SerpApi.md#googleAutocompleteTasksFixed) | **GET**  /v3/serp/google/autocomplete/tasks_fixed  |
| [**googleAutocompleteTaskGetAdvanced**](SerpApi.md#googleAutocompleteTaskGetAdvanced) | **GET**  /v3/serp/google/autocomplete/task_get/advanced/{id}  |
| [**googleAutocompleteLiveAdvanced**](SerpApi.md#googleAutocompleteLiveAdvanced) | **POST**  /v3/serp/google/autocomplete/live/advanced  |
| [**googleDatasetSearchTaskPost**](SerpApi.md#googleDatasetSearchTaskPost) | **POST**  /v3/serp/google/dataset_search/task_post  |
| [**googleDatasetSearchTasksReady**](SerpApi.md#googleDatasetSearchTasksReady) | **GET**  /v3/serp/google/dataset_search/tasks_ready  |
| [**googleDatasetSearchTasksFixed**](SerpApi.md#googleDatasetSearchTasksFixed) | **GET**  /v3/serp/google/dataset_search/tasks_fixed  |
| [**googleDatasetSearchTaskGetAdvanced**](SerpApi.md#googleDatasetSearchTaskGetAdvanced) | **GET**  /v3/serp/google/dataset_search/task_get/advanced/{id}  |
| [**googleDatasetSearchLiveAdvanced**](SerpApi.md#googleDatasetSearchLiveAdvanced) | **POST**  /v3/serp/google/dataset_search/live/advanced  |
| [**googleDatasetInfoTaskPost**](SerpApi.md#googleDatasetInfoTaskPost) | **POST**  /v3/serp/google/dataset_info/task_post  |
| [**googleDatasetInfoTasksReady**](SerpApi.md#googleDatasetInfoTasksReady) | **GET**  /v3/serp/google/dataset_info/tasks_ready  |
| [**googleDatasetInfoTasksFixed**](SerpApi.md#googleDatasetInfoTasksFixed) | **GET**  /v3/serp/google/dataset_info/tasks_fixed  |
| [**googleDatasetInfoTaskGetAdvanced**](SerpApi.md#googleDatasetInfoTaskGetAdvanced) | **GET**  /v3/serp/google/dataset_info/task_get/advanced/{id}  |
| [**googleDatasetInfoLiveAdvanced**](SerpApi.md#googleDatasetInfoLiveAdvanced) | **POST**  /v3/serp/google/dataset_info/live/advanced  |
| [**googleAdsAdvertisersLocations**](SerpApi.md#googleAdsAdvertisersLocations) | **GET**  /v3/serp/google/ads_advertisers/locations  |
| [**googleAdsAdvertisersTaskPost**](SerpApi.md#googleAdsAdvertisersTaskPost) | **POST**  /v3/serp/google/ads_advertisers/task_post  |
| [**googleAdsAdvertisersTasksReady**](SerpApi.md#googleAdsAdvertisersTasksReady) | **GET**  /v3/serp/google/ads_advertisers/tasks_ready  |
| [**googleAdsAdvertisersTaskGetAdvanced**](SerpApi.md#googleAdsAdvertisersTaskGetAdvanced) | **GET**  /v3/serp/google/ads_advertisers/task_get/advanced/{id}  |
| [**googleAdsSearchLocations**](SerpApi.md#googleAdsSearchLocations) | **GET**  /v3/serp/google/ads_search/locations  |
| [**googleAdsSearchTaskPost**](SerpApi.md#googleAdsSearchTaskPost) | **POST**  /v3/serp/google/ads_search/task_post  |
| [**googleAdsSearchTasksReady**](SerpApi.md#googleAdsSearchTasksReady) | **GET**  /v3/serp/google/ads_search/tasks_ready  |
| [**googleAdsSearchTaskGetAdvanced**](SerpApi.md#googleAdsSearchTaskGetAdvanced) | **GET**  /v3/serp/google/ads_search/task_get/advanced/{id}  |
| [**bingLocations**](SerpApi.md#bingLocations) | **GET**  /v3/serp/bing/locations  |
| [**bingLocationsCountry**](SerpApi.md#bingLocationsCountry) | **GET**  /v3/serp/bing/locations/{country}  |
| [**bingLanguages**](SerpApi.md#bingLanguages) | **GET**  /v3/serp/bing/languages  |
| [**bingOrganicTaskPost**](SerpApi.md#bingOrganicTaskPost) | **POST**  /v3/serp/bing/organic/task_post  |
| [**bingOrganicTasksReady**](SerpApi.md#bingOrganicTasksReady) | **GET**  /v3/serp/bing/organic/tasks_ready  |
| [**bingOrganicTasksFixed**](SerpApi.md#bingOrganicTasksFixed) | **GET**  /v3/serp/bing/organic/tasks_fixed  |
| [**bingOrganicTaskGetRegular**](SerpApi.md#bingOrganicTaskGetRegular) | **GET**  /v3/serp/bing/organic/task_get/regular/{id}  |
| [**bingOrganicTaskGetAdvanced**](SerpApi.md#bingOrganicTaskGetAdvanced) | **GET**  /v3/serp/bing/organic/task_get/advanced/{id}  |
| [**bingOrganicTaskGetHtml**](SerpApi.md#bingOrganicTaskGetHtml) | **GET**  /v3/serp/bing/organic/task_get/html/{id}  |
| [**bingOrganicLiveRegular**](SerpApi.md#bingOrganicLiveRegular) | **POST**  /v3/serp/bing/organic/live/regular  |
| [**bingOrganicLiveAdvanced**](SerpApi.md#bingOrganicLiveAdvanced) | **POST**  /v3/serp/bing/organic/live/advanced  |
| [**bingOrganicLiveHtml**](SerpApi.md#bingOrganicLiveHtml) | **POST**  /v3/serp/bing/organic/live/html  |
| [**bingLocalPackTaskPost**](SerpApi.md#bingLocalPackTaskPost) | **POST**  /v3/serp/bing/local_pack/task_post  |
| [**bingLocalPackTasksReady**](SerpApi.md#bingLocalPackTasksReady) | **GET**  /v3/serp/bing/local_pack/tasks_ready  |
| [**bingLocalPackTasksFixed**](SerpApi.md#bingLocalPackTasksFixed) | **GET**  /v3/serp/bing/local_pack/tasks_fixed  |
| [**bingLocalPackTaskGetRegular**](SerpApi.md#bingLocalPackTaskGetRegular) | **GET**  /v3/serp/bing/local_pack/task_get/regular/{id}  |
| [**bingLocalPackTaskGetHtml**](SerpApi.md#bingLocalPackTaskGetHtml) | **GET**  /v3/serp/bing/local_pack/task_get/html/{id}  |
| [**bingLocalPackLiveRegular**](SerpApi.md#bingLocalPackLiveRegular) | **POST**  /v3/serp/bing/local_pack/live/regular  |
| [**bingLocalPackLiveHtml**](SerpApi.md#bingLocalPackLiveHtml) | **POST**  /v3/serp/bing/local_pack/live/html  |
| [**youtubeLocations**](SerpApi.md#youtubeLocations) | **GET**  /v3/serp/youtube/locations  |
| [**youtubeLocationsCountry**](SerpApi.md#youtubeLocationsCountry) | **GET**  /v3/serp/youtube/locations/{country}  |
| [**youtubeLanguages**](SerpApi.md#youtubeLanguages) | **GET**  /v3/serp/youtube/languages  |
| [**youtubeVideoInfoTaskPost**](SerpApi.md#youtubeVideoInfoTaskPost) | **POST**  /v3/serp/youtube/video_info/task_post  |
| [**youtubeVideoInfoTasksReady**](SerpApi.md#youtubeVideoInfoTasksReady) | **GET**  /v3/serp/youtube/video_info/tasks_ready  |
| [**youtubeVideoInfoTasksFixed**](SerpApi.md#youtubeVideoInfoTasksFixed) | **GET**  /v3/serp/youtube/video_info/tasks_fixed  |
| [**youtubeVideoInfoTaskGetAdvanced**](SerpApi.md#youtubeVideoInfoTaskGetAdvanced) | **GET**  /v3/serp/youtube/video_info/task_get/advanced/{id}  |
| [**youtubeVideoInfoLiveAdvanced**](SerpApi.md#youtubeVideoInfoLiveAdvanced) | **POST**  /v3/serp/youtube/video_info/live/advanced  |
| [**youtubeVideoSubtitlesTaskPost**](SerpApi.md#youtubeVideoSubtitlesTaskPost) | **POST**  /v3/serp/youtube/video_subtitles/task_post  |
| [**youtubeVideoSubtitlesTasksReady**](SerpApi.md#youtubeVideoSubtitlesTasksReady) | **GET**  /v3/serp/youtube/video_subtitles/tasks_ready  |
| [**youtubeVideoSubtitlesTasksFixed**](SerpApi.md#youtubeVideoSubtitlesTasksFixed) | **GET**  /v3/serp/youtube/video_subtitles/tasks_fixed  |
| [**youtubeVideoSubtitlesTaskGetAdvanced**](SerpApi.md#youtubeVideoSubtitlesTaskGetAdvanced) | **GET**  /v3/serp/youtube/video_subtitles/task_get/advanced/{id}  |
| [**youtubeVideoSubtitlesLiveAdvanced**](SerpApi.md#youtubeVideoSubtitlesLiveAdvanced) | **POST**  /v3/serp/youtube/video_subtitles/live/advanced  |
| [**youtubeVideoCommentsTaskPost**](SerpApi.md#youtubeVideoCommentsTaskPost) | **POST**  /v3/serp/youtube/video_comments/task_post  |
| [**youtubeVideoCommentsTasksReady**](SerpApi.md#youtubeVideoCommentsTasksReady) | **GET**  /v3/serp/youtube/video_comments/tasks_ready  |
| [**youtubeVideoCommentsTasksFixed**](SerpApi.md#youtubeVideoCommentsTasksFixed) | **GET**  /v3/serp/youtube/video_comments/tasks_fixed  |
| [**youtubeVideoCommentsTaskGetAdvanced**](SerpApi.md#youtubeVideoCommentsTaskGetAdvanced) | **GET**  /v3/serp/youtube/video_comments/task_get/advanced/{id}  |
| [**youtubeVideoCommentsLiveAdvanced**](SerpApi.md#youtubeVideoCommentsLiveAdvanced) | **POST**  /v3/serp/youtube/video_comments/live/advanced  |
| [**yahooLocations**](SerpApi.md#yahooLocations) | **GET**  /v3/serp/yahoo/locations  |
| [**yahooLocationsCountry**](SerpApi.md#yahooLocationsCountry) | **GET**  /v3/serp/yahoo/locations/{country}  |
| [**yahooLanguages**](SerpApi.md#yahooLanguages) | **GET**  /v3/serp/yahoo/languages  |
| [**yahooOrganicTaskPost**](SerpApi.md#yahooOrganicTaskPost) | **POST**  /v3/serp/yahoo/organic/task_post  |
| [**yahooOrganicTasksReady**](SerpApi.md#yahooOrganicTasksReady) | **GET**  /v3/serp/yahoo/organic/tasks_ready  |
| [**yahooOrganicTasksFixed**](SerpApi.md#yahooOrganicTasksFixed) | **GET**  /v3/serp/yahoo/organic/tasks_fixed  |
| [**yahooOrganicTaskGetRegular**](SerpApi.md#yahooOrganicTaskGetRegular) | **GET**  /v3/serp/yahoo/organic/task_get/regular/{id}  |
| [**yahooOrganicTaskGetAdvanced**](SerpApi.md#yahooOrganicTaskGetAdvanced) | **GET**  /v3/serp/yahoo/organic/task_get/advanced/{id}  |
| [**yahooOrganicTaskGetHtml**](SerpApi.md#yahooOrganicTaskGetHtml) | **GET**  /v3/serp/yahoo/organic/task_get/html/{id}  |
| [**yahooOrganicLiveRegular**](SerpApi.md#yahooOrganicLiveRegular) | **POST**  /v3/serp/yahoo/organic/live/regular  |
| [**yahooOrganicLiveAdvanced**](SerpApi.md#yahooOrganicLiveAdvanced) | **POST**  /v3/serp/yahoo/organic/live/advanced  |
| [**yahooOrganicLiveHtml**](SerpApi.md#yahooOrganicLiveHtml) | **POST**  /v3/serp/yahoo/organic/live/html  |
| [**baiduLocations**](SerpApi.md#baiduLocations) | **GET**  /v3/serp/baidu/locations  |
| [**baiduLocationsCountry**](SerpApi.md#baiduLocationsCountry) | **GET**  /v3/serp/baidu/locations/{country}  |
| [**baiduLanguages**](SerpApi.md#baiduLanguages) | **GET**  /v3/serp/baidu/languages  |
| [**baiduOrganicTaskPost**](SerpApi.md#baiduOrganicTaskPost) | **POST**  /v3/serp/baidu/organic/task_post  |
| [**baiduOrganicTasksReady**](SerpApi.md#baiduOrganicTasksReady) | **GET**  /v3/serp/baidu/organic/tasks_ready  |
| [**baiduOrganicTasksFixed**](SerpApi.md#baiduOrganicTasksFixed) | **GET**  /v3/serp/baidu/organic/tasks_fixed  |
| [**baiduOrganicTaskGetRegular**](SerpApi.md#baiduOrganicTaskGetRegular) | **GET**  /v3/serp/baidu/organic/task_get/regular/{id}  |
| [**baiduOrganicTaskGetAdvanced**](SerpApi.md#baiduOrganicTaskGetAdvanced) | **GET**  /v3/serp/baidu/organic/task_get/advanced/{id}  |
| [**baiduOrganicTaskGetHtml**](SerpApi.md#baiduOrganicTaskGetHtml) | **GET**  /v3/serp/baidu/organic/task_get/html/{id}  |
| [**naverOrganicTaskPost**](SerpApi.md#naverOrganicTaskPost) | **POST**  /v3/serp/naver/organic/task_post  |
| [**naverOrganicTasksReady**](SerpApi.md#naverOrganicTasksReady) | **GET**  /v3/serp/naver/organic/tasks_ready  |
| [**naverOrganicTasksFixed**](SerpApi.md#naverOrganicTasksFixed) | **GET**  /v3/serp/naver/organic/tasks_fixed  |
| [**naverOrganicTaskGetRegular**](SerpApi.md#naverOrganicTaskGetRegular) | **GET**  /v3/serp/naver/organic/task_get/regular/{id}  |
| [**naverOrganicTaskGetAdvanced**](SerpApi.md#naverOrganicTaskGetAdvanced) | **GET**  /v3/serp/naver/organic/task_get/advanced/{id}  |
| [**naverOrganicTaskGetHtml**](SerpApi.md#naverOrganicTaskGetHtml) | **GET**  /v3/serp/naver/organic/task_get/html/{id}  |
| [**seznamLocations**](SerpApi.md#seznamLocations) | **GET**  /v3/serp/seznam/locations  |
| [**seznamLocationsCountry**](SerpApi.md#seznamLocationsCountry) | **GET**  /v3/serp/seznam/locations/{country}  |
| [**seznamLanguages**](SerpApi.md#seznamLanguages) | **GET**  /v3/serp/seznam/languages  |
| [**seznamOrganicTaskPost**](SerpApi.md#seznamOrganicTaskPost) | **POST**  /v3/serp/seznam/organic/task_post  |
| [**seznamOrganicTasksReady**](SerpApi.md#seznamOrganicTasksReady) | **GET**  /v3/serp/seznam/organic/tasks_ready  |
| [**seznamOrganicTasksFixed**](SerpApi.md#seznamOrganicTasksFixed) | **GET**  /v3/serp/seznam/organic/tasks_fixed  |
| [**seznamOrganicTaskGetRegular**](SerpApi.md#seznamOrganicTaskGetRegular) | **GET**  /v3/serp/seznam/organic/task_get/regular/{id}  |
| [**seznamOrganicTaskGetAdvanced**](SerpApi.md#seznamOrganicTaskGetAdvanced) | **GET**  /v3/serp/seznam/organic/task_get/advanced/{id}  |
| [**seznamOrganicTaskGetHtml**](SerpApi.md#seznamOrganicTaskGetHtml) | **GET**  /v3/serp/seznam/organic/task_get/html/{id}  |
| [**googleFinanceExploreTaskPost**](SerpApi.md#googleFinanceExploreTaskPost) | **POST**  /v3/serp/google/finance_explore/task_post  |
| [**googleFinanceExploreTasksReady**](SerpApi.md#googleFinanceExploreTasksReady) | **GET**  /v3/serp/google/finance_explore/tasks_ready  |
| [**googleFinanceExploreTaskGetAdvanced**](SerpApi.md#googleFinanceExploreTaskGetAdvanced) | **GET**  /v3/serp/google/finance_explore/task_get/advanced/{id}  |
| [**googleFinanceExploreTaskGetHtml**](SerpApi.md#googleFinanceExploreTaskGetHtml) | **GET**  /v3/serp/google/finance_explore/task_get/html/{id}  |
| [**googleFinanceExploreLiveAdvanced**](SerpApi.md#googleFinanceExploreLiveAdvanced) | **POST**  /v3/serp/google/finance_explore/live/advanced  |
| [**googleFinanceExploreLiveHtml**](SerpApi.md#googleFinanceExploreLiveHtml) | **POST**  /v3/serp/google/finance_explore/live/html  |
| [**googleFinanceMarketsTaskPost**](SerpApi.md#googleFinanceMarketsTaskPost) | **POST**  /v3/serp/google/finance_markets/task_post  |
| [**googleFinanceMarketsTasksReady**](SerpApi.md#googleFinanceMarketsTasksReady) | **GET**  /v3/serp/google/finance_markets/tasks_ready  |
| [**googleFinanceMarketsTaskGetAdvanced**](SerpApi.md#googleFinanceMarketsTaskGetAdvanced) | **GET**  /v3/serp/google/finance_markets/task_get/advanced/{id}  |
| [**googleFinanceMarketsTaskGetHtml**](SerpApi.md#googleFinanceMarketsTaskGetHtml) | **GET**  /v3/serp/google/finance_markets/task_get/html/{id}  |
| [**googleFinanceMarketsLiveAdvanced**](SerpApi.md#googleFinanceMarketsLiveAdvanced) | **POST**  /v3/serp/google/finance_markets/live/advanced  |
| [**googleFinanceMarketsLiveHtml**](SerpApi.md#googleFinanceMarketsLiveHtml) | **POST**  /v3/serp/google/finance_markets/live/html  |
| [**googleFinanceQuoteTaskPost**](SerpApi.md#googleFinanceQuoteTaskPost) | **POST**  /v3/serp/google/finance_quote/task_post  |
| [**googleFinanceQuoteTasksReady**](SerpApi.md#googleFinanceQuoteTasksReady) | **GET**  /v3/serp/google/finance_quote/tasks_ready  |
| [**googleFinanceQuoteTaskGetAdvanced**](SerpApi.md#googleFinanceQuoteTaskGetAdvanced) | **GET**  /v3/serp/google/finance_quote/task_get/advanced/{id}  |
| [**googleFinanceQuoteTaskGetHtml**](SerpApi.md#googleFinanceQuoteTaskGetHtml) | **GET**  /v3/serp/google/finance_quote/task_get/html/{id}  |
| [**googleFinanceQuoteLiveAdvanced**](SerpApi.md#googleFinanceQuoteLiveAdvanced) | **POST**  /v3/serp/google/finance_quote/live/advanced  |
| [**googleFinanceQuoteLiveHtml**](SerpApi.md#googleFinanceQuoteLiveHtml) | **POST**  /v3/serp/google/finance_quote/live/html  |
| [**googleFinanceTickerSearchTaskPost**](SerpApi.md#googleFinanceTickerSearchTaskPost) | **POST**  /v3/serp/google/finance_ticker_search/task_post  |
| [**googleFinanceTickerSearchTasksReady**](SerpApi.md#googleFinanceTickerSearchTasksReady) | **GET**  /v3/serp/google/finance_ticker_search/tasks_ready  |
| [**googleFinanceTickerSearchTaskGetAdvanced**](SerpApi.md#googleFinanceTickerSearchTaskGetAdvanced) | **GET**  /v3/serp/google/finance_ticker_search/task_get/advanced/{id}  |
| [**googleFinanceTickerSearchLiveAdvanced**](SerpApi.md#googleFinanceTickerSearchLiveAdvanced) | **POST**  /v3/serp/google/finance_ticker_search/live/advanced  |

<a id="idList"></a>
# **idList**
> SerpIdListResponseInfo idList()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpIdListResponseInfo response = apiInstance.idList(
       List.of(
    
           new SerpIdListRequestInfo()
        
           .datetimeFrom()
        
        
           .datetimeTo()
        
        
           .limit(100)
        
        
           .offset(0)
        
        
           .sort("desc")
        
        
           .includeMetadata(true)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#idList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpIdListRequestInfo>&gt;**](List<SerpIdListRequestInfo>.md)|  | [optional] |



### Return type

[**SerpIdListResponseInfo**](SerpIdListResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="errors"></a>
# **errors**
> SerpErrorsResponseInfo errors()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpErrorsResponseInfo response = apiInstance.errors(
       List.of(
    
           new SerpErrorsRequestInfo()
        
           .limit(10)
        
        
           .offset(0)
        
        
           .filteredFunction("pingback_url")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#errors");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpErrorsRequestInfo>&gt;**](List<SerpErrorsRequestInfo>.md)|  | [optional] |



### Return type

[**SerpErrorsResponseInfo**](SerpErrorsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="screenshot"></a>
# **screenshot**
> SerpScreenshotResponseInfo screenshot()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpScreenshotResponseInfo response = apiInstance.screenshot(
       List.of(
    
           new SerpScreenshotRequestInfo()
        
           .taskId("06211235-0696-0139-1000-36727fbd3c90")
        
        
           .browserScreenScaleFactor(0.5d)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#screenshot");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpScreenshotRequestInfo>&gt;**](List<SerpScreenshotRequestInfo>.md)|  | [optional] |



### Return type

[**SerpScreenshotResponseInfo**](SerpScreenshotResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="aiSummary"></a>
# **aiSummary**
> SerpAiSummaryResponseInfo aiSummary()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpAiSummaryResponseInfo response = apiInstance.aiSummary(
       List.of(
    
           new SerpAiSummaryRequestInfo()
        
           .taskId("07031739-1535-0139-0000-9d1e639a5b7d")
        
        
           .prompt("explain what DataForSEO is")
        
        
           .includeLinks(true)
        
        
           .fetchContent(true)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#aiSummary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpAiSummaryRequestInfo>&gt;**](List<SerpAiSummaryRequestInfo>.md)|  | [optional] |



### Return type

[**SerpAiSummaryResponseInfo**](SerpAiSummaryResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleLocations"></a>
# **googleLocations**
> SerpGoogleLocationsResponseInfo googleLocations()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleLocationsResponseInfo response = apiInstance.googleLocations();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleLocations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleLocationsResponseInfo**](SerpGoogleLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleLocationsCountry"></a>
# **googleLocationsCountry**
> SerpGoogleLocationsCountryResponseInfo googleLocationsCountry()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String country = ;
    SerpGoogleLocationsCountryResponseInfo response = apiInstance.googleLocationsCountry(country);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleLocationsCountry");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleLocationsCountryResponseInfo**](SerpGoogleLocationsCountryResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleLanguages"></a>
# **googleLanguages**
> SerpGoogleLanguagesResponseInfo googleLanguages()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleLanguagesResponseInfo response = apiInstance.googleLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleLanguages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleLanguagesResponseInfo**](SerpGoogleLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleOrganicTaskPost"></a>
# **googleOrganicTaskPost**
> SerpGoogleOrganicTaskPostResponseInfo googleOrganicTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleOrganicTaskPostResponseInfo response = apiInstance.googleOrganicTaskPost(
       List.of(
    
           new SerpGoogleOrganicTaskPostRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein"),
    
           new SerpGoogleOrganicTaskPostRequestInfo()
        
           .languageName("English")
        
        
           .locationName("United States")
        
        
           .keyword("albert einstein")
        
        
           .priority(2)
        
        
           .tag("some_string_123")
        
        
           .pingbackUrl("https://your-server.com/pingscript?id=$id&tag=$tag"),
    
           new SerpGoogleOrganicTaskPostRequestInfo()
        
           .url("https://www.google.co.uk/search?q=albert%20einstein&hl=en&gl=GB&uule=w+CAIQIFISCXXeIa8LoNhHEZkq1d1aOpZS")
        
        
           .postbackData("html")
        
        
           .postbackUrl("https://your-server.com/postbackscript")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleOrganicTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleOrganicTaskPostRequestInfo>&gt;**](List<SerpGoogleOrganicTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleOrganicTaskPostResponseInfo**](SerpGoogleOrganicTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleOrganicTasksReady"></a>
# **googleOrganicTasksReady**
> SerpGoogleOrganicTasksReadyResponseInfo googleOrganicTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleOrganicTasksReadyResponseInfo response = apiInstance.googleOrganicTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleOrganicTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleOrganicTasksReadyResponseInfo**](SerpGoogleOrganicTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="tasksReady"></a>
# **tasksReady**
> SerpTasksReadyResponseInfo tasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpTasksReadyResponseInfo response = apiInstance.tasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#tasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpTasksReadyResponseInfo**](SerpTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleOrganicTasksFixed"></a>
# **googleOrganicTasksFixed**
> SerpGoogleOrganicTasksFixedResponseInfo googleOrganicTasksFixed()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleOrganicTasksFixedResponseInfo response = apiInstance.googleOrganicTasksFixed();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleOrganicTasksFixed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleOrganicTasksFixedResponseInfo**](SerpGoogleOrganicTasksFixedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleOrganicTaskGetRegular"></a>
# **googleOrganicTaskGetRegular**
> SerpGoogleOrganicTaskGetRegularResponseInfo googleOrganicTaskGetRegular()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleOrganicTaskGetRegularResponseInfo response = apiInstance.googleOrganicTaskGetRegular(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleOrganicTaskGetRegular");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleOrganicTaskGetRegularResponseInfo**](SerpGoogleOrganicTaskGetRegularResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleOrganicTaskGetAdvanced"></a>
# **googleOrganicTaskGetAdvanced**
> SerpGoogleOrganicTaskGetAdvancedResponseInfo googleOrganicTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleOrganicTaskGetAdvancedResponseInfo response = apiInstance.googleOrganicTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleOrganicTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleOrganicTaskGetAdvancedResponseInfo**](SerpGoogleOrganicTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleOrganicTaskGetHtml"></a>
# **googleOrganicTaskGetHtml**
> SerpGoogleOrganicTaskGetHtmlResponseInfo googleOrganicTaskGetHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleOrganicTaskGetHtmlResponseInfo response = apiInstance.googleOrganicTaskGetHtml(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleOrganicTaskGetHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleOrganicTaskGetHtmlResponseInfo**](SerpGoogleOrganicTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleOrganicLiveRegular"></a>
# **googleOrganicLiveRegular**
> SerpGoogleOrganicLiveRegularResponseInfo googleOrganicLiveRegular()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleOrganicLiveRegularResponseInfo response = apiInstance.googleOrganicLiveRegular(
       List.of(
    
           new SerpGoogleOrganicLiveRegularRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleOrganicLiveRegular");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleOrganicLiveRegularRequestInfo>&gt;**](List<SerpGoogleOrganicLiveRegularRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleOrganicLiveRegularResponseInfo**](SerpGoogleOrganicLiveRegularResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleOrganicLiveAdvanced"></a>
# **googleOrganicLiveAdvanced**
> SerpGoogleOrganicLiveAdvancedResponseInfo googleOrganicLiveAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleOrganicLiveAdvancedResponseInfo response = apiInstance.googleOrganicLiveAdvanced(
       List.of(
    
           new SerpGoogleOrganicLiveAdvancedRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
        
        
           .calculateRectangles(true)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleOrganicLiveAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleOrganicLiveAdvancedRequestInfo>&gt;**](List<SerpGoogleOrganicLiveAdvancedRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleOrganicLiveAdvancedResponseInfo**](SerpGoogleOrganicLiveAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleOrganicLiveHtml"></a>
# **googleOrganicLiveHtml**
> SerpGoogleOrganicLiveHtmlResponseInfo googleOrganicLiveHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleOrganicLiveHtmlResponseInfo response = apiInstance.googleOrganicLiveHtml(
       List.of(
    
           new SerpGoogleOrganicLiveHtmlRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleOrganicLiveHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleOrganicLiveHtmlRequestInfo>&gt;**](List<SerpGoogleOrganicLiveHtmlRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleOrganicLiveHtmlResponseInfo**](SerpGoogleOrganicLiveHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAiModeLanguages"></a>
# **googleAiModeLanguages**
> SerpGoogleAiModeLanguagesResponseInfo googleAiModeLanguages()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleAiModeLanguagesResponseInfo response = apiInstance.googleAiModeLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleAiModeLanguages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleAiModeLanguagesResponseInfo**](SerpGoogleAiModeLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAiModeTaskPost"></a>
# **googleAiModeTaskPost**
> SerpGoogleAiModeTaskPostResponseInfo googleAiModeTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleAiModeTaskPostResponseInfo response = apiInstance.googleAiModeTaskPost(
       List.of(
    
           new SerpGoogleAiModeTaskPostRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("what is google ai mode")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleAiModeTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleAiModeTaskPostRequestInfo>&gt;**](List<SerpGoogleAiModeTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleAiModeTaskPostResponseInfo**](SerpGoogleAiModeTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAiModeTasksReady"></a>
# **googleAiModeTasksReady**
> SerpGoogleAiModeTasksReadyResponseInfo googleAiModeTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleAiModeTasksReadyResponseInfo response = apiInstance.googleAiModeTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleAiModeTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleAiModeTasksReadyResponseInfo**](SerpGoogleAiModeTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAiModeTasksFixed"></a>
# **googleAiModeTasksFixed**
> SerpGoogleAiModeTasksFixedResponseInfo googleAiModeTasksFixed()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleAiModeTasksFixedResponseInfo response = apiInstance.googleAiModeTasksFixed();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleAiModeTasksFixed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleAiModeTasksFixedResponseInfo**](SerpGoogleAiModeTasksFixedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAiModeTaskGetAdvanced"></a>
# **googleAiModeTaskGetAdvanced**
> SerpGoogleAiModeTaskGetAdvancedResponseInfo googleAiModeTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleAiModeTaskGetAdvancedResponseInfo response = apiInstance.googleAiModeTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleAiModeTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleAiModeTaskGetAdvancedResponseInfo**](SerpGoogleAiModeTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAiModeTaskGetHtml"></a>
# **googleAiModeTaskGetHtml**
> SerpGoogleAiModeTaskGetHtmlResponseInfo googleAiModeTaskGetHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleAiModeTaskGetHtmlResponseInfo response = apiInstance.googleAiModeTaskGetHtml(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleAiModeTaskGetHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleAiModeTaskGetHtmlResponseInfo**](SerpGoogleAiModeTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAiModeLiveAdvanced"></a>
# **googleAiModeLiveAdvanced**
> SerpGoogleAiModeLiveAdvancedResponseInfo googleAiModeLiveAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleAiModeLiveAdvancedResponseInfo response = apiInstance.googleAiModeLiveAdvanced(
       List.of(
    
           new SerpGoogleAiModeLiveAdvancedRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("what is google ai mode")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleAiModeLiveAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleAiModeLiveAdvancedRequestInfo>&gt;**](List<SerpGoogleAiModeLiveAdvancedRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleAiModeLiveAdvancedResponseInfo**](SerpGoogleAiModeLiveAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAiModeLiveHtml"></a>
# **googleAiModeLiveHtml**
> SerpGoogleAiModeLiveHtmlResponseInfo googleAiModeLiveHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleAiModeLiveHtmlResponseInfo response = apiInstance.googleAiModeLiveHtml(
       List.of(
    
           new SerpGoogleAiModeLiveHtmlRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleAiModeLiveHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleAiModeLiveHtmlRequestInfo>&gt;**](List<SerpGoogleAiModeLiveHtmlRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleAiModeLiveHtmlResponseInfo**](SerpGoogleAiModeLiveHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleMapsTaskPost"></a>
# **googleMapsTaskPost**
> SerpGoogleMapsTaskPostResponseInfo googleMapsTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleMapsTaskPostResponseInfo response = apiInstance.googleMapsTaskPost(
       List.of(
    
           new SerpGoogleMapsTaskPostRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleMapsTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleMapsTaskPostRequestInfo>&gt;**](List<SerpGoogleMapsTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleMapsTaskPostResponseInfo**](SerpGoogleMapsTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleMapsTasksReady"></a>
# **googleMapsTasksReady**
> SerpGoogleMapsTasksReadyResponseInfo googleMapsTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleMapsTasksReadyResponseInfo response = apiInstance.googleMapsTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleMapsTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleMapsTasksReadyResponseInfo**](SerpGoogleMapsTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleMapsTasksFixed"></a>
# **googleMapsTasksFixed**
> SerpGoogleMapsTasksFixedResponseInfo googleMapsTasksFixed()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleMapsTasksFixedResponseInfo response = apiInstance.googleMapsTasksFixed();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleMapsTasksFixed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleMapsTasksFixedResponseInfo**](SerpGoogleMapsTasksFixedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleMapsTaskGetAdvanced"></a>
# **googleMapsTaskGetAdvanced**
> SerpGoogleMapsTaskGetAdvancedResponseInfo googleMapsTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleMapsTaskGetAdvancedResponseInfo response = apiInstance.googleMapsTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleMapsTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleMapsTaskGetAdvancedResponseInfo**](SerpGoogleMapsTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleMapsLiveAdvanced"></a>
# **googleMapsLiveAdvanced**
> SerpGoogleMapsLiveAdvancedResponseInfo googleMapsLiveAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleMapsLiveAdvancedResponseInfo response = apiInstance.googleMapsLiveAdvanced(
       List.of(
    
           new SerpGoogleMapsLiveAdvancedRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleMapsLiveAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleMapsLiveAdvancedRequestInfo>&gt;**](List<SerpGoogleMapsLiveAdvancedRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleMapsLiveAdvancedResponseInfo**](SerpGoogleMapsLiveAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleLocalFinderTaskPost"></a>
# **googleLocalFinderTaskPost**
> SerpGoogleLocalFinderTaskPostResponseInfo googleLocalFinderTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleLocalFinderTaskPostResponseInfo response = apiInstance.googleLocalFinderTaskPost(
       List.of(
    
           new SerpGoogleLocalFinderTaskPostRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("local nail services")
        
        
           .minRating(4.5d)
        
        
           .timeFilter("monday")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleLocalFinderTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleLocalFinderTaskPostRequestInfo>&gt;**](List<SerpGoogleLocalFinderTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleLocalFinderTaskPostResponseInfo**](SerpGoogleLocalFinderTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleLocalFinderTasksReady"></a>
# **googleLocalFinderTasksReady**
> SerpGoogleLocalFinderTasksReadyResponseInfo googleLocalFinderTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleLocalFinderTasksReadyResponseInfo response = apiInstance.googleLocalFinderTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleLocalFinderTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleLocalFinderTasksReadyResponseInfo**](SerpGoogleLocalFinderTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleLocalFinderTasksFixed"></a>
# **googleLocalFinderTasksFixed**
> SerpGoogleLocalFinderTasksFixedResponseInfo googleLocalFinderTasksFixed()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleLocalFinderTasksFixedResponseInfo response = apiInstance.googleLocalFinderTasksFixed();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleLocalFinderTasksFixed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleLocalFinderTasksFixedResponseInfo**](SerpGoogleLocalFinderTasksFixedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleLocalFinderTaskGetAdvanced"></a>
# **googleLocalFinderTaskGetAdvanced**
> SerpGoogleLocalFinderTaskGetAdvancedResponseInfo googleLocalFinderTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleLocalFinderTaskGetAdvancedResponseInfo response = apiInstance.googleLocalFinderTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleLocalFinderTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleLocalFinderTaskGetAdvancedResponseInfo**](SerpGoogleLocalFinderTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleLocalFinderTaskGetHtml"></a>
# **googleLocalFinderTaskGetHtml**
> SerpGoogleLocalFinderTaskGetHtmlResponseInfo googleLocalFinderTaskGetHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleLocalFinderTaskGetHtmlResponseInfo response = apiInstance.googleLocalFinderTaskGetHtml(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleLocalFinderTaskGetHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleLocalFinderTaskGetHtmlResponseInfo**](SerpGoogleLocalFinderTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleLocalFinderLiveAdvanced"></a>
# **googleLocalFinderLiveAdvanced**
> SerpGoogleLocalFinderLiveAdvancedResponseInfo googleLocalFinderLiveAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleLocalFinderLiveAdvancedResponseInfo response = apiInstance.googleLocalFinderLiveAdvanced(
       List.of(
    
           new SerpGoogleLocalFinderLiveAdvancedRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("local nail services")
        
        
           .minRating(4.5d)
        
        
           .timeFilter("monday")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleLocalFinderLiveAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleLocalFinderLiveAdvancedRequestInfo>&gt;**](List<SerpGoogleLocalFinderLiveAdvancedRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleLocalFinderLiveAdvancedResponseInfo**](SerpGoogleLocalFinderLiveAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleLocalFinderLiveHtml"></a>
# **googleLocalFinderLiveHtml**
> SerpGoogleLocalFinderLiveHtmlResponseInfo googleLocalFinderLiveHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleLocalFinderLiveHtmlResponseInfo response = apiInstance.googleLocalFinderLiveHtml(
       List.of(
    
           new SerpGoogleLocalFinderLiveHtmlRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleLocalFinderLiveHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleLocalFinderLiveHtmlRequestInfo>&gt;**](List<SerpGoogleLocalFinderLiveHtmlRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleLocalFinderLiveHtmlResponseInfo**](SerpGoogleLocalFinderLiveHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleNewsTaskPost"></a>
# **googleNewsTaskPost**
> SerpGoogleNewsTaskPostResponseInfo googleNewsTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleNewsTaskPostResponseInfo response = apiInstance.googleNewsTaskPost(
       List.of(
    
           new SerpGoogleNewsTaskPostRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleNewsTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleNewsTaskPostRequestInfo>&gt;**](List<SerpGoogleNewsTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleNewsTaskPostResponseInfo**](SerpGoogleNewsTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleNewsTasksReady"></a>
# **googleNewsTasksReady**
> SerpGoogleNewsTasksReadyResponseInfo googleNewsTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleNewsTasksReadyResponseInfo response = apiInstance.googleNewsTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleNewsTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleNewsTasksReadyResponseInfo**](SerpGoogleNewsTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleNewsTasksFixed"></a>
# **googleNewsTasksFixed**
> SerpGoogleNewsTasksFixedResponseInfo googleNewsTasksFixed()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleNewsTasksFixedResponseInfo response = apiInstance.googleNewsTasksFixed();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleNewsTasksFixed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleNewsTasksFixedResponseInfo**](SerpGoogleNewsTasksFixedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleNewsTaskGetAdvanced"></a>
# **googleNewsTaskGetAdvanced**
> SerpGoogleNewsTaskGetAdvancedResponseInfo googleNewsTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleNewsTaskGetAdvancedResponseInfo response = apiInstance.googleNewsTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleNewsTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleNewsTaskGetAdvancedResponseInfo**](SerpGoogleNewsTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleNewsTaskGetHtml"></a>
# **googleNewsTaskGetHtml**
> SerpGoogleNewsTaskGetHtmlResponseInfo googleNewsTaskGetHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleNewsTaskGetHtmlResponseInfo response = apiInstance.googleNewsTaskGetHtml(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleNewsTaskGetHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleNewsTaskGetHtmlResponseInfo**](SerpGoogleNewsTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleNewsLiveAdvanced"></a>
# **googleNewsLiveAdvanced**
> SerpGoogleNewsLiveAdvancedResponseInfo googleNewsLiveAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleNewsLiveAdvancedResponseInfo response = apiInstance.googleNewsLiveAdvanced(
       List.of(
    
           new SerpGoogleNewsLiveAdvancedRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("android")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleNewsLiveAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleNewsLiveAdvancedRequestInfo>&gt;**](List<SerpGoogleNewsLiveAdvancedRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleNewsLiveAdvancedResponseInfo**](SerpGoogleNewsLiveAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleNewsLiveHtml"></a>
# **googleNewsLiveHtml**
> SerpGoogleNewsLiveHtmlResponseInfo googleNewsLiveHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleNewsLiveHtmlResponseInfo response = apiInstance.googleNewsLiveHtml(
       List.of(
    
           new SerpGoogleNewsLiveHtmlRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleNewsLiveHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleNewsLiveHtmlRequestInfo>&gt;**](List<SerpGoogleNewsLiveHtmlRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleNewsLiveHtmlResponseInfo**](SerpGoogleNewsLiveHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleEventsTaskPost"></a>
# **googleEventsTaskPost**
> SerpGoogleEventsTaskPostResponseInfo googleEventsTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleEventsTaskPostResponseInfo response = apiInstance.googleEventsTaskPost(
       List.of(
    
           new SerpGoogleEventsTaskPostRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleEventsTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleEventsTaskPostRequestInfo>&gt;**](List<SerpGoogleEventsTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleEventsTaskPostResponseInfo**](SerpGoogleEventsTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleEventsTasksReady"></a>
# **googleEventsTasksReady**
> SerpGoogleEventsTasksReadyResponseInfo googleEventsTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleEventsTasksReadyResponseInfo response = apiInstance.googleEventsTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleEventsTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleEventsTasksReadyResponseInfo**](SerpGoogleEventsTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleEventsTasksFixed"></a>
# **googleEventsTasksFixed**
> SerpGoogleEventsTasksFixedResponseInfo googleEventsTasksFixed()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleEventsTasksFixedResponseInfo response = apiInstance.googleEventsTasksFixed();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleEventsTasksFixed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleEventsTasksFixedResponseInfo**](SerpGoogleEventsTasksFixedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleEventsTaskGetAdvanced"></a>
# **googleEventsTaskGetAdvanced**
> SerpGoogleEventsTaskGetAdvancedResponseInfo googleEventsTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleEventsTaskGetAdvancedResponseInfo response = apiInstance.googleEventsTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleEventsTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleEventsTaskGetAdvancedResponseInfo**](SerpGoogleEventsTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleEventsLiveAdvanced"></a>
# **googleEventsLiveAdvanced**
> SerpGoogleEventsLiveAdvancedResponseInfo googleEventsLiveAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleEventsLiveAdvancedResponseInfo response = apiInstance.googleEventsLiveAdvanced(
       List.of(
    
           new SerpGoogleEventsLiveAdvancedRequestInfo()
        
           .keyword("concerts")
        
        
           .locationName("Los Angeles,California,United States")
        
        
           .dateRange("today")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleEventsLiveAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleEventsLiveAdvancedRequestInfo>&gt;**](List<SerpGoogleEventsLiveAdvancedRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleEventsLiveAdvancedResponseInfo**](SerpGoogleEventsLiveAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleImagesTaskPost"></a>
# **googleImagesTaskPost**
> SerpGoogleImagesTaskPostResponseInfo googleImagesTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleImagesTaskPostResponseInfo response = apiInstance.googleImagesTaskPost(
       List.of(
    
           new SerpGoogleImagesTaskPostRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleImagesTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleImagesTaskPostRequestInfo>&gt;**](List<SerpGoogleImagesTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleImagesTaskPostResponseInfo**](SerpGoogleImagesTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleImagesTasksReady"></a>
# **googleImagesTasksReady**
> SerpGoogleImagesTasksReadyResponseInfo googleImagesTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleImagesTasksReadyResponseInfo response = apiInstance.googleImagesTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleImagesTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleImagesTasksReadyResponseInfo**](SerpGoogleImagesTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleImagesTasksFixed"></a>
# **googleImagesTasksFixed**
> SerpGoogleImagesTasksFixedResponseInfo googleImagesTasksFixed()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleImagesTasksFixedResponseInfo response = apiInstance.googleImagesTasksFixed();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleImagesTasksFixed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleImagesTasksFixedResponseInfo**](SerpGoogleImagesTasksFixedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleImagesTaskGetAdvanced"></a>
# **googleImagesTaskGetAdvanced**
> SerpGoogleImagesTaskGetAdvancedResponseInfo googleImagesTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleImagesTaskGetAdvancedResponseInfo response = apiInstance.googleImagesTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleImagesTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleImagesTaskGetAdvancedResponseInfo**](SerpGoogleImagesTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleImagesTaskGetHtml"></a>
# **googleImagesTaskGetHtml**
> SerpGoogleImagesTaskGetHtmlResponseInfo googleImagesTaskGetHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleImagesTaskGetHtmlResponseInfo response = apiInstance.googleImagesTaskGetHtml(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleImagesTaskGetHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleImagesTaskGetHtmlResponseInfo**](SerpGoogleImagesTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleImagesLiveAdvanced"></a>
# **googleImagesLiveAdvanced**
> SerpGoogleImagesLiveAdvancedResponseInfo googleImagesLiveAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleImagesLiveAdvancedResponseInfo response = apiInstance.googleImagesLiveAdvanced(
       List.of(
    
           new SerpGoogleImagesLiveAdvancedRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleImagesLiveAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleImagesLiveAdvancedRequestInfo>&gt;**](List<SerpGoogleImagesLiveAdvancedRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleImagesLiveAdvancedResponseInfo**](SerpGoogleImagesLiveAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleImagesLiveHtml"></a>
# **googleImagesLiveHtml**
> SerpGoogleImagesLiveHtmlResponseInfo googleImagesLiveHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleImagesLiveHtmlResponseInfo response = apiInstance.googleImagesLiveHtml(
       List.of(
    
           new SerpGoogleImagesLiveHtmlRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleImagesLiveHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleImagesLiveHtmlRequestInfo>&gt;**](List<SerpGoogleImagesLiveHtmlRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleImagesLiveHtmlResponseInfo**](SerpGoogleImagesLiveHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleSearchByImageTaskPost"></a>
# **googleSearchByImageTaskPost**
> SerpGoogleSearchByImageTaskPostResponseInfo googleSearchByImageTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleSearchByImageTaskPostResponseInfo response = apiInstance.googleSearchByImageTaskPost(
       List.of(
    
           new SerpGoogleSearchByImageTaskPostRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .imageUrl("https://dataforseo.com/wp-content/uploads/2016/11/data_for_seo_light_429.png")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleSearchByImageTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleSearchByImageTaskPostRequestInfo>&gt;**](List<SerpGoogleSearchByImageTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleSearchByImageTaskPostResponseInfo**](SerpGoogleSearchByImageTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleSearchByImageTasksReady"></a>
# **googleSearchByImageTasksReady**
> SerpGoogleSearchByImageTasksReadyResponseInfo googleSearchByImageTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleSearchByImageTasksReadyResponseInfo response = apiInstance.googleSearchByImageTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleSearchByImageTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleSearchByImageTasksReadyResponseInfo**](SerpGoogleSearchByImageTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleSearchByImageTasksFixed"></a>
# **googleSearchByImageTasksFixed**
> SerpGoogleSearchByImageTasksFixedResponseInfo googleSearchByImageTasksFixed()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleSearchByImageTasksFixedResponseInfo response = apiInstance.googleSearchByImageTasksFixed();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleSearchByImageTasksFixed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleSearchByImageTasksFixedResponseInfo**](SerpGoogleSearchByImageTasksFixedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleSearchByImageTaskGetAdvanced"></a>
# **googleSearchByImageTaskGetAdvanced**
> SerpGoogleSearchByImageTaskGetAdvancedResponseInfo googleSearchByImageTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleSearchByImageTaskGetAdvancedResponseInfo response = apiInstance.googleSearchByImageTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleSearchByImageTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleSearchByImageTaskGetAdvancedResponseInfo**](SerpGoogleSearchByImageTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleJobsTaskPost"></a>
# **googleJobsTaskPost**
> SerpGoogleJobsTaskPostResponseInfo googleJobsTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleJobsTaskPostResponseInfo response = apiInstance.googleJobsTaskPost(
       List.of(
    
           new SerpGoogleJobsTaskPostRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword(".net developer"),
    
           new SerpGoogleJobsTaskPostRequestInfo()
        
           .languageName("English")
        
        
           .locationName("United States")
        
        
           .keyword(".net developer")
        
        
           .tag("some_string_123")
        
        
           .pingbackUrl("https://your-server.com/pingscript?id=$id&tag=$tag")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleJobsTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleJobsTaskPostRequestInfo>&gt;**](List<SerpGoogleJobsTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleJobsTaskPostResponseInfo**](SerpGoogleJobsTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleJobsTasksReady"></a>
# **googleJobsTasksReady**
> SerpGoogleJobsTasksReadyResponseInfo googleJobsTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleJobsTasksReadyResponseInfo response = apiInstance.googleJobsTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleJobsTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleJobsTasksReadyResponseInfo**](SerpGoogleJobsTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleJobsTasksFixed"></a>
# **googleJobsTasksFixed**
> SerpGoogleJobsTasksFixedResponseInfo googleJobsTasksFixed()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleJobsTasksFixedResponseInfo response = apiInstance.googleJobsTasksFixed();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleJobsTasksFixed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleJobsTasksFixedResponseInfo**](SerpGoogleJobsTasksFixedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleJobsTaskGetAdvanced"></a>
# **googleJobsTaskGetAdvanced**
> SerpGoogleJobsTaskGetAdvancedResponseInfo googleJobsTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleJobsTaskGetAdvancedResponseInfo response = apiInstance.googleJobsTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleJobsTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleJobsTaskGetAdvancedResponseInfo**](SerpGoogleJobsTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleJobsTaskGetHtml"></a>
# **googleJobsTaskGetHtml**
> SerpGoogleJobsTaskGetHtmlResponseInfo googleJobsTaskGetHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleJobsTaskGetHtmlResponseInfo response = apiInstance.googleJobsTaskGetHtml(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleJobsTaskGetHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleJobsTaskGetHtmlResponseInfo**](SerpGoogleJobsTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAutocompleteTaskPost"></a>
# **googleAutocompleteTaskPost**
> SerpGoogleAutocompleteTaskPostResponseInfo googleAutocompleteTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleAutocompleteTaskPostResponseInfo response = apiInstance.googleAutocompleteTaskPost(
       List.of(
    
           new SerpGoogleAutocompleteTaskPostRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
        
        
           .cursorPointer(6)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleAutocompleteTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleAutocompleteTaskPostRequestInfo>&gt;**](List<SerpGoogleAutocompleteTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleAutocompleteTaskPostResponseInfo**](SerpGoogleAutocompleteTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAutocompleteTasksReady"></a>
# **googleAutocompleteTasksReady**
> SerpGoogleAutocompleteTasksReadyResponseInfo googleAutocompleteTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleAutocompleteTasksReadyResponseInfo response = apiInstance.googleAutocompleteTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleAutocompleteTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleAutocompleteTasksReadyResponseInfo**](SerpGoogleAutocompleteTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAutocompleteTasksFixed"></a>
# **googleAutocompleteTasksFixed**
> SerpGoogleAutocompleteTasksFixedResponseInfo googleAutocompleteTasksFixed()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleAutocompleteTasksFixedResponseInfo response = apiInstance.googleAutocompleteTasksFixed();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleAutocompleteTasksFixed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleAutocompleteTasksFixedResponseInfo**](SerpGoogleAutocompleteTasksFixedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAutocompleteTaskGetAdvanced"></a>
# **googleAutocompleteTaskGetAdvanced**
> SerpGoogleAutocompleteTaskGetAdvancedResponseInfo googleAutocompleteTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleAutocompleteTaskGetAdvancedResponseInfo response = apiInstance.googleAutocompleteTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleAutocompleteTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleAutocompleteTaskGetAdvancedResponseInfo**](SerpGoogleAutocompleteTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAutocompleteLiveAdvanced"></a>
# **googleAutocompleteLiveAdvanced**
> SerpGoogleAutocompleteLiveAdvancedResponseInfo googleAutocompleteLiveAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleAutocompleteLiveAdvancedResponseInfo response = apiInstance.googleAutocompleteLiveAdvanced(
       List.of(
    
           new SerpGoogleAutocompleteLiveAdvancedRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
        
        
           .client("gws-wiz-serp")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleAutocompleteLiveAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleAutocompleteLiveAdvancedRequestInfo>&gt;**](List<SerpGoogleAutocompleteLiveAdvancedRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleAutocompleteLiveAdvancedResponseInfo**](SerpGoogleAutocompleteLiveAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleDatasetSearchTaskPost"></a>
# **googleDatasetSearchTaskPost**
> SerpGoogleDatasetSearchTaskPostResponseInfo googleDatasetSearchTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleDatasetSearchTaskPostResponseInfo response = apiInstance.googleDatasetSearchTaskPost(
       List.of(
    
           new SerpGoogleDatasetSearchTaskPostRequestInfo()
        
           .keyword("water quality")
        
        
           .lastUpdated("1m")
        
        
           .fileFormats(List.of(
    
           "archive",
    
           "image"
    
       ))
        
        
           .usageRights("noncommercial")
        
        
           .isFree(true)
        
        
           .topics(List.of(
    
           "natural_sciences",
    
           "geo"
    
       ))
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleDatasetSearchTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleDatasetSearchTaskPostRequestInfo>&gt;**](List<SerpGoogleDatasetSearchTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleDatasetSearchTaskPostResponseInfo**](SerpGoogleDatasetSearchTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleDatasetSearchTasksReady"></a>
# **googleDatasetSearchTasksReady**
> SerpGoogleDatasetSearchTasksReadyResponseInfo googleDatasetSearchTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleDatasetSearchTasksReadyResponseInfo response = apiInstance.googleDatasetSearchTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleDatasetSearchTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleDatasetSearchTasksReadyResponseInfo**](SerpGoogleDatasetSearchTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleDatasetSearchTasksFixed"></a>
# **googleDatasetSearchTasksFixed**
> SerpGoogleDatasetSearchTasksFixedResponseInfo googleDatasetSearchTasksFixed()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleDatasetSearchTasksFixedResponseInfo response = apiInstance.googleDatasetSearchTasksFixed();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleDatasetSearchTasksFixed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleDatasetSearchTasksFixedResponseInfo**](SerpGoogleDatasetSearchTasksFixedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleDatasetSearchTaskGetAdvanced"></a>
# **googleDatasetSearchTaskGetAdvanced**
> SerpGoogleDatasetSearchTaskGetAdvancedResponseInfo googleDatasetSearchTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleDatasetSearchTaskGetAdvancedResponseInfo response = apiInstance.googleDatasetSearchTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleDatasetSearchTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleDatasetSearchTaskGetAdvancedResponseInfo**](SerpGoogleDatasetSearchTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleDatasetSearchLiveAdvanced"></a>
# **googleDatasetSearchLiveAdvanced**
> SerpGoogleDatasetSearchLiveAdvancedResponseInfo googleDatasetSearchLiveAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleDatasetSearchLiveAdvancedResponseInfo response = apiInstance.googleDatasetSearchLiveAdvanced(
       List.of(
    
           new SerpGoogleDatasetSearchLiveAdvancedRequestInfo()
        
           .keyword("water quality")
        
        
           .lastUpdated("1m")
        
        
           .fileFormats(List.of(
    
           "archive",
    
           "image"
    
       ))
        
        
           .usageRights("noncommercial")
        
        
           .isFree(true)
        
        
           .topics(List.of(
    
           "natural_sciences",
    
           "geo"
    
       ))
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleDatasetSearchLiveAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleDatasetSearchLiveAdvancedRequestInfo>&gt;**](List<SerpGoogleDatasetSearchLiveAdvancedRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleDatasetSearchLiveAdvancedResponseInfo**](SerpGoogleDatasetSearchLiveAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleDatasetInfoTaskPost"></a>
# **googleDatasetInfoTaskPost**
> SerpGoogleDatasetInfoTaskPostResponseInfo googleDatasetInfoTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleDatasetInfoTaskPostResponseInfo response = apiInstance.googleDatasetInfoTaskPost(
       List.of(
    
           new SerpGoogleDatasetInfoTaskPostRequestInfo()
        
           .datasetId("L2cvMTFqbl85ZHN6MQ==")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleDatasetInfoTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleDatasetInfoTaskPostRequestInfo>&gt;**](List<SerpGoogleDatasetInfoTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleDatasetInfoTaskPostResponseInfo**](SerpGoogleDatasetInfoTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleDatasetInfoTasksReady"></a>
# **googleDatasetInfoTasksReady**
> SerpGoogleDatasetInfoTasksReadyResponseInfo googleDatasetInfoTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleDatasetInfoTasksReadyResponseInfo response = apiInstance.googleDatasetInfoTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleDatasetInfoTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleDatasetInfoTasksReadyResponseInfo**](SerpGoogleDatasetInfoTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleDatasetInfoTasksFixed"></a>
# **googleDatasetInfoTasksFixed**
> SerpGoogleDatasetInfoTasksFixedResponseInfo googleDatasetInfoTasksFixed()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleDatasetInfoTasksFixedResponseInfo response = apiInstance.googleDatasetInfoTasksFixed();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleDatasetInfoTasksFixed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleDatasetInfoTasksFixedResponseInfo**](SerpGoogleDatasetInfoTasksFixedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleDatasetInfoTaskGetAdvanced"></a>
# **googleDatasetInfoTaskGetAdvanced**
> SerpGoogleDatasetInfoTaskGetAdvancedResponseInfo googleDatasetInfoTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleDatasetInfoTaskGetAdvancedResponseInfo response = apiInstance.googleDatasetInfoTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleDatasetInfoTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleDatasetInfoTaskGetAdvancedResponseInfo**](SerpGoogleDatasetInfoTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleDatasetInfoLiveAdvanced"></a>
# **googleDatasetInfoLiveAdvanced**
> SerpGoogleDatasetInfoLiveAdvancedResponseInfo googleDatasetInfoLiveAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleDatasetInfoLiveAdvancedResponseInfo response = apiInstance.googleDatasetInfoLiveAdvanced(
       List.of(
    
           new SerpGoogleDatasetInfoLiveAdvancedRequestInfo()
        
           .datasetId("L2cvMTFqbl85ZHN6MQ==")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleDatasetInfoLiveAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleDatasetInfoLiveAdvancedRequestInfo>&gt;**](List<SerpGoogleDatasetInfoLiveAdvancedRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleDatasetInfoLiveAdvancedResponseInfo**](SerpGoogleDatasetInfoLiveAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsAdvertisersLocations"></a>
# **googleAdsAdvertisersLocations**
> SerpGoogleAdsAdvertisersLocationsResponseInfo googleAdsAdvertisersLocations()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleAdsAdvertisersLocationsResponseInfo response = apiInstance.googleAdsAdvertisersLocations();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleAdsAdvertisersLocations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleAdsAdvertisersLocationsResponseInfo**](SerpGoogleAdsAdvertisersLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsAdvertisersTaskPost"></a>
# **googleAdsAdvertisersTaskPost**
> SerpGoogleAdsAdvertisersTaskPostResponseInfo googleAdsAdvertisersTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleAdsAdvertisersTaskPostResponseInfo response = apiInstance.googleAdsAdvertisersTaskPost(
       List.of(
    
           new SerpGoogleAdsAdvertisersTaskPostRequestInfo()
        
           .locationCode(2840)
        
        
           .keyword("apple")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleAdsAdvertisersTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleAdsAdvertisersTaskPostRequestInfo>&gt;**](List<SerpGoogleAdsAdvertisersTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleAdsAdvertisersTaskPostResponseInfo**](SerpGoogleAdsAdvertisersTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsAdvertisersTasksReady"></a>
# **googleAdsAdvertisersTasksReady**
> SerpGoogleAdsAdvertisersTasksReadyResponseInfo googleAdsAdvertisersTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleAdsAdvertisersTasksReadyResponseInfo response = apiInstance.googleAdsAdvertisersTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleAdsAdvertisersTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleAdsAdvertisersTasksReadyResponseInfo**](SerpGoogleAdsAdvertisersTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsAdvertisersTaskGetAdvanced"></a>
# **googleAdsAdvertisersTaskGetAdvanced**
> SerpGoogleAdsAdvertisersTaskGetAdvancedResponseInfo googleAdsAdvertisersTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleAdsAdvertisersTaskGetAdvancedResponseInfo response = apiInstance.googleAdsAdvertisersTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleAdsAdvertisersTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleAdsAdvertisersTaskGetAdvancedResponseInfo**](SerpGoogleAdsAdvertisersTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsSearchLocations"></a>
# **googleAdsSearchLocations**
> SerpGoogleAdsSearchLocationsResponseInfo googleAdsSearchLocations()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleAdsSearchLocationsResponseInfo response = apiInstance.googleAdsSearchLocations();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleAdsSearchLocations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleAdsSearchLocationsResponseInfo**](SerpGoogleAdsSearchLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsSearchTaskPost"></a>
# **googleAdsSearchTaskPost**
> SerpGoogleAdsSearchTaskPostResponseInfo googleAdsSearchTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleAdsSearchTaskPostResponseInfo response = apiInstance.googleAdsSearchTaskPost(
       List.of(
    
           new SerpGoogleAdsSearchTaskPostRequestInfo()
        
           .locationCode(2840)
        
        
           .platform("google_search")
        
        
           .advertiserIds(List.of(
    
           "AR13752565271262920705",
    
           "AR02439908557932462081"
    
       ))
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleAdsSearchTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleAdsSearchTaskPostRequestInfo>&gt;**](List<SerpGoogleAdsSearchTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleAdsSearchTaskPostResponseInfo**](SerpGoogleAdsSearchTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsSearchTasksReady"></a>
# **googleAdsSearchTasksReady**
> SerpGoogleAdsSearchTasksReadyResponseInfo googleAdsSearchTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleAdsSearchTasksReadyResponseInfo response = apiInstance.googleAdsSearchTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleAdsSearchTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleAdsSearchTasksReadyResponseInfo**](SerpGoogleAdsSearchTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleAdsSearchTaskGetAdvanced"></a>
# **googleAdsSearchTaskGetAdvanced**
> SerpGoogleAdsSearchTaskGetAdvancedResponseInfo googleAdsSearchTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleAdsSearchTaskGetAdvancedResponseInfo response = apiInstance.googleAdsSearchTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleAdsSearchTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleAdsSearchTaskGetAdvancedResponseInfo**](SerpGoogleAdsSearchTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingLocations"></a>
# **bingLocations**
> SerpBingLocationsResponseInfo bingLocations()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpBingLocationsResponseInfo response = apiInstance.bingLocations();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#bingLocations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpBingLocationsResponseInfo**](SerpBingLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingLocationsCountry"></a>
# **bingLocationsCountry**
> SerpBingLocationsCountryResponseInfo bingLocationsCountry()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String country = ;
    SerpBingLocationsCountryResponseInfo response = apiInstance.bingLocationsCountry(country);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#bingLocationsCountry");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpBingLocationsCountryResponseInfo**](SerpBingLocationsCountryResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingLanguages"></a>
# **bingLanguages**
> SerpBingLanguagesResponseInfo bingLanguages()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpBingLanguagesResponseInfo response = apiInstance.bingLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#bingLanguages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpBingLanguagesResponseInfo**](SerpBingLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingOrganicTaskPost"></a>
# **bingOrganicTaskPost**
> SerpBingOrganicTaskPostResponseInfo bingOrganicTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpBingOrganicTaskPostResponseInfo response = apiInstance.bingOrganicTaskPost(
       List.of(
    
           new SerpBingOrganicTaskPostRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#bingOrganicTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpBingOrganicTaskPostRequestInfo>&gt;**](List<SerpBingOrganicTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpBingOrganicTaskPostResponseInfo**](SerpBingOrganicTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingOrganicTasksReady"></a>
# **bingOrganicTasksReady**
> SerpBingOrganicTasksReadyResponseInfo bingOrganicTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpBingOrganicTasksReadyResponseInfo response = apiInstance.bingOrganicTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#bingOrganicTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpBingOrganicTasksReadyResponseInfo**](SerpBingOrganicTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingOrganicTasksFixed"></a>
# **bingOrganicTasksFixed**
> SerpBingOrganicTasksFixedResponseInfo bingOrganicTasksFixed()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpBingOrganicTasksFixedResponseInfo response = apiInstance.bingOrganicTasksFixed();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#bingOrganicTasksFixed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpBingOrganicTasksFixedResponseInfo**](SerpBingOrganicTasksFixedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingOrganicTaskGetRegular"></a>
# **bingOrganicTaskGetRegular**
> SerpBingOrganicTaskGetRegularResponseInfo bingOrganicTaskGetRegular()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpBingOrganicTaskGetRegularResponseInfo response = apiInstance.bingOrganicTaskGetRegular(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#bingOrganicTaskGetRegular");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpBingOrganicTaskGetRegularResponseInfo**](SerpBingOrganicTaskGetRegularResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingOrganicTaskGetAdvanced"></a>
# **bingOrganicTaskGetAdvanced**
> SerpBingOrganicTaskGetAdvancedResponseInfo bingOrganicTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpBingOrganicTaskGetAdvancedResponseInfo response = apiInstance.bingOrganicTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#bingOrganicTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpBingOrganicTaskGetAdvancedResponseInfo**](SerpBingOrganicTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingOrganicTaskGetHtml"></a>
# **bingOrganicTaskGetHtml**
> SerpBingOrganicTaskGetHtmlResponseInfo bingOrganicTaskGetHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpBingOrganicTaskGetHtmlResponseInfo response = apiInstance.bingOrganicTaskGetHtml(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#bingOrganicTaskGetHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpBingOrganicTaskGetHtmlResponseInfo**](SerpBingOrganicTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingOrganicLiveRegular"></a>
# **bingOrganicLiveRegular**
> SerpBingOrganicLiveRegularResponseInfo bingOrganicLiveRegular()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpBingOrganicLiveRegularResponseInfo response = apiInstance.bingOrganicLiveRegular(
       List.of(
    
           new SerpBingOrganicLiveRegularRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#bingOrganicLiveRegular");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpBingOrganicLiveRegularRequestInfo>&gt;**](List<SerpBingOrganicLiveRegularRequestInfo>.md)|  | [optional] |



### Return type

[**SerpBingOrganicLiveRegularResponseInfo**](SerpBingOrganicLiveRegularResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingOrganicLiveAdvanced"></a>
# **bingOrganicLiveAdvanced**
> SerpBingOrganicLiveAdvancedResponseInfo bingOrganicLiveAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpBingOrganicLiveAdvancedResponseInfo response = apiInstance.bingOrganicLiveAdvanced(
       List.of(
    
           new SerpBingOrganicLiveAdvancedRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("flight ticket new york san francisco")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#bingOrganicLiveAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpBingOrganicLiveAdvancedRequestInfo>&gt;**](List<SerpBingOrganicLiveAdvancedRequestInfo>.md)|  | [optional] |



### Return type

[**SerpBingOrganicLiveAdvancedResponseInfo**](SerpBingOrganicLiveAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingOrganicLiveHtml"></a>
# **bingOrganicLiveHtml**
> SerpBingOrganicLiveHtmlResponseInfo bingOrganicLiveHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpBingOrganicLiveHtmlResponseInfo response = apiInstance.bingOrganicLiveHtml(
       List.of(
    
           new SerpBingOrganicLiveHtmlRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#bingOrganicLiveHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpBingOrganicLiveHtmlRequestInfo>&gt;**](List<SerpBingOrganicLiveHtmlRequestInfo>.md)|  | [optional] |



### Return type

[**SerpBingOrganicLiveHtmlResponseInfo**](SerpBingOrganicLiveHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingLocalPackTaskPost"></a>
# **bingLocalPackTaskPost**
> SerpBingLocalPackTaskPostResponseInfo bingLocalPackTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpBingLocalPackTaskPostResponseInfo response = apiInstance.bingLocalPackTaskPost(
       List.of(
    
           new SerpBingLocalPackTaskPostRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#bingLocalPackTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpBingLocalPackTaskPostRequestInfo>&gt;**](List<SerpBingLocalPackTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpBingLocalPackTaskPostResponseInfo**](SerpBingLocalPackTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingLocalPackTasksReady"></a>
# **bingLocalPackTasksReady**
> SerpBingLocalPackTasksReadyResponseInfo bingLocalPackTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpBingLocalPackTasksReadyResponseInfo response = apiInstance.bingLocalPackTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#bingLocalPackTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpBingLocalPackTasksReadyResponseInfo**](SerpBingLocalPackTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingLocalPackTasksFixed"></a>
# **bingLocalPackTasksFixed**
> SerpBingLocalPackTasksFixedResponseInfo bingLocalPackTasksFixed()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpBingLocalPackTasksFixedResponseInfo response = apiInstance.bingLocalPackTasksFixed();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#bingLocalPackTasksFixed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpBingLocalPackTasksFixedResponseInfo**](SerpBingLocalPackTasksFixedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingLocalPackTaskGetRegular"></a>
# **bingLocalPackTaskGetRegular**
> SerpBingLocalPackTaskGetRegularResponseInfo bingLocalPackTaskGetRegular()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpBingLocalPackTaskGetRegularResponseInfo response = apiInstance.bingLocalPackTaskGetRegular(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#bingLocalPackTaskGetRegular");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpBingLocalPackTaskGetRegularResponseInfo**](SerpBingLocalPackTaskGetRegularResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingLocalPackTaskGetHtml"></a>
# **bingLocalPackTaskGetHtml**
> SerpBingLocalPackTaskGetHtmlResponseInfo bingLocalPackTaskGetHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpBingLocalPackTaskGetHtmlResponseInfo response = apiInstance.bingLocalPackTaskGetHtml(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#bingLocalPackTaskGetHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpBingLocalPackTaskGetHtmlResponseInfo**](SerpBingLocalPackTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingLocalPackLiveRegular"></a>
# **bingLocalPackLiveRegular**
> SerpBingLocalPackLiveRegularResponseInfo bingLocalPackLiveRegular()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpBingLocalPackLiveRegularResponseInfo response = apiInstance.bingLocalPackLiveRegular(
       List.of(
    
           new SerpBingLocalPackLiveRegularRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#bingLocalPackLiveRegular");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpBingLocalPackLiveRegularRequestInfo>&gt;**](List<SerpBingLocalPackLiveRegularRequestInfo>.md)|  | [optional] |



### Return type

[**SerpBingLocalPackLiveRegularResponseInfo**](SerpBingLocalPackLiveRegularResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="bingLocalPackLiveHtml"></a>
# **bingLocalPackLiveHtml**
> SerpBingLocalPackLiveHtmlResponseInfo bingLocalPackLiveHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpBingLocalPackLiveHtmlResponseInfo response = apiInstance.bingLocalPackLiveHtml(
       List.of(
    
           new SerpBingLocalPackLiveHtmlRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#bingLocalPackLiveHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpBingLocalPackLiveHtmlRequestInfo>&gt;**](List<SerpBingLocalPackLiveHtmlRequestInfo>.md)|  | [optional] |



### Return type

[**SerpBingLocalPackLiveHtmlResponseInfo**](SerpBingLocalPackLiveHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="youtubeLocations"></a>
# **youtubeLocations**
> SerpYoutubeLocationsResponseInfo youtubeLocations()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpYoutubeLocationsResponseInfo response = apiInstance.youtubeLocations();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#youtubeLocations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpYoutubeLocationsResponseInfo**](SerpYoutubeLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="youtubeLocationsCountry"></a>
# **youtubeLocationsCountry**
> SerpYoutubeLocationsCountryResponseInfo youtubeLocationsCountry()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String country = ;
    SerpYoutubeLocationsCountryResponseInfo response = apiInstance.youtubeLocationsCountry(country);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#youtubeLocationsCountry");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpYoutubeLocationsCountryResponseInfo**](SerpYoutubeLocationsCountryResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="youtubeLanguages"></a>
# **youtubeLanguages**
> SerpYoutubeLanguagesResponseInfo youtubeLanguages()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpYoutubeLanguagesResponseInfo response = apiInstance.youtubeLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#youtubeLanguages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpYoutubeLanguagesResponseInfo**](SerpYoutubeLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="youtubeVideoInfoTaskPost"></a>
# **youtubeVideoInfoTaskPost**
> SerpYoutubeVideoInfoTaskPostResponseInfo youtubeVideoInfoTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpYoutubeVideoInfoTaskPostResponseInfo response = apiInstance.youtubeVideoInfoTaskPost(
       List.of(
    
           new SerpYoutubeVideoInfoTaskPostRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .videoId("vQXvyV0zIP4")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#youtubeVideoInfoTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpYoutubeVideoInfoTaskPostRequestInfo>&gt;**](List<SerpYoutubeVideoInfoTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpYoutubeVideoInfoTaskPostResponseInfo**](SerpYoutubeVideoInfoTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="youtubeVideoInfoTasksReady"></a>
# **youtubeVideoInfoTasksReady**
> SerpYoutubeVideoInfoTasksReadyResponseInfo youtubeVideoInfoTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpYoutubeVideoInfoTasksReadyResponseInfo response = apiInstance.youtubeVideoInfoTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#youtubeVideoInfoTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpYoutubeVideoInfoTasksReadyResponseInfo**](SerpYoutubeVideoInfoTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="youtubeVideoInfoTasksFixed"></a>
# **youtubeVideoInfoTasksFixed**
> SerpYoutubeVideoInfoTasksFixedResponseInfo youtubeVideoInfoTasksFixed()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpYoutubeVideoInfoTasksFixedResponseInfo response = apiInstance.youtubeVideoInfoTasksFixed();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#youtubeVideoInfoTasksFixed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpYoutubeVideoInfoTasksFixedResponseInfo**](SerpYoutubeVideoInfoTasksFixedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="youtubeVideoInfoTaskGetAdvanced"></a>
# **youtubeVideoInfoTaskGetAdvanced**
> SerpYoutubeVideoInfoTaskGetAdvancedResponseInfo youtubeVideoInfoTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpYoutubeVideoInfoTaskGetAdvancedResponseInfo response = apiInstance.youtubeVideoInfoTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#youtubeVideoInfoTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpYoutubeVideoInfoTaskGetAdvancedResponseInfo**](SerpYoutubeVideoInfoTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="youtubeVideoInfoLiveAdvanced"></a>
# **youtubeVideoInfoLiveAdvanced**
> SerpYoutubeVideoInfoLiveAdvancedResponseInfo youtubeVideoInfoLiveAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpYoutubeVideoInfoLiveAdvancedResponseInfo response = apiInstance.youtubeVideoInfoLiveAdvanced(
       List.of(
    
           new SerpYoutubeVideoInfoLiveAdvancedRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .videoId("vQXvyV0zIP4")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#youtubeVideoInfoLiveAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpYoutubeVideoInfoLiveAdvancedRequestInfo>&gt;**](List<SerpYoutubeVideoInfoLiveAdvancedRequestInfo>.md)|  | [optional] |



### Return type

[**SerpYoutubeVideoInfoLiveAdvancedResponseInfo**](SerpYoutubeVideoInfoLiveAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="youtubeVideoSubtitlesTaskPost"></a>
# **youtubeVideoSubtitlesTaskPost**
> SerpYoutubeVideoSubtitlesTaskPostResponseInfo youtubeVideoSubtitlesTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpYoutubeVideoSubtitlesTaskPostResponseInfo response = apiInstance.youtubeVideoSubtitlesTaskPost(
       List.of(
    
           new SerpYoutubeVideoSubtitlesTaskPostRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .videoId("Y8Wu4rSNJms")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#youtubeVideoSubtitlesTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpYoutubeVideoSubtitlesTaskPostRequestInfo>&gt;**](List<SerpYoutubeVideoSubtitlesTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpYoutubeVideoSubtitlesTaskPostResponseInfo**](SerpYoutubeVideoSubtitlesTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="youtubeVideoSubtitlesTasksReady"></a>
# **youtubeVideoSubtitlesTasksReady**
> SerpYoutubeVideoSubtitlesTasksReadyResponseInfo youtubeVideoSubtitlesTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpYoutubeVideoSubtitlesTasksReadyResponseInfo response = apiInstance.youtubeVideoSubtitlesTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#youtubeVideoSubtitlesTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpYoutubeVideoSubtitlesTasksReadyResponseInfo**](SerpYoutubeVideoSubtitlesTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="youtubeVideoSubtitlesTasksFixed"></a>
# **youtubeVideoSubtitlesTasksFixed**
> SerpYoutubeVideoSubtitlesTasksFixedResponseInfo youtubeVideoSubtitlesTasksFixed()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpYoutubeVideoSubtitlesTasksFixedResponseInfo response = apiInstance.youtubeVideoSubtitlesTasksFixed();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#youtubeVideoSubtitlesTasksFixed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpYoutubeVideoSubtitlesTasksFixedResponseInfo**](SerpYoutubeVideoSubtitlesTasksFixedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="youtubeVideoSubtitlesTaskGetAdvanced"></a>
# **youtubeVideoSubtitlesTaskGetAdvanced**
> SerpYoutubeVideoSubtitlesTaskGetAdvancedResponseInfo youtubeVideoSubtitlesTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpYoutubeVideoSubtitlesTaskGetAdvancedResponseInfo response = apiInstance.youtubeVideoSubtitlesTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#youtubeVideoSubtitlesTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpYoutubeVideoSubtitlesTaskGetAdvancedResponseInfo**](SerpYoutubeVideoSubtitlesTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="youtubeVideoSubtitlesLiveAdvanced"></a>
# **youtubeVideoSubtitlesLiveAdvanced**
> SerpYoutubeVideoSubtitlesLiveAdvancedResponseInfo youtubeVideoSubtitlesLiveAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpYoutubeVideoSubtitlesLiveAdvancedResponseInfo response = apiInstance.youtubeVideoSubtitlesLiveAdvanced(
       List.of(
    
           new SerpYoutubeVideoSubtitlesLiveAdvancedRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .videoId("Y8Wu4rSNJms")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#youtubeVideoSubtitlesLiveAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpYoutubeVideoSubtitlesLiveAdvancedRequestInfo>&gt;**](List<SerpYoutubeVideoSubtitlesLiveAdvancedRequestInfo>.md)|  | [optional] |



### Return type

[**SerpYoutubeVideoSubtitlesLiveAdvancedResponseInfo**](SerpYoutubeVideoSubtitlesLiveAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="youtubeVideoCommentsTaskPost"></a>
# **youtubeVideoCommentsTaskPost**
> SerpYoutubeVideoCommentsTaskPostResponseInfo youtubeVideoCommentsTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpYoutubeVideoCommentsTaskPostResponseInfo response = apiInstance.youtubeVideoCommentsTaskPost(
       List.of(
    
           new SerpYoutubeVideoCommentsTaskPostRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .videoId("vQXvyV0zIP4")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#youtubeVideoCommentsTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpYoutubeVideoCommentsTaskPostRequestInfo>&gt;**](List<SerpYoutubeVideoCommentsTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpYoutubeVideoCommentsTaskPostResponseInfo**](SerpYoutubeVideoCommentsTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="youtubeVideoCommentsTasksReady"></a>
# **youtubeVideoCommentsTasksReady**
> SerpYoutubeVideoCommentsTasksReadyResponseInfo youtubeVideoCommentsTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpYoutubeVideoCommentsTasksReadyResponseInfo response = apiInstance.youtubeVideoCommentsTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#youtubeVideoCommentsTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpYoutubeVideoCommentsTasksReadyResponseInfo**](SerpYoutubeVideoCommentsTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="youtubeVideoCommentsTasksFixed"></a>
# **youtubeVideoCommentsTasksFixed**
> SerpYoutubeVideoCommentsTasksFixedResponseInfo youtubeVideoCommentsTasksFixed()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpYoutubeVideoCommentsTasksFixedResponseInfo response = apiInstance.youtubeVideoCommentsTasksFixed();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#youtubeVideoCommentsTasksFixed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpYoutubeVideoCommentsTasksFixedResponseInfo**](SerpYoutubeVideoCommentsTasksFixedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="youtubeVideoCommentsTaskGetAdvanced"></a>
# **youtubeVideoCommentsTaskGetAdvanced**
> SerpYoutubeVideoCommentsTaskGetAdvancedResponseInfo youtubeVideoCommentsTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpYoutubeVideoCommentsTaskGetAdvancedResponseInfo response = apiInstance.youtubeVideoCommentsTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#youtubeVideoCommentsTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpYoutubeVideoCommentsTaskGetAdvancedResponseInfo**](SerpYoutubeVideoCommentsTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="youtubeVideoCommentsLiveAdvanced"></a>
# **youtubeVideoCommentsLiveAdvanced**
> SerpYoutubeVideoCommentsLiveAdvancedResponseInfo youtubeVideoCommentsLiveAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpYoutubeVideoCommentsLiveAdvancedResponseInfo response = apiInstance.youtubeVideoCommentsLiveAdvanced(
       List.of(
    
           new SerpYoutubeVideoCommentsLiveAdvancedRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .videoId("vQXvyV0zIP4")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#youtubeVideoCommentsLiveAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpYoutubeVideoCommentsLiveAdvancedRequestInfo>&gt;**](List<SerpYoutubeVideoCommentsLiveAdvancedRequestInfo>.md)|  | [optional] |



### Return type

[**SerpYoutubeVideoCommentsLiveAdvancedResponseInfo**](SerpYoutubeVideoCommentsLiveAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="yahooLocations"></a>
# **yahooLocations**
> SerpYahooLocationsResponseInfo yahooLocations()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpYahooLocationsResponseInfo response = apiInstance.yahooLocations();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#yahooLocations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpYahooLocationsResponseInfo**](SerpYahooLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="yahooLocationsCountry"></a>
# **yahooLocationsCountry**
> SerpYahooLocationsCountryResponseInfo yahooLocationsCountry()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String country = ;
    SerpYahooLocationsCountryResponseInfo response = apiInstance.yahooLocationsCountry(country);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#yahooLocationsCountry");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpYahooLocationsCountryResponseInfo**](SerpYahooLocationsCountryResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="yahooLanguages"></a>
# **yahooLanguages**
> SerpYahooLanguagesResponseInfo yahooLanguages()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpYahooLanguagesResponseInfo response = apiInstance.yahooLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#yahooLanguages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpYahooLanguagesResponseInfo**](SerpYahooLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="yahooOrganicTaskPost"></a>
# **yahooOrganicTaskPost**
> SerpYahooOrganicTaskPostResponseInfo yahooOrganicTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpYahooOrganicTaskPostResponseInfo response = apiInstance.yahooOrganicTaskPost(
       List.of(
    
           new SerpYahooOrganicTaskPostRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#yahooOrganicTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpYahooOrganicTaskPostRequestInfo>&gt;**](List<SerpYahooOrganicTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpYahooOrganicTaskPostResponseInfo**](SerpYahooOrganicTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="yahooOrganicTasksReady"></a>
# **yahooOrganicTasksReady**
> SerpYahooOrganicTasksReadyResponseInfo yahooOrganicTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpYahooOrganicTasksReadyResponseInfo response = apiInstance.yahooOrganicTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#yahooOrganicTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpYahooOrganicTasksReadyResponseInfo**](SerpYahooOrganicTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="yahooOrganicTasksFixed"></a>
# **yahooOrganicTasksFixed**
> SerpYahooOrganicTasksFixedResponseInfo yahooOrganicTasksFixed()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpYahooOrganicTasksFixedResponseInfo response = apiInstance.yahooOrganicTasksFixed();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#yahooOrganicTasksFixed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpYahooOrganicTasksFixedResponseInfo**](SerpYahooOrganicTasksFixedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="yahooOrganicTaskGetRegular"></a>
# **yahooOrganicTaskGetRegular**
> SerpYahooOrganicTaskGetRegularResponseInfo yahooOrganicTaskGetRegular()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpYahooOrganicTaskGetRegularResponseInfo response = apiInstance.yahooOrganicTaskGetRegular(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#yahooOrganicTaskGetRegular");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpYahooOrganicTaskGetRegularResponseInfo**](SerpYahooOrganicTaskGetRegularResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="yahooOrganicTaskGetAdvanced"></a>
# **yahooOrganicTaskGetAdvanced**
> SerpYahooOrganicTaskGetAdvancedResponseInfo yahooOrganicTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpYahooOrganicTaskGetAdvancedResponseInfo response = apiInstance.yahooOrganicTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#yahooOrganicTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpYahooOrganicTaskGetAdvancedResponseInfo**](SerpYahooOrganicTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="yahooOrganicTaskGetHtml"></a>
# **yahooOrganicTaskGetHtml**
> SerpYahooOrganicTaskGetHtmlResponseInfo yahooOrganicTaskGetHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpYahooOrganicTaskGetHtmlResponseInfo response = apiInstance.yahooOrganicTaskGetHtml(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#yahooOrganicTaskGetHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpYahooOrganicTaskGetHtmlResponseInfo**](SerpYahooOrganicTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="yahooOrganicLiveRegular"></a>
# **yahooOrganicLiveRegular**
> SerpYahooOrganicLiveRegularResponseInfo yahooOrganicLiveRegular()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpYahooOrganicLiveRegularResponseInfo response = apiInstance.yahooOrganicLiveRegular(
       List.of(
    
           new SerpYahooOrganicLiveRegularRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#yahooOrganicLiveRegular");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpYahooOrganicLiveRegularRequestInfo>&gt;**](List<SerpYahooOrganicLiveRegularRequestInfo>.md)|  | [optional] |



### Return type

[**SerpYahooOrganicLiveRegularResponseInfo**](SerpYahooOrganicLiveRegularResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="yahooOrganicLiveAdvanced"></a>
# **yahooOrganicLiveAdvanced**
> SerpYahooOrganicLiveAdvancedResponseInfo yahooOrganicLiveAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpYahooOrganicLiveAdvancedResponseInfo response = apiInstance.yahooOrganicLiveAdvanced(
       List.of(
    
           new SerpYahooOrganicLiveAdvancedRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#yahooOrganicLiveAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpYahooOrganicLiveAdvancedRequestInfo>&gt;**](List<SerpYahooOrganicLiveAdvancedRequestInfo>.md)|  | [optional] |



### Return type

[**SerpYahooOrganicLiveAdvancedResponseInfo**](SerpYahooOrganicLiveAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="yahooOrganicLiveHtml"></a>
# **yahooOrganicLiveHtml**
> SerpYahooOrganicLiveHtmlResponseInfo yahooOrganicLiveHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpYahooOrganicLiveHtmlResponseInfo response = apiInstance.yahooOrganicLiveHtml(
       List.of(
    
           new SerpYahooOrganicLiveHtmlRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("albert einstein")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#yahooOrganicLiveHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpYahooOrganicLiveHtmlRequestInfo>&gt;**](List<SerpYahooOrganicLiveHtmlRequestInfo>.md)|  | [optional] |



### Return type

[**SerpYahooOrganicLiveHtmlResponseInfo**](SerpYahooOrganicLiveHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="baiduLocations"></a>
# **baiduLocations**
> SerpBaiduLocationsResponseInfo baiduLocations()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpBaiduLocationsResponseInfo response = apiInstance.baiduLocations();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#baiduLocations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpBaiduLocationsResponseInfo**](SerpBaiduLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="baiduLocationsCountry"></a>
# **baiduLocationsCountry**
> SerpBaiduLocationsCountryResponseInfo baiduLocationsCountry()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String country = ;
    SerpBaiduLocationsCountryResponseInfo response = apiInstance.baiduLocationsCountry(country);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#baiduLocationsCountry");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpBaiduLocationsCountryResponseInfo**](SerpBaiduLocationsCountryResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="baiduLanguages"></a>
# **baiduLanguages**
> SerpBaiduLanguagesResponseInfo baiduLanguages()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpBaiduLanguagesResponseInfo response = apiInstance.baiduLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#baiduLanguages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpBaiduLanguagesResponseInfo**](SerpBaiduLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="baiduOrganicTaskPost"></a>
# **baiduOrganicTaskPost**
> SerpBaiduOrganicTaskPostResponseInfo baiduOrganicTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpBaiduOrganicTaskPostResponseInfo response = apiInstance.baiduOrganicTaskPost(
       List.of(
    
           new SerpBaiduOrganicTaskPostRequestInfo()
        
           .locationCode(2156)
        
        
           .keyword("best iphone ever")
        
        
           .tag("some_string_123")
        
        
           .priority(2)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#baiduOrganicTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpBaiduOrganicTaskPostRequestInfo>&gt;**](List<SerpBaiduOrganicTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpBaiduOrganicTaskPostResponseInfo**](SerpBaiduOrganicTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="baiduOrganicTasksReady"></a>
# **baiduOrganicTasksReady**
> SerpBaiduOrganicTasksReadyResponseInfo baiduOrganicTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpBaiduOrganicTasksReadyResponseInfo response = apiInstance.baiduOrganicTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#baiduOrganicTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpBaiduOrganicTasksReadyResponseInfo**](SerpBaiduOrganicTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="baiduOrganicTasksFixed"></a>
# **baiduOrganicTasksFixed**
> SerpBaiduOrganicTasksFixedResponseInfo baiduOrganicTasksFixed()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpBaiduOrganicTasksFixedResponseInfo response = apiInstance.baiduOrganicTasksFixed();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#baiduOrganicTasksFixed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpBaiduOrganicTasksFixedResponseInfo**](SerpBaiduOrganicTasksFixedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="baiduOrganicTaskGetRegular"></a>
# **baiduOrganicTaskGetRegular**
> SerpBaiduOrganicTaskGetRegularResponseInfo baiduOrganicTaskGetRegular()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpBaiduOrganicTaskGetRegularResponseInfo response = apiInstance.baiduOrganicTaskGetRegular(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#baiduOrganicTaskGetRegular");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpBaiduOrganicTaskGetRegularResponseInfo**](SerpBaiduOrganicTaskGetRegularResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="baiduOrganicTaskGetAdvanced"></a>
# **baiduOrganicTaskGetAdvanced**
> SerpBaiduOrganicTaskGetAdvancedResponseInfo baiduOrganicTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpBaiduOrganicTaskGetAdvancedResponseInfo response = apiInstance.baiduOrganicTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#baiduOrganicTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpBaiduOrganicTaskGetAdvancedResponseInfo**](SerpBaiduOrganicTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="baiduOrganicTaskGetHtml"></a>
# **baiduOrganicTaskGetHtml**
> SerpBaiduOrganicTaskGetHtmlResponseInfo baiduOrganicTaskGetHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpBaiduOrganicTaskGetHtmlResponseInfo response = apiInstance.baiduOrganicTaskGetHtml(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#baiduOrganicTaskGetHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpBaiduOrganicTaskGetHtmlResponseInfo**](SerpBaiduOrganicTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="naverOrganicTaskPost"></a>
# **naverOrganicTaskPost**
> SerpNaverOrganicTaskPostResponseInfo naverOrganicTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpNaverOrganicTaskPostResponseInfo response = apiInstance.naverOrganicTaskPost(
       List.of(
    
           new SerpNaverOrganicTaskPostRequestInfo()
        
           .keyword("albert einstein")
        
        
           .device("desktop")
        
        
           .tag("some_string_123")
        
        
           .postbackUrl("https://your-server.com/postbackscript.php")
        
        
           .postbackData("regular")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#naverOrganicTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpNaverOrganicTaskPostRequestInfo>&gt;**](List<SerpNaverOrganicTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpNaverOrganicTaskPostResponseInfo**](SerpNaverOrganicTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="naverOrganicTasksReady"></a>
# **naverOrganicTasksReady**
> SerpNaverOrganicTasksReadyResponseInfo naverOrganicTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpNaverOrganicTasksReadyResponseInfo response = apiInstance.naverOrganicTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#naverOrganicTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpNaverOrganicTasksReadyResponseInfo**](SerpNaverOrganicTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="naverOrganicTasksFixed"></a>
# **naverOrganicTasksFixed**
> SerpNaverOrganicTasksFixedResponseInfo naverOrganicTasksFixed()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpNaverOrganicTasksFixedResponseInfo response = apiInstance.naverOrganicTasksFixed();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#naverOrganicTasksFixed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpNaverOrganicTasksFixedResponseInfo**](SerpNaverOrganicTasksFixedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="naverOrganicTaskGetRegular"></a>
# **naverOrganicTaskGetRegular**
> SerpNaverOrganicTaskGetRegularResponseInfo naverOrganicTaskGetRegular()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpNaverOrganicTaskGetRegularResponseInfo response = apiInstance.naverOrganicTaskGetRegular(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#naverOrganicTaskGetRegular");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpNaverOrganicTaskGetRegularResponseInfo**](SerpNaverOrganicTaskGetRegularResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="naverOrganicTaskGetAdvanced"></a>
# **naverOrganicTaskGetAdvanced**
> SerpNaverOrganicTaskGetAdvancedResponseInfo naverOrganicTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpNaverOrganicTaskGetAdvancedResponseInfo response = apiInstance.naverOrganicTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#naverOrganicTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpNaverOrganicTaskGetAdvancedResponseInfo**](SerpNaverOrganicTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="naverOrganicTaskGetHtml"></a>
# **naverOrganicTaskGetHtml**
> SerpNaverOrganicTaskGetHtmlResponseInfo naverOrganicTaskGetHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpNaverOrganicTaskGetHtmlResponseInfo response = apiInstance.naverOrganicTaskGetHtml(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#naverOrganicTaskGetHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpNaverOrganicTaskGetHtmlResponseInfo**](SerpNaverOrganicTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="seznamLocations"></a>
# **seznamLocations**
> SerpSeznamLocationsResponseInfo seznamLocations()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpSeznamLocationsResponseInfo response = apiInstance.seznamLocations();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#seznamLocations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpSeznamLocationsResponseInfo**](SerpSeznamLocationsResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="seznamLocationsCountry"></a>
# **seznamLocationsCountry**
> SerpSeznamLocationsCountryResponseInfo seznamLocationsCountry()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String country = ;
    SerpSeznamLocationsCountryResponseInfo response = apiInstance.seznamLocationsCountry(country);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#seznamLocationsCountry");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpSeznamLocationsCountryResponseInfo**](SerpSeznamLocationsCountryResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="seznamLanguages"></a>
# **seznamLanguages**
> SerpSeznamLanguagesResponseInfo seznamLanguages()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpSeznamLanguagesResponseInfo response = apiInstance.seznamLanguages();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#seznamLanguages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpSeznamLanguagesResponseInfo**](SerpSeznamLanguagesResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="seznamOrganicTaskPost"></a>
# **seznamOrganicTaskPost**
> SerpSeznamOrganicTaskPostResponseInfo seznamOrganicTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpSeznamOrganicTaskPostResponseInfo response = apiInstance.seznamOrganicTaskPost(
       List.of(
    
           new SerpSeznamOrganicTaskPostRequestInfo()
        
           .languageCode("cs")
        
        
           .locationCode(2203)
        
        
           .keyword("albert einstein")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#seznamOrganicTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpSeznamOrganicTaskPostRequestInfo>&gt;**](List<SerpSeznamOrganicTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpSeznamOrganicTaskPostResponseInfo**](SerpSeznamOrganicTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="seznamOrganicTasksReady"></a>
# **seznamOrganicTasksReady**
> SerpSeznamOrganicTasksReadyResponseInfo seznamOrganicTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpSeznamOrganicTasksReadyResponseInfo response = apiInstance.seznamOrganicTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#seznamOrganicTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpSeznamOrganicTasksReadyResponseInfo**](SerpSeznamOrganicTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="seznamOrganicTasksFixed"></a>
# **seznamOrganicTasksFixed**
> SerpSeznamOrganicTasksFixedResponseInfo seznamOrganicTasksFixed()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpSeznamOrganicTasksFixedResponseInfo response = apiInstance.seznamOrganicTasksFixed();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#seznamOrganicTasksFixed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpSeznamOrganicTasksFixedResponseInfo**](SerpSeznamOrganicTasksFixedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="seznamOrganicTaskGetRegular"></a>
# **seznamOrganicTaskGetRegular**
> SerpSeznamOrganicTaskGetRegularResponseInfo seznamOrganicTaskGetRegular()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpSeznamOrganicTaskGetRegularResponseInfo response = apiInstance.seznamOrganicTaskGetRegular(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#seznamOrganicTaskGetRegular");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpSeznamOrganicTaskGetRegularResponseInfo**](SerpSeznamOrganicTaskGetRegularResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="seznamOrganicTaskGetAdvanced"></a>
# **seznamOrganicTaskGetAdvanced**
> SerpSeznamOrganicTaskGetAdvancedResponseInfo seznamOrganicTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpSeznamOrganicTaskGetAdvancedResponseInfo response = apiInstance.seznamOrganicTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#seznamOrganicTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpSeznamOrganicTaskGetAdvancedResponseInfo**](SerpSeznamOrganicTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="seznamOrganicTaskGetHtml"></a>
# **seznamOrganicTaskGetHtml**
> SerpSeznamOrganicTaskGetHtmlResponseInfo seznamOrganicTaskGetHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpSeznamOrganicTaskGetHtmlResponseInfo response = apiInstance.seznamOrganicTaskGetHtml(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#seznamOrganicTaskGetHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpSeznamOrganicTaskGetHtmlResponseInfo**](SerpSeznamOrganicTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleFinanceExploreTaskPost"></a>
# **googleFinanceExploreTaskPost**
> SerpGoogleFinanceExploreTaskPostResponseInfo googleFinanceExploreTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleFinanceExploreTaskPostResponseInfo response = apiInstance.googleFinanceExploreTaskPost(
       List.of(
    
           new SerpGoogleFinanceExploreTaskPostRequestInfo()
        
           .locationCode(2840)
        
        
           .languageName("English")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleFinanceExploreTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleFinanceExploreTaskPostRequestInfo>&gt;**](List<SerpGoogleFinanceExploreTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleFinanceExploreTaskPostResponseInfo**](SerpGoogleFinanceExploreTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleFinanceExploreTasksReady"></a>
# **googleFinanceExploreTasksReady**
> SerpGoogleFinanceExploreTasksReadyResponseInfo googleFinanceExploreTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleFinanceExploreTasksReadyResponseInfo response = apiInstance.googleFinanceExploreTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleFinanceExploreTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleFinanceExploreTasksReadyResponseInfo**](SerpGoogleFinanceExploreTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleFinanceExploreTaskGetAdvanced"></a>
# **googleFinanceExploreTaskGetAdvanced**
> SerpGoogleFinanceExploreTaskGetAdvancedResponseInfo googleFinanceExploreTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleFinanceExploreTaskGetAdvancedResponseInfo response = apiInstance.googleFinanceExploreTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleFinanceExploreTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleFinanceExploreTaskGetAdvancedResponseInfo**](SerpGoogleFinanceExploreTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleFinanceExploreTaskGetHtml"></a>
# **googleFinanceExploreTaskGetHtml**
> SerpGoogleFinanceExploreTaskGetHtmlResponseInfo googleFinanceExploreTaskGetHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleFinanceExploreTaskGetHtmlResponseInfo response = apiInstance.googleFinanceExploreTaskGetHtml(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleFinanceExploreTaskGetHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleFinanceExploreTaskGetHtmlResponseInfo**](SerpGoogleFinanceExploreTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleFinanceExploreLiveAdvanced"></a>
# **googleFinanceExploreLiveAdvanced**
> SerpGoogleFinanceExploreLiveAdvancedResponseInfo googleFinanceExploreLiveAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleFinanceExploreLiveAdvancedResponseInfo response = apiInstance.googleFinanceExploreLiveAdvanced(
       List.of(
    
           new SerpGoogleFinanceExploreLiveAdvancedRequestInfo()
        
           .locationCode(2840)
        
        
           .languageName("English")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleFinanceExploreLiveAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleFinanceExploreLiveAdvancedRequestInfo>&gt;**](List<SerpGoogleFinanceExploreLiveAdvancedRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleFinanceExploreLiveAdvancedResponseInfo**](SerpGoogleFinanceExploreLiveAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleFinanceExploreLiveHtml"></a>
# **googleFinanceExploreLiveHtml**
> SerpGoogleFinanceExploreLiveHtmlResponseInfo googleFinanceExploreLiveHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleFinanceExploreLiveHtmlResponseInfo response = apiInstance.googleFinanceExploreLiveHtml(
       List.of(
    
           new SerpGoogleFinanceExploreLiveHtmlRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleFinanceExploreLiveHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleFinanceExploreLiveHtmlRequestInfo>&gt;**](List<SerpGoogleFinanceExploreLiveHtmlRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleFinanceExploreLiveHtmlResponseInfo**](SerpGoogleFinanceExploreLiveHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleFinanceMarketsTaskPost"></a>
# **googleFinanceMarketsTaskPost**
> SerpGoogleFinanceMarketsTaskPostResponseInfo googleFinanceMarketsTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleFinanceMarketsTaskPostResponseInfo response = apiInstance.googleFinanceMarketsTaskPost(
       List.of(
    
           new SerpGoogleFinanceMarketsTaskPostRequestInfo()
        
           .locationCode(2840)
        
        
           .languageName("English")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleFinanceMarketsTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleFinanceMarketsTaskPostRequestInfo>&gt;**](List<SerpGoogleFinanceMarketsTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleFinanceMarketsTaskPostResponseInfo**](SerpGoogleFinanceMarketsTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleFinanceMarketsTasksReady"></a>
# **googleFinanceMarketsTasksReady**
> SerpGoogleFinanceMarketsTasksReadyResponseInfo googleFinanceMarketsTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleFinanceMarketsTasksReadyResponseInfo response = apiInstance.googleFinanceMarketsTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleFinanceMarketsTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleFinanceMarketsTasksReadyResponseInfo**](SerpGoogleFinanceMarketsTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleFinanceMarketsTaskGetAdvanced"></a>
# **googleFinanceMarketsTaskGetAdvanced**
> SerpGoogleFinanceMarketsTaskGetAdvancedResponseInfo googleFinanceMarketsTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleFinanceMarketsTaskGetAdvancedResponseInfo response = apiInstance.googleFinanceMarketsTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleFinanceMarketsTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleFinanceMarketsTaskGetAdvancedResponseInfo**](SerpGoogleFinanceMarketsTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleFinanceMarketsTaskGetHtml"></a>
# **googleFinanceMarketsTaskGetHtml**
> SerpGoogleFinanceMarketsTaskGetHtmlResponseInfo googleFinanceMarketsTaskGetHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleFinanceMarketsTaskGetHtmlResponseInfo response = apiInstance.googleFinanceMarketsTaskGetHtml(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleFinanceMarketsTaskGetHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleFinanceMarketsTaskGetHtmlResponseInfo**](SerpGoogleFinanceMarketsTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleFinanceMarketsLiveAdvanced"></a>
# **googleFinanceMarketsLiveAdvanced**
> SerpGoogleFinanceMarketsLiveAdvancedResponseInfo googleFinanceMarketsLiveAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleFinanceMarketsLiveAdvancedResponseInfo response = apiInstance.googleFinanceMarketsLiveAdvanced(
       List.of(
    
           new SerpGoogleFinanceMarketsLiveAdvancedRequestInfo()
        
           .locationCode(2840)
        
        
           .languageName("English")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleFinanceMarketsLiveAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleFinanceMarketsLiveAdvancedRequestInfo>&gt;**](List<SerpGoogleFinanceMarketsLiveAdvancedRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleFinanceMarketsLiveAdvancedResponseInfo**](SerpGoogleFinanceMarketsLiveAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleFinanceMarketsLiveHtml"></a>
# **googleFinanceMarketsLiveHtml**
> SerpGoogleFinanceMarketsLiveHtmlResponseInfo googleFinanceMarketsLiveHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleFinanceMarketsLiveHtmlResponseInfo response = apiInstance.googleFinanceMarketsLiveHtml(
       List.of(
    
           new SerpGoogleFinanceMarketsLiveHtmlRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleFinanceMarketsLiveHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleFinanceMarketsLiveHtmlRequestInfo>&gt;**](List<SerpGoogleFinanceMarketsLiveHtmlRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleFinanceMarketsLiveHtmlResponseInfo**](SerpGoogleFinanceMarketsLiveHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleFinanceQuoteTaskPost"></a>
# **googleFinanceQuoteTaskPost**
> SerpGoogleFinanceQuoteTaskPostResponseInfo googleFinanceQuoteTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleFinanceQuoteTaskPostResponseInfo response = apiInstance.googleFinanceQuoteTaskPost(
       List.of(
    
           new SerpGoogleFinanceQuoteTaskPostRequestInfo()
        
           .keyword(".DJI:INDEXDJX")
        
        
           .locationCode(2840)
        
        
           .languageName("English")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleFinanceQuoteTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleFinanceQuoteTaskPostRequestInfo>&gt;**](List<SerpGoogleFinanceQuoteTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleFinanceQuoteTaskPostResponseInfo**](SerpGoogleFinanceQuoteTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleFinanceQuoteTasksReady"></a>
# **googleFinanceQuoteTasksReady**
> SerpGoogleFinanceQuoteTasksReadyResponseInfo googleFinanceQuoteTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleFinanceQuoteTasksReadyResponseInfo response = apiInstance.googleFinanceQuoteTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleFinanceQuoteTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleFinanceQuoteTasksReadyResponseInfo**](SerpGoogleFinanceQuoteTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleFinanceQuoteTaskGetAdvanced"></a>
# **googleFinanceQuoteTaskGetAdvanced**
> SerpGoogleFinanceQuoteTaskGetAdvancedResponseInfo googleFinanceQuoteTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleFinanceQuoteTaskGetAdvancedResponseInfo response = apiInstance.googleFinanceQuoteTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleFinanceQuoteTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleFinanceQuoteTaskGetAdvancedResponseInfo**](SerpGoogleFinanceQuoteTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleFinanceQuoteTaskGetHtml"></a>
# **googleFinanceQuoteTaskGetHtml**
> SerpGoogleFinanceQuoteTaskGetHtmlResponseInfo googleFinanceQuoteTaskGetHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleFinanceQuoteTaskGetHtmlResponseInfo response = apiInstance.googleFinanceQuoteTaskGetHtml(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleFinanceQuoteTaskGetHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleFinanceQuoteTaskGetHtmlResponseInfo**](SerpGoogleFinanceQuoteTaskGetHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleFinanceQuoteLiveAdvanced"></a>
# **googleFinanceQuoteLiveAdvanced**
> SerpGoogleFinanceQuoteLiveAdvancedResponseInfo googleFinanceQuoteLiveAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleFinanceQuoteLiveAdvancedResponseInfo response = apiInstance.googleFinanceQuoteLiveAdvanced(
       List.of(
    
           new SerpGoogleFinanceQuoteLiveAdvancedRequestInfo()
        
           .keyword("CLW00:NYMEX")
        
        
           .locationCode(2840)
        
        
           .languageName("English")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleFinanceQuoteLiveAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleFinanceQuoteLiveAdvancedRequestInfo>&gt;**](List<SerpGoogleFinanceQuoteLiveAdvancedRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleFinanceQuoteLiveAdvancedResponseInfo**](SerpGoogleFinanceQuoteLiveAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleFinanceQuoteLiveHtml"></a>
# **googleFinanceQuoteLiveHtml**
> SerpGoogleFinanceQuoteLiveHtmlResponseInfo googleFinanceQuoteLiveHtml()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleFinanceQuoteLiveHtmlResponseInfo response = apiInstance.googleFinanceQuoteLiveHtml(
       List.of(
    
           new SerpGoogleFinanceQuoteLiveHtmlRequestInfo()
        
           .languageCode("en")
        
        
           .locationCode(2840)
        
        
           .keyword("NASDAQ-100")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleFinanceQuoteLiveHtml");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleFinanceQuoteLiveHtmlRequestInfo>&gt;**](List<SerpGoogleFinanceQuoteLiveHtmlRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleFinanceQuoteLiveHtmlResponseInfo**](SerpGoogleFinanceQuoteLiveHtmlResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleFinanceTickerSearchTaskPost"></a>
# **googleFinanceTickerSearchTaskPost**
> SerpGoogleFinanceTickerSearchTaskPostResponseInfo googleFinanceTickerSearchTaskPost()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleFinanceTickerSearchTaskPostResponseInfo response = apiInstance.googleFinanceTickerSearchTaskPost(
       List.of(
    
           new SerpGoogleFinanceTickerSearchTaskPostRequestInfo()
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .category("all")
        
        
           .keyword("DJ")
        
        
           .priority(2)
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleFinanceTickerSearchTaskPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleFinanceTickerSearchTaskPostRequestInfo>&gt;**](List<SerpGoogleFinanceTickerSearchTaskPostRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleFinanceTickerSearchTaskPostResponseInfo**](SerpGoogleFinanceTickerSearchTaskPostResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleFinanceTickerSearchTasksReady"></a>
# **googleFinanceTickerSearchTasksReady**
> SerpGoogleFinanceTickerSearchTasksReadyResponseInfo googleFinanceTickerSearchTasksReady()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);

    SerpGoogleFinanceTickerSearchTasksReadyResponseInfo response = apiInstance.googleFinanceTickerSearchTasksReady();
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleFinanceTickerSearchTasksReady");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleFinanceTickerSearchTasksReadyResponseInfo**](SerpGoogleFinanceTickerSearchTasksReadyResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleFinanceTickerSearchTaskGetAdvanced"></a>
# **googleFinanceTickerSearchTaskGetAdvanced**
> SerpGoogleFinanceTickerSearchTaskGetAdvancedResponseInfo googleFinanceTickerSearchTaskGetAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    String id = ;
    SerpGoogleFinanceTickerSearchTaskGetAdvancedResponseInfo response = apiInstance.googleFinanceTickerSearchTaskGetAdvanced(id);
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleFinanceTickerSearchTaskGetAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


    
This endpoint does not need any parameter.
    


### Return type

[**SerpGoogleFinanceTickerSearchTaskGetAdvancedResponseInfo**](SerpGoogleFinanceTickerSearchTaskGetAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="googleFinanceTickerSearchLiveAdvanced"></a>
# **googleFinanceTickerSearchLiveAdvanced**
> SerpGoogleFinanceTickerSearchLiveAdvancedResponseInfo googleFinanceTickerSearchLiveAdvanced()


### Example
```java
    
import io.github.dataforseo.client.ApiClient;
import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.Configuration;
import io.github.dataforseo.client.auth.*;
import io.github.dataforseo.client.model.*;
import io.github.dataforseo.client.api.SerpApi;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
  try {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dataforseo.com");


    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("USERNAME");
    basicAuth.setPassword("PASSWORD");
    SerpApi apiInstance = new SerpApi(defaultClient);
    SerpGoogleFinanceTickerSearchLiveAdvancedResponseInfo response = apiInstance.googleFinanceTickerSearchLiveAdvanced(
       List.of(
    
           new SerpGoogleFinanceTickerSearchLiveAdvancedRequestInfo()
        
           .languageName("English")
        
        
           .locationCode(2840)
        
        
           .category("all")
        
        
           .keyword("DJ")
    
       )
    );
    System.out.println(result);
  } catch (ApiException e) {
      System.err.println("Exception when calling SerpApi#googleFinanceTickerSearchLiveAdvanced");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

    | Name | Type | Description  | Notes |
    |------------- | ------------- | ------------- | -------------|
    | **** | [**List&lt;List<SerpGoogleFinanceTickerSearchLiveAdvancedRequestInfo>&gt;**](List<SerpGoogleFinanceTickerSearchLiveAdvancedRequestInfo>.md)|  | [optional] |



### Return type

[**SerpGoogleFinanceTickerSearchLiveAdvancedResponseInfo**](SerpGoogleFinanceTickerSearchLiveAdvancedResponseInfo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |