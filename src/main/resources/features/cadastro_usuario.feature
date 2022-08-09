#language: pt

  @cadastro
  Funcionalidade: Cadastro de usuario
    Eu como um novo cliente do automationpractice
    Gostaria de realizar meu cadastro
    para realizar compras no site

    @cadastro-sucesso
    Cenario: Registrar novo usuário com sucesso
      Dado que estou na tela de login
      E acesso o cadastro de usuario
      Quando eu preencho o formulario de cadastro
      E clico em registrar
      Entao vejo cadastro realizado com sucesso

    @cadastro-sucesso2
    Cenario: Registrar novo usuário com sucesso
      Dado que estou na tela de login
      E acesso o cadastro de usuario
      Quando eu preencho o formulario de cadastro
      E clico em registrar
      Entao vejo cadastro realizado com sucesso





