package es.ieslosmontecillos;

import java.util.stream.DoubleStream;

public class Calculator {

    static double add(double... operands) {
        return DoubleStream.of(operands)
                .sum();
    }

    static double multiply(double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }

    public static int max(int[] a){
        if(a.length == 0)
            throw new ArrayIndexOutOfBoundsException();
        if(a == null)
            throw new NullPointerException();

        int m = a[0];
        for (int i = 0; i < a.length; i++){
            if(a[i] > m)
                m = a[i];
        }
        return m;
    }
}