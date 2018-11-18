package pl.infoshare.lesson8.homework;
import java.io.Serializable;
import java.time.LocalDate;
public class Person implements Serializable{
    public Person(String name, String surName, boolean sex) {
        this.name = name;
        this.surName = surName;
        this.sex = sex;
        //this.birthDate = birthDate;
    }
    public String getName() {
        return name;
    }
    public String getSurName() {
        return surName;
    }
    public boolean isSex() {
        return sex;
    }
    //public LocalDate getBirthDate() {
    //    return birthDate;
    //}
    @Override
    public String toString() {
        return this.getClass().getSimpleName()+": \n Imie: " + name + "\n Nazwisko: " + surName + "\n Plec: " + whatSex(this.sex) + "\n Data urodzenia: " + birthDate;
    }
    public String whatSex(boolean sex){
        if(sex)
            return "Meska";
        else
            return "Zenska";
    }
    private String name;
    private String surName;
    private boolean sex;
    private LocalDate birthDate;
}
