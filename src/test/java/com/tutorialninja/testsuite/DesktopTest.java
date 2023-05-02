package com.tutorialninja.testsuite;

import com.tutorialninja.pages.DesktopPage;
import com.tutorialninja.pages.HomePage;
import com.tutorialninja.pages.ProductPage;
import com.tutorialninja.pages.ShoppingCartPage;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    ProductPage productPage = new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        homePage.hoverOnDesktop();
        homePage.clickOnDesktoplink();
        desktopPage.sortListByZtoA();
        Assert.assertEquals(desktopPage.afterSortingTheProducts(), desktopPage.beforeSortTheProducts(), "Name: Z to A");
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        // Thread.sleep(1000);
        homePage.selectRequiredCurrency();
        // 2.1 Mouse hover on Desktops Tab. and click
        homePage.hoverOnDesktop();
        //        2.2 Click on “Show All Desktops”
        homePage.clickOnDesktoplink();
//        2.3 Select Sort By position "Name: A to Z"
        desktopPage.sortListByZtoA();
//        2.4 Select product “HP LP3065”
        desktopPage.clickOnHPLP3065();
//        2.5 Verify the Text "HP LP3065"
        Assert.assertEquals(desktopPage.getTextOfTheLaptop(), "HP LP3065", "incorrect name ");
//        2.6 Select Delivery Date "2022-11-30"
        productPage.changeTheDelieveryDate();
//        2.8 Click on “Add to Cart” button
        productPage.clickAddToCart();
//        2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        Assert.assertEquals(productPage.getAddToCartText(), "Success: You have added HP LP3065 to your shopping cart!\n" + "×", "error");
//        2.10 Click on link “shopping cart” display into success message
        productPage.clickOnShoppingCartLink();
//        2.11 Verify the text "Shopping Cart"
        Assert.assertEquals(shoppingCartPage.getShoppingCartText(), "Shopping Cart  (1.00kg)", "Incorrect message");
//        2.12 Verify the Product name "HP LP3065"
        Assert.assertEquals(shoppingCartPage.getProductNameText(), "HP LP3065", "Incorrect laptop name ");
//        2.13 Verify the Delivery Date "2022-11-30"

//        2.14 Verify the Model "Product21"
        Assert.assertEquals(shoppingCartPage.getTextOfProductModel(), "Product 21");
//        2.15 Verify the Todat "£74.73"
        Assert.assertEquals(shoppingCartPage.getPriceText("£74.73"), "£74.73", "Price is not correct");

    }
}
