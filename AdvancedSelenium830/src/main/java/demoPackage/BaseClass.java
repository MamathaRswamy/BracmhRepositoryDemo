package demoPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;

	@BeforeClass
	public void setUpTheBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("test before");
	}
	@BeforeSuite
	public void beforeClass() {
		System.out.println("before suite");
	}
	@AfterSuite
	public void afterclass() {
		System.out.println("after suite");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("test after");
	}
	@AfterClass
	public void teardowntheBrowser() {
		driver.quit();
	}
// 
}
