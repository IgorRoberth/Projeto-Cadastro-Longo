package metodos;

import static org.junit.Assert.assertTrue;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import browsers.Browsers;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos extends Browsers {

	public static void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("-------erro ao clicar---------" + e.getMessage());
			System.err.println("-------causa do erro---------" + e.getCause());
		}
	}

	public static void clicarCmEspera(By elemento) {

		new WebDriverWait(driver, 4000).until(ExpectedConditions.elementToBeClickable(elemento)).click();

	}

	public static void escrever(By elemento, String texto) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public static void escreverCmEspera(By elemento ,String texto) {
		new WebDriverWait(driver, 2000).until(ExpectedConditions.elementToBeClickable(elemento)).sendKeys(texto);

	}
	
	public static void scroll() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");

	}
	
	public static void ClickRobot(int y, int x) throws AWTException {
		try {
			Robot Robot = new Robot();
			Robot.delay(3000);
			Robot.mouseMove(y,x);
			Robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			Robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	public static void validaTexto(By elemento, String textoEsperado) {

		WebElement element;
		WebDriverWait wait = new WebDriverWait(driver, 100);
		element = wait.until(ExpectedConditions.elementToBeClickable(elemento));
		String textoCapturado = driver.findElement(elemento).getText();
		assertTrue(textoCapturado.contains(textoEsperado));
	}
}