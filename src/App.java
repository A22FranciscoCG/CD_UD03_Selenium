import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

public static void main(String[] args) {
    
    System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
    WebDriver driver = new ChromeDriver();

    try {
        driver.get("https://es.wikipedia.org/");
        /* WebElement cajaBusqueda = driver.findElement(By.id("searchInput"));
        cajaBusqueda.sendKeys("Selenium");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("n-newpages")).click();
        driver.findElement(By.linkText("Página aleatoria")).click();
        System.out.println(driver.findElement(By.id("firstHeading")));    
        
        WebElement tituloPagina = driver.findElement(By.id("firstHeading"));
        System.out.println(tituloPagina.getText()); 
        assertEquals("Páginas nuevas", tituloPagina.getText()); */

       /*  WebElement title = driver.findElement(By.tagName("title"));
        System.out.println(title.getAttribute("innerText")); */
        
      /*  WebElement footer = driver.findElement(By.tagName("footer"));
        System.out.println(footer.getAttribute("role")); */

      /*   List<WebElement> elementosDiv = driver.findElements(By.tagName("div"));
        for (WebElement webElement : elementosDiv) {
            System.out.println(webElement.getAttribute("innerText"));
            }
        

        for (int i=0; i<elementosDiv.size(); i++) {
            WebElement webElement = elementosDiv.get(i);
            System.out.println(webElement.getText());
        }   */

        WebElement buscador = driver.findElement(By.id("searchInput"));
        WebElement botonBusqueda = driver.findElement(By.id("searchButton"));    
            
            buscador.sendKeys("Toques");
            botonBusqueda.sendKeys(Keys.ENTER);

        
        assertEquals("Toques", driver.getTitle()); 
            

        



        Thread.sleep(3000);

    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    driver.quit();
}

@Test
public void test_checkbox() {
    System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("index.html");
    
}

}