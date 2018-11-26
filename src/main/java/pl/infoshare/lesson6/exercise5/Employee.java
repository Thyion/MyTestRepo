package pl.infoshare.lesson6.exercise5;

import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;

public class Employee implements Serializable{

    public Employee(String name, String surName, String department, int salary) {
        this.name = name;
        this.surName = surName;
        this.department = department;
        this.salary = salary;
    }
    public Employee(String name, String surName, String department) {
        this.name = name;
        this.surName = surName;
        this.department = department;
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

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(name)
                .append(salary)
                .build();

    }

    private String name;
    private String surName;
    private String department;
    private int salary;
}
