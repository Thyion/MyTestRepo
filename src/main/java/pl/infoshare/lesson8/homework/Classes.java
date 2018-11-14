package pl.infoshare.lesson8.homework;

import java.util.ArrayList;

public class Classes {

    public Classes(int room, Lecturer lecturer){
        students = new ArrayList<>();
        this.room = room;
        this.lecturer = lecturer;
    }

    Lecturer lecturer;
    int room;
    ArrayList<Student> students;



}
