/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libre;



/**
 *
 * @author josem
 */
public class Biblioteca {
    private Nodo inicio;
     private int tamaño;
     
    public Biblioteca() {
        inicio = null;
        tamaño = 0;
    }
    
    private class Nodo {
        private Libro libro;
        private Nodo siguiente;

        public Nodo(Libro libro) {
            this.libro = libro;
            siguiente = null;
        }
    }
    

    public void agregarLibro(Libro libro) {
        Nodo nuevoNodo = new Nodo(libro);
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            Nodo actual = inicio;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
       
    }
 
    
    public Libro buscarLibro(String titulo) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.libro.getTitulo().equals(titulo)) {
                return actual.libro;
            }
            actual = actual.siguiente;
        }
        return null;
    }

  
    
    
    public void prestarLibro(String titulo, String usuario, int diasPrestamo) {
    
    Libro libro = buscarLibro(titulo);
    if (libro == null) {
        System.out.println("El libro no se encuentra en la biblioteca");
    } else {
        PrestarLibro prestamo = new PrestarLibro(libro, usuario, diasPrestamo);
        agregarPrestamo(prestamo);
        System.out.println("El libro " + libro.getTitulo() + " se ha prestado a " + usuario + " por " + diasPrestamo + " días");
    }
}

    public void devolverLibro(String titulo) {
        PrestarLibro prestamo = buscarPrestamo(titulo);
        if (prestamo == null) {
            System.out.println("El libro no está prestado en la biblioteca");
        } else {
            eliminarPrestamo(prestamo);
            System.out.println("El libro " + prestamo.getLibro().getTitulo() + " se ha devuelto");
        }
    }
  public void eliminarLibro(String titulo) {
    Nodo anterior = null;
    Nodo actual = inicio;
    while (actual != null) {
        if (actual.libro.getTitulo().equals(titulo)) {
            if (anterior == null) {
                inicio = actual.siguiente;
            } else {
                anterior.siguiente = actual.siguiente;
            }
            System.out.println("Libro \"" + titulo + "\" eliminado correctamente.");
            return;
        }
        anterior = actual;
        actual = actual.siguiente;
    }
    System.out.println("El libro \"" + titulo + "\" no se encontró en la biblioteca.");
}

  



    private  void agregarPrestamo(PrestarLibro prestamo) {
      
    }

    private PrestarLibro buscarPrestamo(String titulo) {  
        return null;
    }

    private void eliminarPrestamo(PrestarLibro prestamo) {
    prestamo=null;
    }
    /**
     * private void prestarlibro buscarprestamo (buscarPrestamo prestamo)
     * 
     */
    //:D
}

