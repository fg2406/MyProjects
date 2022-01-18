package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01IlkClass {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe ");
        WebDriver driver=new ChromeDriver();  //chrome nin özelliklerini alacak,bu objede
       //eger webDriver olusturulan satirda hata var yazisi asagida cikarsa
        // yazarsa yazilimda veya yukarda prantezdeki yollarda hata vardir %99


        driver.get("http://www.amazon.com");  // konsolda kirmizi olmasi selenyumda hata demek degil
        // Process finished with exit code 0,0 yazarsa sorun yok demek,1 veya baska no yazarsa sorun  var demek
        //driver.get("http://www.amazon.com"); bunu yazmasask gene calisir ChromeDriver calsiir,gider bize bos
        //chrome browser sayfa acar ,ChromeDriver web driver interfaces ini implemet ettigi icin bos sayfa cikar
        // driver.get methodu driver a gidecegi web adresini girmemizi saglar


         Thread.sleep(3000);

          driver.close();
          // driver'i kapatir



    }




}
