package executa;

import browsers.Browsers;
import comando.Comandos;
import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class CadastroCaminhao extends Browsers {

	Elementos el = new Elementos();
	Comandos mandos = new Comandos();
	Metodos metodos = new Metodos();

	@Before
	public void inicioTeste() {

		Browsers.abrirNavegador();
	}

	@After
	public void finalizandoTeste() {

	//	Browsers.fecharNavegador();

	}

	@Given("que entre no site para cadastrar caminhao")
	public void que_entre_no_site_para_cadastrar_caminhao() {

	}

	@Given("clicar em truck")
	public void clicar_em_truck() {

		metodos.clicar(el.truck);

	}

	@When("realizar cadastro caminhao")
	public void realizar_cadastro_caminhao() {

		metodos.clicar(el.Marca);
		mandos.desempenho("263", el.Desemp);
		mandos.escrever("12/03/2020", el.caFab);
		metodos.clicar(el.caminAss);
		metodos.clicar(el.camComb);
		mandos.escrever("1000", el.CamCarg);
		mandos.escrever("23000", el.CamPeso);
		mandos.escrever("100000", el.precoCam);
		mandos.escrever("NEV-8210", el.numPlaca);
		mandos.escrever("81450", el.CamKM);
		metodos.clicar(el.next1);
		mandos.escrever("Deverio", el.nomeCam);
		mandos.escrever("Cardoso", el.sobreName);
		mandos.escrever("11/04/1993", el.dataNasciCam);
		metodos.clicar(el.generoCAM);
		mandos.escrever("Rua Belchior Chavão Neto", el.endCam);
		metodos.clicar(el.paisCam);
		mandos.escrever("3893850", el.CodPost);
		mandos.escrever("Sorocaba", el.cityCam);
		metodos.clicar(el.OcupCam);
		metodos.clicar(el.hobCamExcesso);
		metodos.clicar(el.hobCamParaquedismo);
		mandos.escrever("www.deveriocardoso.com.br", el.SiteCam);
		metodos.clicar(el.next2);
		mandos.escrever("04/15/2023", el.DataCamincio);
		metodos.clicar(el.ValorseguroCAM);
		metodos.clicar(el.seguroDanosCAM);
		metodos.clicar(el.opcaoProdCam);
		metodos.clicar(el.next3Cam);
		metodos.clicar(el.platinumCami);
		mandos.next4Cli(el.next4);
		mandos.escrever("siberiochavao@gmail.com", el.emailCaminhao);
		mandos.escrever("11954239467", el.phoneCamin);
		mandos.escrever("siberioChavao", el.userSib);
		mandos.escrever("Sib@123456!A", el.passCamin);
		mandos.escrever("Sib@123456!A", el.confirPassCamin);

	}

	@Then("finallizar cadastro caminhao")
	public void finallizar_cadastro_caminhao() {

		metodos.clicar(el.next5);
		mandos.validaTexto(el.resultName, "Sending e-mail success!");
		mandos.clicarOkCaminhao(el.clicarOkCaminhao);
	}
}