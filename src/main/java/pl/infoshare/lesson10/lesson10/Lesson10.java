package pl.infoshare.lesson10.lesson10;

import pl.infoshare.lesson9.lesson.Lesson;

import java.util.Objects;

public class Lesson10 {

    private String name;
    private String surName;
    private int wiek;

    public Lesson10(String name, String surName, int wiek){
        this.name = name;
        this.surName = surName;
        this.wiek = wiek;

    }

    //Lesson a = new Lesson();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson10 lesson10 = (Lesson10) o;
        return Objects.equals(name, lesson10.name) &&
                Objects.equals(surName, lesson10.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, wiek);
    }

}
