Feature: Controllers

  Scenario: Registration controller 1
    Given open "http://localhost:7000/" page
    And press button_a "Sign Up"
    Then page was changed to "http://localhost:7000/registration"

  Scenario: Registration controller 2
    Given open "http://localhost:7000/" page
    And press button_a "Sign Up"
    Then input login "artemharuta@gmail.com"
    And input password "Oblako!7845216195"
    And input password confirmation "Oblako!7845216195"
    Then press button "Sign up"
    Then page was changed to "http://localhost:7000/home"

  Scenario: Login controller 1
    Given open "http://localhost:7000/" page
    And press button_a "Sign In"
    Then page was changed to "http://localhost:7000/login"

  Scenario: Login controller 2
    Given open "http://localhost:7000/" page
    Then input login "artemharuta@gmail.com"
    And input password "Oblako!7845216195"
    And press button "Sign in"
    Then page was changed to "http://localhost:7000/home"

  Scenario: Login controller 3
    Given open "http://localhost:7000/" page
    Then input login "artemharuta@gmail.com"
    And input password "Oblako!7845216195"
    And press button "Sign in"
    Then press button_a "Logout"
    Then page was changed to "http://localhost:7000/login"

  Scenario: Profile controller 1
    Given open "http://localhost:7000/" page
    Then input login "artemharuta@gmail.com"
    And input password "Oblako!7845216195"
    And press button "Sign in"
    Then press button_a "artemharuta@gmail.com"
    Then page was changed to "http://localhost:7000/profile"

  Scenario: Profile controller 2
    Given open "http://localhost:7000/" page
    Then input login "artemharuta@gmail.com"
    And input password "Oblako!7845216195"
    And press button "Sign in"
    Then press button_a "artemharuta@gmail.com"
    Then press button "Re-generate"
    Then message "API keys was reset successful" is visible

  Scenario: Profile controller 3
    Given open "http://localhost:7000/" page
    Then input login "artemharuta@gmail.com"
    And input password "Oblako!7845216195"
    And press button "Sign in"
    Then press button_a "artemharuta@gmail.com"
    Then press button "Change password"
    Then message "DB user password was changed" is visible

  Scenario: Profile controller 4
    Given open "http://localhost:7000/" page
    Then input login "artemharuta@gmail.com"
    And input password "Oblako!7845216195"
    And press button "Sign in"
    Then press button_a "artemharuta@gmail.com"
    Then press button "Upgrade"
    Then message "Role has been changed" is visible

  Scenario: Profile controller 5
    Given open "http://localhost:7000/" page
    Then input login "artemharuta@gmail.com"
    And input password "Oblako!7845216195"
    And press button "Sign in"
    Then press button_a "artemharuta@gmail.com"
    Then press button_a "Ukraine"
    Then button "Вийти" is visible


