package executa;

import browsers.Browsers;
import elementos.PageCarro;
import elementos.PageMotocicleta;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class CadastroMotocicleta extends Browsers {

	Metodos metd = new Metodos();

	@Given("que entre no site para cadastrar moto")
	public void que_entre_no_site_para_cadastrar_moto() {

	}

	@Given("clicar em motorcycle")
	public void clicar_em_motorcycle() {
		
		metd.clicar(PageMotocicleta.motocicleta);

	}

	@When("executar cadastro")
	public void executar_cadastro() {

		metd.clicar(PageMotocicleta.marcaMoto);
		metd.clicarCmEspera(PageMotocicleta.modeloMoto);
		metd.escrever("200", PageMotocicleta.cilindroMoto);
		metd.escrever("48", PageMotocicleta.desempMoto);
		metd.escrever("11/12/2020", PageMotocicleta.dataFabricacaoMoto);
		metd.clicar(PageMotocicleta.assentMoto);
		metd.escrever("15250", PageMotocicleta.precoMoto);
		metd.escrever("34567", PageMotocicleta.kmAnualMoto);
		metd.clicar(PageMotocicleta.proxMoto1);
		metd.escrever("Julio", PageMotocicleta.nomeCliMoto);
		metd.escrever("Clovis", PageMotocicleta.sobreNomeCliMoto);
		metd.escrever("04/22/1995", PageMotocicleta.dataDNascMoto);
		metd.clicar(PageMotocicleta.generoMoto);
		metd.escrever("Rua Brenario Silveira Breca", PageMotocicleta.endCliMoto);
		metd.clicar(PageMotocicleta.nacioMoto);
		metd.escrever("329103", PageMotocicleta.cepCliMoto);
		metd.escrever("Lalonge", PageMotocicleta.cityMoto);
		metd.clicar(PageMotocicleta.ocupaMoto);
		metd.clicar(PageMotocicleta.HobbMoto);
		metd.escrever("www.julioclovis.com.br", PageMotocicleta.webSiMoto);
		metd.clicar(PageMotocicleta.clicaMotoProx2);
		metd.escrever("12/05/2023", PageMotocicleta.dataInicioMoto);
		metd.clicar(PageMotocicleta.somaSegMoto);
		metd.clicar(PageMotocicleta.segdeMoto);
		metd.clicar(PageMotocicleta.opcaoProdMoto);
		metd.clicar(PageMotocicleta.clicarMotoProx3);
		metd.clicar(PageMotocicleta.escolhePlanoMoto);
		metd.clicarCmEspera(PageMotocicleta.ProxiMoto4);
		metd.escrever("julioclovis@gmail.com", PageMotocicleta.emailMoto);
		metd.escrever("11956873456", PageMotocicleta.celularMoto);
		metd.escrever("julio145", PageMotocicleta.userMoto);
		metd.escrever("Fgp3214@f", PageMotocicleta.passMoto);
		metd.escrever("Fgp3214@f", PageMotocicleta.confirmMoto);
	}

	@Then("confirmar cadastro")
	public void confirmar_cadastro() {

		metd.clicar(PageMotocicleta.proxMoto5);
		metd.validaTexto(PageMotocicleta.resultadoMoto, "Sending e-mail success!");
		metd.clicar(PageMotocicleta.okMoto);

	}
}