package testCases;

import org.testng.annotations.Test;
import pages.P02_LoginPage;
import pages.P08_AddToCart;

import static testCases.TC01_RegistrationTest.EMAIL;
import static testCases.TC01_RegistrationTest.PASSWORD;

public class TC08_addToCartTest extends TestBase{



    @Test
    public void addToCartTest()
    {
        //new P02_LoginPage(driver).UserClickLogin().addUseremail(EMAIL).addUserPasswod(PASSWORD);


        new P08_AddToCart(driver).SelectElectronic().SelectCamera().
                selectNikonCam().ClickOnAddBtn().ClickOnAddToCompare();



    }
}
