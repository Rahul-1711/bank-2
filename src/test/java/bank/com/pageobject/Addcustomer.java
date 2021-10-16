package bank.com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcustomer 
{
WebDriver Adriver;
	
	public Addcustomer (WebDriver Cdriver)
	{
		Adriver=Cdriver;
		PageFactory.initElements(Cdriver,this );
	}
	
	@FindBy(xpath="//a[normalize-space()='New Customer']")
	WebElement NewCustom;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement CustomerName;
	
	@FindBy(xpath="//input[@value='m']")
	WebElement gender;
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement dob;
	
	@FindBy (xpath="//textarea[@name='addr']")
	WebElement addrs;

	@FindBy (xpath="//input[@name='city']")
	WebElement city;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement state;
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement pin;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement mob;
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passe;
	
	@FindBy(xpath="//input[@name='sub']")
	WebElement subm;
	
	
	public  void Clicknewcu()
	{
		NewCustom.click();
	}
	public void cuname(String name)
	{
		CustomerName.sendKeys(name);
	}
	
	public  void genderr ()
	{
		gender.click();
	}
	public  void dateob(String mm,String dd,String yy)
	{
		dob.sendKeys(mm);
		dob.sendKeys(dd);
		dob.sendKeys(yy);
		
	}
	public  void adress(String ad)
	{
		addrs.sendKeys(ad);
	}
	public void citty(String ct)
	{
		city.sendKeys(ct);
	}
	public void stte (String stat)
	{
		state.sendKeys(stat);
	}
	public void  pnc(String pc)
	{
		pin.sendKeys(String.valueOf(pc));
		
	}
	public void mobno (String mobi)
	{
		mob.sendKeys(String.valueOf(mobi));
		
	}
	public void emll (String em)
	{
		email.sendKeys(em);
	}
	public void pssw(String pss)
	{
		passe.sendKeys(pss);
		
	}
	public void suml()
	{
		subm.click();
	}
	

}
