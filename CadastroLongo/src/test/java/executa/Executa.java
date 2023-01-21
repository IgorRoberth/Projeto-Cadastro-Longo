package executa;

import browsers.Browsers;
import comando.Comandos;
import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class Executa extends Browsers {
	
	Elementos ele = new Elementos();
	Comandos coman = new Comandos();
	Metodos met = new Metodos();
	
	@Given("que entre no site {string}")
	public void que_entre_no_site(String site) {

		met.abrirNavegador("chrome", site);
		//	met.abrirNavegador("Firefox", Site);
		//	met.abrirNavegador("Edge", Site);
		met.clicar(ele.clicarAutomobile());

	}

	@Given("que clico no veiculo desejado")
	public void que_clico_no_veiculo_desejado() {

		met.clicar(ele.selecionarCarro());

	}

	@When("informo o desempenho do motor")
	public void informo_o_desempenho_do_motor() {

		coman.escolha("200", ele.getVelo());

	}

	@When("informo a data de fabricacao")
	public void informo_a_data_de_fabricacao() {
	    
		coman.data("01/01/2022", ele.getDate());
	
	}

	@When("a quantidade de assentos")
	public void a_quantidade_de_assentos() {
		
		met.clicar(ele.assentos());
		
	}

	@When("o tipo de combustivel")
	public void o_tipo_de_combustivel() {

		met.clicar(ele.type());
		
	}

	@When("o preco de tabela")
	public void o_preco_de_tabela() {

		coman.list("55000", ele.getList());

	}

	@When("numero da placa")
	public void numero_da_placa() {
	    
		coman.placa("GFP1029", ele.getPlaca());
	
	}

	@When("quilometragem anual")
	public void quilometragem_anual() {

		coman.Km("25000", ele.getKm());

	}

	@Then("clico em proximo1")
	public void clico_em_proximo1() {

		met.clicar(ele.next());
		
	}

	@When("digito primeiro nome")
	public void digito_primeiro_nome() {
	    
		coman.primeiroNome("Elisio", ele.getFirstname());
		
	}

	@When("digito sobrenome")
	public void digito_sobrenome() {
 
		coman.lastName("Braga", ele.getLastN());

	}

	@When("informo data de nascimento")
	public void informo_data_de_nascimento() {
	   
		coman.dataNascimento("02/03/1989", ele.getdataNas());
		
	}

	@When("seleciono o genero")
	public void seleciono_o_genero() {

		met.clicar(ele.macho());

	}

	@When("digito endereco")
	public void digito_endereco() {

		coman.endereco("Jardim Santa Rosa", ele.getEnde());

	}
	@When("seleciono a nacionalidade")
	public void seleciono_a_nacionalidade() {
	    
		met.clicar(ele.getNacio());
	}

	@When("digito cep")
	public void digito_cep() {

		coman.cep("14808192", ele.getCep());
		
	}

	@When("digito a cidade")
	public void digito_a_cidade() {

		coman.city("Carambolas", ele.getCity());

	}

	@When("seleciono a ocupacao atual")
	public void seleciono_a_ocupacao_atual() {

		met.clicar(ele.getOcuppation());

	}

	@When("seleciono o Hobbies")
	public void seleciono_o_hobbies() {

		met.clicar(ele.hobbies());

	}

	@When("digito o site")
	public void digito_o_site() {

		coman.web("www.ricardodanilo.com.br", ele.getWebSite());

	}

	@When("clico em proximo2")
	public void clico_em_proximo2() {

		met.clicar(ele.clicarProximo());

	}

	@When("digito a data de inicio")
	public void digito_a_data_de_inicio() {

		coman.startDate("04/06/2023", ele.getStrtDate());

	}

	@When("informo a soma do seguro")
	public void informo_a_soma_do_seguro() {

		coman.insurance("3.000.000.00", ele.getSumi());

	}

	@When("realizo avaliacao de merito")
	public void realizo_avaliacao_de_merito() {

		met.clicar(ele.getMerit());
	}

	@When("seleciono seguro de danos")
	public void seleciono_seguro_de_danos() {

		met.clicar(ele.getDem());
		
	}

	@When("seleciono produto desejado")
	public void seleciono_produto_desejado() {
		
		met.clicar(ele.getProduto());

	}

	@When("Seleciono cortesia")
	public void seleciono_cortesia() {

		met.clicar(ele.getCortesia());

	}

	@Then("clico em proximo3")
	public void clico_em_proximo3() {

		met.clicar(ele.prox);

	}

	@When("seleciono o plano desejado")
	public void seleciono_o_plano_desejado() {

		met.clicar(ele.Ouro());

	}

	@When("clico em proximo4")
	public void clico_em_proximo4() {

		met.clicar(ele.sendQuote);

	}

	@When("digito o email")
	public void digito_o_email() {
		
		coman.email("daniel_figueiredo@tglaw.com.br", ele.getemal());

	}

	@When("digito o celular")
	public void digito_o_celular() {
		
		coman.phone("11981715491", ele.getCel());


	}

	@When("digito o usuario")
	public void digito_o_usuario() {
		
		coman.user("daniel.123", ele.getUser());	
		
	}

	@When("digito a senha")
	public void digito_a_senha() {

		coman.Senha("u;p@G$7coi", ele.getSenha());

	}

	@When("confirmo a senha")
	public void confirmo_a_senha() {

		coman.confirm("u;p@G$7coi", ele.getConfPass());

	}

	@Then("clico em mandar")
	public void clico_em_mandar() {
		
		met.clicar(ele.finalizado);
		
	   // met.fecharNav();	
	 
	}

}
