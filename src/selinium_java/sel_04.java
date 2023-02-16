package selinium_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel_04 {
	WebDriver driver;
	public void Launchaut() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tpras\\OneDrive\\Desktop\\S S\\chrome driver\\chromedriver_win32\\chromedriver.exe\\");
	      driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	public void Get_url()
	{
		String url=driver.getCurrentUrl();
		System.out.println("the application url is :"+url);
	}
	public void Get_src()
	{
		String src=driver.getPageSource();
		System.out.println("the source code :"+src);
		if (src.contains("label usernamelabel"))
		{
			System.out.println("the testcase pass");
		}
		else
		{
			System.out.println("the testcase fail");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		sel_04 obj=new sel_04();
		obj.Launchaut();
		obj.Get_url();
		obj.Get_src();
		

	}

}
