package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintestpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar\\chromedriver_win32\\chromedriver.exe\\");
		  WebDriver driver= new ChromeDriver();
		  driver.get("http://demo.guru99.com/test/newtours/");
		  //driver.findElement(By.name("userName")).sendKeys("mercury");
		  WebElement username=driver.findElement(By.name("userName"));
				  username.sendKeys("mercury");
		  driver.findElement(By.name("password")).sendKeys("mercury");
		  driver.findElement(By.name("submit")).click();
		  String exptitle = "Login: Mercury Tours";
		  String acttitle=driver.getTitle();
		  if(exptitle.equals(acttitle))
		  {
			  System.out.println("Test is passed");
		  }
		  else
		  {
			  System.out.println("Test is failed");
		  }
		  driver.close();
		  
        }
	}


