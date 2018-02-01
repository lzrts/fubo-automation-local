package framework.fubo.pages.spoofing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.google.common.base.Function;

import framework.fubo.pages.mlp.MarketingLandingPage;
import framework.pages.LitsPageFactory;
import framework.pages.Page;
import io.qameta.allure.Step;

public class SpoofingModal extends Page {

	@FindBy(xpath = "//button[@type='button']/*[contains(text(),'Spoofing')]")
	private WebElement spoofingButton;

	@FindBy(xpath = "//*[contains(@class,'modal-body')]/*[1]/input")
	private WebElement countryCodeField;

	@FindBy(xpath = "//*[contains(@class,'modal-body')]/*[2]/input")
	private WebElement currentPostalCodeField;

	@FindBy(xpath = "//*[contains(@class,'modal-body')]/*[3]/input")
	private WebElement homePostalCodeField;

	@FindBy(xpath = "//*[contains(@class,'modal-body')]/*[4]/input")
	private WebElement dmaField;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitSpoofingButton;

	public SpoofingModal(WebDriver webDriver) {
		super(webDriver);

	}

	@Step("Proceed to Home Page")
	public MarketingLandingPage setSpoofing(String countryCode, String postalCode, String homePostalCode, String dma) {
		spoofingButton.click();
		countryCodeField.sendKeys(countryCode);
		currentPostalCodeField.sendKeys(postalCode);
		submitSpoofingButton.click();

		return LitsPageFactory.initElements(webDriver, MarketingLandingPage.class);

	}

	@Override
	public Function<WebDriver, ?> isPageLoaded() {

		return ExpectedConditions.visibilityOf(spoofingButton);
	}

}
