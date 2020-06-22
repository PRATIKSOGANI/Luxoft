package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	//Declare the WebDriver
    public static WebDriver driver;
    public static Properties prop;
    
    //constructor of base class
    public BaseClass() {
        
    	try{
    		prop = new Properties();
    		FileInputStream file = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\Luxoft\\src\\main\\java\\com\\qa\\config\\config.properties");
    		prop.load(file);
        }catch(IOException e) {
        	
        	e.getMessage();
        }
    	
    }
    	
    public static void setup() {
    		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\Chrome Driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
    
    public static void proxypopup() {
    	
    	driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='cboxIframe']")));
		driver.findElement(By.xpath("//span[@class='actionbutton__txtbody'][contains(.,'Set preferences')]")).click();
		driver.switchTo().defaultContent();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    public static void CloseBrowser() {
    	
    	driver.close();
    }
    	
    	
    	
    	
    	
    	
    	

}
