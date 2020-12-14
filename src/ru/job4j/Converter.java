package ru.job4j;

public class Converter {
    public static double rubleToEuro(double value) {
        double rsl  = value / 70;
        return rsl;
    }
    public static double rubleToDollar(double value) {
        double rsl = value / 60;
        return rsl;
    }
    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(15);
        double dollar = Converter.rubleToDollar(12);
        System.out.println( euro + dollar);
    }
}

