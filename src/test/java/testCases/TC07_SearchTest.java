package testCases;

import org.testng.annotations.Test;
import pages.P07_Search;

import java.util.Arrays;

public class TC07_SearchTest extends TestBase {


   // String[] items = {"Computers", "Electronics", "Apparel", "Digital downloads", "Books", "Jewelry", "Gift Cards"};
   // String randomItem = getRandomItem(items);

    String item = "Computers";
    @Test
    public void searchTest()
    {
    new P07_Search(driver).SearchField(item).clickSearchButton();
    }

}

