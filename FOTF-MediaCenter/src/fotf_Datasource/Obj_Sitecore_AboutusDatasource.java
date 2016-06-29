package fotf_Datasource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fotf_Config.AboutusCommonClass;
import fotf_Config.Basedriver;

public class Obj_Sitecore_AboutusDatasource extends Basedriver{
	public Obj_Sitecore_AboutusDatasource(){
		PageFactory.initElements(Driver, this);
	}
	

	// Navigation to AboutUs on Sitecore 		
		@FindBy(xpath="//span[text()='Content Source']/parent::a/parent::div/following-sibling::div[1]/a//span[text()='FOTF.com']")
		public static WebElement fotfCom;
		
		@FindBy(xpath="html/body/form/div[5]/div[2]/div/div[1]/div/div[3]/div/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/a/span")
		public static WebElement fotfComFirstItem;
		
		@FindBy(xpath=".//*[@id='Tree_Glyph_11111111111111111111111111111111']")
		public static WebElement sitecoreExtract;
		
		@FindBy(xpath=".//*[@id='Tree_Glyph_0DE95AE441AB4D019EB067441B7C2450']")
		public static WebElement contentExtract;
		
		@FindBy(xpath=".//*[@id='Tree_Glyph_A3ED2CE1B79A43E9BF368AB40D48C87C']")
		public static WebElement fotfExtract;
		
		@FindBy(xpath=".//*[@id='Tree_Node_F8DE4B6E456B473792C2AEA89BC588FF']/span")
		public static WebElement aboutUs;
		
	//	Navigation to Sitecore / ContentSource Article
		@FindBy(xpath=".//*[@id='Ribbon_Nav_ConfigureStrip']")
		public static WebElement ConfigureMenu;	
		
		@FindBy(xpath=".//*[@id='C1DEF50287025462F9D3C30A12E36E0A7']/div[1]/a/span")
		public static WebElement CloneButton;
		
		@FindBy(xpath=".//*[@id='Tree_Glyph_596C0A4CA11044858156D636B11ACB69']")
		public static WebElement ContentSource;	
		
		@FindBy(xpath=".//*[@id='Tree_Glyph_C0758E11955C422F8A1062134B75AF1E']")
		public static WebElement ArticleUnderContentSource;			
		
		@FindBy(xpath=".//*[@id='Tree_Glyph_00F5C4A7FF23412988AE06BF9857F963']")
		public static WebElement Article2014;
		
		@FindBy(xpath=".//*[@id='Tree_Glyph_C80746D83B7E405AA73B1E78E534CEFC']")
		public static WebElement Article2014_10;		
		
		@FindBy(xpath=".//*[@id='Tree_Glyph_6D3E8586616044DDAAA875B6A0D4F7C6']")
		public static WebElement Article2014_10_22;		
		
		@FindBy(xpath=".//*[@id='Tree_Glyph_0D60A68EFED1410E9CF9C564BBED0773']")
		public static WebElement Article2014_10_22_15;	
		
		@FindBy(xpath=".//*[@id='Tree_Glyph_FE6ECF6325D6419ABE9D54249D24E5C2']")
		public static WebElement Article2014_10_22_15_12;
		
		public static String ArticleCloneItem_Par1="html/body/form/div[5]/div[2]/div/div[1]/div/div[3]/div/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div[2]/div[";
		public static String ArticleCloneItem_Par2="]/a/span";
		
	//	Navigation to Sitecore / Auto-aboutus for Cloning
		@FindBy(xpath=".//*[@id='Treeview_11111111111111111111111111111111']/img")
		public static WebElement SitecoreTreeView;
		
		@FindBy(xpath=".//*[@id='Treeview_0DE95AE441AB4D019EB067441B7C2450']/img")
		public static WebElement ContentTreeView;
		
		@FindBy(xpath=".//*[@id='Treeview_A3ED2CE1B79A43E9BF368AB40D48C87C']/img")
		public static WebElement FOTFComTreeView;
	
		//Parent / Siblings - //span[text()='auto-aboutus']/parent::a/parent::div/img		
		public static String AutoAboutUsExtract ="//span[contains(.,'" + AboutusCommonClass.PageComponentContentItemName() + "')]/parent::a/parent::div/img";
		public static String AutoAboutusTreeView = "//span[text()='" + AboutusCommonClass.PageComponentContentItemName() + "']"; 
		
	@FindBy(xpath=".//*[@id='Templates_EAD94BDA487647C6ADC4856C5D6BFA88']/a/span")
	public static WebElement commonComponentTemplate;
	
	@FindBy(xpath=".//*[@id='Templates_AC5993A89C69449F8067BC0E9000CD09']/a/span")
	public static WebElement childItemTemplate;	
	
	@FindBy(xpath=".//*[@id='Templates_7436C3BD6E7E4D72823601C0FDAF1F06']/img")
	public static WebElement MetaDataUndercommonComponentTemplate;
	
	@FindBy(xpath=".//*[@id='BContent']/span/span")
	public static WebElement commonComponentContentTab;
	
	@FindBy(xpath="//div[contains(text(),'Title')]/following-sibling::div/input")
	public static WebElement commonComponentTitle;
	
	//@FindBy(xpath="html/body/form/div[5]/div[2]/div/div[3]/div/div/div[2]/div/div[1]/div[3]/table[1]/tbody/tr/td/table[2]/tbody/tr/td[2]/div[2]/input")
	@FindBy(xpath="//div[text()='Title:']/following-sibling::div/input")
	public static WebElement childItemTitle;
	
	@FindBy(xpath="//a[text()='Edit HTML']")
	public static WebElement commonComponentShowEditor;
	
	@FindBy(xpath=".//*[@id='ctl00_ctl00_ctl05_Html']") 
	public static WebElement commonComponentTextEditor;
	
	@FindBy(xpath=".//*[@id='OK']")
	public static WebElement itemTextAccept;
	
	@FindBy(xpath="//div[text()='Image:']/following-sibling::div[2]/input")
	public static WebElement commonComponentImage;
	
	//@FindBy(xpath="html/body/form/div[5]/div[2]/div/div[3]/div/div/div[2]/div/div[1]/div[3]/table[1]/tbody/tr/td/table[1]/tbody/tr/td[2]/div[3]/input")
	@FindBy(xpath="//div[text()='Image:']/following-sibling::div/input")
	public static WebElement childItemImage;	
	
	@FindBy(xpath="//div[text()='More Information Link:']/following-sibling::div[1]/a[text()='Insert external link']")
	public static WebElement commonComponentMoreInfoLink;
	
	@FindBy(xpath="//div[text()='More Link:']/following-sibling::div[1]/a[text()='Insert external link']")
	public static WebElement childComponentItemMoreLink;
	
	@FindBy(xpath=".//*[@id='Text']")
	public static WebElement moreInfoLinkDesc;
	
	@FindBy(xpath=".//*[@id='Url']")
	public static WebElement moreInfoLinkURL;
	
	@FindBy(xpath=".//*[@id='OK']")
	public static WebElement moreInfoLinkOK;
	
	//@FindBy(xpath="//div[text()='IFrame:']/following-sibling::div[2]/input")
	@FindBy(xpath="//div[text()='IFrame:']/following-sibling::div[1]/a[text()='Insert external link']")
	public static WebElement commonComponentIFrameLink;	
	
	@FindBy(xpath=".//*[@id='C3FCEBB9F38F4AB4857FCFC415B6A342_42F1FD8820E342BD9217A9468F115928']/div[1]/a/img")
	public static WebElement saveDataSource;
	
	@FindBy(xpath=".//*[@id='BContent']/span/span")
	public static WebElement commonComponent;
	
	
	@FindBy(xpath="html/body/form/div[2]/div[2]/div/div[1]/div[1]/fieldset/div[1]/input")
	public static WebElement removeLinksForDeleteAboutUsItem;
	
	@FindBy(xpath="html/body/form/div[2]/div[3]/div[1]/button[1]")
	public static WebElement deleteWithDatasoureItem;
	
	// Create Child List Items
	@FindBy(xpath=".//*[@id='Ribbon_Nav_HomeStrip']")
	public static WebElement homeMenuStrip;
	
	//@FindBy(xpath=".//*[@id='NewPanelList']/a[1]/span[2]")
	//@FindBy(xpath="//span[contains(text(),'Insert from template')]/parent::a/parent::div/a[1]/span[text()='Folder']")
	//public static WebElement createFolder; //dev. environment
	
	@FindBy(xpath="//span[text()='Insert from template']/parent::div/parent::a/parent::div/a[1]/div/span[text()='Folder']")
	public static WebElement createFolder;	//test environment
	
	@FindBy(xpath=".//*[@id='Value']")
	public static WebElement childFolderName;
	
	// Duplicate Children Items Datasource
	@FindBy(xpath="//span[text()='ChildItems-1']")
	public static WebElement childItems_1;
	
	@FindBy(xpath="//span[text()='CarouselItems-1']")
	public static WebElement carouselItems_1;
	
	@FindBy(xpath="//span[text()='GrandChildItems-1']")
	public static WebElement grandChildItems_1;
	
	@FindBy(xpath="//td[text()='Duplicate']")
	public static WebElement duplicateChildItem;
	
	// Recent Article Override
	//@FindBy(xpath="html/body/form/div[5]/div[2]/div/div[3]/div/div/div[2]/div/div[1]/div[3]/table[1]/tbody/tr/td/table[10]/tbody/tr/td[2]/div[3]/table/tbody/tr[2]/td[1]/div/input")
	@FindBy(xpath="//div[text()='Recent Articles Override:']/following-sibling::div[2]/div/table/tbody/tr[2]/td/div[1]/input")
	public static WebElement recentArticleSearchBox;
	
	//@FindBy(xpath="html/body/form/div[5]/div[2]/div/div[3]/div/div/div[2]/div/div[1]/div[3]/table[1]/tbody/tr/td/table[10]/tbody/tr/td[2]/div[3]/table/tbody/tr[2]/td[1]/select/option[1]")
	@FindBy(xpath="div[text()='Recent Articles Override:']/following-sibling::div[2]/div/table/tbody/tr[2]/td[1]/select/option[1]")
	public static WebElement recentArticleOption1;
	
	//Page Component Header Siblings 
	//@FindBy(xpath="html/body/form/div[5]/div[2]/div/div[3]/div/div/div[2]/div/div[1]/div[3]/table[1]/tbody/tr/td/table[1]/tbody/tr/td[2]/div[2]/input")
	@FindBy(xpath="//div[text()='Title']/following-sibling::div/input")
	public static WebElement pageComponentTitle;
	
	//@FindBy(xpath="html/body/form/div[5]/div[2]/div/div[3]/div/div/div[2]/div/div[1]/div[3]/table[1]/tbody/tr/td/table[3]/tbody/tr/td[2]/div[3]/div/table/tbody/tr[2]/td[1]/select/option[1]")
	@FindBy(xpath="//div[text()='Secondary Menu Items:']/following-sibling::div/div/table/tbody/tr[2]/td[1]/select/option[1]")
	public static WebElement pageComponentOption1;
	
	@FindBy(xpath="//div[text()='Is Featured']/parent::td/div[1]/input")
	public static WebElement isFeaturedCheckbox;
	
	@FindBy(xpath="//div[contains(text(),'Publication Date')]/following-sibling::div[1]/a[2]")
	public static WebElement clearPublicationDate;
	
	@FindBy(xpath="//div[contains(text(),'Publication Date')]/following-sibling::div[2]/div/table/tbody/tr/td/input")
	public static WebElement publicationDate;
	
	@FindBy(xpath="//a[contains(text(),'Title')]/parent::div/following-sibling::div/input")
	public static WebElement recentArticleTitleText;
	
	@FindBy(xpath="//div[contains(text(),'Inset Image Shape')]/following-sibling::div/select")
	public static WebElement insetImageShape;
	
	@FindBy(xpath="//div[text()='Image Shape:']/following-sibling::div/select")
	public static WebElement commonComponentImageShape;
	
	@FindBy(xpath="//div[text()='Image Shape:']/following-sibling::div/select")
	public static WebElement childComponentItemImageShape;
	
	@FindBy(xpath="//div[contains(text(),'Inset Image Position')]/following-sibling::div/select")
	public static WebElement insetImagePosition;	
	
	@FindBy(xpath="//div[contains(text(),'Inset Text')]/following-sibling::div[1]/a[text()='Edit HTML']")
	public static WebElement insetText;
	
	@FindBy(xpath="//div[contains(text(),'Inset Image')]/following-sibling::div[2]/input")
	public static WebElement insetImage;
	
	@FindBy(xpath="//div[text()='Image Size:']/following-sibling::div/select")
	public static WebElement commonComponentImageSize;
	
	@FindBy(xpath="//div[text()='Video:']/following-sibling::div[2]/div/table/tbody/tr[2]/td/select/option[1]")
	public static WebElement videoItem;
	
	@FindBy(xpath="//span[contains(text(),'Image and Link Item')]")
	public static WebElement imageAndLinkItemTemplate;
	
	@FindBy(xpath="//span[text()='Carousel Item']")
	public static WebElement carouselItemTemplate;
	
	@FindBy(xpath="//div[contains(text(),'Image')]/following-sibling::div[2]/input")
	public static WebElement imageAndLinkTemplateItemImage;

	@FindBy(xpath="//div[contains(text(),'Link Text:')]/following-sibling::div[1]/a[text()='Insert external link']")
	public static WebElement imageAndLinkTemplateItemLinkText;
}
