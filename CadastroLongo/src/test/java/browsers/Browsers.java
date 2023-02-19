package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

	
	protected static WebDriver driver;;

	public void abrirNavegador(String navegador, String site) {

	   try {
			if (navegador.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (navegador.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(8));
				
			} else if (navegador.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", "C:\\Driver\\msedgedriver.exe");
				driver = new EdgeDriver();
			}
			// Código para reter o https que está registrado na Feature
			driver.get(site);
			// Código para maximizar a tela web
			driver.manage().window().maximize();
		} catch (Exception e) {
			// Caso ocorrer erro, me informar a linha que está
			System.err.println("----- erro abrir navegador -----" + e.getMessage());
			System.err.println("----- causa erro ------" + e.getMessage());
		}
	}	
}
