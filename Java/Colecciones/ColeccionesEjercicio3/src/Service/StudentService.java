/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entities.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private Student createStudent() {
        Student student = new Student();
        System.out.print("Ingrese el nombre del alumno: ");
        student.setName(leer.next());
        student.setNotes(new ArrayList<Double>());
        System.out.println("Ingrese sus notas");
        System.out.print("1º Trimestre: ");
        student.getNotes().add(leer.nextDouble());
        System.out.print("2º Trimestre: ");
        student.getNotes().add(leer.nextDouble());
        System.out.print("3º Trimestre: ");
        student.getNotes().add(leer.nextDouble());
        return student;
    }

    public ArrayList addStudent() {
        System.out.println("Registro de Estudiantes");
        ArrayList<Student> studentList = new ArrayList<>();
        int otro = 1;
        studentList.add(createStudent());
        while (otro != 2) {
            System.out.println("Quiere ingresar otro estudiante? Ingrese 1[SI] o 2[NO]");
            otro = leer.nextInt();
            if (otro == 1) {
                studentList.add(createStudent());
            } else if (otro != 1 && otro != 2) {
                System.out.println("El numero ingresado es incorrecto, ingreselo nuevamente");
                otro = leer.nextInt();
            } else {
                break;
            }
        }
        System.out.println("Se ha concluido la carga de estudiantes");
        return studentList;
    }

    public Double calculateFinalNote(ArrayList<Student> studentList) {
        double note = 0;
        for (Student student : studentList) {
            note = (student.getNotes().get(0) + student.getNotes().get(1)
                    + student.getNotes().get(2)) / 3;
            student.setFinalNote(note);
        }
        return note;
    }

    public void finalNote(ArrayList<Student> studentList) {
        int otro = 1;
        do {
            System.out.println("Ingrese el nombre del alumno del cual quiere saber la nota final");
            String name = leer.next();
            for (Student student : studentList) {
                if (student.getName().equalsIgnoreCase(name)) {
                    System.out.println("El promedio del alumno " + student.getName() + " es: " + student.getFinalNote());
                }
            }

            System.out.println("Quiere saber otro promedio? Ingrese 1[SI] o 2[NO]");
            otro = leer.nextInt();
            if (otro != 1 && otro != 2) {
                System.out.println("El numero ingresado es incorrecto, ingreselo nuevamente");
                otro = leer.nextInt();
            } else if (otro == 2) {
                break;
            }

        } while (otro == 1);
    }

    public void printStudent(ArrayList<Student> studentList) {
        System.out.println("LISTA DE ALUMNOS");
        System.out.println("-----------------");
        for (Student student : studentList) {
            System.out.println("Nombre: " + student.getName() + ", Notas: " + student.getNotes() + ", Nota final: " + student.getFinalNote());
        }
    }
}
