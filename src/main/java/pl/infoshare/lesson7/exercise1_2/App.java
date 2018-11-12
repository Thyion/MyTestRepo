package pl.infoshare.lesson7.exercise1_2;

public class App {
    public static void main(String[] args){

        Fiat fiat = new Fiat();
        fiat.startEngine();
        Ferrari ferrari = new Ferrari();

        fiat.startEngine();
        fiat.fixCar();
        ferrari.winTheRace();

    }
}
