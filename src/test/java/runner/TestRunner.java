package runner; 

import org.junit.AfterClass;
// import org.junit.AfterClass;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
// import pages.basePage;
import pages.basePage;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\resources\\testPruebaTecnica.feature", //agregamos la ruta de donde estan nuestro achivos .feature 
                glue = "steps", //es donde tenemos nuestras clases que definen los steps escrito en la carpeta freature
                plugin= { "pretty","html:target/cucumber-report" })

                public class TestRunner {
    
                @AfterClass
                public static void clearDriver(){
                basePage.closeBrowser();
                }
              }
        
