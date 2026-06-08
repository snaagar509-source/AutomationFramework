package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	private WebElement un;

	public WebElement getUn() {
		return un;
	}

	@FindBy(id = "password")
	private WebElement pwd;

	public WebElement getPwd() {
		return pwd;
	}

	@FindBy(id = "login-button")
	private WebElement logbtn;

	public WebElement getLoginbtn() {
		return logbtn;
	}
	
	
	
		
	}

