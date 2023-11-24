package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.PesquisarPage;

import static suport.Utils.*;

//Classe de passos (steps) para os cenários de teste relacionados à Funcionalidade Pesquisa
public class PesquisarStep {

	//Instância da página de Pesquisa
	PesquisarPage page = new PesquisarPage(driver);

	@Dado("que o usuário está no blog https:\\/\\/blogdoagi.com.br\\/")
	public void queOUsuárioEstáNoBlogHttpsBlogdoagiComBr() {
		Na(PesquisarPage.class).validarLogoBlog();
	}

	@E("clicou na lupa")
	public void clicouNaLupa() {
		Na(PesquisarPage.class).clicarBtnLupa();
	}

	@Entao("deve ser exibida a barra de Pesquisa")
	public void deveSerExibidaABarraDePesquisa() {
		Na(PesquisarPage.class).validarBarraPesquisa();
	}

	@E("deve ser exibido o botão Pesquisar")
	public void deveSerExibidoOBotãoPesquisar() {
		Na(PesquisarPage.class).validarBtnPesquisar();
	}

	@Quando("a barra de Pesquisa é exibida")
	public void aBarraDePesquisaÉExibida() {
		Na(PesquisarPage.class).validarBarraPesquisa();
	}

	@E("o usuário clica no botão Pesquisar sem preencher a barra de Pesquisa")
	public void oUsuárioClicaNoBotãoPesquisarSemPreencherABarraDePesquisa() {
		Na(PesquisarPage.class).clicarBtnPesquisar();
	}

	@Entao("devem ser exibidos todos os posts em ordem decrescente de data")
	public void devemSerExibidosTodosOsPostsEmOrdemDecrescenteDeData() {
		Na(PesquisarPage.class).validarExibicaoPost();
	}

	@Quando("o usuário insere o texto {string} na barra de Pesquisa")
	public void oUsuárioInsereOTextoNaBarraDePesquisa(String texto) {
		Na(PesquisarPage.class).digitarBarraPesquisa(texto);
	}

	@E("clica no botão Pesquisar")
	public void clicaNoBotãoPesquisar() {
		Na(PesquisarPage.class).clicarBtnPesquisar();
	}

	@Entao("devem ser exibidos posts que contenham o texto {string}")
	public void devemSerExibidosPostsQueContenhamOTexto(String texto) {
		Na(PesquisarPage.class).validarExibicaoPostPorTexto(texto);
	}

	@Entao("o texto {string} deve ser exibido na barra de Pesquisa")
	public void oTextoDeveSerExibidoNaBarraDePesquisa(String texto) {
		Na(PesquisarPage.class).validarTextoInseridoBarraPesquisa(texto);
	}

	@Quando("o usuário clica novamente na lupa")
	public void oUsuárioClicaNovamenteNaLupa() {
		Na(PesquisarPage.class).clicarBtnLupa();
	}

	@Entao("a barra de pesquisa e o botão Pesquisar devem ficar ocultos")
	public void aBarraDePesquisaEOBotãoPesquisarDevemFicarOcultos() throws Exception {
		Na(PesquisarPage.class).validarBarraPesquisaOculta();
	}
}
