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
		met.escreverCmEspera("200", PageCarro.performance);
		met.escrever("01/01/2022", PageCarro.date);
		met.clicar(PageCarro.assentos);
		met.clicar(PageCarro.type);
		met.escrever("55000", PageCarro.list);
	    met.escrever("GFP1029", PageCarro.placa);
		met.escrever("25000", PageCarro.kmAnual);
		met.clicar(PageCarro.next);
	 	met.escrever("Elisio", PageCarro.firstname);
	    met.escrever("Braga", PageCarro.lastN);
		met.escrever("02/03/1989", PageCarro.dataNas);
		met.clicar(PageCarro.macho);
	 	met.escrever("Jardim Santa Rosa", PageCarro.ende);
		met.clicar(PageCarro.nacionalidade);
	 	met.escrever("14808192", PageCarro.cep);
		met.escrever("Carambolas", PageCarro.city);
		met.clicar(PageCarro.occupation);
		met.clicar(PageCarro.Hobbies);
		met.escrever("www.ricardodanilo.com.br", PageCarro.webSite);
		met.clicar(PageCarro.openPicture);
		Thread.sleep(2000);
		Metodos.uploadFile("C:\\Users\\igorr\\OneDrive\\Documents\\CNHRegras\\cnhcbncg", 0);
		met.clicar(PageCarro.clicarProximo);
	    met.escrever("05/18/2023", PageCarro.startDate);
	    met.escrever("3.000.000,00", PageCarro.Sum);
		met.clicar(PageCarro.merito);
		met.clicar(PageCarro.damange);
		met.clicar(PageCarro.opcaoProd);
		met.clicar(PageCarro.cortesy);
		met.clicar(PageCarro.prox);
		met.clicar(PageCarro.gold);
		met.clicar(PageCarro.sendQuote);
		met.escrever("daniel_figueiredo@tglaw.com.br", PageCarro.email);
		met.escrever("11981715491", PageCarro.cel);
	    met.escrever("daniel.123", PageCarro.userName);
		met.escrever("u;p@G$7coi", PageCarro.pass);
	 	met.escrever("u;p@G$7coi", PageCarro.confirmPass);

	}

	@Then("finalizar cadastro")
	public void finalizar_cadastro() throws InterruptedException {

		met.clicar(PageCarro.finalizado);
        met.validaTexto(PageCarro.validarMsg, "Sending e-mail success!");
        met.clicarCmEspera(PageCarro.okCarro);
	}
}