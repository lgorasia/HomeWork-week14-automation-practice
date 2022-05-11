package com.automation.pages;

import com.automation.utility.Utility;
import javafx.beans.value.WeakChangeListener;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CreateAccountPage extends Utility {
    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstNamefield;
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastNameField;
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;
    @FindBy(id = "address1")
    WebElement addressField;
    @FindBy(xpath = "//input[@id='city']")
    WebElement cityField;
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement stateField;
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement zipcodeField;
    @FindBy(xpath = "//select[@id='id_country']")
    WebElement countryField;
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobilePhonefield;
    @FindBy(xpath = "//input[@id='alias']")
    WebElement futureReferenceField;
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    WebElement registerButton;
    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    WebElement myAccountTextField;
    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
    WebElement signOutField;

    public String signOutText(){
        Reporter.log("signOutText " + signOutField.toString());
        return getTextFromElement(signOutField);
    }
    public void clickOnSignOut(){
        Reporter.log("clickOnSignOut " + signOutField.toString());
        clickOnElement(signOutField);
    }

    public String myAccountText(){
        Reporter.log("myAccountText " + myAccountTextField.toString());
        return getTextFromElement(myAccountTextField);
    }

    public void clickOnFirstName(String name) {
        Reporter.log("clickOnFirstName " + firstNamefield.toString());
        sendTextToElement(firstNamefield, name);
    }

    public void clickOnLastName(String lastName) {
        Reporter.log("clickOnLastName " + lastNameField.toString());
        sendTextToElement(lastNameField, lastName);
    }

    public void clickOnPassword(String password) {
        Reporter.log("clickOnPassword " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnAddress(String address) {
        Reporter.log("clickOnAddress " + addressField.toString());
        sendTextToElement(addressField, address);
    }
    public void clickOnCity(String city){
        Reporter.log("clickOnCity " + cityField.toString());
        sendTextToElement(cityField,city);


    }
    public void clickOnState(String state){
        Reporter.log("clickOnState " + stateField.toString());
        sendTextToElement(stateField,state);
    }
    public void clickOnZipcode(String zip){
        Reporter.log("clickOnZipcode " + zipcodeField.toString());
        sendTextToElement(zipcodeField,zip);
    }
    public void clickOnCountry(String country){
        Reporter.log("clickOnCountry " + countryField.toString());
        sendTextToElement(countryField,country);
    }
    public void clickOnMobilePhone(String phone){
        Reporter.log("clickOnMobilePhone " + mobilePhonefield.toString());
        sendTextToElement(mobilePhonefield,phone);
    }
    public void clickOnFutureRefference(String referene){
        Reporter.log("clickOnFutureRefference " + futureReferenceField.toString());
        sendTextToElement(futureReferenceField,referene);
    }
    public void clickOnRegister(){
        Reporter.log("clickOnRegister " + registerButton.toString());
        clickOnElement(registerButton);
    }


}
