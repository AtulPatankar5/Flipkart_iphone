package Generic_Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Propertyfile {

	
	public String  PropertyFilepath(String key) throws IOException
	{
		FileInputStream fis= new FileInputStream(AutoConstant.Propertypath);
		Properties p= new Properties();
		p.load(fis);
		return p.getProperty(key);
		
				
	}
}
