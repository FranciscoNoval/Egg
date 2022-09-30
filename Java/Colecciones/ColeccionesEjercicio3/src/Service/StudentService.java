/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entities.Student;
import java.util.Scanner;

public class StudentService {
    
    public Student studentCreate(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Student student = new Student();
        
        return student;
    }
}
