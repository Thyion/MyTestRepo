package pl.infoshare.lesson8.exercise1_2_3;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Lis lis = new Lis();
        Sowa sowa = new Sowa();

        System.out.println(lis.wywolajImie());
        System.out.println(sowa.wywolajImie());


        Zwierze zwierze = new Zwierze() {
            @Override
            public String wywolajImie() {
                return "Zwierze";
            }
        };

        System.out.println(zwierze.wywolajImie());

        List lista = new MojaLista();
        lista.add("linia1");
        lista.add("linia2");
        lista.add("linia3");

        System.out.println(lista.get(2));
    }
}
