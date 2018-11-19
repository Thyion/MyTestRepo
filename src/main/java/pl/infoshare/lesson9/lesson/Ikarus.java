package pl.infoshare.lesson9.lesson;

public class Ikarus implements Bus {


    private double gasTank = 200.0;

    @Override
    public void stampTheTicket(String ticket) {
        System.out.println("Stamped the " + ticket);
    }

    @Override
    public void ride() {
        System.out.println("RIDE");
    }

    @Override
    public double refuel(double amountOfPetrol) {
        this.gasTank += amountOfPetrol;
        return this.gasTank;
    }

    @Override
    public void honkTheHorn() {
        System.out.println("HONK HONK");

    }

}
