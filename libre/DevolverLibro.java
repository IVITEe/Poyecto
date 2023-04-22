/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libre;

/**
 *
 * @author josem
 */
public class DevolverLibro {
private PrestarLibro prestamo;
private int diasRetraso;
private Libro libro;

public DevolverLibro(Libro libro, PrestarLibro prestamo, int diasRetraso) {
    this.prestamo = prestamo;
    this.diasRetraso = diasRetraso;
     this.libro = libro;
}

public PrestarLibro getPrestamo() {
    return prestamo;
}

public int getDiasRetraso() {
    return diasRetraso;
}

 public Libro getLibro() {
        return libro;
    }
}

