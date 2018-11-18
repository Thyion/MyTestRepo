package pl.infoshare.lesson8.homework;


public class ClassesService {
    private MenuService menuService;
    private LecturerService lecturerService;
    private ConsoleInputReader consoleInputReader;


    public ClassesService(){
        lecturerService = new LecturerService();
        menuService = new MenuService();
        consoleInputReader = new ConsoleInputReader();
    }

    public void createNewClasses() {
        Classes classes = generateClassesFromUserInput();
        FileService.listOfClasses.add(classes);
    }

    public Classes generateClassesFromUserInput() {
        return new Classes(
                consoleInputReader.getFieldFromUserInput("Name of Classes"),
                Integer.parseInt(consoleInputReader.getFieldFromUserInput("room"))
        );
    }
    public void deleteClassesFromUserInput() {
        FileService.listOfClasses.remove(choseClass());
    }

    public void deleteStudentFromUserInput() {
        int q = choseClass();
        FileService.listOfClasses.get(q).students.remove(choseStudent(q));
    }

    public int choseStudent(int s) {
        for(int i = 0 ; i < FileService.listOfClasses.get(s).students.size(); i++){
            System.out.println(" " + i+1 + FileService.listOfClasses.get(s).students.get(i).getName() + " " + FileService.listOfClasses.get(s).students.get(i).getName());
        }
        return (Integer.parseInt(consoleInputReader.getFieldFromUserInput("Który student?"))-1);
    }

    public int choseClass() {
        for(int i = 0 ; i < FileService.listOfClasses.size(); i++){
            System.out.println(" " + i+1 + FileService.listOfClasses.get(i).nameOfClasses);
        }
        return (Integer.parseInt(consoleInputReader.getFieldFromUserInput("Które zajęcia?"))-1);
    }
}
