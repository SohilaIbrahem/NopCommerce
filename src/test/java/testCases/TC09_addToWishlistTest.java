package testCases;

import org.testng.annotations.Test;
import pages.P09_AddToWishlist;

public class TC09_addToWishlistTest extends TestBase{



    @Test
    public void addToCartTest()
    {
        new P09_AddToWishlist(driver).SelectElectronic().SelectCamera().
                selectNikonCam().ClickOnAddBtn().ClickOnAddToCompare();

    }
}
