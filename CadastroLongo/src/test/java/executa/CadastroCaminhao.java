package executa;

import drivers.DriverConect;
import elementos.PageCaminhao;
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
	public void realizar_cadastro_caminhao() throws InterruptedException {

		Metodos.clicar(PageCaminhao.MarcaCaminhao);
		Metodos.escreverCmEspera(PageCaminhao.Desemp, "263");
		Metodos.escrever(PageCaminhao.caFab, "12/03/2020");
		Metodos.clicar(PageCaminhao.caminAss);
		Metodos.clicar(PageCaminhao.camComb);
		Metodos.escreverCmEspera(PageCaminhao.CamCarg, "1000");
		Metodos.escrever(PageCaminhao.CamPeso, "23000");
		Metodos.escrever(PageCaminhao.precoCam, "100000");
		Metodos.escrever(PageCaminhao.numPlaca, "NEV-8210");
		Metodos.escrever(PageCaminhao.CamKM, "81450");
		Metodos.clicar(PageCaminhao.next1);
		Metodos.escrever(PageCaminhao.nomeCam, "Deverio");
		Metodos.escrever(PageCaminhao.sobreName, "Cardoso");
		Metodos.escrever(PageCaminhao.dataNasciCam, "11/04/1993");
		Metodos.clicar(PageCaminhao.generoCAM);
		Metodos.escrever(PageCaminhao.endCam, "Rua Belchior Chavão Neto");
		Metodos.clicar(PageCaminhao.paisCam);
		Metodos.escrever(PageCaminhao.CodPost, "3893850");
		Metodos.escrever(PageCaminhao.cityCam, "Sorocaba");
		Metodos.clicar(PageCaminhao.OcupCam);
		Metodos.clicar(PageCaminhao.hobCamExcesso);
		Metodos.clicar(PageCaminhao.hobCamParaquedismo);
        Metodos.escreverCmEspera(PageCaminhao.SiteCam, "www.deveriocardoso.com.br");
        Metodos.clicar(PageCaminhao.abrirImagem);
        Thread.sleep(2000);
        Metodos.uploadFile("C:\\Users\\igorr\\OneDrive\\Documents\\CNH2\\cnh2", 0);
		Metodos.clicar(PageCaminhao.next2);
		Metodos.escreverCmEspera(PageCaminhao.DataCamincio, "07/15/2023");
		Metodos.clicar(PageCaminhao.ValorseguroCAM);
		Metodos.clicar(PageCaminhao.seguroDanosCAM);
		Metodos.clicar(PageCaminhao.opcaoProdCam);
		Metodos.clicar(PageCaminhao.next3Cam);
		Metodos.clicar(PageCaminhao.platinumCami);
		Metodos.clicarCmEspera(PageCaminhao.next4);
		Metodos.escrever(PageCaminhao.emailCaminhao, "siberiochavao@gmail.com");
		Metodos.escrever(PageCaminhao.phoneCamin, "11954239467");
		Metodos.escrever(PageCaminhao.userSib, "siberioChavao");
		Metodos.escrever(PageCaminhao.passCamin, "Sib@123456!A");
		Metodos.escrever(PageCaminhao.confirPassCamin, "Sib@123456!A");

	}

	@Then("finallizar cadastro caminhao")
	public void finallizar_cadastro_caminhao() {

		Metodos.clicar(PageCaminhao.next5);
	    Metodos.validaTexto(PageCaminhao.resultName, "Sending e-mail success!");
	    Metodos.clicarCmEspera(PageCaminhao.finalizar);

	}
}