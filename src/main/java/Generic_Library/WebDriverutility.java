package Generic_Library;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverutility {

	public void dropdown(WebElement ele) {
		Select s= new Select(ele);
		s.selectByIndex(0);			
	}
	public void Mousehover(WebElement ele, WebDriver driver)
	{
		Actions a= new Actions(driver);
		a.moveToElement(ele).perform();
	}
	public void doubleclick(WebDriver driver, WebElement ele)
	{
		Actions a= new Actions(driver);
		a.doubleClick(ele).perform();
	}
	public void rightclick(WebDriver driver, WebElement ele)
	{
		Actions a= new Actions(driver);
		a.contextClick(ele).perform();
	}
	public void dragandrop(WebDriver driver, WebElement src, WebElement dest)
	{
		Actions a= new Actions(driver);
		a.dragAndDrop(src,dest).perform();
	}
	public void alert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void switchback(WebDriver driver)
	{
		driver.switchTo().defaultContent()	;
		
	}
	public void swtichtoFrame(WebDriver driver)
	{
		driver.switchTo().frame(0);
	}
	public void switchtab(WebDriver driver)
	{
		Set<String> child = driver.getWindowHandles();
		for(String b: child)
		{
			driver.switchTo().window(b);
		}
	}
}
