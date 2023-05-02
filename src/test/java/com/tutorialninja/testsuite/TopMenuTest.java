package com.tutorialninja.testsuite;

import com.tutorialninja.pages.DesktopPage;
import com.tutorialninja.pages.LaptopAndNotebookPage;
import com.tutorialninja.pages.TopMenuPage;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    TopMenuPage topMenuPage = new TopMenuPage();
     DesktopPage desktopPage = new DesktopPage();
    LaptopAndNotebookPage laptopAndNotebookPage = new LaptopAndNotebookPage();

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
      //  2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        topMenuPage.hoverOverMainMenuBar("Laptops & Notebooks");
        topMenuPage.selectMenu("Show AllLaptops & Notebooks");

        Assert.assertEquals(laptopAndNotebookPage.getPageTitleText(),"Laptops & Notebooks");
    }
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){

        topMenuPage.hoverOverMainMenuBar("Desktops");
        // selectMenu method and pass the menu = “Show All Desktops”
        topMenuPage.selectMenu("Show AllDesktops");
        //this will get the text
        Assert.assertEquals(desktopPage.getDesktopText(),"Desktops","incorrect name ");
    }


}
