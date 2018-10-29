package pl.infoshare.lesson5;

public class Calculator {

    static public int Add(int a, int b) {
        return a+b;
    }

    static public int Difference(int a, int b){
        return a-b;
    }

    static public int Ratio(int a, int b) {
        return a*b;
    }

    static public double Quotient(int a, int b){
        if(b!=0)
        return (double)a/b;
        else
        return 0;
    }


}
