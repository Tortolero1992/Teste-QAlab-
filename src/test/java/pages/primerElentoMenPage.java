package pages;


public class primerElentoMenPage extends basePage{

    static String botonMas = "//i[@class='material-icons touchspin-up']";
    static String botonAgregarCarrito = "//button[@class='btn btn-primary add-to-cart']";
    

    public primerElentoMenPage(){
        super(driver);
    }

    public void dosItems (){
        
        clickElement(botonMas);
        clickElement(botonAgregarCarrito);
        
    }
}
