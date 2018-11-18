package pl.infoshare.lesson8.homework;
import java.io.IOException;
public class StudentService {
    private ClassesService classesService;
    private ConsoleInputReader consoleInputReader;
    public StudentService(){
        consoleInputReader = new ConsoleInputReader();
        classesService = new ClassesService();
    }
    public void createNewStudent() throws IOException {
        if(FileService.listOfClasses.isEmpty()){
            System.out.println("Musisz najpierw stworzyć jakąkolwiek klase...");
            classesService.createNewClasses();
        } else {
            int q = classesService.choseClass();
            Student student = generateStudentFromUserInput();
            FileService.listOfClasses.get(q).students.add(student);
        }
    }
    public Student generateStudentFromUserInput() {
        ConsoleInputReader consoleInputReader = new ConsoleInputReader();
        return new Student(
                consoleInputReader.getFieldFromUserInput("name"),
                consoleInputReader.getFieldFromUserInput("surName"),
                true,
                Integer.parseInt(consoleInputReader.getFieldFromUserInput("Index number"))
        );
    } 
    public int choseStudent(int s) {
        for(int i = 1 ; i <= FileService.listOfClasses.get(s).students.size(); i++){
            System.out.println(" " + i + FileService.listOfClasses.get(s).students.get(i-1).getName() + " " + FileService.listOfClasses.get(s).students.get(i-1).getName());
        }
        return (Integer.parseInt(consoleInputReader.getFieldFromUserInput("Który student?"))-1);
    }
    public void deleteStudentFromUserInput() {
        int q = classesService.choseClass();
        FileService.listOfClasses.get(q).students.remove(choseStudent(q));
    }
}
