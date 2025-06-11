package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SignupPage;

public class SignupSteps {
    WebDriver driver;
    SignupPage signupPage;
    @Given("User launch the browser and enter the URL.")
    public void launchTheBrowser(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
        signupPage = new SignupPage(driver);
    }

    @When("User click on Create Account")
    public void clickOnCreateAccount()
    {
        signupPage.clickOnCreateAccount();
    }

    @Then("verify that user land on create signup page")
    public void verifyCreateAccountPage()
    {
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, "Create New Customer Account");
        signupPage.verifyTheSignupPageClass();
    }

    @Then("User should be redirected to the dashboard page")
    public void verifyTheDashboardPage()
    {

    }



}
