package Ćwiczenia6;

public class SquareFunction extends Function implements Fun{
    private double a;
    private double b;
    private double c;

    public SquareFunction(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    void increaseCoefficientsBy(double delta) {
        a = a+delta;
        b = b+delta;
        c = c+delta;
    }

    @Override
    void decreaseCoefficientsBy(double delta) {
        a = a-delta;
        b = b-delta;
        c = c-delta;
    }

    @Override
    public double f(double x) {
        double y = a*Math.pow(x,2) + b*x + c;
        return y;
    }
}
