package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocartpage {

	@FindBy(xpath="//div[@class='dyC4hf']/descendant::div[@class='_30jeq3 _16Jk6d']")
	private WebElement price;
	
	@FindBy(xpath="//div[@class='_1AtVbE col-12-12']/descendant::button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addtocart;
	
	public Addtocartpage(WebDriver driver)
	{
		PageFactory.initElements( driver, this);
	}
	public void pricebutton()
	{
		price.getText();
	}
	
	public void addtocartbutton() {
		addtocart.click();
	}
}
