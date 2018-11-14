package pl.infoshare.lesson8.homework;

public class ClassesService {

    public ClassesService(){

    }


    public void addStudentToClasses(Classes classes, Student student) {
        classes.students.add(student);
    }

    public void deleteStudentFromClasses(Classes classes, Student student) {
        // do ogarniecia sprawdzanie ktory to studentclasses.students.remove(1);

    }
}
