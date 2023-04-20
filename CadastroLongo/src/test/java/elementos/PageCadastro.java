package elementos;

import org.openqa.selenium.By;

public class PageCadastro {

	public static class HomePage {
    public static By Automobile = By.name("Navigation Automobile");
		public static By Truck = By.name("Navigation Truck");
		public static By Motocicleta = By.cssSelector("#nav_motorcycle");
		public static By Camper = By.cssSelector("a[id=\"nav_camper\"]");
	
	}
	
	public static class VeiculosSelecionados {
		public static By Carro = By.cssSelector("option[value=\"Audi\"]");
		public static By Caminhao = By.cssSelector("option[value=\"Mercedes Benz\"]");
    public static By Moto = By.xpath("//*[@id=\"make\"]/option[13]");
		public static By modeloMt = By.cssSelector("option[value=\"Motorcycle\"]");
		public static By modeloCamper = By.cssSelector("option[value=\"Honda\"]");
    
	}

	public static class DadosVeiculos {
		public static By performance = By.cssSelector("#engineperformance");
		public static By dataFab = By.cssSelector("#dateofmanufacture");
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
		public static By cortesyNo = By.cssSelector("option[value=\"No\"]");
		public static By cortesyYes = By.cssSelector("option[value=\"Yes\"]");
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
		public static By Silver = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]");
		public static By Gold = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]");
		public static By Platinum = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]");
		public static By Ultimate = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]");

	}

	public static class SeguroDanos {
		public static By semCobertura = By.xpath("//*[text()='No Coverage']");
		public static By cbParcial = By.xpath("//*[text()='Partial Coverage']");
		public static By cbTotal = By.xpath("//*[text()='Full Coverage']");
	}
	
	public static class Assentos {
		public static By car = By.cssSelector("option[value=\"4\"]");
		public static By moto = By.cssSelector("option[value=\"2\"]");
		public static By caminhao = By.cssSelector("option[value=\"3\"]");
		public static By camper = By.cssSelector("option[value=\"8\"]");
	
	}
}