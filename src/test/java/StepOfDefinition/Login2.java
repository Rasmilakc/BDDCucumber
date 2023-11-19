package StepOfDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login2 {
	WebDriver driver;
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Opening the login page");
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe\\");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("the user enters valid username and password")
    public void the_user_enters_valid_username_and_password() {
        System.out.println("Entering the username and password");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @When("clicks on the Login button")
    public void clicks_on_the_login_button() {
        System.out.println("Click on login button");
        driver.findElement(By.id("login-button")).click();
    }

    @Then("the user should be redirected to the dashboard")
    public void the_user_should_be_redirected_to_the_dashboard() {
        System.out.println("Validate logo on dashboard");
        // Add assertion or verification steps to ensure redirection to the dashboard
        // Example: Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }
}