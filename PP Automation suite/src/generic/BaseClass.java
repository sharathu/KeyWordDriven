package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public  class BaseClass {
	
	static WebDriver driver;
	static String BrowerName;
	
	public WebDriver BaseClassMethod(String BrowserName, String URL){
		//this.BrowerName=BrowserName;
		if ((BrowserName.toLowerCase()).equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver= new ChromeDriver();
		}
		else if(BrowserName.toLowerCase().equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe/");
			driver= new FirefoxDriver();
		}
		else if (BrowserName.toLowerCase().equals("ie") ^ BrowserName.toLowerCase().equals("internet explorer"))
		{
			System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.get(URL);
		driver.manage().window().maximize();
		return driver;
	}
	
	
	
	

	

}
