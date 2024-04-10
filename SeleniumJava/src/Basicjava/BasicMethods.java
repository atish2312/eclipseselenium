package Basicjava;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicMethods {
	public static void main(String []args) {
		ChromeOptions free = new ChromeOptions();
		free.addArguments("--remote-allows-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle()); 	  //validate if your page title is correct 
		
		System.out.println(driver.getCurrentUrl());	//validate you are landed on correct url
		
		
//		System.out.println(driver.getPageSource());   
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());    //get current url
		driver.close();									//it closes current browser 
		driver.quit();									//it close the all brower opened by selenium script
		
		
		
	}

}
