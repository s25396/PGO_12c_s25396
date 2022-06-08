package Ćwiczenia6;

public class LinearFunction extends Function implements Fun{
    private double a;
    private double b;

    public LinearFunction(double a, double b) {
        setA(a);
        setB(b);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double f(double x) {
       double y = a*x + b;
        return y;
    }

    @Override
     void increaseCoefficientsBy(double delta) {
        a = a+delta;
        b = b+delta;
    }

    @Override
    void decreaseCoefficientsBy(double delta) {
        a = a-delta;
        b = b-delta;
    }
}
