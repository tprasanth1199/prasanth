package selinium_java;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel01_c {
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tpras\\OneDrive\\Desktop\\S S\\chrome driver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://web.whatsapp.com/");
	    Thread.sleep(2000);
	   
	}

	public static void main(String[] args) throws InterruptedException {
		sel01_c obj =new sel01_c();
		obj.LaunchAUT();
		

	}

}
