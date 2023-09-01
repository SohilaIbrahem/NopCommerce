package testCases;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.P01_RegistrationPage;
import pages.P02_LoginPage;
import pages.P01_RegistrationPage.*;

import static testCases.TC01_RegistrationTest.*;

public class TC02_LoginTest extends TestBase{

    private static Faker faker = new Faker();


   // private P02_LoginPage loginPage;
   // private P01_RegistrationPage registration;

    //static final String FIRSTNAME = faker.name().firstName();
   // static final String LASTNAME = faker.name().lastName();
//  private  static  final String EMAIL = faker.internet().emailAddress();
 // private static final String PASSWORD = faker.internet().password();




    @Test
    public void testLoginUser() {

        //loginPage = new P02_LoginPage(driver);
       // registration = new P01_RegistrationPage(driver);

//        new P01_RegistrationPage(driver).addUserGenderFemale().enterFirstName(FIRSTNAME).enterLastName(LASTNAME).
//                selectDay().selectMonth().selectYear().
//                enterEmail(EMAIL).enterPassword(PASSWORD).enterConfPassword(PASSWORD).getRegisterBtn();

        driver.findElement(By.xpath("//a[@class='ico-login']")).click();

        new P02_LoginPage(driver).addUseremail(EMAIL).addUseremail(PASSWORD).UserClickLogin();


       // driver.navigate().back();


        // loginPage.enterEmail(EMAIL);
        //loginPage.enterPass(PASSWORD);
        //loginPage.clickLoginBtn();
    }

    @Test
    public void checkLoginWithInvalidData(){}

}
