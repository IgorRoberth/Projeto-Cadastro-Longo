package executa;

import java.io.IOException;

import browsers.Browsers;
import elementos.PageCarro;
import elementos.PageMotocicleta;
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
		
		Metodos.clicar(PageMotocicleta.motocicleta);

	}

	@When("executar cadastro")
	public void executar_cadastro() {
		
		Preencher.preencherMoto();
		
	}

	@Then("confirmar cadastro")
	public void confirmar_cadastro() {

		Preencher.finalizarMoto();

	}
}