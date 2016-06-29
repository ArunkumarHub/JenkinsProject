package fotf_Config;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import fotf_Datasource.Obj_Sitecore_AboutusDatasource;
import fotf_Datasource.Opr_Sitecore_AboutusDatasource;
import fotf_Objects.Obj_Channel;
import fotf_Objects.Obj_Episode;
import fotf_Objects.Obj_Home;
import fotf_Objects.Obj_Sitecore_AboutUs;
import fotf_Objects.Obj_Sitecore_AboutUs_Article;
import fotf_Objects.Obj_Sitecore_AboutUs_FiveItem;
import fotf_Objects.Obj_Sitecore_AboutUs_FourItem;
import fotf_Objects.Obj_Sitecore_AboutUs_OneItem;
import fotf_Objects.Obj_Sitecore_AboutUs_HeaderItem;
import fotf_Objects.Obj_Sitecore_AboutUs_PageComponentHeader;
import fotf_Objects.Obj_Sitecore_AboutUs_Showhide;
import fotf_Objects.Obj_Sitecore_AboutUs_SixItem;
import fotf_Objects.Obj_Sitecore_AboutUs_ThreeItem;
import fotf_Objects.Obj_Sitecore_AboutUs_Timeline;
import fotf_Objects.Obj_Sitecore_AboutUs_TwoItem;
import fotf_Objects.Obj_Sitecore_CustomInitiative;
import fotf_Operations.Opr_Sitecore_AboutUs;
import fotf_Operations.Opr_Sitecore_AboutUs_Assert;

public class Basedriver {
public static String baseFotfUrl;
public static WebDriver Driver=null;
public static Obj_Home homepageObj;
public static Obj_Channel channelObj;
public static Obj_Episode episodeObj;
public static Obj_Sitecore_AboutUs sitecoreObj;
public static Obj_Sitecore_AboutUs_OneItem sitecoreObj_OneItem;
public static Obj_Sitecore_AboutUs_TwoItem sitecoreObj_TwoItem;
public static Obj_Sitecore_AboutUs_ThreeItem sitecoreObj_ThreeItem;
public static Obj_Sitecore_AboutUs_FourItem sitecoreObj_FourItem;
public static Obj_Sitecore_AboutUs_FiveItem sitecoreObj_FiveItem;
public static Obj_Sitecore_AboutUs_SixItem sitecoreObj_SixItem;
public static Obj_Sitecore_AboutUs_HeaderItem sitecoreObj_HeaderItem;
public static Obj_Sitecore_AboutUs_Showhide sitecoreObj_Showhide;
public static Obj_Sitecore_AboutUs_Article sitecoreObj_Article;
public static Obj_Sitecore_AboutUs_Timeline sitecoreObj_Timeline;
public static Obj_Sitecore_AboutUs_PageComponentHeader sitecoreObj_PageComponentHeader;
public static Opr_Sitecore_AboutUs objSitecoreOperation;
public static Opr_Sitecore_AboutUs_Assert objSitecoreOperationAssert;
public static Obj_Sitecore_AboutusDatasource dataSourceObj;
public static Obj_Sitecore_CustomInitiative sitecoreObj_CustomInitiative;
public static Logger log = Logger.getLogger(Basedriver.class.getName());
public static FileInputStream file=null;
public static Properties expectedData=null;
public static Properties dataSourceProvider=null;
public static Properties customInitiativeDataSourceProvider=null;

static String testProp = "test.property";
static Properties sysProps;


@BeforeSuite
public static String environmentSetup(){
	sysProps = System.getProperties();
	String server = sysProps.getProperty(testProp);
	if(server.equals("dev")){
		baseFotfUrl="http://dev.";
	}else if(server.equals("test")){
		baseFotfUrl="http://test.";
	}else if(server.equals("testpub")){
		baseFotfUrl="http://testpub.";
	}
	return baseFotfUrl;
}
@BeforeTest
@Parameters({ "browser" })
public static void config(String browser) throws Exception {	
	file=new FileInputStream(System.getProperty("user.dir")+"\\src\\fotf_DDF\\ExpectedData.properties");
	expectedData=new Properties();
	expectedData.load(file);
	
	file=new FileInputStream(System.getProperty("user.dir")+"\\src\\fotf_DDF\\AboutUs-DataSource.properties");
	dataSourceProvider=new Properties();
	dataSourceProvider.load(file);
	
	file=new FileInputStream(System.getProperty("user.dir")+"\\src\\fotf_DDF\\CustomInitiative-DataSource.properties");
	customInitiativeDataSourceProvider=new Properties();
	customInitiativeDataSourceProvider.load(file);
	
DOMConfigurator.configure("log4j.xml");

if(browser.equalsIgnoreCase("firefox")){
	 Driver=new FirefoxDriver();
	 log.info("***** Opening Firefox Browser *****");
}
else if(browser.equalsIgnoreCase("chrome")){
	System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
	 Driver=new ChromeDriver();
	 log.info("***** Opening Chrome Browser *****");
}
else{
	DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
	capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	System.setProperty("webdriver.ie.driver", "Drivers\\IEDriverServer.exe");
	Driver=new InternetExplorerDriver(capabilities);	
	log.info("***** Opening IE Browser *****");
}
	
	//Driver.get("http://test.focusonthefamily.com/");
	Driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	Driver.manage().window().maximize();
	homepageObj=new Obj_Home(Driver);
	channelObj=new Obj_Channel(Driver);
	episodeObj=new Obj_Episode(Driver);
	sitecoreObj=new Obj_Sitecore_AboutUs(Driver);
	sitecoreObj_OneItem=new Obj_Sitecore_AboutUs_OneItem(Driver);
	sitecoreObj_TwoItem=new Obj_Sitecore_AboutUs_TwoItem(Driver);
	sitecoreObj_ThreeItem=new Obj_Sitecore_AboutUs_ThreeItem(Driver);
	sitecoreObj_FourItem=new Obj_Sitecore_AboutUs_FourItem(Driver);
	sitecoreObj_FiveItem=new Obj_Sitecore_AboutUs_FiveItem(Driver);
	sitecoreObj_SixItem=new Obj_Sitecore_AboutUs_SixItem(Driver);
	sitecoreObj_HeaderItem= new Obj_Sitecore_AboutUs_HeaderItem(Driver);
	sitecoreObj_Showhide=new Obj_Sitecore_AboutUs_Showhide(Driver);
	sitecoreObj_Article=new Obj_Sitecore_AboutUs_Article(Driver);
	sitecoreObj_Timeline=new Obj_Sitecore_AboutUs_Timeline(Driver);
	sitecoreObj_PageComponentHeader = new Obj_Sitecore_AboutUs_PageComponentHeader(Driver);
	objSitecoreOperation=new Opr_Sitecore_AboutUs();
	dataSourceObj= new Obj_Sitecore_AboutusDatasource();
	sitecoreObj_CustomInitiative=new Obj_Sitecore_CustomInitiative(Driver);
	log.info(" ");
	log.info("******************************************************* ");
	log.info("TestCase Execution Starts for FOTF Media Center Project");
	log.info("******************************************************* ");
}
	
	@AfterTest
	public static void closeDriver(){
		log.info(" ");
		log.info("TestCase Execution Finished for FOTF Media Center Project");
		log.info("Closing Driver");
		Driver.quit();		
	}
	
}
