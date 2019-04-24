package Cucumber.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	String baseURL = "http://newtours.demoaut.com/";
	String driverpath = "C:\\Users\\ayush.mrinal\\Downloads\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;
	
	@Given("^user verifies \"([^\"]*)\"$")
	public void user_verifies(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement jtype = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));
		jtype.click();
	    
	}

	@Given("^user launched the application$")
	public void user_launched_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("launching chrome browser"); 
        System.setProperty("webdriver.chrome.driver", driverpath);
        driver= new ChromeDriver();
        driver.get(baseURL);
	}

	@When("^user enters credentials$")
	public void user_enters_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement uname = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"));
		WebElement pass = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input"));
		uname.sendKeys("mercury");
		pass.sendKeys("mercury");
		 
	}

	@When("^clicks on signin button$")
	public void clicks_on_signin_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement signin = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"));
		signin.click(); 
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
	}

}
