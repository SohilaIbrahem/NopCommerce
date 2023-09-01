package testCases;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.P01_RegistrationPage;

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
      registration = new P01_RegistrationPage(driver);
      driver.findElement(By.xpath("//a[@href=\"/register?returnUrl=%2F\"]")).click();
      new P01_RegistrationPage(driver).addUserGenderFemale().enterFirstName(FIRSTNAME).enterLastName(LASTNAME).
              selectDay().selectMonth().selectYear().
              enterEmail(EMAIL).enterPassword(PASSWORD).enterConfPassword(PASSWORD).getRegisterBtn();
      //driver.navigate().back();

     // registration.enterFName(FIRSTNAME);
      //registration.enterLName(LASTNAME);
      //registration.enterEamil(EMAIL);
      //registration.enterPassword(PASSWORD);
      //registration.enterConfPassword(PASSWORD);
      //registration.clickRegidterBtn();


  }



}
