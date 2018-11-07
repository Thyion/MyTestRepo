package pl.infoshare.lesson6.exercise3;

import java.util.Queue;

public class Lekarz {


    public Lekarz() {
    }

    public Queue<?> healPacjent(Queue<?> line){

            line.poll();
        return line;

    }
}
