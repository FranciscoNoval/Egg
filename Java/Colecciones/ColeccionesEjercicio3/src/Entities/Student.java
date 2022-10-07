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
    private ArrayList<Double> notes;
    private Double finalNote;

    

    public Student() {
    }

    public Student(String name, ArrayList<Double> notes, Double finalNote) {
        this.name = name;
        this.notes = notes;
        this.finalNote = finalNote;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Double> notes) {
        this.notes = notes;
    }
    
    public Double getFinalNote() {
        return finalNote;
    }

    public void setFinalNote(Double finalNote) {
        this.finalNote = finalNote;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", notes=" + notes + ", finalNote=" + finalNote + '}';
    }

    
    
    
}
