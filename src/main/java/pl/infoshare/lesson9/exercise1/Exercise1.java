package pl.infoshare.lesson9.exercise1;

public class Exercise1 implements Exercise1_interface{



//    @Override
//    public <T extends Number, Z extends Number> double sumNumbers(double T, double Z) {
//        return T+Z;
//    }

    @Override
    public double sumNumbers(double a, double b) {
        return a+b;
    }

    @Override
    public double subtraction(double a, double b) {
        return a-b;
    }

    @Override
    public double multiply(double a, double b) {
        return a*b;
    }

    @Override
    public double divide(double a, double b) {
        return a/b;
    }


//    Stwórz interfejs z podstawowymi operacjami matematycznymi.
//
//    Stwórz klasę implementującą ten interfejs i podaj implementację metod.
//
//    W klasie main stwórz nowy obiekt tego interfejsu i wstrzyknij jego implementację.
//
//    Wywołaj metody i wyświetl wyniki.



}
