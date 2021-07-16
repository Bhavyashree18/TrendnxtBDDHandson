Feature: Registration and Add to Cart
  
  @Test
  Scenario: Registration and Add to Cart
    Given I Launch the Opencart Application
    And I Click on Create Account link
    Then I filled the details of the page
       | test1234ew | 
    Then I check Privacy policy and Continue
    Then I click on Contact Link
    Then I Type the Enquiry 
    And I Click on Submit button
    Then I Click on Samsung Galaxy Phone
    And Click on Review tab below
    And I fill the details and Click on Continue
         | test1234test1234test1234t | 
    And I Click on Add to Wish List
    Then I Close the Success Ribbon message
    Then I Click on Wishlist link
    Then Click on Currency "Pound Sterling"     
    Then Retrive the value and Display
    Then Click on Currency "Euro"
    Then Retrive the value and Display
    Then Click on Currency "US Dollar"
    Then Retrive the value and Display
    Then Click on Add to Cart icon
    Then I Close the Success Ribbon message
    Then Click on Remov icon on Product in My Wishlist page
    And I Click on Continue button
    Then I click on Logout
    