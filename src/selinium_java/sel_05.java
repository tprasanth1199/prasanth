package selinium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel_05 {
	WebDriver driver;
	public void Launchaut() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tpras\\OneDrive\\Desktop\\S S\\chrome driver\\chromedriver_win32\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486462454211&hvpos=&hvnetw=g&hvrand=4117601626240405615&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=EAIaIQobChMInLP9-9yC_QIVR5NmAh0GOQ13EAAYASAAEgI3TPD_BwE");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void search_senddata() throws InterruptedException
	{
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phone");
	Thread.sleep(2000);
	driver.findElement(By.id("nav-search-submit-button")).click();
	}
	

	public static void main(String[] args) throws InterruptedException {
		sel_05 obj =new sel_05();
		obj.Launchaut();
		obj.search_senddata();
		
	

	}

}
