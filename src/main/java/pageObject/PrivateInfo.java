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


public class PrivateInfo {
	final static Logger logger = Logger.getLogger(LoginPage.class); 
	
	private WebDriver driver;
//данные пасажиров	
	@FindBy(how = How.NAME, using="passFirst0")
	private WebElement  passFirst0;
	
	@FindBy(how = How.NAME, using="passLast0")
	private WebElement  passLast0;
	
	@FindBy(how = How.NAME, using="pass.0.meal")
	private WebElement  pass0meal;
	
	@FindBy(how = How.NAME, using="passFirst1")
	private WebElement  passFirst1;

	@FindBy(how = How.NAME, using="passLast1")
	private WebElement  passLast1;
	
	@FindBy(how = How.NAME, using="pass.1.meal")
	private WebElement  pass1meal;

//данные карты	
	@FindBy(how = How.NAME, using="creditCard")
	private WebElement  creditCard;

	@FindBy(how = How.NAME, using="creditnumber")
	private WebElement  creditNumber;
	
	@FindBy(how = How.NAME, using="cc_exp_dt_mn")
	private WebElement  cc_exp_dt_mn;
	
	@FindBy(how = How.NAME, using="cc_exp_dt_yr")
	private WebElement  cc_exp_dt_yr;
	
	
	@FindBy(how = How.NAME, using="cc_frst_name")
	private WebElement  cc_frst_name;
	
	
	@FindBy(how = How.NAME, using="cc_mid_name")
	private WebElement  cc_mid_name;
	
	@FindBy(how = How.NAME, using="cc_last_name")
	private WebElement  cc_last_name;
	
//данные билликга адреса
	@FindBy(how = How.NAME, using="billAddress1")
	private WebElement  billAddress1;
	
	@FindBy(how = How.NAME, using="billAddress2")
	private WebElement  billAddress2;
	
	@FindBy(how = How.NAME, using="billCity")
	private WebElement  billCity;
	
	@FindBy(how = How.NAME, using="billZip")
	private WebElement  billZip;
	
	@FindBy(how = How.NAME, using="billState")
	private WebElement  billState;
	
	@FindBy(how = How.NAME, using="billCountry")
	private WebElement  billCountry;
	
//данные адреса доставки
	@FindBy(how = How.NAME, using="delAddress1")
	private WebElement  delAddress1;
	
	@FindBy(how = How.NAME, using="delAddress2")
	private WebElement  delAddress2;
	
	@FindBy(how = How.NAME, using="delCity")
	private WebElement  delCity;
	
	@FindBy(how = How.NAME, using="delState")
	private WebElement  delState;
	
	@FindBy(how = How.NAME, using="delZip")
	private WebElement  delZip;
	
	@FindBy(how = How.NAME, using="delCountry")
	private WebElement  delCountry;
//кнопка и чек бокс тот же адрес доставки
	
	@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")
	private WebElement  boxSemeAdres;
	
	@FindBy(how = How.NAME, using="buyFlights")
	private WebElement  btnSecurePurchase;
	

	
	
	//данные для проверок отправления
	
	@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/b/font")
	private WebElement wayToChose;
	
	@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/b/font")
	private WebElement dateToChose;
	
	@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[3]/td[1]/font/b")
	private WebElement bordToChose;
	
	@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/font")
	private WebElement classToChose;
	
	@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[3]/td[3]/font")
	private WebElement priceToChose;
	
	
	// данные для проверок обратной дороги
	@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[4]/td[1]/b/font")
	private WebElement wayOutChose;
	
	@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/b/font")
	private WebElement dateOutChose;
	
	@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[6]/td[1]/font/font/font[1]/b")
	private WebElement bordOutChose;
	
	@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/font")
	private WebElement classOutChose;
	
	@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[6]/td[3]/font")
	private WebElement priceOutChose;
	

	//элементы для остальных проверок
	@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[7]/td[2]/font")
	private WebElement totalPass;
	
	@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[8]/td[2]/font")
	private WebElement taxes;
	
	@FindBy(how = How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[9]/td[2]/font/b")
	private WebElement totalPrice;
	
	
	public PrivateInfo(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	// методы проверок вылета
	
	public PrivateInfo isWayToChoseCorrect(){
		logger.info("Проверяем что направление вылета выбрано правильно ");
		Assert.assertEquals(wayToChose.getText(), "Paris to Seattle", "Направление вылета выбрано правильно");
		return this;
	}
	
	public PrivateInfo isDateToChoseCorrect(){
		logger.info("Проверяем что дата вылета выбрана правильно ");
		Assert.assertEquals(dateToChose.getText(), "11/20/2015", "Дата вылета выбрана правильно");
		return this;
	}
	
	public PrivateInfo isBordToChoseCorrect(){
		logger.info("Проверяем что самолет вылета выбран правильно ");
		Assert.assertEquals(bordToChose.getText(), "Unified Airlines 363", "Самолет вылета выбран правильно");
		return this;
	}
	
	public PrivateInfo isClassToChoseCorrect(){
		logger.info("Проверяем что класс вылета выбран правильно ");
		Assert.assertEquals(classToChose.getText(), "Business", "Класс вылета выбран правильно");
		return this;
	}
	
	public PrivateInfo isPriceToChoseCorrect(){
		logger.info("Проверяем что цена вылета выбран правильно ");
		Assert.assertEquals(priceToChose.getText(), "281", "Цена вылета выбрана правильно");
		return this;
	}
	
	
	//методы для проверок обратного вылета
	
	public PrivateInfo isWayOutChoseCorrect(){
		logger.info("Проверяем что направление обратного вылета выбрано правильно ");
		Assert.assertEquals(wayOutChose.getText(), "Seattle to Paris", "Направление обратного вылета выбрано правильно");
		return this;
	}
	
	
	public PrivateInfo isDateOutChoseCorrect(){
		logger.info("Проверяем что дата вылета выбрана правильно ");
		Assert.assertEquals(dateOutChose.getText(), "12/19/2015", "Дата вылета выбрана правильно");
		return this;
	}
	
	public PrivateInfo isBordOutChoseCorrect(){
		logger.info("Проверяем что самолет обратного вылета выбран правильно ");
		Assert.assertEquals(bordOutChose.getText(), "Blue Skies Airlines 631", "Самолет обратного вылета выбран правильно");
		return this;
	}
	
	public PrivateInfo isClassOutChoseCorrect(){
		logger.info("Проверяем что класс обратного вылета выбран правильно ");
		Assert.assertEquals(classOutChose.getText(), "Business", "Класс обратного вылета выбран правильно");
		return this;
	}
	
	public PrivateInfo isPriceOutChoseCorrect(){
		logger.info("Проверяем что цена вылета выбран правильно ");
		Assert.assertEquals(priceOutChose.getText(), "273", "Цена обратного вылета выбрана правильно");
		return this;
	}
	
	//остальные проверки
	
	public PrivateInfo isTotalPassCorrect(){
		logger.info("Проверяем что количество пассажиров выбрано правильно ");
		Assert.assertEquals(totalPass.getText(), "2", "Количестов пассажиров выбрано правильно");
		return this;
	}
	
	public PrivateInfo isTaxesCorrect(){
		logger.info("Проверяем что таксовый сбор расчитан правильно ");
		Assert.assertEquals(taxes.getText(), "$91", "Таксовый сбор расчитан правильно");
		return this;
	}
	
	public PrivateInfo isTotalPriceCorrect(){
		logger.info("Проверяем что общая стоимость расчитана правильно ");
		Assert.assertEquals(totalPrice.getText(), "$1199", "Общая стоимость расчитана правильно правильно");
		return this;
	}
	
	
	
	
	
	
	public PrivateInfo isNamePagePresented() {
		logger.info("Проверяем что перешли на страницу Book a Flight ");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Book a Flight: Mercury Tours"));
	
		Assert.assertEquals(driver.getTitle(), "Book a Flight: Mercury Tours", "Осуществлен перед на другую страницу");
	
		return this;
		
		}
	
	
	//------------------------------------------------
	//даннные пасажиров первый пасажир
	
	public PrivateInfo setFirstName0(String firstName0){
		logger.info("Вводим имя первого пасажира "+ firstName0);
		passFirst0.clear();
		passFirst0.sendKeys(firstName0);
		return this;
		
	}
	
	public PrivateInfo setLastName0(String lastName0){
		logger.info("Вводим фамилию первого пасажира "+ lastName0);
		passLast0.clear();
		passLast0.sendKeys(lastName0);
		return this;
		
	}
	
	public PrivateInfo setPassMeal0(String passMeal0){
		logger.info("Вводим питание первого пасажира "+ passMeal0);
		new Select(pass0meal).selectByVisibleText(passMeal0);
		return this;
		
	}
	
	//------------------------------------------------
		//даннные пасажиров второй пасажир
		
		public PrivateInfo setFirstName1(String firstName1){
			logger.info("Вводим имя второго пасажира "+ firstName1);
			passFirst1.clear();
			passFirst1.sendKeys(firstName1);
			return this;
			
		}
		
		public PrivateInfo setLastName1(String lastName1){
			logger.info("Вводим фамилию второго пасажира "+ lastName1);
			passLast1.clear();
			passLast1.sendKeys(lastName1);
			return this;
			
		}
		
		public PrivateInfo setPassMeal1(String passMeal1){
			logger.info("Вводим питание второго пасажира "+ passMeal1);
			new Select(pass1meal).selectByVisibleText(passMeal1);
			return this;
			
		}
	
	//-------------------------------------------------------------
	//данные карты
		
		public PrivateInfo setСreditCard(String cardName){
			logger.info("Выбираем тим кредитной карты "+ cardName);
			new Select(creditCard).selectByVisibleText(cardName);
			return this;
			
		}
		
		public PrivateInfo setCreditCardNumber(String creditCardNumber){
			logger.info("Вводим номер кредитной карты "+ creditCardNumber);
			creditNumber.clear();
			creditNumber.sendKeys(creditCardNumber);
			return this;
			
		}
		
		public PrivateInfo setCardMonth(String cardMonth){
			logger.info("Вводим месяц кредитной карты "+ cardMonth);
			new Select(cc_exp_dt_mn).selectByVisibleText(cardMonth);
			return this;
			
		}
		
		public PrivateInfo setsetCardYear(String cardYear){
			logger.info("Вводим год кредитной карты "+ cardYear);
			new Select(cc_exp_dt_yr).selectByVisibleText(cardYear);
			return this;
			
		}
		
		
		public PrivateInfo setCardFirstName(String cardFirstName){
			logger.info("Вводим имя держателя кредитной карты "+ cardFirstName);
			cc_frst_name.clear();
			cc_frst_name.sendKeys(cardFirstName);
			return this;
			
		}
		public PrivateInfo setCardMidName(String cardMidName){
			logger.info("Вводим отчество держателя кредитной карты "+ cardMidName);
			cc_mid_name.clear();
			cc_mid_name.sendKeys(cardMidName);
			return this;
			
		}
		public PrivateInfo setCardLastName(String cardLastName){
			logger.info("Вводим фамилию держателя кредитной карты "+ cardLastName);
			cc_last_name.clear();
			cc_last_name.sendKeys(cardLastName);
			return this;
			
		}
		
//---------------------------------------------------------------------
//адрес биллинга
		
		
		public PrivateInfo setBillAdres(String billAdres){
			logger.info("Вводим адрес биллнга "+ billAdres);
			billAddress1.clear();
			billAddress1.sendKeys(billAdres);
			return this;
			
		}
		
		public PrivateInfo setBillCity(String billingCyty){
			logger.info("Вводим город биллнга "+ billingCyty);
			billCity.clear();
			billCity.sendKeys(billingCyty);
			return this;
			
		}
		
		
		public PrivateInfo setBillState(String billingState){
			logger.info("Вводим штат биллнга "+ billingState);
			billState.clear();
			billState.sendKeys(billingState);
			return this;
			
		}
		
		
		public PrivateInfo setBillZip(String billingZip){
			logger.info("Вводим zip код биллнга "+ billingZip);
			billZip.clear();
			billZip.sendKeys(billingZip);
			return this;
			
		}
		
		public PrivateInfo setBillCounty(String billingCountry){
			logger.info("Вводим страну биллнга "+ billingCountry);
			new Select(billCountry).selectByVisibleText(billingCountry);

			return this;
			
		}
		
	//------------------------------------------------------------------
	//установка чек бокса тот же адрес
		
		public PrivateInfo setBoxSameAdres(){
			logger.info("Ставим чек бокс Same as Billing Address ");
			boxSemeAdres.click();
			return this;
			
		}
	
		
		
	//-------------------------------------------------------------------
	//Адрес доставки
		
		
		
		public PrivateInfo setDellAdres(String deliveryAdres){
			logger.info("Вводим адрес доставки "+deliveryAdres );
			delAddress1.clear();
			delAddress1.sendKeys(deliveryAdres);
			return this;
			
		}
		
		public PrivateInfo setDelCity(String deliveryCyty){
			logger.info("Вводим город доставки "+deliveryCyty );
			delCity.clear();
			delCity.sendKeys(deliveryCyty);
			return this;
			
		}
		
		
		public PrivateInfo setDelState(String deliveryState){
			logger.info("Вводим штат доставки "+deliveryState );
			delState.clear();
			delState.sendKeys(deliveryState);
			return this;
			
		}
		
		
		public PrivateInfo setDelZip(String deliveryZip){
			logger.info("Вводим zip код доставки "+deliveryZip );
			delZip.clear();
			delZip.sendKeys(deliveryZip);
			return this;
			
		}
		
		public PrivateInfo setDelCounty(String deliveryCountry){
			logger.info("Вводим страну доставки "+deliveryCountry );
			new Select(delCountry).selectByVisibleText(deliveryCountry);

			return this;
			
		}
		
//-----------------------------------------------------------------
//переход на следующую страницу
		
		public FlightConfirm setSecurePurchase(){
			logger.info("Переходим на страницу Flight Confirmation: Mercury Tours" );
			btnSecurePurchase.click();
			return new FlightConfirm(driver);
			
		}
	
		
	
	

}
