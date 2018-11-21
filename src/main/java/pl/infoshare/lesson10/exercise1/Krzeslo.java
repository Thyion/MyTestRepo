package pl.infoshare.lesson10.exercise1;

import javax.print.DocFlavor;

public class Krzeslo {


    public Krzeslo(int legs, String material){
        this.legs = legs;
        this.material = material;

    }


    private int legs;
    private String material;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Krzeslo krzeslo = (Krzeslo) o;

        if (legs != krzeslo.legs) return false;
        return material.equals(krzeslo.material);
    }

    @Override
    public int hashCode() {

        return 1;
    }


}
