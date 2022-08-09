$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cadastro_usuario.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 4,
  "name": "Cadastro de usuario",
  "description": "Eu como um novo cliente do automationpractice\r\nGostaria de realizar meu cadastro\r\npara realizar compras no site",
  "id": "cadastro-de-usuario",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@cadastro"
    }
  ]
});
formatter.scenario({
  "line": 10,
  "name": "Registrar novo usuário com sucesso",
  "description": "",
  "id": "cadastro-de-usuario;registrar-novo-usuário-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 9,
      "name": "@cadastro-sucesso"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "que estou na tela de login",
  "keyword": "Dado "
});
formatter.step({
  "line": 12,
  "name": "acesso o cadastro de usuario",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "eu preencho o formulario de cadastro",
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "clico em registrar",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "vejo cadastro realizado com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.que_estou_na_tela_de_login()"
});
formatter.result({
  "duration": 12259085600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.acesso_o_cadastro_de_usuario()"
});
formatter.result({
  "duration": 326869200,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.eu_preencho_o_formulario_de_cadastro()"
});
formatter.result({
  "duration": 5606388400,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.clico_em_registrar()"
});
formatter.result({
  "duration": 4410081300,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.vejo_cadastro_realizado_com_sucesso()"
});
formatter.result({
  "duration": 56882900,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Registrar novo usuário com sucesso",
  "description": "",
  "id": "cadastro-de-usuario;registrar-novo-usuário-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 17,
      "name": "@cadastro-sucesso2"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "que estou na tela de login",
  "keyword": "Dado "
});
formatter.step({
  "line": 20,
  "name": "acesso o cadastro de usuario",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "eu preencho o formulario de cadastro",
  "keyword": "Quando "
});
formatter.step({
  "line": 22,
  "name": "clico em registrar",
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "vejo cadastro realizado com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.que_estou_na_tela_de_login()"
});
formatter.result({
  "duration": 10138206500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.acesso_o_cadastro_de_usuario()"
});
formatter.result({
  "duration": 321979400,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.eu_preencho_o_formulario_de_cadastro()"
});
formatter.result({
  "duration": 4427219900,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.clico_em_registrar()"
});
formatter.result({
  "duration": 2602851500,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.vejo_cadastro_realizado_com_sucesso()"
});
formatter.result({
  "duration": 54830100,
  "status": "passed"
});
formatter.uri("message.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 4,
  "name": "Enviar mensagem",
  "description": "",
  "id": "enviar-mensagem",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@message"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Enviar uma mensagem com sucesso",
  "description": "",
  "id": "enviar-mensagem;enviar-uma-mensagem-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 6,
      "name": "@enviar-mensagem-sucesso"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "que estou na tela de mensagens",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "preeencho todos os campos",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "clico em enviar mensagem",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "vejo feedback de mensagem enviada com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "MessageSteps.que_estou_na_tela_de_mensagens()"
});
formatter.result({
  "duration": 1725038700,
  "status": "passed"
});
formatter.match({
  "location": "MessageSteps.preeencho_todos_os_campos()"
});
formatter.result({
  "duration": 355904700,
  "status": "passed"
});
formatter.match({
  "location": "MessageSteps.clico_em_enviar_mensagem()"
});
formatter.result({
  "duration": 1441948800,
  "status": "passed"
});
formatter.match({
  "location": "MessageSteps.vejo_feedback_de_mensagem_enviada_com_sucesso()"
});
formatter.result({
  "duration": 51723400,
  "status": "passed"
});
});