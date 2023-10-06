package testCases;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_RegistrationPage;
import pages.PageBase;
import utilities.utlity;

public class TC01_RegistrationTest extends TestBase {

    private P01_RegistrationPage registration;

    static Faker faker = new Faker();

    static final String FIRSTNAME = faker.name().firstName();
    static final String LASTNAME = faker.name().lastName();

    //private static final String day = faker.number().randomNumber();
    static String EMAIL = faker.internet().emailAddress();
    static String PASSWORD = faker.internet().password();
    private static final String ConPass = PASSWORD;

    @Test(priority = 1)
    public void RegisterTest_P() {

        new PageBase(driver).UserClickOnRegister();
        new P01_RegistrationPage(driver).addUserGenderFemale().enterFirstName(FIRSTNAME).enterLastName(LASTNAME).
                selectDay().selectMonth().selectYear().
                enterEmail(EMAIL).enterPassword(PASSWORD).enterConfPassword(PASSWORD).getRegisterBtn();
        //TODO : take screenshot
        utlity.captureScreenshot(driver, "register");
        //TODO:Assert result
        Assert.assertTrue(new P01_RegistrationPage(driver).confRegisterSuccessfully());

    }

    @Test(priority = 2)
    public void RegisterTest_withDuplicatedData_N() {
        new PageBase(driver).UserClickOnRegister();
        new P01_RegistrationPage(driver).addUserGenderFemale().enterFirstName(FIRSTNAME).enterLastName(LASTNAME).
                enterEmail(EMAIL).enterPassword(PASSWORD).enterConfPassword(PASSWORD).getRegisterBtn();
        //TODO : take screenshot
        utlity.captureScreenshot(driver, "duplicated_register");
        //TODO:Assert result
        Assert.assertTrue(new P01_RegistrationPage(driver).ErrorMessage());

    }
}
