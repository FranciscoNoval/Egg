/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraex6;

import Entidad.Sopa;
import Service.SopaService;

/**
 *
 * @author German
 */
public class ExtraEx6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SopaService ss = new SopaService();
        
        Sopa s1 = ss.llenarMatriz();
        
        ss.imprimirSopa(s1);
        
        ss.buscarPalabra(s1);
        
        ss.reemplazarPalabra(s1);
        
        ss.imprimirSopa(s1);
        
        ss.matrizInvertida(s1);
    
    }
    
}
