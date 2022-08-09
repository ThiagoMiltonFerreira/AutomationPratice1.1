package pages;

import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.Utils;

public class LoginPage extends RunCucumberTest {

    private By create_email_field = By.id("email_create");
    private By create_email_button = By.id("SubmitCreate");

    public void acessarTelaLogin() throws IllegalAccessException {
        getDriver(browserUtilizado).get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        Utils.esperarElementoEstarPresente(create_email_field, 20);
    }
    public void preencherCampoEmail() throws IllegalAccessException {

        getDriver().findElement(create_email_field).sendKeys(Utils.getRandomEmail());

    }
    public void clicarCriarContaBotao() throws IllegalAccessException {

        getDriver().findElement(create_email_button).click();
    }

}
