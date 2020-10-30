package loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBloginpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String exptitle="Facebook – log in or sign up";
		String acttitle=driver.getTitle();
		if(exptitle .equals(acttitle))
		{
			System.out.println("title is passed");
		}
			else
			{
				System.out.println("title is failed");
		}
driver.close();
	}

}
