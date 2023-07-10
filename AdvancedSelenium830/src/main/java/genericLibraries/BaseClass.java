package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;	
	@BeforeSuite(alwaysRun = true)
	public void LaunchingBrowser(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	
	}
	@AfterMethod
	public void checkTheTestResult(ITestResult result) {
	
	}
	@BeforeClass(alwaysRun = true)
	public void navigatingToApplication() {
	
	}

	@AfterSuite(alwaysRun = true)
	public void teardownTheBrowser() {
		driver.quit();
	}
}
