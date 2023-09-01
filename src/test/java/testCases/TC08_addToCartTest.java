package testCases;

import org.testng.annotations.Test;
import pages.P08_AddToCart;

public class TC08_addToCartTest extends TestBase{



    @Test
    public void addToCartTest()
    {
        new P08_AddToCart(driver).SelectElectronic().SelectCamera().
                selectNikonCam().ClickOnAddBtn().ClickOnAddToCompare().ClickOnAddCamToCart();
    }
}
