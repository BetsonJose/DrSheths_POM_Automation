package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddtoCart_Page 
{
	public WebDriver d;
	
	public By acc= By.id("shopify-section-header-toplink-menu");
	public By createacc= By.xpath("//button[@title='Create an Account']");
	public By fname= By.id("FirstName");
	public By lname= By.id("LastName");
	public By email= By.id("Email");
	public By pwd= By.id("CreatePassword");
	public By submit= By.xpath("/html/body/div[4]/div/div[2]/div/div/div[2]/div/div[2]/form/div/div/div[2]/ul/li[3]/div/input");
	public By search= By.name("s");
	public By product= By.xpath("/html/body/div[4]/div[1]/div[1]/div[1]/div/div[1]/div/div/div[1]/div[1]/div[2]/div[3]/div[1]/div/div[2]/div/div[2]/a");
	public By addtocart= By.xpath("/html/body/div[4]/div[1]/div[2]/div/div/div/div[1]/div[2]/div/div/div/div[2]/div[1]/div/div/div[2]/div[4]/form/div[4]/div[1]/div[2]/div[1]/div/div/button/span");
	
	public AddtoCart_Page(WebDriver d) 
	{
		this.d= d;
	}

	public void setValues(By element, String value)
	{
		d.findElement(element).sendKeys(value);
	}
	
	public void btnClick(By element)
	{
		d.findElement(element).click();
	}
}
