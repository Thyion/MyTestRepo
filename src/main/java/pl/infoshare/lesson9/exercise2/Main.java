package pl.infoshare.lesson9.exercise2;

public class Main {
    public static void main(String[] args ){
        Exercise2 exercise2 = new Exercise2();

        int a=6;
        short b = 8;
        double c = 9;
        System.out.println(exercise2.divide(a,b));
        System.out.println(exercise2.multiply(b,c));
        System.out.println(exercise2.subtraction(c,a));
        System.out.println(exercise2.sumNumbers(c,b));
    }
}
