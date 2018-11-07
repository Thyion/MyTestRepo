package pl.infoshare.lesson6.exercise3;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise3 {
    public static void main(String[] args){
        Queue<Pacjent> queue = new LinkedList<>();
        queue.add(new Pacjent("Tomasz"));
        queue.add(new Pacjent("Karol"));
        queue.add(new Pacjent("Anna"));
        queue.add(new Pacjent("Jakub"));
        queue.add(new Pacjent("Monika"));
        System.out.println(queue);
        Lekarz drPawel = new Lekarz();
        queue = (Queue<Pacjent>) drPawel.healPacjent(queue);
        System.out.println(queue);
        System.out.println(queue.peek());


        System.out.println("---------");

        Pacjent pacjent1 = new Pacjent("Tomasz");
        Pacjent pacjent2 = new Pacjent("Anna");
        Pacjent pacjent3 = new Pacjent("Basia");
        Pacjent pacjent4 = new Pacjent("Kasia");
        Pacjent pacjent5 = new Pacjent("Zosia");

        Lekarz lekarz = new Lekarz("Dr.", "House");
        DoctorService service = new DoctorService();

    }




}
