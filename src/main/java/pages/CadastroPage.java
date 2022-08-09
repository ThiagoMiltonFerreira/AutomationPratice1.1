package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;


public class CadastroPage extends RunCucumberTest {



    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");
    private By first_name_field = By.id("customer_firstname");
    private By last_name_field = By.id("customer_lastname");
    private By password_field = By.id("passwd");

    private By select_day_field = By.id("days");
    private By select_month_field = By.id("months");
    private By select_year_field = By.id("years");

    private By address_field = By.id("address1");
    private By city_field = By.id("city");
    private By state_field = By.id("id_state");
    private By postcode_field = By.id("postcode");
    private By phone_mobile_field = By.id("phone_mobile");
    private By addressfuture_reference_field = By.id("alias");

    private By submit_account_buttom = By.id("submitAccount");



    public void selectTitle(Integer type) throws IllegalAccessException {
        Utils.esperarElementoEstarPresente(titleM,10);
        if (type == 1){
            getDriver().findElement(titleM).click();
        }else if (type == 2){
            getDriver().findElement(titleF).click();
        }

    }

    public void preencheNome(String name) throws IllegalAccessException{
        getDriver().findElement(first_name_field).sendKeys(name);
    }
    public void preencheSobreNome(String sobrenome) throws IllegalAccessException{
        getDriver().findElement(last_name_field).sendKeys(sobrenome);
    }
    public void preenchePassword() throws IllegalAccessException{
        getDriver().findElement(password_field).sendKeys(Utils.getRandomPassword());
    }
    public void selecionaAniversario(Integer day,Integer months, String year) throws IllegalAccessException{

        Select select_day = new Select(getDriver().findElement(select_day_field));
        select_day.selectByIndex(day);

        Select select_month = new Select(getDriver().findElement(select_month_field));
        select_month.selectByIndex(months);

        Select select_year = new Select(getDriver().findElement(select_year_field));
        select_year.selectByValue(year);


    }

    public void preencheAdress(String adress) throws IllegalAccessException{
        getDriver().findElement(address_field).sendKeys(adress);
    }
    public void preencheCity(String city) throws IllegalAccessException{
        getDriver().findElement(city_field).sendKeys(city);
    }
    public void selecionaEstado(String valueState) throws IllegalAccessException{

        Select select_state = new Select(getDriver().findElement(state_field));
        select_state.selectByValue(valueState);
    }
    public void preenchePostalCode(String postalCode) throws IllegalAccessException{
        getDriver().findElement(postcode_field).sendKeys(postalCode);
    }
    public void preenchePhoneMobile(String phone) throws IllegalAccessException{
        getDriver().findElement(phone_mobile_field).sendKeys(phone);
    }
    public void preencheReferenceAdress (String adressReference) throws IllegalAccessException{
        getDriver().findElement(addressfuture_reference_field).sendKeys(adressReference);
    }
    public void clickRegister() throws IllegalAccessException{
        getDriver().findElement(submit_account_buttom).click();
    }
    public void valida_cadastro(String nome, String sobrenome) throws IllegalAccessException{
        Utils.esperarElementoEstarPresente(By.className("myaccount-link-list"),10);
        String resultado_atual = getDriver().findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a > span")).getText();
        Assert.assertEquals(nome+" "+sobrenome, resultado_atual);

    }




}
