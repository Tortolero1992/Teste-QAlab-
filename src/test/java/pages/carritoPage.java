package pages;

public class carritoPage extends basePage{
    
    private String totuloPage = "//div[@class=\"card-block\"]";
    private String montoFinalCompra = "//div[@class=\"cart-summary-line cart-total\"]";

    public carritoPage(){
        super(driver);
    }

    public String validarTituloPage(){
        String valor = guardarElemento(totuloPage);
        return valor;
    }
    
    public float calculoMontoFinal(){
        float guardarElementoMontoCarrito = guardarElementoComoFloat(montoFinalCompra);
        return guardarElementoMontoCarrito;
    }
}
