package executa;

import java.io.IOException;

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
     
		comandos.desemMoto("48", element.desempMoto);

	}

	@When("informar a data de fabricacao da moto")
	public void informar_a_data_de_fabricacao_da_moto() {

		comandos.datFabMoto("11/12/2020", element.dataFabricacaoMoto);

	}

	@When("informar a quantidade de assentos")
	public void informar_a_quantidade_de_assentos() {

		metd.clicar(element.assentMoto);
		
	}

	@When("informar o preco de tabela da moto")
	public void informar_o_preco_de_tabela_da_moto() {

		comandos.ciclindroMoto("15250", element.precoMoto);
		
	}

	@When("informar quilometragem anual da moto")
	public void informar_quilometragem_anual_da_moto() {
		
		comandos.KMMoto("34567", element.kmAnualMoto);
	  }
		@Then("clicar em proximo1")
		public void clicar_em_proximo1() throws IOException {

		metd.screenShot("Proximo 1");	
		metd.clicar(element.proxMoto1);
		
	}
	@When("informar o primeiro nome")
	public void informar_o_primeiro_nome() {

		comandos.nomeMotoCli("Julio", element.nomeCliMoto);

	}

	@When("informar o sobrenome")
	public void informar_o_sobrenome() {

		comandos.SobreNomeMoto("Clovis", element.sobreNomeCliMoto);

	}

	@When("informar data de nascimento")
	public void informar_data_de_nascimento() {

		comandos.daTNasciMoto("04/22/1995", element.dataDNascMoto);
        
	}
	@When("seleciono o genero do cliente")
	public void seleciono_o_genero_do_cliente() {
	 
		metd.clicar(element.generoMoto);
		
	}
	@When("informar endereco")
	public void informar_endereco() {

	   comandos.endMoto("Rua Brenario Silveira Breca", element.endCliMoto);
	       
	}

	@When("selecionar nacionalidade")
	public void selecionar_nacionalidade() {

		metd.clicar(element.nacioMoto);
		
	}

	@When("informar codigo postal")
	public void informar_codigo_postal() {

		comandos.cepMoto("329103", element.cepCliMoto);
		
	}

	@When("informar cidade")
	public void informar_cidade() {

		comandos.cidadeMoto("Lalonge", element.cityMoto);
		
	}

	@When("informar a ocupacao")
	public void informar_a_ocupacao() {

		metd.clicar(element.ocupaMoto);
		
	}

	@When("selecionar os hobbies")
	public void selecionar_os_hobbies() {

		metd.clicar(element.HobbMoto);
		
	}

	@When("informar local na rede")
	public void informar_local_na_rede() {

		comandos.redeMoto("www.julioclovis.com.br", element.webSiMoto);
		
	}
	@Then("clicar em proximo2")
	public void clicar_em_proximo2() throws IOException {

		metd.screenShot("Proximo 2");
		metd.clicar(element.clicaMotoProx2);
		
	}
	@When("digitar data de inicio seguro moto")
	public void digitar_data_de_inicio_seguro_moto() {

		comandos.dataIniMoto("12/05/2023", element.dataInicioMoto);
		
	}

	@When("informar soma total do seguro moto")
	public void informar_soma_total_do_seguro_moto() {

		metd.clicar(element.somaSegMoto);
		
	}

	@When("informar seguro de danos moto")
	public void informar_seguro_de_danos_moto() {

		metd.clicar(element.segdeMoto);
	
	}

	@When("opcao do produto moto")
	public void opcao_do_produto_moto() {

		metd.clicar(element.opcaoProdMoto);
		
	}

	@Then("clicar em proximo3")
	public void clicar_em_proximo3() throws IOException {

		metd.screenShot("Proximo 3");
		metd.clicar(element.clicarMotoProx3);
		
	}
	@When("selecionar plano da moto")
	public void selecionar_plano_da_moto() {
  
		metd.clicar(element.escolhePlanoMoto);
		
	}

	@Then("clicar em proximo4")
	public void clicar_em_proximo4() throws IOException {

		metd.screenShot("Proximo 4");
		comandos.proxmoto4(element.ProxiMoto4);
		
	}
	@When("digitar email cliente moto")
	public void digitar_email_cliente_moto() {

		comandos.email("julioclovis@gmail.com", element.emailMoto);
		
	}

	@When("digitar telefone cliente moto")
	public void digitar_telefone_cliente_moto() {

		comandos.telMoto("11956873456", element.celularMoto);
		
	}

	@When("digitar usuario cliente moto")
	public void digitar_usuario_cliente_moto() {

		comandos.userMoto("julio145", element.userMoto);
		
	}

	@When("criar senha cliente moto")
	public void criar_senha_cliente_moto() {

		comandos.passMoto("Fgp3214@f", element.passMoto);
		
	}

	@When("confirmar senha cliente moto")
	public void confirmar_senha_cliente_moto() {

		comandos.confirmPassMoto("Fgp3214@f", element.confirmPass);
		
		
	}

	@Then("clicar em proximo5")
	public void clicar_em_proximo5() throws IOException {

		metd.clicar(element.proxMoto5);
        
		
	}
	@Then("clicar em ok encerrando o cadastro")
	public void clicar_em_ok_encerrando_o_cadastro() throws IOException {

		
		comandos.clicarOkMoto(element.clicaOkMoto);
		metd.screenShot("Finalizando Cadastro");
		metd.fecharNavegador();

	}

}
