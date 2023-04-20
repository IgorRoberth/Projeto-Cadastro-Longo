package preenchendo;

import org.junit.Test;
import elementos.PageCadastro;
import elementos.PageCadastro.DadosPessoais;
import elementos.PageCadastro.DadosSeguro;
import elementos.PageCadastro.DadosUsuario;
import elementos.PageCadastro.DadosVeiculos;
import elementos.PageCadastro.HomePage;
import elementos.PageCadastro.PlanosSeguros;
import elementos.PageCadastro.Produtos;
import elementos.PageCadastro.SeguroDanos;
import elementos.PageCadastro.VeiculosSelecionados;
import elementos.PageCaminhao;
import elementos.PageCamper;
import elementos.PageCarro;
import elementos.PageMotocicleta;
import metodos.Metodos;

public class Preencher {

	@Test
	public static void preencherCarro() {

		Metodos.clicar(VeiculosSelecionados.Carro);
	        Metodos.escrever(DadosVeiculos.performance, "200");
		Metodos.escrever(DadosVeiculos.dataFab, "01/01/2022");
		Metodos.clicar(PageCadastro.Assentos.car);
		Metodos.clicar(DadosVeiculos.combust);
		Metodos.escrever(DadosVeiculos.prcTable, "55000");
		Metodos.escrever(DadosVeiculos.nPlaca, "GFP1029");
	        Metodos.escrever(DadosVeiculos.kmAnual, "25000");
 		Metodos.clicar(DadosVeiculos.next);
	}

	public static void preencherDadosPessoaisCarro() {

		Metodos.escrever(DadosPessoais.Nome, "Blazer");
		Metodos.escrever(DadosPessoais.SbrNome, "Braga");
		Metodos.escrever(DadosPessoais.DtNasc, "02/03/1989");
		Metodos.clicar(DadosPessoais.Genero);
		Metodos.escrever(DadosPessoais.endRua, "Jardim Santa Rosa");
		Metodos.clicar(DadosPessoais.nacionalidade);
		Metodos.escrever(DadosPessoais.Cep, "14808192");
		Metodos.escrever(DadosPessoais.City, "Carambolas");
		Metodos.clicar(PageCarro.occupation);
		Metodos.clicar(PageCarro.Hobbies);
		Metodos.escrever(DadosPessoais.webSite, "www.ricardodanilo.com.br");
		Metodos.clicar(DadosPessoais.Next);
	}

	public static void dadosSeguroCarro() {

		Metodos.escrever(DadosSeguro.DataInicio, "10/20/2023");
		Metodos.escrever(DadosSeguro.Soma, "3.000.000,00");
		Metodos.clicar(PageCarro.merito);
		Metodos.clicar(SeguroDanos.semCobertura);
		Metodos.clicar(Produtos.LegalProduct);
		Metodos.clicar(DadosSeguro.cortesyNo);
		Metodos.clicar(Produtos.next3);
		Metodos.clicar(PlanosSeguros.Gold);
		Metodos.clicar(Produtos.NextQuote);
	}

	public static void DadosUsuarioCarro() {
		
		Metodos.escrever(DadosUsuario.email, "daniel_figueiredo@tglaw.com.br");
		Metodos.escrever(DadosUsuario.cel, "11981715491");
		Metodos.escrever(DadosUsuario.userName, "daniel.123");
		Metodos.escrever(DadosUsuario.pass, "u;p@G$7coi");
		Metodos.escrever(DadosUsuario.confirmPass, "u;p@G$7coi");
	}

	public static void finalizarCadastroCarro()  {

		Metodos.clicar(DadosUsuario.finalizado);
		Metodos.validaTexto(DadosUsuario.validarMsg, "Sending e-mail success!");
		Metodos.clicar(DadosUsuario.ok);
	}

	public static void preencherCaminhão() {

		Metodos.clicar(VeiculosSelecionados.Caminhao);
		Metodos.escrever(DadosVeiculos.performance, "263");
		Metodos.escrever(DadosVeiculos.dataFab, "12/03/2020");
		Metodos.clicar(PageCadastro.Assentos.caminhao);
		Metodos.clicar(PageCaminhao.camComb);
		Metodos.escrever(DadosVeiculos.CargaUtil, "1000");
		Metodos.escrever(DadosVeiculos.Peso, "23000");
		Metodos.escrever(DadosVeiculos.prcTable, "100000");
		Metodos.escrever(DadosVeiculos.nPlaca, "NEV-8210");
		Metodos.escrever(DadosVeiculos.kmAnual, "81450");
		Metodos.clicar(DadosVeiculos.next);
	}

	public static void DadosPessoaisCaminhao() {

		Metodos.escrever(DadosPessoais.Nome, "Deverio");
		Metodos.escrever(DadosPessoais.SbrNome, "Cardoso");
		Metodos.escrever(DadosPessoais.DtNasc, "11/04/1993");
		Metodos.clicar(DadosPessoais.Genero);
		Metodos.escrever(DadosPessoais.endRua, "Rua Belchior Chavão Neto");
		Metodos.clicar(DadosPessoais.nacionalidade);
		Metodos.escrever(DadosPessoais.Cep, "3893850");
		Metodos.escrever(DadosPessoais.City, "Sorocaba");
		Metodos.clicar(PageCaminhao.OcupCam);
		Metodos.clicar(PageCaminhao.hobCamExcesso);
		Metodos.clicar(PageCaminhao.hobCamParaquedismo);
		Metodos.escrever(DadosPessoais.webSite, "www.deveriocardoso.com.br");
		Metodos.clicar(DadosPessoais.Next);
	}

	public static void dadosSeguroCaminhao() {

		Metodos.escrever(DadosSeguro.DataInicio, "07/15/2023");
		Metodos.clicar(PageCaminhao.ValorseguroCAM);
		Metodos.clicar(SeguroDanos.cbTotal);
		Metodos.clicar(Produtos.EuroProduct);
		Metodos.clicar(Produtos.next3);
		Metodos.clicar(PlanosSeguros.Platinum);
		Metodos.clicar(Produtos.NextQuote);
	}

	public static void DadosUsuarioCaminhao() {

		Metodos.escrever(DadosUsuario.email, "siberiochavao@gmail.com");
		Metodos.escrever(DadosUsuario.cel, "11954239467");
		Metodos.escrever(DadosUsuario.userName, "siberioChavao");
		Metodos.escrever(DadosUsuario.pass, "Sib@123456!A");
		Metodos.escrever(DadosUsuario.confirmPass, "Sib@123456!A");

	}

	public static void finalizarCadastroCaminhao() {

		Metodos.clicar(DadosUsuario.finalizado);
		Metodos.validaTexto(DadosUsuario.validarMsg, "Sending e-mail success!");
		Metodos.clicar(DadosUsuario.ok);

	}

	public static void preencherMoto() {

		Metodos.clicar(VeiculosSelecionados.Moto);
		Metodos.clicar(VeiculosSelecionados.modeloMt);
		Metodos.escrever(PageMotocicleta.cilindroMoto, "200");
		Metodos.escrever(DadosVeiculos.performance, "48");
		Metodos.escrever(DadosVeiculos.dataFab, "11/12/2020");
		Metodos.clicar(PageCadastro.Assentos.moto);
		Metodos.escrever(DadosVeiculos.prcTable, "15250");
		Metodos.escrever(DadosVeiculos.kmAnual, "34567");
		Metodos.clicar(DadosVeiculos.next);

	}

	public static void DadosPessoaisMoto() {

		Metodos.escrever(DadosPessoais.Nome, "Julio");
		Metodos.escrever(DadosPessoais.SbrNome, "Clovis");
		Metodos.escrever(DadosPessoais.DtNasc, "04/22/1995");
		Metodos.clicar(DadosPessoais.Genero);
		Metodos.escrever(DadosPessoais.endRua, "Rua Brenario Silveira Breca");
		Metodos.clicar(DadosPessoais.nacionalidade);
		Metodos.escrever(DadosPessoais.Cep, "329103");
		Metodos.escrever(DadosPessoais.City, "Lalonge");
		Metodos.clicar(PageMotocicleta.ocupaMoto);
		Metodos.clicar(PageMotocicleta.HobbMoto);
		Metodos.escrever(DadosPessoais.webSite, "www.julioclovis.com.br");
		Metodos.clicar(DadosPessoais.Next);
	}

	public static void dadosSeguroMoto() {
		
		Metodos.escrever(DadosSeguro.DataInicio, "12/05/2023");
		Metodos.clicar(PageMotocicleta.somaSegMoto);
		Metodos.clicar(SeguroDanos.cbParcial);
		Metodos.clicar(Produtos.LegalProduct);
		Metodos.clicar(Produtos.next3);
		Metodos.clicar(PlanosSeguros.Silver);
		Metodos.clicar(Produtos.NextQuote);
	}

	public static void DadosUsuarioMoto() {
		
		Metodos.escrever(DadosUsuario.email, "julioclovis@gmail.com");
		Metodos.escrever(DadosUsuario.cel, "11956873456");
		Metodos.escrever(DadosUsuario.userName, "julio145");
		Metodos.escrever(DadosUsuario.pass, "Fgp3214@f");
		Metodos.escrever(DadosUsuario.confirmPass, "Fgp3214@f");

	}

	public static void finalizarMoto() {

		Metodos.clicar(DadosUsuario.finalizado);
		Metodos.validaTexto(DadosUsuario.validarMsg, "Sending e-mail success!");
		Metodos.clicar(DadosUsuario.ok);

	}

	public static void preencherCamper() {
		
		Metodos.clicar(VeiculosSelecionados.modeloCamper);
		Metodos.escrever(DadosVeiculos.performance, "248");
		Metodos.escrever(DadosVeiculos.dataFab, "05/23/2019");
		Metodos.clicar(PageCadastro.Assentos.camper);
		Metodos.clicar(PageCamper.ladoVolantCamp);
		Metodos.clicar(PageCamper.tipCombCamper);
		Metodos.escrever(DadosVeiculos.CargaUtil, "650");
		Metodos.escrever(DadosVeiculos.Peso, "1560");
		Metodos.escrever(DadosVeiculos.prcTable, "12737");
		Metodos.escrever(DadosVeiculos.nPlaca, "40393902");
		Metodos.escrever(DadosVeiculos.kmAnual, "34230");
		Metodos.clicar(DadosVeiculos.next);
	}
	
	public static void dadosPessoaisCamper() {

		Metodos.escrever(DadosPessoais.Nome, "Roberto");
		Metodos.escrever(DadosPessoais.SbrNome, "Abilio");
		Metodos.escrever(DadosPessoais.DtNasc, "07/12/1996");
		Metodos.clicar(DadosPessoais.Genero);
		Metodos.escrever(DadosPessoais.endRua, "Rua Beduino Valquirio Neto");
		Metodos.clicar(DadosPessoais.nacionalidade);
		Metodos.escrever(DadosPessoais.Cep, "4392012");
		Metodos.escrever(DadosPessoais.City, "La bem longe ");
		Metodos.clicar(PageCamper.ocupCamper);
		Metodos.clicar(PageCamper.HobbCamper);
		Metodos.escrever(DadosPessoais.webSite, "www.fhdjs.com.br");
		Metodos.clicar(DadosPessoais.Next);
	}

	public static void dadosSeguroCamper() {

		Metodos.escrever(DadosSeguro.DataInicio, "05/20/2024");
		Metodos.clicar(PageCamper.somaSegCamp);
		Metodos.clicar(PageCamper.segDanosCamper);
                Metodos.clicar(Produtos.EuroProduct);
		Metodos.clicar(Produtos.next3);
	}

	public static void DadosUsuarioCamper() {

		Metodos.clicar(PlanosSeguros.Ultimate);
		Metodos.clicar(Produtos.NextQuote);
		Metodos.escrever(DadosUsuario.email, "abiliorob@gmail.com");
		Metodos.escrever(DadosUsuario.cel, "11983928393");
		Metodos.escrever(DadosUsuario.userName, "robuser21");
		Metodos.escrever(DadosUsuario.pass, "Sl2394@3");
		Metodos.escrever(DadosUsuario.confirmPass, "Sl2394@3");

	}

	public static void finalizarCamper() {

		Metodos.clicar(DadosUsuario.finalizado);
		Metodos.validaTexto(DadosUsuario.validarMsg, "Sending e-mail success!");
		Metodos.clicar(DadosUsuario.ok);

	}
}
