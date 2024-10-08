package pages;


public class popValidacionCarrito extends basePage {



    static String modaLocator = "//div[@id=\"blockcart-modal\"]//div[@class=\"modal-body\"]";
    static String valorParaConfirmar = "//h6[contains(@class, 'product-name') and text()='Hummingbird printed t-shirt']";
    static String finalizarCompra = "//div[@class=\"cart-content-btn\"]//a[@class=\"btn btn-primary\"]";
    static String ventanaPrincipal = "//*[@id=\"cart\"]";
    static String cantidadElemento = "//span[@class=\"product-quantity\"]";
    static String monto = "//p[@class=\"product-price\"]";


    
    public popValidacionCarrito(){
        super(driver);
    }

    public void encontrandpModal(){
        switchToModal(modaLocator);
    }

    public String validacionCompra(){
        String valor = guardarElemento(valorParaConfirmar);
        return valor; 
    }

    public float validamosMonto(){
        float valorElemento = guardarElementoComoFloat(monto);
        float cantidadEmento = guardarElementoComoFloat(cantidadElemento); 
        float valorPago = valorElemento * cantidadEmento;
        return valorPago;
        
    }
    
    public void finalizarCompra(){
        
        clickElement(finalizarCompra);
    }
}