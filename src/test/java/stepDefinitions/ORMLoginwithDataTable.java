package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ORMLoginwithDataTable {
	WebDriver driver;

	@Given("you are on login page")
	public void you_are_on_login_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M.Padmanaban\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@When("you enters the correct credentials")
	public void you_enters_the_correct_credentials(io.cucumber.datatable.DataTable dataTable) {

		List<String> credentials = dataTable.asList(String.class);
		String username = credentials.get(0);
		String password = credentials.get(1);
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@When("click the login icon")
	public void click_the_login_icon() {
		driver.findElement(By.id("btnLogin")).click();

	}

}
