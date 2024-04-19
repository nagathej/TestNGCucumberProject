Feature: Validation of get method
  @smoke
  Scenario Outline: Send a valid request to get the user details
    Given I invoke get request to get the user details of employee id
    Then the response will return status 200 and id <id> and salary "<movie>" and name "<rating>" and age "<image>" and message "<imdb_url>"

    Examples:
      |id  |movie|rating |image  |imdb_url                                  |
      |1   |The Shawshank Redemption         |9.2   |images/shawshank.jpg           |https://www.imdb.com/title/tt0111161/   |
  @Regression
  Scenario Outline: Send a valid request to get the user details
    Given I invoke get request to get the user details of employee id
    Then the response will return status 200 and id <id> and salary "<movie>" and name "<rating>" and age "<image>" and message "<imdb_url>"

    Examples:
      |id  |movie|rating |image  |imdb_url                                  |
      |2   |The Godfather         |9.2   |images/godfather.jpg           |https://www.imdb.com/title/tt0068646/   |



