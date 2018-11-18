package pl.infoshare.lesson8.homework;

import java.time.LocalDate;

public class Student extends Person {

    public Student(String name, String surName, boolean sex, int indexNumber){
        super(name, surName, sex);
        this.indexNumber = indexNumber;

    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public String toString() {
        return super.toString() + "\n IndexNumber: " + indexNumber;
    }


    private int indexNumber;


}
