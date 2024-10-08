package pages;

public class paginaPrincipal extends basePage {

    private String inicioSesionLink = "//span[normalize-space()='Iniciar sesión']";
    private String barraNavegacioClothes = "//li[@id='category-3']//a[@class='dropdown-item']";
    private String subBarraNavegacionMen = "//a[text()=\"Men\"]";  
     

    public paginaPrincipal(){
        super(driver);
    }
    
    public void navegar(){
        navedarTo("https://qalab.bensg.com/store");
    }

    public void loginPages(){
        clickElement(inicioSesionLink);
    }

    public void barraNavegacio(){
        clickElement(barraNavegacioClothes);
        clickElement(subBarraNavegacionMen);
    }
}
