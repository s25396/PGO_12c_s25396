package Ćwiczenia6;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.0");
    public static void main(String[] args) {
        List<Function> functions = new ArrayList<>();
        functions.add(new LinearFunction(2,4));
        functions.add(new SquareFunction(2,0,-2.5));
        functions.add(new AbsoluteLinearFunction(2,4));
        List<Fun> funList = new ArrayList<>(functions);
        System.out.println("Original functions");
        funList.forEach(f ->
                System.out.println(df.format(Fun.minimum(f,-4,0,0.1))));
        functions.forEach(f -> f.increaseCoefficientsBy(1.2));
        System.out.println("Functions increased by 1.2");
        funList.forEach(f ->
                System.out.println(df.format(Fun.minimum(f,-4,0,0.1))));
        functions.forEach(f -> f.decreaseCoefficientsBy(1.2));
        System.out.println("Functions decreased by 1.2");
        funList.forEach(f ->
                System.out.println(df.format(Fun.minimum(f,-4,0,0.1))));

        System.out.println("Użycie Fun bez klasy:");
        Fun funkcja= new Fun() {
            @Override
            public double f(double x)
            {                           /* Żeby użyć interfejsu bez klasy, która go implementuje
                                        Możemy użyć przeciążenia jego metody przy deklarowaniu interfejsu Fun. */
                double y = x*4 + 3;
                return y;
            }
        };
        System.out.println(funkcja.f(2));
    }
}