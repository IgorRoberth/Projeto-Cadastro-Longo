package browsers;

import java.time.Duration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v85.browser.Browser;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Browsers {

	protected static WebDriver driver;

	@BeforeClass
	public static void abrirNavegador() {

		String site = "http://sampleapp.tricentis.com";
		String navegador = "Edge";

		if (navegador.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setHeadless(false);
			chromeOptions.addArguments("--disable-gpu");
			chromeOptions.addArguments("--window-size=1400,800");
			WebDriver chromeDriver = new ChromeDriver(chromeOptions);
			driver = chromeDriver;
		} else if (navegador.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setHeadless(false);
			firefoxOptions.addArguments("--disable-gpu");
			firefoxOptions.addArguments("--window-size=1400,800");
			WebDriver firefoxDriver = new FirefoxDriver(firefoxOptions);
			driver = firefoxDriver;
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		} else {
			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.setCapability("useAutomationExtension", false);
			edgeOptions.setHeadless(true);
			edgeOptions.addArguments("--disable-gpu");
			edgeOptions.addArguments("--window-size=1400,800");
			WebDriver edgeDriver = new EdgeDriver(edgeOptions);
			driver = edgeDriver;
		}
		driver.get(site);
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void fecharNavegador() {

		driver.quit();
	}
}