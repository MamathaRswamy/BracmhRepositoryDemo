package demoPackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AnnotationsClass extends BaseClass {

	@Test
	public void loginWithValidCredentials() throws InterruptedException {

		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("hello@123");
		driver.findElement(By.id("Password")).sendKeys("demo@1323424");
		driver.findElement(By.className("login-button")).click();
		Thread.sleep(2000);
	}

	@Test
	public void loginWithInvalidCredentials() throws InterruptedException {

		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("#$%^&*$%^");
		driver.findElement(By.id("Password")).sendKeys("(*&^%$%^&*(");
		driver.findElement(By.className("login-button")).click();
		Thread.sleep(2000);

	}
	
	
}
