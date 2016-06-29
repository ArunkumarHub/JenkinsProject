package fotf_Datasource;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import fotf_Config.AboutusCommonClass;
import fotf_Config.Basedriver;
import fotf_Operations.Opr_ContentEditor_AboutUs;
import fotf_Operations.Opr_PageEditor_AboutUs;
import fotf_Operations.Opr_Sitecore_AboutUs;

public class Opr_Sitecore_AboutusDatasource extends Basedriver{
	public static String dataSourcePath="";
	static Hashtable hashTable = new Hashtable();
	private static void SetDefaultValueToHashTable(){
		hashTable.clear();		
		hashTable.put("ItemText", false);
	    hashTable.put("Image", false);
	    hashTable.put("MoreInfoLink", false);
	    hashTable.put("ChildrenItems", false);
	    hashTable.put("IFrame", false);
	    hashTable.put("VideoItems", false);
	    hashTable.put("InsetText", false);
	    hashTable.put("InsetImage", false);
	    hashTable.put("InsetImageShape", false);
	    hashTable.put("InsetImagePosition", false);
	    hashTable.put("RecentArticlesOverride", false);
	    hashTable.put("IsFeatured", false);	 
	    hashTable.put("CarouselItems", false);
	    hashTable.put("ArticleComponent", false);
	    hashTable.put("ArticlePubDate", false);
	    hashTable.put("ArticleClone", false);
		hashTable.put("ImageShape", false);
	    hashTable.put("ImageSize", false);
	}    
    
	public static void AboutUsDatasource(String renderingDatasource) throws InterruptedException{	    
		SetDefaultValueToHashTable();
		
		Opr_ContentEditor_AboutUs.HomeInsertTemplates();
		Driver.switchTo().frame("jqueryModalDialogsFrame");
		Driver.switchTo().frame("scContentIframeId0");
		
		AboutusCommonClass.NavigateToCommonComponentTemplate("Common");
		
		dataSourceObj.commonComponentTemplate.click();
		sitecoreObj.itemName.clear();
		
		switch(renderingDatasource)
		{			
			//OneItem	
			case "ImageRight": 							
			case "ImageLeft":
				hashTable.replace("ItemText", true);
				hashTable.replace("Image", true);
				hashTable.replace("ImageShape", true);
				hashTable.replace("ImageSize", true);
				break;
			case "ButtonRight": 				
			case "ButtonLeft":				
			case "ButtonBottom":
				hashTable.replace("ItemText", true);
				hashTable.replace("Image", true);
				hashTable.replace("MoreInfoLink", true);
				break;
			case "LeftImageList":				
			case "RightImageList":	
				hashTable.replace("ItemText", true);
				hashTable.replace("Image", true);
				hashTable.replace("ChildrenItems", true);
				//hashTable.replace("RecentArticlesOverride", true);
				break;
			case "IFrameRightImageList":
				hashTable.replace("ItemText", true);
				hashTable.replace("Image", true);
				hashTable.replace("ChildrenItems", true);
				hashTable.replace("IFrame", true);
				//hashTable.replace("RecentArticlesOverride", true);
				break;
			case "SideBySide":				
			case "SideBySideCentered": 	
				hashTable.replace("ItemText", true);
				hashTable.replace("Image", true);
				hashTable.replace("ChildrenItems", true);
				//hashTable.replace("RecentArticlesOverride", true);
				break;
			case "3Items3Columns":							
			case "StackedImageLeft":
			case "3ColumnsLinksOverlaid": 
				hashTable.replace("ChildrenItems", true);
				//hashTable.replace("RecentArticlesOverride", true);
				break;			
			case "4Items4ColumnsRectangle": 
				hashTable.replace("ItemText", true);
				hashTable.replace("ChildrenItems", true);
				//hashTable.replace("RecentArticlesOverride", true);
				break;
			case "4ItemsWithInset": 
				hashTable.replace("ItemText", true);
				hashTable.replace("Image", true);
				hashTable.replace("InsetText", true);
				hashTable.replace("InsetImage", true);
				hashTable.replace("InsetImageShape", true);
				hashTable.replace("InsetImagePosition", true);
				hashTable.replace("ChildrenItems", true);
				//hashTable.replace("RecentArticlesOverride", true);
				break;
			case "4Items2Columns": 
			case "4Items4ColumnsSquare": 
				hashTable.replace("ChildrenItems", true);
				//hashTable.replace("RecentArticlesOverride", true);
				break;
			case "5Column":
			case "2x3":
				hashTable.replace("ItemText", true);
				hashTable.replace("Image", true);
				hashTable.replace("ChildrenItems", true);
				//hashTable.replace("RecentArticlesOverride", true);
				break;
			case "6Items3Columns": 
			case "6Items6Columns":
			case "6Items6ColumnsWithText":
				hashTable.replace("ChildrenItems", true);
				//hashTable.replace("RecentArticlesOverride", true);
				break;
			case "6Items2Columns": 
				hashTable.replace("ItemText", true);
				hashTable.replace("ChildrenItems", true);
				//hashTable.replace("RecentArticlesOverride", true);
				break;
			case "HeaderImageLeft":
			case "HeaderImageTop":
				hashTable.replace("ItemText", true);
				hashTable.replace("Image", true);
				//hashTable.replace("RecentArticlesOverride", true);
				break;
			case "HeaderImageRight":
				hashTable.replace("ItemText", true);
				hashTable.replace("Image", true);
				hashTable.replace("ChildrenItems", true);
				//hashTable.replace("RecentArticlesOverride", true);
				break;
			case "HeaderVideoRight":
				hashTable.replace("ItemText", true);
				hashTable.replace("VideoItems", true);
				hashTable.replace("ChildrenItems", true);
				//hashTable.replace("RecentArticlesOverride", true);
				break;
			case "HeaderImageCarousel":
				hashTable.replace("ItemText", true);
				hashTable.replace("CarouselItems", true);
				//hashTable.replace("RecentArticlesOverride", true);
				break;
			case "Article":	
				hashTable.replace("ArticleComponent", true);
				break;
			case "ArticlePubDate": 
				hashTable.replace("ArticlePubDate", true);
				break;
			case "MergeArticleAndArticle":
				hashTable.replace("ChildrenItems", true);
				break;
			case "ArticleIsFeatured":
				hashTable.replace("IsFeatured", true);
				break;
			case "marriage":				
			case "parenting": 
				hashTable.replace("ArticleClone", true);			
				break;
			case "ShowHideBasic":
			case "TimeLineBasic":
				hashTable.replace("ChildrenItems", true);
				break;
			case "ShowHideArticleGroupByYear":
				hashTable.replace("ArticleClone", true);
				break;
			case "ShowHideImageLeft":
				hashTable.replace("ItemText", true);
				hashTable.replace("Image", true);
				hashTable.replace("ChildrenItems", true);
				break;
			case "InitiativeLeftHeroImage":
			case "InitiativeRightHeroImage":
				hashTable.replace("ItemText", true);
				hashTable.replace("Image", true);
				hashTable.replace("MoreInfoLink", true);
			break;
			case "InitiativeLeftHeroVideo":
			case "InitiativeRightHeroVideo":
				hashTable.replace("ItemText", true);
				hashTable.replace("VideoItems", true);
				hashTable.replace("MoreInfoLink", true);
			break;
			//case "PageComponentHeader": break;			
			default:
				break;			
		}		
			
		Opr_AboutUsDataSource_DataProvider.CommonComponentDataSource(renderingDatasource, hashTable);
		if(renderingDatasource.startsWith("Initiative")){
			dataSourcePath = "/sitecore/content/FOTF/" + AboutusCommonClass.InitiativeComponentContentItemName()  + "/" + renderingDatasource + "_DataSource";
		}else{
		dataSourcePath = "/sitecore/content/FOTF/" + AboutusCommonClass.PageComponentContentItemName()  + "/" + renderingDatasource + "_DataSource";
		}
		
	}
	
	//Edit the Article on the Page Editor mode for Article merge Page Component under FOTF.com content of the Sitecore	
		public static void EditArticleOnPageEditor() throws InterruptedException 
		{
			sitecoreObj_Article.aboutusArticleInsertLinkBreadCrumbs.click();
			sitecoreObj.insertLink.click();
			SwitchToFrame();
			sitecoreObj.externalLink.click();
			sitecoreObj.externalUrlText.sendKeys(dataSourceProvider.getProperty("ArticleExternalUrlText"));
			sitecoreObj.externalUrl.sendKeys(dataSourceProvider.getProperty("ArticleExternalUrl"));
			sitecoreObj.insertButton.click();
			Driver.switchTo().defaultContent();
			Thread.sleep(9999);
			
			sitecoreObj_Article.aboutusArticleSetTitle.click();
			sitecoreObj_Article.aboutusArticleSetTitle.sendKeys(dataSourceProvider.getProperty("ArticleSetTitle"));
			
			sitecoreObj_Article.aboutusArticleClickDesc.click();
			Thread.sleep(2000);
			sitecoreObj_Article.aboutusArticleEditDesc.click();
			SwitchToFrame();
			Driver.switchTo().frame("Editor_contentIframe");
			sitecoreObj_Article.aboutusArticleRichTextEditor.clear();
			sitecoreObj_Article.aboutusArticleRichTextEditor.sendKeys(dataSourceProvider.getProperty("ArticleRichText"));
			Driver.switchTo().defaultContent();
			SwitchToFrame();
			sitecoreObj_Article.aboutusArticleRichTextEditorAccept.click();
			Driver.switchTo().defaultContent();
			
			Opr_PageEditor_AboutUs.PageEditorSave();
			Opr_PageEditor_AboutUs.PageEditorToPreviewMode();			
		}
		public static void SwitchToFrame(){
			Driver.switchTo().frame("jqueryModalDialogsFrame");
			Driver.switchTo().frame("scContentIframeId0");
		}
	//Navigate to Create AutoAboutUs for Page Component under FOTF.com content of the Sitecore	
	public static void AboutUsPageComponentSiblings(String renderingDatasource) throws InterruptedException
	{
		String siblingPageComponent = "//span[text()='" + AboutusCommonClass.PageComponentContentItemName() 
				+ "']/parent::a/following-sibling::div/div/a/span[text()='Page Component_1']";
		for (int i=1; i<=6; i++){
			/*if(i > 1){
				Thread.sleep(4000);
				Driver.findElement(By.xpath(dataSourceObj.AutoAboutusTreeView)).click();
				Thread.sleep(4000);
			}*/
			
			sitecoreObj.insertFromTemplate.click();
			Driver.switchTo().frame("jqueryModalDialogsFrame");
			Driver.switchTo().frame("scContentIframeId0");
				
			Opr_Sitecore_AboutUs.NavigateToPageComponentTemplate();
			
			sitecoreObj.pageComponent.click();
			sitecoreObj.itemName.clear();
			sitecoreObj.itemName.sendKeys("Page Component_" + i);
			sitecoreObj.insertButton.click();
			Driver.switchTo().defaultContent();
			// log.info("Page Component has created called 'Page Component_' ");
			if(i==2){
				Driver.findElement(By.xpath("//span[text()='Page Component_" + i +"']")).click();
			}else{
			Driver.findElement(By.xpath(siblingPageComponent.replace("1", Integer.toString(i)))).click();
			Thread.sleep(1000);
			}
			//dataSourceObj.commonComponentContentTab.click();	
			dataSourceObj.pageComponentTitle.sendKeys("Page Component_" + i);
			Opr_ContentEditor_AboutUs.HomeSave();
			if(i!=1){
				Driver.findElement(By.xpath(dataSourceObj.AutoAboutusTreeView)).click();
				//AboutusCommonClass.PageComponentContentItem().click();
			}
						
		}
		
		Driver.findElement(By.xpath(siblingPageComponent)).click();
		Thread.sleep(1000);
		
		//dataSourceObj.commonComponentContentTab.click();	
		//Selecting Secondary Menu		
		for(int i=1; i<=5; i++){
			Actions SecondaryMenuItems = new Actions(Driver);
			SecondaryMenuItems.doubleClick(dataSourceObj.pageComponentOption1).build().perform();
			Thread.sleep(1000);			
		}		
		Opr_ContentEditor_AboutUs.HomeSave();
	}	
	
	
	public static void ArticleClone(String renderingDatasource, int articleStartPos, int articleCount) throws InterruptedException{
		articleCount = (articleCount == 1) ? articleCount : (articleStartPos + articleCount);		
		for(int i=articleStartPos; i<= articleCount; i++)
		{
			navigateToContentSourceArticle();
			Thread.sleep(1000);
			Driver.findElement(By.xpath(dataSourceObj.ArticleCloneItem_Par1 + i + dataSourceObj.ArticleCloneItem_Par2)).click();
			
			dataSourceObj.ConfigureMenu.click();
			dataSourceObj.CloneButton.click();
			Driver.switchTo().frame("jqueryModalDialogsFrame");		
			Driver.switchTo().frame("scContentIframeId0");
			navigateToAutoAboutus(renderingDatasource + "_DataSource");
			sitecoreObj.insertButton.click();
			Thread.sleep(3000);
			Driver.switchTo().defaultContent();
		}
		
	}
	
	// Navigate to Auto-aboutus content of the Sitecore for Cloning
		public static void navigateToAutoAboutus(String renderingDatasource) throws InterruptedException{
			// Verify The "Content" is Displayed or not under the Sitecore content
			try{
				dataSourceObj.ContentTreeView.isDisplayed();
			}catch(org.openqa.selenium.NoSuchElementException e){
				dataSourceObj.SitecoreTreeView.click();
			}
			
			try{
				dataSourceObj.FOTFComTreeView.isDisplayed();
			}catch(org.openqa.selenium.NoSuchElementException e){
				dataSourceObj.ContentTreeView.click();
			}
			
			try{				
				Driver.findElement(By.xpath(dataSourceObj.AutoAboutusTreeView)).isDisplayed();
			}catch(org.openqa.selenium.NoSuchElementException e){
				dataSourceObj.FOTFComTreeView.click();
			}
			
			try{
				Driver.findElement(By.xpath("//span[text()='" + renderingDatasource +"']")).isDisplayed();
			}catch(org.openqa.selenium.NoSuchElementException e){
				//dataSourceObj.AutoAboutUsExtract.click();
				Driver.findElement(By.xpath(dataSourceObj.AutoAboutUsExtract)).click();
			}
							
			Driver.findElement(By.xpath("//span[text()='" + renderingDatasource +"']")).click();
			Thread.sleep(3000);		
			
		}
	
	// Navigate to FOTF content of the Sitecore
		public static void navigateToContentSourceArticle() throws InterruptedException{

			try {
				dataSourceObj.ArticleUnderContentSource.isDisplayed();
			}
			catch(org.openqa.selenium.NoSuchElementException e){			
				dataSourceObj.ContentSource.click();
			}		
			
			try {
				dataSourceObj.Article2014.isDisplayed();
			}
			catch(org.openqa.selenium.NoSuchElementException e){			
				dataSourceObj.ArticleUnderContentSource.click();
			}	
			
			try {
				dataSourceObj.Article2014_10.isDisplayed();
			}
			catch(org.openqa.selenium.NoSuchElementException e){			
				dataSourceObj.Article2014.click();
			}			
			
			try {
				dataSourceObj.Article2014_10_22.isDisplayed();
			}
			catch(org.openqa.selenium.NoSuchElementException e){			
				dataSourceObj.Article2014_10.click();
			}			
			
			try {
				dataSourceObj.Article2014_10_22_15.isDisplayed();
			}
			catch(org.openqa.selenium.NoSuchElementException e){			
				dataSourceObj.Article2014_10_22.click();
			}
						
			try {
				dataSourceObj.Article2014_10_22_15_12.isDisplayed();
			}
			catch(org.openqa.selenium.NoSuchElementException e){			
				dataSourceObj.Article2014_10_22_15.click();
			}	
			
			try {
				Driver.findElement(By.xpath(dataSourceObj.ArticleCloneItem_Par1 + 1 + dataSourceObj.ArticleCloneItem_Par2)).isDisplayed();
			}
			catch(org.openqa.selenium.NoSuchElementException e){			
				dataSourceObj.Article2014_10_22_15_12.click();
				Thread.sleep(20000);
			}			
		}
	
}
