package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import pages.MessagePage;
import runner.RunCucumberTest;
import support.Utils;

public class MessageSteps extends RunCucumberTest {

    MessagePage messagePage = new MessagePage();
    private String menssageSucesso = "Your message has been successfully sent to our team.";

    @Dado("^que estou na tela de mensagens$")
    public void que_estou_na_tela_de_mensagens() throws IllegalAccessException {
        messagePage.acessarTelaMessage();
    }

    @Dado("^preeencho todos os campos$")
    public void preeencho_todos_os_campos() throws IllegalAccessException {
        messagePage.selecionaAssunto("Webmaster");
        messagePage.preencheMensagem("Minha Mensagem");
        //messagePage.preencheEmail();
        messagePage.uploadFile("C:\\Users\\Thiago\\Desktop\\CURRICULO\\Thiago Milton Ferreira - Analista de testes.pdf");
    }

    @Quando("^clico em enviar mensagem$")
    public void clico_em_enviar_mensagem() throws IllegalAccessException {
        messagePage.clickEnviar();
    }

    @Entao("^vejo feedback de mensagem enviada com sucesso$")
    public void vejo_feedback_de_mensagem_enviada_com_sucesso() throws IllegalAccessException {
        messagePage.valida_mensagem(menssageSucesso);
    }


}
