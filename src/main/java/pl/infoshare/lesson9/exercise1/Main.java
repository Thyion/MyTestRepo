package pl.infoshare.lesson9.exercise1;

public class Main {
    public static void main(String[] args ){
        Exercise1_interface exercise1_interface = new Exercise1_interface() {
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
        };

        System.out.println(exercise1_interface.divide(5,5));
        System.out.println(exercise1_interface.multiply(5,5));
        System.out.println(exercise1_interface.subtraction(5,5));
        System.out.println(exercise1_interface.sumNumbers(5,5));
    }
}
