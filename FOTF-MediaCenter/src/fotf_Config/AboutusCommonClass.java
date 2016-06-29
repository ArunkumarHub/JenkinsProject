package fotf_Config;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AboutusCommonClass extends Basedriver{

	//static String autoAboutus = "html/body/form/div[5]/div[2]/div/div[1]/div/div[3]/div/div/div[1]/div/div[2]/div[1]/div[2]/div[2]//span[text()='";
	static String articleItem="//span[text()='auto-aboutus']/parent::a/following-sibling::div/div/a/following-sibling::div/div[1]/a";
	public static String[] clonedRecentArticleTitle = new String[4];

	public static String SitecoreUserName()
	{
		return dataSourceProvider.getProperty("SitecoreUserName");
	}
	
	public static String SitecorePassword()
	{
		return dataSourceProvider.getProperty("SitecorePassword");
	}
	
	public static String PageComponentContentItemName()
	{
		return dataSourceProvider.getProperty("ItemName");
	}
	
	public static String InitiativeComponentContentItemName()
	{
		return dataSourceProvider.getProperty("InitiativeItemName");
	}
	
	public static WebElement PageComponentContentItem() throws InterruptedException
	{		
		//return Driver.findElement(By.xpath(autoAboutus + PageComponentContentItemName() + "']"));	
		return Driver.findElement(By.xpath("//span[text()='" + PageComponentContentItemName() + "']"));
	}	
	
	public static WebElement InitiativeComponentContentItem() throws InterruptedException
	{		
		//return Driver.findElement(By.xpath(autoAboutus + PageComponentContentItemName() + "']"));	
		return Driver.findElement(By.xpath("//span[text()='" + InitiativeComponentContentItemName() + "']"));
	}
	
	public static WebElement ArticleComponentContentItem()
	{
			return Driver.findElement(By.xpath(articleItem.replace("auto-aboutus", PageComponentContentItemName())));
	}	
	
	public static String PublicationDate(int day){
		SimpleDateFormat formattedDate = new SimpleDateFormat("MM/dd/yyyy");		
	    Calendar cal = Calendar.getInstance();
	    cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) , cal.get(Calendar.DATE));
	    cal.add(Calendar.DATE, -day);		    
	    return formattedDate.format(cal.getTime());
	}
	
	// Switching to Frame for Navigation on Layouts for AutoAboutUs 	
	public static void SwitchToFrame() {
		Driver.switchTo().frame("jqueryModalDialogsFrame");		
		Driver.switchTo().frame("scContentIframeId0");
	}
	
	public static void SwitchToFrame(String frame1, String frame2) throws InterruptedException {		
		Thread.sleep(1000);
		Driver.switchTo().frame(frame1);		
		Driver.switchTo().frame(frame2);		
	}
	
	public static void UrlExternalLinkAndRichTextEditor_Click(WebElement objWebElement) throws InterruptedException{
		objWebElement.click();
		try{
			objWebElement.click();				
		}catch(org.openqa.selenium.NoSuchElementException e){
			//log.error("Frame already Loaded: ");
		}catch(Exception e){
			//log.error("Frame already Loaded: ");
		}		
	}
	
	public static void NavigateToCommonComponentTemplate(String renderingControl) 
	{
		try {
			sitecoreObj.componentsUnderCommon.isDisplayed();
		}
		catch(org.openqa.selenium.NoSuchElementException e){			
			sitecoreObj.commonUnderTemplates.click();
		}
		
		if(renderingControl.equals("Common")){
			try{
				dataSourceObj.commonComponentTemplate.isDisplayed();
			}
			catch(org.openqa.selenium.NoSuchElementException e){
				sitecoreObj.componentsUnderCommon.click();			
			}
		}
		
		if(renderingControl.equals("MetaData")){
			try{
				dataSourceObj.childItemTemplate.isDisplayed();
			}
			catch(org.openqa.selenium.NoSuchElementException e){
				dataSourceObj.MetaDataUndercommonComponentTemplate.click();			
			}
		}
	}
}
