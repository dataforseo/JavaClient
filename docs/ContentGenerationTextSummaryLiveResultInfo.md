# ContentGenerationTextSummaryLiveResultInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**sentences** | **Integer** | number of sentences found in the target text |[optional]|
**paragraphs** | **Integer** | number of paragraphs found in the target text |[optional]|
**words** | **Integer** | number of words found in the target text |[optional]|
**charactersWithoutSpaces** | **Integer** | number of characters without spaces found in the target text |[optional]|
**charactersWithSpaces** | **Integer** | number of characters with spaces found in the target text |[optional]|
**wordsPerSentence** | **Integer** | average number of words per sentence in the target text |[optional]|
**charactersPerWord** | **Integer** | average number of characters per word in the target text |[optional]|
**vocabularyDensity** | **Integer** | vocabulary density of the target text |[optional]|
**keywordDensity** | **Map<String, Long>** | keyword density of the target text<br>contains most common words and their count |[optional]|
**automatedReadabilityIndex** | **Integer** | Automated Readability Index |[optional]|
**colemanLiauIndex** | **Integer** | Coleman–Liau Index |[optional]|
**fleschKincaidGradeLevel** | **Integer** | Flesch–Kincaid Readability Index |[optional]|
**smogReadabilityIndex** | **Integer** | SMOG Readability Index |[optional]|
**spellingErrors** | **Integer** | number of spelling errors found in the target text |[optional]|
**grammarErrors** | **Integer** | number of grammar errors found in the target text |[optional]|