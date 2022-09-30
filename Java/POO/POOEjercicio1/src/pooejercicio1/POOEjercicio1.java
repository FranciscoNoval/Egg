/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio1;

import Entidades.Libro;
import Servicios.LibroServicio;

/**
 *
 * @author Flia. Noval
 */
public class POOEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LibroServicio servLib = new LibroServicio(); 
        
        Libro libro1 = servLib.cargarLibro();
        servLib.mostrarLibro(libro1);
        
        
    }
    
}
