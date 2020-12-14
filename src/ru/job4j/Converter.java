package ru.job4j;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(1400);
        int dollar = Converter.rubleToDollar(1200);
        System.out.println( euro + dollar);
    }
}

