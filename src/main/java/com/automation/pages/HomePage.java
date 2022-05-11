package com.automation.pages;

import com.automation.utility.Utility;
import com.github.dockerjava.api.model.Links;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement womenField;
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement dressField;
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    WebElement tshirtField;
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signInField;
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement logoField;


    public void clickOnWomen(){
        Reporter.log("clickOnWomen " + womenField.toString());
        clickOnElement(womenField);
    }
    public void clickOnDress(){
        Reporter.log("clickOnDress " + dressField.toString());
        clickOnElement(dressField);
    }
    public void clickOnTshiet(){
        Reporter.log("clickOnTshiet " + tshirtField.toString());
        clickOnElement(tshirtField);
    }
    public void clickOnSignIn(){
        Reporter.log("clickOnSignIn " + signInField.toString());
        clickOnElement(signInField);
    }
    public String signIntext(){
        Reporter.log("signIntext " + signInField.toString());
        return getTextFromElement(signInField);

    }
    public void clickOnLogo(){
        Reporter.log("clickOnLogo " + logoField.toString());
        clickOnElement(logoField);
    }

}
