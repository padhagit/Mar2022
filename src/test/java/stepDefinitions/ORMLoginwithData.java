package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ORMLoginwithData {
	WebDriver driver;

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M.Padmanaban\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	}

	@When("user enters the valid credentials {string} and {string}")
	public void user_enters_the_valid_credentials_and(String username, String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);

	}

	@When("clicks the login button")
	public void clicks_the_login_button() {
		driver.findElement(By.id("btnLogin")).click();

	}

	@Then("user should be see the home page")
	public void user_should_be_see_the_home_page() {
		boolean status = driver.findElement(By.linkText("Apply Leave")).isDisplayed();
		Assert.assertTrue(status);

	}

}
