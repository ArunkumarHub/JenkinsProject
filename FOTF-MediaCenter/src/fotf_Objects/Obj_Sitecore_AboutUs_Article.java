package fotf_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fotf_Operations.Opr_Sitecore_AboutUs;

public class Obj_Sitecore_AboutUs_Article extends Opr_Sitecore_AboutUs{
	public Obj_Sitecore_AboutUs_Article(WebDriver Driver){
		PageFactory.initElements(Driver, this);
	}
	
	
	
	// Article Components
			@FindBy(xpath=".//*[@id='social_sharing_top_gig_containerParent']/ol/li")
			public static WebElement aboutusArticleBreadCrumbs;
			
			@FindBy(xpath=".//*[@id='social_sharing_top_gig_containerParent']/h1")
			public static WebElement aboutusArticleTitle;

			@FindBy(xpath=".//*[@id='social_sharing_top_gig_containerParent']/p")
			public static WebElement aboutusArticleAuthor;

			@FindBy(xpath=".//*[@id='social_sharing_bottom_gig_containerParent']/div[1]/div[1]/div")
			public static WebElement aboutusArticleTopic;

			@FindBy(xpath=".//*[@id='social_sharing_bottom_gig_containerParent']/div[1]/figure")
			public static WebElement aboutusArticleImage;
			
			@FindBy(xpath=".//*[@id='social_sharing_bottom_gig_containerParent']/div[1]/p")
			public static WebElement aboutusArticleDescription;
	
			@FindBy(xpath=".//*[@id='social_sharing_top_gig_containerParent']/ol/li/span")
			public static WebElement aboutusArticleInsertLinkBreadCrumbs;
			
			@FindBy(xpath="//span[text()='MergeArticleAndArticle_DataSource']")
			public static WebElement articleCommonComponent;
			
			@FindBy(xpath="//*[normalize-space()='Abounding Midlife Living']")
			public static WebElement aboutusArticleSetTitle;
			
			@FindBy(xpath="//div[@class='article--content']/span[2]")
			public static WebElement aboutusArticleClickDesc;
			
			@FindBy(xpath="//div[17]/div[2]/div[2]/a[1]/img")
			public static WebElement aboutusArticleEditDesc;
			
			@FindBy(xpath="html/body")
			public static WebElement aboutusArticleRichTextEditor;
			
			@FindBy(xpath=".//*[@id='OkButton']")
			public static WebElement aboutusArticleRichTextEditorAccept;
			
			@FindBy(xpath=".//*[@id='social_sharing_bottom_gig_containerParent']/div[1]/text()")
			public static WebElement aboutusArticleRichTextContent;
			
			@FindBy(xpath="h1[@class='article--title']")
			public static WebElement aboutusArticleTitleText;
			
			@FindBy(xpath="//div[@class='article--content']")
			public static WebElement aboutusArticleRichText;
			
			public static String aboutusRecentArticleTitleText="//div[@class='threeitems_threecols--item'][*]/h3";
}

