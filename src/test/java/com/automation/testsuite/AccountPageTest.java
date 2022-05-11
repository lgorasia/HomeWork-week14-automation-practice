package com.automation.testsuite;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    CreateAccountPage createAccountPage;


    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        createAccountPage = new CreateAccountPage();
    }
   @Test(groups = {"smoke","sanity","regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        homePage.clickOnSignIn();
        signInPage.clickOnEmailToCreateAccount("5ljpatel@yahoo.com");
        signInPage.clickOnCreateAccount();
        createAccountPage.clickOnFirstName("Pavan");
        createAccountPage.clickOnLastName("Patel");
        createAccountPage.clickOnPassword("12345678");
        createAccountPage.clickOnAddress("ABC street");
        createAccountPage.clickOnCity("London");
        createAccountPage.clickOnState("Alaska");
        createAccountPage.clickOnZipcode("99501");
        createAccountPage.clickOnMobilePhone("098564533876");
        createAccountPage.clickOnFutureRefference("House address");
        createAccountPage.clickOnRegister();
        String actualText =createAccountPage.myAccountText();
        String expectedText= "MY ACCOUNT";
       Assert.assertEquals(actualText,expectedText);




   }


}
