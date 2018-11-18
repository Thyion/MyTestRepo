package pl.infoshare.lesson8.homework;

public class LecturerService {

    public LecturerService(){

    }

    public void createNewLecturer() {

        Lecturer lecturer = generateLecturerFromUserInput();
        FileService.listOfClasses.get(0).lecturer = lecturer;
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
