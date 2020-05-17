Feature: Test login functionality

  Scenario: google logo
    Given launch chrome browser
    When open google page
    Then verify that logo is
    And close browser

  Scenario: User logs in with valid credentials
    Given homepage is opened
    When user clicks on login link
    And user enters email "sandrakibarte@yahoo.com"
    And user enters password "sandrakibarte"
    And user clicks button "Prisijungti"
    Then user is logged in successfully

    Scenario: User logs in with invalid credentials - wrong password
      Given homepage is opened
      When user clicks on login link
      And user enters email "sandrakibarte@yahoo.com"
      And user enters password "wrong"
      And user clicks button "Prisijungti"
      Then user gets notification about unsuccessful login


  Scenario: User logs in with invalid credentials - wrong email
    Given Given homepage is opened
    When user clicks on login link
    And user enters email "sandra@yahoo.com"
    And user enters password "sandrakibarte"
    And user clicks button "Prisijungti"
    Then user gets notification about unsuccessful login

  Scenario: User logs in with invalid credentials - empty password
    Given Given homepage is opened
    When user clicks on login link
    And user enters email "sandrakibarte@yahoo.com"
    And user enters password ""
    And user clicks button "Prisijungti"
    Then user gets notification that all fields are required

  Scenario: User logs in with invalid credentials - empty email
    Given Given homepage is opened
    When user clicks on login link
    And user enters email ""
    And user enters password "sandrakibarte"
    And user clicks button "Prisijungti"
    Then user gets notification that all fields are required

  Scenario: User logs in with invalid credentials - empty password and email
    Given Given homepage is opened
    When user clicks on login link
    And user enters email ""
    And user enters password ""
    And user clicks button "Prisijungti"
    Then user gets notification that all fields are required

  Scenario: User logs in using existing account single sign on - Google
    Given Given homepage is opened
    When user clicks on login link
    And user clicks button "Prisijungti su Google"
    And user selects Google account
    Then user is logged in successfully

  Scenario: User logs in using not existing account single sign on - Google
  Scenario: User logs in using existing account single sign on - Facebook
  Scenario: User logs in using not existing account single sign on - Facebook