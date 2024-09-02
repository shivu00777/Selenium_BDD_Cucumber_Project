Feature: Automate Details of Naptop website

	@Startup
  Scenario: Automate Tablets & Computers
    Given User is on Naptop Home Page
    When Click on shopping categories
    And Click on the Tablets & Computers
    Then Click Tablets
    And Click Non-Calling Tablets
    Then Close the Browser


	@Personalise_Search_1
  Scenario: Automate Tablets & Computers
    Given User is on Naptop Home Page
    When Click on shopping categories
    And Click on the Tablets & Computers
    Then Click Tablets
    And Click Non-Calling Tablets
    Then Check COD Box
    And Click on Set
    Then Close the Browser
    
  
  @Personalise_Search_2
  Scenario: Automate Tablets & Computers
    Given User is on Naptop Home Page
    When Click on shopping categories
    And Click on the Tablets & Computers
    Then Click Tablets
    And Click Non-Calling Tablets
    Then Check Out of box
    When Enter data in Search Product 
    And Click on Set
    Then Close the Browser
    
  
   
  @Personalise_Search_3
  Scenario: Automate Tablets & Computers
    Given User is on Naptop Home Page
    When Click on shopping categories
    And Click on the Tablets & Computers
    Then Click Tablets
    And Click Non-Calling Tablets
    Then Check Product with free shipping
    When Enter Pincode in Search Product Related to free shipping
    And Click on Set
    Then Close the Browser
    
    
    
  @Search_by_Brands
  Scenario: Automate Tablets & Computers
    Given User is on Naptop Home Page
    When Click on shopping categories
    And Click on the Tablets & Computers
    Then Click Tablets
    And Click Non-Calling Tablets
    Then Enter Data on Search Brand
    When Click on visible option
    Then Close the Browser
    
    
  @Search_by_Price
  Scenario: Automate Tablets & Computers
    Given User is on Naptop Home Page
    When Click on shopping categories
    And Click on the Tablets & Computers
    Then Click Tablets
    And Click Non-Calling Tablets
    Then Enter Data in to
    When Enter Data in from
    And Click on go button
    Then Close the Browser
    
    
    
	@Compare_Products
  Scenario: Automate Tablets & Computers
    Given User is on Naptop Home Page
    When Click on shopping categories
    And Click on the Tablets & Computers
    Then Click Tablets
    And Click Non-Calling Tablets
    Then Click on add to compare1
    When Click on add to compare2
    And Click on add to compare3
    Then Click on Compare Button
    And Click dropdown button and select iBall
    When Click on Close button
    Then Close the Browser
    
    
	@Random_Clicks
  Scenario: Automate Tablets & Computers
    Given User is on Naptop Home Page
    When Click on shopping categories
    And Click on the Tablets & Computers
    Then Click Tablets
    And Click Non-Calling Tablets
    Then Search tablet
    When Click on Home
    Then Close the Browser
    #
    #
    
    
    
  @Sorting
  Scenario: Automate Tablets & Computers
    Given User is on Naptop Home Page
    When Click on shopping categories
    And Click on the Tablets & Computers
    Then Click Tablets
    And Click Non-Calling Tablets
    Then Click on sort by
    When choose option most expensive
    Then Close the Browser
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    