package StepOfDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPagefactory {
    WebDriver driver;
    LoginPage loginPage;

    @Given("the user is on the ylogin page")
	public void the_user_is_on_the_ylogin_page() {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage=new LoginPage(driver);
	    
	}
	
	@When("the user enters valid yusername and password")
	public void the_user_enters_valid_yusername_and_password() {
		loginPage.enterUsername("standard_user");
	    loginPage.enterPassword("secret_sauce");
		
	}    

	@When("clicks on the yLogin button")
	public void clicks_on_the_y_login_button() {
		loginPage.clickLogin();
	    
	}

	@Then("the user should be redirected to the ydashboard")
	public void the_user_should_be_redirected_to_the_ydashboard() {
		driver.quit();
	   
	}

}