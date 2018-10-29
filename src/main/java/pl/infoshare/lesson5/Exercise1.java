package pl.infoshare.lesson5;

import java.util.ArrayList;


public class Exercise1 {

    public static void main(String[] args) {
        System.out.println("Dodamy nowego uzytkownika ...");
        users.add(User.newUser());
        System.out.println("Dodano uzytkownika: ");
        System.out.println("Nazwa uzytkownika: " + users.get(0).getUserName());
        System.out.println("Haslo uzytkownika: " + users.get(0).getUserPassword());
        System.out.println("Mamy " + users.size() + " uzytkowikow.");
    }




    static ArrayList<User> users = new ArrayList();
    static int countUser = 0;
}