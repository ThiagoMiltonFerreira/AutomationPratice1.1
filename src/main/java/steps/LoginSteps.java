package steps;

import cucumber.api.java.pt.Dado;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.LoginPage;
import runner.RunBase;
import runner.RunCucumberTest;


public class LoginSteps extends RunCucumberTest {

    LoginPage loginPage = new LoginPage();

    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login() throws IllegalAccessException {

        loginPage.acessarTelaLogin();
    }

    @Dado("^acesso o cadastro de usuario$")
    public void acesso_o_cadastro_de_usuario() throws IllegalAccessException {

        loginPage.preencherCampoEmail();
        loginPage.clicarCriarContaBotao();
    }


}
