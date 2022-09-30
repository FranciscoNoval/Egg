/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra3;


import Entidades.Raices;
import Servicios.RaicesServicio;

/**
 *
 * @author Flia. Noval
 */
public class POOExtra3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaicesServicio rs = new RaicesServicio();
        
        Raices raices = rs.constructor();
        rs.getDiscriminante(raices);
        rs.tieneRaices(raices);
        rs.tieneRaiz(raices);
        rs.obtenerRaices(raices);
    }
    
}
