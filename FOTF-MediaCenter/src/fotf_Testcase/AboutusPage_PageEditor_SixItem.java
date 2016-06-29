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

public class AboutusPage_PageEditor_SixItem extends Basedriver{

	//SiteCore Login
	@BeforeMethod
	public static void LoginSitecore(){
		Driver.get("http://10.194.5.65/sitecore/login");
		Opr_Sitecore_AboutUs.loginSitecore();
	}		
	
	// Testcase for AboutUs_Six Items / Three Columns
	@Test
	public static void AboutUs_SixItemsThreeColumns() throws InterruptedException {
		try{
			log.info("");
			log.info("PAGE EDITOR MODE");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 18500 - FOTF: About Us: Control Rendering: Six Items / Three Columns ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("");
			Opr_PageEditor_AboutUs.createLayout("6Items3Columns");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("6Items3Columns", "PageEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly");
		}
	}	

	// Testcase for AboutUs_Six Items / Six Columns
	@Test
	public static void AboutUs_SixItemsSixColumns() throws InterruptedException {
		try{
			log.info("");
			log.info("PAGE EDITOR MODE");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 18499 - FOTF: About Us: Control Rendering: Six Items / Six Columns ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("6Items6Columns");
			Opr_PageEditor_AboutUs.createLayout("6Items6Columns");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("6Items6Columns", "PageEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly");
		}
	}
	
	// Testcase for AboutUs_Six Items / Six Columns with Text
	@Test
	public static void AboutUs_SixItemsSixColumnsWithText() throws InterruptedException {
		try{
			log.info("");
			log.info("PAGE EDITOR MODE");
			log.info("______________________________________________________________________________________________________");
			log.info("*** TestCase - B-01141 - FOTF: About Us: Control Rendering: Six Items / Six Columns with Text ***");
			log.info("______________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("6Items6ColumnsWithText");
			Opr_PageEditor_AboutUs.createLayout("6Items6ColumnsWithText");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("6Items6ColumnsWithText", "PageEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly");
		}
	}	
	
	// Testcase for AboutUs_Six Items / Two Columns
	@Test
	public static void AboutUs_SixItemsTwoColumns() throws InterruptedException {
		try{
			log.info("");
			log.info("PAGE EDITOR MODE");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 18501 - FOTF: About Us: Control Rendering: Six Items / Two Columns ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("6Items2Columns");
			Opr_PageEditor_AboutUs.createLayout("6Items2Columns");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("6Items2Columns", "PageEditor");
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
