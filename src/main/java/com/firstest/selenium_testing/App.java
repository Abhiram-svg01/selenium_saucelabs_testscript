package com.firstest.selenium_testing;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws InterruptedException, IOException
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhiram\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	
    	
    	 ChromeOptions chromeOptions = new ChromeOptions();
         //chromeOptions.addArguments("--headless");
          
         WebDriver driver = new ChromeDriver((chromeOptions));
         System.out.println("opening url");
         driver.get("https://www.saucedemo.com/v1/index.html");
         driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
         
         System.out.println("Entering details");
         driver.findElement(By.id("user-name")).sendKeys("standard_user");
         Thread.sleep(3000);
         driver.findElement(By.id("password")).sendKeys("secret_sauce");
         Thread.sleep(3000);
         driver.findElement(By.id("login-button")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button")).click();
         Thread.sleep(3000);
         driver.findElement(By.id("shopping_cart_container")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/a[2]")).click();
         Thread.sleep(3000);
         driver.findElement(By.id("first-name")).sendKeys("john");
         Thread.sleep(3000);
         driver.findElement(By.id("last-name")).sendKeys("doe");
         Thread.sleep(3000);
         driver.findElement(By.id("postal-code")).sendKeys("444444");
         Thread.sleep(3000);
         driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/form/div[2]/input")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[8]/a[2]")).click();
         Thread.sleep(3000);
         
         
         driver.quit();
    }
}