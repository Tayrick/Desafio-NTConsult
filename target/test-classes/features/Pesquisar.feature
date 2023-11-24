#language: pt
#encondig: UTF-8

@Pesquisar
Funcionalidade: Pesquisar (Lupa)

Contexto:
    Dado que o usuário está no blog https://blogdoagi.com.br/
    E clicou na lupa

Cenario: Exibir barra de Pesquisa e botão Pesquisar
    Entao deve ser exibida a barra de Pesquisa
    E deve ser exibido o botão Pesquisar

Cenario: Validar busca sem termos inseridos
    Quando a barra de Pesquisa é exibida
    E o usuário clica no botão Pesquisar sem preencher a barra de Pesquisa
    Entao devem ser exibidos todos os posts em ordem decrescente de data

Cenario: Realizar uma Pesquisa com sucesso
    Quando a barra de Pesquisa é exibida
    E o usuário insere o texto "ABBC" na barra de Pesquisa
    E clica no botão Pesquisar
    Entao devem ser exibidos posts que contenham o texto "ABBC"

Cenario: Permitir caracteres especiais na barra de Pesquisa
    Quando a barra de Pesquisa é exibida
    E o usuário insere o texto "??//][[" na barra de Pesquisa
    Entao o texto "??//][[" deve ser exibido na barra de Pesquisa

Cenario: Ocultar barra de Pesquisa
    Quando o usuário clica novamente na lupa
    Entao a barra de pesquisa e o botão Pesquisar devem ficar ocultos