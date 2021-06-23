package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());


    @FindBy(linkText = "Desktops")
    WebElement desktopsLink;

    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement selectPosition;

    @FindBy(xpath = "//h2[@class='product-title']")
    List<WebElement> productsList;

    public void clickOnDesktopsLink() {
        Reporter.log("Click on desktopLink " + desktopsLink.toString() + "<br>");
        clickOnElement(desktopsLink);
        log.info("Clicking on desktops link : " + desktopsLink.toString());
    }

    //parameterize method
    public void selectPositionFromDropdown(int value) {
        Reporter.log("Select position from drop down " + selectPosition.toString() + "<br>");
        selectByIndexFromDropDown(selectPosition, value);
        log.info("Select position from drop down :" + selectPosition.toString());
    }

    public List getListOfProducts() {
       Reporter.log("Get list of products " + productsList.toString() + "<br>");
        log.info("Get list of products : " + productsList.toString());
       return getListOfElements(productsList);

    }


}
