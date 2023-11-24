package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static suport.Utils.*;

public class Hooks {

	//Configuração a ser executada antes de cada cenário de teste.
	@Before
	public void setUp() {
		acessarSistema();
	}

	//Ações a serem executadas após a execução de cada cenário de teste.
	@After
	public void tearDown(Scenario scenario) {
		capturarTela(scenario);
		driver.quit();
	}

}
