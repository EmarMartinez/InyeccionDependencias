package com.bosonit.InyeccionDependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static java.lang.Integer.parseInt;

@RestController
public class Controlador1 {
    @Autowired
    PersonaService personaService;
    @Autowired
    CiudadService ciudadService;



    @PostMapping("/controlador1/addPersona")
    public PersonaService addPersona(@RequestHeader Map<String, String> headers) {
        headers.forEach((key, value) -> {
            System.out.println(String.format("Header '%s' = %s", key, value));
        });

        personaService.setNombre(headers.get("nombre"));
        personaService.setCiudad(headers.get("poblacion"));
        personaService.setEdad(parseInt(headers.get("edad")));

        return personaService;
    }

    @PostMapping("/controlador1/addCiudad")
    public void addCiudad(@RequestHeader Map<String, String> headers){
        ciudadService.setNombre(headers.get("nombre-ciudad"));
        ciudadService.setNumeroHabitantes(parseInt(headers.get("num-habitantes")));
        ciudadService.addCiudad(ciudadService.getCiudad());

    }
}
