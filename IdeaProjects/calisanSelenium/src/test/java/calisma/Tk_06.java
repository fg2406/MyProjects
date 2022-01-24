package calisma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Tk_06 {

    public static void main(String[] args) {

       //Asagidaki testi text’leri kullanarak locate edin

        System.setProperty("webdriver.chrome.driver","Resources/Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin
        WebElement addBrowers= driver.findElement(By.xpath("//button[text()='Add Element']"));


        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton=driver.findElement(By.xpath("//button[text()='Add Element']"));
        if (deleteButton.isDisplayed()){
            System.out.println("PASS");
        }else{
            System.out.println("FAILD");
        }
        //4- Delete tusuna basin
        deleteButton.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
         WebElement addRemoveBrowser=driver.findElement(By.xpath("//h3[text()='Add/Remove Elements']"));
         if (addBrowers.isDisplayed()){
             System.out.println("PASS");
         }else{
             System.out.println("FAILD");
         }

    driver.close();




    }


}
