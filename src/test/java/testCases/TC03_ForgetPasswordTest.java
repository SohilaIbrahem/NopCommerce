package testCases;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.P01_RegistrationPage;
import pages.P03_ForgetPassword;

import static testCases.TC01_RegistrationTest.*;

public class TC03_ForgetPasswordTest extends TestBase{



    @Test
    public void Test()
    {
//        EMAIL = faker.internet().emailAddress();
//
//        new P01_RegistrationPage(driver).addUserGenderFemale().enterFirstName(FIRSTNAME).enterLastName(LASTNAME).
//                selectDay().selectMonth().selectYear().
//                enterEmail(EMAIL).enterPassword(PASSWORD).enterConfPassword(PASSWORD).getRegisterBtn();

//    driver.findElement(By.xpath("//a[@class='ico-login']")).click();

        new P03_ForgetPassword(driver).selectLoginBtn().ClickForget().sendEmail(EMAIL).clickForgetBtn();

        //driver.findElement(By.xpath("//a[normalize-space()='Forgot password?']")).click();



    }
}
