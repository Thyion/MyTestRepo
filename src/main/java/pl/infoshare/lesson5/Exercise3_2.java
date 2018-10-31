package pl.infoshare.lesson5;



import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;


public class Exercise3_2  {

    public static void main(String[] args) {
        System.out.println("Wybierz 1 lub 2.");
        System.out.println("1. Dodaj uzytkownika.\n2. Wyswietl uzytkownikow.");
        menu();
    }

    public static void menu() {

        sprawdzLiczbe(podajLiczbe());

//        try {
//            ObjectOutputStream outS = new ObjectOutputStream(new GZIPOutputStream(new FileOutputStream("users2.txt"), true));
//
//            ObjectInputStream inS = new ObjectInputStream(new GZIPInputStream(new FileInputStream("users2.txt")));
//
//
//            ArrayList usersFromFile = (ArrayList)inS.readObject();
//
//            usersFromFile.add(podajDaneUzytkownika());
//            outS.writeObject(usersFromFile);
//
//            outS.close();
//            inS.close();
//        }
//        catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//        catch (ClassNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        }
    }

    public static int podajLiczbe() {

        Scanner in = new Scanner(System.in);
        if(in.hasNextInt())
        return in.nextInt();
        else {
            System.out.println("Miales podac liczbe 1 lub 2 ... Podaj jeszcze raz");
            return(podajLiczbe());
        }
    }

    public static User podajDaneUzytkownika() {

        return User.newUser();

    }

    public static void sprawdzLiczbe(int i) {
        int j = i;
        switch (j){
            case (1):
                try {
                    ObjectOutputStream outS = new ObjectOutputStream(new GZIPOutputStream(new FileOutputStream("users2.txt"), true));


                    ArrayList usersFromFile = new ArrayList();

                    usersFromFile.add(podajDaneUzytkownika());

                    outS.writeObject(usersFromFile);

                    outS.close();

                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }

            case (2):
                System.out.println("asasasa");
                try {
                    ObjectInputStream inS = new ObjectInputStream(new GZIPInputStream(new FileInputStream("users2.txt")));


                    ArrayList usersFromFile = (ArrayList)inS.readObject();

                    inS.close();
                    System.out.println(usersFromFile);


                } catch (IOException e) {
                    System.out.println(e.getMessage());
                } catch (ClassNotFoundException ex) {
                    System.out.println(ex.getMessage());
                }

            default:
                menu();
        }
    }

}

