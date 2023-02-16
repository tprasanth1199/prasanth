package selinium_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel02_java {
	public void Launchaut() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tpras\\OneDrive\\Desktop\\S S\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://web.whatsapp.com");
		Thread.sleep(2000);
		driver.manage().window().maximize ();
	}
	   public static void main(String[] args) throws InterruptedException {
		   sel02_java obj = new sel02_java();
		   obj.Launchaut();
	}
}


