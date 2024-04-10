package Basicjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Automationrahulsheetypracticepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions demo = new ChromeOptions();
		demo.addArguments("--remote-allows-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");   //check the url
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("email")).sendKeys("Atishkumar");
		driver.findElement(By.name("pass")).sendKeys("Atishpass");	
		//driver.findElement(By.linkText("Forgotten password?")).click(); 
		//driver.findElement(By.className("_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy")).click();//get error compound class name not permitted 
		
		//xpath --also we can generate xpath using tools but they are not 100 percent reliable
		//xpath and css should be customize 
		driver.findElement(By.xpath("//*[@id='/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button']")).click();
		
		//xpath customize === //tagname[@attribute = 'value']
		or 	//*[@atrrributye  = 'value']
		
		//css path === tagname[attribute = value)]
		
		
		
		
		//parnet to child  to writew xpath 
		driver.quit();
		
		

	}

}
