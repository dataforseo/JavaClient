# MathSolverSerpElementItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
**rankGroup** | **Integer** | group rank in SERP<br>position within a group of elements with identical type values;<br>positions of elements with different type values are omitted from rank_group;<br>always equals 0 for desktop |[optional]|
**rankAbsolute** | **Integer** | absolute rank in SERP<br>absolute position among all the elements in SERP<br>always equals 0 for desktop |[optional]|
**title** | **String** | reference page title |[optional]|
**result** | **String** | solution to the equation<br>solution to the mathematical equation specified in the keyword field when setting a task |[optional]|
**items** | **List<MathSolverElement>** | contains arrays of specific images |[optional]|
**links** | **List<LinkElement>** | website links featured in the element |[optional]|