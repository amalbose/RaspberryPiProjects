package com.axatrikx.irctc;

public class ERailScraper {
	
	private static final String ERAIL_URL = "http://erail.in";
	
	
	//Locators
	private static final String toTrainStationID = "";
	private static final String fromTrainStationID = "";
	
	
	private WebDriver driver;
	
	public ERailScraper(){
		init();
	}

	private void init(){
		driver = new FirefoxDriver();
	}
	
	private boolean navigateToSite(){
		driver.get(ERAIL_URL);
	}
	
	private boolean fillTrainFields(String toStation, String fromStation){
		WebElement fromTrainStationLocator = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.id(fromTrainStationID)));
		fromTrainStationLocator.sendKeys(fromStation + Keys.RETURN);
		WebElement toTrainStationLocator = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.id(toTrainStationID)));
		toTrainStationLocator.sendKeys(toStation + Keys.RETURN);
	}
	
	private void quit(){
		driver.quit();
	}
	
	public static void main(String[] args) {
		
	}
}
