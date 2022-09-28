import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class SelIntroduction {

    public static void main (String [] args){


        //invoking browser
        // Chrome browser -> ChromeDriver-> methods
        // untuk bisa mengakss methods yang ada pada ChromeDriver -> kita harus membuat object class
        //chrome driver.exe -> ChromeBrowser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\samue\\OneDrive\\Desktop\\Tools\\Selenium\\chromedriver.exe");
        // webdriver. chromedriver -> value of path
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();








    }



}
