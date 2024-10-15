package com.conversor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConversorTemperaturaTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium-drives\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/ConversorTemperatura/");
    }

    @Test
    public void testConversaoCelsiusParaFahrenheit() throws InterruptedException {
        WebElement inputValor = driver.findElement(By.name("valor"));
        WebElement selectTipoConversao = driver.findElement(By.name("tipoConversao"));
        WebElement botaoConverter = driver.findElement(By.cssSelector("input[type='submit']"));

        inputValor.sendKeys("100");

        // Altere o valor para o valor correto do value
        selectTipoConversao.sendKeys("celsiusParaFahrenheit"); // Corrigido aqui
        botaoConverter.click();

        // Espera 2 segundos para garantir que a página carregou
        Thread.sleep(3000);

        WebElement resultado = driver.findElement(By.tagName("p"));
        System.out.println("Resultado: " + resultado.getText());
        assertTrue(resultado.getText().contains("212.0"));
    }



    @Test
    public void testConversaoFahrenheitParaCelsius() throws InterruptedException {
        WebElement inputValor = driver.findElement(By.name("valor"));
        WebElement selectTipoConversao = driver.findElement(By.name("tipoConversao"));
        WebElement botaoConverter = driver.findElement(By.cssSelector("input[type='submit']"));

        inputValor.sendKeys("212");

        // Altere o valor para o valor correto do value
        selectTipoConversao.sendKeys("fahrenheitParaCelsius"); // Corrigido aqui
        botaoConverter.click();

        // Espera 2 segundos para garantir que a página carregou
        Thread.sleep(2000);

        WebElement resultado = driver.findElement(By.tagName("p"));
        System.out.println("Resultado obtido: " + resultado.getText());
        assertTrue(resultado.getText().contains("100.0"));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
