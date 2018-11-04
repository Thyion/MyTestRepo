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
    public User(String userName, String userPassword, Boolean userType) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userType = userType;
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
        System.out.println("Podaj typ uzytkownika.");
        boolean type = typeUser();
        User user = new User(name, password, type);
        return user;
    }
    
    static public boolean typeUser() {
        System.out.println("Jeśli admin to wpisz : ADMIN , Jeśli user to wpisz : USER");
        Scanner in = new Scanner(System.in);
        String type = in.nextLine();
        if (type.equals("ADMIN")){
            return true;
        } else if (type.equals("USER")){
            return false;
        } else {
            return typeUser();
        }    
    }
    
    public String getUserType() {
        if (this.userType)
            return "ADMIN";
        else
            return "USER";    
    }


    @Override
    public String toString() {

        return ("Uzytkownik: " + getUserName() + ", Haslo: " + getUserPassword() + ", Typ używkonika: " + getUserType() + "  |||||||||  ");
    }

    static int countUser;
    private String userName;
    private String userPassword;
    private boolean userType;
}

