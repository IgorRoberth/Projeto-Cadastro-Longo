package executa;

import browsers.Browsers;
import drivers.DriverConect;
import elementos.PageCaminhao;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class CadastroCaminhao extends DriverConect {

	Metodos Metodos = new Metodos();

	@Given("que entre no site para cadastrar caminhao")
	public void que_entre_no_site_para_cadastrar_caminhao() {

	}

	@Given("clicar em truck")
	public void clicar_em_truck() {

		Metodos.clicar(PageCaminhao.truck);

	}

	@When("realizar cadastro caminhao")
	public void realizar_cadastro_caminhao() {

		Metodos.clicar(PageCaminhao.MarcaCaminhao);
		Metodos.escreverCmEspera("263", PageCaminhao.Desemp);
		Metodos.escrever("12/03/2020", PageCaminhao.caFab);
		Metodos.clicar(PageCaminhao.caminAss);
		Metodos.clicar(PageCaminhao.camComb);
		Metodos.escreverCmEspera("1000", PageCaminhao.CamCarg);
		Metodos.escrever("23000", PageCaminhao.CamPeso);
		Metodos.escrever("100000", PageCaminhao.precoCam);
		Metodos.escrever("NEV-8210", PageCaminhao.numPlaca);
		Metodos.escrever("81450", PageCaminhao.CamKM);
		Metodos.clicar(PageCaminhao.next1);
		Metodos.escrever("Deverio", PageCaminhao.nomeCam);
		Metodos.escrever("Cardoso", PageCaminhao.sobreName);
		Metodos.escrever("11/04/1993", PageCaminhao.dataNasciCam);
		Metodos.clicar(PageCaminhao.generoCAM);
		Metodos.escrever("Rua Belchior Chavão Neto", PageCaminhao.endCam);
		Metodos.clicar(PageCaminhao.paisCam);
		Metodos.escrever("3893850", PageCaminhao.CodPost);
		Metodos.escrever("Sorocaba", PageCaminhao.cityCam);
		Metodos.clicar(PageCaminhao.OcupCam);
		Metodos.clicar(PageCaminhao.hobCamExcesso);
		Metodos.clicar(PageCaminhao.hobCamParaquedismo);
		Metodos.escreverCmEspera("www.deveriocardoso.com.br", PageCaminhao.SiteCam);
		Metodos.clicar(PageCaminhao.next2);
		Metodos.escreverCmEspera("07/15/2023", PageCaminhao.DataCamincio);
		Metodos.clicar(PageCaminhao.ValorseguroCAM);
		Metodos.clicar(PageCaminhao.seguroDanosCAM);
		Metodos.clicar(PageCaminhao.opcaoProdCam);
		Metodos.clicar(PageCaminhao.next3Cam);
		Metodos.clicar(PageCaminhao.platinumCami);
		Metodos.clicarCmEspera(PageCaminhao.next4);
		Metodos.escrever("siberiochavao@gmail.com", PageCaminhao.emailCaminhao);
		Metodos.escrever("11954239467", PageCaminhao.phoneCamin);
		Metodos.escrever("siberioChavao", PageCaminhao.userSib);
		Metodos.escrever("Sib@123456!A", PageCaminhao.passCamin);
		Metodos.escrever("Sib@123456!A", PageCaminhao.confirPassCamin);

	}

	@Then("finallizar cadastro caminhao")
	public void finallizar_cadastro_caminhao() {

		Metodos.clicar(PageCaminhao.next5);
	    Metodos.validaTexto(PageCaminhao.resultName, "Sending e-mail success!");
	    Metodos.clicarCmEspera(PageCaminhao.finalizar);

	}
}