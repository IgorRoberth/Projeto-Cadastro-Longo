package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//caminho das features 
		features = "src/test/resources",
		//package dos steps
		glue = "executa",
		//tags que deseja executar
		tags = "@cadastrocamper",
		//validar se existe gherckis sem steps
		dryRun = false,
		//pretty formatação do console para aparecer igual ao cucumber
		//html é o status report no formato html
		plugin = {"pretty", "html:target/report.html"},
		//tirar os caracteres especiais do console
		monochrome = true
		
		)

public class Tags {
}