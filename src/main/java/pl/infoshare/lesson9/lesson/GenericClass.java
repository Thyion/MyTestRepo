package pl.infoshare.lesson9.lesson;

import java.util.ArrayList;
import java.util.List;

public class GenericClass <T extends Number, K>{

    private T number;

    private List<K> somelist = new ArrayList<>();



    public T getNumber() {
        return number;
    }

    public void setNumber(T number){
        this.number = number;
    }


    public void addToList(K cos){
        somelist.add(cos);
    }

    public K getFromList(int i){
       return this.somelist.get(i);
    }
}
