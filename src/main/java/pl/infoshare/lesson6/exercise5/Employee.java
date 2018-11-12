package pl.infoshare.lesson6.exercise5;

import java.io.Serializable;

public class Employee implements Serializable{

    public Employee(String name, String surName, String department, int salary) {
        this.name = name;
        this.surName = surName;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return (name + " " + surName + " from " + department);
    }
   
    private String name;
    private String surName;
    private String department;
    private int salary;
}
