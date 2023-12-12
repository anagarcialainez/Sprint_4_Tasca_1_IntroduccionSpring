package cat.itacademy.barcelonactiva.garcialainez.ana.s04.t01.n01.S04T01N01GarciaLainezAna.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(name = "nom", defaultValue = "UNKNOWN") String nom){
        return "Hola" + nom + ". Estás ejecutando un proyecto Maven.";
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{nom}"})
    public String saluda2(@PathVariable(required = false) String nom){
            return "Hola, " + nom + ". Estás ejecutando un proyecto Maven";
    }
}

/*@RestController: Anotación que indica que esta clase es un controlador de Spring y que cada método manejará las solicitudes
HTTP y devolverá directamente los datos, en lugar de renderizar una vista.

@GetMapping("/HelloWorld"): Anotación que indica que el método saluda responderá a las solicitudes HTTP GET en la ruta "/HelloWorld".

(@RequestParam(name = "nom", defaultValue = "UNKNOWN") String nom)
Método saluda acepta un parámetro de solicitud llamado "nom". Si no se proporciona, toma el valor predeterminado "UNKNOWN".
Retorna una cadena saludando con el nombre proporcionado (o "UNKNOWN" si no se proporciona).

@GetMapping({"/HelloWorld2", "/HelloWorld2/{nom}"}): Anotación que indica que el método saluda2 responderá a las solicitudes HTTP GET en las rutas
 "/HelloWorld2" y "/HelloWorld2/{nom}".

 Método saluda2 acepta un parámetro de ruta llamado "nom". La opción required = false indica que este parámetro puede ser opcional
 (puede no estar presente en la ruta).
*/