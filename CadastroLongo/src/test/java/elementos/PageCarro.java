package elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PageCarro {

	public static By clicarAutomobile = By.name("Navigation Automobile");

	public static By selecionarCarro = By.cssSelector("#make > option:nth-child(2)");

	public static By performance = By.name("[kW]");

	public static By date = By.id("dateofmanufacture");

	public static By assentos = By.cssSelector("#numberofseats > option:nth-child(5)");

	public static By type = By.cssSelector("#fuel > option:nth-child(4)");

	public static By list = By.cssSelector("#listprice");

	public static By placa = By.cssSelector("#licenseplatenumber");

	public static By kmAnual = By.cssSelector("#annualmileage");

	public static By next = By.cssSelector("#nextenterinsurantdata");

	public static By firstname = By.cssSelector("#firstname");

	public static By lastN = By.name("Last Name");

	public static By dataNas = By.id("birthdate");

	public static By macho = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span");

	public static By ende = By.name("Street Address");

	public static By nacionalidade = By.cssSelector("#country > option:nth-child(32)");

	public static By cep = By.cssSelector("#zipcode");

	public static By city = By.cssSelector("#city");

	public static By Hobbies = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");

	public static By occupation = By.cssSelector("#occupation > option:nth-child(2)");

	public static By webSite = By.cssSelector("#website");

	public static By openPicture = By.cssSelector("button[class=\"ideal-file-upload\"]");
	
	public static By clicarProximo = By.cssSelector("#nextenterproductdata");

	public static By startDate = By.cssSelector("#startdate");

	public static By Sum = By.cssSelector("#insurancesum");

	public static By merito = By.cssSelector("#meritrating > option:nth-child(4)");

	public static By damange = By.cssSelector("#damageinsurance > option:nth-child(4)");

	public static By opcaoProd = By.cssSelector("#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(2) > span");

	public static By cortesy = By.cssSelector("#courtesycar > option:nth-child(2)");

	public static By prox = By.cssSelector("#nextselectpriceoption");

	public static By gold = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(2)");

 	public static By download = By.id("downloadquote");

	public static By sendQuote = By.xpath("//*[@id=\"sendquote\"]");

	public static By email = By.cssSelector("#email");

	public static By cel = By.cssSelector("#phone");

	public static By userName = By.cssSelector("#username");

	public static By pass = By.cssSelector("#password");

	public static By confirmPass = By.cssSelector("#confirmpassword");

	public static By finalizado = By.xpath("//*[@id=\"sendemail\"]");

	public static By validarMsg = By.xpath("//h2[text()='Sending e-mail success!']");

	public static By okCarro  = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button");

}		