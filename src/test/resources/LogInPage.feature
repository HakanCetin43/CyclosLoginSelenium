Feature: CyclosBank login page
  Scenario: The user can login with a valid username and password
    Given user navigates cyclos_demo_website
   When user clicks Sign_in area
    And user enters user_name to Login_Name area
    And user enters password to Password area
    And user clicks Login area
    Then user views text