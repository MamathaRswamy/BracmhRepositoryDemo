package contacts;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;

@Listeners(genericLibraries.ListenerImplementation.class)
public class DemoTestExtent extends BaseClass {
	@Test
	public void validatePassTest() {
		System.out.println("This is from passed testcase");
	}
	@Test
	public void validateFailedTest() {
		driver.get("https://www.instagram.com");	}

	@Test
	public void validateSkippedTest() {
		System.out.println("This is from Skipped testcase");
		throw new SkipException("This is skipped");
	}


}
