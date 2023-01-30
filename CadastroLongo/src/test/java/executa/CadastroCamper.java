package executa;

import browsers.Browsers;
import comando.Comandos;
import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class CadastroCamper extends Browsers{
	
	Elementos elem = new Elementos();
	Comandos cmd = new Comandos();
	Metodos mtd = new Metodos();
	
	
	@Given("que entre no site tricents {string}")
	public void que_entre_no_site_tricents(String site) {

		mtd.abrirNavegador("Chrome", site);
	 // mtd.abrirNavegador("Firefox", site);
	 //	mtd.abrirNavegador("Edge", site);
	}

	@Given("clico em seguro campista")
	public void clico_em_seguro_campista() {
 
		mtd.clicar(elem.clicarCamper);

	}

	@When("seleciono a marca do veiculo")
	public void seleciono_a_marca_do_veiculo() {

		mtd.clicar(elem.marcaVeiculo);

	}

	@When("digito desempenho do motor do veiculo")
	public void digito_desempenho_do_motor_do_veiculo() {

		cmd.escrPerforCarcamper("248", elem.performCarCamper);
		
	}

	@When("digito a data de fabricacao")
	public void digito_a_data_de_fabricacao() {

		cmd.dataFabCamper("05/23/2019", elem.dataFabCamper);

	}

	@When("seleciono a quantidade de assentos do veiculo")
	public void seleciono_a_quantidade_de_assentos_do_veiculo() {

		mtd.clicar(elem.AssCamper);

	}

	@When("informo se o volante esta a direita")
	public void informo_se_o_volante_esta_a_direita() {

		mtd.clicar(elem.ladoVolantCamp);

	}

	@When("seleciono o tipo de combustivel do veiculo")
	public void seleciono_o_tipo_de_combustivel_do_veiculo() {

		mtd.clicar(elem.tipCombCamper);

	}

	@When("digito a carga util do veiculo")
	public void digito_a_carga_util_do_veiculo() {

		cmd.cargUtCamp("650", elem.cargUtCamper);

	}

	@When("digito o peso total do veiculo")
	public void digito_o_peso_total_do_veiculo() {

		cmd.pesoTotCamper("1560", elem.totalveicCamper);

	}

	@When("informo preco de tabela")
	public void informo_preco_de_tabela() {

		cmd.precoTbCamper("12737", elem.precoTabCamper);

	}

	@When("digito o numero da placa")
	public void digito_o_numero_da_placa() {

		cmd.placaCamper("40393902", elem.numPlacaCamper);

	}

	@When("informo a quilometragem anual do veiculo")
	public void informo_a_quilometragem_anual_do_veiculo() {

		cmd.anualCamper("34230", elem.anualKmCamper);

	}

	@Then("clico em proximo")
	public void clico_em_proximo() {

		mtd.clicar(elem.proxCamper1);

	}

}
