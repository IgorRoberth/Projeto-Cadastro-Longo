package elementos;

import org.openqa.selenium.By;

public class PageCadastro {

	public static class HomePage {
		
		public static By clicarAutomobile = By.name("Navigation Automobile");
		public static By clicartruck = By.name("Navigation Truck");
		public static By clicarmotocicleta = By.cssSelector("#nav_motorcycle");
		public static By Camper = By.cssSelector("a[id=\"nav_camper\"]");
	
	}
	
	public static class VeiculosSelecionados {

		public static By Carro = By.cssSelector("#make > option:nth-child(2)");
		public static By Caminhao = By.cssSelector("#make > option:nth-child(7)");
		public static By Moto = By.cssSelector("#make > option:nth-child(13)");
		public static By modeloCamper = By.cssSelector("#make > option:nth-child(5)");
	}

	public static class DadosVeiculos {
		public static By performance = By.cssSelector("#engineperformance");
		public static By dataFab = By.cssSelector("#dateofmanufacture");
		public static By assentos = By.cssSelector("#numberofseats > option:nth-child(5)");
		public static By combust = By.cssSelector("#fuel > option:nth-child(4)");
		public static By CargaUtil = By.cssSelector("#payload");
		public static By Peso = By.cssSelector("#totalweight");
		public static By prcTable = By.cssSelector("#listprice");
		public static By nPlaca = By.cssSelector("#licenseplatenumber");
		public static By kmAnual = By.cssSelector("#annualmileage");
		public static By next = By.cssSelector("#nextenterinsurantdata");
	}

	public static class DadosPessoais {
		public static By Nome = By.cssSelector("#firstname");
		public static By SbrNome = By.name("Last Name");
		public static By DtNasc = By.id("birthdate");
		public static By Genero = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span");
		public static By endRua = By.name("Street Address");
		public static By nacionalidade = By.cssSelector("#country > option:nth-child(32)");
		public static By Cep = By.cssSelector("#zipcode");
		public static By City = By.cssSelector("#city");
		public static By webSite = By.cssSelector("#website");
		public static By Next = By.cssSelector("#nextenterproductdata");
	}

	public static class DadosSeguro {
		public static By DataInicio = By.cssSelector("#startdate");
		public static By Soma = By.cssSelector("#insurancesum");
		public static By cortesyNo = By.cssSelector("#courtesycar > option:nth-child(2)");
		public static By cortesyYes = By.cssSelector("#courtesycar > option:nth-child(3)");
	}

	public static class Produtos {
		public static By EuroProduct = By.xpath("//*[text()='Euro Protection']");
		public static By LegalProduct = By.xpath("//*[text()='Legal Defense Insurance']");
		public static By next3 = By.cssSelector("#nextselectpriceoption");
		public static By NextQuote = By.cssSelector("button[id=\"nextsendquote\"]");
	}

	public static class DadosUsuario {
		public static By email = By.cssSelector("input[id=\"email\"]");
		public static By cel = By.cssSelector("input[id=\"phone\"]");
		public static By userName = By.cssSelector("input[id=\"username\"]");
		public static By pass = By.cssSelector("input[id=\"password\"]");
		public static By confirmPass = By.cssSelector("input[id=\"confirmpassword\"]");
		public static By finalizado = By.cssSelector("button[id=\"sendemail\"]");
		public static By validarMsg = By.xpath("//*[text()='Sending e-mail success!']");
		public static By ok = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div");
	}

	public static class PlanosSeguros {
		public static By Silver = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(1)");
		public static By Gold = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(2)");
		public static By Platinum = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(3)");
		public static By Ultimate = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(4)");

	}

	public static class SeguroDanos {
		public static By semCobertura = By.xpath("//*[text()='No Coverage']");
		public static By cbParcial = By.xpath("//*[text()='Partial Coverage']");
		public static By cbTotal = By.xpath("//*[text()='Full Coverage']");
	}
}