package elementos;

import org.openqa.selenium.By;

public class PageCaminhao {

		public static By camComb = By.cssSelector("#fuel > option:nth-child(3)");
		public static By OcupCam = By.cssSelector("option[value=\"Selfemployed\"]");
		public static By hobCamExcesso = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");
		public static By hobCamParaquedismo = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(4)");
		public static By ValorseguroCAM = By.xpath("//*[text()=' 7.000.000,00']");		
}