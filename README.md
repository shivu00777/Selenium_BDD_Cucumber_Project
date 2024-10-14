Naaptol Mobile and Tablets Automation
Overview
This project automates the functionality of the 'Mobile and Tablets' section on the Naaptol website using Selenium WebDriver and Cucumber BDD framework. The automation covers various scenarios, including navigation, product search, adding products to the cart, and validating the final checkout process.

Project Structure
Framework: Selenium WebDriver, Cucumber (BDD), Maven
Programming Language: Java
Test Runner: testNG
Reports: Extent Reports
Build Tool: Maven
Features Automated
Product Listing – Validate that all products under the "Mobile and Tablets" section are displayed.
Product Search – Search for specific products and verify that search results are accurate.
Add to Cart – Select products and add them to the shopping cart.
Checkout Flow – Automate the entire checkout process.
Assertions – Validate that appropriate actions (e.g., correct product added to cart) have been performed using assertions.
Screenshots – Capture screenshots on test failures and success.
Prerequisites
Before running the tests, make sure you have the following installed on your system:

Java (JDK 8 or higher)
Maven
Selenium WebDriver (Included via Maven dependencies)
Cucumber plugin (for feature file execution)
Naaptol website credentials (optional, if automating login)


Here’s a sample README.md file for your Selenium BDD Cucumber project that automates the 'Mobile and Tablets' section of the Naaptol website:

Naaptol Mobile and Tablets Automation
Overview
This project automates the functionality of the 'Mobile and Tablets' section on the Naaptol website using Selenium WebDriver and Cucumber BDD framework. The automation covers various scenarios, including navigation, product search, adding products to the cart, and validating the final checkout process.

Project Structure
Framework: Selenium WebDriver, Cucumber (BDD), Maven
Programming Language: Java
Test Runner: JUnit
Reports: Extent Reports
Build Tool: Maven
Features Automated
Product Listing – Validate that all products under the "Mobile and Tablets" section are displayed.
Product Search – Search for specific products and verify that search results are accurate.
Add to Cart – Select products and add them to the shopping cart.
Checkout Flow – Automate the entire checkout process.
Assertions – Validate that appropriate actions (e.g., correct product added to cart) have been performed using assertions.
Screenshots – Capture screenshots on test failures and success.
Prerequisites
Before running the tests, make sure you have the following installed on your system:

Java (JDK 8 or higher)
Maven
Selenium WebDriver (Included via Maven dependencies)
Cucumber plugin (for feature file execution)
Naaptol website credentials (optional, if automating login)
Project Setup
Clone this repository:

bash
Copy code
git clone https://github.com/yourusername/naaptol-automation.git
Navigate to the project directory:

bash
Copy code
cd naaptol-automation
Import the project into your IDE (Eclipse/IntelliJ) as a Maven project.

Run the following Maven command to install the dependencies:

bash
Copy code
mvn clean install
Running the Tests
To execute the test scenarios, run the following command from the project root directory:

bash
Copy code
mvn test
Alternatively, you can run specific feature files using the Cucumber plugin in your IDE.

Project Structure
src/test/java/ – Contains the step definitions and hooks.
src/test/resources/features/ – Holds the Cucumber feature files.
src/main/resources/ – Configuration files, such as property files, can be placed here.
src/test/resources/extent-config.xml – Configuration for generating the Extent Report.
Feature Files
The feature files are located in the src/test/resources/features folder. Each feature file contains scenarios related to different functionalities in the 'Mobile and Tablets' section.

Example of a scenario in MobileTablets.feature:

gherkin
Copy code
Feature: Mobile and Tablets functionality
  As a user, I want to browse the mobile and tablet section and add products to the cart

  Scenario: Add a mobile phone to the cart
    Given I navigate to the "Mobile and Tablets" section
    When I select a mobile phone
    And I add it to the cart
    Then I should see the product in the cart
Extent Reports
The Extent Report is generated after running the tests and can be found in the target/ folder. To view the report:

Open the ExtentReport.html file in your browser.
GitHub
Once the project is complete, push the code to your GitHub repository:

bash
Copy code
git add .
git commit -m "Initial commit for Naaptol Mobile and Tablets automation"
git push origin main
