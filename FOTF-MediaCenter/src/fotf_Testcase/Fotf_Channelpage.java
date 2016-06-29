package fotf_Testcase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import fotf_Config.Basedriver;
import fotf_Objects.Obj_Channel;
import fotf_Objects.Obj_Home;
import fotf_Operations.Opr_Channelpage;

public class Fotf_Channelpage extends Basedriver{
	public static String typeText;
	public static String titleText;
	public static int item;
	public static int channel;
	/*@Test
	public static void verify_fotf_channel(){
		log.info("Testcase Execution starts for verify Operation on FOTF Channel Page Featured Content");
		channelObj.featuredimg();
	}*/
	
	@BeforeMethod
	public static void baseUrl(){
		Driver.get("http://test.focusonthefamily.com");
	}
	
	@Test
	public static void verify_fotf_channel_SecondaryFeaturedList(){
		log.info("");
		log.info("__________________________________________________________________________________");
		log.info("*** TestCase - FOTF: Channel Pages: Adjust images for secondary featured items ***");
		log.info("__________________________________________________________________________________");
		log.info("PBI - 16712");
		for(channel=1;channel<=5;channel++){
			String channelText = Driver.findElement(By.xpath(Obj_Home.globalChannel+channel+"]/a")).getText();
			log.info("");
			log.info("***** Verifying the Secondary Items on "+channelText+" *****");
			Driver.findElement(By.xpath(Obj_Home.globalChannel+channel+Obj_Home.Channels)).click();
			int totalSecondaryItems = Driver.findElements(By.xpath(Obj_Channel.channelList)).size();
			for(int item=1;item<=totalSecondaryItems+1;item++){
				typeText=Driver.findElement(By.xpath(Obj_Channel.globalfeaturedXpath+item+Obj_Channel.featuredTypeText)).getText();
				 titleText=Driver.findElement(By.xpath(Obj_Channel.globalfeaturedXpath+item+Obj_Channel.featuredTitleText)).getText();
				 log.info("Featured Item No. "+item);
				 
				Opr_Channelpage.items_secondaryImage(typeText,titleText,Obj_Channel.globalfeaturedXpath,item,Obj_Channel.featuredImg);
				Opr_Channelpage.items_type(typeText,titleText,Obj_Channel.globalfeaturedXpath,item,Obj_Channel.featuredType);
				Opr_Channelpage.items_title(typeText,titleText,Obj_Channel.globalfeaturedXpath,item,Obj_Channel.featuredTitle);
				if(typeText.equals("ARTICLE")){
					 Opr_Channelpage.items_author(typeText,titleText,Obj_Channel.globalfeaturedXpath,item,Obj_Channel.featuredAuthor);
				 }
				Opr_Channelpage.items_desc(typeText,titleText,Obj_Channel.globalfeaturedXpath,item,Obj_Channel.featuredDesc);
				Opr_Channelpage.items_button(typeText,titleText,Obj_Channel.globalfeaturedXpath,item,Obj_Channel.featuredLink);
				
				 if(typeText.equals("EPISODE")){
					 Opr_Channelpage.items_buttonText(typeText, titleText,Obj_Channel.globalfeaturedXpath, item, Obj_Channel.recentItemButton);
				 }
			}
		}
	}
	
	@Test
	public static void verify_fotf_channel_RecentItems(){
		log.info("");
		log.info("____________________________________________________________________________");
		log.info("*** TestCase - FOTF: Channel Pages: Series Items in Recent Content Boxes ***");
		log.info("____________________________________________________________________________");
		log.info("PBI - 17301");
		for(channel=1;channel<=5;channel++){
			String channelText = Driver.findElement(By.xpath(Obj_Home.globalChannel+channel+"]/a")).getText();
			log.info("");
			log.info("***** Verifying the Recent Items on "+channelText+" *****");
			Driver.findElement(By.xpath(Obj_Home.globalChannel+channel+Obj_Home.Channels)).click();
			int totalRecentItems = Driver.findElements(By.xpath(Obj_Channel.recentItemsList)).size();
			for(int item=1;item<=totalRecentItems;item++){
				 typeText=Driver.findElement(By.xpath(Obj_Channel.globalRecentItem+item+Obj_Channel.recentItemType)).getText();
				 titleText=Driver.findElement(By.xpath(Obj_Channel.globalRecentItem+item+Obj_Channel.recentItemTitleText)).getText();
				log.info("Recent Item No. "+item);
				Opr_Channelpage.items_type(typeText,titleText,Obj_Channel.globalRecentItem,item,Obj_Channel.recentItemType);
				Opr_Channelpage.items_title(typeText,titleText,Obj_Channel.globalRecentItem,item,Obj_Channel.recentItemTitle);
				Opr_Channelpage.items_desc(typeText,titleText,Obj_Channel.globalRecentItem,item,Obj_Channel.recentItemDesc);
				Opr_Channelpage.items_button(typeText,titleText,Obj_Channel.globalRecentItem,item,Obj_Channel.recentItemButton);
				
				if(typeText.equals("RECENT EPISODE")){
					Opr_Channelpage.items_buttonText(typeText, titleText,Obj_Channel.globalRecentItem, item, Obj_Channel.recentItemButton);
				}
			}
		}
	}
	
	@Test
	public static void verify_fotf_channel_moreResourceItems(){
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		log.info("");
		log.info("____________________________________________________________________________________________________________________________");
		log.info("*** TestCase - FOTF: Channel Pages: FOTF: Channel Pages: Show pages should be selectable from Related Content multilist ***");
		log.info("____________________________________________________________________________________________________________________________");
		log.info("PBI - 17698");
		for(channel=1;channel<=5;channel++){
			String channelText = Driver.findElement(By.xpath(Obj_Home.globalChannel+channel+"]/a")).getText();
			log.info("");
			log.info("***** Verifying the More Resources Items on "+channelText+" *****");
			Driver.findElement(By.xpath(Obj_Home.globalChannel+channel+Obj_Home.Channels)).click();
			
			int totalRecentItems = Driver.findElements(By.xpath(Obj_Channel.moreResourcesItemsList)).size();
			for(int item=1;item<=totalRecentItems;item++){
				try{
					Driver.findElement(By.xpath(Obj_Channel.globalMoreResourceItem+item+Obj_Channel.MoreResourceItemRetail));
					titleText=Driver.findElement(By.xpath(Obj_Channel.globalMoreResourceItem+item+Obj_Channel.MoreResourceItemTitleText)).getText();
					typeText="PRODUCT";
					log.info("Recent Item No. "+item);
					
					Opr_Channelpage.items_title(typeText,titleText,Obj_Channel.globalMoreResourceItem,item,Obj_Channel.MoreResourceItemTitle);
					Opr_Channelpage.items_image(typeText,titleText,Obj_Channel.globalMoreResourceItem,item,Obj_Channel.MoreResourceItemImage);
					Opr_Channelpage.items_productButton(typeText,titleText,Obj_Channel.globalMoreResourceItem,item,Obj_Channel.MoreResourceItemButton);
					Opr_Channelpage.items_author(typeText,titleText,Obj_Channel.globalMoreResourceItem,item,Obj_Channel.MoreResourceItemAuthor);
					Opr_Channelpage.items_retail(typeText,titleText,Obj_Channel.globalMoreResourceItem,item,Obj_Channel.MoreResourceItemRetail);
					Opr_Channelpage.items_ourPrice(typeText,titleText,Obj_Channel.globalMoreResourceItem,item,Obj_Channel.MoreResourceItemOurprice);
				}catch(org.openqa.selenium.NoSuchElementException e){
					try{
					 typeText=Driver.findElement(By.xpath(Obj_Channel.globalMoreResourceItem+item+Obj_Channel.MoreResourceItemType)).getText();
					 titleText=Driver.findElement(By.xpath(Obj_Channel.globalMoreResourceItem+item+Obj_Channel.MoreResourceItemTitleText)).getText();
					}catch(org.openqa.selenium.NoSuchElementException a){
						typeText="ARTICLE";
						titleText=Driver.findElement(By.xpath(Obj_Channel.globalMoreResourceItem+item+Obj_Channel.MoreResourceItemTitleText)).getText();
					}
					log.info("Recent Item No. "+item);
						Opr_Channelpage.items_type(typeText,titleText,Obj_Channel.globalMoreResourceItem,item,Obj_Channel.MoreResourceItemType);
						Opr_Channelpage.items_title(typeText,titleText,Obj_Channel.globalMoreResourceItem,item,Obj_Channel.MoreResourceItemTitle);
						Opr_Channelpage.items_desc(typeText,titleText,Obj_Channel.globalMoreResourceItem,item,Obj_Channel.MoreResourceItemDesc);
						Opr_Channelpage.items_button(typeText,titleText,Obj_Channel.globalMoreResourceItem,item,Obj_Channel.MoreResourceItemButton);
						Opr_Channelpage.items_image(typeText,titleText,Obj_Channel.globalMoreResourceItem,item,Obj_Channel.MoreResourceItemImage);
						if(typeText.equals("EPISODE")){
							Opr_Channelpage.items_buttonText(typeText, titleText,Obj_Channel.globalMoreResourceItem, item, Obj_Channel.MoreResourceItemButton);
						}
				}
				
				
			}
		}
	}
}
