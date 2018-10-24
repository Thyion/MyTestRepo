package pl.infoshare;

import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lesson4 {


    public static void main(String[] args) throws IOException {

        //TAK SIE ROBILO 8 LAT TEMU
        /*
        File file = new File("/home/krzysztofb/workspace/MyTestRepo/moj.txt");
        Scanner in = new Scanner(file);
        String line = in.nextLine();
        String line2 = in.nextLine();
        System.out.println(line);
        System.out.println(line2);

        PrintWriter zapis = new PrintWriter("/home/krzysztofb/workspace/MyTestRepo/moj2.txt");
        zapis.print("Pierwsza linia");
        zapis.close();
        */
        /*
        System.out.println("----------------------------");
        System.out.println("A tak sie robi teraz");

        //FILES - NOWY PLIK

        Files.createFile(Paths.get("/home/krzysztofb/workspace/MyTestRepo/moj3.txt"));

        //FILES - NOWY FOLDER
        Files.createDirectory((Paths.get("/home/krzysztofb/workspace/MyTestRepo/myFolder")));
        */
        //FILES - WCZYTYWANIE PLIKU \
//        List<String> lines = Files.readAllLines(Paths.get("/home/krzysztofb/workspace/MyTestRepo/moj3.txt"));
//        /System.out.println(lines);
//        for (String lineInFile:lines){
//            System.out.println(lineInFile);
//        }
//        String aa = lines.get(4);
//        System.out.println(aa);
//
//        //KOPIOWANIE
//
//        Files.copy(
//                Paths.get("/home/krzysztofb/workspace/MyTestRepo/moj3.txt"),
//                Paths.get("/home/krzysztofb/Desktop/kopia.txt"),
//                StandardCopyOption.REPLACE_EXISTING //pozwala na podmienienie istniejcegop pliku
//                );
//
//        //------------------ ZADANIE 1 -------------------------
//
//        String[] nameArray = {"Janusz", "Tomasz", "Krzysztof", "Ewelina", "Karolina"};
//
//
//        PrintWriter zapis = new PrintWriter(new FileWriter("/home/krzysztofb/workspace/MyTestRepo/nameArray.txt", true));
//
//        for (int i =0; i<nameArray.length;i++){
//            zapis.println(nameArray[i]);
//        }
//
//        //zapis.close();
//
//
//        //------------------ ZADANIE 2 -------------------------
//        System.out.println("Podaj imie ...");
//        Scanner in = new Scanner(System.in);
//        //zapis.println(in.nextLine());
//
//
//        zapis.append(in.nextLine()); //append to jak println tylko nie zastepuje danych tylko dopisuje - ALE NIE DZIALA NIE WIEM CZEMU
//
//        zapis.close();
//
//        //------------------ ZADANIE 3 -------------------------
//
//        int [] losowane = new int[100];
//        int [] losowane2 = new int[100];
//        Random random = new Random();
//
//
//
//        PrintWriter zapisLosowan = new PrintWriter(new FileWriter("/home/krzysztofb/workspace/MyTestRepo/losowane.txt"));
//        PrintWriter zapisLosowan2 = new PrintWriter(new FileWriter("/home/krzysztofb/workspace/MyTestRepo/losowane2.txt"));
//
//        for (int i =0 ; i<losowane.length;i++){
//            zapisLosowan.println(random.nextInt(100)+1);
//            zapisLosowan2.println(random.nextInt(100)+1);
//        }
//
//        zapisLosowan.close();
//        zapisLosowan2.close();
//
//
//        List<String> listLos1 = Files.readAllLines(Paths.get("/home/krzysztofb/workspace/MyTestRepo/losowane.txt"));
//        List<String> listLos2 = Files.readAllLines(Paths.get("/home/krzysztofb/workspace/MyTestRepo/losowane2.txt"));
//        int hits = 0;
//
//        for (String elementLos1 : listLos1) {
//            for (String elementLos2 : listLos2) {
//                if (Integer.parseInt(elementLos1)==Integer.parseInt(elementLos2)){
//                    hits++;
//                }
//            }
//        }
//
//        System.out.println(hits);

        //------------------ ZADANIE 4 -------------------------

        Scanner tekstUzytkownika = new Scanner(System.in);
       String tekst = tekstUzytkownika.nextLine();
       char[] tekst1 = new char[tekst.length()];
       for (int i = 0; i<tekst.length();i++){
           tekst1[i] = tekst.charAt(i);
       }

       String tekstPo = "";

       for (int i = tekst1.length ; i>0;i--){
           tekstPo = tekstPo + tekst1[i-1];
       }

       System.out.println(tekstPo);
        System.out.println("sdadas");
    }


    // druga wersja zadania 4

    Scanner sc = new Scanner(System.in);


}
