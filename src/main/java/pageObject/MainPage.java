package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.log4testng.Logger;

public class MainPage {

	final static Logger logger = Logger.getLogger(LoginPage.class);

	private WebDriver driver;

	@FindBy(how = How.NAME, using = "roundtrip")
	private WebElement roundTrip;

	@FindBy(how = How.XPATH, using = ".//input[@value='oneway']")
	private WebElement oneWay;

	@FindBy(how = How.NAME, using = "passCount")
	private WebElement passCount;

	@FindBy(how = How.NAME, using = "fromPort")
	private WebElement fromPort;

	@FindBy(how = How.NAME, using = "fromMonth")
	private WebElement fromMonth;

	@FindBy(how = How.NAME, using = "fromDay")
	private WebElement fromDay;

	@FindBy(how = How.NAME, using = "toPort")
	private WebElement toPort;

	@FindBy(how = How.NAME, using = "toMonth")
	private WebElement toMonth;

	@FindBy(how = How.NAME, using = "toDay")
	private WebElement toDay;

	@FindBy(how = How.NAME, using = "Coach")
	private WebElement economyClass;

	@FindBy(how = How.XPATH, using = ".//input[@value='Business']")
	private WebElement businessClass;

	@FindBy(how = How.NAME, using = "First")
	private WebElement firstClass;

	@FindBy(how = How.NAME, using = "airline")
	private WebElement airline;

	@FindBy(how = How.NAME, using = "findFlights")
	private WebElement btnContinue;



	public MainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public MainPage isNamePagePresented() {
				
		logger.info("Проверяем, что перешли на страницу Find a Fligh ");

		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:", "Осуществлен перед на другую страницу");
		return this;

	}

	public MainPage setOneWay() {
		logger.info("Выбираем признак OneWay ");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(oneWay));
		oneWay.click();
		return this;

	}

	// -------------------------------------------------
	// Блок вылета
	public MainPage selectРassCount(String pass) {
		logger.info("Выбираем количество пассажиров " + pass);
		new Select(passCount).selectByValue(pass);
		return this;
	}

	public MainPage selectFromPort(String fromAirPort) {
		logger.info("Выбираем аэропорт вылета " + fromAirPort);
		new Select(fromPort).selectByValue(fromAirPort);
		return this;
	}

	public MainPage selectFromMonth(String fromMonthOut) {
		logger.info("Выбираем месяц вылета " + fromMonthOut);
		new Select(fromMonth).selectByValue(fromMonthOut);
		return this;
	}

	public MainPage selectFromDay(String fromDayOut) {
		logger.info("Выбираем день вылета " + fromDayOut);
		new Select(fromDay).selectByValue(fromDayOut);
		return this;
	}

	// ----------------------------------------------------------
	// Блок обратного рейса

	public MainPage selectToPort(String toAirPort) {
		logger.info("Выбираем аэропорт прилета " + toAirPort);
		new Select(toPort).selectByValue(toAirPort);
		;
		return this;
	}

	public MainPage selectToMonth(String ToMonthOut) {
		logger.info("Выбираем месяц прилета " + ToMonthOut);
		new Select(toMonth).selectByValue(ToMonthOut);
		return this;
	}

	public MainPage selectToDay(String toDayOut) {
		logger.info("Выбираем день прилета " + toDayOut);
		new Select(toDay).selectByValue(toDayOut);
		return this;
	}
	// ------------------------------------------------------
	// Блок выбора опций

	public MainPage setBusinessClass() {
		logger.info("Выбираем бизнес класс ");
		businessClass.click();
		return this;

	}

	public MainPage selectAairLine(String airLine) {
		logger.info("Выбираем авиа компанию " + airLine);
		new Select(airline).selectByVisibleText(airLine);
		return this;
	}

	public SelectBoard setBtnContinue() {
		logger.info("Подтверждаем выбор ");
		btnContinue.click();
		return new SelectBoard(driver);

	}

}
