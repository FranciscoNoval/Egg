/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Flia. Noval
 */
public class LibroServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    /**
     * Metodo que permite al usuario cargar todos los datos del libro
     * @return libro1
     */
    public Libro cargarLibro(){
        
        //Se instancia el objeto tipo Libro
        Libro libro1 = new Libro();
        
        System.out.println("Complete los datos del libro a continuación");
        System.out.println("");
        System.out.print("Ingrese el numero de ISBN: ");
        libro1.setIsbn(leer.nextInt());
        System.out.print("Ingrese el nombre: ");
        libro1.setTitulo(leer.next());
        System.out.print("Ingrese el autor: ");
        libro1.setAutor(leer.next());
        System.out.print("Ingrese el numero de paginas del libro: ");
        libro1.setnPaginas(leer.nextInt());
        System.out.println("");
        System.out.println("¡El libro fue cargado correctamente!");
        System.out.println("");
        
        return libro1;
    
    }
    
    /**
     * Metodo que imprime todos los datos del libro
     * @param libro 
     */
    public void mostrarLibro(Libro libro){
    
        System.out.println("El libro que usted ha solicitado:");
        System.out.println("--------------------------------------------");
        System.out.println("");
        System.out.println("Numero de ISBN: "+libro.getIsbn());
        System.out.println("Título: "+libro.getTitulo());
        System.out.println("Autor: "+libro.getAutor());
        System.out.println("Numero de páginas: "+libro.getnPaginas());
    }
}
