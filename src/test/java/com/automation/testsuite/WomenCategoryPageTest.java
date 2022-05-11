package com.automation.testsuite;

import com.automation.pages.HomePage;
import com.automation.pages.WomenCategoryPage;
import com.automation.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class WomenCategoryPageTest extends TestBase {
    HomePage homePage;
    WomenCategoryPage womenCategoryPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        womenCategoryPage = new WomenCategoryPage();
    }

    @Test
    public void verifyUserShouldNavigateToWomenCategoryPageSuccessfully(){
        homePage.clickOnWomen();
        String actualText=womenCategoryPage.clickWomenText();
        String expectedText = "WOMEN ";
        Assert.assertEquals(actualText,expectedText);

    }
    @Test(groups = {"smoke","sanity","regression"},dataProvider = "WomenDressSelection",dataProviderClass = TestData.class)
    public void verifyUserShouldAddProductToTheCartSuccessfully(String product, String qty, String size, String colour){
        homePage.clickOnWomen();
        womenCategoryPage.selectProduct(product);
        womenCategoryPage.clearQuantiyWanted();
        womenCategoryPage.selectQuantity(qty);
        womenCategoryPage.selectSize(size);
        womenCategoryPage.selectColor(colour);
        womenCategoryPage.clickOnAddToCart();
       // driver.switchTo().alert();
        String expectedMessage = "Product successfully added to your shopping cart";
        String actualMessage=womenCategoryPage.productAddedToCart();
        Assert.assertEquals(expectedMessage,expectedMessage);
        womenCategoryPage.clickOnXField();









    }


}
