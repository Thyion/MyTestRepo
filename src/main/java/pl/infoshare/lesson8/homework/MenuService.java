package pl.infoshare.lesson8.homework;
import java.io.IOException;
public class MenuService {
    private ConsoleInputReader consoleInputReader;
    private InputHandler inputHandler;
    public MenuService() {
        consoleInputReader = new ConsoleInputReader();
        inputHandler = new InputHandler();
    }
    public void start() throws IOException{
        printMenu();
        String userChoice = consoleInputReader.readUserInput();
        inputHandler.handleUserChoice(userChoice);
    }
    private void printMenu() {
        System.out.println("========== MENU ==========\n1.\t Dodaj studenta.\n2.\t Dodaj wykladowce.\n3.\t Stworz zajecia.\n4.\t Wyswietl zajecia.\n5.\t Wyswietl studentow.\n6.\t Wyswietl wykladowcow.\n7.\t Usun zajecia.\n8.\t Usun studenta\n \n0.\t Wyjdz z programu.\nWybor: ");
    }
    protected String printClassMenu() {
        return "========== MENU ==========\n1.\t Matematyka.\n2.\t Polski.\n3.\t Fizyka.";
    }
}
