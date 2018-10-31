package pl.infoshare.lesson5;

import java.io.Serializable;
import java.util.Scanner;

public class User implements Serializable{
    public User() {

    }
    public User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserName() {
        this.userName = userName;
    }

    public void setUserPassword() {
        this.userPassword = userPassword;
    }

    static public User newUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj nowa nazwe uzytkownika.");
        String name = in.nextLine();
        System.out.println("Podaj haslo dla uzytkownika " + name + ".");
        String password = in.nextLine();
        User user = new User(name, password);
        return user;
    }



    @Override
    public String toString() {

        return ("Uzytkownik: " + getUserName() + ", Haslo: " + getUserPassword());
    }

    static int countUser;
    private String userName;
    private String userPassword;
}

