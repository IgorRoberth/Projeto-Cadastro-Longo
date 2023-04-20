package elementos;

import org.openqa.selenium.By;

public class PageCamper {

	public static By ladoVolantCamp = By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[5]/p/label[2]");
	public static By tipCombCamper = By.cssSelector("option[value=\"Gas\"]");
	public static By totalveicCamper = By.cssSelector("#totalweight");
	public static By ocupCamper = By.cssSelector("option[value=\"Public Official\"]");
	public static By HobbCamper = By.xpath("//*[text()=' Other']");	
	public static By somaSegCamp = By.xpath("//*[text()=' 10.000.000,00']");
	public static By segDanosCamper = By.xpath("//*[text()='No Coverage']");

}