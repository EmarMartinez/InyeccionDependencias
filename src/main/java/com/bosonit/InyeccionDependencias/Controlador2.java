package com.bosonit.InyeccionDependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controlador2 {


    @Autowired
    PersonaService personaService;

    @GetMapping("controlador2/getPersona")
    public PersonaService edadPorDos(){
        personaService.setEdad(personaService.getEdad()*2);

        return personaService;
    }

    @Autowired
    CiudadService ciudadService;

    @GetMapping("controlador2/getCiudad")
    @ResponseBody
    public List listaCiudades(){
        return ciudadService.listaCiudades();


    }
}
