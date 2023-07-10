package genericLibraries;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.jsoup.Connection.Base;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/***
 * 
 * @author Mamatha
 *
 */

public class WebDriverUtility  implements IAutoConstants{
	public WebDriver driver;
	public WebDriverUtility(WebDriver driver){
		driver=this.driver;
	}
	/**
	 * This method is used to perfomr darg and drop
	 * @param src
	 * @param Destination
	 */
	public void dragAndDrop(WebElement src, WebElement Destination) {
		Actions action=new Actions(driver);

		action.dragAndDrop(src, Destination).perform();
	}
	/**
	 * This method is used to perform right click operation
	 */
	public void rightClick() {
		Actions action=new Actions(driver);

		action.contextClick().perform();
	}
	public void rightClick(WebElement element) {
		Actions action=new Actions(driver);

		action.contextClick(element).perform();
	}
	public void doubleClick() {
		Actions action=new Actions(driver);

		action.doubleClick().perform();
	}
	public void doubleClick(WebElement element) {
		Actions action=new Actions(driver);

		action.doubleClick(element).perform();
	}
	public void mouseHoveringOnElement(WebElement element) {
		Actions action=new Actions(driver);

		action.moveToElement(element).perform();
	}
	public Select selectReference(WebElement dropdown) {
		Select select=new Select(dropdown);
		return select;
	}
	public void handlingDropdown(WebElement dropdown,String Value) {
		Select select=new Select(dropdown);
		try {
			select.selectByVisibleText(Value);
		}catch(NoSuchElementException e) {
			select.selectByValue(Value);
		}
	}
	public void handlingDropdown(WebElement dropdown, int index) {
		Select select=new Select(dropdown);
		select.selectByIndex(index);
	}
	public void scrollingAction(int x, int y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	public void clickingOnELement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public void enteringDataIntoElement(WebElement element,String data) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='"+data+"'", element);
	}
	public void clearingDataFromElement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=' '", element);
	}

	public void switchingToFrame(int index) {
		driver.switchTo().frame(index);
	}
	public void switchingToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}
	public void switchingToFrame(String data) {
		driver.switchTo().frame(data);
	}
	public void switchingBackToMain() {
		driver.switchTo().defaultContent();
	}
	public Alert switchToAlert() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}
	public WebDriverWait explicitWaitingStatement(int longTime) {
		WebDriverWait wait=new WebDriverWait(driver,longTime );
		return wait;
	}
	public void switchToWindow(Set<String> allWindowId, String targetWindowTitle) {
		for(String id:allWindowId) {
			driver.switchTo().window(id);
			if(targetWindowTitle.equalsIgnoreCase(driver.getTitle())) {
				break;
			}
		}
	}
	public String takingScreenshot(String screenshotName) {
		TakesScreenshot ss=(TakesScreenshot) driver;
		File photo = ss.getScreenshotAs(OutputType.FILE);
		String ldt = LocalDateTime.now().toString().replace(":", "-");
		String path = System.getProperty("user.dir")+SSPATH+screenshotName+" "+ldt+".png";
		File destination=new File(path);
		try {
			FileUtils.copyFile(photo, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}
}
