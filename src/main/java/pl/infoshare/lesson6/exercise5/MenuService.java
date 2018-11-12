package pl.infoshare.lesson6.exercise5;

import java.io.IOException;

public class MenuService {
    private ConsoleInputReader consoleInputReader;
    private InputHandler inputHandler;
    private EmployeeService employeeService;

    public MenuService() {
        consoleInputReader = new ConsoleInputReader();
        inputHandler = new InputHandler();
        employeeService = new EmployeeService();    
    }
    
    public void start() throws IOException{
        
        //Wywolanie metody wyswietlajacej menu
        printMenu();

        //Wczytanie wyboru uzytkownika
        String userChoice = consoleInputReader.readUserInput();

        //Wywolaj metode do obslugi wyboru uzytkownika i przekaz pobrany z klawiatury wybor
        inputHandler.handleUserChoice(userChoice);
        
    }
    
     private void printMenu() {

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("========== MENU ==========");
        System.out.println("1.\t Dodaj uzytkownika.");
        System.out.println("2.\t Usun uzytkownikow.");
        System.out.println("3.\t Wyswietl uzytkownikow.");
        System.out.println();
        System.out.println("0.\t Wyjdz z programu.");
        System.out.print("Wybor: ");
}
}
