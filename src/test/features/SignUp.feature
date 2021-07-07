Feature: Sign Up

  Scenario: Sign up with valid credentials
    Given Navigate to login page
    Then Tap on Sign up link
    And Enter not existing email address
    Then Tap on Verify Email to Continue button
    When Information message was shown
    Then Navigate to yopmail page
    And Enter not existing in promo email 
		Then Navigate to email mailbox
		And Copy OTP
		Then Enter OTP in verification window
		When OTP was approved 
		Then Navigate to sign up Form
		And Enter all mandatory fields
		Then Tap on Sign up button
