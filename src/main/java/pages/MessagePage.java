package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;

public class MessagePage extends RunCucumberTest {


    private By subject_field = By.id("id_contact");
    private By message_field = By.id("message");
    private By email_field = By.id("email");
    // Geralmente este campo fica oculto na pagina (fica um retangulo branco)
    private By upload_field = By.id("fileUpload");
    private By submit_button = By.id("submitMessage");
    private By mensagem_sucesso = By.cssSelector("#center_column > p");


    public void acessarTelaMessage() throws IllegalAccessException {
        getDriver().get("http://automationpractice.com/index.php?controller=contact");
        Utils.esperarElementoEstarPresente(message_field,20);
    }

    public void selecionaAssunto(String assunto) throws IllegalAccessException {
        Select select_assunto = new Select(getDriver().findElement(subject_field));
        select_assunto.selectByVisibleText(assunto);
    }

    public void preencheMensagem(String message) throws IllegalAccessException {
        getDriver().findElement(message_field).sendKeys(message);
    }

    public void preencheEmail() throws IllegalAccessException {
        getDriver().findElement(email_field).sendKeys(Utils.getRandomEmail());
    }

    public void uploadFile(String caminhoDoArquivo) throws IllegalAccessException {
        getDriver().findElement(upload_field).sendKeys(caminhoDoArquivo);
    }
    public void clickEnviar() throws IllegalAccessException {
        getDriver().findElement(submit_button).click();
    }
    public void valida_mensagem(String mensagemSucesso) throws IllegalAccessException {
        Utils.esperarElementoEstarPresente(By.cssSelector("#center_column > p"),20);
        String mensagemTela = getDriver().findElement(mensagem_sucesso).getText();
        Assert.assertEquals(mensagemSucesso,mensagemTela);
    }

}
