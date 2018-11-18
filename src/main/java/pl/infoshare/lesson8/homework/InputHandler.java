package pl.infoshare.lesson8.homework;
import java.io.IOException;
public class InputHandler {
    public void handleUserChoice(String userChoice) throws IOException{
        StudentService studentService = new StudentService();
        MenuService menuService = new MenuService();
        ClassesService classesService = new ClassesService();
        LecturerService lecturerService = new LecturerService();
        switch (userChoice) {
            case "1": {
                studentService.createNewStudent();
                menuService.start();
            }
            case "2": {
                lecturerService.createNewLecturer();
                menuService.start();
            }
            case "3": {
                classesService.createNewClasses();
                menuService.start();
            }
            case "4": {
                classesService.showClasses();
                menuService.start();
            }
            case "5": {
                System.out.println(FileService.listOfClasses.get(classesService.choseClass()).students);
                menuService.start();
            }
            case "6": {
                System.out.println(FileService.listOfClasses.get(classesService.choseClass()).lecturer);
                menuService.start();
            }
            case "7": {
                classesService.deleteClassesFromUserInput();
                menuService.start();
            }
            case "8": {
                studentService.deleteStudentFromUserInput();
                menuService.start();
            }
            case "0": {
                FileService.saveClasses();
                System.exit(0);
            }
            default: {
                menuService.start();
            }
        }
    }
}

