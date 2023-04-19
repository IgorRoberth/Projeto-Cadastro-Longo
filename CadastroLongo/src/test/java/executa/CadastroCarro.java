package executa;

import browsers.Browsers;
import elementos.PageCadastro;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import preenchendo.Preencher;

public class CadastroCarro {

	@Before
	public void inicioTeste() {

		Browsers.abrirNavegador("Edge");

	}
	
	@Given("que entre no site para cadastrar carro")
	public void que_entre_no_para_cadastrar_carro() {

	}

	@Given("clico em automobile")
	public void clico_em_automobile() {

		Metodos.clicar(PageCadastro.HomePage.Automobile);

	}

	@When("realizar cadastro")
	public void realizar_cadastro() {

		Preencher.preencherCarro();
		Preencher.preencherDadosPessoaisCarro();
		Preencher.dadosSeguroCarro();
		Preencher.DadosUsuarioCarro();

	}

	@Then("finalizar cadastro")
	public void finalizar_cadastro() {

		Preencher.finalizarCadastroCarro();
		
	}
	
	@After
	public void finalizandoTeste() {

	    Browsers.fecharNavegador();

	}
}