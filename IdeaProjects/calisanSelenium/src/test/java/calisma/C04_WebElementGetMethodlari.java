package calisma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementGetMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Resources/Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("http://a.testaddressbook.com");

        //sigIn linkini locat edin
        WebElement signInLink=driver.findElement(By.id("sign-in"));
        System.out.println(signInLink.getSize());  //bir String dondurur,o elementin,sadece sign-in in,(64, 40)
        System.out.println(signInLink.getAriaRole()); //link
        System.out.println(signInLink.getAttribute("id"));// bize sign-in getirir,sign-in
        System.out.println(signInLink.getRect().width);  //dikdortgen olarak bize bu sayfasinin olculerini verir,64 verdi
        System.out.println(signInLink.getRect().height); //40
        System.out.println(signInLink.getCssValue("color "+"color"));// renk kodunu verir,rgba(0, 0, 0, 0.5)

        driver.close();









    }

}
