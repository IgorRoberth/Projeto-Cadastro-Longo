package executa;

import browsers.Browsers;
import elementos.PageCarro;
import elementos.PageMotocicleta;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class CadastroMotocicleta extends Browsers {

	Metodos metd = new Metodos();

	@Given("que entre no site para cadastrar moto")
	public void que_entre_no_site_para_cadastrar_moto() {

	}

	@Given("clicar em motorcycle")
	public void clicar_em_motorcycle() {
		
		metd.clicar(PageMotocicleta.motocicleta);

	}

	@When("executar cadastro")
	public void executar_cadastro() {

		metd.clicar(PageMotocicleta.marcaMoto);
		metd.clicarCmEspera(PageMotocicleta.modeloMoto);
		metd.escrever(PageMotocicleta.cilindroMoto, "200");
		metd.escrever(PageMotocicleta.desempMoto, "48");
		metd.escrever(PageMotocicleta.dataFabricacaoMoto, "11/12/2020");
		metd.clicar(PageMotocicleta.assentMoto);
		metd.escrever(PageMotocicleta.precoMoto, "15250");
		metd.escrever(PageMotocicleta.kmAnualMoto, "34567");
		metd.clicar(PageMotocicleta.proxMoto1);
		metd.escrever(PageMotocicleta.nomeCliMoto, "Julio");
		metd.escrever(PageMotocicleta.sobreNomeCliMoto, "Clovis");
		metd.escrever(PageMotocicleta.dataDNascMoto, "04/22/1995");
		metd.clicar(PageMotocicleta.generoMoto);
		metd.escrever(PageMotocicleta.endCliMoto, "Rua Brenario Silveira Breca");
		metd.clicar(PageMotocicleta.nacioMoto);
		metd.escrever(PageMotocicleta.cepCliMoto, "329103");
		metd.escrever(PageMotocicleta.cityMoto, "Lalonge");
		metd.clicar(PageMotocicleta.ocupaMoto);
		metd.clicar(PageMotocicleta.HobbMoto);
		metd.escrever(PageMotocicleta.webSiMoto, "www.julioclovis.com.br");
		metd.clicar(PageMotocicleta.clicaMotoProx2);
		metd.escrever(PageMotocicleta.dataInicioMoto, "12/05/2023");
		metd.clicar(PageMotocicleta.somaSegMoto);
		metd.clicar(PageMotocicleta.segdeMoto);
		metd.clicar(PageMotocicleta.opcaoProdMoto);
		metd.clicar(PageMotocicleta.clicarMotoProx3);
		metd.clicar(PageMotocicleta.escolhePlanoMoto);
		metd.clicarCmEspera(PageMotocicleta.ProxiMoto4);
		metd.escrever(PageMotocicleta.emailMoto, "julioclovis@gmail.com");
		metd.escrever(PageMotocicleta.celularMoto, "11956873456");
		metd.escrever(PageMotocicleta.userMoto, "julio145");
		metd.escrever(PageMotocicleta.passMoto, "Fgp3214@f");
		metd.escrever(PageMotocicleta.confirmMoto, "Fgp3214@f");
	}

	@Then("confirmar cadastro")
	public void confirmar_cadastro() {

		metd.clicar(PageMotocicleta.proxMoto5);
		metd.validaTexto(PageMotocicleta.resultadoMoto, "Sending e-mail success!");
		metd.clicar(PageMotocicleta.okMoto);

	}
}