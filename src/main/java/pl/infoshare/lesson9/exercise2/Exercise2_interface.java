package pl.infoshare.lesson9.exercise2;

public interface Exercise2_interface {
    < T extends Number> double sumNumbers(T a,T b);

    < T extends Number> double subtraction(T a,T b);
    < T extends Number> double multiply(T a,T b);
    < T extends Number> double divide(T a,T b);
}
