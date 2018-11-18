package pl.infoshare.lesson8.homework;


public class Scholar extends Student {

    public Scholar(String name, String surName, boolean sex, int indexNumber, int scholarship){
        super(name,surName,sex,indexNumber);
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
