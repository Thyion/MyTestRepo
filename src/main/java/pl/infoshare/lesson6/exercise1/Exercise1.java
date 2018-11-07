package pl.infoshare.lesson6.exercise1;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {
        Pracownik worker1 = new Pracownik("Jolanta", "Kowalska", "R&D", LocalDate.of(1990,6,23));
        Pracownik worker2 = new Pracownik("Tomasz", "Nowak", "HR",  LocalDate.of(1990,6,23));
        Pracownik worker3 = new Pracownik("Jakub", "Pudat", "IT",  LocalDate.of(1990,6,23));
        Pracownik worker4 = new Pracownik("Bernard", "Nowak", "IT",  LocalDate.of(1990,6,23));
        Pracownik worker5 = new Pracownik("Adam", "Kowalski", "HR",  LocalDate.of(1990,6,23));

        Pracownik[] workers = { worker1, worker2, worker3, worker4, worker5};

        List<Pracownik> rD = new ArrayList();
        List<Pracownik> hR = new ArrayList();
        List<Pracownik> iT = new ArrayList();


        for(Pracownik p : workers){
            if(p.getTeam().equals("R&D")){
                rD.add(p);
            }
            if(p.getTeam().equals("HR")){
                hR.add(p);
            }
            if(p.getTeam().equals("IT")){
                iT.add(p);
            }
        }

        printList(hR, "HR");

    }

    private static void printList(List<Pracownik> lista, String dzial){
        System.out.println("Lista pracownikow dzialu " + dzial);
        for (Pracownik p : lista)
            System.out.println(p.getName() + " " + p.getSurName() + " " + p.getBirthDate().toString());
    }

}
