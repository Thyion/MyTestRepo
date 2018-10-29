package pl.infoshare.lesson5;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;


public class Exercise2 {

    public static void main(String[] args) {


        users[0] = User.newUser();
        users[1] = User.newUser();
        users[2] = User.newUser();
        users[3] = User.newUser();
        users[4] = User.newUser();
        users[5] = User.newUser();

        try {
        ObjectOutputStream outS = new ObjectOutputStream(new GZIPOutputStream(new FileOutputStream("users.txt")));

        outS.writeObject(users);


        outS.close();

        ObjectInputStream inS = new ObjectInputStream(new GZIPInputStream(new FileInputStream("users.txt")));

        User[] usersFromFile = (User[])inS.readObject();

        inS.close();

        }
           catch (IOException e){
            System.out.println(e.getMessage());
        }
        catch (ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }


        for(int i = 0 ; i<users.length;i++){
            System.out.println(users[i]);
        }

    }




    static User[] users = new User[6];

}