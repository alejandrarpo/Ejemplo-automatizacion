package com.reliquias.software.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.reliquias.software.userinterfaces.MenuPaginaPrincipal.MENU_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@Subject("Menu hamburguesa de pagina principal")
public class MenuPaginaPrincipal implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(MENU_BUTTON, isVisible()).forNoMoreThan(30).seconds());
        return MENU_BUTTON.isVisibleFor(actor);
    }

    public static Question<Boolean> esta() { return new MenuPaginaPrincipal();
    }
}