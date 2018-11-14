package pl.infoshare.lesson8.homework;
import pl.infoshare.lesson6.exercise5.EmployeeService;
import pl.infoshare.lesson6.exercise5.MenuService;
import java.io.IOException;

public class InputHandler {

    public void handleUserChoice(String userChoice) throws IOException{
        EmployeeService employeeService = new EmployeeService();
        MenuService menuService = new MenuService();
        //Obsluga wyboru uzytkownika
        switch (userChoice) {
            //Jesli uzytkownik wybierze 1
            case "1": {
                employeeService.createNewEmployee();
                 menuService.start();

            }
            //Jesli uzytkownik wybierze 2
            case "2": {
                employeeService.deleteEmployee();
                menuService.start();

            }
            //Jesli uzytkownik wybierze 3
            case "3": {

                System.out.println("W bazie są pracownicy 2 dzialow: HR i IT.");
                System.out.println("Pracownicy dzialu HR: ");
                System.out.println(FileService.listOfHrEmployee);
                System.out.println("Pracownicy dzialu IT: ");
                System.out.println(FileService.listOfItEmployee);
                menuService.start();
            }
            //Jesli uzytkownik wybierze 0
            case "0": {
                FileService.saveEmployees();
                System.exit(0);
            }

            //Jesli uzytkownik wybierze cokolwiek innego
            default: {
                menuService.start();
            }
        }
    }
}

