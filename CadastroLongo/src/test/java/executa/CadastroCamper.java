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
		mtd.escrever(PageCamper.performCarCamper, "248");
		mtd.escrever(PageCamper.dataFabCamper, "05/23/2019");
		mtd.clicar(PageCamper.AssCamper);
		mtd.clicar(PageCamper.ladoVolantCamp);
		mtd.clicar(PageCamper.tipCombCamper);
		mtd.escrever(PageCamper.cargUtCamper, "650");
		mtd.escrever(PageCamper.totalveicCamper, "1560");
		mtd.escrever(PageCamper.precoTabCamper, "12737");
		mtd.escrever(PageCamper.numPlacaCamper, "40393902");
		mtd.escrever(PageCamper.anualKmCamper, "34230");
		mtd.clicar(PageCamper.proxCamper1);
		mtd.escrever(PageCamper.primNomeCamper, "Roberto");
		mtd.escrever(PageCamper.nameSobreCamper, "Abilio");
		mtd.escrever(PageCamper.dateCamperOf, "07/12/1996");
		mtd.clicar(PageCamper.MachoCamper);
		mtd.escrever(PageCamper.endrecoCamper, "Rua Beduino Valquirio Neto");
		mtd.clicar(PageCamper.nacioCamper);
		mtd.escrever(PageCamper.zipCodCamper, "4392012");
		mtd.escrever(PageCamper.CidCamper, "La bem longe ");
		mtd.clicar(PageCamper.ocupCamper);
		mtd.clicar(PageCamper.HobbCamper);
		mtd.escrever(PageCamper.redeInterCamper, "www.fhdjs.com.br");
		mtd.clicar(PageCamper.proxiCamper2);
		mtd.escrever(PageCamper.inicSegCamper, "05/20/2023");
		mtd.clicar(PageCamper.somaSegCamp);
		mtd.clicar(PageCamper.segDanosCamper);
		mtd.clicar(PageCamper.prodOpcCamper);
		mtd.clicar(PageCamper.proxCamper3);
		mtd.clicar(PageCamper.priceOption);
		mtd.clicarCmEspera(PageCamper.nextcamper4);
		mtd.escrever(PageCamper.emailCamper, "abiliorob@gmail.com");
		mtd.escrever(PageCamper.phoneCamper, "11983928393");
		mtd.escrever(PageCamper.userNameCamper, "robuser21");
		mtd.escrever(PageCamper.passCamp, "Sl2394@3");
		mtd.escrever(PageCamper.confPass, "Sl2394@3");

	}

	@Then("finalizo o cadastro")
	public void finalizo_o_cadastro() throws AWTException, InterruptedException {

		mtd.clicarCmEspera(PageCamper.sendEmail);
		mtd.validaTexto(PageCamper.resultNameCamper, "Sending e-mail success!");

	}
}