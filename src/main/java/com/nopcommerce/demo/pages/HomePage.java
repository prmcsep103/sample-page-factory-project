package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

//    By loginLink = By.linkText("Log in");

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;
//    By registerLink = By.linkText("Register");

    public void clickOnLoginLink(){
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
        CustomListeners.test.log(Status.PASS, "Clicking on Login Link");
    }

    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
        log.info("Clicking on register link : " + registerLink.toString());
        CustomListeners.test.log(Status.PASS, "Clicking on Register Link");
    }

}
