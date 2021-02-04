Feature: Test login funtionality

  @SignUpTag
  Scenario: checks validate login functionality
    Given user enters url
    When user enters fisrtName
    When user enters lastName
    When user select nationality
    When user enters cnic
    When user enters password
    When user enters confirm password
    When user enters mobile number
    When user enters email
    And user click submit button
    
