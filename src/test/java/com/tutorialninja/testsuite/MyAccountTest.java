package com.tutorialninja.testsuite;

import com.tutorialninja.pages.HomePage;
import com.tutorialninja.pages.LoginPage;
import com.tutorialninja.pages.MyAccountPage;
import com.tutorialninja.pages.RegisterPage;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountTest extends BaseTest {
    HomePage homePage = new HomePage();
    MyAccountPage myAccountPage = new MyAccountPage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        myAccountPage.clickOnMyAccountLink();
        myAccountPage.clickOnRegisterLink();
        //Verify the text “Register Account”.
        Assert.assertEquals(myAccountPage.getTextForRegister(), "Register Account", "Incorrect");

    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
//        3.1 Clickr on My Account Link.
        homePage.clickOnmyAccountLink();
//        3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        homePage.clickOnRegisterLink();

//        3.3 Enter First Name
        registerPage.sendTextFirstNameField("Prime");

//        3.4 Enter Last Name
        registerPage.sendTextLastNameField("Testing");
//        3.5 Enter Email
        registerPage.sendTextEmailField("Prime");
//        3.6 Enter Telephone
        registerPage.sendTexTelephoneField("02089653876");
//        3.7 Enter Password
        registerPage.sendTextPasswordField("prime");
//        3.8 Enter Password Confirm
        registerPage.sendTextConfirmPasswordField("prime");
//        3.9 Select Subscribe Yes radio button
        registerPage.selectSubscribeButtons("Yes");
//        3.10 Click on Privacy Policy check box
        registerPage.clickOnPrivacyButton();
//        3.11 Click on Continue button
        registerPage.clickOnContinueButton();
//        3.12 Verify the message “Your Account Has Been Created!”
        Assert.assertEquals(registerPage.getAccountCreatedMessage(), "Your Account Has Been Created!");
//        3.13 Click on Continue button
        registerPage.clickOnContinueButtonAfterAccountCreation();
//        3.14 Clickr on My Account Link.
        homePage.clickOnmyAccountLink();
//        3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        myAccountPage.clickOnLogout();
//        3.16 Verify the text “Account Logout”
        Assert.assertEquals(myAccountPage.getLogoutText(), "Account Logout");

//        3.17 Click on Continue button
        registerPage.clickOnContinueButtonAfterAccountCreation();

    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {

//           2.1 Clickr on My Account Link.
        homePage.clickOnmyAccountLink();
//          2.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        homePage.clickOnloginLink();
//            2.3 Verify the text “Returning Customer”
        Assert.assertEquals(myAccountPage.getLoginText(), "Returning Customer", "error");

    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
//        4.1 Clickr on My Account Link.
        homePage.clickOnmyAccountLink();
//        4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        homePage.clickOnloginLink();
//        4.3 Enter Email address
        loginPage.sendTextToEmailAddressField("prime22@gmail.com");
//        4.5 Enter Password
        loginPage.sendTextToPasswordField("Prime123");
//        4.6 Click on Login button
        loginPage.clickOnLoginButton();
//        4.7 Verify text “My Account”
        Assert.assertEquals(myAccountPage.getMyAccountText(), "My Account", "Error");
//        4.8 Clickr on My Account Link.
        myAccountPage.clickOnMyAccountLink();
//        4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        myAccountPage.clickOnLogout();
//        4.10 Verify the text “Account Logout”
        Assert.assertEquals(myAccountPage.getLogoutText(), "Account Logout");
//        3.17 Click on Continue button
        registerPage.clickOnContinueButtonAfterAccountCreation();


    }
}