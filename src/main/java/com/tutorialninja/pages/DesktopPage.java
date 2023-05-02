package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
    By sortBy = By.xpath("//select[@id='input-sort']");
    By listOfProducts = By.xpath("//h4/a");

    By titleOfDesktop = (By.xpath("//h2[contains(text(),'Desktops')]"));
    By laptopName = (By.xpath("//a[contains(text(),'HP LP3065')]"));

    By laptopText = (By.xpath("//h1[normalize-space()='HP LP3065']"));

    //this method will get the page title text
    public String getDesktopText() {
        return getTextFromElement(titleOfDesktop);
    }

    public ArrayList beforeSortTheProducts() {
        List<WebElement> products = driver.findElements(listOfProducts);
        ArrayList<String> originalProductList = new ArrayList<>();
        for (WebElement list : products) {
            originalProductList.add(list.getText());
        }
        return originalProductList;
    }

    public ArrayList afterSortingTheProducts() {
        Collections.reverse(beforeSortTheProducts());
        System.out.println(beforeSortTheProducts());
        List<WebElement> products = driver.findElements(listOfProducts);
        ArrayList<String> afterSortList = new ArrayList<>();
        for (WebElement newList : products) {
            afterSortList.add(newList.getText());
        }
        return afterSortList;
    }

    public void clickOnHPLP3065() {
        clickOnElement(laptopName);
    }

    public String getTextOfTheLaptop() {
        return getTextFromElement(laptopText);
    }

    public void sortListByZtoA() {
        selectByVisibleTextFromDropDown(sortBy, "Name (Z - A)");
    }

    public void listAtoZ() {
        selectByVisibleTextFromDropDown(sortBy, "Name (A - Z)");
    }


}


