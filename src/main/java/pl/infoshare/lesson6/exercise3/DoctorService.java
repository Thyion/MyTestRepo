package pl.infoshare.lesson6.exercise3;

import java.util.LinkedList;
import java.util.Queue;

public class DoctorService {



    private Lekarz lekarz;
    private Queue<Pacjent> service = new LinkedList();

    public DoctorService(Lekarz lekarz){
        this.lekarz = lekarz;
    }

    public Lekarz getLekarz() {
        return lekarz;
    }

    public Queue<Pacjent> getService() {
        return service;
    }

    public void addPacjentToDoctor() {

    }


}
