package genericLibraries;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(genericLibraries.ListenerImplementation.class)
public class DemoTestExtent extends BaseClass {
	@Test
	public void validatePassTest() {
		System.out.println("This is from passed testcase");
	}
	@Test
	public void validateFailedTest() {
		assertEquals(false, true);	
	}

	@Test
	public void validateSkippedTest() {
		System.out.println("This is from Skipped testcase");
		throw new SkipException("This is skipped");
	}


}
