package fotf_Operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fotf_Config.Basedriver;
import fotf_Objects.Obj_Channel;

public class Opr_Channelpage extends Basedriver{
	
	public static String actual_featured_title;
	public static String actual_featured_titleText;
	public static String actual_featured_img;
	public static String actual_featured_link;
	public static String actual_featured_type;
	public static String actual_featured_buttonText;
	public static String actual_featured_author;
	public static String actual_featured_link_Text;
	public static String actual_featured_desc;
	public static String actual_product_retail;
	public static String actual_product_ourprice;
	
	@BeforeMethod
	public static void baseUrl(){
		Driver.get(baseFotfUrl);
	}
	public static void clickTopics(){
		channelObj.topic1.click();
		channelObj.topic2.click();
		channelObj.topic3.click();
	}
	
	// Verifying Featured Image content on channel page
		public static void featuredimg(){
			String expected_featured_img="channel_featured--image";
			String actual_featured_img;
			
			actual_featured_img=channelObj.featured_img.getAttribute("class");
			try{
				Assert.assertEquals(actual_featured_img, expected_featured_img);
				//log.info("Featured image content is available");
			}
			catch(AssertionError e){
				log.error("Featured image content is not available");
			}
		}
				
// Verify Items Type on Channel page
				public static void items_type(String recentitemsTypeText,String recentitemsTitleText,String globalRecentItem,int i, String recentItemType ){
					try{
						actual_featured_type=Driver.findElement(By.xpath(globalRecentItem+i+recentItemType)).getAttribute("class");
						Assert.assertEquals(actual_featured_type, expectedData.getProperty("featuredType"));
						log.info(recentitemsTypeText+" - "+recentitemsTitleText+" - "+actual_featured_type);
					}catch(AssertionError e){
						log.error("Missing: "+recentitemsTypeText+" - "+recentitemsTitleText+" - "+expectedData.getProperty("featuredType"));
					}catch(org.openqa.selenium.NoSuchElementException e){
						log.error("Missing: "+recentitemsTypeText+" - "+recentitemsTitleText+" - "+expectedData.getProperty("featuredType"));
					}
				}
// Verify Items Title on Channel page
				public static void items_title(String recentitemsTypeText,String recentitemsTitleText,String globalRecentItem,int i,String recentItemTitle ){
					try{
						actual_featured_title=Driver.findElement(By.xpath(globalRecentItem+i+recentItemTitle)).getAttribute("class");
						Assert.assertEquals(actual_featured_title, expectedData.getProperty("featuredTitle"));
						log.info(recentitemsTypeText+" - "+recentitemsTitleText+" - "+actual_featured_title);
					}catch(AssertionError e){
						log.error("Miss: "+recentitemsTypeText+" - "+recentitemsTitleText+" - "+expectedData.getProperty("featuredTitle"));
					}catch(org.openqa.selenium.NoSuchElementException e){
						log.error("Missing: "+recentitemsTypeText+" - "+recentitemsTitleText+" - "+expectedData.getProperty("featuredTitle"));
					}
				}
					
// Verify Items Description on Channel page
				public static void items_desc(String recentitemsTypeText,String recentitemsTitleText,String globalRecentItem,int i,String recentItemDesc ){
					try{
						actual_featured_desc=Driver.findElement(By.xpath(globalRecentItem+i+recentItemDesc)).getAttribute("class");
						Assert.assertEquals(actual_featured_desc, expectedData.getProperty("featuredDesc"));
						log.info(recentitemsTypeText+" - "+recentitemsTitleText+" - "+actual_featured_desc);
					}catch(AssertionError e){
						log.error("Missing: "+recentitemsTypeText+" - "+recentitemsTitleText+" - "+expectedData.getProperty("featuredDesc"));
					}catch(org.openqa.selenium.NoSuchElementException e){
						log.error("Miss: "+recentitemsTypeText+" - "+recentitemsTitleText+" - "+expectedData.getProperty("featuredDesc"));
					}
				}
				
// Verify Items Button on Channel page
				public static void items_button(String recentitemsTypeText,String recentitemsTitleText,String globalRecentItem,int i,String recentItemButton ){		
					try{
						actual_featured_link=Driver.findElement(By.xpath(globalRecentItem+i+recentItemButton)).getAttribute("class");
						Assert.assertEquals(actual_featured_link.trim(), expectedData.getProperty("episodeButton"));
						log.info(recentitemsTypeText+" - "+recentitemsTitleText+" - "+actual_featured_link);
					}catch(AssertionError e){
						log.error("Missing: "+recentitemsTypeText+" - "+recentitemsTitleText+" - "+expectedData.getProperty("episodeButton"));
					}catch(org.openqa.selenium.NoSuchElementException e){
						log.error("Missing: "+recentitemsTypeText+" - "+recentitemsTitleText+" - "+expectedData.getProperty("episodeButton"));
					}
				}
// Verify Items Button Text on Channel page
				public static void items_buttonText(String recentitemsTypeText,String recentitemsTitleText,String globalRecentItem,int i,String itemButtonText ){		
					try{
						actual_featured_buttonText=Driver.findElement(By.xpath(globalRecentItem+i+itemButtonText)).getText();
						Assert.assertEquals(actual_featured_buttonText.trim(), expectedData.getProperty("episodeButtonText"));
						log.info(recentitemsTypeText+" - "+recentitemsTitleText+" - "+actual_featured_buttonText);
					}catch(AssertionError e){
						log.error("Missing: "+recentitemsTypeText+" - "+recentitemsTitleText+" - "+expectedData.getProperty("episodeButtonText"));
					}catch(org.openqa.selenium.NoSuchElementException e){
						log.error("Missing: "+recentitemsTypeText+" - "+recentitemsTitleText+" Button Name - "+expectedData.getProperty("episodeButtonText"));
					}
				}	
// Verifying Items Featured Image on Channel page
				public static void items_secondaryImage(String recentitemsTypeText,String recentitemsTitleText,String globalRecentItem,int i,String itemImage){
				try{
					actual_featured_img=Driver.findElement(By.xpath(globalRecentItem+i+itemImage)).getAttribute("class");
					Assert.assertEquals(actual_featured_img, expectedData.getProperty("featuredImg"));
					log.info(recentitemsTypeText+" - "+recentitemsTitleText+" - "+actual_featured_img);
				}catch(AssertionError e){
					log.error("Missing: "+recentitemsTypeText+" - "+recentitemsTitleText+" - "+expectedData.getProperty("featuredImg"));
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("Missing: "+recentitemsTypeText+" - "+recentitemsTitleText+" - "+expectedData.getProperty("featuredImg"));
				}
			}				
// Verifying Items Product Image on Channel page
				public static void items_image(String recentitemsTypeText,String recentitemsTitleText,String globalRecentItem,int i,String itemImage){
				try{
					actual_featured_img=Driver.findElement(By.xpath(globalRecentItem+i+itemImage)).getAttribute("class");
					Assert.assertEquals(actual_featured_img, expectedData.getProperty("productImg"));
					log.info(recentitemsTypeText+" - "+recentitemsTitleText+" - "+actual_featured_img);
				}catch(AssertionError e){
					log.error("Missing: "+recentitemsTypeText+" - "+recentitemsTitleText+" - "+expectedData.getProperty("productImg"));
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("Missing: "+recentitemsTypeText+" - "+recentitemsTitleText+" - "+expectedData.getProperty("productImg"));
				}
			}
// Verify Items Product Button on Channel page
				public static void items_productButton(String recentitemsTypeText,String recentitemsTitleText,String globalRecentItem,int i,String itemProductButton ){		
					try{
						actual_featured_link=Driver.findElement(By.xpath(globalRecentItem+i+itemProductButton)).getAttribute("class");
						Assert.assertEquals(actual_featured_link, expectedData.getProperty("productButton"));
						log.info(recentitemsTypeText+" - "+recentitemsTitleText+" - "+actual_featured_link);
					}catch(AssertionError e){
						log.error("Missing: "+recentitemsTypeText+" - "+recentitemsTitleText+" - "+expectedData.getProperty("episodeButton"));
					}catch(org.openqa.selenium.NoSuchElementException e){
						log.error("Missing: "+recentitemsTypeText+" - "+recentitemsTitleText+" - "+expectedData.getProperty("episodeButton"));
					}
				}		
				
// Verifying Items Author content on Channel page
				public static void items_author(String recentitemsTypeText,String recentitemsTitleText,String globalRecentItem,int i,String itemAuthor){
				try{
					actual_featured_author=Driver.findElement(By.xpath(globalRecentItem+i+itemAuthor)).getAttribute("class");
					Assert.assertEquals(actual_featured_author, expectedData.getProperty("featuredAuthor"));
					log.info(recentitemsTypeText+" - "+recentitemsTitleText+" - "+actual_featured_author);
				}catch(AssertionError e){
					log.error("Missing: "+recentitemsTypeText+" - "+recentitemsTitleText+" - "+expectedData.getProperty("featuredAuthor"));
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("Missing: "+recentitemsTypeText+" - "+recentitemsTitleText+" - "+expectedData.getProperty("featuredAuthor"));
				}
			}
				
// Verifying Items Retail content on Channel page
				public static void items_retail(String recentitemsTypeText,String recentitemsTitleText,String globalRecentItem,int i,String itemRetail ){
				try{
					actual_product_retail=Driver.findElement(By.xpath(globalRecentItem+i+itemRetail)).getAttribute("class");
					Assert.assertEquals(actual_product_retail, expectedData.getProperty("productRetail"));
					log.info(recentitemsTypeText+" - "+recentitemsTitleText+" - "+actual_product_retail);
				}catch(AssertionError e){
					log.error("Missing: "+recentitemsTypeText+" - "+recentitemsTitleText+" - "+expectedData.getProperty("productRetail"));
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("Missing: "+recentitemsTypeText+" - "+recentitemsTitleText+" - "+expectedData.getProperty("productRetail"));
				}
			}
// Verifying Items Our Price content on Channel page
				public static void items_ourPrice(String recentitemsTypeText,String recentitemsTitleText,String globalRecentItem,int i,String itemOurPrice ){
				try{
					actual_product_ourprice=Driver.findElement(By.xpath(globalRecentItem+i+itemOurPrice)).getAttribute("class");
					Assert.assertEquals(actual_product_ourprice, expectedData.getProperty("productOurprice"));
					log.info(recentitemsTypeText+" - "+recentitemsTitleText+" - "+actual_product_ourprice);
				}catch(AssertionError e){
					log.error("Missing: "+recentitemsTypeText+" - "+recentitemsTitleText+" - "+expectedData.getProperty("productOurprice"));
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("Missing: "+recentitemsTypeText+" - "+recentitemsTitleText+" - "+expectedData.getProperty("productOurprice"));
				}
			}
}
