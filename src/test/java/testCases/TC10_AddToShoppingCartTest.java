package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P10_AddToShoppingCart;

public class TC10_AddToShoppingCartTest extends TestBase {

    @Test
    public void addToCartTest()
    {

        new P10_AddToShoppingCart(driver).UserClickOnJewelry().UserSelectProduct().UserAddProductToCart();
        Assert.assertTrue(new P10_AddToShoppingCart(driver).CheckConfirmationMessage());
    }
}
