package testCases;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_RegistrationPage;
import pages.PageBase;

public class TC01_RegistrationTest extends TestBase{

private P01_RegistrationPage registration;

static Faker faker = new Faker();

    static final String FIRSTNAME = faker.name().firstName();
    static final String LASTNAME = faker.name().lastName();

    //private static final String day = faker.number().randomNumber();
    static final String EMAIL = faker.internet().emailAddress();
    static final String PASSWORD=faker.internet().password();

    private static final String ConPass = PASSWORD;



  @Test
    public void RegisterTest()

  {
     // registration = new P01_RegistrationPage(driver);
      //driver.findElement(By.xpath("//a[@href=\"/register?returnUrl=%2F\"]")).click();
      new PageBase(driver).UserClickOnRegister();
      new P01_RegistrationPage(driver).addUserGenderFemale().enterFirstName(FIRSTNAME).enterLastName(LASTNAME).
              selectDay().selectMonth().selectYear().
              enterEmail(EMAIL).enterPassword(PASSWORD).enterConfPassword(PASSWORD).getRegisterBtn();

       //TODO:Asseert result

      Assert.assertTrue(new P01_RegistrationPage(driver).confRegisterSuccessfully()); //hard assert

     /* SoftAssert softAssert = new SoftAssert();  // Soft assert
      softAssert.assertTrue(new P01_RegistrationPage(driver).confRegisterSuccessfully());
      softAssert.assertAll();
*/

      //driver.navigate().back();
     // registration.enterFName(FIRSTNAME);
      //registration.enterLName(LASTNAME);
      //registration.enterEamil(EMAIL);
      //registration.enterPassword(PASSWORD);
      //registration.enterConfPassword(PASSWORD);
      //registration.clickRegidterBtn();


  }



}
