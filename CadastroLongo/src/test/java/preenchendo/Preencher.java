package preenchendo;

import org.junit.Test;
import elementos.PageCaminhao;
import elementos.PageCamper;
import elementos.PageCarro;
import elementos.PageMotocicleta;
import metodos.Metodos;

public class Preencher {

	@Test
	public static void preencherCarro() {

		Metodos.clicar(PageCarro.selecionarCarro);
		Metodos.escreverCmEspera(PageCarro.performance, "200");
		Metodos.escrever(PageCarro.date, "01/01/2022");
		Metodos.clicar(PageCarro.assentos);
		Metodos.clicar(PageCarro.type);
		Metodos.escrever(PageCarro.list, "55000");
		Metodos.escrever(PageCarro.placa, "GFP1029");
		Metodos.escrever(PageCarro.kmAnual, "25000");
		Metodos.clicar(PageCarro.next);
		Metodos.escrever(PageCarro.firstname, "Elisio");
		Metodos.escrever(PageCarro.lastN, "Braga");
		Metodos.escrever(PageCarro.dataNas, "02/03/1989");
		Metodos.clicar(PageCarro.macho);
		Metodos.escrever(PageCarro.ende, "Jardim Santa Rosa");
		Metodos.clicar(PageCarro.nacionalidade);
		Metodos.escrever(PageCarro.cep, "14808192");
		Metodos.escrever(PageCarro.city, "Carambolas");
		Metodos.clicar(PageCarro.occupation);
		Metodos.clicar(PageCarro.Hobbies);
		Metodos.escrever(PageCarro.webSite, "www.ricardodanilo.com.br");
		Metodos.clicar(PageCarro.clicarProximo);
		Metodos.escrever(PageCarro.startDate, "05/18/2023");
		Metodos.escrever(PageCarro.Sum, "3.000.000,00");
		Metodos.clicar(PageCarro.merito);
		Metodos.clicar(PageCarro.damange);
		Metodos.clicar(PageCarro.opcaoProd);
		Metodos.clicar(PageCarro.cortesy);
		Metodos.clicar(PageCarro.prox);
		Metodos.clicar(PageCarro.gold);
		Metodos.clicar(PageCarro.sendQuote);
		Metodos.escrever(PageCarro.email, "daniel_figueiredo@tglaw.com.br");
		Metodos.escrever(PageCarro.cel, "11981715491");
		Metodos.escrever(PageCarro.userName, "daniel.123");
		Metodos.escrever(PageCarro.pass, "u;p@G$7coi");
		Metodos.escrever(PageCarro.confirmPass, "u;p@G$7coi");

	}

	public static void finalizarCarro() {

		Metodos.clicar(PageCarro.finalizado);
		Metodos.validaTexto(PageCarro.validarMsg, "Sending e-mail success!");
		Metodos.clicarCmEspera(PageCarro.okCarro);
	}

	public static void preencherCaminhão() {

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

	public static void finalizarCaminhao() {

		Metodos.clicar(PageCaminhao.next5);
		Metodos.validaTexto(PageCaminhao.resultName, "Sending e-mail success!");
		Metodos.clicarCmEspera(PageCaminhao.finalizar);

	}

	public static void preencherMoto() {

		Metodos.clicar(PageMotocicleta.marcaMoto);
		Metodos.clicarCmEspera(PageMotocicleta.modeloMoto);
		Metodos.escrever(PageMotocicleta.cilindroMoto, "200");
		Metodos.escrever(PageMotocicleta.desempMoto, "48");
		Metodos.escrever(PageMotocicleta.dataFabricacaoMoto, "11/12/2020");
		Metodos.clicar(PageMotocicleta.assentMoto);
		Metodos.escrever(PageMotocicleta.precoMoto, "15250");
		Metodos.escrever(PageMotocicleta.kmAnualMoto, "34567");
		Metodos.clicar(PageMotocicleta.proxMoto1);
		Metodos.escrever(PageMotocicleta.nomeCliMoto, "Julio");
		Metodos.escrever(PageMotocicleta.sobreNomeCliMoto, "Clovis");
		Metodos.escrever(PageMotocicleta.dataDNascMoto, "04/22/1995");
		Metodos.clicar(PageMotocicleta.generoMoto);
		Metodos.escrever(PageMotocicleta.endCliMoto, "Rua Brenario Silveira Breca");
		Metodos.clicar(PageMotocicleta.nacioMoto);
		Metodos.escrever(PageMotocicleta.cepCliMoto, "329103");
		Metodos.escrever(PageMotocicleta.cityMoto, "Lalonge");
		Metodos.clicar(PageMotocicleta.ocupaMoto);
		Metodos.clicar(PageMotocicleta.HobbMoto);
		Metodos.escrever(PageMotocicleta.webSiMoto, "www.julioclovis.com.br");
		Metodos.clicar(PageMotocicleta.clicaMotoProx2);
		Metodos.escrever(PageMotocicleta.dataInicioMoto, "12/05/2023");
		Metodos.clicar(PageMotocicleta.somaSegMoto);
		Metodos.clicar(PageMotocicleta.segdeMoto);
		Metodos.clicar(PageMotocicleta.opcaoProdMoto);
		Metodos.clicar(PageMotocicleta.clicarMotoProx3);
		Metodos.clicar(PageMotocicleta.escolhePlanoMoto);
		Metodos.clicarCmEspera(PageMotocicleta.ProxiMoto4);
		Metodos.escrever(PageMotocicleta.emailMoto, "julioclovis@gmail.com");
		Metodos.escrever(PageMotocicleta.celularMoto, "11956873456");
		Metodos.escrever(PageMotocicleta.userMoto, "julio145");
		Metodos.escrever(PageMotocicleta.passMoto, "Fgp3214@f");
		Metodos.escrever(PageMotocicleta.confirmMoto, "Fgp3214@f");

	}

	public static void finalizarMoto() {

		Metodos.clicar(PageMotocicleta.proxMoto5);
		Metodos.validaTexto(PageMotocicleta.resultadoMoto, "Sending e-mail success!");
		Metodos.clicar(PageMotocicleta.okMoto);

	}

	public static void preencherCamper() {

		Metodos.clicarCmEspera(PageCamper.clickCamper);
		Metodos.clicarCmEspera(PageCamper.modeloCamper);
		Metodos.escrever(PageCamper.performCarCamper, "248");
		Metodos.escrever(PageCamper.dataFabCamper, "05/23/2019");
		Metodos.clicar(PageCamper.AssCamper);
		Metodos.clicar(PageCamper.ladoVolantCamp);
		Metodos.clicar(PageCamper.tipCombCamper);
		Metodos.escrever(PageCamper.cargUtCamper, "650");
		Metodos.escrever(PageCamper.totalveicCamper, "1560");
		Metodos.escrever(PageCamper.precoTabCamper, "12737");
		Metodos.escrever(PageCamper.numPlacaCamper, "40393902");
		Metodos.escrever(PageCamper.anualKmCamper, "34230");
		Metodos.clicar(PageCamper.proxCamper1);
		Metodos.escrever(PageCamper.primNomeCamper, "Roberto");
		Metodos.escrever(PageCamper.nameSobreCamper, "Abilio");
		Metodos.escrever(PageCamper.dateCamperOf, "07/12/1996");
		Metodos.clicar(PageCamper.MachoCamper);
		Metodos.escrever(PageCamper.endrecoCamper, "Rua Beduino Valquirio Neto");
		Metodos.clicar(PageCamper.nacioCamper);
		Metodos.escrever(PageCamper.zipCodCamper, "4392012");
		Metodos.escrever(PageCamper.CidCamper, "La bem longe ");
		Metodos.clicar(PageCamper.ocupCamper);
		Metodos.clicar(PageCamper.HobbCamper);
		Metodos.escrever(PageCamper.redeInterCamper, "www.fhdjs.com.br");
		Metodos.clicar(PageCamper.proxiCamper2);
		Metodos.escrever(PageCamper.inicSegCamper, "05/20/2023");
		Metodos.clicar(PageCamper.somaSegCamp);
		Metodos.clicar(PageCamper.segDanosCamper);
		Metodos.clicar(PageCamper.prodOpcCamper);
		Metodos.clicar(PageCamper.proxCamper3);
		Metodos.clicar(PageCamper.priceOption);
		Metodos.clicarCmEspera(PageCamper.nextcamper4);
		Metodos.escrever(PageCamper.emailCamper, "abiliorob@gmail.com");
		Metodos.escrever(PageCamper.phoneCamper, "11983928393");
		Metodos.escrever(PageCamper.userNameCamper, "robuser21");
		Metodos.escrever(PageCamper.passCamp, "Sl2394@3");
		Metodos.escrever(PageCamper.confPass, "Sl2394@3");

	}
	
	public static void finalizarCamper() {

		Metodos.clicarCmEspera(PageCamper.sendEmail);
		Metodos.validaTexto(PageCamper.resultNameCamper, "Sending e-mail success!");
		Metodos.clicarCmEspera(PageCamper.camperFim);

	}
}