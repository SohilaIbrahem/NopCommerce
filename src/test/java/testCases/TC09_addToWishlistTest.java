package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P09_AddToWishlist;
import pages.P11_AddProductsToComparelist;
import utilities.utlity;

public class TC09_addToWishlistTest extends TestBase{



    @Test
    public void addToWishlistTest()
    {
        new P09_AddToWishlist(driver).SelectElectronic().SelectCamera().
                selectNikonCam().ClickOnAddBtn().ClickOnAddToCompare();
        //TODO : take screenshot
        utlity.captureScreenshot(driver,"AddToWish;ist");
        //TODO: Assert
        Assert.assertTrue( new P09_AddToWishlist(driver).ConfirmationMessageIsDiplayed());

    }
}
