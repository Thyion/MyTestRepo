package pl.infoshare.lesson6.exercise5;

import java.util.Scanner;


public class ConsoleInputReader {

    /*
   Metoda wczytujaca pojedyncza informacje od uzytkownika i zwracajaca to co wpisal uzytkownik
  */
    public String getFieldFromUserInput(String field) {
        System.out.print("Provide " + field + ": ");
        return readUserInput();
    }

    /*
    Metoda wczytujaca tekst wpisany przez uzytkownika
   */
    public String readUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}