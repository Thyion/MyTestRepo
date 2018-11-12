
package pl.infoshare.lesson6.exercise5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;


public class FileService {
    public void saveEmployees(){
        Exercise5.listOfDepartments.add(0, Exercise5.listOfHrEmployee);
        Exercise5.listOfDepartments.add(1, Exercise5.listOfItEmployee);
        try {
            ObjectOutputStream outS = new ObjectOutputStream(new GZIPOutputStream(new FileOutputStream("employees.txt")));
            outS.writeObject(Exercise5.listOfDepartments);
            outS.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        };
    }
    
    public void readEmployees() {
        try {
            File plik = new File("employees.txt");
            if (!plik.exists()){
                plik.createNewFile();
            } else {
                ObjectInputStream inS = new ObjectInputStream(new GZIPInputStream(new FileInputStream("employees.txt")));
                LinkedList<LinkedList> listOfDepartment = new LinkedList();
                listOfDepartment = (LinkedList)inS.readObject();
                Exercise5.listOfDepartments.add(0, listOfDepartment.get(0));
                Exercise5.listOfDepartments.add(1, listOfDepartment.get(1));
                //Exercise5.listOfDepartments = (LinkedList)inS.readObject();
                //fileMap = (Map)listOfDepartments.get(0);
                // wczytanie listpracownikow z listdepartamentow
                Exercise5.listOfHrEmployee = Exercise5.listOfDepartments.get(0);
                Exercise5.listOfItEmployee = Exercise5.listOfDepartments.get(1);
                plik.delete();
                inS.close();
            }
                    
        } catch (IOException | ClassNotFoundException e) {
            //System.out.println(e.getMessage());
        }

    }
}
