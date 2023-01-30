package comando;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import browsers.Browsers;
import elementos.Elementos;
import metodos.Metodos;

public class Comandos extends Browsers {

	Metodos inter = new Metodos();
	Elementos elem = new Elementos();

	public void escolha(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void data(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void list(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void placa(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void Km(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void primeiroNome(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void lastName(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void dataNascimento(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void endereco(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void cep(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void city(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void web(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void startDate(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void insurance(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void rating(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void email(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void phone(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void user(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void Senha(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void confirm(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);

	}

	// Interações da package Cadastro Caminhão

	public void desempenho(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void caminFabricação(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void camCargaUtil(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void camPeso(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void CamPreco(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void NumPlaca(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void kmcam(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void Nomecam(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void Sobrename(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void dateNasciCam(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void EndCam(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void CodiPost(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void CidCam(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void siteCAM(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void DataInicioCam(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void emailCamin(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void phonCamin(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void userCamin(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void senhaCamin(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void confiCamin(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);

	}

	@SuppressWarnings("deprecation")
	public void next4Cli(By elemento) {

		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#nextsendquote")))
				.click();

	}
	// Interações package Cadastro Motocicleta

	public void ciclindroMoto(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void desemMoto(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void datFabMoto(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void precoMotoTab(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void KMMoto(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void nomeMotoCli(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void SobreNomeMoto(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void daTNasciMoto(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void endMoto(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void cepMoto(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void cidadeMoto(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void redeMoto(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void dataIniMoto(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	@SuppressWarnings("deprecation")
	public void proxmoto4(By elemento) {

		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#nextsendquote")))
				.click();
	}

	public void emailMoto(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void telMoto(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void userMoto(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void passMoto(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void confirmPassMoto(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);

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
	
	
	//Interações com a package CadastroCampista
    public void escrPerforCarcamper (String texto, By elemento) {
    
    	driver.findElement(elemento).sendKeys(texto);
    	
    }
    public void dataFabCamper (String texto, By elemento) {
    	
    	driver.findElement(elemento).sendKeys(texto);
  	
    }
    public void cargUtCamp (String texto, By elemento) {
    	
    	driver.findElement(elemento).sendKeys(texto);
   
    }
    public void pesoTotCamper (String texto, By elemento) {
    	
    	driver.findElement(elemento).sendKeys(texto);
    
    }
    public void precoTbCamper (String texto, By elemento) {
    	
    	driver.findElement(elemento).sendKeys(texto);
  
    }
    public void placaCamper (String texto, By elemento) {
    
    	driver.findElement(elemento).sendKeys(texto);
    }
    public void anualCamper (String texto, By elemento) {
    	
    	driver.findElement(elemento).sendKeys(texto);
    }
}