package testCases;

import org.testng.annotations.Test;
import pages.P02_LoginPage;
import pages.P05_changePassword;
import pages.PageBase;

import static testCases.TC01_RegistrationTest.*;

public class TC05_changePasswordTest extends TestBase{




    @Test
    public void changePassTest(){


         new P02_LoginPage(driver).UserClickLogin().addUseremail(EMAIL).addUserPasswod(PASSWORD);
         new PageBase(driver).UserClickOnChangePassword();
         new P05_changePassword(driver).userClickChangePass().enterOldPass(PASSWORD).
                 enterNewPass(PASSWORD).enterCofNewPass(PASSWORD).userClickOnChangePassBtn();

    }
}
