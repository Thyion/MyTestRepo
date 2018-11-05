package pl.infoshare;

import java.io.*;
import java.net.URL;
import java.nio.file.*;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lesson4 {


    public Lesson4() throws IOException {
    }

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
//       Scanner tekstUzytkownika = new Scanner(System.in);
//       String tekst = tekstUzytkownika.nextLine();
//       char[] tekst1 = new char[tekst.length()];
//       for (int i = 0; i<tekst.length();i++){
//           tekst1[i] = tekst.charAt(i);
//       }
//
//       String tekstPo = "";
//
//       for (int i = tekst1.length ; i>0;i--){
//           tekstPo = tekstPo + tekst1[i-1];
//       }
//
//       System.out.println(tekstPo);
//        System.out.println("sdadas");
//    }
//
//
//    // druga wersja zadania 4
//
//    Scanner sc = new Scanner(System.in);

        //------------------ ZADANIE DOMOWE -------------------------


        URL oracle = new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt");
//        BufferedReader in = new BufferedReader(
//                new InputStreamReader(oracle.openStream()));
        DataInput inn = new DataInputStream(oracle.openStream());
        RandomAccessFile RAF = new RandomAccessFile("baza.txt", "rw"); //"r" - czytamy, "w" zapisujemy, "rw" - czytamy i zapisujemy
        
        
        String inputLine ;
//         inn.skipBytes(500);
//        for(int i=0; i<6000;i++){
//            char tCh = inn.readChar();
////            if(tCh != '\0')
//                inputLine.append(tCh);
//        }
//        RAF.writeBytes(inputLine.toString());
        while ((inputLine = inn.readLine()) != null) {   
            RAF.writeBytes(inputLine);
            RAF.writeBytes(System.lineSeparator());
        } 
        System.out.println(RAF.length());
        RAF.close();
        
//        String aaa = in.readLine();
//        StringBuffer tString = new StringBuffer(30);
//        aaa.
//        for(int i=0; i<30;i++){
//            char tCh = in.read;
//            if(tCh != '\0')
//                tString.append(tCh);
//        }
//        
//        
//        File file = new File("startWithNumber.txt");
//        Writer writer = new BufferedWriter(new FileWriter(file));
//        
//        in.skip(in.readLine().length());
//        
//        
//        String ffff = in.readLine();
//        System.out.println(ffff);
        
        
        
                
        
        //UDANY POMYSŁ ALE NIE DOSKONALY

//        Writer writer = new BufferedWriter(new FileWriter("startWithNumber.txt"));
//        Writer writer2 = new BufferedWriter(new FileWriter("startWithLetter.txt"));
//        String inputLine;
//        
//        while ((inputLine = in.readLine()) != null) {
//            for (int i = 0;((inputLine = in.readLine()) != null); i++){
//                if (i<=5){ 
//                } else {
//                    if(inputLine.length()>32){
//                        if(inputLine.startsWith(" ")){
//                            writer2.write((String) inputLine.subSequence(32, inputLine.length()));
//                            writer2.append(System.lineSeparator());
//                        }else {
//                            writer.write((String) inputLine.subSequence(0, 32));
//                            writer.append(System.lineSeparator());
//                            writer2.write((String) inputLine.subSequence(32, inputLine.length()));
//                            writer2.append(System.lineSeparator());
//                        }
//                    } else if (inputLine.length()<5){
//                        
//                    } else {
//                        writer.write((String) inputLine.subSequence(0, inputLine.length()));
//                        writer.append(System.lineSeparator());
//                    } 
//                }
//            }
//        }      
//        in.close();
//        writer.close();
//        writer2.close();
        
        
        
        //NIEUDANY POMYSŁ
        
//        PrintWriter zapis = new PrintWriter(new FileWriter("/home/krzysztofb/workspace/MyTestRepo/zassaneZneta.txt"));
//        PrintWriter zapis2 = new PrintWriter(new FileWriter("/home/krzysztofb/workspace/MyTestRepo/zassaneZneta2.txt"));
//        PrintWriter zapis3 = new PrintWriter(new FileWriter("/home/krzysztofb/workspace/MyTestRepo/zassaneZneta3.txt"));
//
//        String inputLine;
//        String jedynki="";
//        String dwojki="";
//
//
//
//
//        while ((inputLine = in.readLine()) != null) {
//
//            System.out.println(inputLine);
//
//            char[] tekst1 = new char[inputLine.length()];
//            char[] tekst2 = new char[inputLine.length()];
//            for (int i = 0;i < tekst1.length; i++) {
//
//                tekst1[i] = inputLine.charAt(i);
//
//            }
//
//
//
//
//            if (tekst1.length != 0) {
//                if (tekst1[0] == '0' || tekst1[0] == '1' || tekst1[0] == '2' || tekst1[0] == '3' || tekst1[0] == '4' || tekst1[0] == '5' || tekst1[0] == '6' || tekst1[0] == '7' || tekst1[0] == '8' || tekst1[0] == '9') {
//
//                    zapis.append(inputLine);
//                    zapis.append(System.lineSeparator());
//                } else if (tekst2[0] == 'A' || tekst2[0] == 'B' || tekst2[0] == 'C' || tekst2[0] == 'D' || tekst2[0] == 'E' || tekst2[0] == 'F') {
//                    zapis3.append(inputLine);
//                    zapis3.append(System.lineSeparator());
//                }
//
//
//                else {
//                    zapis2.append(inputLine);
//                    zapis2.append(System.lineSeparator());
//                }
//            } else {
//                zapis2.append(inputLine);
//                zapis2.append(System.lineSeparator());
//
//
//            }
//
//        }
//        in.close();
//        zapis.close();
//        zapis2.close();
//        zapis3.close();
    }
}



