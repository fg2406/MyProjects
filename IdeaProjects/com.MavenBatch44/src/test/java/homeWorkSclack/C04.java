package homeWorkSclack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C04 {

    public static void main(String[] args) throws InterruptedException {
        // //1. Bir class oluşturun: LocatorsIntro
        //    //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //        // a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        //        // b. Sign in butonuna basin
        WebElement signButton= driver.findElement(By.id("sign-in"));
        signButton.click();

        //        // c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailBox= driver.findElement(By.id("session_email"));
        WebElement passwordTextBox= driver.findElement(By.id("session_password"));
        WebElement signInButton=driver.findElement(By.xpath("//input[@class='btn btn-primary']"));


        //        // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //        // i. Username : testtechproed@gmail.com
        //        // ii.Password : Test1234!

        emailBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButton.click();


        //        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
              Thread.sleep(5000);
             String actualId=driver.findElement(By.xpath("//span[@class='navbar-text']")).getText();
              String expectedId="testtechproed@gmail.com";
              if (actualId.equals(expectedId)){
                  System.out.println("dogrulama PASS");
              }else{
                  System.out.println("dogrulama FAILD");
              }

        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

       WebElement addressesBox=driver.findElement(By.xpath("//a[text()='Addresses']"));
              WebElement signOut=driver.findElement(By.xpath("//a[text()='Sign out']"));
              //addressesBox.isDisplayed();
              //signOut.isDisplayed();
       //2.yol
        System.out.println(addressesBox.isDisplayed()?" PASS":" FAILD");
        System.out.println(signOut.isDisplayed() ? "SignOut testing Pass":"SignOut testing Faild");

        //    //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> link=driver.findElements(By.tagName("a"));
        System.out.println("link :"+link.size()+"tanedir");

        //    //4.Linklerin yazisini nasil yazdirabiliriz
        for (WebElement s:link){
            System.out.println(s.getText());
            
        }

        //    //5. driver i kapatin
        driver.close();
        //Collapse
    }

}
