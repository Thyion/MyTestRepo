package pl.infoshare.lesson5;

import java.io.*;
import java.util.LinkedList;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;


public class Exercise2 {

    public static void main(String[] args) {


        LinkedList<User> listaUserow = new LinkedList<User>();
        listaUserow.add(User.newUser());
        listaUserow.add(User.newUser());
        listaUserow.add(User.newUser());
        listaUserow.add(User.newUser());

        try {


            ObjectOutputStream outS = new ObjectOutputStream(new GZIPOutputStream(new FileOutputStream("users.txt")));


            outS.writeObject(listaUserow);


            outS.close();


            ObjectInputStream inS2 = new ObjectInputStream(new GZIPInputStream(new FileInputStream("users.txt")));

            usersFromFile = (LinkedList)inS2.readObject();

            inS2.close();

        }
           catch (IOException e){
            System.out.println(e.getMessage());
        }
            catch (ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }

        User[] users = new User[usersFromFile.size()];
        for(int i = 0; i < usersFromFile.size(); i++){
            users[i]=usersFromFile.get(i);
        }

        for(int i = 0; i < users.length; i++){
            System.out.println(users[i]);
        }
    }


    static LinkedList<User> usersFromFile;




}