package metodos;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import browsers.Browsers;

public class Metodos extends Browsers {

	public void screenShot(String nome) throws IOException {

		// Código para tirar as evidências da interface web, para poder verificar se
		// ocorreu algum erro e onde foi
		TakesScreenshot srcShot = ((TakesScreenshot) driver);
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File desFile = new File("./src/EvidenciasCadastros/" + nome + ".png");
		FileUtils.copyFile(srcFile, desFile);

	}

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("-------erro ao clicar---------" + e.getMessage());
			System.err.println("-------causa do erro---------" + e.getCause());
		}

	}

	// Código para fechar o navegador
	public void fecharNav() {
		driver.quit();

	}

}
