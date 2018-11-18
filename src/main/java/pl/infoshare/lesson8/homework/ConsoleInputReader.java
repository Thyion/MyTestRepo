package pl.infoshare.lesson8.homework;
import java.util.Scanner;
public class ConsoleInputReader {

    public String getFieldFromUserInput(String field) {
        System.out.print("Provide " + field + ": ");
        return readUserInput();
    }
    public String readUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}