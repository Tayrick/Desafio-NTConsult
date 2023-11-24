# Projeto de Automação Web - Blog do Agi

#### 🎯Objetivo
Este projeto visa automatizar a Funcionalidade de pesquisa no site Blog do Agi (https://blogdoagi.com.br) utilizando Java, Selenium, JUnit e Cucumber.

#### ✅ Requisitos do Projeto
- Java 17
- Selenium 4.15
- JUnit 4.13.2
- Cucumber 7.14

#### 🔎 Detalhes da Estrutura
- **Steps (Passos):** Define os passos do teste em linguagem natural, mapeando com os métodos Java correspondentes.
- **Páginas (Pages):** Contém classes que representam as páginas do site, com métodos para interagir com elementos da página.
- **Features:** Arquivos .feature contendo cenários de teste escritos em Gherkin.

#### ⚠️ Observações:
- O chromedriver é gerenciado pelo WebDriverManager, uma ferramenta que faz o download automático do driver específico do Chrome, compatível com a versão do Chrome instalada na máquina onde o código está sendo executado.

- **Relatório HTML:** Após a execução, um relatório HTML será gerado com o nome cucumber-report. Encontre o relatório na pasta target. Abra o arquivo cucumber-report no navegador para visualizar o relatório. 

#### 📊 Padrões Utilizados
O projeto foi desenvolvido seguindo os padrões de design Page Object e Page Factory.

- **Page Object:** Cada página do site é representada por uma classe Java correspondente. Essas classes contêm os elementos da página e os métodos para interagir com eles, encapsulando a lógica de interação.
- **Page Factory:** Utilizamos o conceito de Page Factory do Selenium para inicializar os elementos da página. Isso promove a reutilização de código e melhora a manutenibilidade, já que a inicialização dos elementos é centralizada.
