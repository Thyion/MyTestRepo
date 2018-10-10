package pl.infoshare;

import java.util.Scanner;



public class Lesson2 {

    public static void main(String[] args) {

        double a = 90.99;
        System.out.println(a);

        int b = (int) a;
        System.out.println(b);

        char c = 'a';
        System.out.println(c);

        char d = (char) 90;
        System.out.println(d);

        System.out.println(b/a +d);

        System.out.println("Wynik" + b/a +d);
        System.out.println(b/a +d+ "Wynik");



        int agePrim = 25;

        switch (agePrim) {
            case 20: {
                System.out.println("Age is 20");
                break;
            }

            case 21:
            case 22:
            case 23:
            case 24:
            case 26:
            case 27: {
                System.out.println("Age is Different");
                break;
            }


            case 25 : {
                System.out.println("Age is 25");
                break;
            }
            case 30 : {
                System.out.println("Age is 25");
                break;
            }
            default: {
                System.out.println("You are old");
            }

        }
        String aaaa = agePrim > 18 ? "You are old" : "You are old";

        System.out.println(agePrim > 18 ? "You are old" : "You are old");





        System.out.println("-------------------HOMEWORK -----------------------");

        System.out.println("------------");
        System.out.println("Exercise no 1");
        System.out.println("------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi please give me number: ");
        double scan = (double) scanner.nextInt();
        System.out.println("You have number: "+ scan);

        System.out.println("------------");

        System.out.println("Hi please give me number: ");
        Scanner scanner2 = new Scanner(System.in);
        String text = scanner2.nextLine();
        System.out.println(Integer.parseInt(text));
        System.out.println("You have number: "+ text);

        System.out.println("------------");

        System.out.println("Exercise no 2");

        System.out.println("------------");

        Scanner scanner3 = new Scanner(System.in);

       int age;


        do {
            System.out.println("Hello! How old are you?");
            while (!scanner3.hasNextInt()) {
                System.out.println("That's not a number or you are dead !!!");
               scanner3.next(); // this is important!
            }
            age = scanner3.nextInt();
        } while (age <= 0 || age > 123);

        if (age >= 18) {

            System.out.println("Great! You are adult");
        } else {
            System.out.println("Oh no you are a kid !!!!");
        }

        System.out.println("------------");

        System.out.println("Exercise no 3");

        System.out.println("------------");

        String login = "krzysiek";
        String password = "HASLO";

        Scanner scannerLoginow = new Scanner(System.in);
        Scanner scannerHasel = new Scanner(System.in);
        System.out.println("Please write Login: ");
        String podanyLogin = scannerLoginow.nextLine();
        System.out.println("Please write Password: ");
        String podaneHaslo = scannerHasel.nextLine();

        if (podanyLogin.equals(login) && podaneHaslo.equals(password));
        System.out.println(podanyLogin);
        System.out.println(podaneHaslo);


    }
}
