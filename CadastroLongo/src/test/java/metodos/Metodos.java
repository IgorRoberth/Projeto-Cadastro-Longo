package metodos;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browsers.Browsers;

public class Metodos extends Browsers {

	public static void clicar(By elemento) {
		try {
		    new WebDriverWait(driver, 2000).until(ExpectedConditions.elementToBeClickable(elemento)).click();
		} catch (Exception e) {
			System.err.println("-------erro ao clicar---------" + e.getMessage());
			System.err.println("-------causa do erro---------" + e.getCause());
		}
	}

   	public static void escrever(By elemento, String texto) {

   		new WebDriverWait(driver, 2000).until(ExpectedConditions.elementToBeClickable(elemento)).sendKeys(texto);
	}
	
	public static void validaTexto(By elemento, String textoEsperado) {

		WebElement element;
		WebDriverWait wait = new WebDriverWait(driver, 100);
		element = wait.until(ExpectedConditions.elementToBeClickable(elemento));
		String textoCapturado = driver.findElement(elemento).getText();
		assertTrue(textoCapturado.contains(textoEsperado));
	}
}