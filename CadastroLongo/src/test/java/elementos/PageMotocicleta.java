package elementos;

import org.openqa.selenium.By;

public class PageMotocicleta {

    public static By cilindroMoto = By.cssSelector("#cylindercapacity");
		public static By ocupaMoto = By.cssSelector("option[value=\"Selfemployed\"]");
		public static By HobbMoto = By.xpath("//*[text()=' Cliff Diving']");
		public static By somaSegMoto = By.xpath("//*[text()=' 3.000.000,00']");
}