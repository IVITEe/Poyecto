/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libre;

/**
 *
 * @author josem
 */
public class PrestarLibro {
    private Libro libro;
    private String usuario;
    private int diasPrestamo;
 

    public PrestarLibro(Libro libro, String usuario, int diasPrestamo) {
        this.libro = libro;
        this.usuario = usuario;
        this.diasPrestamo = diasPrestamo;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setDiasPrestamo(int diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }

    public Libro getLibro() {
        return libro;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getDiasPrestamo() {
        return diasPrestamo;
    }
}

