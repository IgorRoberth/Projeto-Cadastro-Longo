package elementos;

import org.openqa.selenium.By;

public class PageCaminhao {

	    public static By camComb = By.cssSelector("option[value=\"Diesel\"]");
        public static By OcupCam = By.cssSelector("option[value=\"Selfemployed\"]");
		public static By hobCamExcesso = By.xpath("//*[text()=' Speeding']");
		public static By hobCamParaquedismo = By.xpath("//*[text()=' Skydiving']");
		public static By ValorseguroCAM = By.xpath("//*[text()=' 7.000.000,00']");		
}