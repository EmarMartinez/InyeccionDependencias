package com.bosonit.InyeccionDependencias;

import org.springframework.stereotype.Service;

@Service
public class PersonaImplementation implements PersonaService{
    Persona person = new Persona();

    @Override
    public String getNombre() {
        return person.getNombre();
    }

    @Override
    public String getCiudad() {
        return person.getPoblacion();
    }

    @Override
    public int getEdad() {
        return person.getEdad();
    }

    @Override
    public void setNombre(String nombre) {
        person.setNombre(nombre);
    }

    @Override
    public void setCiudad(String ciudad) {
        person.setPoblacion(ciudad);
    }

    @Override
    public void setEdad(int edad) {
        person.setEdad(edad);
    }
}
