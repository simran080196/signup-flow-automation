package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SignupPage;

public class SignupSteps {
    WebDriver driver;
    SignupPage signupPage = new SignupPage(driver);

    @Given("User launch the browser and enter the URL.")
    public void launchTheBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @When("User click on Create Account")
    public void clickOnCreateAccount()
    {
        signupPage.clickOnCreateAccount();
    }

    @Then("verify that user land on create signup page")
    public void verifyTheSignupPage()
    {
        signupPage.verifyTheSignupPageClass();
    }

    @Then("User should be redirected to the dashboard page")
    public void verifyTheDashboardPage()
    {
        signupPage.verifyTheDashboardPage();
    }
}
