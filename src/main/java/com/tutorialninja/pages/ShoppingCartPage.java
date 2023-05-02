package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By productNameText = (By.linkText("HP LP3065"));

    By shoppingText = (By.xpath("//h1[contains(text(),'Shopping Cart')]"));
    By productModelText = (By.xpath("//td[normalize-space()='Product 21']"));

    By productPrice = (By.xpath("//tbody//tr//td[6]"));
    By macBookTextinCart = (By.linkText("MacBook"));

    By changeQuantity = (By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[4]/div/input"));

    By updateCart = (By.xpath("//button[@type='submit']"));

    By cartUpdatedSucessfullyText = (By.xpath("//div[@class='alert alert-success alert-dismissible']"));
    By checkoutButton = (By.xpath("//a[@class='btn btn-primary']"));


    public void clickOnCheckoutButton() {
        clickOnElement(checkoutButton);
    }

    public String getShoppingCartUpdatedSuccesfully() {
        return getTextFromElement(cartUpdatedSucessfullyText);
    }

    public void clickOnTheUpdateCartButton() {
        clickOnElement(updateCart);
    }

    public void updateQuantity(String qty) {
        clearTextFromElement(changeQuantity);
        sendTextToElement(changeQuantity, qty);
        clickOnElement(changeQuantity);
    }


    public String getShoppingCartText() {
        return getTextFromElement(shoppingText);
    }

    public String getProductNameText() {
        return getTextFromElement(productNameText);
    }

    public String getTextOfProductModel() {
        return getTextFromElement(productModelText);
    }

    public String getPriceText(String price) {
        return getTextFromElement(productPrice);
    }

    //this method will verify the macbook laptop text
    public String macBookLaptopText() {
        return getTextFromElement(macBookTextinCart);
    }

}
