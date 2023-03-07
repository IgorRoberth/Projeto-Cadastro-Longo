package executa;

import browsers.Browsers;
import comando.Comandos;
import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class CadastroCarro extends Browsers {

	Elementos ele = new Elementos();
	Comandos coman = new Comandos();
	Metodos met = new Metodos();

	@Given("que entre no site para cadastrar carro")
	public void que_entre_no_para_cadastrar_carro() {

	}

	@Given("clico em automobile")
	public void clico_em_automobile() {

		met.clicar(ele.clicarAutomobile);

	}

	@When("realizar cadastro")
	public void realizar_cadastro() {

		met.clicar(ele.selecionarCarro);
		coman.PerforCar("200", ele.performance);
		coman.escrever("01/01/2022", ele.date);
		met.clicar(ele.assentos);
		met.clicar(ele.type);
		coman.escrever("55000", ele.list);
		coman.escrever("GFP1029", ele.placa);
		coman.escrever("25000", ele.kmAnual);
		met.clicar(ele.next);
		coman.escrever("Elisio", ele.firstname);
		coman.escrever("Braga", ele.lastN);
		coman.escrever("02/03/1989", ele.dataNas);
		met.clicar(ele.macho);
		coman.escrever("Jardim Santa Rosa", ele.ende);
		met.clicar(ele.nacionalidade);
		coman.escrever("14808192", ele.cep);
		coman.escrever("Carambolas", ele.city);
		met.clicar(ele.occupation);
		met.clicar(ele.Hobbies);
		coman.escrever("www.ricardodanilo.com.br", ele.webSite);
		met.clicar(ele.clicarProximo);
		coman.escrever("04/06/2023", ele.startDate);
		coman.escrever("3.000.000,00", ele.Sum);
		met.clicar(ele.merito);
		met.clicar(ele.damange);
		met.clicar(ele.opcaoProd);
		met.clicar(ele.cortesy);
		met.clicar(ele.prox);
		met.clicar(ele.gold);
		met.clicar(ele.sendQuote);
		coman.escrever("daniel_figueiredo@tglaw.com.br", ele.email);
		coman.escrever("11981715491", ele.cel);
		coman.escrever("daniel.123", ele.userName);
		coman.escrever("u;p@G$7coi", ele.pass);
		coman.escrever("u;p@G$7coi", ele.confirmPass);

	}

	@Then("finalizar cadastro")
	public void finalizar_cadastro() throws InterruptedException {

		met.clicar(ele.finalizado);
		coman.validaTexto(ele.resultName, "Sending e-mail success!");
		coman.clicarOkFimCarro(ele.clicarokCarro);

	}
}