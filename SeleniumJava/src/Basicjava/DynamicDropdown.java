package Basicjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	ChromeOptions options = new ChromeOptions();
	//	options.addArguments("--remote-allow-origin=*");
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("indi");
		Thread.sleep(2000);
		
		List<WebElement> v = driver.findElements(By.xpath("//ul/li/div"));
		for(int i = 0; i<v.size();i++) {
			String values  = v.get(i).getText();
			if(values.equals("India")) {
			v.get(i).click();
			
				
			}
			
		}

		
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
