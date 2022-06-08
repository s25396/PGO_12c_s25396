package Ćwiczenia6;

import java.util.ArrayList;
import java.util.Collections;

public interface Fun {
    double f(double x);
    static double minimum(Fun func, double a, double b, double alpha) {
        if(a>b)
        {
            throw new RuntimeException("a have to be lower than b!");
        }
        ArrayList<Double> wyniki = new ArrayList<>();
        double wynik = func.f(a);
        wyniki.add(wynik);
        while(a<=b){
            a=a+alpha;
            wynik = func.f(a);
            wyniki.add(wynik);
        }
        double min = Collections.min(wyniki);
        return min;}}
