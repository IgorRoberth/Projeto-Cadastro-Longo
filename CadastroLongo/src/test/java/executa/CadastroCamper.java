package executa;

import java.awt.AWTException;

import drivers.DriverConect;
import elementos.PageCamper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class CadastroCamper extends DriverConect {

	Metodos mtd = new Metodos();

	@Given("que entre no site para cadastrar camper")
	public void que_entre_no_site_para_cadastrar_camper() {

	}

	@Given("clico em seguro campista")
	public void clico_em_seguro_campista() throws AWTException {

	 // mtd.scroll();
	 //	mtd.ClickRobot(390, 90);
	    mtd.clicarCmEspera(PageCamper.clickCamper);

	}

	@When("realizo o cadastro")
	public void realizo_o_cadastro() {

		mtd.clicarCmEspera(PageCamper.modeloCamper);
		mtd.escrever("248", PageCamper.performCarCamper);
		mtd.escrever("05/23/2019", PageCamper.dataFabCamper);
		mtd.clicar(PageCamper.AssCamper);
		mtd.clicar(PageCamper.ladoVolantCamp);
		mtd.clicar(PageCamper.tipCombCamper);
		mtd.escrever("650", PageCamper.cargUtCamper);
		mtd.escrever("1560", PageCamper.totalveicCamper);
		mtd.escrever("12737", PageCamper.precoTabCamper);
		mtd.escrever("40393902", PageCamper.numPlacaCamper);
		mtd.escrever("34230", PageCamper.anualKmCamper);
		mtd.clicar(PageCamper.proxCamper1);
		mtd.escrever("Roberto", PageCamper.primNomeCamper);
		mtd.escrever("Abilio", PageCamper.nameSobreCamper);
		mtd.escrever("07/12/1996", PageCamper.dateCamperOf);
		mtd.clicar(PageCamper.MachoCamper);
		mtd.escrever("Rua Beduino Valquirio Neto", PageCamper.endrecoCamper);
		mtd.clicar(PageCamper.nacioCamper);
		mtd.escrever("4392012", PageCamper.zipCodCamper);
		mtd.escrever("La bem longe ", PageCamper.CidCamper);
		mtd.clicar(PageCamper.ocupCamper);
		mtd.clicar(PageCamper.HobbCamper);
		mtd.escrever("www.fhdjs.com.br", PageCamper.redeInterCamper);
		mtd.clicar(PageCamper.proxiCamper2);
		mtd.escrever("05/20/2023", PageCamper.inicSegCamper);
		mtd.clicar(PageCamper.somaSegCamp);
		mtd.clicar(PageCamper.segDanosCamper);
		mtd.clicar(PageCamper.prodOpcCamper);
		mtd.clicar(PageCamper.proxCamper3);
		mtd.clicar(PageCamper.priceOption);
		mtd.clicarCmEspera(PageCamper.nextcamper4);
		mtd.escrever("abiliorob@gmail.com", PageCamper.emailCamper);
		mtd.escrever("11983928393", PageCamper.phoneCamper);
		mtd.escrever("robuser21", PageCamper.userNameCamper);
		mtd.escrever("Sl2394@3", PageCamper.passCamp);
		mtd.escrever("Sl2394@3", PageCamper.confPass);

	}

	@Then("finalizo o cadastro")
	public void finalizo_o_cadastro() throws AWTException, InterruptedException {

		mtd.clicarCmEspera(PageCamper.sendEmail);
		mtd.validaTexto(PageCamper.resultNameCamper, "Sending e-mail success!");

	}
}