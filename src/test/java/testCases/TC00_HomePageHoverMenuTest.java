package testCases;

import org.testng.annotations.Test;
import pages.P00_HomePageHoverMenu;

import static java.util.List.of;

public class TC00_HomePageHoverMenuTest extends TestBase{

    //P00_HomePageHover home = new P00_HomePageHover(this.driver);


   // String[] menuItems = {"Computers ", "Electronics ", "Apparel ", "Digital downloads ", "Books ", "Jewelry ","Gift Cards " };

 @Test
    public void test()
 {
     new P00_HomePageHoverMenu(driver).clickOnComputersLink();


 }




}
