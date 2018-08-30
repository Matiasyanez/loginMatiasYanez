package com.example.alumnoicin.loginmatiasyanez;

import io.realm.RealmObject;

/**
 * Created by Alumno ICIN on 30-08-2018.
 */

public class Alumno extends RealmObject {

    private int Rut;
    private String Nombre;
    private int Edad;
    private String Direccion;
    private int Sueldo;
    private String Cargo;

    public Alumno() {}

    public Alumno(int Rut, String Nombre, int Edad, String Direccion, int Sueldo, String Cargo){
        Rut = Rut;
        Nombre = Nombre;
        Edad = Edad;
        Direccion = Direccion;
        Sueldo = Sueldo;
        Cargo = Cargo;
    }

    public int getRut() {        return Rut;    }

    public void setRut(int rut) {        Rut = rut;    }

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
