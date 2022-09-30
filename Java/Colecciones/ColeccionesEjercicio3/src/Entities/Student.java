/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;

/**
 *
 * @author Flia. Noval
 */
public class Student {
    private String name;
    private ArrayList<Integer> notes;

    public Student() {
    }

    public Student(String name, ArrayList<Integer> notes) {
        this.name = name;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Integer> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", notes=" + notes + '}';
    }
    
    
}
