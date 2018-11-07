package pl.infoshare.lesson6.exercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise2 {

    public static void main(String[] args) throws IOException {


        ArrayList<String> input = new ArrayList();
        Set<String> input2 = new HashSet();
        String a;
        int count = 0;
        String word = "lorem";

        URL oracle = new URL("https://www.sample-videos.com/text/Sample-text-file-1000kb.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));

            Scanner scanner = new Scanner(in);

            while (scanner.hasNext()) {
                a = scanner.next();
                a = WordProcessor.removeSign(a, ",");


                System.out.println(a);
                if(a.toLowerCase().equals(word.toLowerCase())) count++;
                input.add(a);
                input2.add(a);
            }
            scanner.close();
        System.out.println("W pliku jest " + input.size() + " wyrazow.");
        System.out.println("W pliku jest " + (input.size()-input2.size()) + " powtorzonych slow.");
        System.out.println("Slowo " + word + " wystepuje " + count + " razy.");
        System.out.println(input2.size());
        in.close();

    }









}
