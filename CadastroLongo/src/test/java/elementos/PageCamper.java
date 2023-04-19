package elementos;

import org.openqa.selenium.By;

public class PageCamper {

	public static By AssCamper = By.cssSelector("#numberofseats > option:nth-child(9)");
	public static By ladoVolantCamp = By.cssSelector("#insurance-form > div > section:nth-child(1) > div:nth-child(5) > p > label:nth-child(2)");
	public static By tipCombCamper = By.cssSelector("#fuel > option:nth-child(5)");
	public static By totalveicCamper = By.cssSelector("#totalweight");
	public static By ocupCamper = By.cssSelector("#occupation > option:nth-child(3)");
	public static By HobbCamper = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(5) > span");	
	public static By somaSegCamp = By.xpath("//*[text()=' 10.000.000,00']");
	public static By segDanosCamper = By.xpath("//*[text()='No Coverage']");

}