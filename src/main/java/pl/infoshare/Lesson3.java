package pl.infoshare;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {


    public static void main (String[] args) {


        for (short i = 1 ; i <= 1000 ;i++) {
            System.out.println(i);
        }



        System.out.println("------------");

        System.out.println("Exercise no 1");

        System.out.println("------------");

        int[] numbers = {2,5,10,25,75,74,15,12,32,22};
        // ????? jak lepiej ??? int numbers2[] = {1,2};



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

        if (askNumber > 10 || askNumber < 1) {

            do {
                System.out.println("Liczba miala byc od 1-10 !!! Wybierz jeszcze raz.");
                in.reset();
                askNumber = in.nextInt();
            } while (askNumber > 10 || askNumber < 1);
        }

        System.out.println("Twoja propozycja to: " + askNumber);
        System.out.println("Liczba o której myslalem, to: " + number);
        if (askNumber==number)
            System.out.println("Gratulacje trafiles!!");
        else
            System.out.println("Pomyliles sie o: " + Math.abs(number-askNumber));


        // ------------------HOMEWORK--------------------



    }
}
