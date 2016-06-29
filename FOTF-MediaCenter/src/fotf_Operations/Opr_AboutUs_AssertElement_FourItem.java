package fotf_Operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import fotf_Config.Basedriver;

public class Opr_AboutUs_AssertElement_FourItem extends Basedriver{
	
	
	// Verify Title Element for the [FourItems / FourColumns Rectangle] Component on AutoAboutUs Preview page
			public static void VerifyFourItemsFourColumnsRectangle_Title(){
				boolean actualFourItemsFourColumnsRectangleContentTitle = false;
				try{
					actualFourItemsFourColumnsRectangleContentTitle=sitecoreObj_FourItem.aboutusFourItemsFourColumnsRectangleTitle.isDisplayed();
					Assert.assertEquals(actualFourItemsFourColumnsRectangleContentTitle, true);
					log.info("The Actual AboutUs FourItemsFourColumnsRectangle ContentTitle - <"+sitecoreObj_FourItem.aboutusFourItemsFourColumnsRectangleTitle.getTagName()+">");
					log.info("The Expected AboutUs FourItemsFourColumnsRectangle ContentTitle - <h2>");
					log.info("TEST PASSED: The Actual and Expected AboutUs FourItemsFourColumnsRectangle ContentTitle are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs FourItemsFourColumnsRectangle ContentTitle - <"+sitecoreObj_FourItem.aboutusFourItemsFourColumnsRectangleTitle.getTagName() +">");
					log.error("The Expected AboutUs FourItemsFourColumnsRectangle ContentTitle - <h2>");
					log.error("TEST FAILED: The Actual and Expected AboutUs FourItemsFourColumnsRectangle ContentTitle are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No ContentTitle element On FourItemsFourColumnsRectangle Container");
				}		
			}
			
			
			// Verify FourItems / FourColumns Rectangle Component Description for AutoAboutUs Preview page
			public static void VerifyFourItemsFourColumnsRectangle_Description(){
				boolean actualFourItemsFourColumnsRectangleText = false;
				try{
					actualFourItemsFourColumnsRectangleText=sitecoreObj_FourItem.aboutusFourItemsFourColumnsRectangleDescription.isDisplayed();
					Assert.assertEquals(actualFourItemsFourColumnsRectangleText, true);
					log.info("The Actual AboutUs FourItemsFourColumnsRectangle Description - <"+sitecoreObj_FourItem.aboutusFourItemsFourColumnsRectangleDescription.getTagName()+">");
					log.info("The Expected AboutUs FourItemsFourColumnsRectangle Description - <p>");
					log.info("TEST PASSED: The Actual and Expected AboutUs FourItemsFourColumnsRectangle Description are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs FourItemsFourColumnsRectangle Description - <"+sitecoreObj_FourItem.aboutusFourItemsFourColumnsRectangleDescription.getTagName()+">");
					log.error("The Expected AboutUs FourItemsFourColumnsRectangle Description - <p>");
					log.error("TEST FAILED: The Actual and Expected AboutUs FourItemsFourColumnsRectangle Description are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No Description element On FourItemsFourColumnsRectangle Container");
				}		
			}
			
			// Verify FourItems / FourColumns Rectangle Component Image for AutoAboutUs Preview page
			public static void VerifyFourItemsFourColumnsRectangle_Image(){
				String actualFourItemsFourColumnsRectangleImage="";
				try{
					actualFourItemsFourColumnsRectangleImage=sitecoreObj_FourItem.aboutusFourItemsFourColumnsRectangleImage.getAttribute("class");
					Assert.assertEquals(actualFourItemsFourColumnsRectangleImage, expectedData.getProperty("FourItemsFourColumnsRectangleImage"));
					log.info("The Actual AboutUs FourItemsFourColumnsRectangle Image- "+actualFourItemsFourColumnsRectangleImage);
					log.info("The Expected AboutUs FourItemsFourColumnsRectangle Image- "+expectedData.getProperty("FourItemsFourColumnsRectangleImage"));
					log.info("TEST PASSED: The Actual and Expected AboutUs FourItemsFourColumnsRectangle Images are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs FourItemsFourColumnsRectangle Image- "+actualFourItemsFourColumnsRectangleImage);
					log.error("The Expected AboutUs FourItemsFourColumnsRectangle Image- "+expectedData.getProperty("FourItemsFourColumnsRectangleImage"));
					log.error("TEST FAILED: The Actual and Expected AboutUs FourItemsFourColumnsRectangle Images are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No Image On FourItemsFourColumnsRectangle Container");
				}
			}
			
			// Verify FourItemsFourColumnsRectangle Component Text for AutoAboutUs Preview page
			public static void VerifyFourItemsFourColumnsRectangle_Text(){
				String actualFourItemsFourColumnsRectangleText="";
				try{
					actualFourItemsFourColumnsRectangleText=sitecoreObj_FourItem.aboutusFourItemsFourColumnsRectangleText.getAttribute("class");
					Assert.assertEquals(actualFourItemsFourColumnsRectangleText, expectedData.getProperty("FourItemsFourColumnsRectangleText"));
					log.info("The Actual AboutUs FourItemsFourColumnsRectangle Text- "+actualFourItemsFourColumnsRectangleText);
					log.info("The Expected AboutUs FourItemsFourColumnsRectangle Text- "+expectedData.getProperty("FourItemsFourColumnsRectangleText"));
					log.info("TEST PASSED: The Actual and Expected AboutUs FourItemsFourColumnsRectangle Texts are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs FourItemsFourColumnsRectangle Text- "+actualFourItemsFourColumnsRectangleText);
					log.error("The Expected AboutUs FourItemsFourColumnsRectangle Text- "+expectedData.getProperty("FourItemsFourColumnsRectangleText"));
					log.error("TEST FAILED: The Actual and Expected AboutUs FourItemsFourColumnsRectangle Texts are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No Text On FourItemsFourColumnsRectangle Container");
				}
			}
			
			
			
			// Four Columns With Inset
			// Verify Title Element for the [FourItems / WithInset] Component on AutoAboutUs Preview page
			public static void VerifyFourItemsWithInset_Title(){
				boolean actualFourItemsWithInsetContentTitle = false;
				try{
					actualFourItemsWithInsetContentTitle=sitecoreObj_FourItem.aboutusFourItemsWithInsetTitle.isDisplayed();
					Assert.assertEquals(actualFourItemsWithInsetContentTitle, true);
					log.info("The Actual AboutUs FourItemsWithInset ContentTitle - <"+sitecoreObj_FourItem.aboutusFourItemsWithInsetTitle.getTagName()+">");
					log.info("The Expected AboutUs FourItemsWithInset ContentTitle - <h3>");
					log.info("TEST PASSED: The Actual and Expected AboutUs FourItemsWithInset ContentTitle are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs FourItemsWithInset ContentTitle - <"+sitecoreObj_FourItem.aboutusFourItemsWithInsetTitle.getTagName() +">");
					log.error("The Expected AboutUs FourItemsWithInset ContentTitle - <h3>");
					log.error("TEST FAILED: The Actual and Expected AboutUs FourItemsWithInset ContentTitle are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No ContentTitle element On FourItemsWithInset Container");
				}		
			}
			
			// Verify FourItems / WithInset Component Description for AutoAboutUs Preview page
			public static void VerifyFourItemsWithInset_Description(){
				boolean actualFourItemsWithInsetText = false;
				try{
					actualFourItemsWithInsetText=sitecoreObj_FourItem.aboutusFourItemsWithInsetDescription.isDisplayed();
					Assert.assertEquals(actualFourItemsWithInsetText, true);
					log.info("The Actual AboutUs FourItemsWithInset Description - <"+sitecoreObj_FourItem.aboutusFourItemsWithInsetDescription.getTagName()+">");
					log.info("The Expected AboutUs FourItemsWithInset Description - <p>");
					log.info("TEST PASSED: The Actual and Expected AboutUs FourItemsWithInset Description are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs FourItemsWithInset Description - <"+sitecoreObj_FourItem.aboutusFourItemsWithInsetDescription.getTagName()+">");
					log.error("The Expected AboutUs FourItemsWithInset Description - <p>");
					log.error("TEST FAILED: The Actual and Expected AboutUs FourItemsWithInset Description are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No Description element On FourItemsWithInset Container");
				}		
			}	
			
			// Verify FourItems / WithInset Component Image for AutoAboutUs Preview page
			public static void VerifyFourItemsWithInset_Image(){
				String actualFourItemsWithInsetImage="";
				try{
					actualFourItemsWithInsetImage=sitecoreObj_FourItem.aboutusFourItemsWithInsetImage.getAttribute("class");
					Assert.assertEquals(actualFourItemsWithInsetImage, expectedData.getProperty("FourItemsWithInsetImage"));
					log.info("The Actual AboutUs FourItemsWithInset Image- "+actualFourItemsWithInsetImage);
					log.info("The Expected AboutUs FourItemsWithInset Image- "+expectedData.getProperty("FourItemsWithInsetImage"));
					log.info("TEST PASSED: The Actual and Expected AboutUs FourItemsWithInset Images are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs FourItemsWithInset Image- "+actualFourItemsWithInsetImage);
					log.error("The Expected AboutUs FourItemsWithInset Image- "+expectedData.getProperty("FourItemsWithInsetImage"));
					log.error("TEST FAILED: The Actual and Expected AboutUs FourItemsWithInset Images are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No Image On FourItemsWithInset Container");
				}
			}	
			
			// Verify FourItemsWithInset Component Text for AutoAboutUs Preview page
			public static void VerifyFourItemsWithInset_Text(){
				String actualFourItemsWithInsetText="";
				try{
					actualFourItemsWithInsetText=sitecoreObj_FourItem.aboutusFourItemsWithInsetText.getAttribute("class");
					Assert.assertEquals(actualFourItemsWithInsetText, expectedData.getProperty("FourItemsWithInsetText"));
					log.info("The Actual AboutUs FourItemsWithInset Text- "+actualFourItemsWithInsetText);
					log.info("The Expected AboutUs FourItemsWithInset Text- "+expectedData.getProperty("FourItemsWithInsetText"));
					log.info("TEST PASSED: The Actual and Expected AboutUs FourItemsWithInset Texts are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs FourItemsWithInset Text- "+actualFourItemsWithInsetText);
					log.error("The Expected AboutUs FourItemsWithInset Text- "+expectedData.getProperty("FourItemsWithInsetText"));
					log.error("TEST FAILED: The Actual and Expected AboutUs FourItemsWithInset Texts are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No Text On FourItemsWithInset Container");
				}
			}
			
			// Verify FourItems / With Inset Component Data Image for AutoAboutUs Preview page
			public static void VerifyFourItemsWithInset_DataImage(){
				String actualFourItemsWithInsetDataImage="";
				try{
					actualFourItemsWithInsetDataImage=sitecoreObj_FourItem.aboutusFourItemsWithInsetDataImage.getAttribute("class");
					Assert.assertEquals(actualFourItemsWithInsetDataImage, expectedData.getProperty("FourItemsWithInsetDataImage"));
					log.info("The Actual AboutUs FourItemsWithInset Data Image- "+actualFourItemsWithInsetDataImage);
					log.info("The Expected AboutUs FourItemsWithInset Data Image- "+expectedData.getProperty("FourItemsWithInsetDataImage"));
					log.info("TEST PASSED: The Actual and Expected AboutUs FourItemsWithInset Data Images are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs FourItemsWithInset Data Image- "+actualFourItemsWithInsetDataImage);
					log.error("The Expected AboutUs FourItemsWithInset Data Image- "+expectedData.getProperty("FourItemsWithInsetDataImage"));
					log.error("TEST FAILED: The Actual and Expected AboutUs FourItemsWithInset Data Images are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No Data Image On FourItemsWithInset Container");
				}
			}	
			
			// Verify FourItemsWithInset Component Data Text for AutoAboutUs Preview page
			public static void VerifyFourItemsWithInset_DataText(){
				String actualFourItemsWithInsetDataText="";
				try{
					actualFourItemsWithInsetDataText=sitecoreObj_FourItem.aboutusFourItemsWithInsetDataText.getAttribute("class");
					Assert.assertEquals(actualFourItemsWithInsetDataText, expectedData.getProperty("FourItemsWithInsetDataText"));
					log.info("The Actual AboutUs FourItemsWithInset Data Text- "+actualFourItemsWithInsetDataText);
					log.info("The Expected AboutUs FourItemsWithInset Data Text- "+expectedData.getProperty("FourItemsWithInsetDataText"));
					log.info("TEST PASSED: The Actual and Expected AboutUs FourItemsWithInset Data Texts are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs FourItemsWithInset Data Text- "+actualFourItemsWithInsetDataText);
					log.error("The Expected AboutUs FourItemsWithInset Data Text- "+expectedData.getProperty("FourItemsWithInsetDataText"));
					log.error("TEST FAILED: The Actual and Expected AboutUs FourItemsWithInset Data Texts are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No Data Text On FourItemsWithInset Container");
				}
			}
			
			// Verify FourItems / With Inset Component Data Image for AutoAboutUs Preview page
			public static void VerifyFourItemsWithInset_ImageShapeWithImagePosition(int ImageShape, int ImagePosition){
				String actualFourItemsWithInsetDataImage="";
				try{
					actualFourItemsWithInsetDataImage=sitecoreObj_FourItem.aboutusFourItemsWithInsetImageShapePosition.getAttribute("class");
					
					Assert.assertEquals(actualFourItemsWithInsetDataImage, "fouritems_inset_data--container " + expectedData.getProperty("FourItemsWithInset_InsetImageShape"+ImageShape) 
							+ " " + expectedData.getProperty("FourItemsWithInset_InsetImagePosition"+ImagePosition));
					
					log.info("The Actual AboutUs FourItemsWithInset Data Image- "+actualFourItemsWithInsetDataImage);
					log.info("The Expected AboutUs FourItemsWithInset Data Image- "+ "fouritems_inset_data--container " + expectedData.getProperty("FourItemsWithInset_InsetImageShape"+ImageShape) 
							+ " " + expectedData.getProperty("FourItemsWithInset_InsetImagePosition"+ImagePosition));
					log.info("TEST PASSED: The Actual and Expected AboutUs FourItemsWithInset Inset Images and Position are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs FourItemsWithInset Data Image- "+actualFourItemsWithInsetDataImage);
					log.error("The Expected AboutUs FourItemsWithInset Data Image- "+ "fouritems_inset_data--container " + expectedData.getProperty("FourItemsWithInset_InsetImageShape"+ImageShape) 
							+ " " + expectedData.getProperty("FourItemsWithInset_InsetImagePosition"+ImagePosition));
					log.error("TEST FAILED: The Actual and Expected AboutUs FourItemsWithInset Inset Images and Position are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No Inset Images and Position On FourItemsWithInset Container");
				}
			}	
			
			// [FourItems TwoColumn]
			// Verify FourItems / TwoColumn Component ContentImage for AutoAboutUs Preview page
			public static void VerifyFourItemsTwoColumn_Image(){
				String actualContentImage="";
				try{
					actualContentImage=sitecoreObj_FourItem.aboutusFourItemsTwoColumnsImage.getAttribute("class");
					Assert.assertEquals(actualContentImage, expectedData.getProperty("FourItemsTwoColumnsImage"));
					log.info("The Actual AboutUs FourItemsTwoColumn Image - "+actualContentImage);
					log.info("The Expected AboutUs FourItemsTwoColumn Image - "+expectedData.getProperty("FourItemsTwoColumnsImage"));
					log.info("TEST PASSED: The Actual and Expected AboutUs FourItemsTwoColumn Image are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs FourItemsTwoColumn Image - "+actualContentImage);
					log.error("The Expected AboutUs FourItemsTwoColumn Image - "+expectedData.getProperty("FourItemsTwoColumnsImage"));
					log.error("TEST FAILED: The Actual and Expected AboutUs FourItemsTwoColumn Image are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No Image On FourItemsTwoColumn Container");
				}
			}
			
			// Verify FourItemsTwoColumn Component Text for AutoAboutUs Preview page
			public static void VerifyFourItemsTwoColumn_Text(){
				String actualFourItemsTwoColumnText="";
				try{
					actualFourItemsTwoColumnText=sitecoreObj_FourItem.aboutusFourItemsTwoColumnsText.getAttribute("class");
					Assert.assertEquals(actualFourItemsTwoColumnText, expectedData.getProperty("FourItemsTwoColumnsText"));
					log.info("The Actual AboutUs FourItemsTwoColumn Text- "+actualFourItemsTwoColumnText);
					log.info("The Expected AboutUs FourItemsTwoColumn Text- "+expectedData.getProperty("FourItemsTwoColumnsText"));
					log.info("TEST PASSED: The Actual and Expected AboutUs FourItemsTwoColumn Texts are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs FourItemsTwoColumn Text- "+actualFourItemsTwoColumnText);
					log.error("The Expected AboutUs FourItemsTwoColumn Text- "+expectedData.getProperty("FourItemsTwoColumnsText"));
					log.error("TEST FAILED: The Actual and Expected AboutUs FourItemsTwoColumn Texts are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No Text On FourItemsTwoColumn Container");
				}
			}
			
			// Verify FourItems / TwoColumn Component List Image for AutoAboutUs Preview page
			public static void VerifyFourItemsTwoColumn_ListImage(){
				boolean actualListImage=false;
				try{
					actualListImage=sitecoreObj_FourItem.aboutusFourItemsTwoColumnsListImage.isDisplayed();
					Assert.assertEquals(actualListImage, true);
					log.info("The Actual AboutUs FourItemsTwoColumn List Image - <" +sitecoreObj_FourItem.aboutusFourItemsTwoColumnsListImage.getTagName()+">");
					log.info("The Expected AboutUs FourItemsTwoColumn List Image - <img>");
					log.info("TEST PASSED: The Actual and Expected AboutUs FourItemsTwoColumn List Image are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs FourItemsTwoColumn List Image - <" +sitecoreObj_FourItem.aboutusFourItemsTwoColumnsListImage.getTagName()+">");
					log.error("The Expected AboutUs FourItemsTwoColumn List Image - <img>");
					log.error("TEST FAILED: The Actual and Expected AboutUs FourItemsTwoColumn List Image are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No List Image On FourItemsTwoColumn Container");
				}
			}
			
			// Verify FourItems / TwoColumns Component ListText for AutoAboutUs Preview page
			public static void VerifyFourItemsTwoColumn_ListText(){
				boolean actualFourItemsTwoColumnsListText = false;
				try{
					actualFourItemsTwoColumnsListText=sitecoreObj_FourItem.aboutusFourItemsTwoColumnsListText.isDisplayed();
					Assert.assertEquals(actualFourItemsTwoColumnsListText, true);
					log.info("The Actual AboutUs FourItemsTwoColumns List Text - <"+sitecoreObj_FourItem.aboutusFourItemsTwoColumnsListText.getTagName()+">");
					log.info("The Expected AboutUs FourItemsTwoColumns List Text - <span>");
					log.info("TEST PASSED: The Actual and Expected AboutUs FourItemsTwoColumns ListText are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs FourItemsTwoColumns List Text - <"+sitecoreObj_FourItem.aboutusFourItemsTwoColumnsListText.getTagName()+">");
					log.error("The Expected AboutUs FourItemsTwoColumns List Text - <span>");
					log.error("TEST FAILED: The Actual and Expected AboutUs FourItemsTwoColumns List Text are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No List Text element On FourItemsTwoColumns Container");
				}		
			}
			
			//Four Items / Four Columns Square	
			// Verify Title Element for the [Four Items / Four Columns Square] Component on AutoAboutUs Preview page
			public static void VerifyFourItemsFourColumnsSquare_Title(String renderControl){
				boolean actualFourItemTitle=false;
				try{
					actualFourItemTitle=sitecoreObj_FourItem.aboutusFourItemsFourColumnsSquareTitle.isDisplayed();
					Assert.assertEquals(actualFourItemTitle, true);
					log.info("The Actual AboutUs " + renderControl + " Container Header Title - <"+sitecoreObj_FourItem.aboutusFourItemsFourColumnsSquareTitle.getTagName()+">");
					log.info("The Expected AboutUs " + renderControl + " Container Header Title - <h2>");
					log.info("TEST PASSED: The Actual and Expected AboutUs " + renderControl + " Container Header Title are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs " + renderControl + " Container Header Title - <"+sitecoreObj_FourItem.aboutusFourItemsFourColumnsSquareTitle.getTagName()+">");
					log.error("The Expected AboutUs " + renderControl + " Container Header Title - <h2>");
					log.error("TEST FAILED: The Actual and Expected AboutUs " + renderControl + " Container Header Title are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No Container Header Title element On " + renderControl + " Container");
				}		
			}
			
			// Verify FourItems / TwoColumn Component List Image for AutoAboutUs Preview page
			public static void VerifyFourItemsFourColumnsSquare_Image(){
				String actualImage="";
				try{
					actualImage=sitecoreObj_FourItem.aboutusFourItemsFourColumnsSquareImage.getAttribute("class");
					Assert.assertEquals(actualImage, expectedData.getProperty("FourItemsFourColumnsSquareImage"));
					log.info("The Actual AboutUs FourItemsFourColumn Image - "+actualImage);
					log.info("The Expected AboutUs FourItemsFourColumn Image - "+expectedData.getProperty("FourItemsFourColumnsSquareImage"));
					log.info("TEST PASSED: The Actual and Expected AboutUs FourItemsFourColumn Images are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs FourItemsFourColumn Image - "+actualImage);
					log.error("The Expected AboutUs FourItemsFourColumn Image - "+expectedData.getProperty("FourItemsFourColumnsSquareImage"));
					log.error("TEST FAILED: The Actual and Expected AboutUs FourItemsFourColumn Images are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No Image On FourItemsFourColumn Container");
				}
			}
			
			// Verify FourItems / TwoColumn Component List Image for AutoAboutUs Preview page
			public static void VerifyFourItemsFourColumnsSquare_AppImage(){
				String actualImage="";
				try{
					actualImage=sitecoreObj_FourItem.aboutusFourItemsFourColumnsSquareAppImage.getAttribute("class");
					Assert.assertEquals(actualImage, expectedData.getProperty("FourItemsFourColumnsSquareAppImage"));
					log.info("The Actual AboutUs FourItemsFourColumn App Image - "+actualImage);
					log.info("The Expected AboutUs FourItemsFourColumn App Image - "+expectedData.getProperty("FourItemsFourColumnsSquareAppImage"));
					log.info("TEST PASSED: The Actual and Expected AboutUs FourItemsFourColumn App Images are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs FourItemsFourColumn App Image - "+actualImage);
					log.error("The Expected AboutUs FourItemsFourColumn App Image - "+expectedData.getProperty("FourItemsFourColumnsSquareAppImage"));
					log.error("TEST FAILED: The Actual and Expected AboutUs FourItemsFourColumn App Images are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No App Image On FourItemsFourColumn Container");
				}
			}
}
