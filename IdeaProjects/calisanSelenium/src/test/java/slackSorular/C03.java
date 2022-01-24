package slackSorular;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","Resources/Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));




        //1.  https://id.heroku.com/login sayfasina gidin
       driver.get("https://id.heroku.com/login");
        //        2.  Bir mail adersi giriniz
       WebElement emailBrowser= driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']"));
       emailBrowser.sendKeys("fliz11@gmail.com");
        //        3.  Bir password giriniz
        //WebElement passwordBrowser= driver.findElement(By.xpath());
        //        4.  Login butonuna tiklayiniz
      //WebElement loginBrowser=driver.findElement(By.xpath())
        //        5.  "There was a problem with your login." texti gorunur ise
        WebElement problemBrowser= driver.findElement(By.xpath("//input[@name='_csrf']"));
            if (problemBrowser.isDisplayed()){
                System.out.println("kayit yapildi PASS");
            }else{
                System.out.println("kayit yapilamadi FAILD");

            }

            Thread.sleep(3000);

        //        6.  "kayit yapilamadi" yazdiriniz

        //        8.  eger yazi gorunur degilse "kayit yapildi" yazdiriniz

        //        9.  Tum sayfalari kapatiniz
          driver.close();




    }




}
