package elementos;

import org.openqa.selenium.By;

public class PageCamper {
	
		public static By clickCamper = By.cssSelector("a[id=\"nav_camper\"]");
		
		public static By modeloCamper = By.cssSelector("#make > option:nth-child(5)");
		
		public static By performCarCamper = By.name("[kW]");
		
		public static By dataFabCamper = By.cssSelector("#dateofmanufacture");
		
		public static By AssCamper = By.cssSelector("#numberofseats > option:nth-child(9)");

	    public static By ladoVolantCamp = By.cssSelector("#insurance-form > div > section:nth-child(1) > div:nth-child(5) > p > label:nth-child(2)");

	    public static By tipCombCamper = By.cssSelector("#fuel > option:nth-child(5)");
	    
	    public static By cargUtCamper = By.cssSelector("#payload");
	    
	    public static By totalveicCamper = By.cssSelector("#totalweight");
	    
	    public static By precoTabCamper = By.cssSelector("#listprice");
	    
	    public static By numPlacaCamper = By.cssSelector("#licenseplatenumber");
	    
	    public static By anualKmCamper = By.cssSelector("#annualmileage");
	    
	    public static By proxCamper1 = By.cssSelector("#nextenterinsurantdata");
	    
	    public static By primNomeCamper = By.cssSelector("#firstname");
	    
	    public static By nameSobreCamper = By.cssSelector("#lastname");
	    
	    public static By dateCamperOf = By.cssSelector("#birthdate");
	    
	    public static By MachoCamper = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span");
	    
	    public static By endrecoCamper = By.cssSelector("#streetaddress");

	    public static By nacioCamper = By.cssSelector("#country > option:nth-child(32)");
	    
	    public static By zipCodCamper = By.cssSelector("#zipcode");
	    
	    public static By CidCamper = By.cssSelector("#city");
	    
	    public static By ocupCamper = By.cssSelector("#occupation > option:nth-child(3)");

	    public static By HobbCamper = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(5) > span");

	    public static By redeInterCamper = By.cssSelector("#website");
	    
	    public static By proxiCamper2 = By.cssSelector("#nextenterproductdata");

	    public static By inicSegCamper = By.cssSelector("#startdate");
	    
	    public static By somaSegCamp = By.cssSelector("#insurancesum > option:nth-child(4)");

	    public static By segDanosCamper = By.cssSelector("#damageinsurance > option:nth-child(2)");
	    
	    public static By prodOpcCamper = By.cssSelector("#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(2) > span");

	    public static By proxCamper3 = By.cssSelector("#nextselectpriceoption");
	    
	    public static By priceOption = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(4)");

	    public static By nextcamper4 = By.id("nextsendquote");

	    public static By emailCamper = By.cssSelector("#email");
	    
	    public static By phoneCamper = By.cssSelector("#phone");
	    
	    public static By userNameCamper = By.cssSelector("#username");
	    
	    public static By passCamp = By.cssSelector("#password");
	    
	    public static By confPass = By.cssSelector("#confirmpassword");
	    
	    public static By resultNameCamper = By.xpath("//*[text()='Sending e-mail success!']");
	    
	    public static By sendEmail = By.cssSelector("#sendemail");
	    
	    public static By camperFim = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button");

}