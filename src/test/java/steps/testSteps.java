package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.inicioSesionPage;
import pages.carritoPage;
import pages.clothesPage;
import pages.paginaPrincipal;
import pages.popValidacionCarrito;
import pages.primerElentoMenPage;


public class testSteps {

   
    paginaPrincipal landingPage = new paginaPrincipal();
    inicioSesionPage loginPage = new inicioSesionPage();
    clothesPage selecionarElemento = new clothesPage();
    primerElentoMenPage agragarItems = new primerElentoMenPage();
    popValidacionCarrito accionesPopUp = new popValidacionCarrito();
    carritoPage validacionCarritoCompras = new carritoPage();

    @Given("estoy en la página de la tienda")
    public void abriendoPagina(){
        landingPage.navegar();
        landingPage.loginPages();
    }

    @And("me logueo con mi usuario y clave")
    public void iniciandoSesion(){
        loginPage.LogueoPage();
    } 

    @When("navego a la categoria Clothes y subcategoria Men")
    public void seleccionBarraNavegacion(){
        landingPage.barraNavegacio();
    }

    @And("agrego 2 unidades del primer producto al carrito")
    public void agregarProductoCarrito(){
        selecionarElemento.primerElemento();
        agragarItems.dosItems();    
  

    }

    @Then("valido en el popup la confirmación del producto agregado")
    public void confirmacionProducto(){
        String Valor = accionesPopUp.validacionCompra();
        String valorEsperado = "Hummingbird printed t-shirt";
        Assert.assertEquals(Valor, valorEsperado);

    }

    @And("valido en el popup que el monto total sea calculado correctamente")
    public void ValidamosCalculo(){
        float montoObtenido = accionesPopUp.validamosMonto();
        Assert.assertEquals(montoObtenido, 3824.0);

    }

    @When("Cuando finalizo la compra")
    public void validarCarrito(){
        accionesPopUp.finalizarCompra();
    }

    @Then("valido el titulo de la página del carritos")
    public void validarTitulo(){
        String Valor = validacionCarritoCompras.validarTituloPage();
        Assert.assertEquals(Valor, "CARRITO");

    }

    @And("vuelvo a validar el cálculo de precios en el carrito")
    public void ValidamosCalculoCarritoPage(){
        float montoObtenido = validacionCarritoCompras.calculoMontoFinal();
        Assert.assertEquals(montoObtenido, 0.3824000060558319);
    }

}

