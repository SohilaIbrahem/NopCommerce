package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.P02_LoginPage;
import pages.P04_CurrencyPage;

import static testCases.TC01_RegistrationTest.EMAIL;
import static testCases.TC01_RegistrationTest.PASSWORD;

public class TC04_CurrencyPageTest extends TestBase{

    private P04_CurrencyPage currency;


    @Test
    public void test()
    {
        driver.findElement(By.id("customerCurrency")).click();
//        new P02_LoginPage(driver).UserClickLogin().addUseremail(EMAIL).addUserPasswod(PASSWORD).
        new P04_CurrencyPage(driver).SelectCurrencyDropdwn();

    }
}
