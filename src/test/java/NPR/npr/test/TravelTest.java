package NPR.npr.test;

import org.testng.annotations.Test;

import pageObject.FlightConfirm;
import pageObject.LoginPage;
import pageObject.MainPage;
import pageObject.PrivateInfo;
import pageObject.SelectBoard;

public class TravelTest extends BaseTest {
	private String mainUrl = "http://newtours.demoaut.com/";
	private String login = "test";
	private String password = "test";
	
	
	@Test(priority = 0)
	public void loginTest() {
		LoginPage loginPage = navigate(mainUrl);
		loginPage.setLogin(login);
		loginPage.setPassword(password);
	
		MainPage mainPage = loginPage.clickSubmitBtn();
		
		
		mainPage.isNamePagePresented();
	
		mainPage.setOneWay();
		mainPage.selectРassCount("2");
		mainPage.selectFromPort("Paris");
		mainPage.selectFromMonth("11");
		mainPage.selectFromDay("20");
		mainPage.selectToPort("Seattle");
		mainPage.selectToMonth("12");
		mainPage.selectToDay("19");
		mainPage.setBusinessClass();
		mainPage.selectAairLine("Pangea Airlines");
		SelectBoard selectTest= mainPage.setBtnContinue();
		//проверки страницы Select a Flight
		selectTest.isNamePagePresented();
		selectTest.isWayToChoseCorrect();
		selectTest.isDateToChoseCorrect();
		selectTest.isWayOutChoseCorrect();
		selectTest.isDateOutChoseCorrect();
		

		selectTest.setAirLines363();
		selectTest.setAirLines631();
		
		PrivateInfo pi = selectTest.setBtnContinue();
	//проверки страницы Book a Flight
		//вылет туда
		pi.isNamePagePresented();
		pi.isWayToChoseCorrect();		
		pi.isBordToChoseCorrect();
		pi.isDateToChoseCorrect();
		pi.isClassToChoseCorrect();
		pi.isPriceToChoseCorrect();
		//вылет обратно
		pi.isWayOutChoseCorrect();
		pi.isDateOutChoseCorrect();
		pi.isBordOutChoseCorrect();
		pi.isClassOutChoseCorrect();
		pi.isPriceOutChoseCorrect();
		
		//остальные проверки
		pi.isTotalPassCorrect();
		pi.isTaxesCorrect();
		pi.isTotalPriceCorrect();
		
		
		//информация о пассажирах
		pi.setFirstName0("Ivanov");
		pi.setLastName0("Ivan");
		pi.setFirstName1("Ivanova");
		pi.setLastName1("Irina");
		pi.setPassMeal0("Hindu");
		pi.setPassMeal1("Bland");
		
		
		
		//информация о карте
		pi.setСreditCard("Visa");
		pi.setCreditCardNumber("5479540454132487");
		pi.setCardFirstName("Ivan");
		pi.setCardLastName("Ivanov");
		pi.setCardMidName("Ivanovich");
		pi.setCardMonth("05");
		pi.setsetCardYear("2009");
		
		//адрес биллинга
		
		pi.setBillAdres("1085 Borregas Ave.");
		pi.setBillCity("Albuquerque");
		pi.setBillCounty("UNITED STATES");
		pi.setBillState("New Mexico");
		pi.setBillZip("94089");
		
		//адрес доставки
		pi.setBoxSameAdres();
		pi.setDelCity("Boston");
		pi.setDelCounty("UNITED STATES");
		pi.setDellAdres("1225 Borregas Ave");
		pi.setDelState("Massachusetts");
		pi.setDelZip("91089");
		
		
		FlightConfirm fc = pi.setSecurePurchase();
		fc.isNamePagePresented();
		fc.isWayToChoseCorrect();
		fc.isDateToChoseCorrect();
		fc.isBordToChoseCorrect();
		fc.isWayOutChoseCorrect();
		fc.isBordOutChoseCorrect();
		fc.isDateOutChoseCorrect();
		fc.isTotalPassCorrect();
		fc.isBilledToCorrect();
		fc.isDellAdressCorrect();
		fc.isTotalPriceCorrect();
		
		LoginPage lp = fc.bacHome();
		lp.isNamePagePresented();
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
