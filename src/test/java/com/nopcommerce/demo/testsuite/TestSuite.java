package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuite extends TestBase {

    HomePage homePage;
    ComputerPage computerPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void setPage(){
        homePage= new HomePage();
        computerPage= new ComputerPage();
        buildYourOwnComputerPage= new BuildYourOwnComputerPage();
    }
     @Test(groups = {"sanity","smoke","regression"})
    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {
        Thread.sleep(1000);
        homePage.clickOnComputerLink();
        Thread.sleep(1000);
        computerPage.clickOnDesktopsLink();
        //Thread.sleep(1000);
        computerPage.selectPositionFromDropdown(2);
        Thread.sleep(2000);
        List<WebElement> products;
        products = computerPage.getListOfProducts();
        List<String> productsList = new ArrayList<>();
        for (WebElement productName : products) {
            productsList.add(productName.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productsList);
        Collections.sort(tempList,Collections.reverseOrder());
        System.out.println(productsList);
        System.out.println(tempList);
        Assert.assertEquals(tempList,productsList);
    }

@Test(groups = {"smoke","regression"})
public void verifyProductAddedToShoppingCartSuccessfully() throws InterruptedException {
    Thread.sleep(1000);
        homePage.clickOnComputerLink();
   Thread.sleep(1000);
    computerPage.clickOnDesktopsLink();
    Thread.sleep(1000);
    computerPage.selectPositionFromDropdown(1);
    Thread.sleep(1000);
    buildYourOwnComputerPage.clickOnAddToCartButton();
    String expectedMessage = "Build your own computer";
    String actualMessage = buildYourOwnComputerPage.verifyTextBuildYourOwnComputer();
    Assert.assertEquals(actualMessage,expectedMessage);
    buildYourOwnComputerPage.setSelectProcessorFromDropDownMenu(1);
    Thread.sleep(1000);
    buildYourOwnComputerPage.setSelectRam(3);
    Thread.sleep(1000);
    buildYourOwnComputerPage.clickOnHdd("400 GB [+$100.00]");
    //Thread.sleep(1000);
    buildYourOwnComputerPage.clickOnOsRadio("Vista Premium [+$60.00]");
    //Thread.sleep(1000);
    buildYourOwnComputerPage.clickOnMicrosoftOffice("Microsoft Office [+$50.00]");
    Thread.sleep(1000);
    buildYourOwnComputerPage.clickOnSoftwareTotalCommander("Total Commander [+$5.00]");
    Thread.sleep(1000);
    String expectedMessage1 = "$1,475.00";
    String actualMessage1 = buildYourOwnComputerPage.setVerifyPrice();
    Assert.assertEquals(actualMessage1, expectedMessage1);
    buildYourOwnComputerPage.setClickAddToCartButton();
    Thread.sleep(1000);
    String expectedMessage2 = "The product has been added to your shopping cart";
    String actualMessage2 = buildYourOwnComputerPage.verifyShoppingCartText();
    Assert.assertEquals(actualMessage2, expectedMessage2);
    Thread.sleep(1000);
    buildYourOwnComputerPage.clickOnCrossGreenBar();

}


}
