/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Flia. Noval
 */
public class Aprendizaje13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingresa lado");
      int tam = leer.nextInt();
      
      for (int i = 1; i <= tam; i++){
          for (int j = 1; j <= tam; j++){
              
        if(i == 1 || i == tam || j == 1 || j == tam){
            System.out.print("* ");
        }else {
            System.out.print("  ");
        }
    }System.out.println("");       
    
}
}
}
