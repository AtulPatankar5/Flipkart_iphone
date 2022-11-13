
package Generic_Library;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

	
public void screenshotdata(WebDriver driver, String name) throws IOException
{
		Date d= new Date();
		String currentdate = d.toString().replaceAll(":", "-");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File RAM= ts.getScreenshotAs(OutputType.FILE);
		File dest= new File(AutoConstant.Photopath+currentdate+name+".png");
		FileUtils.copyFile(RAM, dest);
		
		
}

}
