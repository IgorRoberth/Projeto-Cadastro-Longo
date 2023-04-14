package executa;

import java.io.IOException;

import drivers.DriverConect;
import elementos.PageCaminhao;
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

		Metodos.clicar(PageCaminhao.truck);

	}

	@When("realizar cadastro caminhao")
	public void realizar_cadastro_caminhao() {

		Preencher.preencherCaminhão();

	}

	@Then("finallizar cadastro caminhao")
	public void finallizar_cadastro_caminhao() {

        Preencher.finalizarCaminhao();

    }
}