Feature: Validation of Contact Us page

  Scenario Outline: Validate the Contact Us page
    Given user launches the application
    And user click on contactus button
    And user enters the "<name>" and "<email>" and "<subject>" and "<message>"
    And user click on the submit button
    Then user should be able to view contact us form confirmation
    Examples:
    |name | |email| |subject| |message|
    |     | |     | |Good Morning|   |       |
    |     | |     | |Good Afternoon| |       |
    |     | |     | |Good Evening|   |       |