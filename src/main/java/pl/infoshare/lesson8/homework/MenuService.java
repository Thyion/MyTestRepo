package pl.infoshare.lesson8.homework;

import pl.infoshare.lesson6.exercise5.ConsoleInputReader;
import pl.infoshare.lesson6.exercise5.EmployeeService;
import pl.infoshare.lesson6.exercise5.InputHandler;

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
        printMenu();
        String userChoice = consoleInputReader.readUserInput();
        inputHandler.handleUserChoice(userChoice);
    }
    private void printMenu() {
        System.out.println("========== MENU ==========\n1.\t Dodaj studenta.\n2.\t Dodaj wykladowce.\n3.\t Stworz zajecia.\n4.\t Wyswietl zajecia.\n5.\t Wyswietl studentow.\n6.\t Wyswietl wykladowcow.\n7.\t Usun zajecia.\n8.\t Usun studenta\n \n0.\t Wyjdz z programu.\nWybor: ");
    }
}
