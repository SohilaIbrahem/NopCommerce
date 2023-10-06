package testCases;

import drivers.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static drivers.DriverHolder.setDriver;

public class TestBase {


    protected WebDriver driver;
    private ChromeOptions options;

    @Parameters("browser")
    @BeforeTest()
    public void setupChromeDriver(String browser) throws InterruptedException {

        driver= DriverFactory.getNewInstance(browser);
        setDriver(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://demo.nopcommerce.com/");

    }

    @AfterTest
    public void tearDown ()
    {

        driver.quit();
    }
}



