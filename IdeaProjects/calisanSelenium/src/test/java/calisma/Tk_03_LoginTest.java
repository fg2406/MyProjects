package calisma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Tk_03_LoginTest {
    public static void main(String[] args) throws InterruptedException {

        //1. Bir class oluşturun: LoginTest
        //        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

        System.setProperty("webdriver.chrome.driver","Resources/Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //                a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");


        //        b. Sign in butonuna basin

        WebElement signInLink=driver.findElement(By.id("sign-in")); //sadece locate ettik variablese atadik
         signInLink.click();  //gitmesi icin bu lazim

        //        c. email textbox,password textbox, and signin button elementlerini locate ediniz..

       WebElement emailTextBox=driver.findElement(By.id("session_email"));
       WebElement passWordTextBox=driver.findElement(By.id("session_password"));
        WebElement sigInButton= driver.findElement(By.name("commit"));

        //        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //        i. Username : testtechproed@gmail.com
        //        ii. Password : Test1234!

       emailTextBox.sendKeys("testtechproed@gmail.com");// WebElement methodlari kullanacagiz
        //webElementleri uzerinde eylemler gerceklestirmek icin

        //Thread.sleep(3000);
       passWordTextBox.sendKeys("Test1234!");

       sigInButton.click();


        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        //locator yaparsak bize mutlaka webElementi doner
    //sayafa acilinca uzerindeki herhangi bir yaziyinin html kodlarindan bakabiliriz,alip getiririz

        WebElement girisYazisiElementi=driver.findElement(By.tagName("h1"));
        System.out.println(girisYazisiElementi.getText());//bize giris yazisi basligini getirir
        String actualGirisYazisi= girisYazisiElementi.getText();
        String expectedGirisYazisi="Welcome to Address Book";

        if (actualGirisYazisi.equals(expectedGirisYazisi)){
            System.out.println("Sayfaya giris testi Pass");
        }else {
            System.out.println("Sayfaya giris testi Faild");
        }




        // f. "Addresses" ve "Sign Out" textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement adresWebElementi=driver.findElement(By.linkText("Addresses"));
        WebElement signOut=driver.findElement(By.linkText("Sign out"));

    //adresWebElementi.isDisplayed();// true yada false doner
        //ama burda bir sinuc icin if icinde dogrulama yapacagiz

       if (adresWebElementi.isDisplayed()){
           System.out.println("Adres goruntuleme testi PASS");
       }else{
           System.out.println("Adres goruntuleme testi Faild");
       }

          if (signOut.isDisplayed()){
              System.out.println("SigOut testi PASS");
          }else{
              System.out.println("SignOut elementi testi Faild");
          }



         //bu ternary ilede yapilir

        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linklerListesi=driver.findElements(By.tagName("a")); // kac link var hep a tagi ile bulunur

          System.out.println("sayfada "+ linklerListesi.size() +" adet link bulunmaktadir");

    }



}
