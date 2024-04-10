package Basicjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions Alloptions = new ChromeOptions();
		Alloptions.addArguments("--remote-allow-origin=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Select  s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByIndex(2);
		s.selectByValue("option3");
		for(WebElement option :s.getOptions()) {
			System.out.println(option.getText());
		}
	}

}
