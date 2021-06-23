package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class TopMenuPage extends Utility {
    private static final Logger log = LogManager.getLogger(TopMenuPage.class.getName());

    HomePage homePage = new HomePage();
    @FindBy(partialLinkText = "Compute")
    WebElement verifyComputerText;
    @FindBy(partialLinkText = "Electroni")
    WebElement verifyElectronicsText;
    @FindBy(partialLinkText = "Appar")
    WebElement verifyApparelText;
    @FindBy(partialLinkText = "Digital downloa")
    WebElement verifyDigitalDowanloadText;
    @FindBy(partialLinkText = "Books")
    WebElement verifyBooksText;
    @FindBy(partialLinkText = "Jewel")
    WebElement verifyJewelryText;
    @FindBy(partialLinkText = "Gift Car")
    WebElement verifyGiftsCardsText;


    public void selectMenu(String menu)  {

        if (menu == "Computers") {
            homePage.clickOnComputerLink();
        } else if (menu == "Electronics") {
            homePage.clickOnElectronicsLink();
        } else if (menu == "Apparel") {
            homePage.clickOnApparelLink();
        } else if (menu == "Digital downloads") {
            homePage.clickOnDigitalDownloadsLink();
        } else if (menu == "Books") {
            homePage.clickOnBooksLink();
        } else if (menu == "Jewelry") {
            homePage.clickOnJewelryLink();
        } else if (menu == "Gift Cards") {
            homePage.clickOnGiftCardsLink();
        }
    }

    public String verifyComputerPage() {
        Reporter.log("Verify user navigate to computer page successfully " + verifyComputerText.toString() + "<br>");
        log.info("Verify user navigate to computer page successfully : " + verifyComputerText.toString());
        return getTextFromElement(verifyComputerText);
    }

    public String verifyElectronicsPage() {
        Reporter.log("Verify user navigate to electronics page successfully " + verifyElectronicsText.toString() + "<br>");
        log.info("Verify user navigate to electronics page successfully : " + verifyElectronicsText.toString());
        return getTextFromElement(verifyElectronicsText);
    }

    public String verifyApparelPage() {
        Reporter.log("Verify user navigate to apparel page successfully " + verifyApparelText.toString() + "<br>");
        log.info("Verify user navigate to apparel page successfully : " + verifyApparelText.toString());
        return getTextFromElement(verifyApparelText);
    }

    public String verifyDigitalDownloadPage() {
        Reporter.log("Verify user navigate to digital download page successfully " + verifyDigitalDowanloadText.toString() + "<br>");
        log.info("Verify user navigate to digital downloads page successfully : " + verifyDigitalDowanloadText.toString());
        return getTextFromElement(verifyDigitalDowanloadText);
    }

    public String verifyBooksPage() {
        Reporter.log("Verify user navigate to books page successfully " + verifyBooksText.toString() + "<br>");
        log.info("Verify user navigate to books page successfully : " + verifyBooksText.toString());
        return getTextFromElement(verifyBooksText);
    }

    public String verifyJewelryPage() {
        Reporter.log("Verify user navigate to jewelry page successfully " + verifyJewelryText.toString() + "<br>");
        log.info("Verify user navigate to jewelry page successfully : " + verifyJewelryText.toString());
        return getTextFromElement(verifyJewelryText);
    }

    public String verifyGiftCardPage() {
        Reporter.log("Verify user navigate to giftCard page successfully " + verifyGiftsCardsText.toString() + "<br>");
        log.info("Verify user navigate to gift card page successfully : " + verifyComputerText.toString());
        return getTextFromElement(verifyGiftsCardsText);
    }

}