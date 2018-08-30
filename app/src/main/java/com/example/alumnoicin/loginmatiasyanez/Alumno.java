package com.example.alumnoicin.loginmatiasyanez;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Alumno ICIN on 30-08-2018.
 */

public class Alumno extends RealmObject {

    @PrimaryKey
    private String Rut;
    private String Nombre;
    private int Edad;
    private String Direccion;
    private int Sueldo;
    private String Cargo;

    public Alumno() {}

    public Alumno(String rut, String nombre, int edad, String direccion, int sueldo, String cargo){
        Rut = rut;
        Nombre = nombre;
        Edad = edad;
        Direccion = direccion;
        Sueldo = sueldo;
        Cargo = cargo;
    }

    public String getRut() {        return Rut;    }

    public void setRut(String rut) {        Rut = rut;    }

    public String getNombre() {        return Nombre;    }

    public void setNombre(String nombre) {        Nombre = nombre;    }

    public int getEdad() {        return Edad;    }

    public void setEdad(int edad) {        Edad = edad;    }

    public String getDireccion() {        return Direccion;    }

    public void setDireccion(String direccion) {        Direccion = direccion;    }

    public int getSueldo() {        return Sueldo;    }

    public void setSueldo(int sueldo) {        Sueldo = sueldo;    }

    public String getCargo() {        return Cargo;    }

    public void setCargo(String cargo) {        Cargo = cargo;    }
}
