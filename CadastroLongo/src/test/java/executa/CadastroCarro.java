package executa;

import java.io.IOException;

import browsers.Browsers;
import comando.Comandos;
import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class CadastroCarro extends Browsers {
	
	Elementos ele = new Elementos();
	Comandos coman = new Comandos();
	Metodos met = new Metodos();
	
	
	@Given("que entre no site {string}")
	public void que_entre_no_site(String site) throws IOException {

		met.abrirNavegador("chrome", site);
		//	met.abrirNavegador("Firefox", Site);
		//	met.abrirNavegador("Edge", Site);
		met.clicar(ele.clicarAutomobile);
    //  met.screenShot("Clique automobile"); 
		
	}

	@Given("que clico no veiculo desejado")
	public void que_clico_no_veiculo_desejado() throws IOException {

		met.clicar(ele.selecionarCarro);
	//	met.screenShot("Veiculo Selecionado");

	}

	@When("informo o desempenho do motor")
	public void informo_o_desempenho_do_motor() throws IOException {

		coman.escolha("200", ele.Velo);
	//	met.screenShot("Motor");

	}

	@When("informo a data de fabricacao")
	public void informo_a_data_de_fabricacao() throws IOException {
	    
		coman.data("01/01/2022", ele.date);
	//	met.screenShot("Data Fabricação");
	
	}

	@When("a quantidade de assentos")
	public void a_quantidade_de_assentos() throws IOException {
		
		met.clicar(ele.assentos);
	//	met.screenShot("Quantidade de Assentos");
		
	}

	@When("o tipo de combustivel")
	public void o_tipo_de_combustivel() throws IOException {

		met.clicar(ele.type);
	//	met.screenShot("Tipo combustivel");
		
	}

	@When("o preco de tabela")
	public void o_preco_de_tabela() throws IOException {

		coman.list("55000", ele.list);
	//  met.screenShot("o preço de tabela");

	}

	@When("numero da placa")
	public void numero_da_placa() throws IOException {
	    
		coman.placa("GFP1029", ele.placa);
	 //	met.screenShot("numero placa");	

	}

	@When("quilometragem anual")
	public void quilometragem_anual() throws IOException {

		coman.Km("25000", ele.kmAnual);
	//	met.screenShot("Quilometragem anual");

	}

	@Then("clico em proximo1")
	public void clico_em_proximo1() throws IOException {

		met.clicar(ele.next);
     // met.screenShot("clico em próximo1");
		
	}

	@When("digito primeiro nome")
	public void digito_primeiro_nome() throws IOException {
	    
		coman.primeiroNome("Elisio", ele.firstname);
	//	met.screenShot("Primeiro nome");
		
	}

	@When("digito sobrenome")
	public void digito_sobrenome() throws IOException {
 
		coman.lastName("Braga", ele.lastN);
     // met.screenShot("Digito sobre nome");
	}

	@When("informo data de nascimento")
	public void informo_data_de_nascimento() throws IOException {
	   
		coman.dataNascimento("02/03/1989", ele.dataNas);
	 // met.screenShot("Data de nascimento");
	}

	@When("seleciono o genero")
	public void seleciono_o_genero() throws IOException {

		met.clicar(ele.macho);
	 //	met.screenShot("genero");

	}

	@When("digito endereco")
	public void digito_endereco() throws IOException {

		coman.endereco("Jardim Santa Rosa", ele.ende);
   //   met.screenShot("Digito endereço");
	}
	@When("seleciono a nacionalidade")
	public void seleciono_a_nacionalidade() throws IOException {
	    
		met.clicar(ele.nacionalidade);
   //   met.screenShot("Nacionalidade");
	}

	@When("digito cep")
	public void digito_cep() throws IOException {

		coman.cep("14808192", ele.cep);
    //  met.screenShot("CEP");		
	}

	@When("digito a cidade")
	public void digito_a_cidade() throws IOException {

		coman.city("Carambolas", ele.city);
    //  met.screenShot("Cidade");
	}

	@When("seleciono a ocupacao atual")
	public void seleciono_a_ocupacao_atual() throws IOException {

		met.clicar(ele.occupation);
     // met.screenShot("Ocupação atual");
	}

	@When("seleciono o Hobbies")
	public void seleciono_o_hobbies() throws IOException {

 		met.clicar(ele.Hobbies);
      //met.screenShot("Hobbie");
	}

	@When("digito o site")
	public void digito_o_site() throws IOException {

		coman.web("www.ricardodanilo.com.br", ele.webSite);
     // met.screenShot("Informo o site");
	}

	@When("clico em proximo2")
	public void clico_em_proximo2() throws IOException {

		met.clicar(ele.clicarProximo);
      //met.screenShot("clico em proximo2");
	}

	@When("digito a data de inicio")
	public void digito_a_data_de_inicio() throws IOException {

		coman.startDate("04/06/2023", ele.startDate);
      //met.screenShot("Data inicio");
	}

	@When("informo a soma do seguro")
	public void informo_a_soma_do_seguro() throws IOException {

		coman.insurance("3.000.000,00", ele.Sum);
     // met.screenShot("Informe soma seguro");
	}

	@When("realizo avaliacao de merito")
	public void realizo_avaliacao_de_merito() throws IOException {

		met.clicar(ele.merito);
	//  met.screenShot("avaliação de mérito");
	}

	@When("seleciono seguro de danos")
	public void seleciono_seguro_de_danos() throws IOException {

		met.clicar(ele.damange);
      //met.screenShot("Seguro de danos");		
	}

	@When("seleciono produto desejado")
	public void seleciono_produto_desejado() throws IOException {
		
		met.clicar(ele.opcaoProd);
      //met.screenShot("Produto desejado");
	}

	@When("Seleciono cortesia")
	public void seleciono_cortesia() throws IOException {

		met.clicar(ele.cortesy);
      //met.screenShot("Cortesia");
	}

	@Then("clico em proximo3")
	public void clico_em_proximo3() throws IOException {

 		met.clicar(ele.prox);
     // met.screenShot("clico em proximo3");
	}

	@When("seleciono o plano desejado")
	public void seleciono_o_plano_desejado() throws IOException {

		met.clicar(ele.gold);
      //met.screenShot("Plano desejado");
	}

	@When("clico em proximo4")
	public void clico_em_proximo4() throws IOException {

		met.clicar(ele.sendQuote);
	//	met.screenShot("clico em proximo4");

	}

	@When("digito o email")
	public void digito_o_email() throws IOException {
		
		coman.email("daniel_figueiredo@tglaw.com.br", ele.email);
     // met.screenShot("Informe e-mail");
	}

	@When("digito o celular")
	public void digito_o_celular() throws IOException {
		
		coman.phone("11981715491", ele.cel);
     // met.screenShot("Informe Celular");

	}

	@When("digito o usuario")
	public void digito_o_usuario() throws IOException {
		
		coman.user("daniel.123", ele.userName);	
     // met.screenShot("Informe usuário");		
	}

	@When("digito a senha")
	public void digito_a_senha() throws IOException {

		coman.Senha("u;p@G$7coi", ele.pass	);
      //met.screenShot("Informe senha");
	}

	@When("confirmo a senha")
	public void confirmo_a_senha() throws IOException {

		coman.confirm("u;p@G$7coi", ele.confirmPass);
     // met.screenShot("Confirme senha");
	}

	@Then("clico em mandar")
	public void clico_em_mandar() throws IOException {
		
		met.clicar(ele.finalizado);
      //  met.screenShot("Conclue o cadastro e valido a mensagem retornada");		
	    coman.clicarOkFimCarro(ele.clicarokCarro);
	    met.fecharNavegador();	
	 
	}

}
