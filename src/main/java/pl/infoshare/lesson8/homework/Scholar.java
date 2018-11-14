package pl.infoshare.lesson8.homework;

import java.time.LocalDate;

public class Scholar extends Student {

    public Scholar(String name, String surName, boolean sex, LocalDate birthDate, int indexNumber, int scholarship){
        super(name,surName,sex,birthDate,indexNumber);
        this.scholarship = scholarship;
    }

    public int getScholarship() {
        return scholarship;
    }
    public String toString() {
        return super.toString() + "\n Stypendium: " + scholarship;
    }


    private int scholarship;
}
