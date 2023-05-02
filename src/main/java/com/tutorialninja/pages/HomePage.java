package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By currencyLink = By.xpath("//span[normalize-space()='Currency']");
    By desktopLink = (By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[1]"));
    By showAllDesktopLink = (By.linkText("Show AllDesktops"));

    By laptopAndNotebookLink = (By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[2]"));

    By showAllLaptopAndNotebook = (By.linkText("Show AllLaptops & Notebooks"));

    By myAccountLink = (By.xpath("//span[contains(text(),'My Account')]"));
    By registerLink = By.xpath("//a[contains(text(),'Register')]");
    By loginLink = By.xpath("//li[@class='dropdown open']/ul/li[2]");

    By logoutLinkText = (By.xpath("//h1[contains(text(),'Account Logout')]"));

    //this method will get logout text
    public String logOutText() {
        return getTextFromElement(logoutLinkText);
    }

    //this method will click on register link
    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }


    //this method will click on login
    public void clickOnloginLink() {
        clickOnElement(loginLink);
    }

    //this method will click on my account link
    public void clickOnmyAccountLink() {
        clickOnElement(myAccountLink);
    }

    public void selectRequiredCurrency() {
        clickOnElement(currencyLink);
        clickOnElement(By.xpath("(//button[@class='currency-select btn btn-link btn-block'])[2]"));

    }

    public void hoverOnDesktop() {
        mouseHoverToElement(desktopLink);
    }

    public void clickOnDesktoplink() {
        clickOnElement(showAllDesktopLink);
    }

    public void hoverOnLaptopsandNotebooks() {
        mouseHoverToElement(laptopAndNotebookLink);
    }

    public void clickOnShowALLLaptopAndNotebook() {
        clickOnElement(showAllLaptopAndNotebook);
    }


}
