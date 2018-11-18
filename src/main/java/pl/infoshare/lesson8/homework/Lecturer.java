package pl.infoshare.lesson8.homework;


public class Lecturer extends Person {
    public Lecturer(String name, String surName, boolean sex,String academicDegree){
        super(name, surName, sex);
        this.academicDegree = academicDegree;
    }
    public String toString() {
        return super.toString() + "\n Stopin naukowy: " + academicDegree;
    }
    private final String academicDegree;
}
