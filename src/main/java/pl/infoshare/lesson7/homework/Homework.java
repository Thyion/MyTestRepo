package pl.infoshare.lesson7.homework;

import java.time.LocalDate;

public class Homework {

    public static void main(String[] args){
        Person person = new Person("Krzysztof", "BBB", true, LocalDate.of(1990,6,23));
        System.out.println(person);

        Person student = new Student("Tomasz", "CCC", true, LocalDate.of(1993,2,2), 125525);
        System.out.println(student);

        Person lecturer = new Lecturer("Nina", "DDD", false, LocalDate.of(1990,6,23), "Prof.");
        System.out.println(lecturer);

        Person scholar = new Scholar("Kasia", "EEE", false, LocalDate.of(1993,2,2), 125525, 5000);
        System.out.println(scholar);
    }

}
