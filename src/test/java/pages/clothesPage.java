package pages;

public class clothesPage extends basePage {

    private String seleccionPrimerElemento = "//article[@data-id-product='1']";
    
   

    public clothesPage(){
        super(driver);
    }

    public void primerElemento(){
        clickElement(seleccionPrimerElemento);
          
    }


}
