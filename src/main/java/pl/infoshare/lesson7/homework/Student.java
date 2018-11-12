package pl.infoshare.lesson7.homework;

import java.time.LocalDate;

public class Student extends Person {

    public Student(String name, String surName, boolean sex, LocalDate birthDate, int indexNumber){
        super(name, surName, sex, birthDate);
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
