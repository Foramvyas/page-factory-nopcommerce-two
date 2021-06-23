package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    TopMenuPage topMenuPage;

    @BeforeMethod(alwaysRun = true)
    public void setPages() {
        topMenuPage = new TopMenuPage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToComputerPage() throws InterruptedException {
        //Thread.sleep(1000);
        topMenuPage.selectMenu("Computers");
        String expectedMessage = "Computers";
        String actualMessage = topMenuPage.verifyComputerPage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToElectronicsPage() throws InterruptedException {
        topMenuPage.selectMenu("Electronics");
        String expectedMessage1 = "Electronics";
        String actualMessage1 = topMenuPage.verifyElectronicsPage();
        Assert.assertEquals(actualMessage1, expectedMessage1);
    }
    @Test(groups = "regression")
    public void verifyUserShouldNavigateToApparel() throws InterruptedException {

        topMenuPage.selectMenu("Apparel");
        String expectedMessage2 = "Apparel";
        String actualMessage2 = topMenuPage.verifyApparelPage();
        Assert.assertEquals(actualMessage2, expectedMessage2);
    }
    @Test(groups = "regression")
    public void verifyUserShouldNavigateToDigitalDownloads() {
        topMenuPage.selectMenu("Digital downloads");
        String expectedMessage3 = "Digital downloads";
        String actualMessage3 = topMenuPage.verifyDigitalDownloadPage();
        Assert.assertEquals(actualMessage3, expectedMessage3);
    }
    @Test(groups = "regression")
    public void verifyUserShouldNavigateToBooks() {
        topMenuPage.selectMenu("Books");
        String expectedMessage4 = "Books";
        String actualMessage4 = topMenuPage.verifyBooksPage();
        Assert.assertEquals(actualMessage4, expectedMessage4);
    }
    @Test(groups = "regression")
    public void verifyUserShouldNavigateToJewelry() {
        topMenuPage.selectMenu("Jewelry");
        String expectedMessage5 = "Jewelry";
        String actualMessage5 = topMenuPage.verifyJewelryPage();
        Assert.assertEquals(actualMessage5, expectedMessage5);
    }
    @Test(groups = "regression")
    public void verifyUserShouldNavigateToGiftCards() {
        topMenuPage.selectMenu("Gift Car");
        String expectedMessage6 = "Gift Cards";
        String actualMessage6 = topMenuPage.verifyGiftCardPage();
        Assert.assertEquals(actualMessage6, expectedMessage6);


    }

}
