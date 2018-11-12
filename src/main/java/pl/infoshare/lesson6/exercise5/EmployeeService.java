package pl.infoshare.lesson6.exercise5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class EmployeeService {
    
    public EmployeeService(){
        //readEmployees();
//        listOfItEmployee = new LinkedList<Employee>();
//        listOfHrEmployee = new LinkedList<Employee>();
//        listOfDepartments = new LinkedList<Collection>();
    }
    
//    public void addNewEmployee(){
//        MenuService menuService = new MenuService();
//        Employee employee = generateEmployeeFromUserInput();
//        
//    }
    public void createNewEmployee() throws IOException {
        //MenuService menuService = new MenuService();
        //Wywolaj metode, ktora poprosi o username i password i przypisz nowy obiekt do zmiennej
        Employee employee = generateEmployeeFromUserInput();
        //dodanie pracownika do listy
        if (employee.getDepartment().equals("IT")) {
            Exercise5.listOfItEmployee.addLast(employee);        
        }else             
        if (employee.getDepartment().equals("HR")) {
            Exercise5.listOfHrEmployee.addLast(employee);
        }           
        else{
            employee = generateEmployeeFromUserInput();
        }    
        
    }
    
        
        //Wypisz informacje o poprawnie wykonanej operacji
        //menuService.printSuccess();
        //Zapytaj uzytkownika czy chce dodac kolejnego usera
        //menuService.shouldAddAnotherUser();

    /*
     Metoda odczytujaca plik z pracownikami dzialow przy otwarciu programu
    */
    
    /*
     Metoda zapisująca plik z pracownikami dzialow przy zamknieciu programu
    */
    
    /*
     Metoda proszaca o podanie username i password uzytkownika.
    */
    public Employee generateEmployeeFromUserInput() {
        ConsoleInputReader consoleInputReader = new ConsoleInputReader();
        return new Employee(
                consoleInputReader.getFieldFromUserInput("name"),
                consoleInputReader.getFieldFromUserInput("surName"),
                consoleInputReader.getFieldFromUserInput("department"),
                Integer.parseInt(consoleInputReader.getFieldFromUserInput("salary"))
        );
    }
    
//    LinkedList<Collection> listOfDepartments;
//    LinkedList<Employee> listOfHrEmployee;
//    LinkedList<Employee> listOfItEmployee;
//    Map<Integer, String> fileMap;
}
