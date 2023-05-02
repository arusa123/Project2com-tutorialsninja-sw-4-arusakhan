package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {
    By checkoutText = (By.linkText("Checkout"));
    By newCustomerText = (By.xpath("//h2[contains(text(),'New Customer')]"));

    By guestCheckout = (By.xpath("//input[@value='guest']"));

    By continueButton = (By.id("button-account"));
    By firstName = By.xpath("//input[@id='input-payment-firstname']");

    By lastName = By.xpath("//input[@id='input-payment-lastname']");

    By email = By.xpath("//input[@id='input-payment-email']");

    By telephone = By.xpath("//input[@id='input-payment-telephone']");

    By address = By.xpath("//input[@id='input-payment-address-1']");

    By city = By.xpath("//input[@id='input-payment-city']");

    By postcode = By.xpath("//input[@id='input-payment-postcode']");

    By country = By.xpath("//select[@id='input-payment-country']");

    By region = By.xpath("//select[@id='input-payment-zone']");
    By contiuneCheckout = (By.xpath("//input[@id='button-guest']"));
    By commentField = By.xpath("//div[@class='panel-group']/div[3]/div[2]/div[1]/p[2]/textarea[1]");

    By termAndConditionsCheckBox = By.name("agree");
    By continueButtonInCommentSection = By.xpath("//input[@id='button-payment-method']");
    By paymentErrorMessage = By.xpath("//div[@class='panel-group']/div[3]/div[2]/div/div[1]");

    public void sendTextToAddCommentBox(String comment) {
        sendTextToElement(commentField, comment);
    }

    public void clickOnTermAndConditionsCheckBox() {
        clickOnElement(termAndConditionsCheckBox);
    }

    public void clickOnContinueButtonInCommentSection() {
        clickOnElement(continueButtonInCommentSection);
    }

    public String getPaymentErrorMessage() {
        return getTextFromElement(paymentErrorMessage);
    }


    //this method will click on continue
    public void contiuneToCheckout() {
        clickOnElement(contiuneCheckout);
    }

    public void sendTextToFirstNameField(String fName) {
        sendTextToElement(firstName, fName + getAlphaNumericString(2));
    }

    public void sendTextToLastNameField(String lname) {
        sendTextToElement(lastName, lname + getAlphaNumericString(2));
    }

    public void sendTextToEmailField(String uEmail) {
        sendTextToElement(email, uEmail + getAlphaNumericString(2) + "@gmail.com");
    }

    public void sendTextToTelephoneField(String tele) {
        sendTextToElement(telephone, tele);
    }

    public void sendTextToAddressField(String add) {
        sendTextToElement(address, add);
    }

    public void sendTextToCityField(String uCty) {
        sendTextToElement(city, uCty);
    }

    public void sendTextToPostCOdeField(String pCode) {
        sendTextToElement(postcode, pCode + getAlphaNumericString(1));
    }

    //this method will send country name
    public void selectCountry(String uCountry) {
        selectByVisibleTextFromDropDown(country, uCountry);
    }

    //this method will send region
    public void selectRegion(String uRegion) {
        selectByVisibleTextFromDropDown(region, uRegion);
    }

    //this method will get the checkout text
    public String getCheckoutText() {
        return getTextFromElement(checkoutText);
    }

    //this method will get new customer text
    public String getNewCustomerText() {
        return getTextFromElement(newCustomerText);
    }

    //this method will click on guestCheckout
    public void clickOnGuestCheckout() {
        clickOnElement(guestCheckout);
    }


    //this method will click on the contiune button
    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }


}
