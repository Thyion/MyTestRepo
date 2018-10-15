package pl.infoshare;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Lesson3 {


    public static void main (String[] args) {

/*
        for (short i = 1 ; i <= 1000 ;i++) {
            System.out.println(i);
        }

        int [] [] array2D = new int[10][12];

        for (int i = 1; i < array2D.length + 1; i++) {
            System.out.println("I'm in row no. " + i);
            for (int j = 1 ; j < array2D[0].length + 1; j++) { // dzieki temu [0] pobieramy dlugosc 2 wymiaru
                System.out.println("I'm in column no. " + j);
            }
        }



        // ------------------EXERCISES--------------------

        System.out.println("------------");

        System.out.println("Exercise no 1");

        System.out.println("------------");

        int[] numbers = {2,5,10,25,75,74,15,12,32,22};

        for (int i = 0; i < numbers.length;i++)
            if (i%2==0){
                System.out.println(numbers[i]);
            }

        System.out.println("------------");

        System.out.println("Exercise no 2");

        System.out.println("------------");

        char[] [] chars = {{'*','*','*'},{'*','*','*'},{'*','*','*'},{'*','*','*'},{'*','*','*'},{'*','*','*'},{'*','*','*'},{'*','*','*'},{'*','*','*'},{'*','*','*'},};

        for (int i = 0; i < chars.length;i++) {
            if (i % 2 != 0)
                System.out.println(chars[i]);
            else
                System.out.println(" ");
        }

        System.out.println("------------");

        System.out.println("Exercise no 3");

        System.out.println("------------");

        Random random = new Random();
        int number = random.nextInt(10)+1;
        System.out.println("Zagrajmy w gre. Pomyslalem jakas liczbe calkowita od 1 do 10...\nZgadniesz jaka to liczba ??");
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.println("That's not a number!!!");
            in.next(); // this is important!
        }

        System.out.print("Podaj liczbe: ");
        int askNumber;
        askNumber = in.nextInt();

        do {
            if (askNumber > 10 || askNumber < 1) {

                do {
                    System.out.println("Liczba miala byc od 1-10 !!! Wybierz jeszcze raz.");
                    in.reset();
                    askNumber = in.nextInt();
                } while (askNumber > 10 || askNumber < 1);
            } else {
                do {
                    System.out.println("Niestety nie trafiles !!!");
                    System.out.println("Myslalem o liczbie: " + number);
                    System.out.println("Pomyliles sie o: " + Math.abs(number-askNumber));
                    System.out.println("Pomysle nowa liczbe. Sprobuj zgadnac jeszcze raz.");
                    number = random.nextInt(10)+1;
                    in.reset();
                    askNumber = in.nextInt();
                } while (askNumber!=number);
            }
        }while(askNumber!=number);


        System.out.println("Twoja propozycja to: " + askNumber);
        System.out.println("Liczba o której myslalem, to: " + number);
        System.out.println("Gratulacje trafiles!!");

*/

        // ------------------HOMEWORK--------------------


        int[] chosenNumbers = new int[6];

        System.out.println("Wytypuj 6 liczb w zakresie od 1 do 49");

        for (int i = 0 ; i < chosenNumbers.length ; i++) {
            System.out.println("Wybierz " + i+1 + " liczbe :");
            chosenNumbers[i] = typeNumber();
        }





    }

    private static int typeNumber() {
        Scanner in = new Scanner(System.in);

        int choseNumber;

        do {
            while (!in.hasNextInt()) {
                    System.out.println("Liczba miala byc od 1-49 !!! Wybierz jeszcze raz.");
                    in.nextInt();
                }
                choseNumber = in.nextInt();

        }while(choseNumber > 49 || choseNumber < 1);


        return choseNumber;

    }
}
