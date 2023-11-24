package pages;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Classe representando a funcionalidade de Pesquisa, contendo métodos de interação e validação

public class PesquisarPage {

	private WebDriverWait wait;
	private WebDriver driver;

	@FindBy(xpath = "//*[@id=\"site-branding\"]/div/a/img")
	private WebElement logoBlog;

	@FindBy(id = "search-open")
	private WebElement btnLupa;

	@FindBy(xpath = "//*[@id=\"masthead\"]/div[1]/div[2]/form/label/input")
	private WebElement barraPesquisa;
	
	@FindBy(xpath = "//*[@id=\"masthead\"]/div[1]/div[2]")
	private WebElement divBarraPesquisa;
	
	@FindBy(xpath = "//*[@id=\"masthead\"]/div[1]/div[2]/form/input")
	private WebElement btnPesquisar;

	@FindBy(xpath = "//*[@id=\"post-3622\"]/div[1]/a/img")
	private WebElement validarPost;

	@FindBy(xpath = "//*[@id=\"post-3622\"]/div[2]/div[2]/div/p")
	private WebElement validarPostPorTexto;

	
    //Construtor da classe PesquisarPage.
	public PesquisarPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	//Aguarda a visibilidade de um elemento na página.
	private void aguardarVisibilidade(WebElement elemento) {
		wait.until(ExpectedConditions.visibilityOf(elemento)).isDisplayed();
	}

	//Captura um erro e finaliza a execução do teste.
	private void capturarErro(String mensagem) {
		driver.quit();
		throw new RuntimeException(mensagem);
	}

	//Métodos para interação com elementos na página
	public void clicarBtnLupa() {
		btnLupa.click();
	}

	public void validarLogoBlog() {
		aguardarVisibilidade(logoBlog);
	}

	public void validarBarraPesquisa() {
		aguardarVisibilidade(barraPesquisa);
	}

	public void validarBtnPesquisar() {
		aguardarVisibilidade(btnPesquisar);
	}

	public void clicarBtnPesquisar() {
		btnPesquisar.click();
	}

	public void validarExibicaoPost() {
		aguardarVisibilidade(validarPost);
	}

	public void validarExibicaoPostPorTexto(String texto) {
		String textoParagrafo = validarPostPorTexto.getText();

		if (!textoParagrafo.contains(texto)) {
			capturarErro("Texto não encontrado");
		}
	}

	public void digitarBarraPesquisa(String texto) {
		barraPesquisa.sendKeys(texto);
	}

	public void validarTextoInseridoBarraPesquisa(String texto) {
		String value = barraPesquisa.getAttribute("value");
		assertEquals(texto, value);
	}

	public void validarBarraPesquisaOculta() throws Exception {
		Thread.sleep(2000);

		String displayProperty = divBarraPesquisa.getCssValue("display");

		if (!displayProperty.equals("none")) {
			capturarErro("Elemento não está oculto.");
		}
	}
}