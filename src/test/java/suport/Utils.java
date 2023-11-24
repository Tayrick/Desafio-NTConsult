package suport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Utils {

	public static WebDriver driver;


	@SuppressWarnings("deprecation")
	public static void acessarSistema() {

		// Configuração do driver Chrome
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		// Maximiza a janela do navegador
		driver.manage().window().maximize();
		
		// Tempo de espera implicito
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Acesso a URL da aplicacao
		driver.get("https://blogdoagi.com.br/");

	}

	public static <T> T Na(Class<T> classe) {
		return PageFactory.initElements(driver, classe);
	}

	public static void capturarTela(Scenario scenario) {
		// Captura e anexa a tela ao cenário
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "Tela capturada");
	}

}
