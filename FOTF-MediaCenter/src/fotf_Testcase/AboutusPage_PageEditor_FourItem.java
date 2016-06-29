package fotf_Testcase;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import fotf_Config.Basedriver;
import fotf_Datasource.Opr_Sitecore_AboutusDatasource;
import fotf_Operations.Opr_ContentEditor_AboutUs;
import fotf_Operations.Opr_PageEditor_AboutUs;
import fotf_Operations.Opr_Sitecore_AboutUs;
import fotf_Operations.Opr_Sitecore_AboutUs_Assert;

public class AboutusPage_PageEditor_FourItem extends Basedriver{

	//SiteCore Login
	@BeforeMethod
	public static void LoginSitecore(){
		Driver.get("http://10.194.5.65/sitecore/login");
		Opr_Sitecore_AboutUs.loginSitecore();
	}		
	
	// Testcase for AboutUs_Four Items / Four Columns Rectangle
	@Test
	public static void AboutUs_FourItemsFourColumnsRectangle() throws InterruptedException {
		try{
			log.info("");
			log.info("PAGE EDITOR MODE");
			log.info("______________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 18502 - FOTF: About Us: Control Rendering: Four Items / Four Columns Rectangle ***");
			log.info("______________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("4Items4ColumnsRectangle");
			Opr_PageEditor_AboutUs.createLayout("4Items4ColumnsRectangle");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("4Items4ColumnsRectangle", "PageEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly");
		}
	}	
	
	// Testcase for AboutUs_Four Items / With Inset
	@Test
	public static void AboutUs_FourItemsWithInset() throws InterruptedException {
		try{
			log.info("");
			log.info("PAGE EDITOR MODE");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 18503 - FOTF: About Us: Control Rendering: Four Items / With Inset ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("4ItemsWithInset");
			Opr_PageEditor_AboutUs.createLayout("4ItemsWithInset");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("4ItemsWithInset", "PageEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly");
		}
	}	
		
	// Testcase for AboutUs_Four Items / Two Columns
	@Test
	public static void AboutUs_FourItemsTwoColumns() throws InterruptedException {
		try{
			log.info("");
			log.info("PAGE EDITOR MODE");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 18504 - FOTF: About Us: Control Rendering: Four Items / Two Columns ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("4Items2Columns");
			Opr_PageEditor_AboutUs.createLayout("4Items2Columns");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("4Items2Columns", "PageEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly");
		}
	}
	
	// Testcase for AboutUs_Four Items / Four Columns Square
	@Test
	public static void AboutUs_FourItemsFourColumnsSquare() throws InterruptedException {
		try{
			log.info("");
			log.info("PAGE EDITOR MODE");
			log.info("______________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 18807 - FOTF: About Us: Control Rendering: Four Items / Four Columns Square ***");
			log.info("______________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("4Items4ColumnsSquare");
			Opr_PageEditor_AboutUs.createLayout("4Items4ColumnsSquare");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("4Items4ColumnsSquare", "PageEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly");
		}
	}
	
	
	// Logout Sitecore
	@AfterMethod
	public static void LogoutSitecore() throws InterruptedException{
		Thread.sleep(2000);
		sitecoreObj.systemMenu.click();
		Thread.sleep(2000);
		sitecoreObj.logOut.click();
	}
}
