package fotf_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;


import fotf_Operations.Opr_Channelpage;
public class Obj_Channel extends Opr_Channelpage{
	int i=0;
	/*public Obj_Channel(){
			
	}*/
	public Obj_Channel(WebDriver Driver){
		
		PageFactory.initElements(Driver, this);
	}
	
	// Objects for Secondary Channel List Items

	public static String channelList="html/body/div[1]/article/div/div[4]//div[@class='channel_resources--item layout--two_column layout--three_column']";
	public static String globalfeaturedXpath="html/body/div[1]/article/div/div[4]/div[";
	
	
	public static String featuredTypeText="]//p[@class='channel_resources--type']";
	public static String featuredTitleText="]/h3/a";
	public static String featuredTitle="]/h3";
	public static String featuredImg="]/span/img";
	public static String featuredLink="]/a";
	public static String featuredType="]/p[1]";
	public static String featuredAuthor="]/p[2]";
	public static String articleFeaturedDesc="]/p[3]";
	//public static String featuredDesc="]/p[2]";
	public static String featuredDesc="]//p[@class='channel_resources--desc']";
	@FindBy(xpath="html/body/div[2]/article/header/div[1]/div/ul/li[1]/a")
	public static WebElement topic1;
	
	@FindBy(xpath="html/body/div[2]/article/header/div[1]/div/ul/li[2]/a")
	public static WebElement topic2;
	
	@FindBy(xpath="html/body/div[2]/article/header/div[1]/div/ul/li[3]/a")
	public static WebElement topic3;
	
	@FindBy(xpath="html/body/div[2]/article/div/div[1]/section/div/img")
	public static WebElement featured_img;
	
	// Objects for Channel's More Channel resources :
	public static String globalMoreResourceXpath="html/body/div[1]/div/div/div/div[";
	public static String resourcesOurPrice="]/div[2]/div[2]/div[2]";
	public static String resourcesTitle="]/div[1]/h3";
	public static String resourcesAuthor="]/div[1]/p";
	public static String resourcesImage="]/div[2]/div[1]";
	public static String resourcesButton="]/div[2]/div[2]/a";
	public static String resourcesRetail="]/div[2]/div[2]/div[1]";
	public static String resourcesOurprice="]/div[2]/div[2]/div[2]";
	public static String resourcesDesc="]/div[2]/p";
	public static String resourcesType="]/div[1]/p";
	
	// Objects for Channel's Recent Items :
	public static String recentItemsList="html/body/div[1]/article/div/div[2]//div[@class='channel_resources--featured_item layout--two_column']";
	public static String globalRecentItem="html/body/div[1]/article/div/div[2]/div[";
	public static String recentItemType="]/p[1]";
	public static String recentItemTitle="]/h3";
	public static String recentItemDesc="]/p[2]";
	public static String recentItemButton="]/a";
	public static String recentItemTitleText="]/h3/a";
	
	public static String moreResourcesItemsList="html/body/div[1]/div/div/div//div[@class='channel_resources--item layout--two_column layout--three_column']";
	public static String globalMoreResourceItem="html/body/div[1]/div/div/div/div[";
	public static String MoreResourceItemType="]/div[1]/p";
	public static String MoreResourceItemTitle="]/div[1]/h3";
	public static String MoreResourceItemTitleText="]/div[1]/h3/a";
	public static String MoreResourceItemDesc="]/div[2]/p";
	public static String MoreResourceItemImage="]/div[2]/div[1]";
	public static String MoreResourceItemButton="]/div[2]/div/a";
	public static String MoreResourceItemRetail="]/div[2]/div[2]/div[1]";
	public static String MoreResourceItemAuthor="]/div[1]/p";
	public static String MoreResourceItemOurprice="]/div[2]/div[2]/div[2]";
}

