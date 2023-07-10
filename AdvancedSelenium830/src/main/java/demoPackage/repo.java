package demoPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class repo {
	@Test

	public void reporte() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		ExtentSparkReporter reporter=new ExtentSparkReporter("./Errorshot/demo.html");
		ExtentReports report=new ExtentReports();
		report.attachReporter(reporter);
		ExtentTest logger = report.createTest("terscase2");

		logger.log(Status.PASS, "BROWSER LAUNCHED");
		logger.log(Status.FAIL,"couldnot identify the element");
		logger.log(Status.SKIP, "this step skipped");
		logger.log(Status.INFO, "this is info");


		ExtentTest logger1 = report.createTest("terscase3");
		logger1.log(Status.PASS, "BROWSER LAUNCHED");
		//	logger1.log(Status.SKIP, "this step skipped");
		logger1.log(Status.INFO, "this is info");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File photo = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"/Errorshot/demo123.png";
		File file=new File(path);
		FileHandler.copy(photo, file);
		logger.addScreenCaptureFromPath(path);
		
		report.flush();

	}
}
