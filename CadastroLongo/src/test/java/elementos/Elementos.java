package elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Elementos {

	WebDriver driver;

	public By clicarAutomobile = By.name("Navigation Automobile");

	public By selecionarCarro = By.cssSelector("#make > option:nth-child(2)");

	public By performance = By.cssSelector("#engineperformance");

	public By Velo = By.name("[kW]");

	public By date = By.id("dateofmanufacture");

	public By assentos = By.cssSelector("#numberofseats > option:nth-child(5)");

	public By type = By.cssSelector("#fuel > option:nth-child(4)");

	public By list = By.cssSelector("#listprice");

	public By placa = By.cssSelector("#licenseplatenumber");

	public By kmAnual = By.cssSelector("#annualmileage");

	public By next = By.cssSelector("#nextenterinsurantdata");

	public By firstname = By.cssSelector("#firstname");

	public By lastN = By.name("Last Name");

	public By dataNas = By.id("birthdate");

	public By macho = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span");

	public By ende = By.name("Street Address");

	public By nacionalidade = By.cssSelector("#country > option:nth-child(32)");

	public By cep = By.cssSelector("#zipcode");

	public By city = By.cssSelector("#city");

	public By Hobbies = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");

	public By occupation = By.cssSelector("#occupation > option:nth-child(2)");

	public By webSite = By.cssSelector("#website");

	public By clicarProximo = By.cssSelector("#nextenterproductdata");

	public By startDate = By.cssSelector("#startdate");

	public By Sum = By.cssSelector("#insurancesum");

	public By merito = By.cssSelector("#meritrating > option:nth-child(4)");

	public By damange = By.cssSelector("#damageinsurance > option:nth-child(4)");

	public By opcaoProd = By.cssSelector("#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(2) > span");

	public By cortesy = By.cssSelector("#courtesycar > option:nth-child(2)");

	public By prox = By.cssSelector("#nextselectpriceoption");

	public By gold = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(2)");

	public By download = By.id("downloadquote");

	public By sendQuote = By.xpath("//*[@id=\"sendquote\"]");

	public By email = By.cssSelector("#email");

	public By cel = By.cssSelector("#phone");

	public By userName = By.cssSelector("#username");

	public By pass = By.cssSelector("#password");

	public By confirmPass = By.cssSelector("#confirmpassword");

	public By finalizado = By.xpath("//*[@id=\"sendemail\"]");

	public By validacao = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2");

	
	// Elementos inspecionados para comunicação com a package Cadastro Caminhão
	public By truck = By.name("Navigation Truck");

	public By Marca = By.cssSelector("#make > option:nth-child(14)");

	public By Desemp = By.id("engineperformance");

	public By caFab = By.cssSelector("#dateofmanufacture");

	public By caminAss = By.cssSelector("#numberofseats > option:nth-child(3)");

	public By camComb = By.cssSelector("#fuel > option:nth-child(3)");

	public By CamCarg = By.cssSelector("#payload");

	public By CamPeso = By.cssSelector("#totalweight");

	public By precoCam = By.cssSelector("#listprice");

	public By numPlaca = By.cssSelector("#licenseplatenumber");

	public By CamKM = By.cssSelector("#annualmileage");

	public By next1 = By.cssSelector("#nextenterinsurantdata");

	public By nomeCam = By.id("firstname");

	public By sobreName = By.cssSelector("#lastname");

	public By dataNasciCam = By.id("birthdate");

	public By generoCAM = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span");

	public By endCam = By.cssSelector("#streetaddress");

	public By paisCam = By.cssSelector("#country > option:nth-child(32)");

	public By CodPost = By.cssSelector("#zipcode");

	public By cityCam = By.cssSelector("#city");

	public By OcupCam = By.cssSelector("#occupation > option:nth-child(6)");

	public By hobCamExcesso = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");

	public By hobCamParaquedismo = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(4)");

	public By SiteCam = By.cssSelector("#website");

	public By next2 = By.cssSelector("#nextenterproductdata");

	public By DataCamincio = By.cssSelector("#startdate");

	public By ValorseguroCAM = By.cssSelector("#insurancesum > option:nth-child(4)");

	public By seguroDanosCAM = By.cssSelector("#damageinsurance > option:nth-child(4)");

	public By opcaoProdCam = By.cssSelector("#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");

	public By next3Cam = By.cssSelector("#nextselectpriceoption");

	public By platinumCami = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(3)");

	public By next4 = By.cssSelector("#nextsendquote");

	public By emailCaminhao = By.cssSelector("#email");

	public By phoneCamin = By.cssSelector("#phone");

	public By userSib = By.cssSelector("#username");

	public By passCamin = By.cssSelector("#password");

	public By confirPassCamin = By.cssSelector("#confirmpassword");

	public By next5 = By.cssSelector("#sendemail");
	
	//Cadastro de Motocicleta 	
	public By motocicleta = By.cssSelector("#nav_motorcycle");
	
	public By marcaMoto = By.cssSelector("#make > option:nth-child(13)");
	
	public By modeloMoto = By.cssSelector("#model > option:nth-child(4)");
	
	public By cilindroMoto = By.cssSelector("#cylindercapacity");
	
	public By desempMoto = By.cssSelector("#engineperformance");
	
	public By dataFabricacaoMoto = By.cssSelector("#dateofmanufacture");
	
	public By assentMoto = By.cssSelector("#numberofseatsmotorcycle > option:nth-child(3)");
	
	public By precoMoto = By.cssSelector("#listprice");
	
	public By kmAnualMoto = By.cssSelector("#annualmileage");

	public By proxMoto1 = By.cssSelector("#nextenterinsurantdata");
	
	public By nomeCliMoto = By.cssSelector("#firstname");
	
	public By sobreNomeCliMoto = By.cssSelector("#lastname");
	
	public By dataDNascMoto = By.cssSelector("#birthdate");
	
	public By generoMoto = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span");
	
	public By endCliMoto = By.cssSelector("#streetaddress");

	public By nacioMoto = By.cssSelector("#country > option:nth-child(23)");
	
	public By cepCliMoto = By.cssSelector("#zipcode");
	
	public By cityMoto = By.cssSelector("#city");
	
	public By ocupaMoto = By.cssSelector("#occupation > option:nth-child(6)");
	
	public By HobbMoto = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");
	
	public By webSiMoto = By.cssSelector("#website");
	
	public By clicaMotoProx2 = By.cssSelector("#nextenterproductdata");
	
	public By dataInicioMoto = By.cssSelector("#startdate");
	
	public By somaSegMoto = By.cssSelector("#insurancesum > option:nth-child(2)");

	public By segdeMoto = By.cssSelector("#damageinsurance > option:nth-child(3)");

	public By opcaoProdMoto = By.cssSelector("#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(2) > span");

	public By clicarMotoProx3 = By.cssSelector("#nextselectpriceoption");
	
	public By escolhePlanoMoto = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(1) > span");
	
	public By ProxiMoto4 = By.cssSelector("#nextsendquote");
	
	public By emailMoto = By.cssSelector("#email");
	
	public By celularMoto = By.cssSelector("#phone");
	
	public By userMoto = By.cssSelector("#username");
	
	public By passMoto = By.cssSelector("#password");
	
	public By confirmMoto = By.cssSelector("#confirmpassword");
	
	public By proxMoto5 = By.cssSelector("#sendemail");
	
	public By clicaOkMoto = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button");

	public By clicarokCarro =By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button");
   
	public By clicarOkCaminhao = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button");

	
	//Interações com a package CadastroCampista	
	public By clicarCamper = By.cssSelector("#nav_camper");
	
	public By marcaVeiculo = By.cssSelector("#make > option:nth-child(5)");
	
	public By performCarCamper = By.cssSelector("#engineperformance"); 
	
	public By dataFabCamper = By.cssSelector("#dateofmanufacture");
	
	public By AssCamper = By.cssSelector("#numberofseats > option:nth-child(9)");

    public By ladoVolantCamp = By.cssSelector("#insurance-form > div > section:nth-child(1) > div:nth-child(5) > p > label:nth-child(2)");

    public By tipCombCamper = By.cssSelector("#fuel > option:nth-child(5)");
    
    public By cargUtCamper = By.cssSelector("#payload");
    
    public By totalveicCamper = By.cssSelector("#totalweight");
    
    public By precoTabCamper = By.cssSelector("#listprice");
    
    public By numPlacaCamper = By.cssSelector("#licenseplatenumber");
    
    public By anualKmCamper = By.cssSelector("#annualmileage");
    
    public By proxCamper1 = By.cssSelector("#nextenterinsurantdata");
    
    public By primNomeCamper = By.cssSelector("#firstname");
    
}
