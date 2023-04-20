package elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class PageCarro {

		public static By Hobbies = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");
		public static By occupation = By.cssSelector("option[value=\"Employee\"]");
		public static By merito = By.cssSelector("#meritrating > option:nth-child(4)");
}