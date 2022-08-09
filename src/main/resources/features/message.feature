#language: pt

@message
Funcionalidade: Enviar mensagem

  @enviar-mensagem-sucesso
  Cenario: Enviar uma mensagem com sucesso
    Dado que estou na tela de mensagens
    E preeencho todos os campos
    Quando clico em enviar mensagem
    Entao vejo feedback de mensagem enviada com sucesso