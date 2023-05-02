package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class MyAccountPage extends Utility {

    By myAccountLink = By.xpath("//span[contains(text(),'My Account')]");
    By registerLink = By.xpath("//a[contains(text(),'Register')]");

    By logoutText = By.xpath("//h1[contains(text(),'Account Logout')]");

    By continueButtonLogout = By.xpath("//a[contains(text(),'Continue')]");

    By logOut = (By.xpath("//div[" + "@id='top-links']/ul/li[2]/ul/li[5]"));
    By registerLinkText = (By.xpath("//h1[contains(text(),'Register Account')]"));

    By loginText = (By.xpath("//h2[normalize-space()='Returning Customer']"));
    By myaccountText = (By.xpath("//h2[contains(text(),'My Account')]"));


    //this method will get my account text
    public String getMyAccountText() {
        return getTextFromElement(myaccountText);
    }

    //this method will get the login text
    public String getLoginText() {
        return getTextFromElement(loginText);
    }

    //this method will click on logout
    public void clickOnLogout() {
        clickOnElement(logOut);
    }

    //Method to click on My Account
    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink);
    }

    //Method to click on Register link
    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public String getLogoutText() {
        return getTextFromElement(logoutText);
    }

    public void clickContinueButtonLogout() {
        clickOnElement(continueButtonLogout);
    }

    public String getTextForRegister() {
        return getTextFromElement(registerLinkText);
    }


}
