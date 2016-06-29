package fotf_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fotf_Operations.Opr_Sitecore_AboutUs;

public class Obj_Sitecore_AboutUs_FourItem extends Opr_Sitecore_AboutUs{
	public Obj_Sitecore_AboutUs_FourItem(WebDriver Driver){
		PageFactory.initElements(Driver, this);
	}
	
	
//Four Items / Four Columns - Rectangle
	@FindBy(xpath="//div[@class='common--component_box']/div/h2")
	public static WebElement aboutusFourItemsFourColumnsRectangleTitle;
	
	@FindBy(xpath="//div[@class='common--component_box']/div/p")
	public static WebElement aboutusFourItemsFourColumnsRectangleDescription;
	
	@FindBy(css="figure[class='fouritems_fourcols_rect--img']")
	public static WebElement aboutusFourItemsFourColumnsRectangleImage;
	
	@FindBy(css="div[class='fouritems_fourcols_rect--text']")
	public static WebElement aboutusFourItemsFourColumnsRectangleText;
	
//Four Items / With Inset
	@FindBy(xpath="//div[@class='fouritems_inset--container']/h2")
	public static WebElement aboutusFourItemsWithInsetTitle;
	
	@FindBy(xpath="//div[@class='fouritems_itemtext']/p")
	public static WebElement aboutusFourItemsWithInsetDescription;
	
	@FindBy(css="figure[class='fouritems_inset--img']")
	public static WebElement aboutusFourItemsWithInsetImage;
	
	@FindBy(css="div[class='fouritems_inset--text']")
	public static WebElement aboutusFourItemsWithInsetText;
	
	@FindBy(css="figure[class='fouritems_inset_data--img']")
	public static WebElement aboutusFourItemsWithInsetDataImage;
	
	@FindBy(css="div[class='fouritems_inset_data--text']")
	public static WebElement aboutusFourItemsWithInsetDataText;
	
	@FindBy(xpath="//div[contains(@class,'fouritems_inset_data--container')]")
	public static WebElement aboutusFourItemsWithInsetImageShapePosition;
//Four Items / Two Column		
	@FindBy(css="figure[class='fouritems_twocols--img']")
	public static WebElement aboutusFourItemsTwoColumnsImage;
	
	@FindBy(css="div[class='fouritems_twocols--text']")
	public static WebElement aboutusFourItemsTwoColumnsText;
	
	@FindBy(xpath="//div[@class='common--component_box']/div/div/div/div/ul/li/a/img")
	public static WebElement aboutusFourItemsTwoColumnsListImage;
	
	@FindBy(xpath="//div[@class='common--component_box']/div/div/div/div/ul/li/a/span")
	public static WebElement aboutusFourItemsTwoColumnsListText;
	
	
//Four Items / Four Columns - Square		
	@FindBy(xpath="html/body/div[2]/div/div/div/div/div/h2")
	public static WebElement aboutusFourItemsFourColumnsSquareTitle;
	
	@FindBy(css="figure[class='fouritems_fourcols_square--img']")
	public static WebElement aboutusFourItemsFourColumnsSquareImage;
	
	@FindBy(css="div[class='fouritems_fourcols_square--apps']")
	public static WebElement aboutusFourItemsFourColumnsSquareAppImage;	
	
}

