package comando;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import browsers.Browsers;
import elementos.Elementos;
import metodos.Metodos;

public class Comandos extends Browsers {

	Metodos inter = new Metodos();
	Elementos elem = new Elementos();

	// Interações da Package Cadastro carro

	public void escrever(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	@SuppressWarnings("deprecation")
	public void PerforCar(String texto, By elemento) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.name("[kW]"))).sendKeys(texto);
	}

	// Interações da package Cadastro Caminhão

	@SuppressWarnings("deprecation")
	public void desempenho(String texto, By elemento) {

		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.name("[kW]")))
				.sendKeys(texto);

	}

	@SuppressWarnings("deprecation")
	public void next4Cli(By elemento) {

		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("nextsendquote")))
				.click();

	}
	// Interações package Cadastro Motocicleta

	@SuppressWarnings("deprecation")
	public void modelMoto(By elemento) {

		new WebDriverWait(driver, 20)
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#model > option:nth-child(4)"))).click();
	}

	@SuppressWarnings("deprecation")
	public void proxmoto4(By elemento) {

		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#nextsendquote")))
				.click();
	}

	@SuppressWarnings("deprecation")
	public void clicarOkMoto(By elemento) {
		new WebDriverWait(driver, 20)
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
						"body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button")))
				.click();

	}

	@SuppressWarnings("deprecation")
	public void clicarOkFimCarro(By elemento) {
		new WebDriverWait(driver, 20)
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
						"body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button	")))
				.click();
	}

	@SuppressWarnings("deprecation")
	public void clicarOkCaminhao(By elemento) {
		new WebDriverWait(driver, 20)
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
						"body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button")))
				.click();
	}

	@SuppressWarnings("deprecation")
	public void escrPerforCarcamper(String texto, By elemento) {
		new WebDriverWait(driver, 20)
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#engineperformance"))).sendKeys(texto);
	}

	@SuppressWarnings("deprecation")
	public void clicarOkCamper4(By elemento) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#nextsendquote")))
				.click();
	}

	@SuppressWarnings("deprecation")
	public void confPassCamper(String texto, By elemento) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#confirmpassword")))
				.sendKeys(texto);

	}

	@SuppressWarnings("deprecation")
	public void clicarOkCamper(By elemento) {
		new WebDriverWait(driver, 20)
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
						"body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button")))
				.click();
	}
	@SuppressWarnings("deprecation")
	public void validaTexto(By elemento, String textoEsperado) {
			
		WebElement element;
		WebDriverWait wait = new WebDriverWait(driver, 100);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Sending e-mail success!']")));

		String textoCapturado = driver.findElement(elemento).getText();
		assertTrue(textoCapturado.contains(textoEsperado));
	}
}