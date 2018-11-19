package pl.infoshare.lesson9.exercise2;

public class Exercise2 implements Exercise2_interface {

    @Override
    public <T extends Number> double sumNumbers(T a, T b) {
        return a.doubleValue()+b.doubleValue();

    }

    @Override
    public <T extends Number> double subtraction(T a, T b) {
        return a.doubleValue()-b.doubleValue();
    }

    @Override
    public <T extends Number> double multiply(T a, T b) {
        return a.doubleValue()*b.doubleValue();
    }

    @Override
    public <T extends Number> double divide(T a, T b) {
        return a.doubleValue()/b.doubleValue();
    }


}
