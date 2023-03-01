package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Browsers {

	protected static WebDriver driver;
	
	public static void abrirNavegador() {

		String site = "http://sampleapp.tricentis.com";
		String navegador = "chrome";
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setHeadless(true);
		
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setHeadless(true);
		
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.setCapability("useAutomationExtension", false);
		edgeOptions.setHeadless(true);
		
		if (navegador.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			// Configurações para o Chrome headless
			chromeOptions.addArguments("--disable-gpu");
			chromeOptions.addArguments("--window-size=1400,800");
			WebDriver chromeDriver = new ChromeDriver(chromeOptions);
			driver = chromeDriver;
		} else if (navegador.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			// Configurações para o Firefox headless
			firefoxOptions.addArguments("--disable-gpu");
			firefoxOptions.addArguments("--window-size=1400,800");
			WebDriver firefoxDriver = new FirefoxDriver(firefoxOptions);
			driver = firefoxDriver;
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		} else if (navegador.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			// Configurações para o Edge headless
			edgeOptions.addArguments("--disable-gpu");
			edgeOptions.addArguments("--window-size=1400,800");
			WebDriver edgeDriver = new EdgeDriver(edgeOptions);
			driver = edgeDriver;
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