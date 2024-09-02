package code_Steps;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepsFile {

	static	WebDriver driver;
	protected ExtentReports report;
	protected ExtentTest test;
	
	
	
	// ScreenShot Method
		public  void captureScreenshot(WebDriver driver, int A) throws IOException {
			TakesScreenshot Ss = (TakesScreenshot)driver;
			
			// Using getscreenshotAs() Function to take screenshot in Tests

			File screenShot = Ss.getScreenshotAs(OutputType.FILE);
			
			File Screenshot = new File("/Users/shivamsharma/eclipse-workspace/Selenium_BDD_Cucumber_Project/target/Screenshot"+A+".png");
			
			FileUtils.copyFile(screenShot, Screenshot); 
		}
	
		
		
		@Given("User is on Naptop Home Page")
		public void user_is_on_naptop_home_page() throws InterruptedException, IOException {
		    
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://www.naaptol.com/");
			
			Thread.sleep(1000);
			
			
			captureScreenshot(driver, 1);
			
		}

		@When("Click on shopping categories")
		public void click_on_shopping_categories() {
		   
			
			driver.findElement(By.cssSelector("[class=\"arrowNav\"]")).click();
			
		}

		@And("Click on the Tablets & Computers")
		public void click_on_the_tablets_computers() {
		   
			driver.findElement(By.xpath("(//a[@href=\"/shop-online/computers-peripherals.html\"])[1]")).click();
			
		}

		@Then("Click Tablets")
		public void click_tablets() {
		   
			driver.findElement(By.cssSelector("[class=\"cate_mother\"]")).click();
			
		}

		@And("Click Non-Calling Tablets")
		public void click_non_calling_tablets() {
		   
			driver.findElement(By.cssSelector("[title=\"Non-Calling Tablets\"]")).click();
			
		}

		@Then("Check Out of box")
		public void check_out_of_box() {
		   
			driver.findElement(By.cssSelector("[name=\"isexoutStock\"]")).click();
			
		}

		@When("Enter data in Search Product")
		public void enter_data_in_search_product() {
		   
			driver.findElement(By.cssSelector("[id=\"pincode\"]")).sendKeys("110076");
			
		}

		
		@Then("Check COD Box")
		public void check_cod_box() {
		   
			driver.findElement(By.cssSelector("[name=\"iscod\"]")).click();
			
		}

		@And("Click on Set")
		public void click_on_set() throws IOException, InterruptedException {
		   
			driver.findElement(By.cssSelector("[onclick=\"productSearch.setPersonalisedFilter(false);\"]")).click();
			
			Assert.assertEquals(driver.findElement(By.cssSelector("[class=\"errorMsg\"]")).getText(),"No product found for this filter combination, remove some of the filters to see products");
			
			Thread.sleep(1000);
			
//			captureScreenshot(driver, 1);
			
		}

		@Then("Close the Browser")
		public void close_the_browser() throws InterruptedException {
		   
			
			Thread.sleep(1000);
			driver.quit();
		}

		
		
		@Then("Check Product with free shipping")
		public void check_product_with_free_shipping() {
		   
			driver.findElement(By.cssSelector("[name=\"isfreeship\"]")).click();
			
		}

		@When("Enter Pincode in Search Product Related to free shipping")
		public void enter_pincode_in_search_product_related_to_free_shipping() {
		
			driver.findElement(By.cssSelector("[id=\"pincode\"]")).sendKeys("211551");
			

		}

		@Then("Enter Data on Search Brand")
		public void enter_data_on_search_brand() {
		    
			driver.findElement(By.cssSelector("[placeholder=\"search brand\"]")).sendKeys("I KALL");
			
		}

		@When("Click on visible option")
		public void click_on_visible_option() {
		  
			driver.findElement(By.cssSelector("[id=\"brandFilterBox38673\"]")).click();
			
		}
		
		
		

		@Then("Enter Data in to")
		public void enter_data_in_to() {
		   
			driver.findElement(By.cssSelector("[id=\"toPriceRange\"]")).sendKeys("6000");
			
		}

		@When("Enter Data in from")
		public void enter_data_in_from() {
		    
			driver.findElement(By.cssSelector("[name=\"fromPriceRange\"]")).sendKeys("7678");
			
		}

		@And("Click on go button")
		public void click_on_go_button() {
			
			driver.findElement(By.cssSelector("[onclick=\"productSearch.setPriceRange(false)\"]")).click();
			
		}



		
		
		
		@Then("Click on add to compare1")
		public void click_on_add_to_compare1() throws InterruptedException {
		  
			driver.findElement(By.cssSelector("[pname=\"I Kall Education & Entertainment Tablet (N7)\"]")).click();
		
			Thread.sleep(1000);
			
		}

		@When("Click on add to compare2")
		public void click_on_add_to_compare2() throws InterruptedException {
		    

			driver.findElement(By.cssSelector("[pname=\"I Kall Entertainment & Education Wi-Fi Tablet with Stand (N7)\"]")).click();
			
			Thread.sleep(1000);
		}

		@And("Click on add to compare3")
		public void click_on_add_to_compare3() throws InterruptedException, IOException {
		    
			driver.findElement(By.cssSelector("[pname=\"iBall Tablet Slide i7011\"]")).click();
			Thread.sleep(1000);
			
			captureScreenshot(driver, 2);
			
			
			
		}

		
		@Then("Click on Compare Button")
		public void click_on_compare_button() {
		   
			driver.findElement(By.cssSelector("[id=\"compareButton\"]")).click();
			
		}

		@And("Click dropdown button and select iBall")
		public void click_dropdown_button_and_select_i_ball() {
		    
			WebElement dropdown = driver.findElement(By.cssSelector("[class=\"dropDownCompare\"]"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("iBall");
			
		}

		@When("Click on Close button")
		public void click_on_close_button() {
		    
			driver.findElement(By.cssSelector("[title=\"Close\"]")).click();
			
			driver.findElement(By.xpath("(//a[@title=\"I Kall Education & Entertainment Tablet (N7)\"])[1]")).click();
			
		}

		
		
				
				

		
		@Then("Search tablet")
		public void search_tablet() throws InterruptedException {
		    
			driver.findElement(By.cssSelector("[id=\"header_search_text\"]")).sendKeys("tablet");
			
			Thread.sleep(2000);
			
			
			
		}

		

		@When("Click on Home")
		public void click_on_home() throws IOException {
		  
			driver.findElement(By.cssSelector("[class=\"bcPlusIcon\"]")).click();
			
			captureScreenshot(driver, 4);
		
		}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		@Then("Click on sort by")
		public void click_on_sort_by() {

			WebElement dropdown = driver.findElement(By.cssSelector("[id=\"sortByFilter\"]"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("Most Expensive");
			
			
		}

		@When("choose option most expensive")
		public void choose_option_most_expensive() throws InterruptedException, IOException {
			
			
			Thread.sleep(2000);
			
			Assert.assertEquals(driver.findElement(By.cssSelector("[id=\"loading_Pagination\"]")).getText(),"No more results to display.");
			
			captureScreenshot(driver, 3);
		}
		
		
		
		
		
}
