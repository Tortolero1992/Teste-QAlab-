package pages;

public class inicioSesionPage extends basePage {
    
    private String direcCorreoLoguin = "//input[@id='field-email']";
    private String contraseñaLoguin = "//input[@id='field-password']";
    private String botonIniciarSesion = "//button[@id='submit-login']";
    private String usuario = "tortolero1992@outlook.es";
    private String contraseña = "Prueba_123$"; 

    public inicioSesionPage(){
        super(driver);
    }

    public void LogueoPage(){
        write(direcCorreoLoguin, usuario );
        write(contraseñaLoguin, contraseña );
        clickElement(botonIniciarSesion);
    }

}
