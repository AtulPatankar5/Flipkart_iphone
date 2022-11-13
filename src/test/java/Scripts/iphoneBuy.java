package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Generic_Library.Baseclass;

import POM_Pages.Addtocartpage;
import POM_Pages.HomePage;
import POM_Pages.Mobilepage;


public class iphoneBuy extends Baseclass {

	
	@Test
	public void tc1() throws IOException
	{
		HomePage hm= new HomePage(driver);
		hm.closebutton();
		hm.searchboxicon(("searchname"));
		hm.searchbuttonicon();
		
		
		Mobilepage mp= new Mobilepage(driver);
		wb.switchtab(driver);
		mp.iphoneselecticon();
		
		Addtocartpage at= new Addtocartpage(driver);
		wb.switchtab(driver);
		at.pricebutton();
		at.addtocartbutton();
	}
		
	
		
	
}
