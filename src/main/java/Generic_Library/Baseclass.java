package Generic_Library;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public WebDriver driver;
	public Propertyfile pdata= new Propertyfile()	;
	public WebDriverutility wb= new WebDriverutility();
	
	@BeforeTest
	public void OpenAPP() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.PropertyFilepath("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void CloseApp(ITestResult it) throws IOException
	{
		int status = it.getStatus();
		String name = it.getName();
		if(status==2)
		{
			ScreenShot s= new ScreenShot();
			s.screenshotdata(driver, name);
		}
		driver.quit();
	}
}
