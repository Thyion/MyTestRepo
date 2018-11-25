package pl.infoshare.lesson10.exercise1;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exercise1 {





    public static void main(String[] args){
        Map<Krzeslo, String> mapa = new HashMap<>();
        Krzeslo krzeslo1 = new Krzeslo(4, "drewno");
        Krzeslo krzeslo2 = new Krzeslo(5, "drewno");
        mapa.put(krzeslo1, "ikea");
        mapa.put(krzeslo2, "obi");
        //mapa.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
