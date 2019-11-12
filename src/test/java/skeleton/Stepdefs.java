package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
	WebDriver driver;
	@Given("user launches internetexplorer and navigates to application")
	public void user_launches_internetexplorer_and_navigates_to_application() {
		 System.setProperty("webdriver.chrome.driver","C:\\NexGen Testing Stream\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
         driver.get("http://newtours.demoaut.com/");
	}

	@When("user enters username as {string} in username field")
	public void user_enters_username_as_in_username_field(String un) {
	  driver.findElement(By.name("userName")).sendKeys(un);
	}

	@When("user enters password as {string} in password field")
	public void user_enters_password_as_in_password_field(String pwd) {
	  driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@When("click Signin")
	public void click_Signin() {
	 driver.findElement(By.name("login")).click();
	}

	@Then("validates Login Success")
	public void validates_Login_Success() {
	 Assert.assertTrue(driver.getTitle().contains("Find a Flight"));
	}
}
