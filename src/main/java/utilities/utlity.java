package utilities;

import pages.P01_RegistrationPage;

import java.util.Random;

public class utlity {

  public static int generateRandomNumber(int lowerBound , int upperBound)
    {
        Random random =new Random();
        int randomNumbers =random.nextInt(upperBound-lowerBound+1) +lowerBound;

        return randomNumbers;
    }


    public static String selectRandomMenuItem(String[] menuItems) {
        Random random = new Random();
        int randomIndex = random.nextInt(menuItems.length);
        return menuItems[randomIndex];
    }



}
