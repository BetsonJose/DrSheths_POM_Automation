package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
	public static WebDriver d;
	
	@BeforeClass
	
	public void setup()
	{
		d= new ChromeDriver();
		d.get("https://www.drsheths.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
