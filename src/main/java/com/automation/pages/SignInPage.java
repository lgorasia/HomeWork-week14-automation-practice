package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SignInPage extends Utility {
    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailAddressField;
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
    WebElement signInButton;
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")

    WebElement createAccountButton;
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailTocreateAccoutField;
    @FindBy(xpath = "//h3[contains(text(),'Create an account')]")
    WebElement createAccoutTextField;
    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement authenticationTextField;
    @FindBy(css = "body.authentication.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div.alert.alert-danger ol:nth-child(2) > li:nth-child(1)")
    WebElement errorMessageField;

    public String errormessage(){
        Reporter.log("errormessage " + errorMessageField.toString());
        return getTextFromElement(errorMessageField);
    }

    public void clickOnEmail(String email) {
        Reporter.log("clickOnEmail " + emailAddressField.toString());
        sendTextToElement(emailAddressField, email);
    }

    public void clickOnPassword(String password) {
        Reporter.log("clickOnPassword " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnSignIn() {
        Reporter.log("clickOnSignIn " + signInButton.toString());
        clickOnElement(signInButton);
    }

    public void clickOnCreateAccount() {
        Reporter.log("clickOnCreateAccount " + createAccountButton.toString());
        clickOnElement(createAccountButton);
    }

    public String createAccountText() {
        Reporter.log("createAccountText " + createAccoutTextField.toString());
        return getTextFromElement(createAccoutTextField);
    }

    public String authenticationField() {
        Reporter.log("authenticationField " + authenticationTextField.toString());
        return getTextFromElement(authenticationTextField);
    }

    public void clickOnEmailToCreateAccount(String email) {
        Reporter.log("clickOnEmailToCreateAccount " + emailTocreateAccoutField.toString());
        sendTextToElement(emailTocreateAccoutField,email);
    }

    public void loginToApplication(String username, String password, String message) {
        clickOnEmail(username);
        clickOnPassword(password);
        clickOnSignIn();
       // errormessage(message);




    }

}
