package pl.infoshare.lesson11;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise2 {

        public static void main (String [] args) throws IOException{

            URL oracle = new URL("https://norvig.com/big.txt");
            //DataInput inn = new DataInputStream(oracle.openStream());
            //int count = 0;
            //            while(inn.readLine()!=null){
            //                count++;
            //            }
            //            System.out.println(count);
            //            ((DataInputStream) inn).close();


            Scanner in = new Scanner(oracle.openStream());

            List<String> lines = new ArrayList<>();


            while(in.hasNext()){
                lines.add(in.nextLine());
            }

            System.out.println(lines.size());

            List<Integer> numberts =
            lines.stream()
                    .filter(p->!p.isEmpty())
                    .map(p-> {
                        String a = p.replace("\\.", " ");
                        a = a.replaceAll(",", " ");
                        return a.split(" ").length;

            })
            .collect(Collectors.toList())
            ;
            System.out.println(numberts.size());


            int counterOfWords = 0;
            int[] counter = {0};

            numberts.forEach(p->counter[0]+=);

//            for (int numer: numberts){
//                counterOfWords = counterOfWords + numer;
//            }
            System.out.println(counterOfWords);



        }
}
