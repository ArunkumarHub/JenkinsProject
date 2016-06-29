package fotf_Operations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import fotf_Config.AboutusCommonClass;
import fotf_Config.Basedriver;

public class Opr_ContentEditor_AboutUs extends Basedriver{
	// Navigate to Create Layout for AutoAboutUs 
		public static void createLayout(String renderingControl) throws InterruptedException{
			AboutusCommonClass.PageComponentContentItem().click();
			AboutusCommonClass.PageComponentContentItem().click();
			PresentationDetail();
			objSitecoreOperation.Steps_CreateCommonComponent(renderingControl);
			objSitecoreOperation.Steps_SelectCommonComponent(renderingControl);
			AboutusCommonClass.PageComponentContentItem().click();
			Thread.sleep(2000);
			//log.info("Back to Auto AboutUs");
			PublishPreview();
		}	
		
	// Navigate to Create Layout for AutoAboutUs 
			public static void createCustomInitiativeLayout(String renderingControl) throws InterruptedException{
				AboutusCommonClass.InitiativeComponentContentItem().click();
				AboutusCommonClass.InitiativeComponentContentItem().click();
				PresentationDetail();
				objSitecoreOperation.Steps_CreateCommonComponent(renderingControl);
				objSitecoreOperation.Steps_SelectCommonComponent(renderingControl);
				AboutusCommonClass.InitiativeComponentContentItem().click();
				Thread.sleep(2000);
				//log.info("Back to Auto AboutUs");
				PublishPreview();
			}
		public static void PresentationDetail() throws InterruptedException{		
			Thread.sleep(2000);
			sitecoreObj.presentation.click();
			Thread.sleep(2000);
			sitecoreObj.details.click();
		}
		
		
		// Navigate to Create Layout for AutoAboutUs 
		public static void PublishPreview() throws InterruptedException{
			sitecoreObj.publishItem.click();
			Thread.sleep(2000);
			//log.info("Clicked on Publish Item");
			sitecoreObj.previewMode.click();
			//log.info("Preview Mode opened for the AboutUs");
		}
		
		public static void HomeSave() throws InterruptedException{
			dataSourceObj.homeMenuStrip.click();
			Thread.sleep(1000);
			dataSourceObj.saveDataSource.click();
			Thread.sleep(2000);
		}
		
		public static void HomeInsertTemplates() throws InterruptedException{
			dataSourceObj.homeMenuStrip.click();
			Thread.sleep(1000);
			sitecoreObj.insertFromTemplate.click();
			Thread.sleep(2000);
		}
		
		public static void HomeFolderTemplates() throws InterruptedException{
			dataSourceObj.homeMenuStrip.click();
			Thread.sleep(1000);
			dataSourceObj.createFolder.click();
			Thread.sleep(3000);
		}
		
		public static void RefreshItem(WebElement webElement) throws InterruptedException{
			Thread.sleep(2000);			
			Actions ref=new Actions(Driver);
			ref.contextClick(webElement).build().perform();
			sitecoreObj.refreshItem.click();
			Thread.sleep(2000);
		}
		
		public static void DoubleClickItem(WebElement webElement) throws InterruptedException{
			Thread.sleep(2000);			
			Actions ref=new Actions(Driver);
			ref.doubleClick(webElement).build().perform();
			Thread.sleep(2000);
		}
		
}
