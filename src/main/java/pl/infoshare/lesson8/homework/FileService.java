package pl.infoshare.lesson8.homework;
import java.io.*;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
public class FileService {   
    public static void saveClasses(){
        try {
            ObjectOutputStream outS = new ObjectOutputStream(new GZIPOutputStream(new FileOutputStream("classes.txt")));
            outS.writeObject(listOfClasses);
            outS.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void readClasses() {
        try {
            File plik = new File("classes.txt");
            if (!plik.exists()){
                plik.createNewFile();
            } else {
                ObjectInputStream inS = new ObjectInputStream(new GZIPInputStream(new FileInputStream("classes.txt")));
                ArrayList<Classes> classListFromFile = (ArrayList)inS.readObject();
                listOfClasses.addAll(classListFromFile);
                inS.close();       
            }
        } catch (IOException | ClassNotFoundException e) {
        }
    }
    static ArrayList<Classes> listOfClasses = new ArrayList();
}
