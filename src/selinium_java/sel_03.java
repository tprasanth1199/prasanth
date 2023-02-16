package selinium_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel_03 {
	WebDriver driver;
	public void Launchaut() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tpras\\OneDrive\\Desktop\\S S\\chrome driver\\chromedriver_win32\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Get_title()
	{
		String act_title=driver.getTitle();
		System.out.println("act_title");
		String exp_title = "welcome to amazon";
		if (act_title.equals(exp_title))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	}

	public static void main(String[] args) throws InterruptedException {
		sel_03 obj=new sel_03();
		obj.Launchaut();
		obj.Get_title();
		

	}

}
