package pl.infoshare.lesson9.lesson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Lesson {

    public static void main(String[] args){
        Car car = new Ikarus();
        Bus bus = new Ikarus();
        Ikarus ikarus = new Ikarus();

        System.out.println(car.refuel(20.2));

        bus.stampTheTicket("Ulgowy");

        ikarus.honkTheHorn();

        LinkedList l = new LinkedList();
        l.add("sfdfdfd");
        l.add(ikarus);

        System.out.println("------------------------");

        GenericClass <Integer, String> genericClass = new GenericClass();
        genericClass.setNumber(2);
        genericClass.addToList("ererere");
        genericClass.addToList("asedrfgh");
        genericClass.addToList("awsedf");
        genericClass.addToList("sdfcgv");
        //genericClass.addToList(new Double(20.2));
        //genericClass.addToList(ikarus);

        System.out.println(genericClass.getFromList(0));
        System.out.println(genericClass.getFromList(1));
        System.out.println(genericClass.getFromList(2));

        ChildGenericClass <Double> childGenericClass = new ChildGenericClass();
        childGenericClass.addToList("gthj");

        List<String> stringList = new ArrayList<String>(){{
            add("A");
            add("B");
            add("C");
            add("D");
        }};
        List<Number> integerList = new ArrayList<Number>(){{
            add(new Integer(1));
            add(new Double(13));
            add(new Integer(22));
            add(new Double(12));

        }};

        printList(integerList);
        printList(stringList);

    }
    private static <T> void printList(List<T> someList){
        for(T elem : someList){
            System.out.println(elem);
        }
    }

    private static <T> void print(T someList){
        if(someList instanceof Map){
            for(Map.Entry<?, ? > element: ((Map<?, ?>) someList).entrySet()){
                System.out.println(element.getKey() + " " + element.getValue());
            }
        }
    }
}
