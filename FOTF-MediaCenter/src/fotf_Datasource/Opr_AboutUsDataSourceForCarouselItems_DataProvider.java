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

public class Opr_AboutUsDataSourceForCarouselItems_DataProvider extends Basedriver
{	
	
	public static void CreateCarouselItemsWithFolder(String FolderName, String carouselLevel, String TemplateName) throws InterruptedException{
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
		
		sitecoreObj.itemName.clear();
		sitecoreObj.itemName.sendKeys(dataSourceProvider.getProperty(carouselLevel)+"1");
		sitecoreObj.insertButton.click();
		Driver.switchTo().defaultContent();	
		
	}
	
	public static void CarouselItemDataSource(String renderingDatasource) throws InterruptedException
	{
		dataSourceObj.commonComponentContentTab.click();
		dataSourceObj.childItemTitle.sendKeys("Carousel Item 1 - Title");	
		dataSourceObj.childItemImage.sendKeys(dataSourceProvider.getProperty("ChildItemImage"));
			
		dataSourceObj.saveDataSource.click();
	}
	
	public static void DuplicatingCarouselItemDataSource(String renderingDatasource) throws InterruptedException
	{
		int numOfChildItemsToDuplicate = 4;
			
		for(int i = 2; i <= numOfChildItemsToDuplicate; i++){				
			Thread.sleep(2000);
			Actions ref = new Actions(Driver);
			ref.contextClick(dataSourceObj.carouselItems_1).build().perform();
			dataSourceObj.duplicateChildItem.click();
			Thread.sleep(3000);
			AboutusCommonClass.SwitchToFrame();
			
			dataSourceObj.childFolderName.sendKeys(dataSourceProvider.getProperty("CarouselItem") + i);
			sitecoreObj.okButton.click();
			Driver.switchTo().defaultContent();
		}			
	}
	
	
	public static void SelectCarouselItem_RenderingDatasource(String renderingDatasource) throws InterruptedException
	{		
		Driver.findElement(By.xpath("//span[text()='" + renderingDatasource+"_DataSource" +"']")).click();
		Thread.sleep(3000);
		int childItemsToDisplay = 3;		
		for(int i = 1; i <= childItemsToDisplay; i++){
			Actions ref = new Actions(Driver);
			WebElement item = Driver.findElement(By.xpath("//option[text()='" + dataSourceProvider.getProperty("CarouselItem")+Integer.toString(i) +"']"));
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
			Opr_ContentEditor_AboutUs.HomeSave();
		}
	}	
}
