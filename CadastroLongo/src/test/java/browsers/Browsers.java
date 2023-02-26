package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

	protected static WebDriver driver;    
	
	public static void abrirNavegador() {

		String site = "http://sampleapp.tricentis.com";
		String navegador = "chrome";

		if (navegador.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (navegador.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(8));
		} else if (navegador.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("Digite driver desejado na String navegador");
		}
		// Código para reter o https que está registrado na Feature
		driver.get(site);
		// Código para maximizar a tela web
		driver.manage().window().maximize();
	}
	public static void fecharNavegador() {

		driver.quit();
	}	
}