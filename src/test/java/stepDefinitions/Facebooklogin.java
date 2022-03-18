package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebooklogin {
	WebDriver driver;

	@Given("User should able to loging facebook url")
	public void user_should_able_to_loging_facebook_url() {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\M.Padmanaban\\Downloads\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Paddy");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("123456");

	}

	@And("User clicks the login button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.id("login")).click();
	}

	@Then("User verfies Facebook url")
	public void user_verfies_Facebook_url() {
		Assert.assertTrue(driver.getTitle().contains("Facebook"));

	}

}
