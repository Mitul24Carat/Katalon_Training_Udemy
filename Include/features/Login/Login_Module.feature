@tag
Feature: Login Module Verification with Valid/Invalid Credentials

  @tag1
  Scenario Outline: Verify Login functionality
    Given User is on Login Page
    When User Enters Username and Password
    And Clicks on Login button
    Then User redirects to the Dashboard Page

    Examples: 
      | Username      | Password     |
      | standard_user | secret_sauce |
      
      
    Examples: 
      | Username      | Password     |
      | standard_user | secret_admin |
