package elementos;

import org.openqa.selenium.By;

public class PageMotocicleta {
	
	public static By modeloMoto = By.cssSelector("#model > option:nth-child(5)");
	public static By cilindroMoto = By.cssSelector("#cylindercapacity");
	public static By assentMoto = By.cssSelector("#numberofseatsmotorcycle > option:nth-child(3)");
	public static By ocupaMoto = By.cssSelector("#occupation > option:nth-child(6)");
	public static By HobbMoto = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");		
	public static By somaSegMoto = By.xpath("//*[text()=' 3.000.000,00']");
}