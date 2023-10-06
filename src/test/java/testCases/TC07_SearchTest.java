package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P02_LoginPage;
import pages.P07_Search;
import pages.PageBase;
import utilities.utlity;

import java.util.Arrays;

import static testCases.TC01_RegistrationTest.EMAIL;
import static testCases.TC01_RegistrationTest.PASSWORD;

public class TC07_SearchTest extends TestBase {
    String productName = "shirt";

    @Test
    public void searchTest() {

        new P07_Search(driver).SearchField(productName).clickSearchButton();
        //TODO : take screenshot
        utlity.captureScreenshot(driver,"Search Page");
        //TODO : assert
        Assert.assertFalse(new P07_Search(driver).assertFindProduct());

    }
}

