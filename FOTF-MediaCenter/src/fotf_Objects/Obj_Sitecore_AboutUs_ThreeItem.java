package fotf_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fotf_Operations.Opr_Sitecore_AboutUs;

public class Obj_Sitecore_AboutUs_ThreeItem extends Opr_Sitecore_AboutUs{
	public Obj_Sitecore_AboutUs_ThreeItem(WebDriver Driver){
		PageFactory.initElements(Driver, this);
	}
	
	//Three Items Three Columns
			@FindBy(css="div[class='threeitems_threecols--item_container']")
			public static WebElement aboutusThreeColumnContainer;
			
			@FindBy(css="div[class='threeitems_threecols--item']")
			public static WebElement aboutusThreeColumnContent;
			
			@FindBy(css="figure[class='threeitems_threecols--img']")
			public static WebElement aboutusThreeColumnContentImage;	
			
			@FindBy(xpath="//figure[@class='threeitems_threecols--img']/a")
			public static WebElement aboutusThreeColumnContentImageLink;	
			
			@FindBy(xpath="//div[@class='common--component_box']/div/div/div/h3/a")
			public static WebElement aboutusThreeColumnContentTitleLink;
			
			//Three Items Stacked Image Left
			@FindBy(css="div[class='threeitems_stackedcols--item_container']")
			public static WebElement aboutusStackedImageLeftContainer;
			
			@FindBy(css="div[class='threeitems_stackedcols--item']")
			public static WebElement aboutusStackedImageLeftContent;
			
			@FindBy(css="figure[class='threeitems_stackedcols--img']")
			public static WebElement aboutusStackedImageLeftContentImage;
			
			@FindBy(xpath="//figure[@class='threeitems_stackedcols--img']/a")
			public static WebElement aboutusStackedImageLeftContentImageLink;
			
			@FindBy(xpath="//div[@class='common--component_box']/div/div/div/div/h3")		
			public static WebElement aboutusStackedImageLeftContentTitle;
			
			@FindBy(xpath="//div[@class='common--component_box']/div/div/div/div/h3/a")		
			public static WebElement aboutusStackedImageLeftContentTitleLink;
			
			@FindBy(xpath="//div[@class='threeitems_stackedcols--text']/p")
			public static WebElement aboutusStackedImageLeftContentText;
			
		//Three Columns Links Overlaid
			@FindBy(css="a[class='threeitems_threecols_link--link']")
			public static WebElement aboutusThreeColumnsLinksOverlaidLink;
			
			@FindBy(xpath="//a[@class='threeitems_threecols_link--link']/span")
			public static WebElement aboutusThreeColumnsLinksOverlaidText;
	
	
	
	
}

