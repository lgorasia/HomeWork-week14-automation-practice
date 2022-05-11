package com.automation.testsuite;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class SignPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    CreateAccountPage createAccountPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        createAccountPage = new CreateAccountPage();
    }

    @Test
    public void userShouldNavigateToSignInPageSuccessFully() {
        homePage.clickOnSignIn();

        String actualText = signInPage.authenticationField();
        String expectedText = "AUTHENTICATION";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test(dataProvider = "credentials", dataProviderClass = TestData.class)
    public void verifyTheErrorMessageWithInValidCredentials(String username, String password, String message) {
        homePage.clickOnSignIn();
        signInPage.clickOnEmail(username);
        signInPage.clickOnPassword(password);
        signInPage.clickOnSignIn();
        String actualText = signInPage.errormessage();
        String expectedMessage = message;
        Assert.assertEquals(actualText,expectedMessage);
    }

    @Test(groups = {"smoke","sanity","regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        homePage.clickOnSignIn();
        signInPage.clickOnEmail("3ljpatel@yahoo.com");
        signInPage.clickOnPassword("12345678");
        signInPage.clickOnSignIn();
        String actualText = createAccountPage.signOutText();
        String expectedText = "Sign out";
        Assert.assertEquals(actualText, expectedText);
    }
    @Test(groups = {"sanity","regression"})
    public void verifyThatUserShouldLogOutSuccessFully(){
        homePage.clickOnSignIn();
        signInPage.clickOnEmail("5ljpatel@yahoo.com");
        signInPage.clickOnPassword("12345678");
        signInPage.clickOnSignIn();
        createAccountPage.clickOnSignOut();
        String actualText=homePage.signIntext();
        String expectedText = "Sign in";
        Assert.assertEquals(actualText,expectedText);

    }

}

        



