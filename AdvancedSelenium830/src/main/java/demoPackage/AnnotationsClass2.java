package demoPackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AnnotationsClass2 extends BaseClass {

	@Test
	public void loginWithValidCredentials() throws InterruptedException {

		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("+++++++");
		driver.findElement(By.id("Password")).sendKeys("********");
		driver.findElement(By.className("login-button")).click();
		Thread.sleep(2000);
	}

	@Test
	public void loginWithInvalidCredentials() throws InterruptedException {

		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("22222222222");
		driver.findElement(By.id("Password")).sendKeys("55555555555");
		driver.findElement(By.className("login-button")).click();
		Thread.sleep(2000);

	}
	
	
}
