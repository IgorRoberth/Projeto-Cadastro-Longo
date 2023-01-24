package executa;

import browsers.Browsers;
import comando.Comandos;
import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class CadastroCaminhao extends Browsers {

	Elementos el = new Elementos();
	Comandos mandos = new Comandos();
	Metodos metodos = new Metodos();

	@Given("que entre no site e clico em caminhao {string}")
	public void que_entre_no_site_e_clico_em_caminhao(String site) {

		metodos.abrirNavegador("Chrome", site);
		metodos.clicar(el.truckClic());

	}

	@When("seleciono a marca desejada")
	public void seleciono_a_marca_desejada() {

		metodos.clicar(el.Marca);
		

	}

	@When("informo o desempenho do motor do caminhao")
	public void informo_o_desempenho_do_motor_do_caminhao() {

		mandos.desempenho("263", el.Desemp);

	}

	@When("informo a data de fabricacao do caminhao")
	public void informo_a_data_de_fabricacao_do_caminhao() {

		
		mandos.caminFabricação("12/03/2020", el.caFab);
		
	}

	@When("a quantidade de assentos do caminhao")
	public void a_quantidade_de_assentos_do_caminhao() {
		
		metodos.clicar(el.caminAss);

	}

	@When("o tipo de combustivel do caminhao")
	public void o_tipo_de_combustivel_do_caminhao() {
		
		metodos.clicar(el.camComb);

	}
	@When("informo carga util")
	public void informo_carga_util() {

		mandos.camCargaUtil("1000", el.CamCarg);

	}

	@When("informo peso total")
	public void informo_peso_total() {
		
        mandos.camPeso("23000", el.CamPeso);

	}
	

	@When("o preco de tabela do caminhao")
	public void o_preco_de_tabela_do_caminhao() {

		mandos.CamPreco("100000", el.precoCam);
		
	}

	@When("numero da placa do caminhao")
	public void numero_da_placa_do_caminhao() {

      mandos.NumPlaca("NEV-8210", el.numPlaca);		
		
	}

	@When("quilometragem anual do caminhao")
	public void quilometragem_anual_do_caminhao() {

		mandos.kmcam("81450", el.CamKM);
		
	}

	@Then("clico em next1")
	public void clico_em_next1() {
		
		metodos.clicar(el.next1);

	}

	@When("digito o nome")
	public void digito_o_nome() {

	}

	@When("digito o sobrenome")
	public void digito_o_sobrenome() {

	}

	@When("informo a data de nascimento")
	public void informo_a_data_de_nascimento() {

	}

	@When("seleciono o genero desejado")
	public void seleciono_o_genero_desejado() {

	}

	@When("digito endereco desejado")
	public void digito_endereco_desejado() {

	}

	@When("insiro a cidade desejada")
	public void insiro_a_cidade_desejada() {

	}

	@When("seleciono o pais")
	public void seleciono_o_pais() {

	}

	@When("digito o	cep local")
	public void digito_o_cep_local() {

	}

	@When("seleciono ocupacao melhor para o momento")
	public void seleciono_ocupacao_melhor_para_o_momento() {

	}

	@When("escolho os Hobbies preferidos")
	public void escolho_os_hobbies_preferidos() {

	}

	@When("insiro o site escolhido")
	public void insiro_o_site_escolhido() {

	}

	@When("clico no botao next2")
	public void clico_no_botao_next2() {

	}

	@When("digito a data de inicio do seguro")
	public void digito_a_data_de_inicio_do_seguro() {

	}

	@When("informo o valor total do seguro")
	public void informo_o_valor_total_do_seguro() {

	}

	@When("escolho o seguro de danos")
	public void escolho_o_seguro_de_danos() {

	}

	@When("seleciono o produtos opcionais que desejo")
	public void seleciono_o_produtos_opcionais_que_desejo() {

		
	}

	@Then("clico em next3")
	public void clico_em_next3() {

	}

	@When("seleciono o plano desejado para o caminhao")
	public void seleciono_o_plano_desejado_para_o_caminhao() {

	}

	@When("clico em next4")
	public void clico_em_next4() {

	}

	@When("digito o email escolhido")
	public void digito_o_email_escolhido() {

	}

	@When("digito o celular escolhido")
	public void digito_o_celular_escolhido() {

	}

	@When("digito o usuario desejado")
	public void digito_o_usuario_desejado() {

	}

	@When("digito a senha desejada")
	public void digito_a_senha_desejada() {

	}

	@When("confirmo a senha desejada")
	public void confirmo_a_senha_desejada() {

	}

	@Then("clico em next5")
	public void clico_em_next5() {

	}

}
