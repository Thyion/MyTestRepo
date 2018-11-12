
package pl.infoshare.lesson6.exercise5;

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
                //Zerwanie switch
                menuService.start();
                //break;
            }
            //Jesli uzytkownik wybierze 2
            case "2": {
//                //Wczytanie linii z pliku
//                List<String> fileLines = new FileService().readLinesFromFile();
//                //Stworzenie tablicy uzytkownikow
//                User[] userArray = userService.generateUserArray(fileLines);
//                //Wypisanie tablicy uzytkownikow na ekran
//                userService.printUsersFromArray(userArray);
//
//                menuService.start();
//                //Zerwanie switch
                break;
            }

            case "3": {
                
                System.out.println(Exercise5.listOfDepartments);
                System.out.println(Exercise5.listOfHrEmployee);
                System.out.println(Exercise5.listOfItEmployee);
                menuService.start();
            }

            case "0": {
                employeeService.saveEmployees();
                System.exit(0);
            }

            //Jesli uzytkownik wybierze cokolwiek innego
            default: {
//                menuService.printError();
                break;
            }
        }
    }
}

