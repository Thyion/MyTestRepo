package pl.infoshare.lesson5;

public class Auto {

    public Auto() {

    }





    public int getQuantityWheels() {
        return quantityWheels;
    }


    public void setQuantityWheels(int quantityWheels) {
        this.quantityWheels = quantityWheels;
    }

    public int getHorses() {
        return horses;
    }

    public void setHorses(int horses) {
        this.horses = horses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    private int quantityWheels;
    private int horses;
    private String name;
    private int year;
    private int seats;
}
