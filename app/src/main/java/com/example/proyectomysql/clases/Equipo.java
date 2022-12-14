package com.example.proyectomysql.clases;

import java.util.Objects;

public class Equipo {
    // Atributos
    private int idEquipo;
    private String nombreEquipo;
    private String ciudadEquipo;
    private int numJugadores;
    private int numTitulos;
    private int idLiga;
    // Constructor
    public Equipo(int idEquipo, String nombreEquipo, String ciudadEquipo, int numJugadores, int numTitulos, int idLiga) {
        this.idEquipo = idEquipo;
        this.nombreEquipo = nombreEquipo;
        this.ciudadEquipo = ciudadEquipo;
        this.numJugadores = numJugadores;
        this.numTitulos = numTitulos;
        this.idLiga = idLiga;
    }
    // Getters y Setters
    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getCiudadEquipo() {
        return ciudadEquipo;
    }

    public void setCiudadEquipo(String ciudadEquipo) {
        this.ciudadEquipo = ciudadEquipo;
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    public int getNumTitulos() {
        return numTitulos;
    }

    public void setNumTitulos(int numTitulos) {
        this.numTitulos = numTitulos;
    }

    public int getIdLiga() {
        return idLiga;
    }

    public void setIdLiga(int idLiga) {
        this.idLiga = idLiga;
    }
    // HasCode and Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equipo)) return false;
        Equipo equipo = (Equipo) o;
        return idEquipo == equipo.idEquipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEquipo);
    }
}
