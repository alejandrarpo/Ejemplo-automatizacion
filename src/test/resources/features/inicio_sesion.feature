# author: Alejandra Restrepo
# date: 15/06/2023
# language: es

Característica: Iniciar sesion en saucedemo
  Como usuario quiero iniciar sesión en la página web de saucedemo

  @InicioSesionExitosoCredencialesCorrectas
  Escenario: Inicio de sesión exitoso
    Dado Pepito navega a la página de inicio de sesión
    Cuando inicia sesion con las credenciales de acceso usuario "standard_user" password "secret_sauce"
    Entonces deberia ver el menu del home

  @InicioSesionNoExitosoCredencialesIncorrectas
  Escenario: Inicio de sesión no exitoso
    Dado Pepito navega a la página de inicio de sesión
    Cuando inicia sesion con las credenciales de acceso usuario "Qwtyuo" password "ercvbn"
    Entonces deberia ver un mensaje de error