/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Flia. Noval
 */
public class RectanguloServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo crearRectangulo() {
        Rectangulo rec = new Rectangulo();
        System.out.println("Dimensionemos el rectángulo");
        System.out.print("Ingrese la base");
        System.out.print(">> ");
        rec.setBase(leer.nextInt());
        System.out.print("Ahora ingrese la altura");
        System.out.print(">> ");
        rec.setAltura(leer.nextInt());

        return rec;
    }

    public double superficie(Rectangulo r) {

        double sup = r.getBase() * r.getAltura();

        return sup;
    }

    public double perimetro(Rectangulo r) {
        double per = (r.getBase() + r.getAltura()) * 2;

        return per;
    }

    public void imprimirRectangulo(Rectangulo r) {
        int baseR = (int)r.getBase();
        int alturaR = (int)r.getAltura();
        for (int i=0; i <= alturaR; i++) {
            for (int j=0; j <= baseR; j++) {
                if (i == 0 || i ==  alturaR || j == 0 || j == baseR){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
        
            }
            System.out.println("");
        }
    }
}
