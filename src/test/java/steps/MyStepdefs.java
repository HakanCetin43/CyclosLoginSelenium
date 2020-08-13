package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import page.classes.SignInPage;

import static page.classes.LoginPage.*;
import static page.classes.WelcomePage.*;
import static page.classes.SignInPage.*;

public class MyStepdefs {

   static WebDriver driver;
   static WebDriverWait wait;
    @Before
    public void driverSetUp(){
        System.setProperty("webdriver.chrome.driver","C:/Users/HCC/Desktop/Intellije_Projects/Drivers/chromedriver .exe");
        driver= new ChromeDriver();
        wait= new WebDriverWait(driver, 20);
    }
    @After
    public void tearDown() throws InterruptedException {
        driver.quit();
        Thread.sleep(2000);
    }

    @Given("user navigates cyclos_demo_website")
    public void userNavigates() {
        navigate(driver);
    }

    @When("user clicks Sign_in area")
    public void userClicksArea() {
        signInButton(wait);
    }

    @And("user enters user_name to Login_Name area")
    public void userEntersToArea() {
        loginNameButton(wait);
    }

    @And("user enters password to Password area")
    public void userEntersPasswordToPasswordArea() {
        loginPasswordButton(wait);
    }

    @And("user clicks Login area")
    public void userClicksLoginArea() {
        signInClickButton(wait);
    }

    @Then("user views text")
    public void userViews() {
        getText(wait);
    }
}



