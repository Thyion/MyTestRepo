package pl.infoshare.lesson8.homework;
import java.time.LocalDate;
public class Lecturer extends Person {
    public Lecturer(String name, String surName, boolean sex, LocalDate birthDate, String academicDegree){
        super(name, surName, sex, birthDate);
        this.academicDegree = academicDegree;
    }
    public String toString() {
        return super.toString() + "\n Stopin naukowy: " + academicDegree;
    }
    private String academicDegree;
}
