package calisma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tk_01 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Resources/Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://amazon.com");

    
       Thread.sleep(2000);  // Thread.sleep methodu kac sanyie web sayfasinda durup kapanacagini yazariz,
        //kodlarin saglikli calismasi icin bekleme suresine bazen ihtiyac olur ondan yazariz

       driver.navigate().to("https://www.youtube.com/");
        Thread.sleep(2000);
       //navigate.to methodu  bir sonraki sayfaya gider

       driver.navigate().to("http://amazon.com");
        Thread.sleep(2000);

       driver.navigate().back();
        Thread.sleep(2000);
     // navigate.back methodu  bir onceki sayfaya doner

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
       // navigate.refresh methodu  sayfayi tekrar yeniler

        driver.manage().window().maximize(); // manage windows ayarlari yapiyor,windows sayfasini buyuk boy yapar
        Thread.sleep(2000);

        driver.close();

    }

}
