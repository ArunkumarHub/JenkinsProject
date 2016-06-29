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

public class Opr_AboutUsDataSource_DataProvider extends Basedriver
{	
	static Hashtable childItemHashTable = new Hashtable();
	static Hashtable carouselItemHashTable = new Hashtable();
	public static String getClonedArticleText;
	public static void CommonComponentDataSource(String renderingDatasource, Hashtable hashTable)throws InterruptedException{		
		sitecoreObj.itemName.sendKeys(renderingDatasource+"_DataSource");
		sitecoreObj.insertButton.click();
		Driver.switchTo().defaultContent();
		
		dataSourceObj.commonComponentContentTab.click();		
		dataSourceObj.commonComponentTitle.sendKeys(renderingDatasource + " - Title");		
		
		if(hashTable.get("ItemText").equals(true)){
			AboutusCommonClass.UrlExternalLinkAndRichTextEditor_Click(dataSourceObj.commonComponentShowEditor);
			AboutusCommonClass.SwitchToFrame("jqueryModalDialogsFrame", "scContentIframeId0");
			
			dataSourceObj.commonComponentTextEditor.sendKeys(dataSourceProvider.getProperty("ItemText"));
			dataSourceObj.itemTextAccept.click();
			Driver.switchTo().defaultContent();
		}
		
		if(hashTable.get("Image").equals(true)){
			dataSourceObj.commonComponentImage.sendKeys(dataSourceProvider.getProperty("Image"));
		}
		WebElement articleWebElement;
		WebElement authorWebElement;
		if(hashTable.get("ArticleComponent").equals(true)){
			
			Opr_ContentEditor_AboutUs.HomeSave();
			Opr_Sitecore_AboutusDatasource.ArticleClone(renderingDatasource, 1, 1);
			Opr_ContentEditor_AboutUs.RefreshItem(Driver.findElement(By.xpath("//span[text()='Article_DataSource']")));
			articleWebElement=Driver.findElement(By.xpath("//span[text()='ArticlePubDate_DataSource']/parent::a/following-sibling::div/div/a/span"));
			getClonedArticleText=articleWebElement.getText();
		}
		
		if(hashTable.get("ArticlePubDate").equals(true)){
			Opr_ContentEditor_AboutUs.HomeSave();
			Opr_Sitecore_AboutusDatasource.ArticleClone(renderingDatasource, 1, 1);
			Opr_ContentEditor_AboutUs.RefreshItem(Driver.findElement(By.xpath("//span[text()='ArticlePubDate_DataSource']")));
			articleWebElement=Driver.findElement(By.xpath("//span[text()='ArticlePubDate_DataSource']/parent::a/following-sibling::div/div/a/span"));
			articleWebElement.click();
			getClonedArticleText=articleWebElement.getText();
			authorWebElement=Driver.findElement(By.xpath("//div[contains(text(),'Author')]/following-sibling::div[2]/div/table/tbody/tr[2]/td[3]/select/option[1]"));
			Opr_ContentEditor_AboutUs.DoubleClickItem(authorWebElement);
			Opr_ContentEditor_AboutUs.HomeSave();
		}
		
			
					
		
		if(hashTable.get("ChildrenItems").equals(true) || hashTable.get("ImageShape").equals(true)){
			int imageShape = 1;
			switch(renderingDatasource)
			{
				case "ImageRight":
				case "ImageLeft": 
					imageShape = 0; break;
				case "3Items3Columns": 
				case "StackedImageLeft": 
				case "3ColumnsLinksOverlaid":
				case "4Items4ColumnsRectangle":
				case "4Items2Columns":
				case "4Items4ColumnsSquare":
				case "5Column":
				case "2x3":
				case "6Items6Columns":
				case "6Items6ColumnsWithText":
				case "6Items3Columns":
				case "6Items2Columns":
				case "ShowHideImageLeft":
				case "HeaderImageLeft":	
				case "HeaderImageRight":
					imageShape = 2; break;				 
				default: 
					imageShape = 1; break;
			}
			Opr_AboutUsDataSource_DataProvider.CommonComponentImageShape(renderingDatasource, "DataSource", imageShape);			
		}
		
		if(hashTable.get("ImageSize").equals(true)){
			Opr_AboutUsDataSource_DataProvider.CommonComponentImageSize(renderingDatasource, "DataSource", 0);
		}		
		
		if(hashTable.get("MoreInfoLink").equals(true)){
			try{
				AboutusCommonClass.UrlExternalLinkAndRichTextEditor_Click(dataSourceObj.commonComponentMoreInfoLink);
				AboutusCommonClass.SwitchToFrame("jqueryModalDialogsFrame", "scContentIframeId0");
				
				dataSourceObj.moreInfoLinkDesc.sendKeys(dataSourceProvider.getProperty("MoreInfoLinkDesc"));
				dataSourceObj.moreInfoLinkURL.sendKeys(dataSourceProvider.getProperty("MoreInfoLinkUrl"));
				dataSourceObj.moreInfoLinkOK.click();
				Driver.switchTo().defaultContent();
			}catch(Exception e){
				Driver.switchTo().defaultContent();
				log.error("Datasource MoreInfoLink - " + e.getLocalizedMessage());
			}
		}
		
		if(hashTable.get("InsetText").equals(true)){
			AboutusCommonClass.UrlExternalLinkAndRichTextEditor_Click(dataSourceObj.insetText);
			AboutusCommonClass.SwitchToFrame("jqueryModalDialogsFrame", "scContentIframeId0");
			
			dataSourceObj.commonComponentTextEditor.sendKeys(dataSourceProvider.getProperty("InsetText"));
			dataSourceObj.itemTextAccept.click();
			Driver.switchTo().defaultContent();
		}
		
		if(hashTable.get("InsetImage").equals(true)){
			dataSourceObj.insetImage.sendKeys(dataSourceProvider.getProperty("InsetImage"));
			CommonComponentInsetImageShapeWithPosition(renderingDatasource, "DataSource", 1, 1);
		}
		
		if(hashTable.get("VideoItems").equals(true)){
			Actions doubleClick_RecentArticle= new Actions(Driver);
			doubleClick_RecentArticle.doubleClick(dataSourceObj.videoItem).build().perform();
		}

		Opr_ContentEditor_AboutUs.HomeSave();
		
		if(hashTable.get("CarouselItems").equals(true)){
			Thread.sleep(2000);	
			Opr_AboutUsDataSourceForCarouselItems_DataProvider.CreateCarouselItemsWithFolder("ChildFolderName", "CarouselItem", "CarouselTemplate");
			Opr_AboutUsDataSourceForCarouselItems_DataProvider.CarouselItemDataSource(renderingDatasource);
			Opr_AboutUsDataSourceForCarouselItems_DataProvider.DuplicatingCarouselItemDataSource(renderingDatasource);			
			Opr_AboutUsDataSourceForCarouselItems_DataProvider.SelectCarouselItem_RenderingDatasource(renderingDatasource);
		}
		
		if(hashTable.get("ArticleClone").equals(true)){
			WebElement webElement = Driver.findElement(By.xpath("//span[text()='" + renderingDatasource+"_DataSource" +"']"));
			switch(renderingDatasource)
			{
				case "MergeArticleAndArticle":
					Opr_Sitecore_AboutusDatasource.ArticleClone(renderingDatasource, 1, 1);
					break;
				case "marriage":
					Opr_ContentEditor_AboutUs.HomeSave();
					Opr_Sitecore_AboutusDatasource.ArticleClone(renderingDatasource, 1, 5);
					Opr_ContentEditor_AboutUs.RefreshItem(webElement);
					Opr_AboutUsDataSourceForChildItems_DataProvider.ClonedArticlePublicationDate(renderingDatasource, 1, 5);
					break;
				case "parenting":
					Opr_ContentEditor_AboutUs.HomeSave();
					Opr_Sitecore_AboutusDatasource.ArticleClone(renderingDatasource, 6, 5);
					Opr_ContentEditor_AboutUs.RefreshItem(webElement);
					Opr_AboutUsDataSourceForChildItems_DataProvider.ClonedArticlePublicationDate(renderingDatasource, 6, 5);
					break;
				default:
					Opr_Sitecore_AboutusDatasource.ArticleClone(renderingDatasource, 1, 3);
					break;
			}
		}
		
		if(hashTable.get("ChildrenItems").equals(true)){
			WebElement webElement=Driver.findElement(By.xpath("//span[text()='" + renderingDatasource + "_DataSource']"));			
			Thread.sleep(2000);	
			Opr_AboutUsDataSourceForChildItems_DataProvider.CreateChildItemsWithFolder("ChildFolderName", "ChildItem", "ChildItemTemplate");	
			
			Opr_AboutUsDataSourceForChildItems_DataProvider.SetDefaultValueToChildItemHashTable(childItemHashTable);
			switch(renderingDatasource)
			{			
				//OneItem				
				case "LeftImageList":					
				case "RightImageList":
				case "IFrameRightImageList":				
				case "SideBySideCentered":
					childItemHashTable.replace("Image", true);
					childItemHashTable.replace("Title", true);
					childItemHashTable.replace("ShortDescription", true);
					childItemHashTable.replace("MoreLink", true);
					break;
				case "SideBySide":
					childItemHashTable.replace("Image", true);
					childItemHashTable.replace("Title", true);
					childItemHashTable.replace("ShortDescription", true);
					childItemHashTable.replace("MoreLink", true);
					childItemHashTable.replace("ImageShape", true);
					break;					
				case "3Items3Columns": 
				case "StackedImageLeft": 
					childItemHashTable.replace("Image", true);
					childItemHashTable.replace("Title", true);
					childItemHashTable.replace("ShortDescription", true);
					childItemHashTable.replace("MoreLink", true);
					break;
				case "3ColumnsLinksOverlaid": 
					childItemHashTable.replace("Image", true);
					childItemHashTable.replace("Title", true);
					childItemHashTable.replace("MoreLink", true);
					break;	
				case "4Items4ColumnsRectangle": 
				case "4ItemsWithInset":
				case "4Items2Columns":
				case "4Items4ColumnsSquare":
					childItemHashTable.replace("Image", true);
					childItemHashTable.replace("Title", true);
					childItemHashTable.replace("ShortDescription", true);
					//childItemHashTable.replace("MoreLink", true);				
					break;
				case "5Column":				
					childItemHashTable.replace("Image", true);
					childItemHashTable.replace("Title", true);
					childItemHashTable.replace("ShortDescription", true);
					childItemHashTable.replace("MoreLink", true);	
					break;
				case "6Items6Columns":
				case "6Items3Columns":
					childItemHashTable.replace("Image", true);
					childItemHashTable.replace("MoreLink", true);
					break;
				case "6Items2Columns":
					childItemHashTable.replace("Image", true);
					childItemHashTable.replace("ShortDescription", true);
					break;
				case "6Items6ColumnsWithText":
					childItemHashTable.replace("Title", true);
					childItemHashTable.replace("Image", true);
					childItemHashTable.replace("MoreLink", true);
					childItemHashTable.replace("ShortDescription", true);
					break;
				case "2x3":
					childItemHashTable.replace("Image", true);
					childItemHashTable.replace("Title", true);
					//childItemHashTable.replace("ShortDescription", true);
					childItemHashTable.replace("MoreLink", true);	
					break;
				case "TimeLineBasic":
				case "ShowHideBasic":
				case "ShowHideImageLeft":
				case "ShowHideArticleGroupByYear":
					childItemHashTable.replace("Title", true);
					childItemHashTable.replace("ShortDescription", true);
					break;
				case "HeaderImageRight":
					childItemHashTable.replace("Image", true);
					childItemHashTable.replace("ShortDescription", true);
					break;
				case "HeaderImageCarousel":
					childItemHashTable.replace("Image", true);
				case "HeaderVideoRight":
					childItemHashTable.replace("MoreLink", true);
				default: break;
			}	
			Opr_AboutUsDataSourceForChildItems_DataProvider.ChildItemDataSource(renderingDatasource, childItemHashTable);
			Opr_AboutUsDataSourceForGrandChildItems_DataProvider.GrandChildItemsDataProvider(renderingDatasource);
			Opr_AboutUsDataSourceForChildItems_DataProvider.DuplicatingChildItemDataSource(renderingDatasource);			
			Opr_AboutUsDataSourceForChildItems_DataProvider.SelectChildItem_RenderingDatasource(renderingDatasource);
		}		
		
		if(hashTable.get("IFrame").equals(true)){
			try{
				dataSourceObj.commonComponentIFrameLink.click();
				AboutusCommonClass.SwitchToFrame();
				dataSourceObj.moreInfoLinkDesc.sendKeys(dataSourceProvider.getProperty("IFrameDesc"));
				dataSourceObj.moreInfoLinkURL.sendKeys(dataSourceProvider.getProperty("IFrameUrl"));
				dataSourceObj.moreInfoLinkOK.click();
				Driver.switchTo().defaultContent();
			}catch(Exception e){
				Driver.switchTo().defaultContent();
				log.error("Datasource IFrame - " + e.getLocalizedMessage());
			}
		}
		
		if(hashTable.get("RecentArticlesOverride").equals(true)){
			Driver.findElement(By.xpath("//span[text()='" + renderingDatasource + "_DataSource']")).click();
			for(int i=0; i<=2;i++){
				dataSourceObj.recentArticleSearchBox.sendKeys(Opr_AboutUsDataSourceForChildItems_DataProvider.searchArticle[i]);
				Thread.sleep(5000);
				Actions doubleClick_RecentArticle= new Actions(Driver);
				doubleClick_RecentArticle.doubleClick(dataSourceObj.recentArticleOption1).build().perform();
				Thread.sleep(5000);
				dataSourceObj.recentArticleSearchBox.clear();
			}
		}
		
		if(hashTable.get("IsFeatured").equals(true))
		{			
			dataSourceObj.isFeaturedCheckbox.click();
		}	
		
		if(hashTable.get("InsetImageShape").equals(true) || hashTable.get("InsetImagePosition").equals(true) || 
				hashTable.get("RecentArticlesOverride").equals(true) || hashTable.get("IsFeatured").equals(true) ||
				hashTable.get("IFrame").equals(true)){
			Opr_ContentEditor_AboutUs.HomeSave();
		}		
		
		Thread.sleep(3000);
		if(renderingDatasource.startsWith("Initiative")){
			AboutusCommonClass.InitiativeComponentContentItem().click();
		}else{
		AboutusCommonClass.PageComponentContentItem().click();
		}
		Thread.sleep(9999);
		
	}	
	
	public static void CustomInitiativeComponentDataSource(String renderingDatasource, Hashtable hashTable)throws InterruptedException{
		if(hashTable.get("TitleText").equals(true)){
			dataSourceObj.commonComponentTitle.sendKeys(renderingDatasource + " - Title");		
		}
		if(hashTable.get("ItemText").equals(true)){
			AboutusCommonClass.UrlExternalLinkAndRichTextEditor_Click(dataSourceObj.commonComponentShowEditor);
			AboutusCommonClass.SwitchToFrame("jqueryModalDialogsFrame", "scContentIframeId0");
			
			dataSourceObj.commonComponentTextEditor.sendKeys(customInitiativeDataSourceProvider.getProperty("InitiativeComponentText"));
			dataSourceObj.itemTextAccept.click();
			Driver.switchTo().defaultContent();
		}
		
		if(hashTable.get("Image").equals(true)){
			dataSourceObj.commonComponentImage.sendKeys(customInitiativeDataSourceProvider.getProperty("InitiativeComponentImage"));
		}
		
		Opr_ContentEditor_AboutUs.HomeSave();
	}
	
	public static void CommonComponentInsetImageShapeWithPosition(String renderingDatasource, String mode, 
			int InsetImageShape, int InsetImagePosition)throws InterruptedException{		
		if(mode.equals("ContentEditor")){
			Driver.findElement(By.xpath("//span[text()='" + renderingDatasource +"_DataSource']")).click();
			Driver.findElement(By.xpath("//span[text()='" + renderingDatasource +"_DataSource']")).click();
			Thread.sleep(3000);	
		}
		
		WebElement dropDownList1 = dataSourceObj.insetImageShape;
		Select drp1 = drp1= new Select(dropDownList1);					
		drp1.selectByIndex(InsetImageShape);
			
		dropDownList1 = dataSourceObj.insetImagePosition;
		drp1 = drp1= new Select(dropDownList1);					
		drp1.selectByIndex(InsetImagePosition);
		
		if(mode.equals("ContentEditor")){
			Opr_ContentEditor_AboutUs.HomeSave();
			
			Thread.sleep(3000);
			AboutusCommonClass.PageComponentContentItem().click();
			AboutusCommonClass.PageComponentContentItem().click();
			Thread.sleep(5000);
			
			Opr_ContentEditor_AboutUs.PublishPreview();
			Thread.sleep(5000);
			Driver.switchTo().window(Opr_Sitecore_AboutUs_Assert.GetChildWindow("CHILD"));
		}
	}
	
	public static void CommonComponentImageShape(String renderingDatasource, String mode, int imageShape) 
			throws InterruptedException{		
		if(mode.equals("ContentEditor") || mode.equals("")){
			Driver.findElement(By.xpath("//span[text()='" + renderingDatasource +"_DataSource']")).click();
			Driver.findElement(By.xpath("//span[text()='" + renderingDatasource +"_DataSource']")).click();
			Thread.sleep(3000);	
		}
		
		WebElement dropDownList1 = dataSourceObj.commonComponentImageShape;
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

	
	public static void CommonComponentImageSize(String renderingDatasource, String mode, int ImageSize) 
			throws InterruptedException{		
		if(mode.equals("ContentEditor")){
			Driver.findElement(By.xpath("//span[text()='" + renderingDatasource +"_DataSource']")).click();
			Driver.findElement(By.xpath("//span[text()='" + renderingDatasource +"_DataSource']")).click();
			Thread.sleep(3000);	
		}
		
		WebElement dropDownList1 = dataSourceObj.commonComponentImageSize;
		Select drp1 = drp1= new Select(dropDownList1);					
		drp1.selectByIndex(ImageSize);
			
		if(mode.equals("ContentEditor")){
			Opr_ContentEditor_AboutUs.HomeSave();
			
			Thread.sleep(3000);
			AboutusCommonClass.PageComponentContentItem().click();
			AboutusCommonClass.PageComponentContentItem().click();
			Thread.sleep(5000);
			
			Opr_ContentEditor_AboutUs.PublishPreview();
			Thread.sleep(5000);
			Driver.switchTo().window(Opr_Sitecore_AboutUs_Assert.GetChildWindow("CHILD"));
		}
	}
}
