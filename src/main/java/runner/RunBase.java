package runner;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import support.Utils;

public class RunBase {

    static WebDriver driver;
    private static Browser browserAtual = null;
    public enum Browser{CHORME, FIREFOX}

    public static WebDriver getDriver() throws IllegalAccessException {
        if(driver == null ){
            return getDriver(browserAtual);
        }else{
            return driver;
        }

    }
    public static WebDriver getDriver(Browser browser) throws IllegalAccessException {

        if (driver != null){
            driver.quit();
        }
        switch (browser){
            case CHORME:
                browserAtual = Browser.CHORME;
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                browserAtual = Browser.FIREFOX;
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalAccessException("Passe um navegador valido");
        }
        return driver;
}

}
