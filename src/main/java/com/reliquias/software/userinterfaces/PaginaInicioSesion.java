package com.reliquias.software.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicioSesion {

    public static final Target USERNAME_FIELD = Target.the("Campo para ingresar el usuario").located(By.id("user-name"));
    public static final Target PASSWORD_FIELD = Target.the("Campo para ingresar el password de acceso").located(By.id("password"));
    public static final Target BUTTON_LOGIN = Target.the("Botón para login").located(By.id("login-button"));

    private PaginaInicioSesion() {
    }

}
