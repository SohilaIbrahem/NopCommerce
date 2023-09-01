package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.P01_RegistrationPage;
import pages.P06_changePassworg;

import static testCases.TC01_RegistrationTest.*;

public class TC06_changePasswordTest extends TestBase{




    @Test
    public void changePassTest(){

        new  P01_RegistrationPage(driver).addUserGenderFemale().enterFirstName(FIRSTNAME).enterLastName(LASTNAME).
                selectDay().selectMonth().selectYear().
                enterEmail(EMAIL).enterPassword(PASSWORD).enterConfPassword(PASSWORD).getRegisterBtn();

        driver.findElement(By.xpath("//a[@class='ico-account']")).click();

         new P06_changePassworg(driver).userClickChangePass().enterOldPass(PASSWORD).
                 enterNewPass(PASSWORD).enterCofNewPass(PASSWORD).userClickOnChangePassBtn();

        // driver.navigate().back();

    }
}
