package elementos;

import org.openqa.selenium.By;

public class PageCaminhao {
		
		public static By truck = By.name("Navigation Truck");

		public static By MarcaCaminhao = By.cssSelector("#make > option:nth-child(7)");

		public static By Desemp = By.cssSelector("#engineperformance");

		public static By caFab = By.cssSelector("#dateofmanufacture");

		public static By caminAss = By.cssSelector("#numberofseats > option:nth-child(3)");

		public static By camComb = By.cssSelector("#fuel > option:nth-child(3)");

		public static By CamCarg = By.cssSelector("#payload");

		public static By CamPeso = By.cssSelector("#totalweight");

		public static By precoCam = By.cssSelector("#listprice");

		public static By numPlaca = By.cssSelector("#licenseplatenumber");

		public static By CamKM = By.cssSelector("#annualmileage");

		public static By next1 = By.cssSelector("#nextenterinsurantdata");

		public static By nomeCam = By.id("firstname");

		public static By sobreName = By.cssSelector("#lastname");

		public static By dataNasciCam = By.id("birthdate");

		public static By generoCAM = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span");

		public static By endCam = By.cssSelector("#streetaddress");

		public static By paisCam = By.cssSelector("#country > option:nth-child(32)");

		public static By CodPost = By.cssSelector("#zipcode");

		public static By cityCam = By.cssSelector("#city");

		public static By OcupCam = By.cssSelector("#occupation > option:nth-child(6)");

		public static By hobCamExcesso = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");

		public static By hobCamParaquedismo = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(4)");

		public static By SiteCam = By.cssSelector("#website");

		public static By next2 = By.cssSelector("#nextenterproductdata");

		public static By DataCamincio = By.cssSelector("#startdate");

		public static By ValorseguroCAM = By.cssSelector("#insurancesum > option:nth-child(4)");

		public static By seguroDanosCAM = By.cssSelector("#damageinsurance > option:nth-child(4)");

		public static By opcaoProdCam = By.cssSelector("#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");

		public static By next3Cam = By.cssSelector("#nextselectpriceoption");

		public static By platinumCami = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(3)");

		public static By next4 = By.id("nextsendquote");

		public static By emailCaminhao = By.cssSelector("#email");

		public static By phoneCamin = By.cssSelector("#phone");

		public static By userSib = By.cssSelector("#username");

		public static By passCamin = By.cssSelector("#password");

		public static By confirPassCamin = By.cssSelector("#confirmpassword");

		public static By next5 = By.cssSelector("#sendemail");
		
		public static By resultName = By.xpath("//h2[text()= 'Sending e-mail success!']");

		public static By finalizar = By.xpath("/html/body/div[4]/div[7]/div/button");

}