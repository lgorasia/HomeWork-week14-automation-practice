package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {
    public ProductPage() {
        PageFactory.initElements(driver,this);
    }


}
