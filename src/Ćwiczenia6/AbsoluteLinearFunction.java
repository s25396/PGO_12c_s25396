package Ćwiczenia6;


public class AbsoluteLinearFunction extends LinearFunction implements  Fun{


    public AbsoluteLinearFunction(double a, double b) {
        super(a,b);
    }

    @Override
    public void setA(double a) {
        Math.abs(a);
    }

    @Override
    public void setB(double b) {
        Math.abs(b);
    }

    @Override
    public double f(double x) {
        return super.f(Math.abs(x));
    }
}
