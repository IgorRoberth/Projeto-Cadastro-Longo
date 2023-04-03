package executa;

import browsers.Browsers;
import drivers.DriverConect;
import elementos.PageCarro;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class CadastroCarro extends DriverConect {
	
	Metodos met = new Metodos();

	@Before
	public void inicioTeste() {

		Browsers.abrirNavegador("Chrome");
		
	}

	@After
	public void finalizandoTeste() {

		Browsers.fecharNavegador();

	}
	
	@Given("que entre no site para cadastrar carro")
	public void que_entre_no_para_cadastrar_carro() {

	}

	@Given("clico em automobile")
	public void clico_em_automobile() {

		met.clicar(PageCarro.clicarAutomobile);

	}

	@When("realizar cadastro")
	public void realizar_cadastro() throws InterruptedException {

		met.clicar(PageCarro.selecionarCarro);
		met.escreverCmEspera(PageCarro.performance, "200");
		met.escrever(PageCarro.date, "01/01/2022");
		met.clicar(PageCarro.assentos);
		met.clicar(PageCarro.type);
		met.escrever(PageCarro.list, "55000");
	    met.escrever(PageCarro.placa, "GFP1029");
		met.escrever(PageCarro.kmAnual, "25000");
		met.clicar(PageCarro.next);
	 	met.escrever(PageCarro.firstname, "Elisio");
	    met.escrever(PageCarro.lastN, "Braga");
		met.escrever(PageCarro.dataNas, "02/03/1989");
		met.clicar(PageCarro.macho);
	 	met.escrever(PageCarro.ende, "Jardim Santa Rosa");
		met.clicar(PageCarro.nacionalidade);
	 	met.escrever(PageCarro.cep, "14808192");
		met.escrever(PageCarro.city, "Carambolas");
		met.clicar(PageCarro.occupation);
		met.clicar(PageCarro.Hobbies);
		met.escrever(PageCarro.webSite, "www.ricardodanilo.com.br");
		met.clicar(PageCarro.openPicture);
		Thread.sleep(2000);
		Metodos.uploadFile("C:\\Users\\igorr\\OneDrive\\Documents\\CNHRegras\\cnhcbncg", 0);
		met.clicar(PageCarro.clicarProximo);
	    met.escrever(PageCarro.startDate, "05/18/2023");
	    met.escrever(PageCarro.Sum, "3.000.000,00");
		met.clicar(PageCarro.merito);
		met.clicar(PageCarro.damange);
		met.clicar(PageCarro.opcaoProd);
		met.clicar(PageCarro.cortesy);
		met.clicar(PageCarro.prox);
		met.clicar(PageCarro.gold);
		met.clicar(PageCarro.sendQuote);
		met.escrever(PageCarro.email, "daniel_figueiredo@tglaw.com.br");
		met.escrever(PageCarro.cel, "11981715491");
	    met.escrever(PageCarro.userName, "daniel.123");
		met.escrever(PageCarro.pass, "u;p@G$7coi");
	 	met.escrever(PageCarro.confirmPass, "u;p@G$7coi");

	}

	@Then("finalizar cadastro")
	public void finalizar_cadastro() throws InterruptedException {

		met.clicar(PageCarro.finalizado);
        met.validaTexto(PageCarro.validarMsg, "Sending e-mail success!");
        met.clicarCmEspera(PageCarro.okCarro);
	}
}