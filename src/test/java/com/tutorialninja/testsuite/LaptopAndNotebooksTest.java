package com.tutorialninja.testsuite;

import com.tutorialninja.pages.*;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopAndNotebooksTest extends BaseTest {
    //object creation
    HomePage homePage = new HomePage();
    LaptopAndNotebookPage laptopAndNotebookPage = new LaptopAndNotebookPage();
    ProductPage productPage = new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        //change the currency
        homePage.selectRequiredCurrency();
        //mouse hover on laptop and notebook
        homePage.hoverOnLaptopsandNotebooks();
//        2.2 Click on “Show All Laptops & Notebooks”
        homePage.clickOnShowALLLaptopAndNotebook();
//        2.3 Select Sort By "Price (High > Low)"
        laptopAndNotebookPage.sortByPriceLowToHigh();
//        2.4 Select Product “MacBook”
        laptopAndNotebookPage.clickOnMacBookLaptop();
//        2.5 Verify the text “MacBook”
        Assert.assertEquals(productPage.getMacBookLaptopText(), "MacBook");
//        2.6 Click on ‘Add To Cart’ button
        productPage.clickAddToCart();
//        2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        Assert.assertEquals(productPage.getMacBookAddedSuccessfullyText(), "Success: You have added MacBook to your shopping cart!\n" +
                "×", "Incorrect name");
//        2.8 Click on link “shopping cart” display into success message
        productPage.clickOnShoppingCartLink();
//        2.9 Verify the text "Shopping Cart"
        Assert.assertEquals(shoppingCartPage.getShoppingCartText(), "Shopping Cart  (0.00kg)", "error");
//        2.10 Verify the Product name "MacBook"
        Assert.assertEquals(shoppingCartPage.macBookLaptopText(), "MacBook");
//        2.11 Change Quantity "2"
        shoppingCartPage.updateQuantity("2");
//        2.12 Click on “Update”Tab
        shoppingCartPage.clickOnTheUpdateCartButton();
//        2.13 Verify the message “Success: You have modified your shopping cart!”
        Assert.assertEquals(shoppingCartPage.getShoppingCartUpdatedSuccesfully(), "Success: You have modified your shopping cart!\n" + "×", "error");
//        2.14 Verify the Total £737.45
        Assert.assertEquals(shoppingCartPage.getPriceText("£737.45"), "£737.45");
//        2.15 Click on “Checkout” button
        shoppingCartPage.clickOnCheckoutButton();
//        2.16 Verify the text “Checkout”
        Assert.assertEquals(checkoutPage.getCheckoutText(), "Checkout", "error");
        Thread.sleep(1000);
//        2.17 Verify the Text “New Customer”
        Assert.assertEquals(checkoutPage.getNewCustomerText(), "New Customer", "error");
//        2.18 Click on “Guest Checkout” radio button
        checkoutPage.clickOnGuestCheckout();
//        2.19 Click on “Continue” tab
        checkoutPage.clickOnContinueButton();
//        2.20 Fill the mandatory fields
        checkoutPage.sendTextToFirstNameField("prime");
        checkoutPage.sendTextToLastNameField("Testing");
        checkoutPage.sendTextToEmailField("prime");
        checkoutPage.sendTextToTelephoneField("020876229");
        checkoutPage.sendTextToAddressField("1 London Road ");
        checkoutPage.sendTextToCityField("London");
        checkoutPage.sendTextToPostCOdeField("HA1 2TB");
        checkoutPage.selectCountry("United Kingdom");
        checkoutPage.selectRegion("Greater London");

//        2.21 Click on “Continue” Button
        checkoutPage.contiuneToCheckout();
//        2.22 Add Comments About your order into text area
        checkoutPage.sendTextToAddCommentBox("Please Delivery on time");
//        2.23 Check the Terms & Conditions check box
        checkoutPage.clickOnTermAndConditionsCheckBox();
//        2.24 Click on “Continue” button
        checkoutPage.clickOnContinueButtonInCommentSection();
//        2.25 Verify the message “Warning: Payment method required!”
        Assert.assertEquals(checkoutPage.getPaymentErrorMessage(), "Warning: No Payment options are available. Please contact us for assistance!", "error");

    }


}