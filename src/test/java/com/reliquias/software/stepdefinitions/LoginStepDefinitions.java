package com.reliquias.software.stepdefinitions;

import com.reliquias.software.models.UsuarioGenerico;
import com.reliquias.software.questions.MenuPaginaPrincipal;
import com.reliquias.software.tasks.IniciarSesion;
import com.reliquias.software.tasks.NavegarPaginaWeb;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;

import static com.reliquias.software.utils.UrlPaginaWeb.PAGINA_INICIO_SESION_SWAG_LABS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {

    @Dado("{actor} navega a la página de inicio de sesión")
    public void usuarioNavegaPaginaDeInicioSesion(Actor actor) {
        actor.wasAbleTo(
                NavegarPaginaWeb.usandoUrl(PAGINA_INICIO_SESION_SWAG_LABS.getUrl()));


    }


    @Cuando("inicia sesion con las credenciales de acceso usuario {string} password {string}")
    public void iniciaSesionConLasCredencialesDeAccesoUsuarioPassword(String usuario, String password) {
        theActorInTheSpotlight().attemptsTo(
                IniciarSesion.paraUsuario(UsuarioGenerico.builder()
                        .user(usuario)
                        .password(password).build()));
    }


    @Entonces("deberia ver el menu del home")
    public void deberiaVerElMenuDelHome() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(MenuPaginaPrincipal.esta()));
    }

    @Entonces("deberia ver un mensaje de error")
    public void deberiaVerUnMensajeDeError() {

    }
}
