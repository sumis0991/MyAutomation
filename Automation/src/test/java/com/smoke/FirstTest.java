package com.smoke;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sumaiya/Desktop/Chromedriver");
		
		WebDriver driver = new ChromeDriver(); // initialize browser
		
		
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
		driver.get("https://money.cnn.com/data/markets/");
		
		//driver.navigate().to("https://mail.google.com/mail/u/1/#inbox");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		
		WebElement market= driver.findElement(By.xpath("//h1[@class='article-title pull-left']"));
		
		System.out.println(market.getText());
		
		
		
		
		
		
	}

}
