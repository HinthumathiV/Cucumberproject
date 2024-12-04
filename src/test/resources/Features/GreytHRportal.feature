Feature: Login to greytHR portal

  Scenario Outline: Successfully login with valid Credentials
    Given User is on the greytHR login page
    # When User enter a valid "<Email>"
    # Then User click the Captcha
    # And User click the Search button
    # Then User clicking the Techstar grethr link
    When User enter a valid "<LoginId>" and "<password>"
    And User click on the login button
    Then User should be redirected to the greytHR dashboard and verify success message after login "Hi Hinthumathi"

    Examples: 
      | LoginId | password    |
      |    2545 | Hinthu@1164 |

  Scenario Outline: failed to login the GreytHr with invalid Credentials
    Given I am on the greytHR login page
    When I enter a invalid "<LoginId>" and "<password">
    And I click on the login button
    Then I should verify the error message 

    Examples: 
      | LoginId | password    |
      |  2575    | Hithu@1164 |
