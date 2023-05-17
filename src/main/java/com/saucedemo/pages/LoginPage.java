package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(id = "user-name")
    WebElement userNameField;
    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(id = "login-button")
    WebElement loginButton;



    public void enterUserName(String userName){
        log.info("Enter username "+userName+" to username field "+userNameField.toString());
        Reporter.log("Enter username "+userName+" to username field "+userNameField.toString());
        sendTextToElement(userNameField, userName );
    }
    public void enterPassword(String password) {
        log.info("Enter password "+password+"in to password field "+passwordField.toString());
        Reporter.log("Enter password "+password+"in to password field "+passwordField.toString());
        sendTextToElement(passwordField, password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
        log.info("Click on login Button "+loginButton.toString());
        Reporter.log("Click on login Button "+loginButton.toString());


    }
}
