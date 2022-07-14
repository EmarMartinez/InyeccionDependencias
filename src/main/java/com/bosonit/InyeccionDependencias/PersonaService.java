package com.bosonit.InyeccionDependencias;

public interface PersonaService {
    String getNombre();
    String getCiudad();
    int getEdad();
    void setNombre(String nombre);
    void setCiudad(String ciudad);
    void setEdad(int edad);

}
