package day05_mavenProjeOlusturma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();  //setup organize,kurmak  demek
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");

        //2. Signin buttonuna tiklayin
        WebElement signInButton= driver.findElement(By.xpath("//button[@id='signin_button']"));
        signInButton.click();

        //3. Login alanine  “username” yazdirin
           WebElement loginButton= driver.findElement(By.xpath("//input[@id='user_login']"));
           loginButton.sendKeys("username");

           //4. Password alanine “password” yazdirin
           WebElement passwordBrowser= driver.findElement(By.id("user_password"));
           passwordBrowser.sendKeys("password");


        //5. Sign in buttonuna tiklayin
       // WebElement signIn=driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
       // signIn.click();

        WebElement signInButonu=driver.findElement(By.xpath("//input[@value='Sign in']"));
        signInButonu.click();

       /* WebElement gelismis=driver.findElement(By.xpath("//button[@id='details-button']"));
        gelismis.click();
        WebElement siteGiris=driver.findElement(By.xpath("(//a[@href='#'])[4]"));
        siteGiris.click();*/


        WebElement gelismis=driver.findElement(By.xpath("//button[@id='details-button']"));
        gelismis.click();
        WebElement siteyeGiris=driver.findElement(By.xpath("//a[@id='proceed-link']"));
        siteyeGiris.click();

         //6. Pay Bills sayfasina gidin
        WebElement sayfayaGir=driver.findElement(By.xpath("//a[text()='Pay Bills']"));
        sayfayaGir.click();

        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        WebElement amonutBrowser=driver.findElement(By.id("sp_amount"));
        amonutBrowser.sendKeys("2000");

        //8. tarih kismina “2020-09-10” yazdirin
        WebElement tarihBrowser=driver.findElement(By.id("sp_date"));
        tarihBrowser.sendKeys("020-09-10");

        //9. Pay buttonuna tiklayin
        WebElement payButton=driver.findElement(By.id("pay_saved_payees"));
        payButton.click();

        //10. “The payment was successfully submitted.” mesajinin ciktigini control edin
            WebElement mesaj=driver.findElement(By.xpath("//span[@title='$ 2000 payed to payee sprint']"));

            if(mesaj.isDisplayed()){
                System.out.println("PASS");
            }else{
                System.out.println("FAILD");
            }

             driver.quit();


    }

}
