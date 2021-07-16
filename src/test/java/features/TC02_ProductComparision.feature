Feature: Product Comparision
@Test
  Scenario Outline: Product Comparision
    Given I Launch the Opencart Application
    And I Click on Login link
    Then I filled the details with <Username> and password <password> and Click on Logon 
    Then Enter the Keyword in Search box and hit Enter
    Then Select Monitors and Components in the Drop down
    Then I Click on Phone and PDA tab
    Then I Sort from price High to Low
    And I Click on Add compare for first three phones 
    Then I Close the Success Ribbon message
    Then I Click on Product Compare
    And Click on First Phone link on Page
    And Check the fifth feature in the description section of phone and write to file
    Then Click on Add to Cart icon
    Then Click on Shopping Cart
    And I Click on Check out
    #And I Click on Continue button
    #And I Click on Continue button
    #And I Click on Continue button
    #Then I check the Terms and Conditions checkbox
    #And I Click on Continue button
    Then I Click on Browser Back
    Then I Click on Order History from My Account
    Then Click on Subscribe to News Letter
    Then I click on Extras Specials in Footer
    Then Click on List or Grid Whichever is Enabled
    Then I click on Logout
    
    Examples:
|Username                  |password      |
|Test12345678@gmail.com    |Password123   |
    

 
