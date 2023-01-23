package elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import browsers.Browsers;
import metodos.Metodos;

public class Elementos {
	
	WebDriver driver;

	Metodos metodos = new Metodos();
	Browsers nave = new Browsers();
	
	By clicarAutomobile = By.name("Navigation Automobile");

	public By clicarAutomobile() {
		return clicarAutomobile;

	}

	By selecionarCarro = By.cssSelector("#make > option:nth-child(2)");

	public By selecionarCarro() {
		return selecionarCarro;

	}

	private By performance = By.cssSelector("#engineperformance");

	public By getPerfor() {
		return performance;

	}

	private By Velo = By.name("[kW]");

	public By getVelo() {
		return Velo;

	}

	private By date = By.id("dateofmanufacture");

	public By getDate() {
		return date;


	}

	By assentos = By.cssSelector("#numberofseats > option:nth-child(5)");

	public By assentos() {
		return assentos;

	}

	By type = By.cssSelector("#fuel > option:nth-child(4)");

	public By type() {
		return type;

	}

	private By list = By.cssSelector("#listprice");

	public By getList() {
		return list;

	}

	private By placa = By.cssSelector("#licenseplatenumber");

	public By getPlaca() {
		return placa;

	}

	private By kmAnual = By.cssSelector("#annualmileage");

	public By getKm() {
		return kmAnual;

	}

	By next = By.cssSelector("#nextenterinsurantdata");

	public By next() {
		return next;

	}

	private By firstname = By.cssSelector("#firstname");

	public By getFirstname() {
		return firstname;

	}

	private By lastN = By.name("Last Name");

	public By getLastN() {
		return lastN;

	}

	private By dataNas = By.id("birthdate");

	public By getdataNas() {
		return dataNas;

	}

	By macho = By.cssSelector(
			"#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span");

	public By macho() {
		return macho;

	}

	private By ende = By.name("Street Address");

	public By getEnde() {
		return ende;

	}

	By nacionalidade = By.cssSelector("#country > option:nth-child(32)");

	public By getNacio() {
		return nacionalidade;

	}

	private By cep = By.cssSelector("#zipcode");

	public By getCep() {
		return cep;

	}

	private By city = By.cssSelector("#city");

	public By getCity() {
		return city;

	}

	By Hobbies = By.cssSelector(
			"#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");

	public By hobbies() {
		return Hobbies;

	}

	private By occupation = By.cssSelector("#occupation > option:nth-child(2)");

	public By getOcuppation() {
		return occupation;

	}

	private By webSite = By.cssSelector("#website");

	public By getWebSite() {
		return webSite;

	}

	By clicarProximo = By.cssSelector("#nextenterproductdata");

	public By clicarProximo() {
		return clicarProximo;

	}

	private By startDate = By.cssSelector("#startdate");

	public By getStrtDate() {
		return startDate;

	}

	private By Sum = By.cssSelector("#insurancesum");

	public By getSumi() {
		return Sum;

	}

	private By merito = By.cssSelector("#meritrating > option:nth-child(4)");

	public By getMerit() {
		return merito;
		
	}
	private By damange = By.cssSelector("#damageinsurance > option:nth-child(4)");
	
	public By getDem() {
		return damange;
		
	}
	private By opcaoProd = By.cssSelector("#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(2) > span");
	
	public By getProduto() {
		return opcaoProd;
		
		
	}
	private By cortesy = By.cssSelector("#courtesycar > option:nth-child(2)");
	
	public By getCortesia() {
		return cortesy;
		
		
	}
	public By prox = By.cssSelector("#nextselectpriceoption");
	
	public By select() {
		return prox;
		
		
	}
    public By gold = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(2)");
	
	public By Ouro() {
		return gold;
		
		
	}
	public By download = By.id("downloadquote");
	
	public By down() {
		return download;
		
		
		
	}
	public By sendQuote = By.xpath("//*[@id=\"sendquote\"]");
	                                
	public By Send() {
		return sendQuote ;
		
		
	}
	private By email = By.cssSelector("#email");
	 
	public By getemal() {
		return email;
			
	}
	private By cel = By.cssSelector("#phone");
	
    public By getCel() {
		return cel;
    	
    	
    }
    private By userName = By.cssSelector("#username");
    
	public By getUser() {
		return userName;
		
	}
	private By pass = By.cssSelector("#password");
	
	public By getSenha() {
		return pass;
		
		
	}
	public By confirmPass = By.cssSelector("#confirmpassword");
	
	public By getConfPass() {
		return confirmPass;
		
		
	}
	public By finalizado = By.xpath("//*[@id=\"sendemail\"]");

	public By fim() {
		return finalizado;
		
		
	}
	
	public By validacao = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2");
	
	public By getMsg() {
		return validacao;
		
		
	}
	public By truck = By.name("Navigation Truck");
	
	public By truckClic() {
		return truck;
		
		
	}
	public By Marca = By.cssSelector("#make > option:nth-child(14)");
		
	public By marca() {
		return Marca;
		
		
	}
	public By Desemp = By.id("engineperformance");
	
	public By Desem() {
		return Desemp;
		
		
	}
	
}
	


