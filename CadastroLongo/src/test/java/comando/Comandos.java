package comando;

import org.openqa.selenium.By;
import browsers.Browsers;
import elementos.Elementos;
import metodos.Metodos;

public class Comandos extends Browsers{
	
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
	
	//Interações da package Cadastro Caminhão
	
	public void desempenho(String texto ,By elemento) {
		
		driver.findElement(elemento).sendKeys(texto);
		
	}
	public void caminFabricação(String texto, By elemento) {
		
		driver.findElement(elemento).sendKeys(texto);
	}
	public void camCargaUtil(String texto, By elemento) {
		
		driver.findElement(elemento).sendKeys(texto);
	}
	public void camPeso (String texto, By elemento) {
	
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
}
