package fotf_Datasource;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;

import org.apache.poi.hssf.model.ConvertAnchor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import fotf_Config.AboutusCommonClass;
import fotf_Config.Basedriver;
import fotf_Operations.Opr_AboutUs_AssertElement;
import fotf_Operations.Opr_ContentEditor_AboutUs;
import fotf_Operations.Opr_Sitecore_AboutUs;
import fotf_Operations.Opr_Sitecore_AboutUs_Assert;

public class Opr_AboutUsDataSourceForChildItems_DataProvider extends Basedriver
{	
	static String[] searchArticle = { 
		dataSourceProvider.getProperty("SearchArticle1"), 
		dataSourceProvider.getProperty("SearchArticle2"), 
		dataSourceProvider.getProperty("SearchArticle3")
		};
	
	public static void SetDefaultValueToChildItemHashTable(Hashtable hashTable){
		hashTable.clear();		
		hashTable.put("Image", false);
		hashTable.put("Title", false);
		hashTable.put("ShortDescription", false);
		hashTable.put("MoreLink", false);
		hashTable.put("ItemList", false);
		hashTable.put("ImageShape", false);
	}	
	
	public static void CreateChildItemsWithFolder(String FolderName, String childLevel, String TemplateName) throws InterruptedException{
		Opr_ContentEditor_AboutUs.HomeFolderTemplates();							
		AboutusCommonClass.SwitchToFrame("jqueryModalDialogsFrame", "scContentIframeId0");			
		dataSourceObj.childFolderName.sendKeys(dataSourceProvider.getProperty(FolderName));
		sitecoreObj.okButton.click();
		Driver.switchTo().defaultContent();
		
		sitecoreObj.insertFromTemplate.click();			
		AboutusCommonClass.SwitchToFrame();			
		AboutusCommonClass.NavigateToCommonComponentTemplate("MetaData");
		
		if(TemplateName.equals("CarouselTemplate")){dataSourceObj.carouselItemTemplate.click();	}
		else{dataSourceObj.childItemTemplate.click();	}	
		
		if(TemplateName.equals("ImageAndLinkItem")){dataSourceObj.imageAndLinkItemTemplate.click();	}
		else{dataSourceObj.childItemTemplate.click();	}		
		
		sitecoreObj.itemName.clear();
		sitecoreObj.itemName.sendKeys(dataSourceProvider.getProperty(childLevel)+"1");
		sitecoreObj.insertButton.click();
		Driver.switchTo().defaultContent();	
		
	}
	
	public static void ChildItemDataSource(String renderingDatasource, Hashtable childItemsHashTable) throws InterruptedException
	{
		dataSourceObj.commonComponentContentTab.click();
		
		if(childItemsHashTable.get("Image").equals(true)){
			dataSourceObj.childItemImage.sendKeys(dataSourceProvider.getProperty("ChildItemImage"));
		}
		
		if(childItemsHashTable.get("Title").equals(true)){			
			dataSourceObj.childItemTitle.sendKeys("Child Item 1 - Title");		
		}
		
		if(childItemsHashTable.get("ShortDescription").equals(true)){
			try{
				AboutusCommonClass.UrlExternalLinkAndRichTextEditor_Click(dataSourceObj.commonComponentShowEditor);
				AboutusCommonClass.SwitchToFrame("jqueryModalDialogsFrame", "scContentIframeId0");
				
				if(renderingDatasource.equals("4Items4ColumnsSquare")){					
					dataSourceObj.commonComponentTextEditor.sendKeys(dataSourceProvider.getProperty("ChildItemShortDescription4Items4ColumnsSquare"));
				}else{ dataSourceObj.commonComponentTextEditor.sendKeys(dataSourceProvider.getProperty("ChildItemShortDescription"));}
				
				dataSourceObj.itemTextAccept.click();
				Driver.switchTo().defaultContent();
			}catch(Exception e){
				Driver.switchTo().defaultContent();
				log.error("ChildItem Short Description - " + e.getLocalizedMessage());
			}
		}
		
		if(childItemsHashTable.get("MoreLink").equals(true)){
			try{				
				AboutusCommonClass.UrlExternalLinkAndRichTextEditor_Click(dataSourceObj.childComponentItemMoreLink);
				AboutusCommonClass.SwitchToFrame("jqueryModalDialogsFrame", "scContentIframeId0");
				
				dataSourceObj.moreInfoLinkDesc.sendKeys(dataSourceProvider.getProperty("ChildItemMoreInfoLinkDesc"));
				dataSourceObj.moreInfoLinkURL.sendKeys(dataSourceProvider.getProperty("ChildItemMoreInfoLinkUrl"));
				dataSourceObj.moreInfoLinkOK.click();
				Driver.switchTo().defaultContent();
			}catch(Exception e){
				Driver.switchTo().defaultContent();
				log.error("ChildItem Datasource MoreLink - " + e.getLocalizedMessage());
			}
		}
		
		if(childItemsHashTable.get("ImageShape").equals(true)){
			ChildComponentItemImageShape(renderingDatasource, "DataSource", 0);
		}
		dataSourceObj.saveDataSource.click();
	}
	
	public static void ChildComponentItemImageShape(String renderingDatasource, String mode, int imageShape) 
			throws InterruptedException{		
		if(mode.equals("ContentEditor") || mode.equals("")){
			Driver.findElement(By.xpath("//span[text()='" + renderingDatasource +"_DataSource']/parent::a/following-sibling::div/div/div[2]/div/a/span[text()='ChildItems-1']")).click();
			Driver.findElement(By.xpath("//span[text()='" + renderingDatasource +"_DataSource']/parent::a/following-sibling::div/div/div[2]/div/a/span[text()='ChildItems-1']")).click();
			Thread.sleep(3000);	
		}
		
		WebElement dropDownList1 = dataSourceObj.childComponentItemImageShape;
		Select drp1 = drp1= new Select(dropDownList1);					
		drp1.selectByIndex(imageShape);
		
		if(mode.equals("ContentEditor") || mode.equals("")){
			Opr_ContentEditor_AboutUs.HomeSave();
			Thread.sleep(3000);
		}
			
		if(mode.equals("ContentEditor")){			
			AboutusCommonClass.PageComponentContentItem().click();
			AboutusCommonClass.PageComponentContentItem().click();
			Thread.sleep(5000);
			
			Opr_ContentEditor_AboutUs.PublishPreview();
			Thread.sleep(5000);
			Driver.switchTo().window(Opr_Sitecore_AboutUs_Assert.GetChildWindow("CHILD"));
		}
	}
	
	public static void DuplicatingChildItemDataSource(String renderingDatasource) throws InterruptedException
	{
		int numOfChildItemsToDuplicate = 3;
		switch(renderingDatasource)
		{			
			//OneItem			
			case "LeftImageList":				
			case "RightImageList":				
			case "IFrameRightImageList": break;
			case "SideBySide":				
			case "SideBySideCentered": numOfChildItemsToDuplicate = 3; break;
			case "3Items3Columns": 					
			case "StackedImageLeft": 				
			case "3ColumnsLinksOverlaid": 
			case "ShowHideBasic":
			case "ShowHideImageLeft": 
			case "ShowHideArticleGroupByYear":
			case "HeaderImageRight":
			case "HeaderVideoRight": numOfChildItemsToDuplicate = 5; break;
			case "4Items4ColumnsRectangle": 
			case "4ItemsWithInset":				
			case "4Items2Columns": 
			case "4Items4ColumnsSquare":
			case "6Items2Columns": numOfChildItemsToDuplicate = 6; break;
			case "5Column": 
			case "2x3": 
			case "6Items6Columns": numOfChildItemsToDuplicate = 7; break;
			case "6Items6ColumnsWithText": 
			case "6Items3Columns":
			case "TimeLineBasic": numOfChildItemsToDuplicate = 8; break;
			default: break;
		}
		
		for(int i = 2; i <= numOfChildItemsToDuplicate; i++){				
			Thread.sleep(2000);
			Actions ref = new Actions(Driver);
			ref.contextClick(dataSourceObj.childItems_1).build().perform();
			dataSourceObj.duplicateChildItem.click();
			Thread.sleep(3000);
			AboutusCommonClass.SwitchToFrame();
			
			dataSourceObj.childFolderName.sendKeys(dataSourceProvider.getProperty("ChildItem") + i);
			sitecoreObj.okButton.click();
			Driver.switchTo().defaultContent();
		}			
	}
	
	
	public static void SelectChildItem_RenderingDatasource(String renderingDatasource) throws InterruptedException
	{		
		Driver.findElement(By.xpath("//span[text()='" + renderingDatasource+"_DataSource" +"']")).click();
		Thread.sleep(3000);
		int childItemsToDisplay = 2;		
		switch(renderingDatasource)
		{			
			//OneItem			
			case "LeftImageList":				
			case "RightImageList":				
			case "IFrameRightImageList": break;
			case "SideBySide":				
			case "SideBySideCentered": 	childItemsToDisplay = 2; break;
			case "3Items3Columns": 					
			case "StackedImageLeft": 				
			case "3ColumnsLinksOverlaid": 
			case "ShowHideBasic": 
			case "ShowHideImageLeft":
			case "ShowHideArticleGroupByYear":
			case "HeaderImageRight": 
			case "HeaderVideoRight": childItemsToDisplay = 4; break;
			case "4Items4ColumnsRectangle": 
			case "4ItemsWithInset":				
			case "4Items2Columns": 
			case "4Items4ColumnsSquare": childItemsToDisplay = 5; break;
			case "5Column": 
			case "2x3": 
			case "6Items2Columns":
			case "6Items6Columns": childItemsToDisplay = 6; break;
			case "6Items6ColumnsWithText": 
			case "6Items3Columns": 
			case "TimeLineBasic": childItemsToDisplay = 7; break;
			default: break;
		}
		
		for(int i = 1; i <= childItemsToDisplay; i++){
			Actions ref = new Actions(Driver);
			WebElement item = Driver.findElement(By.xpath("//option[text()='" + dataSourceProvider.getProperty("ChildItem")+Integer.toString(i) +"']"));
			ref.doubleClick(item).build().perform();
			Thread.sleep(2000);
		}
		dataSourceObj.saveDataSource.click();
	}
	
	
	// Select date for all the Marriage Article under three components for AutoAboutUs 	
	public static void ClonedArticlePublicationDate(String renderingDatasource, int articleStartPos, int articleCount) throws InterruptedException 
	{	
		String clonedArticle="//span[text()='" + renderingDatasource + "_DataSource']/parent::a/following-sibling::div/div[*]";
		for(int i=1; i<= articleCount; i++){
			Thread.sleep(2000);
			Driver.findElement(By.xpath(clonedArticle.replace("*", Integer.toString(i)))).click();
			Thread.sleep(3000);
			
			if(i <= 3 && renderingDatasource.equals("marriage")){
				AboutusCommonClass.clonedRecentArticleTitle[i] = dataSourceObj.recentArticleTitleText.getAttribute("value");
			}
			
			dataSourceObj.clearPublicationDate.click();
			dataSourceObj.publicationDate.sendKeys(AboutusCommonClass.PublicationDate(articleStartPos + i- 2));
			IsImageNull();
			Opr_ContentEditor_AboutUs.HomeSave();
		}
	}	
	
	public static void IsImageNull(){
		WebElement articleImgElement=Driver.findElement(By.xpath("//div[contains(text(),'Image:')]/following-sibling::div[2]/input"));
		try{
		String articleImg=articleImgElement.getAttribute("value");
		}catch(Exception e)
		{	articleImgElement.sendKeys(dataSourceProvider.getProperty("Image"));	}
		
	}
}
