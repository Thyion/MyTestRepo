
package pl.infoshare.lesson8.homework;

import pl.infoshare.lesson6.exercise5.Employee;

import java.io.*;
import java.util.LinkedList;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;


public class FileService {
    

    public static void saveEmployees(){
        listOfDepartments.add(0, listOfHrEmployee);
        listOfDepartments.add(1, listOfItEmployee);
        try {
            ObjectOutputStream outS = new ObjectOutputStream(new GZIPOutputStream(new FileOutputStream("employees.txt")));
            outS.writeObject(listOfDepartments);
            outS.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void readEmployees() {
        try {
            File plik = new File("employees.txt");
            if (!plik.exists()){
                plik.createNewFile();
            } else {
                ObjectInputStream inS = new ObjectInputStream(new GZIPInputStream(new FileInputStream("employees.txt")));
                LinkedList<LinkedList> listOfDepartment;
                listOfDepartment = (LinkedList)inS.readObject();
                listOfDepartments.add(0, listOfDepartment.get(0));
                listOfDepartments.add(1, listOfDepartment.get(1));
                listOfHrEmployee = listOfDepartments.get(0);
                listOfItEmployee = listOfDepartments.get(1);
                inS.close();
            }
                    
        } catch (IOException | ClassNotFoundException e) {
        
        }

    }
        static LinkedList<Employee> listOfHrEmployee = new LinkedList();
        static LinkedList<Employee> listOfItEmployee = new LinkedList();
        static LinkedList<LinkedList> listOfDepartments = new LinkedList();
}
