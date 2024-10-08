package pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basePage {
    
    //Declaro la variable Diver como elemento WebDriver 
    protected static WebDriver driver;

    //Declaramos la variable WebDriverWait paraa hacer que el navegador espere 5 segundos por defecto
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    //Creamos un metodo estatico para la instancia del Webdrive Chrome 
    static{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    //Creamos el constructor de clase     
    public basePage(WebDriver driver){
        basePage.driver = driver;
    }

    //Llamamos a la url para navegar a la pagina
    public void navedarTo(String url){
        driver.get(url);
    }

    //Cerramos el Navegador
    public static void closeBrowser(){
        driver.quit();
    }

    //este metodo sirve para esperar que aparezca el elemento que yo estoy buscando 
    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }
       
    //esta funcion nos permite hacer clic a los eslementos de la pagina
    public void clickElement(String locator){
        Find(locator).click();
    }

    // Método que cambia a la ventana modal y realiza la interacción
    public void switchToModal(String mainWindowHandle) {
        // Obtiene los handles de todas las ventanas abiertas
        Set<String> windowHandles = driver.getWindowHandles();

        // Recorre todas las ventanas abiertas
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(mainWindowHandle)) {
                // Cambia a la nueva ventana/modal
                driver.switchTo().window(windowHandle);
                break;
                }
            }
        }

    //Almacenar elemento que se puede usar para hacer una comparacion  
    public String guardarElemento (String locator) {
        WebElement elemento = Find(locator);
        return elemento.getText();
        
    }

    // Método para obtener el valor de un elemento y convertirlo a float
    public float guardarElementoComoFloat(String locator) {
    WebElement elemento = Find(locator);
    String texto = elemento.getText();
    texto = texto.replaceAll("[^\\d.]", "");
    return Float.parseFloat(texto);
}
    
    // Método para volver a la ventana principal después de interactuar con un modal
    public void switchBackToMainWindow(String locator) {
        driver.switchTo().window(locator);
    }

    //Esta funcion nos permite LImpiar y escribir sobre un compo de texto 
    public void write(String locator, String keysToSend){
        Find(locator).clear();
        Find(locator).sendKeys(keysToSend);
    }  

  }