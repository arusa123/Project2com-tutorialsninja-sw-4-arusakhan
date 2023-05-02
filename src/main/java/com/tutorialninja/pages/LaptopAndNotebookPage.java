package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopAndNotebookPage extends Utility {
    By sortBy = By.xpath("//select[@id='input-sort']");
    By macBook = (By.xpath("//a[normalize-space()='MacBook']"));
    By pageTitle = (By.xpath("//h2[contains(text(),'Laptops & Notebooks')]"));

    public void sortByPriceLowToHigh() {
        selectByVisibleTextFromDropDown(sortBy, "Price (Low > High)");
    }

    public void clickOnMacBookLaptop() {
        clickOnElement(macBook);
    }

    //this method will get the text of the page title
    public String getPageTitleText() {
        return getTextFromElement(pageTitle);
    }

}
