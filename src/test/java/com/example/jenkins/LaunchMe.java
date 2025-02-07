package com.example.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchMe {
	
	
        @Test
	    public void launchBrowser() {
	        // Setup WebDriver Manager for Chrome
	        WebDriverManager.chromedriver().setup();
	        
	        // Instantiate Chrome WebDriver
	        WebDriver driver = new ChromeDriver();
	        
	        // Open a website
	        driver.get("https://www.google.com");
	        
	        // Maximize the window
	        driver.manage().window().maximize();
	        
	        // Perform other actions (if needed)

	        // Close the browser
	        driver.quit();
        	
        	System.out.println("This is Sriram");
	    }
	}


