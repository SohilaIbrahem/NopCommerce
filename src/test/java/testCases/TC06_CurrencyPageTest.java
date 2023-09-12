package testCases;

import org.testng.annotations.Test;
import pages.P02_LoginPage;
import pages.P06_CurrencyPage;
import pages.PageBase;

import static testCases.TC01_RegistrationTest.EMAIL;
import static testCases.TC01_RegistrationTest.PASSWORD;

public class TC06_CurrencyPageTest extends TestBase{

    private P06_CurrencyPage currency;


    @Test
    public void test()
    {

        new P02_LoginPage(driver).UserClickLogin().addUseremail(EMAIL).addUserPasswod(PASSWORD);
        new PageBase(driver).UerClickCurrencyDropdown();
        new P06_CurrencyPage(driver).SelectCurrencyDropdwn();

    }
}
