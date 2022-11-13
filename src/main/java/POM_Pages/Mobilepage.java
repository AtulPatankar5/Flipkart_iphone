package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mobilepage {

	@FindBy(xpath="//div[@data-id='MOBFWQ6BXGJCEYNY']/descendant::div[@class='_4rR01T']")
	private WebElement iphoneselect;
	
	public Mobilepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void iphoneselecticon()
	{
		iphoneselect.click();
	}
}
