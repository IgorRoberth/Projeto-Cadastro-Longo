package executa;

import browsers.Browsers;
import comando.Comandos;
import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class CadastroMotocicleta extends Browsers {

	Elementos element = new Elementos();
	Comandos comandos = new Comandos();
	Metodos metd = new Metodos();

	@Given("que entre no site para cadastrar moto")
	public void que_entre_no_site_para_cadastrar_moto() {

	}

	@Given("clicar em motorcycle")
	public void clicar_em_motorcycle() {
		
		metd.clicar(element.motocicleta);

	}

	@When("executar cadastro")
	public void executar_cadastro() {

		metd.clicar(element.marcaMoto);
		comandos.modelMoto(element.modeloMoto);
		comandos.escrever("200", element.cilindroMoto);
		comandos.escrever("48", element.desempMoto);
		comandos.escrever("11/12/2020", element.dataFabricacaoMoto);
		metd.clicar(element.assentMoto);
		comandos.escrever("15250", element.precoMoto);
		comandos.escrever("34567", element.kmAnualMoto);
		metd.clicar(element.proxMoto1);
		comandos.escrever("Julio", element.nomeCliMoto);
		comandos.escrever("Clovis", element.sobreNomeCliMoto);
		comandos.escrever("04/22/1995", element.dataDNascMoto);
		metd.clicar(element.generoMoto);
		comandos.escrever("Rua Brenario Silveira Breca", element.endCliMoto);
		metd.clicar(element.nacioMoto);
		comandos.escrever("329103", element.cepCliMoto);
		comandos.escrever("Lalonge", element.cityMoto);
		metd.clicar(element.ocupaMoto);
		metd.clicar(element.HobbMoto);
		comandos.escrever("www.julioclovis.com.br", element.webSiMoto);
		metd.clicar(element.clicaMotoProx2);
		comandos.escrever("12/05/2023", element.dataInicioMoto);
		metd.clicar(element.somaSegMoto);
		metd.clicar(element.segdeMoto);
		metd.clicar(element.opcaoProdMoto);
		metd.clicar(element.clicarMotoProx3);
		metd.clicar(element.escolhePlanoMoto);
		comandos.proxmoto4(element.ProxiMoto4);
		comandos.escrever("julioclovis@gmail.com", element.emailMoto);
		comandos.escrever("11956873456", element.celularMoto);
		comandos.escrever("julio145", element.userMoto);
		comandos.escrever("Fgp3214@f", element.passMoto);
		comandos.escrever("Fgp3214@f", element.confirmPass);
	}

	@Then("confirmar cadastro")
	public void confirmar_cadastro() {

		metd.clicar(element.proxMoto5);
		comandos.clicarOkMoto(element.clicaOkMoto);
	}
}