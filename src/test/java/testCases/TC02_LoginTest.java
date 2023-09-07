package testCases;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_RegistrationPage;
import pages.P02_LoginPage;
import pages.P01_RegistrationPage.*;
import pages.PageBase;

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

        //loginPage = new P02_LoginPage(driver);
       // registration = new P01_RegistrationPage(driver);

//        new P01_RegistrationPage(driver).addUserGenderFemale().enterFirstName(FIRSTNAME).enterLastName(LASTNAME).
//                selectDay().selectMonth().selectYear().
//                enterEmail(EMAIL).enterPassword(PASSWORD).enterConfPassword(PASSWORD).getRegisterBtn();

       // driver.findElement(By.xpath("//a[@class='ico-login']")).click();

        new PageBase(driver).UserClickOnLogin();
        new P02_LoginPage(driver).addUseremail(EMAIL).addUserPasswod(PASSWORD).UserClickLogin();
        // TOdO: Assert if login successfully
        Assert.assertTrue(new P02_LoginPage(driver).checkLogoutButton());
        //System.out.println(EMAIL + "     "+PASSWORD);


       // driver.navigate().back();


        // loginPage.enterEmail(EMAIL);
        //loginPage.enterPass(PASSWORD);
        //loginPage.clickLoginBtn();
    }

    @Test(priority = 2)
    public void checkLoginWithInvalidEmailandValidPassword_N(){
        EMAIL="sldksld@gmail.com";
        new PageBase(driver).UserClickOnLogin();
        new P02_LoginPage(driver).addUseremail(EMAIL).addUserPasswod(PASSWORD).UserClickLogin();
        Assert.assertTrue(new P02_LoginPage(driver).checkErrorMessage());
    }
    @Test(priority = 3)
    public void checkLoginWithValidEmailandInvalidPassword_N(){
        PASSWORD="sdfkdfnsdk";
        new PageBase(driver).UserClickOnLogin();
        new P02_LoginPage(driver).addUseremail(EMAIL).addUserPasswod(PASSWORD).UserClickLogin();
        Assert.assertTrue(new P02_LoginPage(driver).checkErrorMessage());

    }
    @Test(priority = 4)
    public void checkLoginWithInvalidEmailandInvalidPassword_N(){
        EMAIL="dslfsdnlf@gmail.com";
        PASSWORD="dflksndfkln";
        new PageBase(driver).UserClickOnLogin();
        new P02_LoginPage(driver).addUseremail(EMAIL).addUseremail(PASSWORD).UserClickLogin();
        Assert.assertTrue(new P02_LoginPage(driver).checkErrorMessage());

    }

}
