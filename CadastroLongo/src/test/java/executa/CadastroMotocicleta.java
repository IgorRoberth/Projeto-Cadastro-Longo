package executa;

import elementos.PageCadastro;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import preenchendo.Preencher;

public class CadastroMotocicleta {

	@Given("que entre no site para cadastrar moto")
	public void que_entre_no_site_para_cadastrar_moto() {

	}

	@Given("clicar em motorcycle")
	public void clicar_em_motorcycle() {
		
		Metodos.clicar(PageCadastro.HomePage.clicarmotocicleta);

	}

	@When("executar cadastro")
	public void executar_cadastro() {
		
		Preencher.preencherMoto();
		Preencher.DadosPessoaisMoto();
		Preencher.dadosSeguroMoto();
		Preencher.DadosUsuarioMoto();
		
	}

	@Then("confirmar cadastro")
	public void confirmar_cadastro() {

		Preencher.finalizarMoto();

	}
}