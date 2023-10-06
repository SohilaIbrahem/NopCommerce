package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P11_AddProductsToComparelist;
import utilities.utlity;

public class TC11_AddProductsToComparelistTest extends TestBase{


    @Test
    public void UserCanAddProductToCompareList()
    {
        new P11_AddProductsToComparelist(driver).UserSelectBooksFromMenue().UserAddItem_1().UserAddItem_2();
        //TODO : take screenshot
        utlity.captureScreenshot(driver,"AddProductToCompareList");
        //TODO: Assert
        Assert.assertTrue( new P11_AddProductsToComparelist(driver).CheckConfirmationMessage());
    }

}
