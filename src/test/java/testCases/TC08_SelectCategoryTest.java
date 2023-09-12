package testCases;

import org.testng.annotations.Test;
import pages.P02_LoginPage;
import pages.P08_SelectCategory;
import pages.PageBase;

import static testCases.TC01_RegistrationTest.EMAIL;
import static testCases.TC01_RegistrationTest.PASSWORD;

public class TC08_SelectCategoryTest extends TestBase{


     @Test
    public void selectCategoryTest()
     {
         new PageBase(driver).UserClickOnLogin();
         new P02_LoginPage(driver).addUseremail(EMAIL).addUserPasswod(PASSWORD);
         new P08_SelectCategory(driver).UserHeaderMenu(driver).UserSelectItemFromDropdown();
     }

}
