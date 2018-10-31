package pl.infoshare.lesson5;

import java.util.LinkedList;


public class Exercise1 {

    public static void main(String[] args) {
        addUser();
    }

    public static void addUser(){
        System.out.println("Dodamy nowego uzytkownika ...");
        users.add(User.newUser());
        System.out.println("Dodano uzytkownika: ");
        System.out.println("Nazwa uzytkownika: " + users.getLast().getUserName());
        System.out.println("Haslo uzytkownika: " + users.getLast().getUserPassword());
        System.out.println("Mamy " + users.size() + " uzytkowikow.");
    }

    static LinkedList<User> users = new LinkedList();

}