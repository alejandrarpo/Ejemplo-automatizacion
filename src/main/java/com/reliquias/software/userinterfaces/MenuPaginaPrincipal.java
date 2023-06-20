package com.reliquias.software.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuPaginaPrincipal {

    public static final Target MENU_BUTTON = Target.the("Menu pagina de inicio").located(By.id("react-burger-menu-btn"));


    private MenuPaginaPrincipal() {
    }

}

