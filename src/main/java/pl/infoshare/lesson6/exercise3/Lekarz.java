package pl.infoshare.lesson6.exercise3;

import java.util.LinkedList;
import java.util.Queue;

public class Lekarz {

    public Lekarz(String name, String surName) {
        this.name = name;
        this.surName = surName;
        line = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public Queue<Pacjent> getLine() {
        return line;
    }

    private String name;
    private String surName;
    private Queue<Pacjent> line;
}
