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

public class Opr_AboutUsDataSourceForGrandChildItems_DataProvider extends Basedriver
{		
	public static void GrandChildItemsDataProvider(String renderingDatasource) throws InterruptedException{
		switch(renderingDatasource)
		{			
			case "4Items2Columns": 
				CreateGrandChildItemsToCommonComponentItem(renderingDatasource);
				break;			
			default: break;
		}		
	}	
	
	public static void CreateGrandChildItemsToCommonComponentItem(String renderingDatasource) throws InterruptedException{
		Driver.findElement(By.xpath("//span[text()='" + dataSourceProvider.getProperty("ChildItem") +"1']")).click();
		Thread.sleep(3000);
		
		Opr_AboutUsDataSourceForChildItems_DataProvider.CreateChildItemsWithFolder("GrandChildFolderName", "GrandChildItem", "ImageAndLinkItem");
		ImageAndLinkItemDataSource(renderingDatasource);
		DuplicatingGrandChildItemDataSource(renderingDatasource);
		SelectGrandChildItem_RenderingDatasource(renderingDatasource);		
	}
	
	public static void ImageAndLinkItemDataSource(String renderingDatasource) throws InterruptedException
	{
		dataSourceObj.commonComponentContentTab.click();
		
		dataSourceObj.imageAndLinkTemplateItemImage.sendKeys(dataSourceProvider.getProperty("GrandChildItemImage"));		
		try{				
			AboutusCommonClass.UrlExternalLinkAndRichTextEditor_Click(dataSourceObj.imageAndLinkTemplateItemLinkText);
			AboutusCommonClass.SwitchToFrame("jqueryModalDialogsFrame", "scContentIframeId0");
			
			dataSourceObj.moreInfoLinkDesc.sendKeys(dataSourceProvider.getProperty("GrandChildItemMoreInfoLinkDesc"));
			dataSourceObj.moreInfoLinkURL.sendKeys(dataSourceProvider.getProperty("GrandChildItemMoreInfoLinkUrl"));
			dataSourceObj.moreInfoLinkOK.click();
			Driver.switchTo().defaultContent();
		}catch(Exception e){
			Driver.switchTo().defaultContent();
			log.error("Grand ChildItem Datasource MoreLink - " + e.getLocalizedMessage());
		}
		
		dataSourceObj.saveDataSource.click();
	}
	
	public static void DuplicatingGrandChildItemDataSource(String renderingDatasource) throws InterruptedException
	{
		int numOfChildItemsToDuplicate = 3;		
		for(int i = 2; i <= numOfChildItemsToDuplicate; i++){				
			Thread.sleep(2000);
			Actions ref = new Actions(Driver);
			ref.contextClick(dataSourceObj.grandChildItems_1).build().perform();
			dataSourceObj.duplicateChildItem.click();
			Thread.sleep(3000);
			AboutusCommonClass.SwitchToFrame();
			
			dataSourceObj.childFolderName.sendKeys(dataSourceProvider.getProperty("GrandChildItem") + i);
			sitecoreObj.okButton.click();
			Driver.switchTo().defaultContent();
		}		
	}
	
	public static void SelectGrandChildItem_RenderingDatasource(String renderingDatasource) throws InterruptedException
	{		
		Thread.sleep(2000);	
		Driver.findElement(By.xpath("//span[text()='" + dataSourceProvider.getProperty("ChildItem") +"1']")).click();
		Thread.sleep(3000);		
		for(int i = 1; i <= 2; i++){
			Actions ref = new Actions(Driver);
			WebElement item = Driver.findElement(By.xpath("//option[text()='" + dataSourceProvider.getProperty("GrandChildItem")+Integer.toString(i) +"']"));
			ref.doubleClick(item).build().perform();
			Thread.sleep(2000);
		}
		dataSourceObj.saveDataSource.click();
	}
	
}
