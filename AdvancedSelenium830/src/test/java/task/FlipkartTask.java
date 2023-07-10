package task;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartTask {
	public static WebDriver driver;
	public static void switchToChildWindow(Set<String> allID, String ParentId) {
		allID.remove(ParentId);
		for(String id:allID) {
			driver.switchTo().window(id);
		}
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();

	}
	public static void switchBackToParent(String ParentId) {
		driver.switchTo().window(ParentId);
	}
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/computers/computer-peripherals/projectors/pr?sid=6bo%2Ctia%2C1hx&fm=neo%2Fmerchandising&iid=M_0cc842bf-96c6-4409-b385-b0a904682f33_2_372UD5BXDFYS_MC.ICU0BSHGNPBF&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_4_L2_view-all&cid=ICU0BSHGNPBF&p%5B%5D=facets.fulfilled_by%255B%255D%3DFlipkart%2BAssured&p%5B%5D=facets.brand%255B%255D%3DZEBRONICS&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InZhbHVlQ2FsbG91dCI6eyJtdWx0aVZhbHVlZEF0dHJpYnV0ZSI6eyJrZXkiOiJ2YWx1ZUNhbGxvdXQiLCJpbmZlcmVuY2VUeXBlIjoiVkFMVUVfQ0FMTE9VVCIsInZhbHVlcyI6WyJGcm9tIOKCuTk5OTkiXSwidmFsdWVUeXBlIjoiTVVMVElfVkFMVUVEIn19LCJ0aXRsZSI6eyJtdWx0aVZhbHVlZEF0dHJpYnV0ZSI6eyJrZXkiOiJ0aXRsZSIsImluZmVyZW5jZVR5cGUiOiJUSVRMRSIsInZhbHVlcyI6WyJQcm9qZWN0b3JzIl0sInZhbHVlVHlwZSI6Ik1VTFRJX1ZBTFVFRCJ9fSwiaGVyb1BpZCI6eyJzaW5nbGVWYWx1ZUF0dHJpYnV0ZSI6eyJrZXkiOiJoZXJvUGlkIiwiaW5mZXJlbmNlVHlwZSI6IlBJRCIsInZhbHVlIjoiUFJPRzlIRllTQUtaQkc3UyIsInZhbHVlVHlwZSI6IlNJTkdMRV9WQUxVRUQifX19fX0%3D&fm=neo%2Fmerchandising&iid=M_f7a5fdd0-1eef-41cb-b4d7-f6baab2e86aa_3.GK5XP4J53XID&ssid=azoea8zjjk0000001687235176989&otracker=hp_omu_Best%2Bof%2BElectronics_3_3.dealCard.OMU_GK5XP4J53XID_3&otracker1=hp_omu_PINNED_neo%2Fmerchandising_Best%2Bof%2BElectronics_NA_dealCard_cc_3_NA_view-all_3&cid=GK5XP4J53XID");
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(text(),'Egate i9 Pro-Max Full HD 1080p Native ')]")).click();
		switchToChildWindow(driver.getWindowHandles(), parentWindowId);
		//driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		switchBackToParent(parentWindowId);
		driver.findElement(By.xpath("//a[contains(text(),'PLAY Latest MP1 Pro 1080P Projector, 6000 lm')]")).click();
		switchToChildWindow(driver.getWindowHandles(), parentWindowId);
//		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		switchBackToParent(parentWindowId);
		driver.findElement(By.xpath("//a[contains(text(),'ZEBRONICS Zeb-PixaPlay 12 (3000 lm / 1 Speaker / Remote...')]")).click();
		switchToChildWindow(driver.getWindowHandles(), parentWindowId);
		//driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		List <WebElement> elements=new ArrayList();
		
		
	}
}
