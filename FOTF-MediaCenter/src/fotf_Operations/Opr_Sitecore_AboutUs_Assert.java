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

import fotf_Config.Basedriver;

public class Opr_Sitecore_AboutUs_Assert extends Basedriver{

	static Opr_AboutUs_AssertElement objAssertAboutUs=new Opr_AboutUs_AssertElement();
	static Opr_AboutUs_AssertElement_OneItem objAssertAboutUsOneItem=new Opr_AboutUs_AssertElement_OneItem();
	static Opr_AboutUs_AssertElement_TwoItem objAssertAboutUsTwoItem=new Opr_AboutUs_AssertElement_TwoItem();
	static Opr_AboutUs_AssertElement_ThreeItem objAssertAboutUsThreeItem=new Opr_AboutUs_AssertElement_ThreeItem();
	static Opr_AboutUs_AssertElement_FourItem objAssertAboutUsFourItem=new Opr_AboutUs_AssertElement_FourItem();
	static Opr_AboutUs_AssertElement_FiveItem objAssertAboutUsFiveItem=new Opr_AboutUs_AssertElement_FiveItem();
	static Opr_AboutUs_AssertElement_SixItem objAssertAboutUsSixItem=new Opr_AboutUs_AssertElement_SixItem();
	static Opr_AboutUs_AssertElement_HeaderItem objAssertAboutUsHeaderItem=new Opr_AboutUs_AssertElement_HeaderItem();
	static Opr_AboutUs_AssertElement_Showhide objAssertAboutUsShowhide=new Opr_AboutUs_AssertElement_Showhide();
	static Opr_AboutUs_AssertElement_Article objAssertAboutUsArticle=new Opr_AboutUs_AssertElement_Article();
	static Opr_AboutUs_AssertElement_Timeline objAssertAboutUsTimelineItem=new Opr_AboutUs_AssertElement_Timeline();
	static Opr_AboutUs_AssertElement_PageComponentHeader objAssertAboutUsPageComponentHeader = new Opr_AboutUs_AssertElement_PageComponentHeader();
	static Opr_AboutUs_AssertElement_CustomInitiative objAssertCustomInitiative = new Opr_AboutUs_AssertElement_CustomInitiative();

// Verify Elements in Child window for AutoAboutUs Preview page
	public static void AssertAboutus(String imagePosition, String pageMode) throws InterruptedException{
		if(!pageMode.equals("PageEditor")){
			Driver.switchTo().window(GetChildWindow("CHILD"));
			try{
				if(sitecoreObj.skipImage.isEnabled()){
					sitecoreObj.skipImage.click();	}
			}catch(org.openqa.selenium.NoSuchElementException e){
				System.out.println(e);
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
		switch(imagePosition)
		{		
			case "ImageRight":
				objAssertAboutUs.VerifyCommonComponent_H2("OneItem ImageRight");
				objAssertAboutUsOneItem.VerifyRightImage();	
				objAssertAboutUsOneItem.VerifyImageRightDescription();
				objAssertAboutUs.VerifyCommonComponent_ImageShapeWithImageSize("ImageRight", 0, 0);
				break;
			case "ImageLeft":
				objAssertAboutUs.VerifyCommonComponent_H2("OneItem ImageLeft");
				objAssertAboutUsOneItem.VerifyLeftImage();
				objAssertAboutUsOneItem.VerifyImageLeftDescription();
				objAssertAboutUs.VerifyCommonComponent_ImageShapeWithImageSize("ImageLeft", 0, 0);
				break;
			case "ButtonRight":
				objAssertAboutUs.VerifyCommonComponent_Div_H2("OneItem ButtonRight");
				objAssertAboutUsOneItem.VerifyButtonOnRight();			
				objAssertAboutUs.VerifyCommonComponent_Div_P("OneItem ButtonRight");
				break;
			case "ButtonLeft":
				objAssertAboutUs.VerifyCommonComponent_H2("OneItem ButtonLeft");
				objAssertAboutUsOneItem.VerifyButtonOnLeft();			
				objAssertAboutUs.VerifyCommonComponent_Div_P("OneItem ButtonLeft");
				objAssertAboutUsOneItem.VerifyButtonWithRightImage();	
				objAssertAboutUs.VerifyCommonComponent_ImageShape(1);
				break;
			case "ButtonBottom":
				objAssertAboutUs.VerifyCommonComponent_Div_H2("OneItem ButtonBottom");
				objAssertAboutUsOneItem.VerifyCenterImage();			
				objAssertAboutUs.VerifyCommonComponent_Div_P("OneItem ButtonBottom");
				objAssertAboutUsOneItem.VerifyButtonOnCenter();
				objAssertAboutUs.VerifyCommonComponent_ImageShape(1);
				break;
			case "LeftImageList":
				objAssertAboutUs.VerifyCommonComponent_H2("OneItem LeftImageList");
				objAssertAboutUsOneItem.VerifyLeft_AlignImage();
				objAssertAboutUsOneItem.VerifyImageLeftAlignDescription();
				objAssertAboutUs.VerifyListIcon("OneItem / LeftImageList");
				objAssertAboutUs.VerifyListText("OneItem / LeftImageList");
				objAssertAboutUs.VerifyDescText_ContentDesc("//li[", "]/div/p");
				objAssertAboutUs.VerifyCommonComponent_ImageShape(1);
				break;
			case "RightImageList":
				objAssertAboutUs.VerifyCommonComponent_H2("OneItem RightImageList");
				objAssertAboutUsOneItem.VerifyRight_AlignImage();
				objAssertAboutUsOneItem.VerifyImageRightAlignDescription();
				objAssertAboutUs.VerifyListIcon("OneItem RightImageList");
				objAssertAboutUs.VerifyListText("OneItem RightImageList");
				objAssertAboutUs.VerifyDescText_ContentDesc("//li[", "]/div/p");
				objAssertAboutUs.VerifyCommonComponent_ImageShape(1);
				break;
			case "IFrameRightImageList":
				objAssertAboutUs.VerifyCommonComponent_H2("OneItem IFrameRightImageList");
				objAssertAboutUsOneItem.VerifyIFrameOnRightAlignDescription();
				objAssertAboutUs.VerifyListIcon("OneItem IFrameRightImageList");
				objAssertAboutUsOneItem.VerifyIFrameListText();
				objAssertAboutUsOneItem.VerifyIFrameOnRightAlignWithListItems();
				objAssertAboutUs.VerifyDescText_ContentDesc("//li[", "]/div/p");
				break;
			case "SideBySide":
				objAssertAboutUs.VerifyCommonComponent_Div_Div_H2("SideBySide");
				objAssertAboutUsTwoItem.VerifySideBySide_Image();
				objAssertAboutUs.VerifyCommonComponent_3DIVs_P("SideBySide");
				objAssertAboutUsTwoItem.VerifySideBySide_Link();
				objAssertAboutUs.VerifyTitleText_ContentTitle("//div[2]/div/div/div/div[", "h2");
				//objAssertAboutUs.VerifyCommonComponent_ImageShape(1);
				objAssertAboutUs.VerifyChildComponent_ImageShape("SideBySide", 0);
				break;
			case "SideBySideCentered":			
				//objAssertAboutUs.VerifyCommonComponent_2DIVs_H1("SideBySideCentered");
				objAssertAboutUs.VerifyCommonComponent_Div_Div_H2("SideBySideCentered");
				objAssertAboutUsTwoItem.VerifySideBySideCentered_HeaderText();
				//objAssertAboutUs.VerifyCommonComponent_4DIVs_H2("SideBySideCentered");
				objAssertAboutUs.VerifyCommonComponent_4DIVs_H3("SideBySideCentered");
				objAssertAboutUsTwoItem.VerifySideBySideCentered_Image();
				objAssertAboutUsTwoItem.VerifySideBySideCentered_Text();	
				objAssertAboutUs.VerifyTitleText_ContentTitle("//div[2]/div/div/div/div/div/div[", "h2");
				objAssertAboutUs.VerifyCommonComponent_ImageShape(1);
				break;
			case "3Items3Columns": 
				try
				{
					sitecoreObj.aboutusThreeItemMoreButton.click();
					Thread.sleep(5000);
				}catch(org.openqa.selenium.NoSuchElementException e){}
				
				objAssertAboutUsThreeItem.VerifyThreeColumn_Container();
				objAssertAboutUs.VerifyThreeItem_ContainerTitle("ThreeItem / ThreeColumn");			
				objAssertAboutUsThreeItem.VerifyThreeColumn_Content();
				objAssertAboutUsThreeItem.VerifyThreeColumn_ContentImage();
				objAssertAboutUsThreeItem.VerifyThreeColumn_ContentImageLink();
				objAssertAboutUs.VerifyCommonComponent_3DIVs_H3("ThreeItem / ThreeColumn");			
				objAssertAboutUsThreeItem.VerifyThreeColumn_ContentTitleLink();			
				objAssertAboutUs.VerifyCommonComponent_3DIVs_P("ThreeItem / ThreeColumn");
				objAssertAboutUs.VerifyTitleText_ContentTitle("//div[", "h3");
				objAssertAboutUs.VerifyThreeItem_MoreContainer("ThreeItem / ThreeColumn");
				objAssertAboutUs.VerifyThreeItem_LessButton("ThreeItem / ThreeColumn");	
				objAssertAboutUs.VerifyCommonComponent_ImageShape(2);
				break;
			case "StackedImageLeft": 
				try
				{
					sitecoreObj.aboutusThreeItemMoreButton.click();
					Thread.sleep(5000);
				}catch(org.openqa.selenium.NoSuchElementException e){}
				
				objAssertAboutUsThreeItem.VerifyStackedImageLeft_Container();
				objAssertAboutUs.VerifyThreeItem_ContainerTitle("ThreeItem / StackedImageLeft");			
				objAssertAboutUsThreeItem.VerifyStackedImageLeft_Content();
				objAssertAboutUsThreeItem.VerifyStackedImageLeft_ContentImage();
				objAssertAboutUsThreeItem.VerifyStackedImageLeft_ContentImageLink();
				objAssertAboutUsThreeItem.VerifyStackedImageLeft_ContentTitle();
				objAssertAboutUsThreeItem.VerifyStackedImageLeft_ContentTitleLink();
				objAssertAboutUsThreeItem.VerifyStackedImageLeft_ContentDescription();//Modified
				objAssertAboutUs.VerifyTitleText_ContentTitle("//div/div[2]/div/div/div[1]/div/div[", "div/h3/a");
				objAssertAboutUs.VerifyThreeItem_MoreContainer("ThreeItem / StackedImageLeft");
				objAssertAboutUs.VerifyThreeItem_LessButton("ThreeItem / StackedImageLeft");
				objAssertAboutUs.VerifyCommonComponent_ImageShape(2);
				break;
			case "3ColumnsLinksOverlaid": 
				objAssertAboutUsThreeItem.VerifyThreeColumnsLinksOverlaid_Link();
				objAssertAboutUsThreeItem.VerifyThreeColumnsLinksOverlaid_Text();//Modified
				objAssertAboutUs.VerifyTitleText_ContentTitle("//div[2]/div/div/div/div[", "a/span");
				objAssertAboutUs.VerifyCommonComponent_ImageShape(2);
				break;			
			case "4Items4ColumnsRectangle": 
				objAssertAboutUsFourItem.VerifyFourItemsFourColumnsRectangle_Title();
				objAssertAboutUsFourItem.VerifyFourItemsFourColumnsRectangle_Description();
				objAssertAboutUsFourItem.VerifyFourItemsFourColumnsRectangle_Image();
				objAssertAboutUsFourItem.VerifyFourItemsFourColumnsRectangle_Text();
				objAssertAboutUs.VerifyDescText_ContentDesc("//div[", "]/div/p");
				objAssertAboutUs.VerifyCommonComponent_ImageShape(2);
				break;
			case "4ItemsWithInset": 
				objAssertAboutUsFourItem.VerifyFourItemsWithInset_Title();
				objAssertAboutUsFourItem.VerifyFourItemsWithInset_Description();
				objAssertAboutUsFourItem.VerifyFourItemsWithInset_Image();
				objAssertAboutUsFourItem.VerifyFourItemsWithInset_Text();
				objAssertAboutUsFourItem.VerifyFourItemsWithInset_DataImage();
				objAssertAboutUsFourItem.VerifyFourItemsWithInset_DataText();
				objAssertAboutUs.VerifyDescText_ContentDesc("//div[", "]/div/p");
				objAssertAboutUs.VerifyCommonComponent_ImageShape(1);
				objAssertAboutUsFourItem.VerifyFourItemsWithInset_ImageShapeWithImagePosition(1, 1);
				break;
			case "4Items2Columns":
				try
				{
					sitecoreObj.aboutusThreeItemMoreButton.click();
					Thread.sleep(5000);
				}catch(org.openqa.selenium.NoSuchElementException e){}
				objAssertAboutUs.VerifyThreeItem_ContainerTitle("Four Items / Two Columns");
				objAssertAboutUsFourItem.VerifyFourItemsTwoColumn_Image();
				objAssertAboutUsFourItem.VerifyFourItemsTwoColumn_Text();
				objAssertAboutUsFourItem.VerifyFourItemsTwoColumn_ListImage();
				objAssertAboutUsFourItem.VerifyFourItemsTwoColumn_ListText();
				objAssertAboutUs.VerifyTitleText_ContentTitle("//div[", "div/h3/a");
				objAssertAboutUs.VerifyThreeItem_MoreContainer("Four Items / Two Columns");
				objAssertAboutUs.VerifyThreeItem_LessButton("Four Items / Two Columns");	
				objAssertAboutUs.VerifyCommonComponent_ImageShape(2);
				break;
			case "4Items4ColumnsSquare": 
				try
				{
					sitecoreObj.aboutusThreeItemMoreButton.click();
					Thread.sleep(5000);
				}catch(org.openqa.selenium.NoSuchElementException e){}
				objAssertAboutUsFourItem.VerifyFourItemsFourColumnsSquare_Title("Four Items / Four Columns Square");
				objAssertAboutUsFourItem.VerifyFourItemsFourColumnsSquare_Image();
				objAssertAboutUsFourItem.VerifyFourItemsFourColumnsSquare_AppImage();		
				objAssertAboutUs.VerifyTitleText_ContentTitle("//div[", "h3");
				objAssertAboutUs.VerifyDescText_ContentDesc("//div[2]/div/div/div/div/div[", "]/div/p");
				objAssertAboutUs.VerifyThreeItem_MoreContainer("Four Items / Four Columns Square");
				objAssertAboutUs.VerifyThreeItem_LessButton("Four Items / Four Columns Square");	
				objAssertAboutUs.VerifyCommonComponent_ImageShape(2);
				break;
			case "5Column":			
				try
				{
					sitecoreObj.aboutusThreeItemMoreButton.click();
					Thread.sleep(5000);
				}catch(org.openqa.selenium.NoSuchElementException e){}
				objAssertAboutUs.VerifyCommonComponent_Div_H2("5Items / 5Columns");
				objAssertAboutUsFiveItem.VerifyFiveColumn_Container();
				objAssertAboutUsFiveItem.VerifyFiveColumn_Content();
				objAssertAboutUsFiveItem.VerifyFiveColumn_ContentImage();
				objAssertAboutUs.VerifyCommonComponent_2DIVs_H3("5Items / 5Columns");
				objAssertAboutUsFiveItem.VerifyFiveColumn_ContentDescription();
				objAssertAboutUsFiveItem.VerifyFiveColumn_ContentMoreLink();	
				objAssertAboutUs.VerifyTitleText_ContentTitle("//div[", "h3");
				objAssertAboutUs.VerifyThreeItem_MoreContainer("5Items / 5Columns");
				objAssertAboutUs.VerifyThreeItem_LessButton("5Items / 5Columns");
				objAssertAboutUs.VerifyCommonComponent_ImageShape(2);
				break;
			case "2x3":
				objAssertAboutUsFiveItem.Verify2x3_Container();
				//Child Component Item for content Verification
				objAssertAboutUsFiveItem.Verify2x3_Content();	
				
				//Article Component Item for content Verification
				//objAssertAboutUsFiveItem.Verify2x3_ContentForArticle();
				
				objAssertAboutUsFiveItem.Verify2x3_ContentLink();
				objAssertAboutUsFiveItem.Verify2x3_ContentImage();
				objAssertAboutUsFiveItem.Verify2x3_ContentText();
				objAssertAboutUs.VerifyTitleText_ContentTitle("//div[2]/div/div/div/div[", "a/span");
				objAssertAboutUs.VerifyCommonComponent_ImageShape(2);
				break;				
			case "6Items3Columns": 
				try
				{
					sitecoreObj.aboutusThreeItemMoreButton.click();
					Thread.sleep(5000);
				}catch(org.openqa.selenium.NoSuchElementException e){}
				objAssertAboutUs.VerifyThreeItem_ContainerTitle("Six Items / Three Columns");
				objAssertAboutUsSixItem.VerifySixItemsThreeColumn_ContentImage();
				objAssertAboutUsSixItem.VerifySixItemsThreeColumn_ContentImageLink();
				objAssertAboutUs.VerifyThreeItem_MoreContainer("Six Items / Three Columns");
				objAssertAboutUs.VerifyThreeItem_LessButton("Six Items / Three Columns");
				objAssertAboutUs.VerifyCommonComponent_ImageShape(2);
				break;
			case "6Items6Columns":
				objAssertAboutUs.VerifyThreeItem_ContainerTitle("Six Items / Six Columns");
				objAssertAboutUsSixItem.VerifySixItemsSixColumn_ContentImage();
				objAssertAboutUs.VerifyCommonComponent_ImageShape(2);
				break;
			case "6Items6ColumnsWithText": 
				try
				{
					sitecoreObj.aboutusThreeItemMoreButton.click();
					Thread.sleep(5000);
				}catch(org.openqa.selenium.NoSuchElementException e){}
				objAssertAboutUs.VerifyCommonComponent_Div_H2("Six Items / Six Columns With Text");			
				objAssertAboutUsSixItem.VerifySixColumnWithText_ContentImage();
				objAssertAboutUs.VerifyCommonComponent_2DIVs_H3("Six Items / Six Columns With Text");
				objAssertAboutUs.VerifyCommonComponent_2DIVs_P("Six Items / Six Columns With Text");
				objAssertAboutUsSixItem.VerifySixColumnWithText_ContentMoreLink();
				objAssertAboutUs.VerifyTitleText_ContentTitle("//div[", "h3");
				objAssertAboutUs.VerifyThreeItem_MoreContainer("Six Items / Six Columns With Text");
				objAssertAboutUs.VerifyThreeItem_LessButton("Six Items / Six Columns With Text");
				objAssertAboutUs.VerifyCommonComponent_ImageShape(2);
				break;
			case "6Items2Columns": 
				objAssertAboutUsSixItem.VerifySixItemsTwoColumns_Title();
				objAssertAboutUsSixItem.VerifySixItemsTwoColumns_Description();
				objAssertAboutUsSixItem.VerifySixItemsTwoColumns_Image();
				objAssertAboutUsSixItem.VerifySixItemsTwoColumns_Text();
				objAssertAboutUs.VerifyDescText_ContentDesc("//li[", "]/div/p");
				break;			
			case "HeaderImageLeft":
				objAssertAboutUsHeaderItem.VerifyHeaderImageOnLeft();
				objAssertAboutUs.VerifyCommonComponent_2DIVs_H2("HeaderItem ImageLeft");
				objAssertAboutUs.VerifyCommonComponent_2DIVs_P("HeaderItem ImageLeft");
				objAssertAboutUs.VerifyCommonComponent_ImageShape(2);
				break;
			case "HeaderImageRight":
				objAssertAboutUsHeaderItem.VerifyHeaderImageOnRight();
				objAssertAboutUs.VerifyHeaderItem_CommonComponent_Div_H2("HeaderItem ImageRight");
				objAssertAboutUs.VerifyCommonComponent_2DIVs_P("HeaderItem ImageRight");
				objAssertAboutUs.VerifyListIcon("HeaderItem ImageRight");
				objAssertAboutUs.VerifyListText("HeaderItem ImageRight");
				objAssertAboutUs.VerifyCommonComponent_ImageShape(2);
				break;
			case "HeaderImageTop":
				objAssertAboutUsHeaderItem.VerifyHeaderImageOnTop();
				objAssertAboutUs.VerifyHeaderItem_CommonComponent_Div_H2("HeaderItem ImageTop");
				objAssertAboutUs.VerifyCommonComponent_2DIVs_P("HeaderItem ImageTop");
				objAssertAboutUs.VerifyCommonComponent_ImageShape(2);
				break;
			case "HeaderVideoRight":
				objAssertAboutUs.VerifyHeaderItem_CommonComponent_Div_Div2_H2("HeaderItem VideoRight");
				objAssertAboutUs.VerifyHeaderItem_CommonComponent_Div_Div2_P("HeaderItem VideoRight");
				objAssertAboutUsHeaderItem.VerifyHeaderVideo();
				objAssertAboutUsHeaderItem.HeaderVideoLinkItems();
				objAssertAboutUs.VerifyTitleText_ContentTitle("//div[2]/div/div/div/ul/li[", "a");
				break;
			case "HeaderImageCarousel":
				objAssertAboutUs.VerifyHeaderItem_CommonComponent_Div_H2("HeaderItem ImageCarousel");
				objAssertAboutUsHeaderItem.VerifyHeaderImageCarousel();
				objAssertAboutUsHeaderItem.VerifyHeaderImageCarouselDescription();
				break;
			case "Article":
				objAssertAboutUsArticle.VerifyArticle_BreadCrumbs();
				objAssertAboutUsArticle.VerifyArticle_Title();
				objAssertAboutUsArticle.VerifyArticle_Author();
				objAssertAboutUsArticle.VerifyArticle_Topic();
				objAssertAboutUsArticle.VerifyArticle_Image();
				objAssertAboutUsArticle.VerifyArticle_Description();
				break;	
			case "ArticlePubDate": 
				objAssertAboutUsArticle.VerifyArticle_PublicationDate();
				break;
			case "ArticleIsFeatured":
				objAssertAboutUsArticle.VerifyRecentArticleTitleText_ContentTitle();
				break;
			case "ShowHideImageLeft":
				try{
					sitecoreObj.aboutusShowHideImageLeftPlus.click();	
					Thread.sleep(5000);
				}catch(org.openqa.selenium.NoSuchElementException e){}
				objAssertAboutUs.VerifyCommonComponent_Div_H2("ShowHide ImageLeft");
				objAssertAboutUsShowhide.VerifyImage_ShowhideImageLeft();
				objAssertAboutUs.VerifyCommonComponent_2DIVs_P("ShowHide ImageLeft");
				objAssertAboutUsShowhide.VerifyExpandableHeader_ShowhideImageLeft();
				objAssertAboutUsShowhide.VerifyExpandableContent_ShowhideImageLeft();
				objAssertAboutUsShowhide.VerifyExpandableHeaderOpen_ShowhideImageLeft();
				objAssertAboutUsShowhide.VerifyExpandableContentOpen_ShowhideImageLeft();	
				objAssertAboutUsShowhide.VerifyTitleText_ContentTitle("//h3[");
				objAssertAboutUs.VerifyCommonComponent_ImageShape(2);
				break;
			case "ShowHideBasic":
				try
				{
					sitecoreObj.aboutusShowHideBasicPlus.click();
					Thread.sleep(5000);
				}catch(org.openqa.selenium.NoSuchElementException e){}
				objAssertAboutUs.VerifyCommonComponent_Div_H2("ShowHide Basic");			
				objAssertAboutUsShowhide.VerifyExpandableHeader_ShowhideImageLeft();
				objAssertAboutUsShowhide.VerifyExpandableContent_ShowhideImageLeft();
				objAssertAboutUsShowhide.VerifyExpandableHeaderOpen_ShowhideImageLeft();
				objAssertAboutUsShowhide.VerifyExpandableContentOpen_ShowhideImageLeft();
				objAssertAboutUsShowhide.VerifyTitleText_ContentTitle("//h3[");
				break;	
			case "ShowHideArticleGroupByYear":
				try
				{
					sitecoreObj.aboutusShowHideBasicPlus.click();
					Thread.sleep(5000);
				}catch(org.openqa.selenium.NoSuchElementException e){}
				objAssertAboutUs.VerifyCommonComponent_Div_H2("ShowHide Basic");			
				objAssertAboutUsShowhide.VerifyExpandableHeader_ShowhideImageLeft();
				objAssertAboutUsShowhide.VerifyExpandableContent_ShowhideImageLeft();
				objAssertAboutUsShowhide.VerifyExpandableHeaderOpen_ShowhideImageLeft();
				objAssertAboutUsShowhide.VerifyExpandableContentOpen_ShowhideImageLeft();
				objAssertAboutUsShowhide.VerifyGroupByYear();
				break;	
			case "TimeLineBasic":
				objAssertAboutUsTimelineItem.VerifyTimelineBasic_container();
				objAssertAboutUsTimelineItem.VerifyTimelineBasic_Content();
				objAssertAboutUsTimelineItem.VerifyTimelineBasic_Year();
				objAssertAboutUsTimelineItem.VerifyTimelineBasic_Month();
				objAssertAboutUs.VerifyTitleText_ContentTitle("//li[", "div/h3/span");
				break;	
			case "PageComponentHeader":
				try
				{
					sitecoreObj_PageComponentHeader.aboutusPageComponentMoreButton.click();
					Thread.sleep(9999);
				}catch(org.openqa.selenium.NoSuchElementException e){}
				objAssertAboutUsPageComponentHeader.VerifyPageComponentHeader_Title();
				objAssertAboutUsPageComponentHeader.VerifyPageComponentHeader_SiblingsTitle();
				objAssertAboutUsPageComponentHeader.VerifyPageComponentHeader_MoreSiblingsContainer();				
				objAssertAboutUsPageComponentHeader.VerifyPageComponentHeader_MoreSiblingsTitle();
				break;
			case "InitiativeLeftHeroImage":
				objAssertCustomInitiative.VerifyCustomInitiative_TitleImage();
				objAssertCustomInitiative.VerifyCustomInitiative_HeroImageLeft();
				objAssertCustomInitiative.VerifyCustomInitiative_Title();
				objAssertCustomInitiative.VerifyCustomInitiative_Description();
				objAssertCustomInitiative.VerifyCustomInitiative_Button();
				break;
			case "InitiativeRightHeroImage":
				objAssertCustomInitiative.VerifyCustomInitiative_TitleImage();
				objAssertCustomInitiative.VerifyCustomInitiative_HeroImageRight();
				objAssertCustomInitiative.VerifyCustomInitiative_Title();
				objAssertCustomInitiative.VerifyCustomInitiative_Description();
				objAssertCustomInitiative.VerifyCustomInitiative_Button();
				break;
			case "InitiativeLeftHeroVideo":
				objAssertCustomInitiative.VerifyCustomInitiative_TitleImage();
				objAssertCustomInitiative.VerifyCustomInitiative_HeroVideoLeft();
				objAssertCustomInitiative.VerifyCustomInitiative_Title();
				objAssertCustomInitiative.VerifyCustomInitiative_Description();
				objAssertCustomInitiative.VerifyCustomInitiative_Button();
				break;
			case "InitiativeRightHeroVideo":
				objAssertCustomInitiative.VerifyCustomInitiative_TitleImage();
				objAssertCustomInitiative.VerifyCustomInitiative_HeroVideoRight();
				objAssertCustomInitiative.VerifyCustomInitiative_Title();
				objAssertCustomInitiative.VerifyCustomInitiative_Description();
				objAssertCustomInitiative.VerifyCustomInitiative_Button();
				break;
				
			default: break;
		}

		Driver.switchTo().window(GetChildWindow("CHILD")).close();
		Driver.switchTo().window(GetChildWindow("PARENT"));		
	}
	
// Navigate to Child window for AutoAboutUs Preview page
	public static String GetChildWindow(String mode){
		Set<String> window=Driver.getWindowHandles();
		Iterator<String> itr = window.iterator();
		String parentName = itr.next();
		
		if (mode.equals("PARENT")){		
			return parentName;
		}
		
		try{
			return itr.next();
			}
		catch(Exception e){
			System.out.println(e);
		}
		
		return "Dummy";
	}	
}
