package executa;

import drivers.DriverConect;
import elementos.PageCamper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import preenchendo.Preencher;

public class CadastroCamper {

	@Given("que entre no site para cadastrar camper")
	public void que_entre_no_site_para_cadastrar_camper() {

	}

	@Given("clico em seguro campista")
	public void clico_em_seguro_campista() {

		Metodos.clicarCmEspera(PageCamper.clickCamper);

	}

	@When("realizo o cadastro")
	public void realizo_o_cadastro() {

		Preencher.preencherCamper();

	}

	@Then("finalizo o cadastro")
	public void finalizo_o_cadastro() {

		Preencher.finalizarCamper();

	}
}