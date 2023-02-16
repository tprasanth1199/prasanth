package selinium_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel_01 {
 public void Launchaut()
	 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\tpras\\OneDrive\\Desktop\\S S\\chrome driver\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
	 }
     public static void main(String[] args) {
		sel_01 obj=new sel_01();
		obj.Launchaut();
 }
	}
