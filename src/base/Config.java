
package base;

import testCases.FBLoginTC;
import utils.WDFunctions;

public class Config extends WDFunctions{
	
	static FBLoginTC tc = new FBLoginTC();
	
	public static void main(String[] args) {
		
		System.out.println("Start the browser");
		//System.setProperty("webdriver.chrome.driver", "C://Users//Farhana//workspace//QaProMDFrameWorkTest//drivers//chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println("end the browser");
		maximizePage();
		tc.loginTC();
	
	
}