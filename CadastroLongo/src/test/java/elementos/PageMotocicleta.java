package elementos;

import org.openqa.selenium.By;

public class PageMotocicleta {
	
		public static By cilindroMoto = By.cssSelector("#cylindercapacity");
		public static By ocupaMoto = By.cssSelector("#occupation > option:nth-child(6)");
		public static By HobbMoto = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");		
		public static By somaSegMoto = By.xpath("//*[text()=' 3.000.000,00']");

}