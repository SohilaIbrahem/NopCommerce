package testCases;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_RegistrationPage;
import pages.P02_LoginPage;
import pages.P01_RegistrationPage.*;
import pages.PageBase;
import utilities.utlity;

import static testCases.TC01_RegistrationTest.*;

public class TC02_LoginTest extends TestBase{

    private static Faker faker = new Faker();


   // private P02_LoginPage loginPage;
   // private P01_RegistrationPage registration;

    //static final String FIRSTNAME = faker.name().firstName();
   // static final String LASTNAME = faker.name().lastName();
//  private  static  final String EMAIL = faker.internet().emailAddress();
 // private static final String PASSWORD = faker.internet().password();




    // TODO: check login with valid email and password
    @Test(priority = 1, description = "Check Login using Valid Email and Password")
    public void testLoginUserWithValidData_P() {

        new PageBase(driver).UserClickOnLogin();
        new P02_LoginPage(driver).addUseremail(EMAIL).addUserPasswod(PASSWORD).UserClickLogin();
        //TODO : take screenshot
        utlity.captureScreenshot(driver,"Login_P");
        // TOdO: Assert if login successfully
        Assert.assertTrue(new P02_LoginPage(driver).checkLogoutButton());

    }

    @Test(priority = 2)
    public void checkLoginWithInvalidEmailandValidPassword_N(){
        EMAIL="sldksld@gmail.com";
        new PageBase(driver).UserClickOnLogin();
        new P02_LoginPage(driver).addUseremail(EMAIL).addUserPasswod(PASSWORD).UserClickLogin();
        //TODO : take screenshot
        utlity.captureScreenshot(driver,"Login_N");
        Assert.assertTrue(new P02_LoginPage(driver).checkErrorMessage());
    }
    @Test(priority = 3)
    public void checkLoginWithValidEmailandInvalidPassword_N(){
        PASSWORD="sdfkdfnsdk";
        new PageBase(driver).UserClickOnLogin();
        new P02_LoginPage(driver).addUseremail(EMAIL).addUserPasswod(PASSWORD).UserClickLogin();
        //TODO : take screenshot
        utlity.captureScreenshot(driver,"Login_N");
        Assert.assertTrue(new P02_LoginPage(driver).checkErrorMessage());

    }
    @Test(priority = 4)
    public void checkLoginWithInvalidEmailandInvalidPassword_N(){
        EMAIL="dslfsdnlf@gmail.com";
        PASSWORD="dflksndfkln";
        new PageBase(driver).UserClickOnLogin();
        new P02_LoginPage(driver).addUseremail(EMAIL).addUseremail(PASSWORD).UserClickLogin();
        //TODO : take screenshot
        utlity.captureScreenshot(driver,"Login_N");
        Assert.assertTrue(new P02_LoginPage(driver).checkErrorMessage());

    }

}
