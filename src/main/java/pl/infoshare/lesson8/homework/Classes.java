package pl.infoshare.lesson8.homework;
import java.io.Serializable;
import java.util.ArrayList;
public class Classes implements Serializable{
    public Classes(String nameOfClasses, int room){
        this.nameOfClasses = nameOfClasses;
        students = new ArrayList<>();
        this.room = room;
    }
    @Override
    public String toString() {
        return "\n" + "Zajęcia: " + nameOfClasses + "\nSala: " + room;
    }
    String nameOfClasses;
    Lecturer lecturer;
    int room;
    ArrayList<Student> students;
}
