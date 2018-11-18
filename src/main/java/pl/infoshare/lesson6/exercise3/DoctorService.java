package pl.infoshare.lesson6.exercise3;

import java.util.LinkedList;
import java.util.Queue;

public class DoctorService {



    private Lekarz lekarz;
    
    public DoctorService(Lekarz lekarz){
        this.lekarz = lekarz;
    }
    
    public Pacjent callNextPacjent() {
        return lekarz.getLine().poll();
    }

    public Pacjent whosNext() {
        return lekarz.getLine().peek();
    }

    public int getNumberOfPacjentsInQueue() {
        return lekarz.getLine().size();
    }

    public void addPacjentToDoctorsQueue(Pacjent pacjent){
        lekarz.getLine().add(pacjent);
}

}
