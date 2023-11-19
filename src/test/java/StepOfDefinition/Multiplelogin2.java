package StepOfDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Multiplelogin2 {
	WebDriver driver;
	@Given("User is on the Saucedemo dlogin page")
	public void user_is_on_the_saucedemo_dlogin_page() {
	    // Write code here that turns the phrase above into concrete actions
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe\\");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
	}

	@When("User enters dusername {string} and password {string}")
	public void user_enters_dusername_and_password(String username, String password) {
		WebElement userNameField = driver.findElement(By.id("user-name"));
		  WebElement passwordField = driver.findElement(By.id("password"));
		  userNameField.sendKeys(username);
		  passwordField.sendKeys(password);
		}

	@When("the clicks on the dLogin button")
	public void the_clicks_on_the_d_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
	}

	@Then("the login status should be {string}")
    public void the_login_status_should_be(String loginStatus) {
		if(loginStatus.equals("successful")) {
			  WebElement product = driver.findElement(By.cssSelector(".product_label"));
			   assertEquals("Products",product.getText());
		   }
		   else {
			 WebElement errorElement =  driver.findElement(By.cssSelector("h3[data-test=\"error\"]"));
			assertEquals("Epic sadface: Sorry, this user has been locked out." ,errorElement.getText());
		   }
		   
			driver.quit();
		}
	}
      