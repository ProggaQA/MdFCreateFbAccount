
package utils;
public class WDFunctions{
	public static WebDriver driver ;
	public void typeByXpath (String locators, String values){
		driver.findElement(By.xpath(locators)).clear();
		driver.findElement (By.xpath(locators)).sendKeys (values)
	
}