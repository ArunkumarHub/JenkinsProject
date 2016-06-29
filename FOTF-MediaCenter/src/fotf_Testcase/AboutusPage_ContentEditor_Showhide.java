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

public class AboutusPage_ContentEditor_Showhide extends Basedriver{

    //SiteCore Login
	@BeforeMethod
	public static void LoginSitecore(){
		Driver.get("http://10.194.5.65/sitecore/login");
		Opr_Sitecore_AboutUs.loginSitecore();
	}

    
	
	//Testcase for AboutUs_ShowHideImageLeft
	@Test
	public static void AboutUs_ShowHideImageLeft() throws InterruptedException{
		try{
			log.info("");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 18394 - FOTF: About Us: Rendering: ShowHide Image Left ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("ShowHideImageLeft");
			Opr_ContentEditor_AboutUs.createLayout("ShowHideImageLeft");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("ShowHideImageLeft", "ContentEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
		}
	}
	
	//Testcase for AboutUs_ShowHideBasic
	@Test
	public static void AboutUs_ShowHideBasic() throws InterruptedException{
		try{
			log.info("");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 17830 - FOTF: About Us: Rendering: ShowHide Basic ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("ShowHideBasic");
			Opr_ContentEditor_AboutUs.createLayout("ShowHideBasic");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("ShowHideBasic", "ContentEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
		}
	}	
	
	//Testcase for AboutUs_ShowHideBasic Group by Year for article datasource
		@Test
		public static void AboutUs_ShowHideBasicGroupByyear_Article() throws InterruptedException{
			try{
				log.info("");
				log.info("__________________________________________________________________________________________________");
				log.info("*** TestCase - PBI: B-01270 - FOTF: About Us: Rendering: ShowHide Basic Grouping by Year for article datasource ***");
				log.info("__________________________________________________________________________________________________");
				Opr_Sitecore_AboutUs.navigateToFOTFcom();
				Opr_Sitecore_AboutUs.createAboutUs();
				Opr_Sitecore_AboutusDatasource.AboutUsDatasource("ShowHideArticleGroupByYear");
				Opr_ContentEditor_AboutUs.createLayout("ShowHideBasic");
				Opr_Sitecore_AboutUs_Assert.AssertAboutus("ShowHideArticleGroupByYear", "ContentEditor");
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
