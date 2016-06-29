package fotf_Testcase;

import org.apache.commons.lang3.exception.ExceptionContext;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import fotf_Config.Basedriver;
import fotf_Datasource.Opr_AboutUsDataSource_DataProvider;
import fotf_Datasource.Opr_Sitecore_AboutusDatasource;
import fotf_Operations.Opr_AboutUs_AssertElement_FourItem;
import fotf_Operations.Opr_ContentEditor_AboutUs;
import fotf_Operations.Opr_PageEditor_AboutUs;
import fotf_Operations.Opr_Sitecore_AboutUs;
import fotf_Operations.Opr_Sitecore_AboutUs_Assert;

public class AboutusPage_ContentEditor_FourItem extends Basedriver{

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
			log.info("______________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 18502 - FOTF: About Us: Control Rendering: Four Items / Four Columns Rectangle ***");
			log.info("______________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("4Items4ColumnsRectangle");
			Opr_ContentEditor_AboutUs.createLayout("4Items4ColumnsRectangle");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("4Items4ColumnsRectangle", "ContentEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
		}
	}
	
	// Testcase for AboutUs_Four Items / With Inset
	@Test
	public static void AboutUs_FourItemsWithInset() throws InterruptedException {
		try{
			log.info("");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 18503 - FOTF: About Us: Control Rendering: Four Items / With Inset ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();			
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("4ItemsWithInset");
			Opr_ContentEditor_AboutUs.createLayout("4ItemsWithInset");	
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("4ItemsWithInset", "ContentEditor");	
			
			//log.info("i==1,	j==1");
			
			for(int i=1; i<=5; i++)	{
				for(int j=1; j<=2; j++){	
					if(!(i==1 && j==1)){
						//log.info("i=="+ i	+	"	j=="+j );
						//Opr_Sitecore_AboutUs.navigateToFOTFcom();
						Opr_AboutUsDataSource_DataProvider.CommonComponentInsetImageShapeWithPosition("4ItemsWithInset", "ContentEditor", i, j);	
						
						Thread.sleep(5000);
						Opr_AboutUs_AssertElement_FourItem.VerifyFourItemsWithInset_ImageShapeWithImagePosition(i, j);
						Driver.switchTo().window(Opr_Sitecore_AboutUs_Assert.GetChildWindow("CHILD")).close();
						Thread.sleep(3000);
						Driver.switchTo().window(Opr_Sitecore_AboutUs_Assert.GetChildWindow("PARENT"));
						Thread.sleep(3000);
					}
				}
			}
			
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
		}
	}
	
	// Testcase for AboutUs_Four Items / Two Columns
	@Test
	public static void AboutUs_FourItemsTwoColumns() throws InterruptedException {
		try{
			log.info("");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 18504 - FOTF: About Us: Control Rendering: Four Items / Two Columns ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("4Items2Columns");
			Opr_ContentEditor_AboutUs.createLayout("4Items2Columns");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("4Items2Columns", "ContentEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
		}
	}
	
	// Testcase for AboutUs_Four Items / Four Columns Square
	@Test
	public static void AboutUs_FourItemsFourColumnsSquare() throws InterruptedException {
		try{
			log.info("");
			log.info("______________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 18807 - FOTF: About Us: Control Rendering: Four Items / Four Columns Square ***");
			log.info("______________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("4Items4ColumnsSquare");
			Opr_ContentEditor_AboutUs.createLayout("4Items4ColumnsSquare");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("4Items4ColumnsSquare", "ContentEditor");
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
