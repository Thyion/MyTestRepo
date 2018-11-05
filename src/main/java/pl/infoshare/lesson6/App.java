package pl.infoshare.lesson6;

import javax.management.Query;
import java.awt.*;

import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Queue;

public class App {

    public static void main(String[] args){

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        Properties prop = new Properties();

        prop.setProperty("username", "test");
        System.out.println(prop.getProperty("username"));

        prop.setProperty("1", "R&D");
        System.out.println(prop.getProperty("1"));

        Pattern pattern = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
        Matcher matcher = pattern.matcher("168.111.1.201");
        System.out.println(matcher.find());

        List lista = new ArrayList();
        lista.add("dddd");
        lista.add("wegwe");
        lista.add("ddegrehdd");
        lista.add("ddegrehdd");
        System.out.println(lista.get(1));
        lista.add(1, "ssdfdfsfd");
        System.out.println(lista.get(1));

        Queue<String> kolejka = new LinkedList<>();
        kolejka.add("4");
        kolejka.add("1");
        kolejka.add("2");
        kolejka.add("3");

        //System.out.println(kolejka.peek());
        System.out.println(kolejka.poll());
        System.out.println(kolejka.poll());
        System.out.println(kolejka.poll());
        System.out.println(kolejka.poll());



        Set set = new HashSet();
        set.add("1");
        set.add("1");
        set.add("3");
        set.add("4");
        set.add("58");
        set.add("6");
        set.add("10");

        System.out.println(set);

        Set treeSet = new TreeSet();
        treeSet.add("1");
        treeSet.add("1");
        treeSet.add("3");
        treeSet.add("10");
        treeSet.add("5");
        treeSet.add("8");
        treeSet.add("7");

        System.out.println(treeSet);

        Set linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("1");
        linkedHashSet.add("1");
        linkedHashSet.add("3");
        linkedHashSet.add("4");
        linkedHashSet.add("58");
        linkedHashSet.add("6");
        linkedHashSet.add("10");

        System.out.println(linkedHashSet);


        Stack stack = new Stack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println(stack.pop());

        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "Fiat");
        mapa.put(2, "Volvo");
        mapa.put(3, "Mercedes");

        System.out.println(mapa);

        int i = 2;

        System.out.println(mapa.get(i));



    }
}
