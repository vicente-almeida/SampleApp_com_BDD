# language: pt

@venda
Funcionalidade: Realizar o fluxo de venda de um seguro de automóvel

  Eu como usuário da aplicação SampleApp
  quero preccnher todos os formulários do site
  para realizar a venda de um seguro com sucesso

  @forms_execute
  Cenário: Preencher o formulário vehicle data

    Dado que eu acesso a aplicação
    E clico no link Automobile
    E preencho as informações do formulário Vehicle Data
    Quando clico no botão Next
    Então eu sou direcionado ao formuláro Insurant Data

  @forms_execute
  Cenário: Preencher o formulário insurant data

    Dado que eu estou no formulario Insurant Data
    E preencho todos os campos do formulario
    Quando clico em Next
    Então eu sou direcionado ao formulario Product Data

  @forms_execute
  Cenário: Preencher o formulário product data

    Dado que eu estou no formulario Product Data
    E preencho todos os campos do formulario product data
    Quando eu clico em Next
    Então eu sou direcionado ao formulario Select Price Option

  @forms_execute
  Cenário: Selecionar a opção de preço

    Dado que eu estou no formulário Select Price
    Quando eu clico em um dos preços
    E clico no botão de Next
    Então eu sou direcionado ao formulário Send Quote

  @forms_execute
  Cenário: Validação do formulario Send Quote

    Dado que eu estou no formulario Send Quote
    Quando eu não preencho algum campo obrigatório
    E eu clico no botão Send
    E é apresentada a mensagem
    Então eu clico no botão ok da mensagem

  @forms_execute
  Cenário: Preencher o formulario Send Quote

    Dado que eu estou no formulario Send Quote
    E preencho todos os campos desse formulario
    E eu clico no botão Send
    Quando a mensagem é apresentada
    Então eu clico no botão ok


