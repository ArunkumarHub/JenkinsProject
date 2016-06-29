package fotf_Testcase;

import org.apache.commons.lang3.exception.ExceptionContext;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import fotf_Config.Basedriver;
import fotf_Datasource.Opr_AboutUsDataSourceForChildItems_DataProvider;
import fotf_Datasource.Opr_AboutUsDataSource_DataProvider;
import fotf_Datasource.Opr_Sitecore_AboutusDatasource;
import fotf_Operations.Opr_AboutUs_AssertElement;
import fotf_Operations.Opr_ContentEditor_AboutUs;
import fotf_Operations.Opr_PageEditor_AboutUs;
import fotf_Operations.Opr_Sitecore_AboutUs;
import fotf_Operations.Opr_Sitecore_AboutUs_Assert;

public class AboutusPage_ContentEditor_TwoItem extends Basedriver{

    //SiteCore Login
	@BeforeMethod
	public static void LoginSitecore(){
		Driver.get("http://10.194.5.65/sitecore/login");
		Opr_Sitecore_AboutUs.loginSitecore();
	}  

	
	
	//Testcase for AboutUs_TwoItems / Side By Side 
	@Test
	public static void AboutUs_TwoItemsSideBySide() throws InterruptedException{
		try{
			log.info("");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 18455 - FOTF: About Us: Control Rendering: TwoItems / Side By Side ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("SideBySide");
			Opr_ContentEditor_AboutUs.createLayout("SideBySide");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("SideBySide", "ContentEditor");
			for(int i=0; i<=5; i++)	{
				if(!(i==0)){
					//log.info("i=="+ i	+	"	j=="+j );
					//Opr_Sitecore_AboutUs.navigateToFOTFcom();
					Opr_AboutUsDataSourceForChildItems_DataProvider.ChildComponentItemImageShape("SideBySide", "ContentEditor", i);
					
					Thread.sleep(5000);
					Opr_AboutUs_AssertElement.VerifyChildComponent_ImageShape("SideBySide", i);
					Driver.switchTo().window(Opr_Sitecore_AboutUs_Assert.GetChildWindow("CHILD")).close();
					Thread.sleep(3000);
					Driver.switchTo().window(Opr_Sitecore_AboutUs_Assert.GetChildWindow("PARENT"));
					Thread.sleep(3000);					
				}
			}
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
		}
	}	
	
	//Testcase for AboutUs_TwoItems / Side By Side Centered
	@Test
	public static void AboutUs_TwoItemsSideBySideCentered() throws InterruptedException{
		try{
			log.info("");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 18459 - FOTF: About Us: Control Rendering: TwoItems / Side By Side Centered ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("SideBySideCentered");
			Opr_ContentEditor_AboutUs.createLayout("SideBySideCentered");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("SideBySideCentered", "ContentEditor");
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
