package testCases;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_RegistrationPage;
import pages.P03_ForgetPassword;
import pages.PageBase;
import utilities.utlity;

import static testCases.TC01_RegistrationTest.*;

public class TC03_ForgetPasswordTest extends TestBase{



    @Test
    public void Test()
    {

        new PageBase(driver).UserClickOnLogin();
        new P03_ForgetPassword(driver).clickForgetPass().sendEmail(EMAIL).UserClickRecoverBtn();
        Assert.assertTrue(new P03_ForgetPassword(driver).CheckConfirmationMessage());
        //TODO : take screenshot
        utlity.captureScreenshot(driver,"ForgetPassword");

    }
}
