package steps;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage();


    String nome = "Thiago";
    String sobrenome ="Ferreira";

    @Quando("^eu preencho o formulario de cadastro$")
    public void eu_preencho_o_formulario_de_cadastro() throws IllegalAccessException {
        cadastroPage.selectTitle(2);
        cadastroPage.preencheNome(nome);
        cadastroPage.preencheSobreNome(sobrenome);
        cadastroPage.preenchePassword();
        cadastroPage.selecionaAniversario(30,8,"1996");
        cadastroPage.preencheAdress("Rua Thiago, 123");
        cadastroPage.preencheCity("Belo Horizonte");
        cadastroPage.selecionaEstado("32");
        cadastroPage.preenchePostalCode("30290");
        cadastroPage.preenchePhoneMobile("+550319826078080");
        cadastroPage.preencheReferenceAdress("Rua aimores 1017");
    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar() throws IllegalAccessException {
        cadastroPage.clickRegister();
    }

    @Entao("^vejo cadastro realizado com sucesso$")
    public void vejo_cadastro_realizado_com_sucesso() throws IllegalAccessException {
        cadastroPage.valida_cadastro(nome,sobrenome);
    }








}
