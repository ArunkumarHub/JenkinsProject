package fotf_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fotf_Operations.Opr_Sitecore_AboutUs;

public class Obj_Sitecore_AboutUs_FiveItem extends Opr_Sitecore_AboutUs{
	public Obj_Sitecore_AboutUs_FiveItem(WebDriver Driver){
		PageFactory.initElements(Driver, this);
	}
	
	
	
//FiveColumn
	@FindBy(css="div[class='fiveitems_fivecols--container']")
	public static WebElement aboutusFiveColumnContainer;
	
	@FindBy(css="div[class='fiveitems_fivecols--content']")
	public static WebElement aboutusFiveColumnContent;
	
	@FindBy(css="figure[class='fiveitems_fivecols--img']")
	public static WebElement aboutusFiveColumnContentImage;	
	
	@FindBy(css="div[class='fiveitems_fivecols--shortdesc']")
	public static WebElement aboutusFiveColumnContentDescription;
	
	@FindBy(css="a[class='fiveitems_fivecols--more_link']")
	public static WebElement aboutusFiveColumnContentMoreLink;
	
//2x3		
	@FindBy(css="div[class='fiveitems_twobythree--container']")
	public static WebElement aboutus2x3Container;	
	
	@FindBy(css="div[class='fiveitems_twobythree--content article--item']")
	public static WebElement aboutus2x3ContentForArticle;
	
	@FindBy(css="div[class='fiveitems_twobythree--content']")
	public static WebElement aboutus2x3Content;
	
	@FindBy(css="a[class='fiveitems_twobythree--link']")
	public static WebElement aboutus2x3ContentLink;
	
	@FindBy(xpath="//div[@class='common--component_box']/div/div/a/img")
	public static WebElement aboutus2x3ContentImage;
	
	@FindBy(xpath="//div[@class='common--component_box']/div/div/a/em")
	public static WebElement aboutus2x3ContentText;	
	
	
}

