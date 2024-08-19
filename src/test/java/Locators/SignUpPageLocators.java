package Locators;

import org.openqa.selenium.By;

public class SignUpPageLocators {
    public  By EnterAccountInfo = By.xpath("//b[text()='Enter Account Information']");
    public final By AddressInformation=By.xpath("//b[text()='Address Information']");
    public final By passwordField=By.id("password");
    public final By Gender=By.id("id_gender1");//male
    public final By Signupnews=By.id("newsletter");
    public final By optin=By.id("optin");
    public final By FirstName=By.id("first_name");
    public final By LastName=By.id("last_name");
    public final By Company=By.id("company");
    public final By Adres1=By.id("address1");
    public final By Adres2=By.id("address2");
    public final By State=By.id("state");
    public final By City=By.id("city");
    public final By ZipCode=By.id("zipcode");
    public final By MobileNumber=By.id("mobile_number");
    public final By CreateAccountBtn=By.xpath("//button[@data-qa='create-account']");
    public final By AccountCreated=By.xpath("//b[text()='Account Created!']");
    public final By VerifyAccountCreationText=By.xpath("//p[text()='Congratulations! Your new account has been successfully created!']");
    public final By ContinueBtn=By.xpath("//a[@data-qa='continue-button']");
}
