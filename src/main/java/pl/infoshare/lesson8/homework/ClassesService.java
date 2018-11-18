package pl.infoshare.lesson8.homework;
public class ClassesService {
    private MenuService menuService;
    private ConsoleInputReader consoleInputReader;
    public ClassesService(){   
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
    public int choseClass() {
        if(FileService.listOfClasses.isEmpty()){
            System.out.println("Musisz najpierw stworzyć jakąkolwiek klase...");
            createNewClasses();
        }
        for(int i = 1 ; i <= FileService.listOfClasses.size(); i++){
            System.out.println("Istniejące zajęcia: ");
            System.out.println(i + " - " +FileService.listOfClasses.get(i-1).nameOfClasses);
        }
        return (Integer.parseInt(consoleInputReader.getFieldFromUserInput("Które zajęcia?"))-1);
    }
    public void showClasses() {
        int q = choseClass();
        System.out.println("Zajęcia: " + FileService.listOfClasses.get(q).nameOfClasses);
        if(FileService.listOfClasses.get(q).lecturer==null)
            System.out.println("Nie ma jeszcze prowadzącego");
        else {
            System.out.println("Prowadzący: ");
            System.out.println(FileService.listOfClasses.get(q).lecturer);        
            }
        if(FileService.listOfClasses.get(q).students.isEmpty())
            System.out.println("Nie ma jeszcze studentów");
        else{
            System.out.println("Studenci na tych zajęciach: ");
            for(int i=0; i< FileService.listOfClasses.get(q).students.size();i++){
            System.out.println(FileService.listOfClasses.get(q).students.get(i));
            }
        }
    }
    
}
