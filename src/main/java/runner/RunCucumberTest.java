package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        /*
        Gerando o relatorio do cucumber do tipo Jason: no caminho target/reports/cucumberReport.json, e um html em target/reports/
         */
        plugin = {"json:target/reports/cucumberReport.json", "html:target/reports/"},
        //Caminho onde esta os BDDs
        features = "src/main/resources/features",
        // Tag definida em message.feature , defino a teg aqui indicando que quero que rode somente esta feature
        //tags = {"@enviar-mensagem-sucesso"},
        //tags = {"~@ignore"} //toda feature com esta tag sera igonarada
        glue ={"steps"}

)
public class RunCucumberTest extends RunBase {

    public static final Browser browserUtilizado = Browser.FIREFOX;


    //Instaciando o selenium com drive do chorme (o drive foi adicionado arrastando o arquivo para a raiz do projeto chormedriver.exe)
    //WebDriver driver = new ChromeDriver();

    /*
    public static WebDriver driver;

    @BeforeClass // Esta anotação faz que antes de inciar o teste execute esta classe
    public static void start(){

        driver = new ChromeDriver();
    }
     */

    @AfterClass // Esta anotação faz que depois de inciar o teste execute esta classe
    public static void stop(){
        // Fecha o navegador
        driver.quit();
    }

}