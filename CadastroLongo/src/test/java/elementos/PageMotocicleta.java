package elementos;

import org.openqa.selenium.By;

public class PageMotocicleta {
	
		public static By motocicleta = By.cssSelector("#nav_motorcycle");
		
		public static By marcaMoto = By.cssSelector("#make > option:nth-child(13)");
		
		public static By modeloMoto = By.cssSelector("#model > option:nth-child(4)");
		
		public static By cilindroMoto = By.cssSelector("#cylindercapacity");
		
		public static By desempMoto = By.cssSelector("#engineperformance");
		
		public static By dataFabricacaoMoto = By.cssSelector("#dateofmanufacture");
		
		public static By assentMoto = By.cssSelector("#numberofseatsmotorcycle > option:nth-child(3)");
		
		public static By precoMoto = By.cssSelector("#listprice");
		
		public static By kmAnualMoto = By.cssSelector("#annualmileage");

		public static By proxMoto1 = By.cssSelector("#nextenterinsurantdata");
		
		public static By nomeCliMoto = By.cssSelector("#firstname");
		
		public static By sobreNomeCliMoto = By.cssSelector("#lastname");
		
		public static By dataDNascMoto = By.cssSelector("#birthdate");
		
		public static By generoMoto = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span");
		
		public static By endCliMoto = By.cssSelector("#streetaddress");

		public static By nacioMoto = By.cssSelector("#country > option:nth-child(23)");
		
		public static By cepCliMoto = By.cssSelector("#zipcode");
		
		public static By cityMoto = By.cssSelector("#city");
		
		public static By ocupaMoto = By.cssSelector("#occupation > option:nth-child(6)");
		
		public static By HobbMoto = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");
		
		public static By webSiMoto = By.cssSelector("#website");
		
		public static By clicaMotoProx2 = By.cssSelector("#nextenterproductdata");
		
		public static By dataInicioMoto = By.cssSelector("#startdate");
		
		public static By somaSegMoto = By.cssSelector("#insurancesum > option:nth-child(2)");

		public static By segdeMoto = By.cssSelector("#damageinsurance > option:nth-child(3)");

		public static By opcaoProdMoto = By.cssSelector("#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(2) > span");

		public static By clicarMotoProx3 = By.cssSelector("#nextselectpriceoption");
		
		public static By escolhePlanoMoto = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(1) > span");
		
		public static By ProxiMoto4 = By.cssSelector("#nextsendquote");
		
		public static By emailMoto = By.cssSelector("#email");
		
		public static By celularMoto = By.cssSelector("#phone");
		
		public static By userMoto = By.cssSelector("#username");
		
		public static By passMoto = By.cssSelector("#password");
		
		public static By confirmMoto = By.cssSelector("#confirmpassword");
		
		public static By proxMoto5 = By.cssSelector("#sendemail");
		
		public static By resultadoMoto = By.xpath("//h2[text()='Sending e-mail success!']");
		
		public static By okMoto = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button");

}