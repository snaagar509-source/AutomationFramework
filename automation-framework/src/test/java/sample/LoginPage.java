package sample;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Login;

public class LoginPage {


	
	public static void main(String[] args) {
		
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:localhost:8888");
		Login lgn= new Login(driver);
		
		lgn.getUn().sendKeys("admin");
		lgn.getPwd().sendKeys("manager");
		lgn.getLoginbtn().click();
}
}