package executa;

import browsers.Browsers;
import comando.Comandos;
import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class CadastroMotocicleta extends Browsers {
	
	Elementos element = new Elementos();
	Comandos comandos = new Comandos();
	Metodos metd = new Metodos();
	
	
	@Given("que entre no site de seguros {string}")
	public void que_entre_no_site_de_seguros(String site) {

		metd.abrirNavegador("Chrome", site);
		
	}

	@When("clicar em motocicletas")
	public void clicar_em_motocicletas() {
	    
		metd.clicar(element.motocicleta);
	}

	@When("selecione a marca da moto")
	public void selecione_a_marca_da_moto() {
		
		metd.clicar(element.marcaMoto);
	    
	}

	@When("escolher o modelo da moto")
	public void escolher_o_modelo_da_moto() {
   
		metd.clicar(element.modeloMoto);

	}

	@When("informar a capacidade de cilindro")
	public void informar_a_capacidade_de_cilindro() {
		
       comandos.ciclindroMoto("200", element.cilindroMoto);

	}

	@When("informar o desempenho do motor")
	public void informar_o_desempenho_do_motor() {


	}

	@When("informar a data de fabricacao da moto")
	public void informar_a_data_de_fabricacao_da_moto() {


	}

	@When("informar a quantidade de assentos")
	public void informar_a_quantidade_de_assentos() {

	}

	@When("informar o preco de tabela da moto")
	public void informar_o_preco_de_tabela_da_moto() {

	}

	@When("informar quilometragem anual da moto")
	public void informar_quilometragem_anual_da_moto() {

	}

	@Then("clicar em proximo")
	public void clicar_em_proximo() {
	    
	}

}
