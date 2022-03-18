package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ORMlogin {
	WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\M.Padmanaban\\Downloads\\chromedriver_win32" );	
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/license/addLicense");
	}

	@When("user enters the valid username and password")
	public void user_enters_the_valid_username_and_password() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("user should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
		boolean status = driver.findElement(By.linkText("Apply Leave")).isDisplayed();
		Assert.assertTrue(status);
	}

}
