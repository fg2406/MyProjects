package calisma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Tk_05 {
    public static void main(String[] args) {
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        //2- Add Element butonuna basin
        //3- Delete butonu’nun gorunur oldugunu test edin
        //4- Delete tusuna basin
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
    //Locator konusu
        System.setProperty("webdriver.chrome.driver","Resources/Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2
        WebElement addBrowser= driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addBrowser.click();

       //3
        WebElement deleteBrowser=driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
          if (deleteBrowser.isDisplayed()){
              System.out.println("delete butonu gorunurlulugu PASS");
          }else{
              System.out.println("Faild");
          }

        //4
        deleteBrowser.click();

        //5
        WebElement addRemoveBrowser=driver.findElement(By.xpath("//div/div/div/div"));
        if (addRemoveBrowser.isDisplayed()){
            System.out.println("PASS");
        }else {
            System.out.println("FAILD");
        }

       driver.close();


    }





}
