package pl.infoshare.lesson8.homework;
public class LecturerService {
        private ClassesService classesService;
    public LecturerService(){
        classesService = new ClassesService();
    }
    public void createNewLecturer() {
        if(FileService.listOfClasses.isEmpty()){
            System.out.println("Musisz najpierw stworzyć jakąkolwiek klase...");
            classesService.createNewClasses();
        } else {
            int q = classesService.choseClass();
           Lecturer lecturer = generateLecturerFromUserInput();
            FileService.listOfClasses.get(q).lecturer = lecturer;
        }   
    }
    public Lecturer generateLecturerFromUserInput() {
        ConsoleInputReader consoleInputReader = new ConsoleInputReader();
        Lecturer lecturer = new Lecturer(
                consoleInputReader.getFieldFromUserInput("name"),
                consoleInputReader.getFieldFromUserInput("surName"),
                true,
                consoleInputReader.getFieldFromUserInput("AcademicDegree")
        );
        return lecturer;
    }
}
