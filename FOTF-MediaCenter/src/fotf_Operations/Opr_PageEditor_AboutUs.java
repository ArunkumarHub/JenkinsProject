package fotf_Operations;

import org.openqa.selenium.interactions.Actions;

import fotf_Config.AboutusCommonClass;
import fotf_Config.Basedriver;
import fotf_Datasource.Opr_Sitecore_AboutusDatasource;
//import fotf_Operations.Opr_Sitecore_AboutUs;
public class Opr_PageEditor_AboutUs extends Basedriver{
	static Opr_AboutUs_AssertElement objAssertAboutUs=new Opr_AboutUs_AssertElement();
	// Navigate to Create Layout for AutoAboutUs 
		public static void createLayout(String renderingControl) throws InterruptedException{
			PageEditorPublishPreview();
			Driver.switchTo().frame("scWebEditRibbon");
			sitecoreObj.pageEditorPresentation.click();
			sitecoreObj.toggleRibbon.click();
			sitecoreObj.pageEditorDetails.click();
			Driver.switchTo().defaultContent();				
			
			objSitecoreOperation.Steps_CreateCommonComponent(renderingControl);
			objSitecoreOperation.Steps_SelectCommonComponent(renderingControl);
			PageEditorSave();
			Thread.sleep(8000);
			PageEditorToPreviewMode();
			
			//log.info("Preview Mode opened for the AboutUs");
		}
		
	// Navigate to Create Layout for AutoAboutUs 
		public static void createCustomInitiativeLayout(String renderingControl) throws InterruptedException{
			PageEditorPublishPreview();
			Driver.switchTo().frame("scWebEditRibbon");
			sitecoreObj.pageEditorPresentation.click();
			sitecoreObj.toggleRibbon.click();
			sitecoreObj.pageEditorDetails.click();
			Driver.switchTo().defaultContent();				
			
			objSitecoreOperation.Steps_CreateCommonComponent(renderingControl);
			objSitecoreOperation.Steps_SelectCommonComponent(renderingControl);
			PageEditorSave();
			Thread.sleep(8000);
			PageEditorToPreviewMode();
			
			//log.info("Preview Mode opened for the AboutUs");
		}
		// Navigate to Create Layout for AutoAboutUs 
		public static void PageEditorToPreviewMode()
		{
			String currentUrl=Driver.getCurrentUrl();
			String previewUrl=currentUrl.replace("edit", "preview");
			Driver.get(previewUrl);
		}
		
		// Navigate to Create Layout for AutoAboutUs 
		public static void PageEditorPublishPreview() throws InterruptedException{
			Thread.sleep(2000);
			sitecoreObj.publishItem.click();
			Thread.sleep(2000);
			//log.info("Clicked on Publish Item");
			sitecoreObj.pageEditorMode.click();
			//log.info("Preview Mode opened for the AboutUs");
			Driver.switchTo().window(objSitecoreOperationAssert.GetChildWindow("CHILD"));
			try{
				if(sitecoreObj.pageEditorskipImage.isEnabled()){
					sitecoreObj.pageEditorskipImage.click();	}
				}catch(org.openqa.selenium.NoSuchElementException e){
					System.out.println(e);
				}catch(Exception e){
					System.out.println(e);
			}			
		}		
		
// Navigate to Create Layout for AutoAboutUs 
	public static void ArticlePageEditor() throws InterruptedException{
		Thread.sleep(2000);
		
		Actions ref=new Actions(Driver);
		ref.contextClick(sitecoreObj_Article.articleCommonComponent).build().perform();
		sitecoreObj.refreshItem.click();
		
		AboutusCommonClass.ArticleComponentContentItem().click();
		PageEditorPublishPreview();
		Driver.switchTo().window(objSitecoreOperationAssert.GetChildWindow("CHILD"));
		Opr_Sitecore_AboutusDatasource.EditArticleOnPageEditor();
		
	}
	

	public static void PageEditorSave()
	{
		Driver.switchTo().frame("scWebEditRibbon");
		sitecoreObj.pageEditorSaveButton.click();
		Driver.switchTo().defaultContent();
	}
}
