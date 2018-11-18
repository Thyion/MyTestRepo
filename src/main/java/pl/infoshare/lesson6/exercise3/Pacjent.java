package pl.infoshare.lesson6.exercise3;

public class Pacjent {

    public Pacjent(String name, String surName, String disease) {
        this.name = name;
        this.surName = surName;
        this.disease = disease;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

   
    

    public String toString() {
        return this.name;
    }
    private String name;
    private String surName;
    private String disease;

}
