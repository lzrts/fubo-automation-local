package framework.pages;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;

import framework.utility.LogFactory;

/*
 * Abstract class representation of a Page in the UI with additional features. Page object pattern
 * @author Taras Lytvyn
 */
public abstract class Page implements IPageLoaded {

	private static final Logger LOG = LogFactory.getLogger(Page.class);

	protected WebDriver webDriver;

	/*
	 * Constructor injecting the WebDriver interface
	 * 
	 * @param webDriver
	 */

	public Page(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public WebDriver getWebDriver() {
		return webDriver;
	}

	public String getTitle() {
		return webDriver.getTitle();
	}

	public String getPageUrl() {
		return webDriver.getCurrentUrl();
	}

	public boolean isElementPresent(WebElement element) {
		LOG.info("Checking if element is present " + element);
		try {
			element.isEnabled();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public WebDriverWait getWebDriverWait(int seconds) {
		WebDriverWait wait = new WebDriverWait(webDriver, seconds);
		return wait;
	}
	
	public void jsClickOnElement(WebElement webElement) {
		LOG.info("Clicking on web element " + webElement);
		getJSExecutor().executeScript("arguments[0].click();", webElement);
	}

	public void scrollToElement(WebElement webElement) {
		LOG.info("Scrollling to web element " + webElement);
		getJSExecutor().executeScript("arguments[0].scrollIntoView(true);", webElement);
	}

	public boolean isElementPresent(int seconds, WebElement webElement) {
		try {
			getWebDriverWait(seconds).until(driver -> webElement.isEnabled());
			return true;
		} catch (TimeoutException e) {
			LOG.error("Element is not available");
			return false;
		}
	}

	public String emailGeneration() {

		GregorianCalendar cln = new GregorianCalendar();
		String date = new SimpleDateFormat("yyyyMMddhhmm").format(cln.getTime());
		String email = date + "@dummy.com";
		return email;
	}
	
	public String standartPassword() {
		String pass = "test1234";
		return pass;
		
	}

	private JavascriptExecutor getJSExecutor() {
		return (JavascriptExecutor) webDriver;
	}
	
	public void switchToIFrame(WebElement webElement) {
		LOG.info("Switching to web element " + webElement);
		webDriver.switchTo().frame(webElement);
	}
	
	public void switchToTab() {
		ArrayList<String> tabs = new ArrayList<String> (webDriver.getWindowHandles());
	    webDriver.switchTo().window(tabs.get(1));
	}
	
	public void switchToDefault() {
		webDriver.switchTo().defaultContent();
	}

}