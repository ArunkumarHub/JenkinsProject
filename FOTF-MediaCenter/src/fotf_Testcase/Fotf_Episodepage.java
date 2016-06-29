package fotf_Testcase;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fotf_Config.Basedriver;

public class Fotf_Episodepage extends Basedriver{
	public static String allEpisodepage="/media/daily-broadcast##latest-episode";
	
	@BeforeMethod
	public static void baseUrl(){
		Driver.get("http://test.focusonthefamily.com");
	}
	
	@Test
	public static void verify_fotf_episode_LongloadSearch(){
		log.info("");
		log.info("_____________________________________________________________________________________________________________");
		log.info("*** TestCase - Media Center: Long load time for displaying results in Daily Broadcast episode search bar ***");
		log.info("_____________________________________________________________________________________________________________");
		log.info("PBI - 17118");
		Driver.get(baseFotfUrl+allEpisodepage);
		episodeObj.longLoadSearchEpisode();
	}
}
