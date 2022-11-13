package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//div[@class='_1cmsER']/descendant::input[@class='_3704LK']")
	private WebElement searchbox;
	
	@FindBy(xpath="//div[@class='_1cmsER']/descendant::button")
	private WebElement Searchbutton;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement close;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void closebutton()
	{
		close.click();
	}
	public void searchboxicon(String  searchname) {
		searchbox.sendKeys(searchname);
	}
	public void searchbuttonicon()
	{
		Searchbutton.click();
	}
}
