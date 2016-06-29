package fotf_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fotf_Operations.Opr_Sitecore_AboutUs;

public class Obj_Sitecore_AboutUs_SixItem extends Opr_Sitecore_AboutUs{
	public Obj_Sitecore_AboutUs_SixItem(WebDriver Driver){
		PageFactory.initElements(Driver, this);
	}
	
	
//Six Items / Three Columns
	@FindBy(css="figure[class='sixitems_threecols--img']")
	public static WebElement aboutusSixItemsThreeColumnsContentImage;
	
	@FindBy(xpath="//figure[@class='sixitems_threecols--img']/a")
	public static WebElement aboutusSixItemsThreeColumnsContentImageLink;
	
//Six Items / Six Columns
	@FindBy(css="a[class='sixitems_sixcols--img']")
	public static WebElement aboutusSixItemsSixColumnsContentImage;
	
//Six Items / Two Columns
	@FindBy(xpath="//div[@class='sixitems_twocols--container']/h2")
	public static WebElement aboutusSixItemTwoColumnsTitle;
	
	@FindBy(xpath="html/body/div[2]/div/div/div/div/div/div/p")
	public static WebElement aboutusSixItemTwoColumnsDescription;
	
	@FindBy(css="span[class='sixitems_twocols--img']")
	public static WebElement aboutusSixItemTwoColumnsImage;
	
	@FindBy(css="div[class='sixitems_twocols--content']")
	public static WebElement aboutusSixItemTwoColumnsText;	
	
	
//Six Items / Six Columns - With Text
	@FindBy(css="figure[class='sixitems_sixcols_text--img']")
	public static WebElement aboutusSixColumnWithTextContentImage;
	
	@FindBy(css="a[class='sixitems_sixcols_text--more_link']")
	public static WebElement aboutusSixColumnWithTextContentMoreLink;	
	

}