package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
public Homepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(linkText ="Email")
private WebElement email;

 public WebElement getEmail() {
	 return email;
	
 }
 
 @FindBy(linkText ="Opportunities")
 private WebElement Opportuniti;

  public WebElement getOpportuniti() {
 	 return Opportuniti;
 	
  }
  
  @FindBy(linkText ="Contacts")
  private WebElement Contacts;

   public WebElement getContacts() {
  	 return Contacts;
  	
   }
   
   
   @FindBy(linkText ="Products")
   private WebElement Products;
   
   public WebElement getProducts() {
	   return Products;
	   
   }
   
   @FindBy(linkText ="Documents")
   private WebElement Documents;
   
   public WebElement getDocuments() {
	   return Products;
	   
   }
   
   @FindBy(linkText ="Trouble Tickets")
   private WebElement TroubleTickets;
   
   public WebElement getTroubleTickets() {
	   return TroubleTickets;
	   
   }
   @FindBy(linkText ="Dashboard")
   private WebElement Dashboard;
   
   public WebElement getDashboard() {
	   return Dashboard;
	   
   }
   @FindBy(linkText ="More")
   private WebElement More;
   
   public WebElement getMore() {
	   return More;
	  }
   
   @FindBy(linkText ="Leads")
   private WebElement Leads;
   
   public WebElement getLeads() {
	   return Leads;
   }
   
   @FindBy(linkText ="Calendar")
   private WebElement Calendar;
   
   public WebElement getCalendar() {
	   return Calendar;
   }
   

   @FindBy(linkText ="Sign Out")
   private WebElement SignOut;
   
   public WebElement getSignOut() {
   return SignOut;
}

   
   

}
