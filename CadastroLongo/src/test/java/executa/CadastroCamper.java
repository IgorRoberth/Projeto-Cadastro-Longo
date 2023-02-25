package executa;

import browsers.Browsers;
import comando.Comandos;
import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class CadastroCamper extends Browsers{
	
	Elementos elem = new Elementos();
	Comandos cmd = new Comandos();
	Metodos mtd = new Metodos();

	@Given("que entre no site para cadastrar camper")
	public void que_entre_no_site_para_cadastrar_camper() {

		
	}
	@Given("clico em seguro campista")
	public void clico_em_seguro_campista() {

		mtd.clicar(elem.clicarCamper);

	}
	@When("realizo o cadastro")
	public void realizo_o_cadastro() {

		mtd.clicar(elem.marcaVeiculo);
		cmd.escrPerforCarcamper("248", elem.performCarCamper);
		cmd.escrever("05/23/2019", elem.dataFabCamper);
		mtd.clicar(elem.AssCamper);
		mtd.clicar(elem.ladoVolantCamp);
		mtd.clicar(elem.tipCombCamper);
		cmd.escrever("650", elem.cargUtCamper);
		cmd.escrever("1560", elem.totalveicCamper);
		cmd.escrever("12737", elem.precoTabCamper);
        cmd.escrever("40393902", elem.numPlacaCamper);
        cmd.escrever("34230", elem.anualKmCamper);
		mtd.clicar(elem.proxCamper1);
        cmd.escrever("Roberto", elem.primNomeCamper);
		cmd.escrever("Abilio", elem.nameSobreCamper);
		cmd.escrever("07/12/1996", elem.dateCamperOf);
		mtd.clicar(elem.MachoCamper);
		cmd.escrever("Rua Beduino Valquirio Neto", elem.endrecoCamper);		
	    mtd.clicar(elem.nacioCamper);
		cmd.escrever("4392012", elem.zipCodCamper);
        cmd.escrever("La bem longe ", elem.CidCamper);
        mtd.clicar(elem.ocupCamper);
		mtd.clicar(elem.HobbCamper);
		cmd.escrever("www.fhdjs.com.br", elem.redeInterCamper);
		mtd.clicar(elem.proxiCamper2);
		cmd.escrever("05/20/2023", elem.inicSegCamper);
		mtd.clicar(elem.somaSegCamp);
		mtd.clicar(elem.segDanosCamper);
        mtd.clicar(elem.prodOpcCamper);
		mtd.clicar(elem.proxCamper3);
	    mtd.clicar(elem.priceOption);
		cmd.clicarOkCamper4(elem.nextcamper4);
        cmd.escrever("abiliorob@gmail.com", elem.emailCamper);
        cmd.escrever("11983928393", elem.phoneCamper);
        cmd.escrever("robuser21", elem.userNameCamper);
        cmd.escrever("Sl2394@3", elem.passCamp);
        cmd.confPassCamper("Sl2394@3", elem.confPass);

	}
	@Then("finalizo o cadastro")
	public void finalizo_o_cadastro() {

		 mtd.clicar(elem.finalizaCamper);
		 cmd.clicarOkCamper(elem.clickOkCamper);

	}

}
