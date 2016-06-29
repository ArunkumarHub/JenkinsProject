package fotf_Operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import fotf_Config.Basedriver;

public class Opr_AboutUs_AssertElement extends Basedriver{
	static String actualRightImg;
	static String actualLeftImg;
	static String actualRightButton;
	static String actualLeftButton;
	static boolean actualTitleImg;
	static boolean actualTitleButton;
	static boolean actualDescriptionButton;
	static String actualCenterImg;
	static String actualCenterButton;
	static String actualListIcon;
	static String actualListText;
	static String actualLeftAlignImg;
	static String actualLeftAligndesc;	
	static String actualRightAlignImg;
	static String actualRightAligndesc;	
	static boolean actualHeaderText;
	
		
	// Verify Title Element for the Image Component on AutoAboutUs Preview page
	public static void VerifyCommonComponent_H2(String renderingControl){
		try{
			actualTitleImg=sitecoreObj.aboutusCommonComponent_H2.isDisplayed();
			Assert.assertEquals(actualTitleImg, true);
			log.info("The Actual AboutUs " + renderingControl + " Title - <"+sitecoreObj.aboutusCommonComponent_H2.getTagName()+">");
			log.info("The Expected AboutUs " + renderingControl + " Title - <h2>");
			log.info("TEST PASSED: The Actual and Expected AboutUs " + renderingControl + " Title are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs " + renderingControl + " Title - "+sitecoreObj.aboutusCommonComponent_H2.getTagName());
			log.error("The Expected AboutUs " + renderingControl + " Title - <h2>");
			log.error("TEST FAILED: The Actual and Expected AboutUs " + renderingControl + " Title are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Title On " + renderingControl + " element");
		}		
	}

	// Verify Title Element for the Button Component on AutoAboutUs Preview page
	public static void VerifyCommonComponent_Div_H2(String renderingControl){
		try{
			actualTitleButton=sitecoreObj.aboutusCommonComponent_Div_H2.isDisplayed();
			Assert.assertEquals(actualTitleButton, true);
			log.info("The Actual AboutUs " + renderingControl + " Title - <"+sitecoreObj.aboutusCommonComponent_Div_H2.getTagName()+">");
			log.info("The Expected AboutUs " + renderingControl + " Title - <h2>");
			log.info("TEST PASSED: The Actual and Expected AboutUs " + renderingControl + " Title are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs " + renderingControl + " Title - "+sitecoreObj.aboutusCommonComponent_Div_H2.getTagName());
			log.error("The Expected AboutUs " + renderingControl + " Title - <h2>");
			log.error("TEST FAILED: The Actual and Expected AboutUs " + renderingControl + " Title are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Title On " + renderingControl + " element");
		}		
	}
			
	// Verify Description Element for the Button Component on AutoAboutUs Preview page
	public static void VerifyCommonComponent_Div_P(String renderingControl){
		try{
			actualDescriptionButton=sitecoreObj.aboutusCommonComponent_Div_P.isDisplayed();
			Assert.assertEquals(actualDescriptionButton, true);
			log.info("The Actual AboutUs " + renderingControl + " Description - <"+sitecoreObj.aboutusCommonComponent_Div_P.getTagName()+">");
			log.info("The Expected AboutUs " + renderingControl + " Description - <p>");
			log.info("TEST PASSED: The Actual and Expected AboutUs " + renderingControl + " Description are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs " + renderingControl + " Description - "+sitecoreObj.aboutusCommonComponent_Div_P.getTagName());
			log.error("The Expected AboutUs " + renderingControl + " Description - <p>");
			log.error("TEST FAILED: The Actual and Expected AboutUs " + renderingControl + " Description are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Description On " + renderingControl + " element");
		}
	}	
	
			
	// Verify List Icon Element for AutoAboutUs Preview page
	public static void VerifyListIcon(String renderingControl){
		try{
			actualListIcon=sitecoreObj.aboutusListIcon.getAttribute("class");
			Assert.assertEquals(actualListIcon, expectedData.getProperty("aboutusListIcon"));
			log.info("The Actual AboutUs " + renderingControl + " List Icon - "+actualListIcon);
			log.info("The Expected AboutUs " + renderingControl + " List Icon - "+expectedData.getProperty("aboutusListIcon"));
			log.info("TEST PASSED: The Actual and Expected AboutUs " + renderingControl + " List Icon are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs " + renderingControl + " List Icon - "+actualListIcon);
			log.error("The Expected AboutUs " + renderingControl + " List Icon - "+expectedData.getProperty("aboutusListIcon"));
			log.error("TEST FAILED: The Actual and Expected AboutUs " + renderingControl + " List Icon are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No List Icon on " + renderingControl + " element");
		}
	}
				
	// Verify List Text Element for AutoAboutUs Preview page
	public static void VerifyListText(String renderingControl){
		try{
			actualListText=sitecoreObj.aboutusListText.getAttribute("class");
			Assert.assertEquals(actualListText, expectedData.getProperty("aboutusListText"));
			log.info("The Actual AboutUs " + renderingControl + " List Text - "+actualListText);
			log.info("The Expected AboutUs " + renderingControl + " List Text - "+expectedData.getProperty("aboutusListText"));
			log.info("TEST PASSED: The Actual and Expected AboutUs " + renderingControl + " List Text are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs " + renderingControl + " List Text - "+actualListText);
			log.error("The Expected AboutUs " + renderingControl + " List Text - "+expectedData.getProperty("aboutusListText"));
			log.error("TEST FAILED: The Actual and Expected AboutUs " + renderingControl + " List Text are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No List Text on " + renderingControl + " element");
		}
	}
	
	// Verify Header Left / Right / Top Title for AutoAboutUs Preview page
	public static void VerifyCommonComponent_2DIVs_H2(String renderingControl){				
		try{
			actualHeaderText=sitecoreObj.aboutusCommonComponent_2Divs_H2.isDisplayed();
			Assert.assertEquals(actualHeaderText, true);
			log.info("The Actual AboutUs " + renderingControl + " Title - <"+sitecoreObj.aboutusCommonComponent_2Divs_H2.getTagName()+">");
			log.info("The Expected AboutUs " + renderingControl + " Title - <h2>");	
			log.info("TEST PASSED: The Actual and Expected AboutUs " + renderingControl + " Title are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs " + renderingControl + " Title - <"+sitecoreObj.aboutusCommonComponent_2Divs_H2.getTagName()+">");
			log.error("The Expected AboutUs " + renderingControl + " Title - <h2>");						
			log.error("TEST FAILED: The Actual and Expected AboutUs " + renderingControl + " Title are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Title On " + renderingControl + " element");
		}
	}
	
	// Verify Header Left / Right / Top Title for AutoAboutUs Preview page
	public static void VerifyCommonComponent_2DIVs_H1(String renderingControl){				
		try{
			actualHeaderText=sitecoreObj.aboutusCommonComponent_2Divs_H1.isDisplayed();
			Assert.assertEquals(actualHeaderText, true);
			log.info("The Actual AboutUs " + renderingControl + " Title - <"+sitecoreObj.aboutusCommonComponent_2Divs_H1.getTagName()+">");
			log.info("The Expected AboutUs " + renderingControl + " Title - <h1>");	
			log.info("TEST PASSED: The Actual and Expected AboutUs " + renderingControl + " Title are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs " + renderingControl + " Title - <"+sitecoreObj.aboutusCommonComponent_2Divs_H1.getTagName()+">");
			log.error("The Expected AboutUs " + renderingControl + " Title - <h1>");						
			log.error("TEST FAILED: The Actual and Expected AboutUs " + renderingControl + " Title are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Title On " + renderingControl + " element");
		}
	}
				
	// Verify Header Left / Right / Top Description for AutoAboutUs Preview page
	public static void VerifyCommonComponent_2DIVs_P(String renderingControl){				
		try{
			actualHeaderText=sitecoreObj.aboutusCommonComponent_2Divs_P.isDisplayed();
			Assert.assertEquals(actualHeaderText, true);
			log.info("The Actual AboutUs " + renderingControl + " Description - <"+sitecoreObj.aboutusCommonComponent_2Divs_P.getTagName()+">");
			log.info("The Expected AboutUs " + renderingControl + " Description - <p>");	
			log.info("TEST PASSED: The Actual and Expected AboutUs " + renderingControl + " Description are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs " + renderingControl + " Description - <"+sitecoreObj.aboutusCommonComponent_2Divs_P.getTagName()+">");
			log.error("The Expected AboutUs " + renderingControl + " Description - <p>");						
			log.error("TEST FAILED: The Actual and Expected AboutUs " + renderingControl + " Description are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Description On " + renderingControl + " element");
		}
	}
	
	// Verify Header Left / Right / Top Title for AutoAboutUs Preview page
	public static void VerifyHeaderItem_CommonComponent_Div_H2(String renderingControl){				
		try{
			actualHeaderText=sitecoreObj.aboutusHeaderItemTitleRightTop.isDisplayed();
			Assert.assertEquals(actualHeaderText, true);
			log.info("The Actual AboutUs " + renderingControl + " Title - <"+sitecoreObj.aboutusHeaderItemTitleRightTop.getTagName()+">");
			log.info("The Expected AboutUs " + renderingControl + " Title - <h1>");	
			log.info("TEST PASSED: The Actual and Expected AboutUs " + renderingControl + " Title are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs " + renderingControl + " Title - <"+sitecoreObj.aboutusHeaderItemTitleRightTop.getTagName()+">");
			log.error("The Expected AboutUs " + renderingControl + " Title - <h1>");						
			log.error("TEST FAILED: The Actual and Expected AboutUs " + renderingControl + " Title are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Title On " + renderingControl + " element");
		}
	}
			
	//***********************************************************//
	// Video
	// Verify Title Element for the Video Component on AutoAboutUs Preview page
	public static void VerifyHeaderItem_CommonComponent_Div_Div2_H2(String renderingControl){
		try{
			actualTitleImg=sitecoreObj.aboutusCommonComponent_Div_Div2_H2.isDisplayed();
			Assert.assertEquals(actualTitleImg, true);
			log.info("The Actual AboutUs " + renderingControl + " Title - <"+sitecoreObj.aboutusCommonComponent_Div_Div2_H2.getTagName()+">");
			log.info("The Expected AboutUs " + renderingControl + " Title - <h1>");
			log.info("TEST PASSED: The Actual and Expected AboutUs " + renderingControl + " Title are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs " + renderingControl + " Title - "+sitecoreObj.aboutusCommonComponent_Div_Div2_H2.getTagName());
			log.error("The Expected AboutUs " + renderingControl + " Title - <h1>");
			log.error("TEST FAILED: The Actual and Expected AboutUs " + renderingControl + " Title are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Title On " + renderingControl + " element");
		}				
	}
	
	// Verify Header Video Description for AutoAboutUs Preview page
	public static void VerifyHeaderItem_CommonComponent_Div_Div2_P(String renderingControl){				
		try{
			actualHeaderText=sitecoreObj.aboutusCommonComponent_Div_Div2_P.isDisplayed();
			Assert.assertEquals(actualHeaderText, true);
			log.info("The Actual AboutUs " + renderingControl + " Description - <"+sitecoreObj.aboutusCommonComponent_Div_Div2_P.getTagName()+">");
			log.info("The Expected AboutUs " + renderingControl + " Description - <p>");	
			log.info("TEST PASSED: The Actual and Expected AboutUs " + renderingControl + " Description are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs " + renderingControl + " Description - <"+sitecoreObj.aboutusCommonComponent_Div_Div2_P.getTagName()+">");
			log.error("The Expected AboutUs " + renderingControl + " Description - <p>");						
			log.error("TEST FAILED: The Actual and Expected AboutUs " + renderingControl + " Description are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Description On " + renderingControl + " element");
		}
	}
			
	// Verify ContentTitle Element for the FiveColumn Component on AutoAboutUs Preview page
	public static void VerifyCommonComponent_2DIVs_H3(String renderingControl){
		boolean actualFiveColumnContentTitle = false;
		try{
			actualFiveColumnContentTitle=sitecoreObj.aboutusCommonComponent_2DIVs_H3.isDisplayed();
			Assert.assertEquals(actualFiveColumnContentTitle, true);
			log.info("The Actual AboutUs " + renderingControl + " ContentTitle - <"+sitecoreObj.aboutusCommonComponent_2DIVs_H3.getTagName()+">");
			log.info("The Expected AboutUs " + renderingControl + " ContentTitle - <h3>");
			log.info("TEST PASSED: The Actual and Expected AboutUs " + renderingControl + " ContentTitle are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs " + renderingControl + " ContentTitle - <"+sitecoreObj.aboutusCommonComponent_2DIVs_H3.getTagName() +">");
			log.error("The Expected AboutUs " + renderingControl + " ContentTitle - <h3>");
			log.error("TEST FAILED: The Actual and Expected AboutUs " + renderingControl + " ContentTitle are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No ContentTitle element On " + renderingControl + " Container");
		}		
	}
	
	// Verify SideBySide Component Title for AutoAboutUs Preview page
	public static void VerifyCommonComponent_Div_Div_H2(String renderingControl){
		boolean actualSideBySideTitle = false;
		try{
			actualSideBySideTitle=sitecoreObj.aboutusCommonComponent_Div_Div_H2.isDisplayed();
			Assert.assertEquals(actualSideBySideTitle, true);
			log.info("The Actual AboutUs " + renderingControl + " Title - <"+sitecoreObj.aboutusCommonComponent_Div_Div_H2.getTagName()+">");
			log.info("The Expected AboutUs " + renderingControl + " Title - <h2>");
			log.info("TEST PASSED: The Actual and Expected AboutUs " + renderingControl + " Titles are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs " + renderingControl + " Title - <"+sitecoreObj.aboutusCommonComponent_Div_Div_H2.getTagName()+">");
			log.error("The Expected AboutUs " + renderingControl + " Title - <h2>");
			log.error("TEST FAILED: The Actual and Expected AboutUs " + renderingControl + " Titles are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Title element On " + renderingControl + " Container");
		}		
	}
	
	// Verify Text Element for the SideBySide Component on AutoAboutUs Preview page
		public static void VerifyCommonComponent_3DIVs_H3(String renderingControl){
			boolean actualSideBySideText = false;
			try{
				actualSideBySideText=sitecoreObj.aboutusCommonComponent_3DIVs_H3.isDisplayed();
				Assert.assertEquals(actualSideBySideText, true);
				log.info("The Actual AboutUs " + renderingControl + " Text - <"+sitecoreObj.aboutusCommonComponent_3DIVs_H3.getTagName()+">");
				log.info("The Expected AboutUs " + renderingControl + " Text - <h3>");
				log.info("TEST PASSED: The Actual and Expected AboutUs " + renderingControl + " Texts are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs " + renderingControl + " Text - <"+sitecoreObj.aboutusCommonComponent_3DIVs_H3.getTagName()+">");
				log.error("The Expected AboutUs " + renderingControl + " Text - <h3>");
				log.error("TEST FAILED: The Actual and Expected AboutUs " + renderingControl + " Texts are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Text element On " + renderingControl + " Container");
			}		
		}
	
	// Verify Text Element for the SideBySide Component on AutoAboutUs Preview page
	public static void VerifyCommonComponent_3DIVs_P(String renderingControl){
		boolean actualSideBySideText = false;
		try{
			actualSideBySideText=sitecoreObj.aboutusCommonComponent_3DIVs_P.isDisplayed();
			Assert.assertEquals(actualSideBySideText, true);
			log.info("The Actual AboutUs " + renderingControl + " Text - <"+sitecoreObj.aboutusCommonComponent_3DIVs_P.getTagName()+">");
			log.info("The Expected AboutUs " + renderingControl + " Text - <p>");
			log.info("TEST PASSED: The Actual and Expected AboutUs " + renderingControl + " Texts are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs " + renderingControl + " Text - <"+sitecoreObj.aboutusCommonComponent_3DIVs_P.getTagName()+">");
			log.error("The Expected AboutUs " + renderingControl + " Text - <p>");
			log.error("TEST FAILED: The Actual and Expected AboutUs " + renderingControl + " Texts are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Text element On " + renderingControl + " Container");
		}		
	}
	
	// Verify SideBySideCentered Component Title for AutoAboutUs Preview page
	public static void VerifyCommonComponent_4DIVs_H2(String renderingControl){
		boolean actualSideBySideCenteredTitle = false;
		try{
			actualSideBySideCenteredTitle=sitecoreObj.aboutusCommonComponent_4DIVs_H2.isDisplayed();
			Assert.assertEquals(actualSideBySideCenteredTitle, true);
			log.info("The Actual AboutUs " + renderingControl + " Title - <"+sitecoreObj.aboutusCommonComponent_4DIVs_H2.getTagName()+">");
			log.info("The Expected AboutUs " + renderingControl + " Title - <h2>");
			log.info("TEST PASSED: The Actual and Expected AboutUs " + renderingControl + " Titles are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs " + renderingControl + " Title - <"+sitecoreObj.aboutusCommonComponent_4DIVs_H2.getTagName()+">");
			log.error("The Expected AboutUs " + renderingControl + " Title - <h2>");
			log.error("TEST FAILED: The Actual and Expected AboutUs " + renderingControl + " Titles are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Title element On " + renderingControl + " Container");
		}		
	}
	
	// Verify SideBySideCentered Component Title for AutoAboutUs Preview page
		public static void VerifyCommonComponent_4DIVs_H3(String renderingControl){
			boolean actualSideBySideCenteredTitle = false;
			try{
				actualSideBySideCenteredTitle=sitecoreObj.aboutusCommonComponent_4DIVs_H3.isDisplayed();
				Assert.assertEquals(actualSideBySideCenteredTitle, true);
				log.info("The Actual AboutUs " + renderingControl + " Title - <"+sitecoreObj.aboutusCommonComponent_4DIVs_H3.getTagName()+">");
				log.info("The Expected AboutUs " + renderingControl + " Title - <h2>");
				log.info("TEST PASSED: The Actual and Expected AboutUs " + renderingControl + " Titles are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs " + renderingControl + " Title - <"+sitecoreObj.aboutusCommonComponent_4DIVs_H3.getTagName()+">");
				log.error("The Expected AboutUs " + renderingControl + " Title - <h2>");
				log.error("TEST FAILED: The Actual and Expected AboutUs " + renderingControl + " Titles are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Title element On " + renderingControl + " Container");
			}		
		}
	
	/***********************************************************************/
	// Verify Title Element for the [ThreeColumn / StackedImageLeft] / [Six Items / Three Columns] / [Four Items / Two Columns] Component on AutoAboutUs Preview page
	public static void VerifyThreeItem_ContainerTitle(String renderControl){
		boolean actualThreeItemTitle=false;
		try{
			actualThreeItemTitle=sitecoreObj.aboutusThreeItemContainerTitle.isDisplayed();
			Assert.assertEquals(actualThreeItemTitle, true);
			log.info("The Actual AboutUs " + renderControl + " Container Header Title - <"+sitecoreObj.aboutusThreeItemContainerTitle.getTagName()+">");
			log.info("The Expected AboutUs " + renderControl + " Container Header Title - <h2>");
			log.info("TEST PASSED: The Actual and Expected AboutUs " + renderControl + " Container Header Title are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs " + renderControl + " Container Header Title - <"+sitecoreObj.aboutusThreeItemContainerTitle.getTagName()+">");
			log.error("The Expected AboutUs " + renderControl + " Container Header Title - <h2>");
			log.error("TEST FAILED: The Actual and Expected AboutUs " + renderControl + " Container Header Title are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Container Header Title element On " + renderControl + " Container");
		}		
	}
	
	// Verify [ThreeColumn / StackedImageLeft] / [Six Items / Three Columns] Component MoreContainer for AutoAboutUs Preview page
	public static void VerifyThreeItem_MoreContainer(String renderControl){
		String actualMoreContainer="";
		try{
			actualMoreContainer=sitecoreObj.aboutusThreeItemMoreContainer.getAttribute("class");
			Assert.assertEquals(actualMoreContainer, expectedData.getProperty("ThreeItemMoreContainer"));
			log.info("The Actual AboutUs " + renderControl + " MoreContainer - "+actualMoreContainer);
			log.info("The Expected AboutUs " + renderControl + " MoreContainer - "+expectedData.getProperty("ThreeItemMoreContainer"));
			log.info("TEST PASSED: The Actual and Expected AboutUs " + renderControl + " MoreContainer are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs " + renderControl + " MoreContainer - "+actualMoreContainer);
			log.error("The Expected AboutUs " + renderControl + " MoreContainer - "+expectedData.getProperty("ThreeItemMoreContainer"));
			log.error("TEST FAILED: The Actual and Expected AboutUs " + renderControl + " MoreContainer are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No MoreContainer On " + renderControl + " Container");
		}
	}
	
	// Verify [ThreeColumn / StackedImageLeft] / [Six Items / Three Columns] Component LessButton for AutoAboutUs Preview page
	public static void VerifyThreeItem_LessButton(String renderControl){
		String actualLessButton="";
		try{
			actualLessButton=sitecoreObj.aboutusThreeItemLessButton.getAttribute("class");
			Assert.assertEquals(actualLessButton, expectedData.getProperty("ThreeItemLessButton"));
			log.info("The Actual AboutUs " + renderControl + " LessButton - "+actualLessButton);
			log.info("The Expected AboutUs " + renderControl + " LessButton - "+expectedData.getProperty("ThreeItemLessButton"));
			log.info("TEST PASSED: The Actual and Expected AboutUs " + renderControl + " LessButton are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs " + renderControl + " LessButton - "+actualLessButton);
			log.error("The Expected AboutUs " + renderControl + " LessButton - "+expectedData.getProperty("ThreeItemLessButton"));
			log.error("TEST FAILED: The Actual and Expected AboutUs " + renderControl + " LessButton are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No LessButton On " + renderControl + " Container");
		}
	}
	
	// Verify ContentTitle Element for the TitleText Component on AutoAboutUs Preview page
	public static void VerifyTitleText_ContentTitle(String xPath, String headerTag){
		String actualTitleTextContentTitle = null;
		for(int i=1; i<=3; i++){
		try{
			actualTitleTextContentTitle=Driver.findElement(By.xpath(xPath + i + "]/" + headerTag + "[1]")).getText();
			Assert.assertEquals(actualTitleTextContentTitle, dataSourceProvider.getProperty("Article" + i + "Title"));
			log.info("The Actual AboutUs Title Text is - "+actualTitleTextContentTitle);
			log.info("The Expected AboutUs Title Text is - "+dataSourceProvider.getProperty("Article" + i + "Title"));
			log.info("TEST PASSED: The Actual and Expected AboutUs  Title Text are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs Title Text is - "+actualTitleTextContentTitle);
			log.error("The Expected AboutUs Title Text is - "+dataSourceProvider.getProperty("Article" + i + "Title"));
			log.error("TEST FAILED: The Actual and Expected AboutUs TitleText ContentTitle are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Override article ContentTitle element On TitleText Container");
		}		
	  }
	}
	
	// Verify ContentDesc Element for the DescText Component on AutoAboutUs Preview page
		public static void VerifyDescText_ContentDesc(String xPath, String headerTag){
			String actualDescTextContentDesc = null;
			for(int i=1; i<=3; i++){
			try{
				actualDescTextContentDesc=Driver.findElement(By.xpath(xPath + i + headerTag)).getText();
				Assert.assertEquals(actualDescTextContentDesc, dataSourceProvider.getProperty("Article" + i + "Desc"));
				log.info("The Actual AboutUs Desc Text is - "+actualDescTextContentDesc);
				log.info("The Expected AboutUs Desc Text is - "+dataSourceProvider.getProperty("Article" + i + "Desc"));
				log.info("TEST PASSED: The Actual and Expected AboutUs  Desc Text are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs Desc Text is - "+actualDescTextContentDesc);
				log.error("The Expected AboutUs Desc Text is - "+dataSourceProvider.getProperty("Article" + i + "Desc"));
				log.error("TEST FAILED: The Actual and Expected AboutUs DescText ContentDesc are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Override article ContentDesc element On DescText Container");
			}		
		  }
		}
		
	// Verify Component Component Data Image shape for AutoAboutUs Preview page
		public static void VerifyCommonComponent_ImageShape(int ImageShape){
			String actualCommonComponentDataImage="";
			try{
				actualCommonComponentDataImage=sitecoreObj.commonComponentImageShape.getAttribute("class");
				Assert.assertEquals(actualCommonComponentDataImage, "common--component " + expectedData.getProperty("FourItemsWithInset_InsetImageShape"+ImageShape));
				log.info("The Actual AboutUs CommonComponent Data Image- "+actualCommonComponentDataImage);
				log.info("The Expected AboutUs CommonComponent Data Image- "+ "common--component " + expectedData.getProperty("FourItemsWithInset_InsetImageShape"+ImageShape));
				log.info("TEST PASSED: The Actual and Expected AboutUs CommonComponent Inset Images are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs CommonComponent Data Image- "+actualCommonComponentDataImage);
				log.error("The Expected AboutUs CommonComponent Data Image- "+ "common--component " + expectedData.getProperty("FourItemsWithInset_InsetImageShape"+ImageShape)); 
				log.error("TEST FAILED: The Actual and Expected AboutUs CommonComponent Inset Images are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Inset Images and  On CommonComponent Container");
			}
		}	
		
	// Verify Component Component Data Image shape for AutoAboutUs Preview page
			public static void VerifyChildComponent_ImageShape(String renderControl, int ImageShape){
				String actualChildComponentDataImage="";
				String expectedChildComponentDataImage = expectedData.getProperty("FourItemsWithInset_InsetImageShape"+ImageShape);
				try{
					actualChildComponentDataImage=sitecoreObj.childComponentImageShape.getAttribute("class");
					if(ImageShape==0){
						Assert.assertEquals(actualChildComponentDataImage, "twoitems_sidebyside_item ");
					}else{
						Assert.assertEquals(actualChildComponentDataImage, "twoitems_sidebyside_item " + expectedChildComponentDataImage);
					}
					log.info("The Actual AboutUs " + renderControl + " Image- " + actualChildComponentDataImage);
					log.info("The Expected AboutUs " + renderControl + " Image- " + "twoitems_sidebyside_item " + expectedChildComponentDataImage);
					log.info("TEST PASSED: The Actual and Expected AboutUs " + renderControl + " Images are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs " + renderControl + " Image- " + actualChildComponentDataImage);
					log.error("The Expected AboutUs " + renderControl + " Image- " + "twoitems_sidebyside_item " + expectedChildComponentDataImage); 
					log.error("TEST FAILED: The Actual and Expected AboutUs " + renderControl + " Images are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No Images On ChildComponent Container");
				}
			}
		
	// Verify Component Component Data Image shape and Size for AutoAboutUs Preview page
		public static void VerifyCommonComponent_ImageShapeWithImageSize(String renderControl, int imageShape, int imageSize){
			String actualCommonComponentImage = "";
			String expectedCommonComponentImage = "common--component" 
					+ " " + expectedData.getProperty("CommonComponent_ImageShape" + imageShape) 
					+ " " + expectedData.getProperty("CommonComponent_ImageSize" + imageSize);
			try{
				actualCommonComponentImage = sitecoreObj.commonComponentImageShape.getAttribute("class");				
				Assert.assertEquals(actualCommonComponentImage, expectedCommonComponentImage);
				
				log.info("The Actual AboutUs OneItem/"+ renderControl + " Image Shape and Size - " + actualCommonComponentImage);
				log.info("The Expected AboutUs OneItem/"+ renderControl + " Image Shape and Size - " + expectedCommonComponentImage);
				log.info("TEST PASSED: The Actual and Expected AboutUs OneItem/"+ renderControl + " Image Shape and Size are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs OneItem/"+ renderControl + " Image Shape and Size - " + actualCommonComponentImage);
				log.error("The Expected AboutUs OneItem/"+ renderControl + " Image Shape and Size - " + expectedCommonComponentImage);
				log.error("TEST FAILED: The Actual and Expected AboutUs OneItem/"+ renderControl +  " Image Shape and Size are NOT Same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is NO Image Shape and Size on AboutUs OneItem/"+ renderControl +  " Container");
			}
		}
		
	}
