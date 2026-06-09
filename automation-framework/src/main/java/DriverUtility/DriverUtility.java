package DriverUtility;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverUtility {
WebDriver driver;

public void getDriver() throws IOException, ParseException  {
	FileReader fir= new FileReader("./automation-framework/src/test/resources/CommanData.json");
	JSONParser obj =new JSONParser();
	
	
	JSONObject job = (JSONObject)obj.parse(fir) ;
	
	String BROWSER =	job.get("BROWSER").toString();

	if(BROWSER.equals("chrome")) {
		driver= new ChromeDriver();
	}else if(BROWSER.equals("firefox")) {
		driver= new FirefoxDriver();	
	}else if(BROWSER.equals("safari")) {
		driver= new SafariDriver();
	}else driver= new EdgeDriver();
	

}
}
