package com.bosonit.InyeccionDependencias;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public interface CiudadService {
    String getNombre();
    int getNumeroHabitantes();

    void setNombre(String nombre);

    void setNumeroHabitantes(int habitantes);

    void addCiudad(Ciudad ciudad);

    List listaCiudades();

    Ciudad getCiudad();

}
