package com.example;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class XpathExample {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver",   "C:\\\\Users\\\\naiks\\\\Downloads\\\\chromedriver_win32/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
     
     
      
      
      driver.manage().window().maximize();
     
      
      driver.get("https://login.yahoo.com/account/create");
      driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("SaiKumar");
           
     /* WebElement input = driver.findElement(By.className("driveropdown-toggle"));
      input.click();
         System.out.println("input clicked....");  
      WebElement checkbox = driver.findElement(By.linkText("Checkbox Demo"));
      checkbox.click();
      System.out.println("Check Box..");
           
      WebElement check1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
      check1.click();
      System.out.println("Clicked Check Box..");
           
      WebElement checkall = driver.findElement(By.xpath("//input[@id='check1']"));
      checkall.click();
      System.out.println("Checked all Boxes..");*/
      

  }
}