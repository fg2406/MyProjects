package calisma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tk_02 {

    public static void main(String[] args) throws InterruptedException {
        //1.Yeni bir class olusturalim (Homework)
        //        2.ChromeDriver kullanara, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        //        3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //        yazdirin.
        //        4.https://www.walmart.com/ sayfasina gidin.
        //        5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        //        6. Tekrar “facebook” sayfasina donun
        //        7. Sayfayi yenileyin
        //        8. Sayfayi tam sayfa (maximize) yapin
        //        9.Browser’i kapatin*/


        System.setProperty("webdriver.chrome.driver", "Resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://de-de.facebook.com/");

        String actualResult = driver.getTitle();
        String expectedResult = "facebook";

        if (actualResult.equals(expectedResult)) {

            System.out.println("PASS");

        } else {
            System.out.println("FAILD");
            System.out.println("titel :" + driver.getTitle());
        }
        //3
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "facebook";

        if (actualUrl.contains(expectedUrl)) {

            System.out.println("Pass");
        } else {
            System.out.println("faild");
            System.out.println("actualUrl :" + driver.getCurrentUrl());
        }
        //4
        driver.navigate().to("https://www.walmart.com/");

        Thread.sleep(5000);

        //5
        String actualResult1 = driver.getTitle();
        String expectedResult1 = "Walmart.com";
        if (actualResult1.contains(expectedResult1)) {

            System.out.println("Pass");
        } else {
            System.out.println("faild");
            System.out.println("actualUrl :" + driver.getTitle());


        }

        //6
          driver.navigate().back();

        //7 sayfayi yenileyin

        driver.navigate().refresh();
        //tam sayfa yapiniz

        driver.manage().window().minimize();
        //kapatin

        driver.close();

    }
}