package pl.infoshare.lesson8.homework;


import pl.infoshare.lesson6.exercise5.ConsoleInputReader;
import pl.infoshare.lesson6.exercise5.Employee;
import pl.infoshare.lesson6.exercise5.FileService;
import pl.infoshare.lesson6.exercise5.MenuService;

import java.io.IOException;


public class StudentService {

    public StudentService(){

    }

    public void createNewEmployee() throws IOException {

        Employee employee = generateEmployeeFromUserInput();

        switch(employee.getDepartment())
        {
            case "HR":
                FileService.listOfHrEmployee.addLast(employee);
                break;

            case "IT":
                FileService.listOfItEmployee.addLast(employee);
                break;

            default:
                System.out.println("Podales zle dane!!! Jeszcze raz.");
                createNewEmployee();
                break;
        }


    }

    public void deleteEmployee() throws IOException {
        MenuService menuService = new MenuService();

        Employee employee = generateDeleteEmployeeFromUserInput();

            if (employee.getDepartment().equals("IT")) {
                for(Employee employee1:FileService.listOfItEmployee) {
                    if (employee.getName().equals(employee1.getName()) && employee.getSurName().equals(employee1.getSurName())) {
                        FileService.listOfItEmployee.remove(employee1);
                        System.out.println("Usunięto pracownika : " + employee1.getName() + " " + employee1.getSurName() + " z dzialu " + employee1.getDepartment() + ".");
                        menuService.start();
                    }
                }
                System.out.println("Nie ma takiego pracownika");
            } else if (employee.getDepartment().equals("HR")) {
                for(Employee employee1:FileService.listOfHrEmployee) {
                    if (employee.getName().equals(employee1.getName()) && employee.getSurName().equals(employee1.getSurName())) {
                        FileService.listOfHrEmployee.remove(employee1);
                        System.out.println("Usunięto pracownika : " + employee1.getName() + " " + employee1.getSurName() + " z dzialu " + employee1.getDepartment() + ".");
                        menuService.start();
                    }
                }
                System.out.println("Nie ma takiego pracownika");
            } else {
                System.out.println("Nie ma takiego pracownika.");


            }

        menuService.start();

    }

    public Student generateStudentFromUserInput() {
        ConsoleInputReader consoleInputReader = new ConsoleInputReader();
        return new Student(
                consoleInputReader.getFieldFromUserInput("name"),
                consoleInputReader.getFieldFromUserInput("surName"),
                //cos do obslugi jaka koles wybral plec,
                Integer.parseInt(consoleInputReader.getFieldFromUserInput("salary"))
        );
    }
    String name, String surName, boolean sex, LocalDate birthDate, int indexNumber
    public Employee generateDeleteEmployeeFromUserInput() {
        ConsoleInputReader consoleInputReader = new ConsoleInputReader();
        return new Employee(
                consoleInputReader.getFieldFromUserInput("name"),
                consoleInputReader.getFieldFromUserInput("surName"),
                consoleInputReader.getFieldFromUserInput("department")
                )
        ;
    }

}
