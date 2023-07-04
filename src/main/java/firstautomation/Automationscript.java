package firstautomation;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automationscript {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();		
		
       ChromeDriver odriver = new ChromeDriver();
		
		odriver.get("https://www.apple.com/in/");
		
		
		

	}

}
