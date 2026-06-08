package Login;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Login;

public class LoginPage {


	
	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http:localhost:8888");
		Login lgn= new Login(driver);
		
		lgn.getUn().sendKeys("admin");
		lgn.getPwd().sendKeys("manager");
		lgn.getLoginBtn().click();
		Thread.sleep(2000);
		driver.quit();
}
}