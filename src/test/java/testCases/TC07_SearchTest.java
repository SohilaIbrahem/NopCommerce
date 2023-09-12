package testCases;

import org.testng.annotations.Test;
import pages.P02_LoginPage;
import pages.P07_Search;
import pages.PageBase;

import java.util.Arrays;

import static testCases.TC01_RegistrationTest.EMAIL;
import static testCases.TC01_RegistrationTest.PASSWORD;

public class TC07_SearchTest extends TestBase {


    // String[] items = {"Computers", "Electronics", "Apparel", "Digital downloads", "Books", "Jewelry", "Gift Cards"};
    // String randomItem = getRandomItem(items);

    String productName = "shirt";

    @Test
    public void searchTest() {

        new PageBase(driver).UserClickOnLogin();
        new P02_LoginPage(driver).addUseremail(EMAIL).addUserPasswod(PASSWORD);
        new P07_Search(driver).SearchField(productName).clickSearchButton();

    }

}

