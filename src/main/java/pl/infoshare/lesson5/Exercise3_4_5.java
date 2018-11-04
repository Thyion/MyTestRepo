package pl.infoshare.lesson5;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Exercise3_4_5  {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("MENU !!");
        System.out.println("Wybierz 1, 2 lub 0.");
        System.out.println("1. Dodaj kolejnego uzytkownika.\n2. Wyświetl użytkowników.\n0. Zakończ program.");
        sprawdzLiczbe(podajLiczbe());
    }
    public static void menu2() {
        System.out.println("MENU !!");
        System.out.println("Wybierz 1, 2 lub 0.");
        System.out.println("1. Dodaj kolejnego uzytkownika.\n2. Wróć do menu.\n0. Zakończ program.");
        sprawdzLiczbe2(podajLiczbe());
    }

    public static int podajLiczbe() {
        Scanner in = new Scanner(System.in);
        if(in.hasNextInt())
        return in.nextInt();
        else {
            System.out.println("Miales podac liczbe ... Podaj jeszcze raz");
            return(podajLiczbe());
        }
    }

    public static User podajDaneUzytkownika() {
        return User.newUser();
    }

    public static void dodajUzytkownika() {
        try {
                    ObjectOutputStream outS = new ObjectOutputStream(new GZIPOutputStream(new FileOutputStream("users2.txt"), true));
                    usersFromFile.add(podajDaneUzytkownika());
                    outS.writeObject(usersFromFile);
                    outS.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                };         
    }
    
    
    public static void odczytajUzytkonikow() {
        try {
                    ObjectInputStream inS = new ObjectInputStream(new GZIPInputStream(new FileInputStream("users2.txt")));
                    ArrayList usersFromFile = (ArrayList)inS.readObject();
                    inS.close();
                    System.out.println(usersFromFile);
                    
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                } catch (ClassNotFoundException ex) {
                    System.out.println(ex.getMessage());
                };
    }
    
    public static void sprawdzLiczbe(int i) {
        if (i==1){
              dodajUzytkownika();
              menu2();
        }
        
        else if(i==2){
              odczytajUzytkonikow();  
              menu();
        }
        else if(i==0){
            System.exit(0);
        } else {
           menu();
        }

    }
    public static void sprawdzLiczbe2(int i) {
        if (i==1){
              sprawdzLiczbe(1);      
        }
        else if(i==0){
            System.exit(0);
        } else {
           menu();
        }

    }
    public static ArrayList usersFromFile = new ArrayList();

}

