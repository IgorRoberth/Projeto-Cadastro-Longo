package executa;

import elementos.PageCadastro;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import preenchendo.Preencher;

public class CadastroCaminhao {

	@Given("que entre no site para cadastrar caminhao")
	public void que_entre_no_site_para_cadastrar_caminhao() {

	}

	@Given("clicar em truck")
	public void clicar_em_truck() {

	    Metodos.clicar(PageCadastro.HomePage.clicartruck);

	}

	@When("realizar cadastro caminhao")
	public void realizar_cadastro_caminhao() {

		Preencher.preencherCaminhão();
		Preencher.DadosPessoaisCaminhao();
		Preencher.dadosSeguroCaminhao();
		Preencher.DadosUsuarioCaminhao();

	}

	@Then("finallizar cadastro caminhao")
	public void finallizar_cadastro_caminhao() {

        Preencher.finalizarCadastroCaminhao();

    }
}