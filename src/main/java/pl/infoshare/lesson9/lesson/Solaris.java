package pl.infoshare.lesson9.lesson;

public abstract class Solaris implements Bus{
    //klasa abstrakcyjna NIE MUSI miec implementacji metod
    //dlatego interfejs ich nie wymusza jak w przypadku zwyklej klasy


    //ale moge podac implementacje metody interfejsu.
    // potem nie trzeba jej implementowac w klasie ktora dziedziczy te klase abstrakcyjna
    @Override
    public void ride() {
        System.out.println("Ride");
    }
}
