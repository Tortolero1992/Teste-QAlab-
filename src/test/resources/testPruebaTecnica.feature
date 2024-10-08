Feature: Validar la funcionalidad del carrito de compras 
   Asegurar que dicha funcionalidad siempre funcione adecuadamente 
   después de realizar mejoras o cambios en el aplicativo web.

    Scenario Outline: Validación del Precio de un Producto
        Given estoy en la página de la tienda
        And me logueo con mi usuario y clave
        When navego a la categoria Clothes y subcategoria Men
        And agrego 2 unidades del primer producto al carrito
        Then valido en el popup la confirmación del producto agregado
        And valido en el popup que el monto total sea calculado correctamente
        When Cuando finalizo la compra 
        Then valido el titulo de la página del carritos
        And vuelvo a validar el cálculo de precios en el carrito
