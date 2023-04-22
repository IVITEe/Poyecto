/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libre;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Libre {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. borrar libros");
             System.out.println("6. salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el título del libro:");
                    String titulo = scanner.nextLine();
                    System.out.println("Ingrese el autor del libro:");
                    String autor = scanner.nextLine();
                    System.out.println("Ingrese el año de publicación del libro:");
                    int anioPublicacion = scanner.nextInt();
                    scanner.nextLine();
                    Libro libro = new Libro(titulo, autor, anioPublicacion);
                    biblioteca.agregarLibro(libro);
                    System.out.println("Libro agregado correctamente");
                    break;
                case 2:
                    System.out.println("Ingrese el título del libro:");
                    titulo = scanner.nextLine();
                    libro = biblioteca.buscarLibro(titulo);
                    if (libro == null) {
                        System.out.println("El libro no se encuentra en la biblioteca");
                    } else {
                        System.out.println("Información del libro:");
                        System.out.println("Título: " + libro.getTitulo());
                        System.out.println("Autor: " + libro.getAutor());
                        System.out.println("Año de publicación: " + libro.getAnioPublicacion());
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el título del libro que desea prestar:");
                    titulo = scanner.nextLine();
                    System.out.println("Ingrese el nombre del usuario que realizará el préstamo:");
                    String usuario = scanner.nextLine();
                    System.out.println("Ingrese la cantidad de días del préstamo:");
                    int diasPrestamo = scanner.nextInt();
                    scanner.nextLine();
                    biblioteca.prestarLibro(titulo, usuario, diasPrestamo);
                    break;
                case 4:
                    System.out.println("Ingrese el título del libro que desea devolver:");
                    titulo = scanner.nextLine();
                    biblioteca.devolverLibro(titulo);
                    break;
                case 5:
                /**
                    System.out.println("Ingrese el nombre del nuevo bibliotecario:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese apellido :");
                    String apellido = scanner.nextLine();
                    Bibliotecario bibliotecario = new Bibliotecario(nombre, apellido);
                    System.out.println("El bibliotecario " + bibliotecario.getNombre() + " ha sido agregado con éxito");
                    
                 **/
                       Bibliotecario bibliotecario = new Bibliotecario("Juan", "Perez", "juan123", "contraseña123");

                        boolean contraseñaCorrecta = false;
                        while (!contraseñaCorrecta) {
                        System.out.println("Ingrese su usuario:");
                        String juan123 = scanner.nextLine();
                        System.out.println("Ingrese su contraseña:");
                        String contraseña = scanner.nextLine();
                       
                        // Comprobar si el usuario y la contraseña son correctos
                        if (juan123.equals("juan123") && contraseña.equals("1234")) {
                            contraseñaCorrecta = true;
                            System.out.println("Bienvenido al sistema de biblioteca."+ juan123);
                               
                             System.out.print("Ingrese el título del libro a eliminar: ");
                             String tituloEliminar = scanner.nextLine();
                            biblioteca.eliminarLibro(tituloEliminar);
                             break;
                            
                        }  else {
                            System.out.println("Usuario o contraseña incorrectos. ");
                           break;
                        }
                    }
    
                    break;
            
            
                    
                case 6:
                      System.exit(0);
                    
                default:
                    System.out.println("Opción inválida");
                    break;
            }

        } while (opcion != 6);

        scanner.close();
    }

}


