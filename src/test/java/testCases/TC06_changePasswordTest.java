package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.P01_RegistrationPage;
import pages.P02_LoginPage;
import pages.P06_changePassworg;
import pages.PageBase;

import static testCases.TC01_RegistrationTest.*;

public class TC06_changePasswordTest extends TestBase{




    @Test
    public void changePassTest(){


/* new  P01_RegistrationPage(driver).addUserGenderFemale().enterFirstName(FIRSTNAME).enterLastName(LASTNAME).
                selectDay().selectMonth().selectYear().
                enterEmail(EMAIL).enterPassword(PASSWORD).enterConfPassword(PASSWORD).getRegisterBtn();*/

        new P02_LoginPage(driver).UserClickLogin().addUseremail(EMAIL).addUserPasswod(PASSWORD);

       // driver.findElement(By.xpath("//a[@class='ico-account']")).click();
         new PageBase(driver).UserClickOnChangePassword();
         new P06_changePassworg(driver).userClickChangePass().enterOldPass(PASSWORD).
                 enterNewPass(PASSWORD).enterCofNewPass(PASSWORD).userClickOnChangePassBtn();


        // driver.navigate().back();

    }
}
