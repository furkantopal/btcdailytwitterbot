package com.topallist.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwitterLogin {

  public static void twitterLogin(String username, String password) {

    System.setProperty("webdriver.chrome.driver",
        "D:\\Dev\\workspace\\PersonalProjects\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://twitter.com/login");

    WebElement userEmail = driver.findElement(By.name("session[username_or_email]"));
    WebElement userPassword = driver.findElement(By.name("session[password]"));

    userEmail.sendKeys(username);
    userPassword.sendKeys(password);

    driver.findElement(By.xpath("//div[@role='button']")).click();
  }

}
