package bank.com.pageobject;



	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPO 
	{

		WebDriver ldriver;
		
		public LoginPO(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver,this );
		}
		
		@FindBy(xpath="//td//input[@name='uid']")
		WebElement user;
		
		@FindBy(xpath="//tbody/tr[2]/td[2]/input[1]")
		WebElement pass;
		
		@FindBy(xpath="//td//input[@name=\"btnLogin\"]")
		WebElement logbut;
		
		@FindBy(xpath="//a[normalize-space()='Log out']")
		WebElement logout;
		
		
		public void userlp(String us)
		{
			user.sendKeys(us);
		}
		
		public void passlp(String ps)
		{
			pass.sendKeys(ps);
		}
		
		public void log()
		{
			logbut.click();
		}
		public void loout()
		{
			logout.click();
		}
		
		}



