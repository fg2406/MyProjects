package calisma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Tk_04 {
    public static void main(String[] args) throws InterruptedException {

        ///*
        //        1-driver olusturalim
        //        2-java class'imiza chromedriver.exe'yi tanitalim
        //        3-driver'in tum ekrani kaplamasini saglayalim
        //        4-https://github.com/ adresine gidelim
        //        5-Ardindan https://www.hepsiburada.com/ adrsine gidelim
        //        6-Title ve url console da yazdirin ve yine title ve url in "burada" kelimesini icerip icermedigini kontrol edelim
        //        7-Sonrasinda https://github.com/ adresine geri donelim ve  sayfayi yenileyelim
        //        8-Son adim olarak butun sayfalarimizi kapatmis olalim
        //

        System.setProperty("webdriver.chrome.driver","Resources/Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //3
        driver.navigate().to("https://github.com/");
        //4
        driver.navigate().to("https://amazon.com/");
          //
         String acturalTitel=driver.getTitle();
         String expectedTitel="burada";

         if (acturalTitel.contains(expectedTitel)){
             System.out.println("PASS");
         }else {
             System.out.println("FAILD\nactualTitel :"+acturalTitel);
         }

         String actualUrl=driver.getCurrentUrl();
         String expectedUrl="burada";

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("PASS");
        }else {
            System.out.println("FAILD\nactualUrl :"+actualUrl);
        }

           //7
        driver.navigate().back();

        Thread.sleep(3000);
        driver.navigate().refresh();

        //8

        driver.manage().window().fullscreen();
        driver.manage().window().getSize();
        driver.manage().window().getPosition();
        driver.quit();
       // Thread.sleep(2000);
       // driver.manage().window().equals(actualUrl);

       // driver.getPageSource().contains("burada");




    }


}
