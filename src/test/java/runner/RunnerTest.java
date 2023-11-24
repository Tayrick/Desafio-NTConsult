package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

//Classe responsável por executar os testes do Cucumber.

@RunWith(Cucumber.class)
@CucumberOptions(

		// Configuração do Cucumber
		plugin = { "pretty", "html:target/cucumber-report" }, // Gera relatórios de forma legível e em formato HTML
		features = "src/test/resources/features", // Caminho para os arquivos de features
		glue = "steps", // Pacote onde estão definidos os passos dos testes
		tags = "@Pesquisar", // Define as tags dos cenários que serão executados
		snippets = SnippetType.CAMELCASE, // Define o estilo de geração dos snippets
		monochrome = true, // Habilita a exibição de saída em cores no console
		dryRun = false // Desabilita o modo de execução de teste em seco
)

public class RunnerTest {

}