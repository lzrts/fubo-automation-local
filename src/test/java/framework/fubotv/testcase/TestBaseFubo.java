package framework.fubotv.testcase;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import framework.fubo.pages.spoofing.SpoofingModal;
import framework.pages.LitsPageFactory;
import framework.utility.LogFactory;
import framework.utility.PropertyLoader;
import framework.webdriver.WebDriverFactory;

public class TestBaseFubo {
	
	
	private static final Logger LOG = LogFactory.getLogger(TestBaseFubo.class);

	protected WebDriver webDriver;
	
	protected SpoofingModal spoofingModal;

	@BeforeMethod
	public void setup() {
		String browserName = System.getProperty("browser");
		LOG.info("Navigating to test url");
		webDriver = WebDriverFactory.getInstance(browserName);
		
		LOG.info("Navigating to test url");
		webDriver.get(PropertyLoader.loadProperty("testsite4.url"));
		
		spoofingModal = LitsPageFactory.initElements(webDriver, SpoofingModal.class);
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		if (webDriver != null) {
			LOG.info("Killing web driver");
			WebDriverFactory.killDriverInstance();
		}
	}

}
