package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.log4testng.Logger;

public class SelectBoard {
	
	final static Logger logger = Logger.getLogger(LoginPage.class); 
	
	private WebDriver driver;
	
	@FindBy(how = How.XPATH, using=".//input[@value='Unified Airlines$363$281$11:24']")
	private WebElement airlines363;
	
	@FindBy(how = How.XPATH, using=".//input[@value='Blue Skies Airlines$631$273$14:30']")
	private WebElement  airlines631;
	
	@FindBy(how = How.NAME, using="reserveFlights")
	private WebElement  btnContinue;
	

	//элементы для проверок 
	@FindBy(how = How.XPATH , using="(.//td/b)[1]")
	private WebElement  wayToChose;
	
	@FindBy(how = How.XPATH , using="(.//td/b)[2]")
	private WebElement  dateToChose;
	
	@FindBy(how = How.XPATH , using="(.//td/b)[3]")
	private WebElement  wayOutChose;
	
	@FindBy(how = How.XPATH , using="(.//td/b)[4]")
	private WebElement  dateOutChose;

	//проверки страницы Select a Flight
	
	public SelectBoard isNamePagePresented() {
		logger.info("Проверяем, что мы на нужной странице Select a Flight ");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Select a Flight: Mercury Tours"));

		Assert.assertEquals(driver.getTitle(), "Select a Flight: Mercury Tours", "Осуществлен перед на другую страницу");
			
		
		return this;
		
		}

	public SelectBoard isWayToChoseCorrect(){
		logger.info("Проверяем что направление вылета выбрано правильно ");
		Assert.assertEquals(wayToChose.getText(), "Paris to Seattle", "Направление вылета выбрано правильно");
		return this;
	}
	
	public SelectBoard isDateToChoseCorrect(){
		logger.info("Проверяем что дата вылета выбрана правильно ");
		Assert.assertEquals(dateToChose.getText(), "11/20/2015", "Дата вылета выбрана правильно");
		return this;
	}
	
	
	public SelectBoard isWayOutChoseCorrect(){
		logger.info("Проверяем что направление обратного вылета выбрано правильно ");
		Assert.assertEquals(wayOutChose.getText(), "Seattle to Paris", "Направление обратного вылета выбрано правильно");
		return this;
	}
	
	
	public SelectBoard isDateOutChoseCorrect(){
		logger.info("Проверяем что дата вылета выбрана правильно ");
		Assert.assertEquals(dateOutChose.getText(), "12/19/2015", "Дата вылета выбрана правильно");
		return this;
	}
	
	

	
	public SelectBoard(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public SelectBoard setAirLines363(){
		logger.info("Выбираем самолет вылета ");
		airlines363.click();
		return this;
	}
	
	public SelectBoard setAirLines631(){
		logger.info("Выбираем самолет прилета ");
		airlines631.click();
		return this;
	}
	
	
	
	public PrivateInfo setBtnContinue(){
		logger.info("Переходим на страницу Book a Flight ");
		btnContinue.click();
		return new PrivateInfo(driver);
	}
	

	
	

}
