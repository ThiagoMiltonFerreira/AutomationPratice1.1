package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.security.SecureRandom;
import java.util.Random;


public class Utils extends RunCucumberTest {

    public static void esperarElementoEstarPresente(By element, int tempo) throws IllegalAccessException {

        // Recebe o driver do chome atual e o tempo em segundo que ira esperar o elemento ficar visivel
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);

        // Esperar.ate (Recebe o elemento que deve esperar ficar visivel "espera uma condição.elementoficarvisivel(qual elemento)")
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static String getRandomEmail(){
        String email_init = "qazando_";
        String email_final = "@qazando.com.br";

        Random random = new Random();
        int minino = 1;
        int maximo = 99999999;
        int resultado = random.nextInt(maximo-minino) + minino;

        return email_init + resultado + email_final;
    }

    public static String getRandomPassword(){
        // intervalo ASCII – alfanumérico (0-9, a-z, A-Z)
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        // cada iteração do loop escolhe aleatoriamente um caractere do dado
        // intervalo ASCII e o anexa à instância `StringBuilder`

        for (int i = 0; i < 10; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }

        return sb.toString();
    }

}
