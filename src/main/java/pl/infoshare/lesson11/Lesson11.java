package pl.infoshare.lesson11;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import org.apache.commons.mail.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson11 {
    public static void main(String[] args) throws EmailException {
        Map<Integer, List<String>> mapa = new HashMap<>();

        List<String> stringList1 = new ArrayList<>();
        stringList1.add("One");
        stringList1.add("Two");
        stringList1.add("Three");

        List<String> stringList2 = new ArrayList<>();
        stringList2.add("Four");
        stringList2.add("Five");
        stringList2.add("Six");

        mapa.put(1, stringList1);
        mapa.put(2, stringList2);

        for(Map.Entry<Integer, List<String>> entry : mapa.entrySet()){
            System.out.println("Key: " + entry.getKey());
            for (String item : entry.getValue()){
                System.out.println("\t\t-  " + item);
            }
            System.out.println("");
            System.out.println("");
        }

        Multimap<Integer, String> multiMap = HashMultimap.create();

        multiMap.put(5, "Ala");
        multiMap.put(5, "Kasia");
        System.out.println(multiMap.asMap().get(5));

//        Email email = new SimpleEmail();
//        email.setHostName("smtp.gmail.com");
//        email.setSmtpPort(465);
//        email.setAuthenticator(new DefaultAuthenticator("krzbeszczynski@gmail.com", ""));
//        email.setSSLOnConnect(true);
//        email.setFrom("krzbeszczynski@gmail.com");
//        email.setSubject("TestMail from Krzychu... :-)");
//        email.addTo("aleksandra.gorak@gmail.com");
//        email.send();




    }
}
