package fotf_Operations;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import fotf_Config.AboutusCommonClass;
import fotf_Config.Basedriver;
import fotf_Datasource.Opr_AboutUsDataSource_DataProvider;
import fotf_Datasource.Opr_Sitecore_AboutusDatasource;

public class Opr_Sitecore_AboutUs extends Basedriver{

	// Login to the Sitecore
	public static void loginSitecore(){
		// Verify The Content Editor is Selected or not in Sitecore login page
			sitecoreObj.userName.clear();
			sitecoreObj.passWord.clear();
			
			sitecoreObj.userName.sendKeys(AboutusCommonClass.SitecoreUserName());
			sitecoreObj.passWord.sendKeys(AboutusCommonClass.SitecorePassword());			
			sitecoreObj.loginButtion.click();
			
			sitecoreObj.contentEditor.click();
		}
	
	// Navigate to FOTF content of the Sitecore
	public static void navigateToFOTFcom() throws InterruptedException{
		// Verify The "Content" is Displayed or not under the Sitecore content
		try{
			dataSourceObj.contentExtract.isDisplayed();
		}catch(org.openqa.selenium.NoSuchElementException e){
			dataSourceObj.sitecoreExtract.click();
		}
		
		try{
			dataSourceObj.fotfCom.isDisplayed();
		}catch(org.openqa.selenium.NoSuchElementException e){
			dataSourceObj.contentExtract.click();
		}
		
		try{
			dataSourceObj.fotfComFirstItem.isDisplayed();
		}catch(org.openqa.selenium.NoSuchElementException e){
			dataSourceObj.fotfExtract.click();
		}
			
		dataSourceObj.fotfCom.click();
		//log.info("Click on FOTF.COM");						
	}
	
	// Navigate to Create AutoAboutUs for Page Component under FOTF.com content of the Sitecore
	public static void createAboutUs() throws InterruptedException{		
		try{
			if(AboutusCommonClass.PageComponentContentItem().isDisplayed()){
				DeleteAboutUs();
		}}catch(org.openqa.selenium.NoSuchElementException e){}
		dataSourceObj.fotfCom.click();
		sitecoreObj.insertFromTemplate.click();
		Driver.switchTo().frame("jqueryModalDialogsFrame");
		Driver.switchTo().frame("scContentIframeId0");
			
		NavigateToPageComponentTemplate();
		
		sitecoreObj.pageComponent.click();
		sitecoreObj.itemName.clear();
		//sitecoreObj.itemName.sendKeys("auto-aboutus");
		sitecoreObj.itemName.sendKeys(AboutusCommonClass.PageComponentContentItemName());
		sitecoreObj.insertButton.click();
		Driver.switchTo().defaultContent();
		// log.info("Page Component has created called 'auto-aboutus' ");
		AboutusCommonClass.PageComponentContentItem().click();
	}
	
	// Navigate to Create Custom Initiative Component under FOTF.com content of the Sitecore
		public static void createCustomInitiativeComponent() throws InterruptedException{		
			try{
				if(AboutusCommonClass.InitiativeComponentContentItem().isDisplayed()){
					DeleteInitiative();
			}}catch(org.openqa.selenium.NoSuchElementException e){}
			dataSourceObj.fotfCom.click();
			sitecoreObj.insertFromTemplate.click();
			Driver.switchTo().frame("jqueryModalDialogsFrame");
			Driver.switchTo().frame("scContentIframeId0");
				
			NavigateToPageComponentTemplate();
			
			sitecoreObj.customInitiativePageComponent.click();
			sitecoreObj.itemName.clear();
			sitecoreObj.itemName.sendKeys(AboutusCommonClass.InitiativeComponentContentItemName());
			sitecoreObj.insertButton.click();
			Driver.switchTo().defaultContent();
			AboutusCommonClass.InitiativeComponentContentItem().click();
		}
		
	public static void Steps_CreateCommonComponent(String renderingControl){
		SwitchToFrame();
		Driver.switchTo().frame("scContentIframeId0");
		sitecoreObj.deviceEditor.click();
		//log.info("Opened Device Editor");
		
		SwitchToFrame();
		Driver.switchTo().frame("scContentIframeId1");
		sitecoreObj.controls.click();
		
		if(renderingControl.equals("Article")){
			sitecoreObj.renderingComponentImg.click();
			sitecoreObj.changeControls.click();
		}else{		
			sitecoreObj.addControls.click();
		}
		
		SwitchToFrame();
		Driver.switchTo().frame("scContentIframeId2");
		
		switch(renderingControl)
		{		
			case "ImageRight":
				NavigateToRenderingList("OneItem");
				sitecoreObj.imageOnRight.click();
				break;
			case "ImageLeft":
				NavigateToRenderingList("OneItem");
				sitecoreObj.imageOnLeft.click();
				break;
			case "ButtonRight":
				NavigateToRenderingList("OneItem");
				sitecoreObj.buttonOnRight.click();
				break;
			case "ButtonLeft":
				NavigateToRenderingList("OneItem");
				sitecoreObj.buttonOnLeft.click();
				break;
			case "ButtonBottom":
				NavigateToRenderingList("OneItem");
				sitecoreObj.buttonOnBottom.click();
				break;
			case "LeftImageList":
				NavigateToRenderingList("OneItem");
				sitecoreObj.leftImageWithList.click();
				break;
			case "RightImageList":
				NavigateToRenderingList("OneItem");
				sitecoreObj.RightImageWithList.click();
				break;
			case "IFrameRightImageList":
				NavigateToRenderingList("OneItem");
				sitecoreObj.IFrameRightImageWithList.click();
				break;
			case "SideBySide":
				NavigateToRenderingList("2Item");
				sitecoreObj.sideBySide.click();
				break;
			case "SideBySideCentered": 
				NavigateToRenderingList("2Item");
				sitecoreObj.sideBySideCentered.click();
				break;
			case "3Items3Columns": 
				NavigateToRenderingList("3Item");
				sitecoreObj.threeColumns.click();
				break;
			case "StackedImageLeft": 
				NavigateToRenderingList("3Item");
				sitecoreObj.stackedImageLeft.click();
				break;	
			case "3ColumnsLinksOverlaid": 
				NavigateToRenderingList("3Item");
				sitecoreObj.threeColumnsLinksOverlaid.click();
				break;
			case "4Items4ColumnsRectangle": 
				NavigateToRenderingList("4Item");
				sitecoreObj.fourItem4ColumnRectangle.click();
				break;
			case "4ItemsWithInset": 
				NavigateToRenderingList("4Item");
				sitecoreObj.fourItemWithInset.click();
				break;
			case "4Items2Columns": 
				NavigateToRenderingList("4Item");
				sitecoreObj.fourItem2Column.click();
				break;
			case "4Items4ColumnsSquare": 
				NavigateToRenderingList("4Item");
				sitecoreObj.fourItem4ColumnSquare.click();
				break;	
			case "5Column":
				NavigateToRenderingList("5Item");
				sitecoreObj.fiveColumn.click();
				break;	
			case "2x3":
				NavigateToRenderingList("5Item");
				sitecoreObj.twoBythree.click();
				break;		
			case "6Items3Columns": 
				NavigateToRenderingList("6Item");
				sitecoreObj.sixItem3Column.click();
				break;
			case "6Items6Columns": 
				NavigateToRenderingList("6Item");
				sitecoreObj.sixItem6Column.click();
				break;
			case "6Items6ColumnsWithText":
				NavigateToRenderingList("6Item");
				sitecoreObj.sixItem6ColumnWithText.click();
				break;
			case "6Items2Columns": 
				NavigateToRenderingList("6Item");
				sitecoreObj.sixItem2Column.click();
				break;
			case "HeaderImageLeft":
				NavigateToRenderingList("HeaderItem");
				sitecoreObj.HeaderImageLeft.click();
				break;
			case "HeaderImageRight":
				NavigateToRenderingList("HeaderItem");
				sitecoreObj.HeaderImageRight.click();
				break;
			case "HeaderImageTop":
				NavigateToRenderingList("HeaderItem");
				sitecoreObj.HeaderImageTop.click();
				break;
			case "HeaderVideoRight":
				NavigateToRenderingList("HeaderItem");
				sitecoreObj.HeaderVideoRight.click();
				break;
			case "HeaderImageCarousel":
				NavigateToRenderingList("HeaderItem");
				sitecoreObj.HeaderImageCarousel.click();
				break;
			case "Article":
				NavigateToRenderingList("Components");
				sitecoreObj.articleComponentControl.click();
				break;
			case "ArticlePubDate": 
				NavigateToRenderingList("Components");
				sitecoreObj.articleComponentControl.click();
				break;
			case "ArticleIsFeatured":
				NavigateToRenderingList("3Item");
				sitecoreObj.threeColumns.click();
				break;
			case "ShowHideImageLeft":			
				NavigateToRenderingList("ShowHideItem");
				sitecoreObj.ShowHideImageLeft.click();
				break;
			case "ShowHideBasic":
				NavigateToRenderingList("ShowHideItem");
				sitecoreObj.ShowHideBasic.click();
				break;		
			case "TimeLineBasic":
				NavigateToRenderingList("TimeLineItem");
				sitecoreObj.TimeLineBasic.click();
				break;	
			case "PageComponentHeader": break;
			case "InitiativeLeftHeroImage":
				NavigateToRenderingList("HeroItem");
				sitecoreObj.HeroImageLeft.click();
				break;
			case "InitiativeRightHeroImage":
				NavigateToRenderingList("HeroItem");
				sitecoreObj.HeroImageRight.click();
				break;
			case "InitiativeLeftHeroVideo":
				NavigateToRenderingList("HeroItem");
				sitecoreObj.HeroVideoLeft.click();
				break;
			case "InitiativeRightHeroVideo":
				NavigateToRenderingList("HeroItem");
				sitecoreObj.HeroVideoRight.click();
				break;
			default: break;
		}
	}
	
public static void Steps_SelectCommonComponent(String renderingControl) throws InterruptedException{	
	if(!renderingControl.equals("Article")){
		sitecoreObj.placeHolderName.sendKeys("/main/pagecomponent");
	}
	sitecoreObj.selectComponent.click();
//log.info("Container Component has created");
	
	SwitchToFrame();
	Driver.switchTo().frame("scContentIframeId1");
	switch(renderingControl)
	{		
		case "ImageRight":
			sitecoreObj.imageOnRightContainer.click();
			break;
		case "ImageLeft":
			sitecoreObj.imageOnLeftContainer.click();
			break;
		case "ButtonRight":
			sitecoreObj.buttonOnRightContainer.click();
			break;
		case "ButtonLeft":
			sitecoreObj.buttonOnLeftContainer.click();
			break;
		case "ButtonBottom":
			sitecoreObj.buttonOnBottomContainer.click();
			break;
		case "LeftImageList":
			sitecoreObj.LeftImageWithListContainer.click();
			break;
		case "RightImageList":
			sitecoreObj.RightImageWithListContainer.click();
			break;
		case "IFrameRightImageList":
			sitecoreObj.IFrameRightImageWithListContainer.click();
			break;
		case "SideBySide": 
			sitecoreObj.sideBySideContainer.click();
			break;
		case "SideBySideCentered": 
			sitecoreObj.sideBySideCenteredContainer.click();
			break;
		case "3Items3Columns": 
			sitecoreObj.threeColumnsContainer.click();
			break;
		case "StackedImageLeft": 
			sitecoreObj.stackedImageLeftContainer.click();
			break;
		case "3ColumnsLinksOverlaid": 
			sitecoreObj.threeColumnsLinksOverlaidContainer.click();
			break;
		case "4Items4ColumnsRectangle": 
			sitecoreObj.fourItem4ColumnsRectangleContainer.click();
			break;
		case "4ItemsWithInset": 
			sitecoreObj.fourItemWithInsetContainer.click();
			break; 
		case "4Items2Columns": 
			sitecoreObj.fourItem2ColumnsContainer.click();
			break;
		case "4Items4ColumnsSquare": 
			sitecoreObj.fourItem4ColumnsSquareContainer.click();
			break;	
		case "5Column":
			sitecoreObj.fiveColumnContainer.click();
			break;
		case "2x3": 
			sitecoreObj.twoBythreeContainer.click();
			break;		
		case "6Items3Columns": 
			sitecoreObj.sixItem3ColumnContainer.click();
			break;
		case "6Items6Columns": 
			sitecoreObj.sixItem6ColumnContainer.click();
			break;
		case "6Items6ColumnsWithText":
			sitecoreObj.sixItem6ColumnWithTextContainer.click();
			break;
		case "6Items2Columns": 
			sitecoreObj.sixItem2ColumnContainer.click();
			break;
		case "HeaderImageLeft":
			sitecoreObj.HeaderImageLeftContainer.click();
			break;
		case "HeaderImageRight":
			sitecoreObj.HeaderImageRightContainer.click();
			break;
		case "HeaderImageTop":
			sitecoreObj.HeaderImageTopContainer.click();
			break;
		case "HeaderVideoRight":
			sitecoreObj.HeaderVideoRightContainer.click();
			break;
		case "HeaderImageCarousel":
			sitecoreObj.HeaderImageCarouselContainer.click();
			break;
		case "Article":
			sitecoreObj.articleContainer.click();
			break;
		case "ArticlePubDate":
			sitecoreObj.articleContainer.click();
			break;
		case "ArticleIsFeatured":
			sitecoreObj.threeColumnsContainer.click();
			break;
		case "ShowHideImageLeft":
			sitecoreObj.ShowHideImageLeftContainer.click();
			break;
		case "ShowHideBasic":
			sitecoreObj.ShowHideBasicContainer.click();
			break;		
		case "TimeLineBasic":
			sitecoreObj.timeLineBasicContainer.click();
			break;
		case "PageComponentHeader": break;
		case "InitiativeLeftHeroImage":
			sitecoreObj.HeroImageLeftContainer.click();
			break;
		case "InitiativeRightHeroImage":
			sitecoreObj.HeroImageRightContainer.click();
			break;
		case "InitiativeLeftHeroVideo":
			sitecoreObj.HeroVideoLeftContainer.click();
			break;
		case "InitiativeRightHeroVideo":
			sitecoreObj.HeroVideoRightContainer.click();
			break;
		default: 
			break;
	}
	
	sitecoreObj.editContainer.click();
	SwitchToFrame();
	Driver.switchTo().frame("scContentIframeId2");
	Thread.sleep(3000);
	String featuredDataSource="/sitecore/content/FOTF/";
	if(renderingControl.startsWith("Initiative")){
		featuredDataSource += AboutusCommonClass.InitiativeComponentContentItemName() 
				+ "/" + renderingControl + "_DataSource";
	}else{
		featuredDataSource += AboutusCommonClass.PageComponentContentItemName() 
			+ "/" + renderingControl + "_DataSource";
	}
	
	switch(renderingControl)
	{		
		case "ImageRight":	
		case "ImageLeft":
		case "ButtonRight":
		case "ButtonLeft":			
		case "ButtonBottom":
		case "LeftImageList":
		case "RightImageList":
		case "IFrameRightImageList":
		case "SideBySide": 
		case "SideBySideCentered":
		case "3Items3Columns": 
		case "3ColumnsLinksOverlaid": 
		case "StackedImageLeft":
		case "4Items4ColumnsRectangle": 
		case "4ItemsWithInset":
		case "4Items2Columns": 
		case "4Items4ColumnsSquare": 
		case "5Column":
		case "2x3": 
		case "6Items3Columns": 
		case "6Items6Columns":
		case "6Items6ColumnsWithText":
		case "6Items2Columns": 
		case "HeaderImageLeft":
		case "HeaderImageRight":
		case "HeaderImageTop":
		case "HeaderVideoRight":
		case "HeaderImageCarousel":
		case "ShowHideImageLeft":
		case "ShowHideBasic":
		case "TimeLineBasic":
			sitecoreObj.dataSource.sendKeys(Opr_Sitecore_AboutusDatasource.dataSourcePath);
			break;
		case "ArticleIsFeatured": 
			 sitecoreObj.dataSource.sendKeys(featuredDataSource);
			break;			
		case "Article":
			sitecoreObj.dataSource.sendKeys(featuredDataSource + "/" + Opr_AboutUsDataSource_DataProvider.getClonedArticleText);
			break;
		case "ArticlePubDate":
			sitecoreObj.dataSource.sendKeys(featuredDataSource + "/" + Opr_AboutUsDataSource_DataProvider.getClonedArticleText);
			break;		
		case "PageComponentHeader": break;	
		case "InitiativeLeftHeroImage":
			sitecoreObj.dataSource.sendKeys(featuredDataSource);
			break;
		default: 
			sitecoreObj.dataSource.sendKeys(Opr_Sitecore_AboutusDatasource.dataSourcePath);
			break;
	}
	
	Thread.sleep(2000);
	sitecoreObj.selectDataSource.click();
	
	SwitchToFrame();
	Driver.switchTo().frame("scContentIframeId1");
	sitecoreObj.selectComponent.click();
	
	SwitchToFrame();
	Driver.switchTo().frame("scContentIframeId0");
	sitecoreObj.selectComponent.click();
	
	Driver.switchTo().defaultContent();
}
// Switching to Frame for Navigation on Layouts for AutoAboutUs 	
	public static void SwitchToFrame() {
		Driver.switchTo().defaultContent();
		Driver.switchTo().frame("jqueryModalDialogsFrame");		
	}

// Navigate to Delete AutoAboutUs If Exist 
	private static void DeleteAboutUs() throws InterruptedException{
		AboutusCommonClass.PageComponentContentItem().click();
		Thread.sleep(2000);
		Actions ref=new Actions(Driver);
		ref.contextClick(AboutusCommonClass.PageComponentContentItem()).build().perform();
		Thread.sleep(2000);
		sitecoreObj.deleteItem.click();
		Thread.sleep(2000);
		Driver.switchTo().frame("jqueryModalDialogsFrame");
		Driver.switchTo().frame("scContentIframeId0");	
		sitecoreObj.okButton.click();
		Driver.switchTo().defaultContent();
		
		try{		
			Driver.switchTo().frame("jqueryModalDialogsFrame");
			Driver.switchTo().frame("scContentIframeId0");	
			dataSourceObj.removeLinksForDeleteAboutUsItem.click();
			dataSourceObj.deleteWithDatasoureItem.click();
			dataSourceObj.deleteWithDatasoureItem.click();
			Driver.switchTo().defaultContent();
			Thread.sleep(3000);
		}catch(Exception e){
			Driver.switchTo().defaultContent();
			log.fatal("Terminated Abruptly - No Sub Items to Remove:  " + e.getLocalizedMessage());
		}
	}

	// Navigate to Delete Initiative If Exist 
		private static void DeleteInitiative() throws InterruptedException{
			AboutusCommonClass.InitiativeComponentContentItem().click();
			Thread.sleep(2000);
			Actions ref=new Actions(Driver);
			ref.contextClick(AboutusCommonClass.InitiativeComponentContentItem()).build().perform();
			Thread.sleep(2000);
			sitecoreObj.deleteItem.click();
			Thread.sleep(2000);
			Driver.switchTo().frame("jqueryModalDialogsFrame");
			Driver.switchTo().frame("scContentIframeId0");	
			sitecoreObj.okButton.click();
			Driver.switchTo().defaultContent();
			
			try{		
				Driver.switchTo().frame("jqueryModalDialogsFrame");
				Driver.switchTo().frame("scContentIframeId0");	
				//dataSourceObj.removeLinksForDeleteAboutUsItem.click();
				dataSourceObj.deleteWithDatasoureItem.click();
				dataSourceObj.deleteWithDatasoureItem.click();
				Driver.switchTo().defaultContent();
				Thread.sleep(3000);
			}catch(Exception e){
				Driver.switchTo().defaultContent();
				log.fatal("Terminated Abruptly - No Sub Items to Remove:  " + e.getLocalizedMessage());
			}
		}
	public static void NavigateToRenderingList(String renderingControl){
		try{
			sitecoreObj.component_Rendering.isDisplayed();
		}catch(org.openqa.selenium.NoSuchElementException e){
			sitecoreObj.renderings_Control.click();
		}
		
		try{
			sitecoreObj.oneItem_Components.isDisplayed();
		}catch(org.openqa.selenium.NoSuchElementException e){
			sitecoreObj.component_Rendering.click();
		}
		
		if(renderingControl.equals("OneItem")){
			try{
			if(sitecoreObj.oneItemList.isDisplayed()){}
			}
			catch(org.openqa.selenium.NoSuchElementException e){
				sitecoreObj.oneItem_Components.click();
			}
		}
		
		if(renderingControl.equals("HeaderItem")){
			try{
				sitecoreObj.headerItemlist.isDisplayed();
			}
			catch(org.openqa.selenium.NoSuchElementException e){
				sitecoreObj.headerItem_Components.click();
			}
		}
		
		if(renderingControl.equals("ShowHideItem")){
			try{
				sitecoreObj.showhideItemlist.isDisplayed();
			}
			catch(org.openqa.selenium.NoSuchElementException e){
				sitecoreObj.showHideItem_Components.click();
			}
		}
		
		if(renderingControl.equals("TimeLineItem")){
			try{
				sitecoreObj.timeLineBasicItemlist.isDisplayed();
			}
			catch(org.openqa.selenium.NoSuchElementException e){
				sitecoreObj.timeLineBasicItem_Components.click();
			}
		}
		
		if(renderingControl.equals("5Item")){
			try{
				sitecoreObj.fiveItemlist.isDisplayed();
			}
			catch(org.openqa.selenium.NoSuchElementException e){
				sitecoreObj.fiveItem_Components.click();
			}
		}
		
		if(renderingControl.equals("2Item")){
			try{
				sitecoreObj.twoItemlist.isDisplayed();
			}
			catch(org.openqa.selenium.NoSuchElementException e){
				sitecoreObj.twoItem_Components.click();
			}
		}	
		
		if (renderingControl.equals("3Item")) {
			try {
				sitecoreObj.threeItemlist.isDisplayed();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				sitecoreObj.threeItem_Components.click();
			}
		}
		
		if (renderingControl.equals("6Item")) {
			try {
				sitecoreObj.sixItemlist.isDisplayed();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				sitecoreObj.sixItem_Components.click();
			}
		}
		
		if (renderingControl.equals("4Item")) {
			try {
				sitecoreObj.fourItemlist.isDisplayed();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				sitecoreObj.fourItem_Components.click();
			}
		}
		
		if (renderingControl.equals("HeroItem")) {
			try {
				sitecoreObj.HeroImageLeft.isDisplayed();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				sitecoreObj.heroItem_Components.click();
			}
		}
	}

	public static void NavigateToPageComponentTemplate() {
		try {
			sitecoreObj.componentsUnderCommon.isDisplayed();
		}
		catch(org.openqa.selenium.NoSuchElementException e){			
			sitecoreObj.commonUnderTemplates.click();
		}
		
		try{
			sitecoreObj.pageComponent.isDisplayed();
		}
		catch(org.openqa.selenium.NoSuchElementException e){
			sitecoreObj.componentsUnderCommon.click();			
		}
	}
}
