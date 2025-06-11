package pages;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignupPage {
    //(//a[contains(text(), 'Create an Account')])[1]

    WebDriver driver;

    @FindBy(xpath = "(//a[contains(text(), 'Create an Account')])[1]")
    WebElement createAnAccountLink;

    @FindBy(id = "firstname")
    WebElement firstNameField;

    @FindBy(id = "lastname")
    WebElement lastNameField;

    @FindBy(id = "email_address")
    WebElement emailField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "password-confirmation")
    WebElement confirmPasswordField;

    @FindBy(xpath = "//button[@title='Create an Account']")
    WebElement createAnAccountButton;

    @FindBy(xpath = "//span[text()=\"My Account\"]")
    WebElement myAccountDetails;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void pageLoad()
    {
        try{
            Thread.sleep(5000);
        }
        catch(Exception e){
            System.out.println("pageNotLoaded");
        }
    }

    public void clickOnCreateAccount()
    {
        pageLoad();
        createAnAccountLink.click();

    }

    public void verifyTheSignupPageClass() {

        pageLoad();
        firstNameField.sendKeys("Simran");
        pageLoad();
        lastNameField.sendKeys("Malhotra");
        pageLoad();
        emailField.sendKeys("simi123@gmail.com");
        pageLoad();
        passwordField.sendKeys("QWERTY@1234");
        pageLoad();
        confirmPasswordField.sendKeys("QWERTY@1234");
        pageLoad();

        createAnAccountButton.click();
    }
}
