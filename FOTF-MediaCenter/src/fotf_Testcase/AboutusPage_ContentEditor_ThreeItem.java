package fotf_Testcase;

import org.apache.commons.lang3.exception.ExceptionContext;
import org.openqa.selenium.Alert;
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

public class AboutusPage_ContentEditor_ThreeItem extends Basedriver{

    //SiteCore Login
	@BeforeMethod
	public static void LoginSitecore(){
		Driver.get("http://10.194.5.65/sitecore/login");
		Opr_Sitecore_AboutUs.loginSitecore();
	}

	// Testcase for AboutUs_Three Items / Three Columns 
	@Test
	public static void AboutUs_ThreeItemsThreeColumns() throws InterruptedException {
		try{
			log.info("");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 18460 - FOTF: About Us: Control Rendering: Three Items / Three Columns ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("3Items3Columns");
			Opr_ContentEditor_AboutUs.createLayout("3Items3Columns");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("3Items3Columns", "ContentEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
		}
	}	
	
	// Testcase for AboutUs_Three Items / Stacked Image Left
	@Test
	public static void AboutUs_ThreeItemsStackedImageLeft() throws InterruptedException {
		try{
			log.info("");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 18461 - FOTF: About Us: Control Rendering: Three Items / Stacked Image Left ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("StackedImageLeft");
			Opr_ContentEditor_AboutUs.createLayout("StackedImageLeft");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("StackedImageLeft", "ContentEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
		}
	}	
	
	// Testcase for AboutUs_Three Items / Three Columns Links Overlaid
	@Test
	public static void AboutUs_ThreeItemsThreeColumnsLinksOverlaid() throws InterruptedException {
		try{
			log.info("");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 18462 - FOTF: About Us: Control Rendering: Three Items / Three Columns Links Overlaid ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("3ColumnsLinksOverlaid");
			Opr_ContentEditor_AboutUs.createLayout("3ColumnsLinksOverlaid");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("3ColumnsLinksOverlaid", "ContentEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
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
