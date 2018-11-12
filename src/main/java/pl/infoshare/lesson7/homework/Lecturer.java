package pl.infoshare.lesson7.homework;

import java.time.LocalDate;

public class Lecturer extends Person {

    public Lecturer(String name, String surName, boolean sex, LocalDate birthDate, String academicDegree){
        super(name, surName, sex, birthDate);
        this.academicDegree = academicDegree;

    }

    public void ostryOpierdol(){
        System.out.println("Ty idioto...");
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public String toString() {
        return super.toString() + "\n Stopin naukowy: " + academicDegree;
    }


    private String academicDegree;
}
