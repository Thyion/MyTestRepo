package pl.infoshare.lesson6.exercise5;
import java.io.IOException;
import java.util.LinkedList;
public class Exercise5 {
    public static void main(String[] args) throws IOException{
        
        listOfDepartments.clear();
        listOfHrEmployee.clear();
        listOfItEmployee.clear();
        
        new MenuService().start();
        
    }  
        static LinkedList<Employee> listOfHrEmployee = new LinkedList();
        static LinkedList<Employee> listOfItEmployee = new LinkedList();
        static LinkedList<LinkedList> listOfDepartments = new LinkedList();
        
        
}
       
