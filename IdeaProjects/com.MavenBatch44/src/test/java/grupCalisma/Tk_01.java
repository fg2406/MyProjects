package grupCalisma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class Tk_01 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //bu adrese gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        //2 berlin i 3 farkli relative locator ile locate ediniz
        WebElement boston=driver.findElement(By.id("pid6_thumb"));
        WebElement  byArea= driver.findElement(By.id("pid8_thumb"));
        WebElement sailor= driver.findElement(By.id("pid11_thumb"));

        //Relative locator'larin dogru calistigini test edin

        //WebElement berlin1=driver.findElement(RelativeLocator.with(By.tagName()))


    }




}
