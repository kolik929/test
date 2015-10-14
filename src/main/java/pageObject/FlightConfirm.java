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

public class FlightConfirm {
	
	final static Logger logger = Logger.getLogger(LoginPage.class); 
	
	private WebDriver driver;
	
	
	@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[3]/td/font/b")
	private WebElement wayToChose;
	
	@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[3]/td/font")
	private WebElement dateToChose;
	
	@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[3]/td/font")
	private WebElement bordToChose;
	
	@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[5]/td/font/b")
	private WebElement wayOutChose;
	
	@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[5]/td/font")
	private WebElement dateOutChose;
	
	@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[5]/td/font")
	private WebElement bordOutChose;
	
	@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[7]/td/font")
	private WebElement totalPass;
	
	//данные биллига адреса
		@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[9]/td/p")
		private WebElement  billAddress;
		
	//данные адреса доставки
		@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[11]/td/p")
		private WebElement  delAddress;
		
		@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[12]/td/table/tbody/tr[2]/td[2]/font/b/font/font/b/font")
		private WebElement totalPrice;
		
		@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[2]/a/img")
		private WebElement  btnBacHome;
	
	
	public FlightConfirm isNamePagePresented() {
		logger.info("Проверяем что перешли на страницу Book a Flight ");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Flight Confirmation: Mercury Tours"));
	
		Assert.assertEquals(driver.getTitle(), "Flight Confirmation: Mercury Tours", "Осуществлен перед на другую страницу");
	
		return this;
		
		}
	
	
	
	//проверки выбора вылета
	
	public FlightConfirm isWayToChoseCorrect(){
		
		logger.info("Проверяем что направление вылета выбрано правильно ");
		Assert.assertEquals(wayToChose.getText(), "Paris to Seattle", "Направление вылета выбрано правильно");
		return this;
	}
	
	public FlightConfirm isDateToChoseCorrect(){
		logger.info("Проверяем что дата вылета выбрана правильно ");
		if(dateToChose.getText().contains("11/20/2015")){
			String date="11/20/2015";
			Assert.assertEquals(date, "11/20/2015", "Дата вылета выбрана правильно");
		}
	
		
		return this;
	}
	
	public FlightConfirm isBordToChoseCorrect(){
		logger.info("Проверяем что самолет вылета выбран правильно ");
		if (bordToChose.getText().contains("Unified Airlines 363")){
			String board="Unified Airlines 363";			
			Assert.assertEquals(board, "Unified Airlines 363", "Самолет вылета выбран правильно");
		}		
		return this;
	}
	
	public FlightConfirm isWayOutChoseCorrect(){
		logger.info("Проверяем что направление обратного вылета выбрано правильно ");
		Assert.assertEquals(wayOutChose.getText(), "Seattle to Paris", "Направление обратного вылета выбрано правильно");
		return this;
	}
	
	
	public FlightConfirm isDateOutChoseCorrect(){
		logger.info("Проверяем что дата вылета выбрана правильно ");
		if (dateOutChose.getText().contains("12/19/2015")){
			String date = "12/19/2015";
			Assert.assertEquals(date, "12/19/2015", "Дата вылета выбрана правильно");
		}
		
		return this;
	}
	
	public FlightConfirm isBordOutChoseCorrect(){
		logger.info("Проверяем что самолет обратного вылета выбран правильно ");
		if (bordOutChose.getText().contains("Blue Skies Airlines 631")){
			String board = "Blue Skies Airlines 631";
			Assert.assertEquals(board, "Blue Skies Airlines 631", "Самолет обратного вылета выбран правильно");
		}
		
		return this;
	}
	
	//проверяем количество пассажиров
	public FlightConfirm isTotalPassCorrect(){
		logger.info("Проверяем что количестов пассажиров выбрано правильно ");
		if (totalPass.getText().contains("2 passengers")){
			String pass = "2";
			Assert.assertEquals(pass, "2", "Количестов пассажиров выбрано правильно");
		}
		
		return this;
	}
	
	//проверяем адреса

	
	public FlightConfirm isBilledToCorrect(){
		logger.info("Проверяем что вся информация биллинга указана правильно ");

			Assert.assertEquals(billAddress.getText(), "Ivan Ivanovich Ivanov\n1085 Borregas Ave.\n\nAlbuquerque, New Mexico, 94089\nAX 0", "Вся информация биллинга указана правильно");
	
		
		return this;
	}
	
	public FlightConfirm isDellAdressCorrect(){
		logger.info("Проверяем что весь адрес доставки указан правильно ");

			Assert.assertEquals(delAddress.getText(), "1225 Borregas Ave\n\nBoston, Massachusetts, 91089", "Весь адрес доставки указан правильно");
	
		
		return this;
	}
	
	
	public FlightConfirm isTotalPriceCorrect(){
		logger.info("Проверяем что общая стоимость расчитана правильно ");
		Assert.assertEquals(totalPrice.getText(), "$1199 USD", "Общая стоимость расчитана правильно правильно");
		return this;
	}
	
	
	
	public LoginPage bacHome(){
		logger.info("Переходим на домашнюю страницу ");
		btnBacHome.click();
		return new LoginPage(driver);
	}
	
	
	
	
	public FlightConfirm(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	

}
