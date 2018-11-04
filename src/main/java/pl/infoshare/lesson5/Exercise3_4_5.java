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
        checkNumber(giveNumber());
    }
    public static void menu2() {
        System.out.println("MENU !!");
        System.out.println("Wybierz 1, 2 lub 0.");
        System.out.println("1. Dodaj kolejnego uzytkownika.\n2. Wróć do menu.\n0. Zakończ program.");
        checkNumber2(giveNumber());
    }

    public static int giveNumber() {
        Scanner in = new Scanner(System.in);
        if(in.hasNextInt())
        return in.nextInt();
        else {
            System.out.println("Miales podac liczbe ... Podaj jeszcze raz");
            return(giveNumber());
        }
    }

    public static User userData() {
        return User.newUser();
    }

    public static void addUser() {
        try {
                    ObjectOutputStream outS = new ObjectOutputStream(new GZIPOutputStream(new FileOutputStream("users2.txt"), true));
                    usersFromFile.add(userData());
                    outS.writeObject(usersFromFile);
                    outS.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                };         
    }
    
    
    public static void readUsers() {
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
    
    public static void checkNumber(int i) {
        if (i==1){
              addUser();
              menu2();
        }
        
        else if(i==2){
              readUsers();  
              menu();
        }
        else if(i==0){
            System.exit(0);
        } else {
           menu();
        }

    }
    public static void checkNumber2(int i) {
        if (i==1){
              checkNumber(1);      
        }
        else if(i==0){
            System.exit(0);
        } else {
           menu();
        }

    }
    public static ArrayList usersFromFile = new ArrayList();

}

