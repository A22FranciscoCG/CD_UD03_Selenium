import static org.junit.Assert.assertEquals;

import java.sql.Driver;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * FormText
 */
public class FormText {

    WebDriver driver;

    @Before
    public void setUP() {
        System.setProperty("webdriver.chrome.driver", "/home/sanclemente.local/a22franciscocg/Escritorio/selenium/CD_UD03_Selenium/driver/chromedriver");
         driver = new ChromeDriver();
        
    }


    @Test
    public void test_checkbox () {
        driver.get("file:///home/sanclemente.local/a22franciscocg/Escritorio/selenium/CD_UD03_Selenium/src/index.html");
        WebElement checkboxPinha = driver.findElement(By.name("pinha"));
        WebElement checkboxSinPinha = driver.findElement(By.name("sin_pinha"));

        checkboxPinha.click();
        checkboxSinPinha.click();

        assertEquals(false, checkboxPinha.isSelected());
        assertEquals(true, checkboxSinPinha.isSelected());
    }


    @Test
    public void testRadios() {
        driver.get("file:///home/sanclemente.local/a22franciscocg/Escritorio/selenium/CD_UD03_Selenium/src/index.html");

        WebElement masaGruesa = driver.findElement(By.xpath("//input[@name='boton' and @value='1']"));
        WebElement masaFina = driver.findElement(By.xpath("//input[@name='boton' and @value='2']"));
        WebElement clasica = driver.findElement(By.xpath("//input[@name='boton' and @value='3']"));

        masaGruesa.click();
        masaFina.click();
        clasica.click();

        assertEquals(false, masaGruesa.isSelected());
        assertEquals(false, masaFina.isSelected());
        assertEquals(true, clasica.isSelected());

    }


    @Test
    public void testComo(){
       Select menu = new Select(driver.findElement(By.name("name")));
       menu.selectByIndex(0);
       menu.selectByValue("2");
       menu.selectByVisibleText("Tres");

    }




}