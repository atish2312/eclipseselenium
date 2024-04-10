package Basicjava;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Cofigurejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create driver object
		//2 ways without create driver object
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
//		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.print(driver.getTitle());
	
 
	}

}
