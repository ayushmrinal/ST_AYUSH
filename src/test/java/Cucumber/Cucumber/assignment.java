package Cucumber.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class assignment {

	String baseURL = "http://automationpractice.com";
	String driverpath = "C:\\Users\\ayush.mrinal\\Downloads\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver ;
	

	

	@Given("^user is on home page of application$")
	public void user_is_on_home_page_of_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("launching chrome browser"); 
		
        System.setProperty("webdriver.chrome.driver", driverpath);
        driver= new ChromeDriver();
        driver.get(baseURL);
		System.out.println("user is on home page");
	}

	@When("^user navigate to women's section$")
	public void user_navigate_to_women_s_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		// navigate to women's section
		driver.findElement(By.xpath("//a [@title=\"Women\"]")).click();
		
	}

	@When("^choose a top and add it to the cart$")
	public void choose_a_top_and_add_it_to_the_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
			//Select a top
				driver.findElement(By.xpath("//img [@title=\"Faded Short Sleeve T-shirts\"]")).click();
				
				//Add to cart
				driver.findElement(By.xpath("//button [@name=\"Submit\"]")).click();
 
	}

	@When("^make the payment$")
	public void make_the_payment() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//click on proceed to check out
				driver.findElement(By.xpath("//a [@title=\"Proceed to checkout\"]")).click();
				
				//click on proceed to check ou
				driver.findElement(By.xpath("//a [@title=\"Proceed to checkout\"]")).click();
				
				//click on proceed to check ou
				driver.findElement(By.xpath("//a [@title=\"Proceed to checkout\"]")).click();
								
				// Accept Terms and Conditions
				driver.findElement(By.xpath("//input [@type=\"checkbox\"]")).click();
				driver.findElement(By.xpath("//a [@title=\"Proceed to checkout\"]")).click();

	}

	@Then("^user should be able to complete the order$")
	public void user_should_be_able_to_complete_the_order() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
		
	}

	
	
}
