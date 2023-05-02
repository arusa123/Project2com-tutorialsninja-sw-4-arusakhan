package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends Utility {
    By DateOfTheDelivery = By.name("option[225]");
    By addToShoppingLink = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By addToCart = (By.xpath("//button[@id='button-cart']"));
    By addToShoppingCart = (By.xpath("//a[normalize-space()='shopping cart']"));
    //  By addToShoppingLink = By.xpath("//div[@class='alert alert-success alert-dismissible']");

    //    By shoppingText =(By.xpath("//h1[contains(text(),'Shopping Cart')]");


    By macBookText = (By.linkText("MacBook"));
    By laptopAddedSucessfullyText = (By.xpath("//div[@class='alert alert-success alert-dismissible']"));


    public void changeTheDelieveryDate() {
        String year = "2022";
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]/button[1]/i[1]"));

        while (true) {
            String monthYear = driver.findElement(By.xpath("//div[@class='datepicker']/div[1]/table/thead/tr[1]/th[2]")).getText();

            //Splitting year and month Nov 2022
            String arr[] = monthYear.split(" ");
            //Actual dates
            String mon = arr[0];
            String yer = arr[1];

            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class='datepicker']/div[1]/table/thead/tr[1]/th[3]"));
            }

        }
        //Select Date
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class='datepicker']//div//table//td"));
        for (WebElement dt : allDates) {
            if (dt.getText().equalsIgnoreCase(date)) {
                dt.click();
                break;
            }
        }
    }

    //this method will add the item in the cart
    public void clickAddToCart() {
        clickOnElement(addToCart);
    }

    //this metod will click on the shopping link
    public void clickOnShoppingCartLink() {
        clickOnElement(addToShoppingCart);
    }

    //this method will verify the macbook text
    public String getMacBookLaptopText() {
        return getTextFromElement(macBookText);
    }

    public String getMacBookAddedSuccessfullyText() {
        return getTextFromElement(laptopAddedSucessfullyText);
    }

    public String getAddToCartText() {
        return getTextFromElement(addToShoppingLink);
    }

}
